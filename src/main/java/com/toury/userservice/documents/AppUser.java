package com.toury.userservice.documents;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.management.ConstructorParameters;
import java.util.Date;

@Document("app_users")
public class AppUser {
    @Id
    private String id;

    private String userName;
    private String password;
    private boolean isActive;
    private String displayName;
    private String email;
    private String contactNumber;
    private Date dateOfBirth;
    private String firstName;
    private String middleName;
    private String lastName;
    private String identificationNumber;
    private String countryCode;
    private String houseNumber;
    private String addressStreet1;
    private String addressStreet2;
    private String city;
    private int postalCode;

    public AppUser(String id, String userName, String password, boolean isActive, String displayName, String email, String contactNumber, Date dateOfBirth, String firstName, String middleName, String lastName, String identificationNumber, String countryCode, String houseNumber, String addressStreet1, String addressStreet2, String city, int postalCode) {
        this.id = id;
        this.userName = userName;
        this.password = password;
        this.isActive = isActive;
        this.displayName = displayName;
        this.email = email;
        this.contactNumber = contactNumber;
        this.dateOfBirth = dateOfBirth;
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.identificationNumber = identificationNumber;
        this.countryCode = countryCode;
        this.houseNumber = houseNumber;
        this.addressStreet1 = addressStreet1;
        this.addressStreet2 = addressStreet2;
        this.city = city;
        this.postalCode = postalCode;
    }
}
