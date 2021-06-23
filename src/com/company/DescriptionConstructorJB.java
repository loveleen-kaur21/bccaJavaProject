package com.company;
import java.io.Serializable;

public class DescriptionConstructorJB implements Serializable{
    private String language = "";
    private String duration = "";
    private String description = "";
    private String objective = "";

    public DescriptionConstructorJB(){
    };

    public DescriptionConstructorJB(String language, String duration, String description, String objective){
        this.language = language;
        this.duration = duration;
        this.description = description;
        this.objective = objective;
    }

    @Override
    public String toString() {
        return
                "\nLanguage: " + language +
                "\nDuration: " + duration +
                "\nDescription: " + description +
                "\nObjective: " + objective + '\n';
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getObjective() {
        return objective;
    }

    public void setObjective(String objective) {
        this.objective = objective;
    }
}
