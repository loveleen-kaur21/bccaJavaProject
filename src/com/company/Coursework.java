package com.company;

public class Coursework {
    public static void overall() {
        System.out.println("""
                Through the course of the year, work at Base Camp will be very self-paced. A student may catch the first
                module of a unit easier than another. However, the next unit may be the opposite for those 2 
                students. Self-pacing will ensure that students are able to study content on their own pace. The Base Camp 
                Coding Academy Technical Curriculum is broken down into nine units. Each unit consumes five weeks of class 
                time and produces a product for the student’s technical portfolio. With the exception of the final unit, 
                four weeks of each unit are dedicated to new content with the fifth week going to a final project for the unit. 
                The final unit is entirely dedicated to development of a capstone project. By the end of the curriculum, 
                students have a portfolio of nine projects (one being the portfolio itself) to demonstrate their ability as a 
                web developer.
                                
                Unit 1 > Fundamentals of Programming Pt. 1 (Python)
                Unit 2 > Fundamentals of Programming Pt. 2 (Python)
                Unit 3 > Static Website Development        (HTML/CSS)
                Unit 4 > Dynamic Website Development Pt. 1 (Django)
                Unit 5 > Dynamic Website Development Pt. 2 (Django)
                Unit 6 > Dynamic Website Development Pt. 3 (JavaScript)
                Unit 7 > Fundamentals of Java              (Java)
                Unit 8 > Spring Web Application Development (Spring)
                Unit 9 > Capstone Project
                """);
    }

    public static void fundamentalsProgramming1 () {
        System.out.println("""
                --- Fundamentals of Programming Part 1: Python ---
               
                Duration: 5 weeks
                                
                DESCRIPTION
                ------------
                This unit introduces students to programming using the Python programming language, 
                using a Linux based development environment using Visual Studio Code, and version control 
                with Git and GitHub.
                                
                                
                OBJECTIVES
                -----------                
                As a result of this unit, you will be able to:
                - Develop complex command-line applications using Python that:
                    - Process to user input
                    - Decide between different behaviors
                    - Repeat work an arbitrary number of times
                    - Process arbitrarily sized data
                - Edit Python programs using Visual Studio Code.
                - Navigate and manage your file system using the Linux command line.
                - Maintain and manage version history of software projects using Git.
                - Synchronize and manage remote Git repositories on GitHub.
                """);
    }

    public static void fundamentalsProgramming2(){
        System.out.println("""
                --- Fundamentals of Programming Part 2: Python ---
                
                Duration: 5 weeks
                                
                DESCRIPTION
                ------------
                This unit introduces students to file I/O, alternative data structures, basic algorithm analysis, 
                object-oriented programming, automated testing, and basic SQL.
                                
                OBJECTIVES
                -----------   
                As a result of this unit, you will be able to:
                - Read and Store information between program executions using files.
                - Improve program design with appropriate usage of lists, sets, tuples, and dictionaries.
                - Understand basics of time complexity in programming.
                - Organize applications using an object-oriented style.
                - Create a test suite to improve the health of your Python application.
                - Read and store information using SQLite.""");
    }

    public static void staticWebDev(){
        System.out.println("""
                --- Static Website Development: HTML/CSS ---
                
                Duration: 5 weeks
                                
                DESCRIPTION
                ------------
                This unit introduces students to static website development with HTML and CSS, debugging pages 
                with browser devtools, responsive design, deployment with GitHub Pages, semantic HTML, complex CSS 
                layout, and the BEM CSS naming methodology.
                                
                OBJECTIVES
                -----------   
                As a result of this unit, you will be able to:
                - Create static, informational websites
                - Inspect and experiment with the DOM using devtools
                - Ensure appropriate website layout for desktop or mobile
                - Deploy static sites to the internet with GitHub Pages
                - Determine appropriate, semantic HTML tag and attribute usage.
                - Organize CSS using BEM
                """);
    }

    public static void dynamicWebDev1(){
        System.out.println("""
                --- Dynamic Website Development Part 1: Django ---

                Duration: 5 weeks
                                
                DESCRIPTION
                ------------
                This unit introduces students to full stack web development with Django, user input validation and 
                processing, database management via Django ORM, basic PostgreSQL administration with PgAdmin, website 
                administration with Django admin, testing Django web applications, and deploying Django applications 
                with Heroku.
                                
                OBJECTIVES
                -----------  
                As a result of this unit, you will be able to:         
                - Develop dynamic, database-backed websites.
                - Understand the basics of HTTP and how it relates to web frameworks.
                - Perform basic administration tasks against a PostgreSQL database with PgAdmin.
                - Process user input and respond appropriately to invalid input.
                - Design and implement simple database schemas with Django ORM.
                - Create a test suite to maintain and improve the health of your Django project.
                - Deploy Django applications with Heroku.
                """);
    }

    public static void dynamicWebDev2(){
        System.out.println("""
                --- Dynamic Website Development Part 2: Django ---

                Duration: 5 weeks
                                
                DESCRIPTION
                ------------
                This unit introduces students to complex database modeling via Django ORM, common database performance
                 issues and their solutions, 3rd party services providers and their Python/Django integrations, 
                 selenium testing, monitoring and error tracking with Scout and Sentry, and helpful 3rd party django 
                 packages.
                                
                OBJECTIVES
                -----------   
                As a result of this unit, you will be able to: 
                - Design and implement complex database schemas with Django ORM.
                - Identify and eliminate common database performance issues.
                - Email users as a result of interactions with your Django application.
                - Improve the health of a test suite with end-to-end tests.
                - Integrate with 3rd party Django packages.
                - Integrate with 3rd party Heroku addons.
                """);
    }

    public static void dynamicWebDev3 () {
        System.out.println("""
                --- Dynamic Website Development Part 3: Django ---

                Duration: 5 weeks
                                
                DESCRIPTION
                ------------
                This unit introduces students to the fundamentals of JavaScript, DOM manipulation, pattern matching 
                with regular expressions, and asynchronous programming with callbacks and Promises.
                                
                OBJECTIVES
                -----------  
                As a result of this unit, you will be able to:
                - Read and write JavaScript
                - Leverage regular expressions for text pattern matching
                - Build UI components with rich, client-side behavior such as:
                    - Live form input validation
                    - Type-ahead input suggestions
                    - Infinite scroll
                - Build simple browser based games
                """);
    }

    public static void java() {
        System.out.println("""
                --- Fundamentals of Java: Django ---
                                
                Duration: 5 weeks
                                
                DESCRIPTION
                ------------
                This unit introduces students to the fundamentals of Java, the IntelliJ development environment, the 
                Java API, and statically-typed class based programming.
                                
                OBJECTIVES
                ----------- 
                As a result of this unit, you will be able to:           
                - Develop complex command-line applications using Java that:
                    - Process to user input
                    - Decide between different behaviors
                    - Repeat work an arbitrary number of times
                    - Process arbitrarily sized data
                    - Read and Store information between program executions using files
                - Leverage IntelliJ as a Java Development Environment
                - Work in a statically-typed, class-based programming language
                """);
    }

    public static void spring(){
        System.out.println("""
                --- Spring Web Application Development: Spring ---
                
                Duration: 5 weeks
                                
                DESCRIPTION
                ------------
                This unit introduces students to full stack web development with Spring, templating with Thymeleaf, 
                avoiding Java boilerplate with Lombok, database management with JDBC and JPA, REST APIs with RestController 
                and Spring Data Rest, securing applications with Spring Security, configuring and managing with Spring Boot, 
                and deploying Spring applications with Heroku.
                                
                OBJECTIVES
                -----------
                As a result of this unit, you will be able to:
                - Develop dynamic, database-backed websites with Spring MVC.
                - Clean up Java boilerplate with Lombok annotations.
                - Design and implement simple database schemas with JDBC and JPA.
                - Build REST APIs using RestController or Spring Data Rest.
                - Create a test suite to maintain and improve the health of your Spring project.
                - Deploy Spring applications with Heroku.
                """);
    }

    public static void capstone(){
        System.out.println("""
                --- Capstone Project ---
                
                Duration: 4 weeks
                
                DESCRIPTION
                ------------
                This unit gives students time and support to develop a final project representing 
                the cumulation of their technical skills. Students are responsible for proposing, designing, developing, 
                deploying, and presenting their project. By the end of this unit, students have a stellar project providing 
                evidence of their skill set as a web developer.""");
    }
}
