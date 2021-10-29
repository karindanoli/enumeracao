package java2;


import java.text.SimpleDateFormat;
import java.util.Date;

public class Cliente {

    private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy"); // um só para todos os clientes por isso static

private String name;
private String email;
private Date birthDate;

    public Cliente (String name, String email, Date birthDate) {
        this.name = name;
        this.email = email;
        this.birthDate = birthDate;
    }

    public Cliente() {
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

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    @Override
    public String toString() {
        return  name + " (" + sdf.format(birthDate) +") - "  + email;
    }
}
