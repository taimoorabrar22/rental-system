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

    public void addUser(){
        System.out.println("addUser method called.");
    }

    public boolean verifyUser(User user){
        return true;
    }
}
