package com.sample;

public class City {
    private State state;
    private String cityName;

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public void displayInfo() {
        System.out.println("City: " + cityName + " is in State: " + state.getName());
    }
}

class State {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "State [name=" + name + "]";
    }
}
