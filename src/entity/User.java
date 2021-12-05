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

    public String getFirstName(){
        return this.firstName;
    }

    public String getLastName(){
        return this.lastName;
    }

    public String getPassWord(){
        return this.passWord;
    }

    public String getEmail(){
        return this.email;
    }

    public String getUserType(){
        return this.userType;
    }

    public int getUserId(){
        return this.userID;
    }

}
