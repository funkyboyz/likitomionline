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
import likitomi.jsp.model.ShoppingCart;

/**
 *
 * @author funkyboyz_book4
 */
public class Login extends HttpServlet 
{
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
//        response.setContentType("text/html;charset=UTF-8");
//        PrintWriter out = response.getWriter();
        try {
//            Prepare Input
            String username = request.getParameter("username");
            String password = request.getParameter("password");
            
//            Call Model
            HttpSession session = request.getSession();
            Database db = new Database();
            CustomerTable customerTable = new CustomerTable(db);
            Customer customer = customerTable.findByUP(username, password);
            db.close();
            
//            Go to View
            if(customer != null && customer.isActivate()) {
                ShoppingCart cart = (ShoppingCart) session.getAttribute("cart");
                session.setAttribute("customer", customer);
                
                if(cart != null && cart.getItems().size() > 0) {
                    response.sendRedirect("../shop/cart/shipping.jsp");
                } else {
                    response.sendRedirect("../shop/index.jsp");
                }
            } else {
                if(customer == null) {
                    request.setAttribute("loginIncorrect", "ชื่อผู้ใช้หรือรหัสผ่านไม่ถูกต้อง");
                } else {
                    request.setAttribute("loginIncorrect", "บัญชียังไม่ผ่านการยืนยัน");
                }
                
                RequestDispatcher rd = request.getRequestDispatcher("login.jsp");
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
