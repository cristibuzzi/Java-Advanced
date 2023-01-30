package com.sda.cristi.advanced.inharitance.homework1;

public class Person {

    private String nameOfEmploye;
    private double annualSalary;
    private int yearOfEmployment;
    private String insuranceNumber;

    public Person(String nameOfEmploye, double annualSalary, int yearOfEmployment, String insuranceNumber) {
        this.nameOfEmploye = nameOfEmploye;
        this.annualSalary = annualSalary;
        this.yearOfEmployment = yearOfEmployment;
        this.insuranceNumber = insuranceNumber;
    }

    public String getNameOfEmploye() {
        return nameOfEmploye;
    }

    public void setNameOfEmploye(String nameOfEmploye) {
        this.nameOfEmploye = nameOfEmploye;
    }

    public double getAnnualSalary() {
        return annualSalary;
    }

    public void setAnnualSalary(double annualSalary) {
        this.annualSalary = annualSalary;
    }

    public int getYearOfEmployment() {
        return yearOfEmployment;
    }

    public void setYearOfEmployment(int yearOfEmployment) {
        this.yearOfEmployment = yearOfEmployment;
    }

    public String getInsuranceNumber() {
        return insuranceNumber;
    }

    public void setInsuranceNumber(String insuranceNumber) {
        this.insuranceNumber = insuranceNumber;
    }

    @Override
    public String toString() {
        return "Person{" +
                "nameOfEmploye='" + nameOfEmploye + '\'' +
                ", annualSalary=" + annualSalary +
                ", yearOfEmployment=" + yearOfEmployment +
                ", insuranceNumber='" + insuranceNumber + '\'' +
                '}';
    }
}
