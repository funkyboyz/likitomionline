package likitomi.jsp.model;

// @author funkyboyz_book4
public class OrderDetail {
    
    private int id;
    private Customer customer;
    private Order order;
    private ProductType productType;
    private Product product;
    private Employee employee;
    private Company compCode;
    private String description;

    public Company getCompCode() {
        return compCode;
    }

    public void setCompCode(Company compCode) {
        this.compCode = compCode;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }

    public ProductType getProductType() {
        return productType;
    }

    public void setProductType(ProductType productType) {
        this.productType = productType;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    
    public OrderDetail(Customer customer, 
                        Order order,
                        ProductType productType,
                        Product product,
                        Employee employee,
                        Company compCode,
                        String description) {
        this(0, customer,
                order,
                productType,
                product,
                employee,
                compCode,
                description);
    }
    
    public OrderDetail(int id, 
                       Customer customer,
                       Order order,
                       ProductType productType,
                       Product product,
                       Employee employee,
                       Company compCode,
                       String description) {
        this.id = id;
        this.customer = customer;
        this.order = order;
        this.productType = productType;
        this.product = product;
        this.employee = employee;
        this.compCode = compCode;
        this.description = description;
    }
}
