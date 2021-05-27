package database;

import com.company.ApplicationConstructorJB;
import com.company.DescriptionConstructorJB;
import com.company.TestimonialConstructorJB;
import com.company.TipConstructorJB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Scanner;

public class DatabaseSettings {
    static Scanner stdin = new Scanner(System.in);
    static String dburl = "jdbc:sqlite:src/database/database.db";
    static Connection conn;

    public static void connect() throws SQLException{
        try {
            if (conn == null){
                conn = DriverManager.getConnection(dburl);
                System.out.println("Connection to SQLite has been established.");
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            System.exit(1);
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
                        "', '" + application.getGraduationDate() +
                        "', " + application.getAge() +
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
                    data.getString("GraduationDate"),
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


    public static void addTestimonialtoDB(TestimonialConstructorJB testimonial) throws SQLException {
        connect();
        var statement = conn.createStatement();
        statement.executeUpdate(
                "INSERT INTO Testimonials (" +
                        "Name, classOf, Text" +
                        ")" +
                        "VALUES ('" + testimonial.getName() +
                        "', " + testimonial.getClassOf() +
                        ", '" + testimonial.getText() +
                        "')"
        ); // add single string quotes to strings

    }

    public static ArrayList<TestimonialConstructorJB> getTestimonialsfromDB() throws SQLException {
        connect();
        var statement = conn.createStatement();
        var data = statement.executeQuery("SELECT * FROM Testimonials");

        ArrayList<TestimonialConstructorJB> retrieved = new ArrayList<>();
        while (data.next()) {
            retrieved.add(new TestimonialConstructorJB(
                    data.getString("Name"),
                    data.getInt("classOf"),
                    data.getString("Text")
            ));
        }
        return retrieved;
    }


    public static void addTiptoDB(TipConstructorJB tip) throws SQLException {
        connect();
        var statement = conn.createStatement();
        statement.executeUpdate(
                "INSERT INTO Tips (" +
                        "Title, Body" +
                        ")" +
                        "VALUES ('" + tip.getTitle() +
                        "', '" + tip.getBody() +
                        "')"
        ); // add single string quotes to strings

    }



    public static ArrayList<TipConstructorJB> getTipsfromDB() throws SQLException {
        connect();
        var statement = conn.createStatement();
        var data = statement.executeQuery("SELECT * FROM Tips");

        ArrayList<TipConstructorJB> retrieved = new ArrayList<>();
        while (data.next()) {
            retrieved.add(new TipConstructorJB(
                    data.getString("Title"),
                    data.getString("Body")
            ));
        }
        return retrieved;
    }

    public static ArrayList<String> getMainCourses() throws SQLException {
        connect();
        var statement = conn.createStatement();
        var data = statement.executeQuery("SELECT Title FROM CourseworkDetails");
        ArrayList<String> retrieved = new ArrayList<>();
        while (data.next()){
            retrieved.add(
                    data.getString("Title")
            );
        }
        return retrieved;
    }

    public static ArrayList<DescriptionConstructorJB> getDescription(String input) throws SQLException {
        connect();
        var statement = conn.prepareStatement("SELECT Language, Duration, Description, Objectives FROM CourseworkDetails WHERE Name = ?");
        statement.setString(1, input);
        var data = statement.executeQuery();
        ArrayList<DescriptionConstructorJB> retrieved = new ArrayList<>();
        while (data.next()){
            retrieved.add(new DescriptionConstructorJB(
                    data.getString("Language"),
                    data.getString("Duration"),
                    data.getString("Description"),
                    data.getString("Objectives")
                    )

            );
        }
        return retrieved;
    }

}
