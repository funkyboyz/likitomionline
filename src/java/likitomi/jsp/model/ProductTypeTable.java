package likitomi.jsp.model;

// @author funkyboyz_book4

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class ProductTypeTable {
    
    private Database db;
    
    public ProductTypeTable(Database db) {
        this.db = db;
    }
    
    public void add(ProductType productType) {
        String sql = "INSERT INTO product_type(prod_type_code, prod_type_name, description) "
                + "VALUES(?, ?, ?)";
        int id = db.add(sql, productType.prodTypeCode,
                productType.prodTypeName,
                productType.description);
        productType.setId(id);
    }
    
    public void update(ProductType productType) {
        String sql = "UPDATE product_type "
                + "SET prod_type_code = ?, prod_type_name = ?, description = ? "
                + "WHERE id = ?";
        int id = db.update(sql, productType.getProdTypeCode(),
                productType.getProdTypeName(),
                productType.getDescription());
    }
    
    public void remove(int id) {
        String sql = "DELETE FROM product_type "
                + "WHERE id = ?";
        db.remove(sql, id);
    }
    
    public ProductType findById(int id) {
        String sql = "SELECT * FROM product_type WHERE id = ?";
        Map<String, Object> result = db.querySingle(sql, id);
        
        return new ProductType(id, (String) result.get("prod_type_code"),
                (String) result.get("prod_type_name"),
                (String) result.get("description"));
    }
    
    public List<ProductType> findByKeyword(String keyword, int start, int size) {
        List<ProductType> list = new ArrayList<ProductType>();
        String sql = "SELECT * FROM product_type "
                + "WHERE prod_type_code LIKE ? OR prod_type_name LIKE ? "
                + "ORDER BY prod_type_code "
                + "LIMIT " + start + ", " + size;
        
        List<Map<String, Object>> result;
        result = db.queryList(sql, "%" + keyword + "%",
                                   "%" + keyword + "%");
        
        for(Map<String, Object> row : result) {
            ProductType productType = new ProductType((String) row.get("prod_type_code"),
                                                      (String) row.get("prod_type_name"),
                                                      (String) row.get("description"));
            list.add(productType);
        }
        return list;
    }
    
    public int getSize() {
        String sql = "SELECT COUNT(*) FROM product_type";
        Map<String, Object> result = db.querySingle(sql);
        
        return ((Long) result.get("COUNT(*)")).intValue();
    }
    
    public List<ProductType> findAll() {
        return findByKeyword("", 0, getSize());
    }
}
