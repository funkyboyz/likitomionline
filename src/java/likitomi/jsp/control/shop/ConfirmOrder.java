package likitomi.jsp.control.shop;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import likitomi.jsp.model.Company;
import likitomi.jsp.model.Customer;
import likitomi.jsp.model.Database;
import likitomi.jsp.model.Employee;
import likitomi.jsp.model.Item;
import likitomi.jsp.model.Order;
import likitomi.jsp.model.OrderDetail;
import likitomi.jsp.model.OrderDetailTable;
import likitomi.jsp.model.OrderTable;
import likitomi.jsp.model.Product;
import likitomi.jsp.model.ProductTable;
import likitomi.jsp.model.ProductType;
import likitomi.jsp.model.ShoppingCart;
import likitomi.jsp.util.Utility;

/**
 *
 * @author funkyboyz_book4
 */
public class ConfirmOrder extends HttpServlet 
{
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
//        response.setContentType("text/html;charset=UTF-8");
//        PrintWriter out = response.getWriter();
        try {
//            Prepare Input
            String orderCode = (String) request.getParameter("orderCode");
            int quantity = Integer.parseInt(request.getParameter("quantity"));
            int orderStatus = Integer.parseInt(request.getParameter("orderStatus"));
            int orderConfirm = Integer.parseInt(request.getParameter("orderConfirm"));
            String shippingAddress = (String) request.getParameter("address");
            int flag = Integer.parseInt(request.getParameter("flag"));
            String description = (String) request.getParameter("description");
//            Company compCode = (Company) request.getParameter("compCode");
            
//            Call Model
//            boolean isOutOfStock = false;
            
//            Cart & Customer
            HttpSession session = request.getSession();
            ShoppingCart cart = (ShoppingCart) session.getAttribute("cart");
            Customer custCode = (Customer) session.getAttribute("customer");
            Product prodCode = (Product) session.getAttribute("prodCode");
            ProductType prodTypeCode = (ProductType) session.getAttribute("prodTypeCode");
//            Date orderDate = (Date) session.getAttribute("orderDate");
//            Date deliveryDate = (Date) session.getAttribute("deliveryDate");
            Employee empCode = (Employee) session.getAttribute("empCode");
            Company compCode = (Company) session.getAttribute("compCode");
//            Date date = (Date) session.getAttribute("date");
            
//            Database
            Database db = new Database();
            db.beginTransaction();
            
//            Add New Order
            OrderTable orderTable = new OrderTable(db);
            Order order = new Order(orderCode, custCode, prodCode, prodTypeCode, quantity, new Date(), orderStatus, orderConfirm, shippingAddress, new Date(), empCode, compCode, flag, new Date(), description);
            orderTable.add(order);
            
//            Add New Order Detail & Update Stock
            OrderDetailTable orderDetailTable = new OrderDetailTable(db);
            ProductTable productTable = new ProductTable(db);
            Collection<Item> col = cart.getItems();
            
            for(Item item : col) {
//                Add New Order Detail
                OrderDetail orderDetail = new OrderDetail(custCode, order, prodTypeCode, prodCode, empCode, compCode, description);
                orderDetailTable.add(orderDetail);
                
//                Update Stock
                Product product = productTable.findById(item.getId());
                item.setStock(product.getStock());
                
                product.setStock(product.getStock() - item.getAmount());
                productTable.update(product);
                
                db.close();
                
//                Send email
                String from = "noreply@likitomionline.com";
                String to = custCode.getEmail();
                String subject = "ยืนยันการสั่งซื้อ";
                String body = "คุณได้สั่งซื้อสินค้ากับเรา";
                
                Utility.sendMail(from, to, subject, body);
                
//                Clear Shopping Cart
                session.removeAttribute("cart");
                
//                Go to View
                response.sendRedirect("purchased.jsp");
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
