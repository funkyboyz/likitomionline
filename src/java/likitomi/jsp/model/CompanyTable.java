package likitomi.jsp.model;

// @author funkyboyz_book4

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

public class CompanyTable {
    private Database db;
    
    public CompanyTable(Database db) {
        this.db = db;
    }
    
    public void add(Company company) {
        String sql = "INSERT INTO company(comp_code, comp_name, comp_address, dist_code, prov_code, comp_postcode, comp_landline, comp_mobile, "
                + "comp_fax, comp_website, register_date, description) "
                + "VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
        int id = db.add(sql, company.getCompCode(),
                             company.getCompName(),
                             company.getAddress(),
                             company.getDistrict(),
                             company.getProvince(),
                             company.getPostcode(),
                             company.getLandline(),
                             company.getMobile(),
                             company.getFax(),
                             company.getWebsite(),
                             company.getRegisterDate(),
                             company.getDescription());
        company.setId(id);
    }
    
    public void update(Company company) {
        String sql = "UPDATE company "
                + "SET comp_code = ?, comp_name = ?, comp_address = ?, dist_code = ?, prov_code = ?, comp_postcode = ?, comp_landline = ?, "
                + "comp_mobile = ?, comp_fax = ?, comp_website = ?, register_date = ?, description = ? "
                + "WHERE id = ?";
        db.update(sql, company.getCompCode(),
                       company.getCompName(),
                       company.getAddress(),
                       company.getDistrict(),
                       company.getProvince(),
                       company.getPostcode(),
                       company.getLandline(),
                       company.getMobile(),
                       company.getFax(),
                       company.getWebsite(),
                       company.getRegisterDate(),
                       company.getDescription());
    }
    
    public void remove(int id) {
        String sql = "DELETE FROM company "
                + "WHERE id = ?";
        db.remove(sql, id);
    }
    
    public Company findById(int id) {
        String sql = "SELECT * FROM company WHERE id = ?";
        Map<String, Object> result = db.querySingle(sql, id);
        
        return new Company(id, (String) result.get("comp_code"), 
                               (String) result.get("comp_name"), 
                               (String) result.get("comp_address"), 
                               (Integer) result.get("dist_code"), 
                               (Integer) result.get("prov_code"), 
                               (Integer) result.get("postcode"), 
                               (Integer) result.get("landline"), 
                               (Integer) result.get("mobile"), 
                               (Integer) result.get("fax"), 
                               (String) result.get("website"), 
                               (Date) result.get("register_date"),
                               (String) result.get("description"));
    }
    
    public List<Company> findByKeyword(String keyword, int start, int size) {
        List<Company> list = new ArrayList<Company>();
        String sql = "SELECT * FROM company "
                + "WHERE comp_code LIKE ? OR comp_name LIKE ? OR website LIKE ? "
                + "ORDER BY comp_name "
                + "LIMIT " + start + ", " + size;
        
        List<Map<String, Object>> result;
        result = db.queryList(sql, "%" + keyword + "%",
                                   "%" + keyword + "%");
        
        for(Map<String, Object> row : result) {
            Company company = new Company(
                    (Integer) row.get("id"),
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
            list.add(company);
        }
        return list;
    }
    
    public int getSize() {
        String sql = "SELECT COUNT(*) FROM company";
        Map<String, Object> result = db.querySingle(sql);
        
        return ((Long) result.get("COUNT(*)")).intValue();
    }
    
    public List<Company> findAll() {
        return findByKeyword("", 0, getSize());
    }
}
