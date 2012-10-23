package likitomi.jsp.control.back;

//import java.io.IOException;
//import java.io.PrintWriter;
//import java.util.List;
//import javax.servlet.RequestDispatcher;
//import javax.servlet.ServletException;
//import javax.servlet.http.HttpServlet;
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//import likitomi.jsp.model.Database;
//import likitomi.jsp.model.ProductType;
//import likitomi.jsp.model.ProductTypeTable;
import javax.servlet.*;
import javax.servlet.http.*;
import likitomi.jsp.model.*;
import java.util.*;
import java.io.*;

/**
 *
 * @author funkyboyz_book4
 */
public class ShowAllProductType extends HttpServlet 
{
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
//        response.setContentType("text/html;charset=UTF-8");
//        PrintWriter out = response.getWriter();
        try {
//            Call Model
            Database db = new Database();
            ProductTypeTable productTypeTable = new ProductTypeTable(db);
            List<ProductType> result = productTypeTable.findAll();
            db.close();
            
//            Go to View
            request.setAttribute("result", result);
            request.setAttribute("time", System.currentTimeMillis());
            
            RequestDispatcher rd = request.getRequestDispatcher("product_type_mgmt.jsp");
            rd.forward(request, response);
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