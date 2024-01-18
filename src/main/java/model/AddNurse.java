package model;

public class AddNurse {
    private String NID;
    private String Nname;
    private String Ndepart;
    private String wardnum;

    public AddNurse(){

    }

    @Override
    public String toString() {
        return "AddNurse{" +
                "NID='" + NID + '\'' +
                ", Nname='" + Nname + '\'' +
                ", Ndepart='" + Ndepart + '\'' +
                ", wardnum='" + wardnum + '\'' +
                '}';
    }

    public String getNID() {
        return NID;
    }

    public void setNID(String NID) {
        this.NID = NID;
    }

    public String getNname() {
        return Nname;
    }

    public void setNname(String nname) {
        Nname = nname;
    }

    public String getNdepart() {
        return Ndepart;
    }

    public void setNdepart(String ndepart) {
        Ndepart = ndepart;
    }

    public String getWardnum() {
        return wardnum;
    }

    public void setWardnum(String wardnum) {
        this.wardnum = wardnum;
    }

    public AddNurse(String NID, String nname, String ndepart, String wardnum) {
        this.NID = NID;
        this.Nname = nname;
        this.Ndepart = ndepart;
        this.wardnum = wardnum;
    }
}
