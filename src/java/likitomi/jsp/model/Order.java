package likitomi.jsp.model;

// @author funkyboyz_book4

import java.util.Date;


public class Order {
    private int id;
    private String orderCode;
    private Customer custCode;
    private Product prodCode;
    private ProductType prodTypeCode;
    private int quantity;
    private Date orderDate;
    private int orderStatus;
    private int orderConfirm;
    private String shippingAddress;
    private Date deliveryDate;
    private Employee empCode;
    private Company compCode;
    private int flag;
    private Date date;
    private String description;

    public Company getCompCode() {
        return compCode;
    }

    public void setCompCode(Company compCode) {
        this.compCode = compCode;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getOrderCode() {
        return orderCode;
    }

    public void setOrderCode(String orderCode) {
        this.orderCode = orderCode;
    }

    public Customer getCustCode() {
        return custCode;
    }

    public void setCustCode(Customer custCode) {
        this.custCode = custCode;
    }

    public Product getProdCode() {
        return prodCode;
    }

    public void setProdCode(Product prodCode) {
        this.prodCode = prodCode;
    }

    public ProductType getProdTypeCode() {
        return prodTypeCode;
    }

    public void setProdTypeCode(ProductType prodTypeCode) {
        this.prodTypeCode = prodTypeCode;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public Date getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(Date orderDate) {
        this.orderDate = orderDate;
    }

    public int getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(int orderStatus) {
        this.orderStatus = orderStatus;
    }

    public int getOrderConfirm() {
        return orderConfirm;
    }

    public void setOrderConfirm(int orderConfirm) {
        this.orderConfirm = orderConfirm;
    }

    public String getShippingAddress() {
        return shippingAddress;
    }

    public void setShippingAddress(String shippingAddress) {
        this.shippingAddress = shippingAddress;
    }

    public Date getDeliveryDate() {
        return deliveryDate;
    }

    public void setDeliveryDate(Date deliveryDate) {
        this.deliveryDate = deliveryDate;
    }

    public Employee getEmpCode() {
        return empCode;
    }

    public void setEmpCode(Employee empCode) {
        this.empCode = empCode;
    }

    public int getFlag() {
        return flag;
    }

    public void setFlag(int flag) {
        this.flag = flag;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    
    public Order(String orderCode,
                 Customer custCode,
                 Product prodCode,
                 ProductType prodTypeCode,
                 int quantity,
                 Date orderDate,
                 int orderStatus,
                 int orderConfirm,
                 String shippingAddress,
                 Date deliveryDate,
                 Employee empCode,
                 Company compCode,
                 int flag,
                 Date date,
                 String description) {
        this(0, orderCode,
                custCode,
                prodCode,
                prodTypeCode,
                quantity,
                orderDate,
                orderStatus,
                orderConfirm,
                shippingAddress,
                deliveryDate,
                empCode,
                compCode,
                flag,
                date,
                description);
    }
    
    public Order(int id,
                 String orderCode,
                 Customer custCode,
                 Product prodCode,
                 ProductType prodTypeCode,
                 int quantity,
                 Date orderDate,
                 int orderStatus,
                 int orderConfirm,
                 String shippingAddress,
                 Date deliveryDate,
                 Employee empCode,
                 Company compCode,
                 int flag,
                 Date date,
                 String description) {
        this.id = id;
        this.orderCode = orderCode;
        this.custCode = custCode;
        this.prodCode = prodCode;
        this.prodTypeCode = prodTypeCode;
        this.quantity = quantity;
        this.orderDate = orderDate;
        this.orderStatus = orderStatus;
        this.orderConfirm = orderConfirm;
        this.shippingAddress = shippingAddress;
        this.deliveryDate = deliveryDate;
        this.empCode = empCode;
        this.compCode = compCode;
        this.flag = flag;
        this.date = date;
        this.description = description;
    }
}
