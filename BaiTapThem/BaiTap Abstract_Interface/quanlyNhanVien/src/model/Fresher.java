package model;

import java.util.Date;

public class Fresher extends Employee{
    private Date graduationDate;
    private String graduationRank;

    public Fresher(Date graduationDate, String graduationRank) {
        this.graduationDate = graduationDate;
        this.graduationRank = graduationRank;
    }

    public Fresher(long id, String fullName, Date birthDay, String phone, String email, String employeeType, int employeeCount, Date graduationDate, String graduationRank) {
        super(id, fullName, birthDay, phone, email, employeeType, employeeCount);
        this.graduationDate = graduationDate;
        this.graduationRank = graduationRank;
    }

    public Date getGraduationDate() {
        return graduationDate;
    }

    public void setGraduationDate(Date graduationDate) {
        this.graduationDate = graduationDate;
    }

    public String getGraduationRank() {
        return graduationRank;
    }

    public void setGraduationRank(String graduationRank) {
        this.graduationRank = graduationRank;
    }

    @Override
    public String toString() {
        return String.format( graduationDate +","+graduationRank+"," );
    }
}
