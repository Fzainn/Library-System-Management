package libaray;

public class user
{
    // attributes
    protected String name;
    protected String email;
    protected String phoneNumber;
    protected IOOperation [] operations; // operations array holds Obj  that represent different operation, each Obj in this array has method called oper()
            //declares a protected member variable named operations of type IOOperation.
            // This means that this field can be accessed by classes in the same package and by subclasses of the class where it's defined.

    public user(String name) {}// non-parametric constructor

    public user(String name, String email, String phoneNumber) {
        this.name = name;
        this.email = email;
        this.phoneNumber = phoneNumber;
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

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }



     public void menue(Database database, user user){};
}
