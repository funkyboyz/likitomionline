package likitomi.jsp.control.back;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javazoom.upload.MultipartFormDataRequest;
import javazoom.upload.UploadBean;
import javazoom.upload.UploadFile;
import likitomi.jsp.model.Database;
import likitomi.jsp.model.ProductType;
import likitomi.jsp.model.ProductTypeTable;

/**
 *
 * @author funkyboyz_book4
 */
public class AddProductType extends HttpServlet 
{
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
//        response.setContentType("text/html;charset=UTF-8");
//        PrintWriter out = response.getWriter();
        try {
//            Prepare Input
            MultipartFormDataRequest mrequest = new MultipartFormDataRequest(request);
            String prodTypeCode = mrequest.getParameter("prodTypeCode");
            String prodTypeName = mrequest.getParameter("prodTypeName");
            String description  = mrequest.getParameter("description");
            UploadFile pic = (UploadFile) mrequest.getFiles().get("picture");
            
//            Validate Input
            String error = "";
            
            if(pic.getFileSize() == -1) {
                error = "กรุณาเลือกรูปภาพ";
            } else if(pic.getFileSize() > 50 * 1024) {
                error = "ขนาดไฟล์รูปภาพต้องไม่เกิน 50kbs";
            }
            
            if(error.length() > 0) {
                ProductType productType = new ProductType(prodTypeCode, prodTypeName, description);
                
                request.setAttribute("invalidPicture", error);
                if(productType != null) {
                    request.setAttribute("productType", productType);
                }
                RequestDispatcher rd = request.getRequestDispatcher("add_product_type.jsp");
                rd.forward(request, response);
                return;
            }
            
//            Call Model
//            Data
            Database db = new Database();
            ProductTypeTable productTypeTable = new ProductTypeTable(db);
            ProductType productType = new ProductType(prodTypeCode, prodTypeName, description);
            
            productTypeTable.add(productType);
            db.close();
            
//            File
            UploadBean upBean = new UploadBean();
            pic.setFileName(productType.getId() + ".png");
            upBean.setFolderstore(getServletContext().getRealPath("/img/prod-type"));
            upBean.store(mrequest);
            
//            Go to View
            response.sendRedirect("ShowAllProductType");
        } catch(Exception ex) { 
            ex.printStackTrace();
            throw new RuntimeException(ex.getMessage());
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
