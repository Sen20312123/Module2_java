package model;

import java.util.Date;

public class Intern extends Employee{
    private String majors;
    private String semester;
    private String universityName;

    public Intern(String majors, String semester, String universityName) {
        this.majors = majors;
        this.semester = semester;
        this.universityName = universityName;
    }

    public Intern(long id, String fullName, Date birthDay, String phone, String email, String employeeType, int employeeCount, String majors, String semester, String universityName) {
        super(id, fullName, birthDay, phone, email, employeeType, employeeCount);
        this.majors = majors;
        this.semester = semester;
        this.universityName = universityName;
    }

    public String getMajors() {
        return majors;
    }

    public void setMajors(String majors) {
        this.majors = majors;
    }

    public String getSemester() {
        return semester;
    }

    public void setSemester(String semester) {
        this.semester = semester;
    }

    public String getUniversityName() {
        return universityName;
    }

    public void setUniversityName(String universityName) {
        this.universityName = universityName;
    }

    @Override
    public String toString() {
        return String.format(
                majors+","+
                        semester+","+
                        universityName + "," );
    }
}
