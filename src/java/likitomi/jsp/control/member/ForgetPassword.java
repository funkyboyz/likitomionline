package likitomi.jsp.control.member;

import java.io.IOException;
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
public class ForgetPassword extends HttpServlet 
{
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
//        response.setContentType("text/html;charset=UTF-8");
//        PrintWriter out = response.getWriter();
        try {
//            Prepare Input
            String username = request.getParameter("username");
            
//            Call Model
//            Get Data
            Database db = new Database();
            CustomerTable customerTable = new CustomerTable(db);
            Customer customer = customerTable.findByUsername(username);
            db.close();
            
//            Send email
            if(customer != null) {
                String from = "noreply@likitomionline.com";
                String to = customer.getEmail();
                String subject = "ลืมรหัสผ่าน";
                String body = "คุณได้แจ้งลืมรหัสผ่านกับเรา <br /> "
                        + "โปรดยืนยันการเปลี่ยนรหัสผ่านใหม่ "
                        + "<b><a href='http://localhost:8084/likitomi/account/RandomPassword?id='" 
                        + customer.getId() + "&activate_code=" + customer.getActivateCode()
                        + ">คลิกที่นี่</a></b>"
                        + "หากท่านไม่สามารถคลิกที่ลิงค์ดังกล่าวได้ กรุณาคัดลอกลิงค์ด้านล่าง และนำไปวางใน url <br />"
                        + "http://localhost:8084/likitomi/account/RandomPassword?id='" 
                        + customer.getId() + "&activate_code=" + customer.getActivateCode();
                Utility.sendMail(from, to, subject, body);
            }
            
//            Go to View
            if(customer != null) {
                RequestDispatcher rd = request.getRequestDispatcher("forgot_password_almost_complete.jsp");
                rd.forward(request, response);
            } else {
                request.setAttribute("usernameIncorrect", "ไม่พบชื่อผู้ใช้");
                RequestDispatcher rd;
                rd = request.getRequestDispatcher("forgot_password.jsp");
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
