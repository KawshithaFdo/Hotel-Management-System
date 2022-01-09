package view.tm;

public class CustomerTM {
    private String name;
    private String nic;
    private String contact;
    private String email;
    private String address;
    private String sdate;
    private String edate;
    private String price;

    public CustomerTM() {
    }

    public CustomerTM(String name, String nic, String contact, String email, String address, String sdate, String edate, String price) {
        this.setName(name);
        this.setNic(nic);
        this.setContact(contact);
        this.setEmail(email);
        this.setAddress(address);
        this.setSdate(sdate);
        this.setEdate(edate);
        this.setPrice(price);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNic() {
        return nic;
    }

    public void setNic(String nic) {
        this.nic = nic;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getSdate() {
        return sdate;
    }

    public void setSdate(String sdate) {
        this.sdate = sdate;
    }

    public String getEdate() {
        return edate;
    }

    public void setEdate(String edate) {
        this.edate = edate;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }
}
