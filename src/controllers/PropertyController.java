
package controllers;

import tasks.*;
import java.sql.*;
import java.util.*;

public class PropertyController extends DBController {

    private ArrayList<Property> properties = new ArrayList<Property>();

    public PropertyController() {

        initializeConnection();

    }

    public void setProperty(Property property) {

        try {

            String query = "INSERT INTO property (propertyID, landLordID, address, type, bedrooms, bathrooms, furnished, quadrant, status, submitted, expiry)"
                    + " VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";

            PreparedStatement stmt = dbConnect.prepareStatement(query);
            stmt.setInt(1, property.getPropertyID());
            stmt.setInt(2, property.getLandlordID());
            stmt.setString(3, property.getAddress());
            stmt.setString(4, property.getType());
            stmt.setInt(5, property.getBedandBath()[0]);
            stmt.setInt(6, property.getBedandBath()[1]);
            stmt.setInt(7, property.getFurnished());
            stmt.setString(8, property.getQuadrant());
            stmt.setString(9, property.getStatus());
            stmt.setDate(10, property.getSubmitted());
            stmt.setDate(11, property.getExpiry());

            stmt.execute();
            stmt.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }

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

    public static void main(String[] args) {

        PropertyController p = new PropertyController();
        Property prop = new Property(0, 0, "123 street", "Apartment", 2, 1, 1, "NW");

        p.setProperty(prop);

    }

}