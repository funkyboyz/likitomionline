package likitomi.jsp.model;

// @author funkyboyz_book4
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

public class OrderTable {

    private Database db;

    public OrderTable(Database db) {
        this.db = db;
    }

    public void add(Order order) {
        String sql = "INSERT INTO `order`(order_code, cust_code, prod_code, prod_type_code, quantity, order_date, order_status, order_confirm, delivery_date, emp_code, comp_code, flag, date, description) "
                + "VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
        int id = db.add(sql, order.getOrderCode(),
                order.getCustCode(),
                order.getProdCode(),
                order.getProdTypeCode(),
                order.getQuantity(),
                order.getOrderDate(),
                order.getOrderStatus(),
                order.getOrderConfirm(),
                order.getDeliveryDate(),
                order.getEmpCode(),
                order.getCompCode(),
                order.getFlag(),
                order.getDate(),
                order.getDescription());
        order.setId(id);
    }

    public List<Order> findAll() {
        List<Order> list = new ArrayList<Order>();
        String sql = "SELECT *, `order`.id AS order_id FROM `order` "
                + "INNER JOIN `customer` "
                + "ON `order`.cust_id = customer.id "
                + "ORDER BY date DESC";

        List<Map<String, Object>> result = db.queryList(sql);
        for (Map<String, Object> row : result) {
            Customer customer = new Customer(
                    (Integer) row.get("id"),
                    (String) row.get("custCode"),
                    (String) row.get("username"),
                    (String) row.get("password"),
                    (String) row.get("fName"),
                    (String) row.get("lName"),
                    (String) row.get("address"),
                    (Integer) row.get("district"),
                    (Integer) row.get("province"),
                    (Integer) row.get("postcode"),
                    (Integer) row.get("landline"),
                    (Integer) row.get("mobile"),
                    (Integer) row.get("fax"),
                    (String) row.get("email"),
                    (Company) row.get("compCode"),
                    (Boolean) row.get("activate"),
                    (String) row.get("activateCode"),
                    (Date) row.get("registerDate"));

            Order order = new Order(
                    (Integer) row.get("id"),
                    (String) row.get("orderCode"),
                    customer,
                    (Product) row.get("prodCode"),
                    (ProductType) row.get("prodTypeCode"),
                    (Integer) row.get("quantity"),
                    (Date) row.get("orderDate"),
                    (Integer) row.get("orderStatus"),
                    (Integer) row.get("orderConfirm"),
                    (String) row.get("shippingAddress"),
                    (Date) row.get("deliveryDate"),
                    (Employee) row.get("empCode"),
                    (Company) row.get("compCode"),
                    (Integer) row.get("flag"),
                    (Date) row.get("date"),
                    (String) row.get("description"));
            list.add(order);
        }
        return list;
    }
}
