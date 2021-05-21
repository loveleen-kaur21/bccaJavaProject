package com.company;
import java.util.ArrayList;

public class TipsList {
    ArrayList<Tip> tipsList = new ArrayList<>();

    public void addTip(Tip tip) {
        tipsList.add(tip);
    }

    public void viewAll(){
        if (tipsList.size() == 0){
            System.out.println("There are no tips to view right now.");
        } else {
            for (Tip i: tipsList){
                System.out.println(i);
            }
        }
    }
}
