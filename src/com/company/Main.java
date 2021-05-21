package com.company;
import java.sql.SQLException;
import java.util.Scanner;
import com.company.database.*;
import java.util.Date;
import java.math.BigInteger;


public class Main {

    public static void main(String[] args) throws SQLException {
        // write your code here
        TestimonialsList testimonials = new TestimonialsList();
        ApplicationsList applicationsList = new ApplicationsList();
        TipsList tips = new TipsList();
        System.out.println("""
                Welcome to Base Camp Coding Academy!
                """);
        BasicInformation.Info();
        boolean invalidContinue = true;
        while (invalidContinue) {
        Scanner scan = new Scanner(System.in);
        String iContinue = scan.nextLine();
        if (iContinue.equalsIgnoreCase("yes")) {
            invalidContinue = false;
            while (true) {
                System.out.println();
                boolean invalid = true;
                while (invalid) {
                    System.out.println("""
                            What would you like to start with?
                            -- Coursework Details
                            -- Student Testimonials
                            -- Alumni Statistics
                            -- A day in the life
                            -- Common Tips
                            -- Trial (See what it would be like!)
                            -- Apply
                            -- Application Status
                                                
                               Input:
                            """);
                    String choice = scan.nextLine();
                    switch (choice.toLowerCase()) {
                        case "coursework", "coursework details" -> {
                            Coursework.overall();
                            boolean invalidI = true;
                            while (invalidI) {
                                System.out.println("Select a unit to view full description. ");
                                String unitPick = scan.nextLine();
                                switch (unitPick.toLowerCase()) {
                                    case "fundamentals of programming pt. 1", "fundamentals of programming pt.1", "fundamentals 1",
                                            "programming pt.1", "programming pt. 1", "unit 1" -> {
                                        Coursework.fundamentalsProgramming1();
                                        invalidI = false;
                                    }
                                    case "fundamentals of programming pt.2", "fundamentals of programming pt. 2",
                                            "programming pt.2", "programming pt. 2", "unit 2" -> {
                                        Coursework.fundamentalsProgramming2();
                                        invalidI = false;
                                    }
                                    case "static website development", "static web dev", "static web development", "unit 3" -> {
                                        Coursework.staticWebDev();
                                        invalidI = false;
                                    }
                                    case "dynamic website development 1", "dynamic web development 1", "dynamic website development pt.1",
                                            "dynamic website development pt. 1", "unit 4" -> {
                                        Coursework.dynamicWebDev1();
                                        invalidI = false;
                                    }
                                    case "dynamic website development 2", "dynamic web development 2", "dynamic website development pt.2",
                                            "dynamic website development pt. 2", "unit 5" -> {
                                        Coursework.dynamicWebDev2();
                                        invalidI = false;
                                    }
                                    case "dynamic website development 3", "dynamic web development 3", "dynamic website development pt.3",
                                            "dynamic website development pt. 3", "unit 6" -> {
                                        Coursework.dynamicWebDev3();
                                        invalidI = false;
                                    }
                                    case "fundamentals of java", "java", "unit 7" -> {
                                        Coursework.java();
                                        invalidI = false;
                                    }
                                    case "spring web application development", "spring", "spring web app dev", "unit 8" -> {
                                        Coursework.spring();
                                        invalidI = false;
                                    }
                                    case "capstone", "capstone project", "unit 9" -> {
                                        Coursework.capstone();
                                        invalidI = false;
                                    }
                                    case "exit" -> {
                                        invalidI = false;
                                        continue;
                                    }
                                    default -> System.out.println("Try again.");
                                }
                            }


                        }
                        case "student", "testimonials", "student testimonials" -> {
                            boolean invalidIN = true;
                            while (invalidIN) {
                                System.out.println("""
                                        Would you like to create or view testimonials?
                                        """);
                                String cOv = scan.nextLine();
                                if (cOv.equalsIgnoreCase("create")) {
                                    System.out.println("What is your full name?");
                                    String name = scan.nextLine();
                                    System.out.println("What year did you graduate/ are going to graduate Base Camp?");
                                    int classOf = scan.nextInt();
                                    scan.nextLine();
                                    System.out.println("Type your testimonial> ");
                                    String text = scan.nextLine();
                                    Testimonial testimonial = new Testimonial(name, classOf, text);
                                    testimonials.addTestimonial(testimonial);
                                    invalidIN = false;
                                } else if (cOv.equalsIgnoreCase("view")) {
                                    testimonials.viewAll();
                                    invalidIN = false;
                                } else {
                                    System.out.println("Invalid input, please try again. ");
                                }
                            }

                        }
                        case "day in the life", " a day in the life" -> {
                            DayInLife.info();
                            invalid = false;
                        }
                        case "tips", "common tips" -> {
                            boolean invalidTip = true;
                            while (invalidTip) {
                                System.out.println("Would you like to create a tip or view tips?");
                                String tipChoice = scan.nextLine();
                                if (tipChoice.equalsIgnoreCase("create")) {
                                    System.out.println("Title: ");
                                    String title = scan.nextLine();
                                    System.out.println("Body: ");
                                    String body = scan.nextLine();
                                    Tip tip = new Tip(title, body);
                                    tips.addTip(tip);
                                    invalidTip = false;
                                } else if (tipChoice.equalsIgnoreCase("view")) {
                                    tips.viewAll();
                                    invalidTip = false;
                                } else {
                                    System.out.println("Invalid input, please try again.");
                                }
                                invalid = false;
                            }

                        }
                        case "trial" -> {
                            System.out.println("""
                                    This is a programming challenge that you can try out!
                                    Use replit to create a small program that will calculate an average by using the tools
                                    introduced in the following Youtube videos. Create an account on replit to get started:
                                    replit.com
                                    https://www.youtube.com/watch?v=jsTpVm8PKBg
                                    https://youtu.be/60wbdsgKSo4
                                                                    
                                    Your program should ask the user for three test scores. The program should collect each
                                    score, calculate the average of those scores, and print out the average.
                                    """);
                            invalid = false;
                        }
                        case "apply" -> {

                            boolean invalidEmail = true;
                            String email = "";
                            while (invalidEmail) {
                                System.out.println("Email: ");
                                email = scan.nextLine();
                                if (email.contains("@") & email.contains(".")) {
                                    invalidEmail = false;
                                } else {
                                    System.out.println("Invalid email.");
                                }
                            }


                            boolean invalidName = true;
                            String name = "";
                            while (invalidName) {
                                System.out.println("Name: ");
                                name = scan.nextLine();
                                if (name.contains(" ")) {
                                    invalidName = false;
                                } else {
                                    System.out.println("Please provide your full name.");
                                }
                            }

                            System.out.println("School you currently attend: ");
                            String school = scan.nextLine();

                            boolean invalidGen = true;
                            String gender = "";
                            while (invalidGen) {
                                System.out.println("""
                                        Gender(optional)
                                            o Female
                                            o Male
                                            o Prefer not to say
                                            o Other""");
                                gender = scan.nextLine();
                                switch (gender.toLowerCase()) {
                                    case "female", "prefer not to say", "male", "other" -> invalidGen = false;
                                    default -> System.out.println("Please provide a valid choice.");
                                }
                            }

                            boolean invalidRace = true;
                            String race = "";
                            while (invalidRace) {
                                System.out.println("""
                                        Race(optional)
                                            o Asian
                                            o American Indian or Alaskan Native
                                            o Black or African American
                                            o Native Hawaiian or other Pacific islander
                                            o White
                                            o From multiple races
                                            o Other""");
                                race = scan.nextLine();
                                switch (race.toLowerCase()) {
                                    case "asian", "american indian", "alaskan native", "black", "african american",
                                            "native hawaiian", "pacific islander", "white", "from multiple races",
                                            "other", "multiple races" -> {
                                        invalidRace = false;
                                    }
                                    default -> System.out.println("Invalid input, try again.");
                                }
                            }

                            boolean invalidEthnicity = true;
                            String ethnicity = "";
                            while (invalidEthnicity) {
                                System.out.println("""
                                        Ethnicity(optional)
                                            o Hispanic or Latino or Spanish Origin
                                            o Not Hispanic of Latino or Spanish Origin
                                            """);
                                ethnicity = scan.next();
                                switch (ethnicity.toLowerCase()) {
                                    case "hispanic", "latino", "spanish origin", "hispanic or latino or spanish origin", "not hispanic or latino or spanish origin", "none" -> invalidEthnicity = false;
                                    default -> System.out.println("Invalid input, try again.");
                                }
                            }


                            boolean invalidCommute = true;
                            String commute = scan.nextLine();
                            while (invalidCommute) {
                                System.out.println("Do you have the ability to commute to Water Valley 5 days a week?");
                                commute = scan.nextLine();
                                switch (commute) {
                                    case "yes", "no" -> invalidCommute = false;
                                    default -> System.out.println("Invalid input, try again.");
                                }
                            }


                            boolean invalidMonth = true;
                            int inputMonth = 0;
                            int inputDay = 0;
                            int inputYear = 0;

                            while (invalidMonth) {
                                System.out.println("Expected Graduation Date - Enter the month in this format (MM): ");
                                inputMonth = scan.nextInt();
                                scan.nextLine();
                                if (inputMonth >= 1 || inputMonth <= 12) {
                                    invalidMonth = false;
                                } else {
                                    System.out.println("Invalid input, try again.");
                                }
                            }


                            boolean invalidDay = true;
                            while(invalidDay) {
                                System.out.println("Expected Graduation Date - Enter the day in this format (DD):");
                                inputDay = scan.nextInt();
                                scan.nextLine();
                                switch (inputMonth) {
                                    case 1, 3, 5, 7, 9, 11: {
                                        if (inputDay >= 1 || inputDay <= 31){
                                            invalidDay = false;
                                        }
                                    }
                                    case 4, 6, 8, 10, 12: {
                                        if (inputDay >= 1 || inputDay <= 30){
                                            invalidDay = false;
                                        }
                                    }
                                    case 2: {
                                        if (inputDay >= 1 || inputDay <= 28){
                                            invalidDay = false;
                                        }
                                    }
                                }
                            }

                            boolean invalidYear = true;
                            while(invalidYear){
                                System.out.println("Expected Graduation Date - Enter the year in this format (YYYY):");
                                inputYear = scan.nextInt();
                                scan.nextLine();
                                if (inputYear >= 1000 & inputYear <= 3000){
                                    invalidYear = false;
                                } else {
                                    System.out.println("Invalid input, try again.");
                                }
                            }

                            String month = Integer.toString(inputMonth);
                            String day = Integer.toString(inputDay);
                            String year = Integer.toString(inputYear);
                            String hsgraduation = month + "/" + day + "/" + year;

                            System.out.println(hsgraduation);

                            int age = 0;
                            while (age < 16) {
                                System.out.println("Age:");
                                age = scan.nextInt();
                                scan.nextLine();
                            }

                            String phnumber ="";
                            boolean invalidphone = true;
                            while (invalidphone) {
                                System.out.println("Phone Number:");
                                phnumber = scan.nextLine();
                                if (phnumber.length() == 10) {
                                    invalidphone = false;
                                } else {
                                    System.out.println("Invalid phone number, try again.");
                                }
                            }


                            System.out.println("""
                                    If you are under 18, please provide your parent/guardian contact information
                                    as well. If you are 18 or older, you can say 'NA' for the information.
                                                                    
                                                                    
                                    """);

                            //                            boolean invalidPName = true;
                            String parentName = "";
                            while (true) {
                                System.out.println("Parent/Guardian Name:");
                                parentName = scan.nextLine();
                                if (parentName.contains(" ")) {
                                    break;
                                } else {
                                    System.out.println("Please provide their full name.");
                                }
                            }

                            boolean invalidPemail = true;
                            String parentEmail = "";
                            while (invalidPemail) {
                                System.out.println("Parent/Guardian Email: ");
                                parentEmail = scan.nextLine();
                                if (parentEmail.contains("@") & parentEmail.contains(".")) {
                                    invalidPemail = false;
                                } else {
                                    System.out.println("Invalid email, try again.");
                                }
                            }

                            String parentNumber = "";
                            boolean invalidPphone = true;
                            while (invalidPphone) {
                                System.out.println("Parent/Guardian Phone Number:");
                                parentNumber = scan.nextLine();
                                if (parentNumber.length() == 10) {
                                    invalidPphone = false;
                                } else {
                                    System.out.println("Invalid phone number, try again.");
                                }
                            }

                            System.out.println("What is your current plan for next year? ");
                            String plan = scan.nextLine();
                            System.out.println("""
                                    Aptitude:
                                    Please describe a tough problem you solved and share how you solved it.
                                    >
                                    """);
                            String aptitude = scan.nextLine();
                            System.out.println("""
                                    Dedication/ Work Ethic/ Heart:
                                    Please share a specific example of a time that you worked hard to achieve a goal.
                                    >
                                    """);
                            String dedication = scan.nextLine();
                            System.out.println("""
                                    Passion:
                                    Please tell us about something you are passionate about and what you've done to
                                    pursue that passion. This can be clubs, sports teams, hobbies, church groups, etc.
                                    >
                                    """);
                            String passion = scan.nextLine();
                            System.out.println("""
                                    Persistence:
                                    Describe a time when you failed and how you overcame that failure.
                                    >
                                    """);
                            String persistence = scan.nextLine();
                            invalid = false;
                            String status = "submitted";


                            ApplicationConstructorJB application = new ApplicationConstructorJB(
                                    name, school, email, gender, race,
                                    ethnicity, commute, hsgraduation, age, phnumber, parentName, parentEmail, parentNumber, plan,
                                    aptitude, dedication, passion, persistence, status
                            );
                            DatabaseSettings.addApplicationtoDB(application);


                        }
                        case "application status", "status" -> {
                            boolean invalidsName = true;
                            String iName = "";
                            while (invalidsName) {
                                System.out.println("What is your name?");
                                iName = scan.nextLine();
                                if (iName.contains(" ")) {
                                    invalidsName = false;
                                } else {
                                    System.out.println("Please provide your full name.");
                                }
                            }
                            applicationsList.status(iName);
                            invalid = false;
                        }
                        case "q", "quit" -> {
                            System.exit(0);
                            invalid = false;
                        }
                        default -> System.out.println("That is in an invalid input, please try again.");

                    }
                }
            }
        } else if (iContinue.equalsIgnoreCase("no")) {
            invalidContinue = false;
            System.out.println("Goodbye.");
            System.exit(0);
        } else {
            System.out.println("Invalid input. Try again.");
        }
    }
        }

    }

