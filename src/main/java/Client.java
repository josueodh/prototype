import java.util.Date;

public class Client implements  Cloneable{
    private String name;
    private String email;
    private Date born_date;
    private String phone_number;
    private Nps nps;

    public Client(String name, String email, Date born_date, String phone_number, Nps nps){
        this.name = name;
        this.email = email;
        this.born_date = born_date;
        this.phone_number = phone_number;
        this.nps = nps;
    }

    public Nps getNps() {
        return nps;
    }

    public void setNps(Nps nps) {
        this.nps = nps;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getBorn_date() {
        return born_date;
    }

    public void setBorn_date(Date born_date) {
        this.born_date = born_date;
    }

    public String getPhone_number() {
        return phone_number;
    }

    public void setPhone_number(String phone_number) {
        this.phone_number = phone_number;
    }

    @Override
    public Client clone() throws CloneNotSupportedException{
        Client clientClone = (Client) super.clone();
        clientClone.nps = (Nps) clientClone.nps.clone();
        return clientClone;
    }

    @Override
    public String toString(){
        return "Name: " + name + '\'' + "Email: " + email + '\'' + "Phone: " + phone_number + '\'' + "Born Date: " + born_date +  '\'' + "NPS: " + nps.getNps();
    }
}
