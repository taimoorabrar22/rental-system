package tasks;

import java.sql.Date;
import java.util.Calendar;

import controllers.*;

public class Property {

    private int propertyID;
    private int landLordID;
    private String address;
    private String type;
    private int bedrooms;
    private int bathrooms;
    private int furnished;
    private String quadrant;
    private String status;
    private java.sql.Date submitted;
    private java.sql.Date expiry;
    private PropertyController propertyController;

    // constructor
    public Property(int propertyID, int landLordID, String address, String type, int bed, int bath,
            int furnished, String quadrant) {

        this.propertyID = propertyID;
        this.landLordID = landLordID;
        this.address = address;
        this.type = type;
        this.bedrooms = bed;
        this.bathrooms = bath;
        this.furnished = furnished;
        this.quadrant = quadrant;
        this.status = "Active";

        Calendar calendar = Calendar.getInstance();
        this.submitted = new java.sql.Date(System.currentTimeMillis());
        calendar.add(Calendar.MONTH, 1);
        this.expiry = new java.sql.Date(calendar.getTimeInMillis());

    }

    public void addProperty(Boolean feePaid) {

        if (feePaid) {

            propertyController.addProperty(this);

        } else {

            return;
        }

    }

    public void updateStatus(String status) {

        propertyController.updateStatus(this.propertyID, status);

    }

    public void removeProperty() {
        propertyController.removeProperty(this.propertyID);
    }

    // getters
    public int getPropertyID() {
        return this.propertyID;
    }

    public int getLandlordID() {
        return this.landLordID;
    }

    public String getAddress() {
        return this.address;
    }

    public String getType() {
        return this.type;
    }

    public int[] getBedandBath() {

        int[] temp = { this.bedrooms, this.bathrooms };

        return temp;

    }

    public int getFurnished() {
        return this.furnished;
    }

    public String getQuadrant() {

        return this.quadrant;

    }

    public String getStatus() {
        return this.status;
    }

    public Date getSubmitted() {
        return this.submitted;
    }

    public Date getExpiry() {
        return this.expiry;
    }

}
