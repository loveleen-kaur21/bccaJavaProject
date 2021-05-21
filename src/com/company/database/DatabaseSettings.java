package com.company.database;

import com.company.ApplicationConstructorJB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Scanner;

public class DatabaseSettings {
    static Scanner stdin = new Scanner(System.in);
    static String dburl = "jdbc:sqlite:src/com/company/database/database.db";
    static Connection conn;

    public static void connect() throws SQLException{
        if(conn == null) {
            conn = DriverManager.getConnection(dburl);
            System.out.println("Connected");
        }
    }

    public static void addApplicationtoDB(ApplicationConstructorJB application) throws SQLException {
        connect();
        var statement = conn.createStatement();
        statement.executeUpdate(
                "INSERT INTO Applications (" +
                        "Name, HighSchool, Email, Gender, Race, Ethnicity, Commute, GraduationDate, Age, PhoneNumber, ParentName, ParentEmail, ParentPhoneNumber, Plan, Aptitude, Dedication, Passion, Persistence, Status" +
                        ")" +
                        "VALUES ('" + application.getName() +
                        "', '" + application.getSchool() +
                        "', '" + application.getEmail() +
                        "', '" + application.getGender() +
                        "', '" + application.getRace() +
                        "', '" + application.getEthnicity() +
                        "', '" + application.getCommute() +
                        "', " + application.getGraduationDate() +
                        ", " + application.getAge() +
                        ", '" + application.getPhnumber() +
                        "', '" + application.getParentName() +
                        "', '" + application.getParentEmail() +
                        "', '" + application.getParentNumber() +
                        "', '" + application.getPlan().replace("'", "''") +
                        "', '" + application.getAptitude().replace("'", "''") +
                        "', '" + application.getDedication().replace("'", "''") +
                        "', '" + application.getPassion().replace("'", "''") +
                        "', '" + application.getPersistence().replace("'", "''") +
                        "', '" + application.getStatus().replace("'", "''") +
                        "')"
        ); // add single string quotes to strings

    }

    public static ArrayList<ApplicationConstructorJB> getApplicationsFromDatabase() throws SQLException {
        connect();
        var statement = conn.createStatement();
        var data = statement.executeQuery("SELECT * FROM Applications");

        ArrayList<ApplicationConstructorJB> retrieved = new ArrayList<>();
        while (data.next()) {
            retrieved.add(new ApplicationConstructorJB(
                    data.getString("Name"),
                    data.getString("HighSchool"),
                    data.getString("Email"),
                    data.getString("Gender"),
                    data.getString("Race"),
                    data.getString("Ethnicity"),
                    data.getString("Commute"),
                    data.getDate("GraduationDate"),
                    data.getInt("Age"),
                    data.getString("PhoneNumber"),
                    data.getString("ParentName"),
                    data.getString("ParentEmail"),
                    data.getString("ParentPhoneNumber"),
                    data.getString("Plan").replace("''", "'"),
                    data.getString("Aptitude").replace("''", "'"),
                    data.getString("Dedication").replace("''", "'"),
                    data.getString("Passion").replace("''", "'"),
                    data.getString("Persistence").replace("''", "'"),
                    data.getString("Status").replace("''", "'")

            ));
        }
        return retrieved;
    }


}
