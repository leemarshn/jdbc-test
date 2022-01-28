/**
 * @author - LeeN
 * PROJECT NAME: JDBCTESTS
 * CREATED ON: Friday 28 January 2022 - 6:16 AM
 */
public class User {
    private int id;
    private String first_name;
    private String last_name;
    private int national_id;
    private String phone_number;
    private String email_address;


    public User(int id, String first_name, String last_name, int national_id, String phone_number, String email_address) {
        this.id = id;
        this.first_name = first_name;
        this.last_name = last_name;
        this.national_id = national_id;
        this.phone_number = phone_number;
        this.email_address = email_address;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public int getNational_id() {
        return national_id;
    }

    public void setNational_id(int national_id) {
        this.national_id = national_id;
    }

    public String getPhone_number() {
        return phone_number;
    }

    public void setPhone_number(String phone_number) {
        this.phone_number = phone_number;
    }

    public String getEmail_address() {
        return email_address;
    }

    public void setEmail_address(String email_address) {
        this.email_address = email_address;
    }
}
