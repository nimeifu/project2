package com.company;

public class hourlySalary extends Employee {
    public hourlySalary(String Compensation, String FirstName, double AnnualOrHourly) {
        super(Compensation, FirstName, AnnualOrHourly);
    }

    @Override
    public double calculateSalary() {
        return (double)Math.round(20.8*8*getSalary()*100)/100;
    }



}
