package entity;

import tasks.*;

public class LandLord extends User {

    private Property property;

    public LandLord(String firstName, String lastName, String password, String email) {

        this.firstName = firstName;
        this.lastName = lastName;
        this.passWord = password;
        this.email = email;
        this.userID = increment();
        this.userType = "landlord";
    }

    public void listProperty(int propertyID, String address, String type, int bed, int bath,
            int furnished, String quadrant, Boolean feePaid) {

        this.property = new Property(propertyID, this.userID, address, type, bed, bath, furnished, quadrant);
        property.addProperty(feePaid);

    }

    public void updateStatus(String status) {

        property.updateStatus(status);
    }

    public void removeProperty() {
        property.removeProperty();
    }

}
