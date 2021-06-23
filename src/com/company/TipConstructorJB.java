package com.company;

import java.io.Serializable;


public class TipConstructorJB implements Serializable{
    private String title = "";
    private String body = "";

    public TipConstructorJB(){
    }

    public TipConstructorJB(String title, String body){
        this.title = title;
        this.body = body;
    }

    @Override
    public String toString() {
        return  title +
                "\n             - " + body +"\n";
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }
}


