package com.company;

public class Egle extends Bird{
    private int flySpeed;
    private String name;

    public Egle(String bread, int weight, Color color, String from, int flySpeed) {
        super(bread, weight, color, from);
        this.flySpeed = flySpeed;
    }
    public String getName(){
        return name;

    }

    public int getFlySpeed() {
        return flySpeed;
    }
    public String getInfo(){
        return getBread()+"\n"+getWeight(15)+"\n"+getColor()+"\n"+getFrom()+"\nСкорость-"+flySpeed;
    }

}
