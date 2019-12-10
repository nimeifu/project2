package com.company;

public abstract class Employee {
    public static int EmployeeID=0;
    private int employeeID;
    private String FirstName;
    private String Compensation;
    private double salary;

    public Employee(String Compensation,String FirstName,double AnnualOrHourly)
    {
        this.Compensation=Compensation;
        this.FirstName=FirstName;
        this.salary=AnnualOrHourly;
        employeeID = EmployeeID;
        EmployeeID++;

        getEmployeeID();
    }

    public double getSalary() {
        return salary;
    }



    public int getEmployeeID()
    {
        return employeeID;
    }

    public String getFirstName()
    {
        return FirstName;
    }

    public String getCompensation()
    {
        return Compensation;
    }

    public abstract double calculateSalary();

    public String toString()
    {
        return getFirstName()+" "+getEmployeeID()+" "+getCompensation()+" "+calculateSalary();
    }


}
