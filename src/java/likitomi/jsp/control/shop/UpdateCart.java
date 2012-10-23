package likitomi.jsp.control.shop;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import likitomi.jsp.model.ShoppingCart;
import likitomi.jsp.util.Utility;

/**
 *
 * @author funkyboyz_book4
 */
public class UpdateCart extends HttpServlet 
{
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
//        response.setContentType("text/html;charset=UTF-8");
//        PrintWriter out = response.getWriter();
        try {
//            Prepare Input
            String[] removes = request.getParameterValues("remove");
            String[] amounts = request.getParameterValues("amount");
            String[] ids = request.getParameterValues("id");
            
            if(removes == null) {
                removes = new String[0];
            }
            
//            Validate Input
            Map<Integer, String> errors = new HashMap<Integer, String>();
            
            for(int i = 0; i < ids.length; i++) {
                if(!Utility.isNumber(amounts[i])) {
                    errors.put(Integer.parseInt(ids[i]), "กรุณากรอกเป็นตัวเลขเท่านั้น");
                } else if(Integer.parseInt(amounts[i]) <= 0) {
                    errors.put(Integer.parseInt(ids[i]), "กรุณากรอกตัวเลขจำนวนเต็มเท่านั้น");
                }
            }
            
            if(errors.size() > 0) {
                request.setAttribute("errors", errors);
                
                RequestDispatcher rd;
                rd = request.getRequestDispatcher("shopping_cart.jsp");
                rd.forward(request, response);
                return;
            }
            
//            Call Model
//            Cart
            HttpSession session = request.getSession();
            ShoppingCart cart = (ShoppingCart) session.getAttribute("cart");
            
//            Update
            for(int i = 0; i < ids.length; i++) {
                int id = Integer.parseInt(ids[i]);
                int amount = Integer.parseInt(amounts[i]);
                cart.update(id, amount);
            }
            
//            Remove
            for(int i = 0; i < removes.length; i++) {
                int id = Integer.parseInt(removes[i]);
                cart.remove(id);
            }
            
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
