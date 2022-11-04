package Hibernate;

import java.sql.Date;
import java.sql.Timestamp;

public class Department {

    private int DepartmentID;
    private String Name;
    private double Budget;
    private String StartDate;
    private int AD;

    public Department() {
    }

    public Department(int De, String Name, double Budget, String SDate, int AD) {
        this.DepartmentID = De;
        this.Name = Name;
        this.Budget = Budget;
        this.StartDate = SDate;
        this.AD = AD;
    }

    public int getDepartmentID() {
        return DepartmentID;
    }

    public void setDepartmentID(int departmentID) {
        DepartmentID = departmentID;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public double getBudget() {
        return Budget;
    }

    public void setBudget(double budget) {
        Budget = budget;
    }

    public String getStartDate() {
        return StartDate;
    }

    public void setStartDate(String startDate) {
        StartDate = startDate;
    }

    public int getAD() {
        return AD;
    }

    public void setAD(int aD) {
        AD = aD;
    }

}
