package likitomi.jsp.model;

// @author funkyboyz_book4

import java.util.Date;

public class Company {
    private int id;
    private String compCode;
    private String compName;
    private String address;
    private int district;
    private int province;
    private int postcode;
    private int landline;
    private int mobile;
    private int fax;
    private String website;
    private Date registerDate;
    private String description;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCompCode() {
        return compCode;
    }

    public void setCompCode(String compCode) {
        this.compCode = compCode;
    }

    public String getCompName() {
        return compName;
    }

    public void setCompName(String compName) {
        this.compName = compName;
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

    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website;
    }

    public Date getRegisterDate() {
        return registerDate;
    }

    public void setRegisterDate(Date registerDate) {
        this.registerDate = registerDate;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    
    public Company(String compCode, 
                   String compName, 
                   String address, 
                   int district, 
                   int province, 
                   int postcode,
                   int landline, 
                   int mobile, 
                   int fax, 
                   String website, 
                   Date registerDate, 
                   String description) {
        this(0, compCode, 
                compName, 
                address, 
                district, 
                province, 
                postcode, 
                landline, 
                mobile, 
                fax, 
                website, 
                registerDate, 
                description);
    }
    
    public Company(int id, 
                   String compCode, 
                   String compName, 
                   String address, 
                   int district, 
                   int province, 
                   int postcode,
                   int landline, 
                   int mobile, 
                   int fax, 
                   String website, 
                   Date registerDate, 
                   String description) {
        this.id = id;
        this.compCode = compCode;
        this.compName = compName;
        this.address = address;
        this.district = district;
        this.province = province;
        this.postcode = postcode;
        this.landline = landline;
        this.mobile = mobile;
        this.fax = fax;
        this.website = website;
        this.registerDate = registerDate;
        this.description = description;
    }
}
