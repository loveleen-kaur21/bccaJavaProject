package com.company;

public class Tip {
    String title = "";
    String body = "";

    public Tip(String iTitle, String iBody){
        title = iTitle;
        body = iBody;
    }

    public String toString() {
        String str = """
                %s
                -
                    %s""".formatted(title, body);
        return str;
    }
}
