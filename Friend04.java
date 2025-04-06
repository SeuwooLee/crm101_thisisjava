package Crm101Practice;

public class Friend04 {
    private String name;
    private String phone;
    private String email;

    public Friend04() {
    }

    public Friend04(String name, String phone, String email) {
        this.name = name;
        this.phone = phone;
        this.email = email;
    }

    public void showInfo() {
        System.out.println(name + " " + phone + " " + email);
    }

    public String getName() {
        return name;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
