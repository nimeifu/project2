package com.company;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import java.util.Comparator;

class SortSalary implements Comparator<Employee>{
    public int compare(Employee e1, Employee e2){
        if(e1.calculateSalary()!= e2.calculateSalary()) {
            return (int) (e1.calculateSalary() - e2.calculateSalary());
        }

        else if(e1.getFirstName().compareToIgnoreCase(e2.getFirstName())!=0)
        {
            return e1.getFirstName().compareToIgnoreCase(e2.getFirstName());
        }

        return 0;
    }
}

public class runner {
    public static void main (String[] args) throws IOException {
        ArrayList<Employee> EmployeeList=new ArrayList<Employee>();
        fixedSalary fixedSalary=new fixedSalary("fixed","xyz",5000);
        EmployeeList.add(fixedSalary);


        fixedSalary num1=new fixedSalary("fixed","David",20000);
        EmployeeList.add(num1);
        fixedSalary num2=new fixedSalary("fixed","Anna",20000);
        EmployeeList.add(num2);
        hourlySalary num3=new hourlySalary("fixed","Halogen",51);
        EmployeeList.add(num3);
        fixedSalary num4=new fixedSalary("fixed","GithubBoi",40651);
        EmployeeList.add(num4);
        hourlySalary num5=new hourlySalary("hourly","JavaGuy",651);
        EmployeeList.add(num5);
        EmployeeList.sort(new SortSalary());

        FileWriter fileWriter= new FileWriter("EmployeeList.txt");
        PrintWriter printWriter=new PrintWriter(fileWriter);
        printWriter.println("Employee's first name, Employee ID, Compensation type, monthly income:");
        System.out.println("Employee's first name, Employee ID, Compensation type, monthly income:");
        for(Employee x:EmployeeList){
            printWriter.println(x.toString());
            System.out.println(x.toString());
        }
        printWriter.close();
        fileWriter.close();
    }
}
