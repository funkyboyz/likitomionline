package likitomi.jsp.model;

// @author funkyboyz_book4
public class Page {
    private int numItem;
    private int pageNo;
    private int pageSize;
    
    public Page(int numItem, int pageNo, int pageSize) {
        this.numItem = numItem;
        this.pageNo = pageNo;
        this.pageSize = pageSize;
    }
    
    public int getFromIndex() {
        return pageNo * pageSize;
    }
    
    public int getToIndex() {
        return Math.min((pageNo + 1) * pageSize, numItem);
    }
    
    public int size() {
        return (int) Math.ceil((double) numItem/pageSize);
    }
}
