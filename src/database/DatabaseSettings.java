package database;

import com.company.ApplicationConstructorJB;
import com.company.DescriptionConstructorJB;
import com.company.TestimonialConstructorJB;
import com.company.TipConstructorJB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ArrayList;

public class DatabaseSettings {
    static String dburl = "jdbc:sqlite:src/database/database.db";
    static Connection conn;

    public static void connect() throws SQLException{
            if (conn == null){
                conn = DriverManager.getConnection(dburl);
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

    public static ArrayList<String> getApplicantsFromDB() throws SQLException {
        connect();
        var statement = conn.createStatement();
        var data = statement.executeQuery("SELECT Name FROM Applications");
        ArrayList<String> retrieved = new ArrayList<>();
        while (data.next()) {
            retrieved.add(data.getString("Name"));
        }
        return retrieved;
    }

    public static String viewStatus(String inName) throws SQLException {
        connect();
        var statement = conn.createStatement();
        var data = statement.executeQuery("SELECT Status FROM Applications WHERE Name = '" + inName + "'");
        String status;
        status = data.getString("Status");
        return status;
    }
    public static void updateApplicantStatus(String iname, String istatus) throws SQLException {
        connect();
        var statement = conn.createStatement();
        var data = statement.executeQuery("SELECT Name FROM Applications");
        ArrayList<String> retrieved = new ArrayList<>();
        while (data.next()) {
            retrieved.add(data.getString("Name"));
        }
        if (retrieved.contains(iname)){
            var secstatement = conn.prepareStatement("UPDATE Applications SET Status = ? WHERE Name = ?");
            secstatement.setString(1, istatus);
            secstatement.setString(2, iname);
            secstatement.executeUpdate();
        }
    }


    public static ArrayList<ApplicationConstructorJB> getApplicationFromDatabase(String input) throws SQLException {
        connect();
        var statement = conn.prepareStatement("SELECT * FROM Applications WHERE Name = ?");
        statement.setString(1, input);
        var data = statement.executeQuery();
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
        var statement = conn.prepareStatement("INSERT INTO Testimonials (Name, classOf, Text) VALUES (?, ?, ?)");
        statement.setString(1, testimonial.getName());
        statement.setString(2, testimonial.getClassOf());
        statement.setString(3, testimonial.getText());
        statement.executeUpdate();

    }

    public static ArrayList<TestimonialConstructorJB> getTestimonialsfromDB() throws SQLException {
        connect();
        var statement = conn.createStatement();
        var data = statement.executeQuery("SELECT * FROM Testimonials");

        ArrayList<TestimonialConstructorJB> retrieved = new ArrayList<>();
        while (data.next()) {
            retrieved.add(new TestimonialConstructorJB(
                    data.getString("Name"),
                    data.getString("classOf"),
                    data.getString("Text")
            ));
        }

        return retrieved;
    }

    public static boolean existingTestimonials() throws SQLException {
        connect();
        boolean exists = false;
        var statement = conn.createStatement();
        var data = statement.executeQuery("SELECT * FROM Testimonials");
        ArrayList<String> info = new ArrayList<>();
        while (data.next()) {
            info.add(data.getString("Name"));
        }
        if (info.size() > 0){
            exists = true;
        }
        return exists;
    }


    public static boolean checkForApplicantExistence(String input) throws SQLException {
        boolean existence = false;
        connect();
        var statement = conn.createStatement();
        var data = statement.executeQuery("SELECT Name FROM Applications");
        ArrayList<String> names = new ArrayList<>();
        while (data.next()) {
            names.add(data.getString("Name").toLowerCase());
        }
        if (names.contains(input)) {
            existence = true;
        }
        return existence;
    }


    public static void addTiptoDB(TipConstructorJB tip) throws SQLException {
        connect();
        var statement = conn.prepareStatement("INSERT INTO TIPS (Title, Body) VALUES (?, ?)");
        statement.setString(1, tip.getTitle());
        statement.setString(2, tip.getBody());
        statement.executeUpdate();
  // add single string quotes to strings
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

    public static boolean existenceOfTips() throws SQLException {
        connect();
        var statement = conn.createStatement();
        var data = statement.executeQuery("SELECT Title FROM Tips");
        boolean exists = false;
        ArrayList<String> info = new ArrayList<>();
        while (data.next()) {
            info.add(data.getString("Title"));
        }
        if (info.size() > 0){
            exists = true;
        }
        return exists;
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
