package likitomi.jsp.model;

// @author funkyboyz_book4
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

public class ProductTable {

    private Database db;

    public ProductTable(Database db) {
        this.db = db;
    }

    public void add(Product product) {
        String sql = "INSERT INTO product(prod_code, prod_name, prod_type_code, flute, df, bm, bl, cm, cl, length, width, height, "
                + "qty_set, ink_color, box_syle, qty_level, paper_width, price, comp_code, description) "
                + "VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";

        int id = db.add(sql, product.getProdCode(),
                product.getProdName(),
                product.getProdTypeCode(),
                product.getFlute(),
                product.getDf(),
                product.getBm(),
                product.getBl(),
                product.getCm(),
                product.getCl(),
                product.getLength(),
                product.getWidth(),
                product.getHeight(),
                product.getQtySet(),
                product.getInkColor(),
                product.getBoxStyle(),
                product.getQtyLevel(),
                product.getPaperWidth(),
                product.getPrice(),
                product.getCompCode(),
                product.getDescription());
        product.setId(id);
    }

    public void update(Product product) {
        String sql = "UPDATE product "
                + "SET prod_code = ?, prod_name = ?, prod_type_code = ?, flute = ?, df = ?, bm = ?, bl = ?, cm = ?, cl = ? "
                + "length = ?, width = ?, height = ?, qty_set = ?, ink_color = ?, box_style = ?, qty_level = ?, paper_width = ? "
                + "price = ?, comp_code = ?, description = ? "
                + "WHERE id = ?";
        db.update(sql, product.getProdCode(),
                product.getProdName(),
                product.getProdTypeCode(),
                product.getFlute(),
                product.getDf(),
                product.getBm(),
                product.getBl(),
                product.getCm(),
                product.getCl(),
                product.getLength(),
                product.getWidth(),
                product.getHeight(),
                product.getQtySet(),
                product.getInkColor(),
                product.getBoxStyle(),
                product.getQtyLevel(),
                product.getPaperWidth(),
                product.getPrice(),
                product.getCompCode(),
                product.getDescription());
    }

    public void remove(int id) {
        String sql = "DELETE FROM product "
                + "WHERE id = ?";
        db.remove(sql, id);
    }

    public Product findById(int id) {
        String sql = "SELECT * FROM product WHERE id = ?";
        Map<String, Object> result = db.querySingle(sql, id);

        return new Product(id,
                (String) result.get("prod_code"),
                (String) result.get("prod_name"),
                (ProductType) result.get("prod_type_code"),
                (String) result.get("flute"),
                (String) result.get("df"),
                (String) result.get("bm"),
                (String) result.get("bl"),
                (String) result.get("cm"),
                (String) result.get("cl"),
                (Integer) result.get("length"),
                (Integer) result.get("width"),
                (Integer) result.get("height"),
                (Integer) result.get("qty_set"),
                (String) result.get("ink_color"),
                (String) result.get("box_style"),
                (Integer) result.get("qty_level"),
                (Integer) result.get("paper_width"),
                (Double) result.get("price"),
                (Integer) result.get("stock"),
                (Company) result.get("comp_code"),
                (String) result.get("description"));
    }

    public List<Product> findByKeyword(String keyword, int start, int size) {
        List<Product> list = new ArrayList<Product>();
        String sql = "SELECT * FROM product "
                + "WHERE prod_code LIKE ? OR prod_name LIKE ? OR box_style LIKE ? "
                + "ORDER BY prod_name "
                + "LIMIT " + start + ", " + size;

        List<Map<String, Object>> result;
        result = db.queryList(sql, "%" + keyword + "%",
                                   "%" + keyword + "%");

        for (Map<String, Object> row : result) {
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

            ProductType productType = new ProductType(
                    (Integer) row.get("id"),
                    (String) row.get("prod_type_code"),
                    (String) row.get("prod_type_name"),
                    (String) row.get("description"));

            Product product = new Product(
                    (Integer) row.get("id"),
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
            list.add(product);
        }
        return list;
    }

    public int getSize() {
        String sql = "SELECT COUNT(*) FROM product";
        Map<String, Object> result = db.querySingle(sql);

        return ((Long) result.get("COUNT(*)")).intValue();
    }

    public List<Product> findAll() {
        return findByKeyword("", 0, getSize());
    }
}
