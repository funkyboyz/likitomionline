package likitomi.jsp.control.member;

import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import likitomi.jsp.model.Customer;
import likitomi.jsp.model.CustomerTable;
import likitomi.jsp.model.Database;

/**
 *
 * @author funkyboyz_book4
 */
public class ChangePassword extends HttpServlet 
{
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
//        response.setContentType("text/html;charset=UTF-8");
//        PrintWriter out = response.getWriter();
        try {
//            Prepare Input
            String oldPass = request.getParameter("old");
            String newPass = request.getParameter("new");
            String cfmPasswd = request.getParameter("cfmPasswd");
            
//            Validate Input
            if(!newPass.equals(cfmPasswd)) {
                request.setAttribute("confirmIncorrect", "รหัสผ่านไม่ตรงกัน");
                
                RequestDispatcher rd = request.getRequestDispatcher("change_password.jsp");
                rd.forward(request, response);
                return;
            }
            
//            Call Model
//            Customer
            HttpSession session = request.getSession();
            Customer customer = (Customer) session.getAttribute("customer");
            
//            Change to New Password
            boolean oldMatch = (customer.getPassword().equals(oldPass));
            
            if(oldMatch) {
                Database db = new Database();
                CustomerTable customerTable = new CustomerTable(db);
                
                customer.setPassword(newPass);
                customerTable.update(customer);
                db.close();
            }
            
//            Go to View
            if(oldMatch) {
                response.sendRedirect("change_password_completed.jsp");
            } else {
                request.setAttribute("oldIncorrect", "รหัสผ่านเดิมผิด");
                
                RequestDispatcher rd;
                rd = request.getRequestDispatcher("change_password.jsp");
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
