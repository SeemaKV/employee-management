package com.gitexample.services;

import com.gitexample.entities.Employee;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService
{
    @Override
    public List<Employee> getEmployees()
    {
        List<Employee> employeeList = new ArrayList<>();
        Employee e1 = new Employee(101,"Siri",24,"Davanagere",10000.00);
        Employee e2 = new Employee(102,"Ravii",42,"Udupi",17000.00);
        Employee e3 = new Employee(103,"Jeevitha",39,"Mandya",26000.00);
        Employee e4 = new Employee(104,"Karthik",18,"Dharvad",42000.00);
        Employee e5 = new Employee(105,"Madhu",53,"Ballary",30000.00);

        employeeList.add(e1);
        employeeList.add(e2);
        employeeList.add(e3);
        employeeList.add(e4);
        employeeList.add(e5);

        return employeeList;
    }

}
