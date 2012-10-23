package likitomi.jsp.model;

// @author funkyboyz_book4
import java.util.Date;

public class Customer {

    private int id;
    private String custCode;
    private String username;
    private String password;
    private String fName;
    private String lName;
    private String address;
    private int district;
    private int province;
    private int postcode;
    private int landline;
    private int mobile;
    private int fax;
    private String email;
    private Company compCode;
    private boolean activate;
    private String activateCode;
    private Date registerDate;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCustCode() {
        return custCode;
    }

    public void setCustCode(String custCode) {
        this.custCode = custCode;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getfName() {
        return fName;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public String getlName() {
        return lName;
    }

    public void setlName(String lName) {
        this.lName = lName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getDistrict() {
        return district;
    }

    public void setDistrict(int district) {
        this.district = district;
    }

    public int getProvince() {
        return province;
    }

    public void setProvince(int province) {
        this.province = province;
    }

    public int getPostcode() {
        return postcode;
    }

    public void setPostcode(int postcode) {
        this.postcode = postcode;
    }

    public int getLandline() {
        return landline;
    }

    public void setLandline(int landline) {
        this.landline = landline;
    }

    public int getMobile() {
        return mobile;
    }

    public void setMobile(int mobile) {
        this.mobile = mobile;
    }

    public int getFax() {
        return fax;
    }

    public void setFax(int fax) {
        this.fax = fax;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Company getCompCode() {
        return compCode;
    }

    public void setCompCode(Company compCode) {
        this.compCode = compCode;
    }

    public boolean isActivate() {
        return activate;
    }

    public void setActivate(boolean activate) {
        this.activate = activate;
    }

    public String getActivateCode() {
        return activateCode;
    }

    public void setActivateCode(String activateCode) {
        this.activateCode = activateCode;
    }

    public Date getRegisterDate() {
        return registerDate;
    }

    public void setRegisterDate(Date registerDate) {
        this.registerDate = registerDate;
    }

    public Customer(String custCode, 
                    String username, 
                    String password, 
                    String fName, 
                    String lName, 
                    String address, 
                    int district,
                    int province, 
                    int postcode, 
                    int landline, 
                    int mobile, 
                    int fax, 
                    String email, 
                    Company compCode, 
                    boolean activate, 
                    String activateCode, 
                    Date registerDate) {
        this(0, custCode, 
                username, 
                password, 
                fName, 
                lName, 
                address, 
                district, 
                province, 
                postcode, 
                landline, 
                mobile, 
                fax, 
                email, 
                compCode, 
                activate, 
                activateCode, 
                registerDate);
    }
    
    public Customer(int id, 
                    String custCode, 
                    String username, 
                    String password, 
                    String fName, 
                    String lName, 
                    String address, 
                    int district,
                    int province, 
                    int postcode, 
                    int landline, 
                    int mobile, 
                    int fax, 
                    String email, 
                    Company compCode, 
                    boolean activate, 
                    String activateCode, 
                    Date registerDate) {
        this.id = id;
        this.custCode = custCode;
        this.username = username;
        this.password = password;
        this.fName = fName;
        this.lName = lName;
        this.address = address;
        this.district = district;
        this.province = province;
        this.postcode = postcode;
        this.landline = landline;
        this.mobile = mobile;
        this.fax = fax;
        this.email = email;
        this.compCode = compCode;
        this.activate = activate;
        this.activateCode = activateCode;
        this.registerDate = registerDate;
    }
}
