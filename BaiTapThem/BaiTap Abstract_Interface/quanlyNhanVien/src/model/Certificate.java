package model;

import java.util.Date;

public class Certificate {
    private long certificatedID;
    private String certificatedName;
    private String certificatedRank;
    private Date certificatedDate;

    public Certificate(long certificatedID, String certificatedName, String certificatedRank, Date certificatedDate) {
        this.certificatedID = certificatedID;
        this.certificatedName = certificatedName;
        this.certificatedRank = certificatedRank;
        this.certificatedDate = certificatedDate;
    }

    public long getCertificatedID() {
        return certificatedID;
    }

    public void setCertificatedID(long certificatedID) {
        this.certificatedID = certificatedID;
    }

    public String getCertificatedName() {
        return certificatedName;
    }

    public void setCertificatedName(String certificatedName) {
        this.certificatedName = certificatedName;
    }

    public String getCertificatedRank() {
        return certificatedRank;
    }

    public void setCertificatedRank(String certificatedRank) {
        this.certificatedRank = certificatedRank;
    }

    public Date getCertificatedDate() {
        return certificatedDate;
    }

    public void setCertificatedDate(Date certificatedDate) {
        this.certificatedDate = certificatedDate;
    }
}
