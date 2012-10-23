package likitomi.jsp.model;

// @author funkyboyz_book4

import java.util.Date;
import java.util.Map;

public class EmployeeTable {
    private Database db;
    
    public EmployeeTable(Database db) {
        this.db = db;
    }
    
    public boolean add(Employee employee) {
        String sql = "INSERT INTO employee(emp_code, username, password, emp_fname, emp_lname, emp_address, dist_code, prov_code, "
                + "emp_postcode, emp_landline, emp_mobile, emp_fax, emp_email, comp_code, permission, register_date) "
                + "VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
        try {
            int id = db.add(sql, employee.getEmpCode(),
                                 employee.getUsername(),
                                 employee.getPassword(),
                                 employee.getfName(),
                                 employee.getlName(),
                                 employee.getAddress(),
                                 employee.getDistrict(),
                                 employee.getProvince(),
                                 employee.getPostcode(),
                                 employee.getLandline(),
                                 employee.getMobile(),
                                 employee.getFax(),
                                 employee.getEmail(),
                                 employee.getCompCode(),
                                 employee.getPermission(),
                                 employee.getRegisterDate());
            employee.setId(id);
            return true;
        } catch (Exception e) {
            return false;
        }
    }
    
    public Employee findById(int id) {
        String sql = "SELECT * FROM employee WHERE id = ?";
        Map<String, Object> result = db.querySingle(sql, id);
        
        if(result != null) {
            return new Employee(id, (String) result.get("emp_code"), 
                                    (String) result.get("username"), 
                                    (String) result.get("password"), 
                                    (String) result.get("emp_fname"), 
                                    (String) result.get("emp_lanme"), 
                                    (String) result.get("emp_address"), 
                                    (Integer) result.get("dist_code"), 
                                    (Integer) result.get("prov_code"), 
                                    (Integer) result.get("emp_postcode"), 
                                    (Integer) result.get("emp_landline"), 
                                    (Integer) result.get("emp_mobile"), 
                                    (Integer) result.get("emp_fax"), 
                                    (String) result.get("emp_email"), 
                                    (Company) result.get("comp_code"), 
                                    (Integer) result.get("permission"),
                                    (Date) result.get("register_date"));
        } else {
            return null;
        }
    }
    
    public Employee findByUsername(String username) {
        String sql = "SELECT * FROM employee WHERE username = ?";
        Map<String, Object> result = db.querySingle(sql, username);
        
        if(result != null) {
            return new Employee((Integer) result.get("id"),
                                (String) result.get("emp_code"), 
                                username, 
                                (String) result.get("password"), 
                                (String) result.get("emp_fname"), 
                                (String) result.get("emp_lanme"), 
                                (String) result.get("emp_address"), 
                                (Integer) result.get("dist_code"), 
                                (Integer) result.get("prov_code"), 
                                (Integer) result.get("emp_postcode"), 
                                (Integer) result.get("emp_landline"), 
                                (Integer) result.get("emp_mobile"), 
                                (Integer) result.get("emp_fax"), 
                                (String) result.get("emp_email"), 
                                (Company) result.get("comp_code"), 
                                (Integer) result.get("permission"),
                                (Date) result.get("register_date"));
        } else {
            return null;
        }
    }
    
    public Employee findByUP(String username, String password) {
        String sql = "SELECT * FROM employee WHERE username = ? AND password = ?";
        Map<String, Object> result = db.querySingle(sql, username, password);
        
        if(result != null) {
            return new Employee((Integer) result.get("id"),
                                (String) result.get("emp_code"), 
                                (String) result.get("username"), 
                                (String) result.get("password"), 
                                (String) result.get("emp_fname"), 
                                (String) result.get("emp_lanme"), 
                                (String) result.get("emp_address"), 
                                (Integer) result.get("dist_code"), 
                                (Integer) result.get("prov_code"), 
                                (Integer) result.get("emp_postcode"), 
                                (Integer) result.get("emp_landline"), 
                                (Integer) result.get("emp_mobile"), 
                                (Integer) result.get("emp_fax"), 
                                (String) result.get("emp_email"), 
                                (Company) result.get("comp_code"), 
                                (Integer) result.get("permission"),
                                (Date) result.get("register_date"));
        } else {
            return null;
        }
    }
}
