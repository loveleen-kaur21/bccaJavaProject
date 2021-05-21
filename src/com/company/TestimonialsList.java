package com.company;
import java.util.ArrayList;

public class TestimonialsList {
    ArrayList<Testimonial> TestimonialsList = new ArrayList<>();

    public void addTestimonial(Testimonial testimonial){
        TestimonialsList.add(testimonial);
    }

    public void viewAll(){
        if (TestimonialsList.size() == 0){
            System.out.println("There are no testimonials to view. Try creating one!\n");
        }
        else{
            for (Testimonial i : TestimonialsList){
                System.out.println(i);
            }
        }

    }
}
