package model;

import java.util.Date;

public class PatientDetails {
    private String today;
    private String id;
    private String name;
    private String dob;
    private String cnumber;
    private String gender;
    private String address;

    public PatientDetails(String today, String id, String name, String dob, String cnumber, String gender, String address) {
        this.today = today;
        this.id = id;
        this.name = name;
        this.dob = dob;
        this.cnumber = cnumber;
        this.gender = gender;
        this.address = address;
    }

    public PatientDetails() {

    }

    @Override
    public String toString() {
        return "PatientDetails{" +
                "today='" + today + '\'' +
                ", id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", dob='" + dob + '\'' +
                ", cnumber='" + cnumber + '\'' +
                ", gender='" + gender + '\'' +
                ", address='" + address + '\'' +
                '}';
    }

    public String getToday() {
        return today;
    }

    public void setToday(String today) {
        this.today = today;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public String getCnumber() {
        return cnumber;
    }

    public void setCnumber(String cnumber) {
        this.cnumber = cnumber;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
