package likitomi.jsp.control.member;

import java.io.IOException;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import likitomi.jsp.model.Customer;
import likitomi.jsp.model.CustomerTable;
import likitomi.jsp.model.Database;
import likitomi.jsp.util.Utility;

/**
 *
 * @author funkyboyz_book4
 */
public class Register extends HttpServlet 
{
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
//        response.setContentType("text/html;charset=UTF-8");
//        PrintWriter out = response.getWriter();
        try {
//            Prepare Input
            String username = request.getParameter("username");
            String password = request.getParameter("password");
            String cfmPasswd = request.getParameter("cfmPasswd");
            String firstname = request.getParameter("firstname");
            String lastname = request.getParameter("lastname");
            String address = request.getParameter("address");
            int district = Integer.parseInt(request.getParameter("district"));
            int province = Integer.parseInt(request.getParameter("province"));
            int postcode = Integer.parseInt(request.getParameter("postcode"));
            int landline = Integer.parseInt(request.getParameter("landline"));
            int mobile = Integer.parseInt(request.getParameter("mobile"));
            int fax = Integer.parseInt(request.getParameter("fax"));
            String email = request.getParameter("email");
            String compCode = request.getParameter("comp_code");
            
//            Validate Input
            Map<String, Object> errors = new HashMap<String, Object>();
            
            if(username.trim().length() == 0) {
                errors.put("username", "กรุณากรอกชื่อผู้ใช้");
            }
            
            if(password.trim().length() == 0) {
                errors.put("password", "กรุณากรอกรหัสผ่าน");
            }
            
            if(cfmPasswd.trim().length() == 0) {
                errors.put("cfmPasswd", "กรุณายืนยันรหัสผ่าน");
            }
            
            if(!password.equals(cfmPasswd)) {
                errors.put("cfmPasswd", "รหัสผ่านไม่ตรงกัน");
            }
            
            if(firstname.trim().length() == 0) {
                errors.put("fname", "กรุณากรอกชื่อ");
            }
            
            if(lastname.trim().length() == 0) {
                errors.put("lname", "กรุณากรอกนามสกุล");
            }
            
            if(address.trim().length() == 0) {
                errors.put("address", "กรุณากรอกที่อยู่");
            }
            
            if(email.trim().length() == 0) {
                errors.put("email", "กรุณากรอกอีเมล์");
            }
            
            if(!email.matches("\\S+@\\S+\\.\\S{2, 3}")) {
                errors.put("email", "กรุณากรอกอีเมล์ให้ถูกต้อง");
            }
            
            if(errors.size() > 0) {
                request.setAttribute("errors", errors);
                
                RequestDispatcher rd = request.getRequestDispatcher("register.jsp");
                rd.forward(request, response);
                return;
            }
            
//            Call Model
//            Prepare Data
            boolean activated = false;
            String activateCode = Utility.randomText(32);
            Date date = new Date();            
            Customer customer = new Customer(activateCode, 
                                            username, 
                                            password, 
                                            firstname, 
                                            lastname, 
                                            address, 
                                            district, 
                                            province, 
                                            postcode, 
                                            landline, 
                                            mobile, 
                                            fax, 
                                            email, 
                                            compCode,   // wrong datatype parameter
                                            activated, 
                                            activateCode, 
                                            date);
            
//            Add New Account & Delete Unactivated Account
            Database db = new Database();
            CustomerTable customerTable = new CustomerTable(db);
            
//            Store to Database
            if(customerTable.add(customer)) {
                customerTable.deleteUnactivate();
            } else {
                errors.put("username", "มีชื่อผู้ใช้นี้อยู่ในระบบแล้ว");
            }
            db.close();
            
//            Send email
            if(errors.isEmpty()) {
                String from = "noreply@likitomionline.com";
                String to = customer.getEmail();
                String subject = "ยืนยันการลงทะเบียน";
                String body = "คุณได้ลงทะเบียนกับเรา <br />"
                        + "<b><a href='http://localhost:8084/likitomi/account/Activate?id='" 
                        + customer.getId() + "&activate_code=" + customer.getActivateCode()
                        + ">คลิกที่นี่</a></b> เพื่อยืนยันการลงทะเบียน <br /> "
                        + "หากท่านไม่สามารถคลิกที่ลิงค์ดังกล่าวได้ กรุณาคัดลอกลิงค์ด้านล่าง และนำไปวางใน url <br />"
                        + "http://localhost:8084/likitomi/account/Activate?id='" + customer.getId() + "&activate_code=" 
                        + customer.getActivateCode();
                Utility.sendMail(from, to, subject, body);
            }
            
//            Go to View
            if(errors.isEmpty()) {
                RequestDispatcher rd = request.getRequestDispatcher("register_almost_complete.jsp");
                rd.forward(request, response);
            } else {
                request.setAttribute("errors", errors);
                
                RequestDispatcher rd = request.getRequestDispatcher("register.jsp");
                rd.forward(request, response);
            }
        } catch(Exception ex) { 
            ex.printStackTrace();
        }
    } 

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /** 
     * Handles the HTTP <code>GET</code> method.
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
        processRequest(request, response);
    } 

    /** 
     * Handles the HTTP <code>POST</code> method.
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
        processRequest(request, response);
    }

    /** 
     * Returns a short description of the servlet.
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
