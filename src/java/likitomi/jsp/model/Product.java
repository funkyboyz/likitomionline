package likitomi.jsp.model;

// @author funkyboyz_book4
public class Product {

    private int id;
    private String prodCode;
    private String prodName;
    private ProductType prodTypeCode;
    private String flute;
    private String df;
    private String bm;
    private String bl;
    private String cm;
    private String cl;
    private int length;
    private int width;
    private int height;
    private int qtySet;
    private String inkColor;
    private String boxStyle;
    private int qtyLevel;
    private int paperWidth;
    private double price;
    private int stock;
    private Company compCode;
    private String description;

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProdCode() {
        return prodCode;
    }

    public void setProdCode(String prodCode) {
        this.prodCode = prodCode;
    }

    public String getProdName() {
        return prodName;
    }

    public void setProdName(String prodName) {
        this.prodName = prodName;
    }

    public ProductType getProdTypeCode() {
        return prodTypeCode;
    }

    public void setProdTypeCode(ProductType prodTypeCode) {
        this.prodTypeCode = prodTypeCode;
    }

    public String getFlute() {
        return flute;
    }

    public void setFlute(String flute) {
        this.flute = flute;
    }

    public String getDf() {
        return df;
    }

    public void setDf(String df) {
        this.df = df;
    }

    public String getBm() {
        return bm;
    }

    public void setBm(String bm) {
        this.bm = bm;
    }

    public String getBl() {
        return bl;
    }

    public void setBl(String bl) {
        this.bl = bl;
    }

    public String getCm() {
        return cm;
    }

    public void setCm(String cm) {
        this.cm = cm;
    }

    public String getCl() {
        return cl;
    }

    public void setCl(String cl) {
        this.cl = cl;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getQtySet() {
        return qtySet;
    }

    public void setQtySet(int qtySet) {
        this.qtySet = qtySet;
    }

    public String getInkColor() {
        return inkColor;
    }

    public void setInkColor(String inkColor) {
        this.inkColor = inkColor;
    }

    public String getBoxStyle() {
        return boxStyle;
    }

    public void setBoxStyle(String boxStyle) {
        this.boxStyle = boxStyle;
    }

    public int getQtyLevel() {
        return qtyLevel;
    }

    public void setQtyLevel(int qtyLevel) {
        this.qtyLevel = qtyLevel;
    }

    public int getPaperWidth() {
        return paperWidth;
    }

    public void setPaperWidth(int paperWidth) {
        this.paperWidth = paperWidth;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Company getCompCode() {
        return compCode;
    }

    public void setCompCode(Company compCode) {
        this.compCode = compCode;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Product(String prodCode,
            String prodName,
            ProductType prodTypeCode,
            String flute,
            String df,
            String bm,
            String bl,
            String cm,
            String cl,
            int length,
            int width,
            int height,
            int qtySet,
            String inkColor,
            String boxStyle,
            int qtyLevel,
            int paperWidth,
            double price,
            int stock,
            Company compCode,
            String description) {
        this(0, prodCode,
                prodName,
                prodTypeCode,
                flute,
                df,
                bm,
                bl,
                cm,
                cl,
                length,
                width,
                height,
                qtySet,
                inkColor,
                boxStyle,
                qtyLevel,
                paperWidth,
                price,
                stock,
                compCode,
                description);
    }

    public Product(int id,
            String prodCode,
            String prodName,
            ProductType prodTypeCode,
            String flute,
            String df,
            String bm,
            String bl,
            String cm,
            String cl,
            int length,
            int width,
            int height,
            int qtySet,
            String inkColor,
            String boxStyle,
            int qtyLevel,
            int paperWidth,
            double price,
            int stock,
            Company compCode,
            String description) {
        this.id = id;
        this.prodCode = prodCode;
        this.prodName = prodName;
        this.prodTypeCode = prodTypeCode;
        this.flute = flute;
        this.df = df;
        this.bm = bm;
        this.bl = bl;
        this.cm = cm;
        this.cl = cl;
        this.length = length;
        this.width = width;
        this.height = height;
        this.qtySet = qtySet;
        this.inkColor = inkColor;
        this.boxStyle = boxStyle;
        this.qtyLevel = qtyLevel;
        this.paperWidth = paperWidth;
        this.price = price;
        this.stock = stock;
        this.compCode = compCode;
        this.description = description;
    }
}
