package com.company;
import java.sql.Array;
import java.sql.SQLException;
import java.util.Locale;
import java.util.Scanner;
import database.*;


public class Main {

    public static void main(String[] args) throws SQLException {
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
                            String[] arr = new String[DatabaseSettings.getMainCourses().size()];

                            for (int i = 0; i < DatabaseSettings.getMainCourses().size(); i++) {
                                arr[i] = DatabaseSettings.getMainCourses().get(i);
                            }

//                            prints formatted
                            for (int i = 0; i < arr.length; i++){
                                System.out.println(
                                        String.format("      - %s", arr[i])
                                );
                            }

                            boolean invalidI = true;
                            while (invalidI) {
                                System.out.println("Select a unit to view full description. ");
                                String unitPick = scan.nextLine();
                                String check = unitPick.toLowerCase();
                                switch (check) {
                                    case "fundamentals of programming pt. 1", "fundamentals of programming pt.1", "fundamentals 1",
                                            "programming pt.1", "programming pt. 1", "unit 1" -> {
                                        String input = "Unit 1";
                                        System.out.println(DatabaseSettings.getDescription(input));
                                        invalidI = false;
                                    }
                                    case "fundamentals of programming pt.2", "fundamentals of programming pt. 2",
                                            "programming pt.2", "programming pt. 2", "unit 2" -> {
                                        String input = "Unit 2";
                                        System.out.println(DatabaseSettings.getDescription(input));
                                        invalidI = false;
                                    }
                                    case "static website development", "static web dev", "static web development", "unit 3" -> {
                                        String input = "Unit 3";
                                        System.out.println(DatabaseSettings.getDescription(input));
                                        invalidI = false;
                                    }
                                    case "dynamic website development 1", "dynamic web development 1", "dynamic website development pt.1",
                                            "dynamic website development pt. 1", "unit 4" -> {
                                        String input = "Unit 4";
                                        System.out.println(DatabaseSettings.getDescription(input));
                                        invalidI = false;
                                    }
                                    case "dynamic website development 2", "dynamic web development 2", "dynamic website development pt.2",
                                            "dynamic website development pt. 2", "unit 5" -> {
                                        String input = "Unit 5";
                                        System.out.println(DatabaseSettings.getDescription(input));
                                        invalidI = false;
                                    }
                                    case "dynamic website development 3", "dynamic web development 3", "dynamic website development pt.3",
                                            "dynamic website development pt. 3", "unit 6" -> {
                                        String input = "Unit 6";
                                        System.out.println(DatabaseSettings.getDescription(input));
                                        invalidI = false;
                                    }
                                    case "fundamentals of java", "java", "unit 7" -> {
                                        String input = "Unit 7";
                                        System.out.println(DatabaseSettings.getDescription(input));
                                        invalidI = false;
                                    }
                                    case "spring web application development", "spring", "spring web app dev", "unit 8" -> {
                                        String input = "Unit 8";
                                        System.out.println(DatabaseSettings.getDescription(input));
                                        invalidI = false;
                                    }
                                    case "capstone", "capstone project", "unit 9" -> {
                                        String input = "Unit 9";
                                        System.out.println(DatabaseSettings.getDescription(input));
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
                                    TestimonialConstructorJB testimonial = new TestimonialConstructorJB(name, classOf, text);
                                    DatabaseSettings.addTestimonialtoDB(testimonial);
                                    invalidIN = false;
                                } else if (cOv.equalsIgnoreCase("view")) {
                                    DatabaseSettings.getTestimonialsfromDB();
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
                                    TipConstructorJB tip = new TipConstructorJB(title, body);
                                    DatabaseSettings.addTiptoDB(tip);
                                    invalidTip = false;
                                } else if (tipChoice.equalsIgnoreCase("view")) {
                                    System.out.println(DatabaseSettings.getTipsfromDB());
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
                            String inputMonth = "";
                            String inputDay = "";
                            String inputYear = "";

                            while (invalidMonth) {
                                System.out.println("Expected Graduation Date - Enter the month in this format (MM): ");
                                inputMonth = scan.nextLine();
                                if (Integer.parseInt(inputMonth) >= 1 || Integer.parseInt(inputMonth) <= 12) {
                                    invalidMonth = false;
                                } else {
                                    System.out.println("Invalid input, try again.");
                                }
                            }


                            boolean invalidDay = true;
                            while(invalidDay) {
                                System.out.println("Expected Graduation Date - Enter the day in this format (DD):");
                                inputDay = scan.nextLine();
                                switch (inputMonth) {
                                    case "01", "03", "05", "07", "09", "11": {
                                        if (Integer.parseInt(inputDay) >= 1 || Integer.parseInt(inputDay) <= 31){
                                            invalidDay = false;
                                        }
                                    }
                                    case "04", "06", "08", "10", "12": {
                                        if (Integer.parseInt(inputDay) >= 1 || Integer.parseInt(inputDay) <= 30){
                                            invalidDay = false;
                                        }
                                    }
                                    case "02": {
                                        if (Integer.parseInt(inputDay) >= 1 || Integer.parseInt(inputDay) <= 28){
                                            invalidDay = false;
                                        }
                                    }

                                    default:
                                        System.out.println("Invalid try again.");
                                }
                            }

                            boolean invalidYear = true;
                            while(invalidYear){
                                System.out.println("Expected Graduation Date - Enter the year in this format (YYYY):");
                                inputYear = scan.nextLine();
                                if (Integer.parseInt(inputYear) >= 1000 & Integer.parseInt(inputYear) <= 3000){
                                    invalidYear = false;
                                } else {
                                    System.out.println("Invalid input, try again.");
                                }
                            }
                            String GraduationDate = inputMonth + "/" + inputDay + "/" + inputYear;


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
                                    ethnicity, commute, GraduationDate, age, phnumber, parentName, parentEmail, parentNumber, plan,
                                    aptitude, dedication, passion, persistence, status
                            );
                            DatabaseSettings.addApplicationtoDB(application);


                        }
//                        case "application status", "status" -> {
//                            boolean invalidsName = true;
//                            String iName = "";
//                            while (invalidsName) {
//                                System.out.println("What is your name?");
//                                iName = scan.nextLine();
//                                if (iName.contains(" ")) {
//                                    invalidsName = false;
//                                } else {
//                                    System.out.println("Please provide your full name.");
//                                }
//                            }
//                            applicationsList.status(iName);
//                            invalid = false;
//                        }
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

