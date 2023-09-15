import java.util.Date;

public class CustomerClass {
    long customerId;
    String firstName;

    String lastName;

    Date dob;
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }

    public void setCustomerId(long cId){
        customerId = cId;
    }

    public long getCustomerId(){
        return this.customerId;
    }

    CustomerClass(String firstName){
        firstName = firstName;
    }

    public void display(){
        System.out.println("Name"+this.firstName);
    }
}
