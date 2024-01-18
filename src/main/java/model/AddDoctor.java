package model;

public class AddDoctor {
    private String doctorID;
    private String doctorName;
    private String dDepartment;

    public AddDoctor(){

    }

    @Override
    public String toString() {
        return "AddDoctor{" +
                "doctorID='" + doctorID + '\'' +
                ", doctorName='" + doctorName + '\'' +
                ", dDepartment='" + dDepartment + '\'' +
                '}';
    }

    public String getDoctorID() {
        return doctorID;
    }

    public void setDoctorID(String doctorID) {
        this.doctorID = doctorID;
    }

    public String getDoctorName() {
        return doctorName;
    }

    public void setDoctorName(String doctorName) {
        this.doctorName = doctorName;
    }

    public String getdDepartment() {
        return dDepartment;
    }

    public void setdDepartment(String dDepartment) {
        this.dDepartment = dDepartment;
    }

    public AddDoctor(String doctorID, String doctorName, String dDepartment) {
        this.doctorID = doctorID;
        this.doctorName = doctorName;
        this.dDepartment = dDepartment;
    }
}
