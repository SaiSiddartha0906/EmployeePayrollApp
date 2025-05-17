package com.example.employeepayroll.dto;

public class EmployeeDTO {
    private String name;
    private String gender;
    private String department;
    private String salary;
    private String startDate;

    public EmployeeDTO() {}

    public EmployeeDTO(String name, String gender, String department, String salary, String startDate) {
        this.name = name;
        this.gender = gender;
        this.department = department;
        this.salary = salary;
        this.startDate = startDate;
    }

    // Getters and Setters
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getGender() { return gender; }
    public void setGender(String gender) { this.gender = gender; }

    public String getDepartment() { return department; }
    public void setDepartment(String department) { this.department = department; }

    public String getSalary() { return salary; }
    public void setSalary(String salary) { this.salary = salary; }

    public String getStartDate() { return startDate; }
    public void setStartDate(String startDate) { this.startDate = startDate; }
}
