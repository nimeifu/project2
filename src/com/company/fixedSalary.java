package com.company;

public class fixedSalary extends Employee {
    public fixedSalary(String Compensation, String FirstName, double salary) {
        super(Compensation,FirstName,salary);

    }



    @Override
    public double calculateSalary(){
        return (double)Math.round(getSalary()/12*100)/100;
    }


}
