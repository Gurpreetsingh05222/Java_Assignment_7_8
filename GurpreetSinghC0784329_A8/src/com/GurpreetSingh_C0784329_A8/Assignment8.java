package com.GurpreetSingh_C0784329_A8;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Locale;

public class Assignment8 {
    public static void main(String[] args) {
        Weather w = new Weather();
        String day=w.getDay();
        StringBuilder week=new StringBuilder();
        week.append(day);
        float temperature = w.getTemperature();
        StringBuilder temperature1=new StringBuilder();
        temperature1.append(temperature1);
        float wind = w.getWindSpeed();
        StringBuilder windSpeed=new StringBuilder();
        windSpeed.append(wind);
        ArrayList<StringBuilder> list = new ArrayList<>();
        list.add(week);
        list.add(temperature1);
        list.add(windSpeed);
        w.calcFeelLikeTemperature();
    }
}



