package tasks;


public class Login{

    private static Login onlyInstance;

    public Login getOnlyInstance(){
        System.out.println("getOnlyInstance method called.");
        return onlyInstance;
    }
}