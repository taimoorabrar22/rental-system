package entity;

public abstract class User {

    protected String firstName;
    protected String lastName;
    protected String passWord;
    protected String email;
    protected String userType;
    protected static int globalUserID = 0;
    protected int userID;

    protected int increment() {
        return globalUserID++;
    }

}
