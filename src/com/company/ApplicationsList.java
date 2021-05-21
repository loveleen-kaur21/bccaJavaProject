package com.company;
import java.util.ArrayList;
import java.util.Locale;


public class ApplicationsList {
    ArrayList<Application> list = new ArrayList<>();

    public void addApplication(Application application) {
        list.add(application);
    }
    public void viewAll(){
        for (Application i: list){
            System.out.println(i);
        }
    }

    public void status(String inputName){
        for(Application i : list){
            if (inputName.toLowerCase().equalsIgnoreCase(i.name)){
                System.out.println("Application Status for " + i.name + ": " + i.status);
            } else{
                System.out.println("Your application does not exist in our system. Try again.");
            }
        }
    }

}
