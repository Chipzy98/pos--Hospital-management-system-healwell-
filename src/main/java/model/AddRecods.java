package model;


public class AddRecods {

    private String RecodeID;
    private String p_ID;
    private String PID;
    private String p_name;
    private String d_name;
    private String diagnisis;
    private String result;
    private String Treat;

    public AddRecods() {
        
    }

    @Override
    public String toString() {
        return "AddRecods{" +
                "RecodeID='" + RecodeID + '\'' +
                ", p_ID='" + p_ID + '\'' +
                ", PID='" + PID + '\'' +
                ", p_name='" + p_name + '\'' +
                ", d_name='" + d_name + '\'' +
                ", diagnisis='" + diagnisis + '\'' +
                ", result='" + result + '\'' +
                ", Treat='" + Treat + '\'' +
                '}';
    }

    public String getRecodeID() {
        return RecodeID;
    }

    public void setRecodeID(String recodeID) {
        RecodeID = recodeID;
    }

    public String getP_ID() {
        return p_ID;
    }

    public void setP_ID(String p_ID) {
        this.p_ID = p_ID;
    }

    public String getPID() {
        return PID;
    }

    public void setPID(String PID) {
        this.PID = PID;
    }

    public String getP_name() {
        return p_name;
    }

    public void setP_name(String p_name) {
        this.p_name = p_name;
    }

    public String getD_name() {
        return d_name;
    }

    public void setD_name(String d_name) {
        this.d_name = d_name;
    }

    public String getDiagnisis() {
        return diagnisis;
    }

    public void setDiagnisis(String diagnisis) {
        this.diagnisis = diagnisis;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public String getTreat() {
        return Treat;
    }

    public void setTreat(String treat) {
        Treat = treat;
    }

    public AddRecods(String recodeID, String p_ID, String PID, String p_name, String d_name, String diagnisis, String result, String treat) {
        RecodeID = recodeID;
        this.p_ID = p_ID;
        this.PID = PID;
        this.p_name = p_name;
        this.d_name = d_name;
        this.diagnisis = diagnisis;
        this.result = result;
        Treat = treat;
    }
}//last
