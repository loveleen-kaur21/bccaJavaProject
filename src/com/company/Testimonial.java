package com.company;

public class Testimonial {
    String name = "";
    int classOf = 0;
    String text = "";

    public Testimonial(String Stname, int StclassOf, String Sttext){
        name = Stname;
        classOf = StclassOf;
        text = Sttext;
    }

    public String toString() {
        String str = """
                '%s'
                    - %s, %s
                """.formatted(text, name, classOf);
        return str;
    }
}
