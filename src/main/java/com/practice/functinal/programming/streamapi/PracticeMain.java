package com.practice.functinal.programming.streamapi;

import java.util.ArrayList;
import java.util.List;

public class PracticeMain {

    public static void main(String[] args) {

        List<Employee>  employees = new ArrayList<>();
        fetchEmployees(employees);
        //find people age less than or equal 18

    }

    private static void fetchEmployees(List<Employee> employees) {
        employees.add(new Employee(1L,
                "Bageeradha",
                "vajja",
                "vajjabageeradha@gmail.com",28));
        employees.add(new Employee(2L,
                "Sivani",
                "Bammidi",
                "sivanibagee@gmail.com",24));
        employees.add(new Employee(3L,
                "Santhosh",
                "Bammindi",
                "santhoshb@gmail.com",12));
        employees.add(new Employee(4L,
                "Ram",
                "Kumar",
                "ramk@gmail.com",15));
        employees.add(new Employee(5L,
                "Raghu",
                "kc",
                "raghukc@gmail.com",25));
    }
}
