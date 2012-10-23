package likitomi.jsp.model;

// @author funkyboyz_book4
public class Item extends Product {
    private int amount;

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }
    
    public Item(Product product, int amount) {
        this(product.getId(),
             product.getProdCode(),
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
             product.getStock(),
             product.getCompCode(),
             product.getDescription(),
             amount);
    }
    
    public Item(int id,
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
            String description,
            int amount) {
        super(prodCode, 
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
        this.amount = amount;
    }
}
