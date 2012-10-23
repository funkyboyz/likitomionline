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
import likitomi.jsp.model.Company;
import likitomi.jsp.model.Database;
import likitomi.jsp.model.Product;
import likitomi.jsp.model.ProductTable;

/**
 *
 * @author funkyboyz_book4
 */
public class AddProduct extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
//        response.setContentType("text/html;charset=UTF-8");
//        PrintWriter out = response.getWriter();
        try {
//            Prepare Input
            MultipartFormDataRequest mrequest = new MultipartFormDataRequest(request);
            String prodCode = mrequest.getParameter("prodCode");
            String prodName = mrequest.getParameter("prodName");
            String prodTypeCode = mrequest.getParameter("prodTypeCode");
            String flute = mrequest.getParameter("flute");
            String df = mrequest.getParameter("df");
            String bm = mrequest.getParameter("bm");
            String bl = mrequest.getParameter("bl");
            String cm = mrequest.getParameter("cm");
            String cl = mrequest.getParameter("cl");
            int length = Integer.parseInt(mrequest.getParameter("length"));
            int width = Integer.parseInt(mrequest.getParameter("width"));
            int height = Integer.parseInt(mrequest.getParameter("height"));
            int qtySet = Integer.parseInt(mrequest.getParameter("qtySet"));
            String inkColor = mrequest.getParameter("inkColor");
            String boxStyle = mrequest.getParameter("boxStyle");
            int qtyLevel = Integer.parseInt(mrequest.getParameter("qtyLevel"));
            int paperWidth = Integer.parseInt(mrequest.getParameter("paperWidth"));
            double price = Double.parseDouble(mrequest.getParameter("price"));
            int stock = Integer.parseInt(mrequest.getParameter("stock"));
            String compCode = mrequest.getParameter("compCode");
            String description = mrequest.getParameter("description");
            UploadFile pic = (UploadFile) mrequest.getFiles().get("picture");

//            Validate Input
            String error = "";

            if (pic.getFileSize() == -1) {
                error = "กรุณาเลือกภาพ";
            } else if (pic.getFileSize() > 50 * 1024) {
                error = "ขนาดไฟล์รูปภาพต้องไม่เกิน 50kbs";
            }

            if (error.length() > 0) {
                Product product = new Product(
                        prodCode,
                        prodName,
                        prodTypeCode,       // wrong datatype parameter
                        flute,
                        df,
                        bm,
                        bl,
                        cm,
                        cl,
                        length,
                        width,
                        height,
                        qtySet,
                        inkColor,
                        boxStyle,
                        qtyLevel,
                        paperWidth,
                        price,
                        stock,
                        compCode,           // wrong datatype parameter
                        description);
                request.setAttribute("invalidPicture", error);
                if (product != null) {
                    request.setAttribute("product", product);
                }

                RequestDispatcher rd = request.getRequestDispatcher("add_product.jsp");
                rd.forward(request, response);
                return;
            }

//             Call Model
//            Data
            Database db = new Database();
            ProductTable productTable = new ProductTable(db);
            Product product = new Product(
                    prodCode,
                    prodName,
                    prodTypeCode,       // wrong datatype parameter
                    flute,
                    df,
                    bm,
                    bl,
                    cm,
                    cl,
                    length,
                    width,
                    height,
                    qtySet,
                    inkColor,
                    boxStyle,
                    qtyLevel,
                    paperWidth,
                    price,
                    stock,
                    compCode,           // wrong datatype parameter
                    description);

            productTable.add(product);
            db.close();

//          Upload File
            UploadBean upBean = new UploadBean();
            pic.setFileName(product.getId() + ".png");
            upBean.setFolderstore(getServletContext().getRealPath("/img/product"));
            upBean.store(mrequest);

//            Go to View
            response.sendRedirect("ShowAllProducts");
        } catch (Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex.getMessage());
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP
     * <code>GET</code> method.
     *
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
     * Handles the HTTP
     * <code>POST</code> method.
     *
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
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>
}
