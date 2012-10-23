package likitomi.jsp.model;

// @author funkyboyz_book4

import java.util.Date;
import java.util.Map;

public class CustomerTable {
    private Database db;
    
    public CustomerTable(Database db) {
        this.db = db;
    }
    
    public void deleteUnactivate() {
        String sql = "DELETE FROM customer "
                + "WHERE activate = 0 "
                + "AND DATEDIFF(CURDATE(), register_date) > 7";
        db.update(sql);
    }
    
    public boolean add(Customer customer) {
        String sql = "INSERT INTO customer(cust_code, username, password, cust_fname, cust_lname, cust_address, dist_code, prov_code, "
                + "cust_postcode, cust_landline, cust_mobile, cust_fax, cust_email, comp_code, activate, activate_code, register_date) "
                + "VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
        try {
            int id = db.add(sql, customer.getCustCode(),
                                 customer.getUsername(),
                                 customer.getPassword(),
                                 customer.getfName(),
                                 customer.getlName(),
                                 customer.getAddress(),
                                 customer.getDistrict(),
                                 customer.getProvince(),
                                 customer.getPostcode(),
                                 customer.getLandline(),
                                 customer.getMobile(),
                                 customer.getFax(),
                                 customer.getEmail(),
                                 customer.getCompCode(),
                                 customer.isActivate(),
                                 customer.getActivateCode(),
                                 customer.getRegisterDate());
            customer.setId(id);
            return true;
        } catch(Exception e) {
            return false;
        }
    }
    
    public void update(Customer customer) {
        String sql = "UPDATE customer "
                + "SET cust_code = ?, username = ?, password = ?, cust_fname = ?, cust_lname = ?, cust_address = ?, dist_code = ?, "
                + "prov_code = ?, cust_postcode = ?, cust_landline = ?, cust_mobile = ?, cust_fax = ?, cust_email = ?, comp_code = ?, "
                + "activate = ?, activate_code = ?, register_date = ? "
                + "WHERE id = ?";
        db.update(sql, customer.getCustCode(),
                                 customer.getUsername(),
                                 customer.getPassword(),
                                 customer.getfName(),
                                 customer.getlName(),
                                 customer.getAddress(),
                                 customer.getDistrict(),
                                 customer.getProvince(),
                                 customer.getPostcode(),
                                 customer.getLandline(),
                                 customer.getMobile(),
                                 customer.getFax(),
                                 customer.getEmail(),
                                 customer.getCompCode(),
                                 customer.isActivate(),
                                 customer.getActivateCode(),
                                 customer.getRegisterDate(),
                                 customer.getId());
    }
    
    public Customer findById(int id) {
        String sql = "SELECT * FROM customer WHERE id = ?";
        Map<String, Object> result = db.querySingle(sql, id);
        
        if(result != null) {
            return new Customer(id, (String) result.get("cust_code"),
                                    (String) result.get("username"),
                                    (String) result.get("password"),
                                    (String) result.get("cust_fname"),
                                    (String) result.get("cust_lname"),
                                    (String) result.get("cust_address"),
                                    (Integer) result.get("dist_code"),
                                    (Integer) result.get("prov_code"),
                                    (Integer) result.get("cust_postcode"),
                                    (Integer) result.get("cust_landline"),
                                    (Integer) result.get("cust_mobile"),
                                    (Integer) result.get("cust_fax"),
                                    (String) result.get("cust_email"),
                                    (Company) result.get("comp_code"),
                                    (Boolean) result.get("activate"),
                                    (String) result.get("activate_code"),
                                    (Date) result.get("register_date"));
        } else {
            return null;
        }
    }
    
    public Customer findByUsername(String username) {
        String sql = "SELECT * FROM customer WHERE username = ?";
        Map<String, Object> result = db.querySingle(sql, username);
        
        if(result != null) {
            return new Customer((Integer) result.get("id"),
                                (String) result.get("cust_code"),
                                username,
                                (String) result.get("password"),
                                (String) result.get("cust_fname"),
                                (String) result.get("cust_lname"),
                                (String) result.get("cust_address"),
                                (Integer) result.get("dist_code"),
                                (Integer) result.get("prov_code"),
                                (Integer) result.get("cust_postcode"),
                                (Integer) result.get("cust_landline"),
                                (Integer) result.get("cust_mobile"),
                                (Integer) result.get("cust_fax"),
                                (String) result.get("cust_email"),
                                (Company) result.get("comp_code"),
                                (Boolean) result.get("activate"),
                                (String) result.get("activate_code"),
                                (Date) result.get("register_date"));
        } else {
            return null;
        }
    }
    
    public Customer findByUP(String username, String password) {
        String sql = "SELECT * FROM customer "
                + "WHERE username = ? AND password = ?";
        Map<String, Object> result = db.querySingle(sql, username, password);
        
        if(result != null) {
            return new Customer((Integer) result.get("id"),
                                (String) result.get("cust_code"),
                                (String) result.get("username"),
                                (String) result.get("password"),
                                (String) result.get("cust_fname"),
                                (String) result.get("cust_lname"),
                                (String) result.get("cust_address"),
                                (Integer) result.get("dist_code"),
                                (Integer) result.get("prov_code"),
                                (Integer) result.get("cust_postcode"),
                                (Integer) result.get("cust_landline"),
                                (Integer) result.get("cust_mobile"),
                                (Integer) result.get("cust_fax"),
                                (String) result.get("cust_email"),
                                (Company) result.get("comp_code"),
                                (Boolean) result.get("activate"),
                                (String) result.get("activate_code"),
                                (Date) result.get("register_date"));
        } else {
            return null;
        }
    }
}
