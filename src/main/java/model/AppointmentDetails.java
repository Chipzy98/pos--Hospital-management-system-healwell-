package model;

public class AppointmentDetails {

    private String AppID;
    private String Pid;
    private String Pname;
    private String P_Cnum;
    private String D_ID;

    private String appdate;

    public AppointmentDetails(){

    }

    @Override
    public String toString() {
        return "AppointmentDetails{" +
                "AppID='" + AppID + '\'' +
                ", Pid='" + Pid + '\'' +
                ", Pname='" + Pname + '\'' +
                ", P_Cnum='" + P_Cnum + '\'' +
                ", D_ID='" + D_ID + '\'' +
                ", appdate='" + appdate + '\'' +
                '}';
    }

    public String getAppID() {
        return AppID;
    }

    public void setAppID(String appID) {
        AppID = appID;
    }

    public String getPid() {
        return Pid;
    }

    public void setPid(String pid) {
        Pid = pid;
    }

    public String getPname() {
        return Pname;
    }

    public void setPname(String pname) {
        Pname = pname;
    }

    public String getP_Cnum() {
        return P_Cnum;
    }

    public void setP_Cnum(String p_Cnum) {
        P_Cnum = p_Cnum;
    }

    public String getD_ID() {
        return D_ID;
    }

    public void setD_ID(String d_ID) {
        D_ID = d_ID;
    }

    public String getAppdate() {
        return appdate;
    }

    public void setAppdate(String appdate) {
        this.appdate = appdate;
    }

    public AppointmentDetails(String appID, String pid, String pname, String p_Cnum, String d_ID, String appdate) {
        AppID = appID;
        Pid = pid;
        Pname = pname;
        P_Cnum = p_Cnum;
        D_ID = d_ID;
        this.appdate = appdate;
    }
}//last
