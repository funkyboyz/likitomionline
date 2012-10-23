package likitomi.jsp.control.shop;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import likitomi.jsp.model.Database;
import likitomi.jsp.model.Item;
import likitomi.jsp.model.Product;
import likitomi.jsp.model.ProductTable;
import likitomi.jsp.model.ShoppingCart;

/**
 *
 * @author funkyboyz_book4
 */
public class AddToCart extends HttpServlet 
{
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
//        response.setContentType("text/html;charset=UTF-8");
//        PrintWriter out = response.getWriter();
        try {
//            Prepare Input
            int id = Integer.parseInt(request.getParameter("id"));
            int amount = Integer.parseInt(request.getParameter("amount"));
            
//            Call Model
//            Cart
            HttpSession session = request.getSession();
            ShoppingCart cart = (ShoppingCart) session.getAttribute("cart");
            
            if(cart == null) {
                cart = new ShoppingCart();
                session.setAttribute("cart", cart);
            }
            
//            Item
            Database db = new Database();
            ProductTable productTable = new ProductTable(db);
            Product product = productTable.findById(id);
            Item item = new Item(product, amount);
            cart.add(item);
            db.close();
            
//            Go to View
            response.sendRedirect("ShowCart");
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
