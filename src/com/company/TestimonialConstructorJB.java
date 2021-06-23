package com.company;

import java.io.Serializable;

public class TestimonialConstructorJB implements Serializable{
    private String name = "";
    private String classOf = "";
    private String text = "";

    public TestimonialConstructorJB(){
    }

    public TestimonialConstructorJB(String name, String classOf, String text){
        this.name = name;
        this.classOf = classOf;
        this.text = text;
    }

    @Override
    public String toString() {
        return text +
                "\n             -" + name + " " + classOf + "\n";

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getClassOf() {
        return classOf;
    }

    public void setClassOf(String classOf) {
        this.classOf = classOf;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
