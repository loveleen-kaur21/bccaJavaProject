package com.company;

import java.io.Serializable;

public class ApplicationConstructorJB implements Serializable {

    private String email = "";
    private String name = "";
    private String school = "";
    private String gender = "";
    private String race = "";
    private String ethnicity = "";
    private String commute = "";
    private String graduationDate = "";
    private int age = 0;
    private String phnumber = "";
    private String parentName = "";
    private String parentEmail = "";
    private String parentNumber = "";
    private String plan = "";
    private String aptitude = "";
    private String dedication = "";
    private String passion = "";
    private String persistence = "";
    private String status = "";

    public ApplicationConstructorJB() {
    }

    public ApplicationConstructorJB(String name, String school, String email, String gender, String race,
                                    String ethnicity, String commute, String graduationDate, int age, String phnumber,
                                    String parentName, String parentEmail, String parentNumber, String plan,
                                    String aptitude, String dedication, String passion, String persistence,
                                    String status) {
        this.name = name;
        this.school = school;
        this.email = email;
        this.gender = gender;
        this.race = race;
        this.ethnicity = ethnicity;
        this.commute = commute;
        this.graduationDate = graduationDate;
        this.age = age;
        this.phnumber = phnumber;
        this.parentName = parentName;
        this.parentEmail = parentEmail;
        this.parentNumber = parentNumber;
        this.plan = plan;
        this.aptitude = aptitude;
        this.dedication = dedication;
        this.passion = passion;
        this.persistence = persistence;
        this.status = status;
    }

    @Override
    public String toString() {
        return "ApplicationConstructorJB{" +
                "name='" + name + '\'' +
                ", school='" + school + '\'' +
                ", email='" + email + '\'' +
                ", gender='" + gender + '\'' +
                ", race='" + race + '\'' +
                ", ethnicity='" + ethnicity + '\'' +
                ", commute='" + commute + '\'' +
                ", graduationDate='" + graduationDate + '\'' +
                "', age=" + age +
                ", phnumber='" + phnumber + '\'' +
                ", parentName='" + parentName + '\'' +
                ", parentEmail='" + parentEmail + '\'' +
                ", parentNumber='" + parentNumber + '\'' +
                ", plan='" + plan + '\'' +
                ", aptitude='" + aptitude + '\'' +
                ", dedication='" + dedication + '\'' +
                ", passion='" + passion + '\'' +
                ", persistence='" + persistence + '\'' +
                ", status='" + status + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getRace() {
        return race;
    }

    public void setRace(String race) {
        this.race = race;
    }

    public String getEthnicity() {
        return ethnicity;
    }

    public void setEthnicity(String ethnicity) {
        this.ethnicity = ethnicity;
    }

    public String getCommute() {
        return commute;
    }

    public void setCommute(String commute) {
        this.commute = commute;
    }

    public String getGraduationDate() {
        return graduationDate;
    }

    public void setGraduationDate(String graduationDate) {
        this.graduationDate = graduationDate;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPhnumber() {
        return phnumber;
    }

    public void setPhnumber(String phnumber) {
        this.phnumber = phnumber;
    }

    public String getParentName() {
        return parentName;
    }

    public void setParentName(String parentName) {
        this.parentName = parentName;
    }

    public String getParentEmail() {
        return parentEmail;
    }

    public void setParentEmail(String parentEmail) {
        this.parentEmail = parentEmail;
    }

    public String getParentNumber() {
        return parentNumber;
    }

    public void setParentNumber(String parentNumber) {
        this.parentNumber = parentNumber;
    }

    public String getPlan() {
        return plan;
    }

    public void setPlan(String plan) {
        this.plan = plan;
    }

    public String getAptitude() {
        return aptitude;
    }

    public void setAptitude(String aptitude) {
        this.aptitude = aptitude;
    }

    public String getDedication() {
        return dedication;
    }

    public void setDedication(String dedication) {
        this.dedication = dedication;
    }

    public String getPassion() {
        return passion;
    }

    public void setPassion(String passion) {
        this.passion = passion;
    }

    public String getPersistence() {
        return persistence;
    }

    public void setPersistence(String persistence) {
        this.persistence = persistence;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
