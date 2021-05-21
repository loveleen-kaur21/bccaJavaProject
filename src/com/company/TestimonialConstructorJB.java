package com.company;

import java.io.Serializable;

public class TestimonialConstructorJB implements Serializable{
    private String name = "";
    private int classOf = 0;
    private String text = "";

    public TestimonialConstructorJB(){
    }

    public TestimonialConstructorJB(String name, int classOf, String text){
        this.name = name;
        this.classOf = classOf;
        this.text = text;
    }

    @Override
    public String toString() {
        return "TestimonialConstructorJB{" +
                "name='" + name + '\'' +
                ", classOf=" + classOf +
                ", text='" + text + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getClassOf() {
        return classOf;
    }

    public void setClassOf(int classOf) {
        this.classOf = classOf;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
