package likitomi.jsp.control.shop;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import likitomi.jsp.model.Database;
import likitomi.jsp.model.Page;
import likitomi.jsp.model.Product;
import likitomi.jsp.model.ProductTable;

/**
 *
 * @author funkyboyz_book4
 */
public class SearchResult extends HttpServlet 
{
    public static final int ITEM_PER_PAGE = 4;
    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
//        response.setContentType("text/html;charset=UTF-8");
//        PrintWriter out = response.getWriter();
        try {
//            Prepare Input
            String keyword = (request.getParameter("keyword") != null ? request.getParameter("keyword") : "");
            int pageNo = (request.getParameter("page_no") != null && request.getParameter("page_no").length() > 0 ? Integer.parseInt(request.getParameter("page_no")) : 0);
            
//            Call Model
            Database db = new Database();
            ProductTable productTable = new ProductTable(db);
            int numRecord = productTable.getSize();
            Page page = new Page(numRecord, pageNo, ITEM_PER_PAGE);
            List<Product> result = productTable.findByKeyword(keyword, page.getFromIndex(), ITEM_PER_PAGE);
            int pageCount = page.size();
            db.close();
            
//            Go to View
            request.setAttribute("result", result);
            request.setAttribute("pageCount", pageCount);
            request.getSession().setAttribute("keyword", keyword);
            request.getSession().setAttribute("pageNo", pageNo);
            
            RequestDispatcher rd;
            rd = request.getRequestDispatcher("search.jsp");
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
