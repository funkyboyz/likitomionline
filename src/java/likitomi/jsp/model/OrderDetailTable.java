package likitomi.jsp.model;

// @author funkyboyz_book4
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

public class OrderDetailTable {

    private Database db;

    public OrderDetailTable(Database db) {
        this.db = db;
    }

    public void add(OrderDetail orderDetail) {
        String sql = "INSERT INTO order_detail(cust_code, order_code, prod_type_code, prod_code, emp_code, comp_code, description) "
                + "VALUES(?, ?, ?, ?, ?, ?, ?)";
        int id = db.add(sql, orderDetail.getCustomer().getId(),
                orderDetail.getOrder().getId(),
                orderDetail.getProductType().getId(),
                orderDetail.getProduct().getId(),
                orderDetail.getEmployee().getId(),
                orderDetail.getCompCode().getId(),
                orderDetail.getDescription());
        orderDetail.setId(id);
    }

    public List<OrderDetail> findByOrderId(int order_id) {
        List<OrderDetail> list = new ArrayList<OrderDetail>();
        String sql = "SELECT *, order_detail.id AS order_detail_id "
                + "FROM order_detail "
                + "INNER JOIN customer "
                + "ON order_detail.cust_code = customer.id "
                + "INNER JOIN `order` "
                + "ON order_detail.order_code = `order`.id "
                + "INNER JOIN product_type "
                + "ON order_detail.prod_type_code = product_type.id "
                + "INNER JOIN product "
                + "ON order_detail.prod_code = product.id "
                + "INNER JOIN employee "
                + "ON order_detail.emp_code = employee.id "
                + "WHERE order_detail.id=? "
                + "ORDER BY `order`.id";

        List<Map<String, Object>> result;
        result = db.queryList(sql, order_id);

        for (Map<String, Object> row : result) {
            Company company = new Company((Integer) row.get("id"),
                    (String) row.get("comp_code"),
                    (String) row.get("comp_name"),
                    (String) row.get("address"),
                    (Integer) row.get("dist_code"),
                    (Integer) row.get("prov_code"),
                    (Integer) row.get("post_code"),
                    (Integer) row.get("landline"),
                    (Integer) row.get("mobile"),
                    (Integer) row.get("fax"),
                    (String) row.get("website"),
                    (Date) row.get("register_date"),
                    (String) row.get("description"));

            Customer customer = new Customer((Integer) row.get("id"),
                    (String) row.get("cust_code"),
                    (String) row.get("username"),
                    (String) row.get("password"),
                    (String) row.get("cust_fname"),
                    (String) row.get("cust_lname"),
                    (String) row.get("address"),
                    (Integer) row.get("dist_code"),
                    (Integer) row.get("prov_code"),
                    (Integer) row.get("cust_postcode"),
                    (Integer) row.get("cust_landline"),
                    (Integer) row.get("cust_mobile"),
                    (Integer) row.get("cust_fax"),
                    (String) row.get("cust_email"),
                    (Company) row.get("comp_code"),
                    (Boolean) row.get("activate"),
                    (String) row.get("activate_code"),
                    (Date) row.get("register_date"));

            Order order = new Order((Integer) row.get("id"),
                    (String) row.get("order_code"),
                    customer,
                    (Product) row.get("prod_code"),
                    (ProductType) row.get("prod_type_code"),
                    (Integer) row.get("quantity"),
                    (Date) row.get("order_date"),
                    (Integer) row.get("order_status"),
                    (Integer) row.get("order_confirm"),
                    (String) row.get("shipping_address"),
                    (Date) row.get("delivery_date"),
                    (Employee) row.get("emp_code"),
                    (Company) row.get("comp_code"),
                    (Integer) row.get("flag"),
                    (Date) row.get("date"),
                    (String) row.get("description"));

            ProductType productType = new ProductType((Integer) row.get("id"),
                    (String) row.get("prod_type_code"),
                    (String) row.get("prod_type_name"),
                    (String) row.get("description"));

            Product product = new Product((Integer) row.get("id"),
                    (String) row.get("prod_code"),
                    (String) row.get("prod_name"),
                    productType,
                    (String) row.get("flute"),
                    (String) row.get("df"),
                    (String) row.get("bm"),
                    (String) row.get("bl"),
                    (String) row.get("cm"),
                    (String) row.get("cl"),
                    (Integer) row.get("length"),
                    (Integer) row.get("width"),
                    (Integer) row.get("height"),
                    (Integer) row.get("qty_set"),
                    (String) row.get("ink_color"),
                    (String) row.get("box_style"),
                    (Integer) row.get("qty_level"),
                    (Integer) row.get("paper_width"),
                    (Double) row.get("price"),
                    (Integer) row.get("stock"),
                    company,
                    (String) row.get("description"));

            Employee employee = new Employee((Integer) row.get("id"),
                    (String) row.get("emp_code"),
                    (String) row.get("username"),
                    (String) row.get("password"),
                    (String) row.get("cust_fname"),
                    (String) row.get("cust_lname"),
                    (String) row.get("address"),
                    (Integer) row.get("dist_code"),
                    (Integer) row.get("prov_code"),
                    (Integer) row.get("postcode"),
                    (Integer) row.get("emp_landline"),
                    (Integer) row.get("emp_mobile"),
                    (Integer) row.get("emp_fax"),
                    (String) row.get("emp_email"),
                    company,
                    (Integer) row.get("permission"),
                    (Date) row.get("register_date"));

            OrderDetail orderDetail = new OrderDetail((Integer) row.get("id"),
                    customer,
                    order,
                    productType,
                    product,
                    employee,
                    company,
                    (String) row.get("description"));

            list.add(orderDetail);
        }
        return list;
    }
}
