import java.time.LocalDate;

public class BiebLid {

    private String name;
    private String email;
    private LocalDate birthday;
    private String lidNumber;


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

    public LocalDate getBirthday() {
        return birthday;
    }

    public void setBirthday(LocalDate birthday) {
        this.birthday = birthday;
    }

    public String getLidNumber() {
        return lidNumber;
    }

    public void setLidNumber(String lidNumber) {
        this.lidNumber = lidNumber;
    }
}
