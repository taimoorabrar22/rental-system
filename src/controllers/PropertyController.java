package controllers;

import java.sql.*;
import java.util.*;

public class PropertyController extends DBController {

    public PropertyController() {
        initializeConnection();

    }

    public void getAllProperty() {

        try {

            DatabaseMetaData d = dbConnect.getMetaData();
            ResultSet r = d.getTables("rentalsystem", null, "%", null);

            while (r.next()) {
                if (r.getString(2).equalsIgnoreCase("property")) {
                    System.out.println(r.getString(3));
                }
            }

        } catch (SQLException e) {

            e.printStackTrace();

        }

    }

    public void initializeConnection() {

        try {

            this.dbConnect = DriverManager.getConnection(DBURL, USERNAME, PASSWORD);
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

    public static void main(String[] args) {

        PropertyController p = new PropertyController();

        p.getAllProperty();

    }

}