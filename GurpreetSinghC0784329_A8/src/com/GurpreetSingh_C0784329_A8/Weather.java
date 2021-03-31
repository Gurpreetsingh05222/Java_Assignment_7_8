package com.GurpreetSingh_C0784329_A8;

import javax.swing.*;
import java.util.Locale;

public class Weather {
    String day;
    float temperature;
    float windSpeed;
    double feelLikeTemperature;

    public Weather() {
    }

    public Weather(String day, float temperature, float windSpeed) {
        this.day = day;
        this.temperature = temperature;
        this.windSpeed = windSpeed;
    }

    public String getDay() {
        day = JOptionPane.showInputDialog(null, "Welcome \nPlease enter day of week").toLowerCase(Locale.ROOT);
        return day;
    }

    public void setDay(String day) {
        this.day = day;
    }

    public float getTemperature() {
        temperature = Float.parseFloat(JOptionPane.showInputDialog(null, "Please enter temperature"));
        return temperature;
    }

    public void setTemperature(float temperature) {
        this.temperature = temperature;
    }

    public float getWindSpeed() {
        windSpeed = Float.parseFloat(JOptionPane.showInputDialog(null, "Please enter windSpeed"));
        return windSpeed;
    }

    public void setWindSpeed(float windSpeed) {
        this.windSpeed = windSpeed;
    }

    public double calcFeelLikeTemperature(){
        this.feelLikeTemperature=this.windSpeed*this.temperature;
        JOptionPane.showMessageDialog(null,"Feel like temperature on " + day +" is "+this.feelLikeTemperature);
        return feelLikeTemperature;
    }
}
