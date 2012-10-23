package likitomi.jsp.model;

// @author funkyboyz_book4
public class ProductType {
    
    public int id;
    public String prodTypeCode;
    public String prodTypeName;
    public String description;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProdTypeCode() {
        return prodTypeCode;
    }

    public void setProdTypeCode(String prodTypeCode) {
        this.prodTypeCode = prodTypeCode;
    }

    public String getProdTypeName() {
        return prodTypeName;
    }

    public void setProdTypeName(String prodTypeName) {
        this.prodTypeName = prodTypeName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    
    public ProductType(String prodTypeCode, String prodTypeName, String description) {
        this(0, prodTypeCode, prodTypeName, description);
    }
    
    public ProductType(int id, String prodTypeCode, String prodTypeName, String description) {
        this.id = id;
        this.prodTypeCode = prodTypeCode;
        this.prodTypeName = prodTypeName;
        this.description = description;
    }
}
