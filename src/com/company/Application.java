package com.company;

public class Application {
    String name = "";
    String highschool = "";
    String email = "";
    String gender = "";
    String race = "";
    String ethnicity = "";
    String commuteAbility = "";
    String graduationDate = "";
    int age = 0;
    String phnumber = "";
    String parentName = "";
    String parentEmail = "";
    String parentNumber = "";
    String plan = "";
    String aptitude = "";
    String dedication = "";
    String passion = "";
    String persistence = "";
    String status = "";


    public Application(String Iemail, String Iname, String Ischool, String Igender, String Irace, String Iethnicity, String Icommute, String Ihsgraduation,
                       int Iage, String Iphnumber, String IparentName, String IparentEmail,
                       String Iplan, String Iaptitude, String Idedication, String Ipassion, String Ipersistence, String IparentNumber, String Istatus) {
        email = Iemail;
        name = Iname;
        highschool = Ischool;
        gender = Igender;
        race = Irace;
        ethnicity = Iethnicity;
        commuteAbility = Icommute;
        graduationDate = Ihsgraduation;
        age = Iage;
        phnumber = Iphnumber;
        parentName = IparentName;
        parentEmail = IparentEmail;
        plan = Iplan;
        aptitude = Iaptitude;
        dedication = Idedication;
        passion = Ipassion;
        persistence = Ipersistence;
        parentNumber = IparentNumber;
        status = Istatus;

    }

    public String toString() {
        String str = """
                Email: %s
                Name: %s
                High School: %s
                Gender: %s
                Race: %s
                Ethnicity: %s
                Commute Ability: %s
                Graduation Date: %s
                Age: %s
                Phone Number: %s
                Parent Name: %s
                Parent Email: %s
                Plan: %s
                Aptitude: %s
                Dedication: %s
                Passion: %s
                Persistence: %s
                Parent Number: %s
                """.formatted(email, name, highschool, gender, race, ethnicity, commuteAbility, graduationDate, age, phnumber, parentName, parentEmail, plan,
                    aptitude, dedication, passion, persistence, parentNumber);
        return str;
    }
}
