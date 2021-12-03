package controllers;

import java.sql.*;

public abstract class DBController {

    protected String USERNAME = "root";
    protected String PASSWORD = "slammer1";
    protected String DBURL = "jdbc:mysql://127.0.0.1:3306/rentalsystem";
    protected Connection dbConnect;

    abstract void initializeConnection();

    abstract void close();

}