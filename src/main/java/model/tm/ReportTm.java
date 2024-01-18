package model.tm;

import javafx.scene.control.Button;

public class ReportTm {

    private String RecodeID;
    private String p_name;
    private String d_name;
    private String diagnisis;
    private String result;
    private String Treat;

    public ReportTm() {
    }

    public ReportTm(String recodeID, String p_name, String d_name, String diagnisis, String result, String treat) {
        RecodeID = recodeID;
        this.p_name = p_name;
        this.d_name = d_name;
        this.diagnisis = diagnisis;
        this.result = result;
        Treat = treat;
    }

    @Override
    public String toString() {
        return "ReportTm{" +
                "RecodeID='" + RecodeID + '\'' +
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
}
