package com.stackroute.domain;

import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBAutoGenerateStrategy;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBGeneratedUuid;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBHashKey;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBTable;

@DynamoDBTable(tableName = "UserDetails")
public class UserDetails {

//    @DynamoDBGeneratedUuid(DynamoDBAutoGenerateStrategy.CREATE)
    private int id;
    private String name;
    private String gender;
    private String contactNumber;

    /*Default constructor*/
    public UserDetails() {
    }

    /*Parameterized constructor*/
    public UserDetails(int id, String name, String gender, String contactNumber) {
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.contactNumber = contactNumber;
    }

    /*Getters and Setters*/

    @DynamoDBHashKey(attributeName = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @DynamoDBHashKey(attributeName = "name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @DynamoDBHashKey(attributeName = "gender")
    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    @DynamoDBHashKey(attributeName = "contactNumber")
    public String getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }

    @Override
    public String toString() {
        return "UserDetails{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", contactNumber='" + contactNumber + '\'' +
                '}';
    }
}
