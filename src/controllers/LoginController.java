package controllers;

import entity.*;
import java.sql.*;


public class LoginController extends DBController {

    public LoginController(){
        initializeConnection();
    }

    public void initializeConnection() {
        try {
            this.dbConnect = DriverManager.getConnection(DBURL, USERNAME, PASSWORD);
            System.out.println("Connection established!\n");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void close() {
        try {
            dbConnect.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void addUser(User user){
        System.out.println("addUser method called.");

        try{
            String query = "INSERT INTO user (userID, Email, Password, FirstName, LastName, userType)"
                    + " VALUES (?, ?, ?, ?, ?, ?)";
            PreparedStatement stmt = dbConnect.prepareStatement(query);
            
            stmt.setInt(1, user.getUserId());
            stmt.setString(2, user.getEmail());
            stmt.setString(3, user.getPassWord());
            stmt.setString(4, user.getFirstName());
            stmt.setString(5, user.getLastName());
            stmt.setString(6, user.getUserType());

            stmt.execute();
            stmt.close();
        }catch(SQLException e){
            e.printStackTrace();
        }
        
        
        //Need to figure out how to access data from user.
    }

    public boolean verifyUser(User user){
        return true;
    }

    public static void main(String[] args){
        LoginController lc = new LoginController();
        User user = new LandLord("Cedric", "Acierto", "1234", "bababa@gmail.com");

        lc.addUser(user);
    }
}
