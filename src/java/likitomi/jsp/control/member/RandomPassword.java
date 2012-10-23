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
public class RandomPassword extends HttpServlet 
{
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
//        response.setContentType("text/html;charset=UTF-8");
//        PrintWriter out = response.getWriter();
        try {
//            Prepare Input
            int id = Integer.parseInt(request.getParameter("id"));
            String activateCode = request.getParameter("activate_code");
            
//            Call Model
            Database db = new Database();
            CustomerTable customerTable = new CustomerTable(db);
            Customer customer = customerTable.findById(id);
            
            if(customer != null && customer.getActivateCode().equals(activateCode)) {
                String password = Utility.randomText(8);
                
                customer.setPassword(password);
                customerTable.update(customer);
            }
            db.close();
            
//            Go to View
            if(customer != null && customer.getActivateCode().equals(activateCode)) {
                request.setAttribute("customer", customer);
                
                RequestDispatcher rd;
                rd = request.getRequestDispatcher("forgot_password_completed.jsp");
                rd.forward(request, response);
            } else {
                response.sendRedirect("forgot_password_failed");
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
