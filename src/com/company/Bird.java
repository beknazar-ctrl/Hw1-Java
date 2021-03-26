package com.company;

public class Bird  extends Animals{
    private Color color;
    private String from;

    public Color getColor() {
        return color;
    }

    public String getFrom() {
        return from;
    }

    public Bird(String bread, int weight, Color color, String from) {
        super(bread, weight);
        this.color = color;
        this.from = from;
    }

    public void makevoice(int x) {
        for (int i = 0; i < x; i++) {
            System.out.println("makevoice  "+i);
        }


    }

    public final void makevoice(String voice){
        System.out.println("voice "+voice);


    }
    public String getInfo(){
        return "Порода-"+getBread()+"\nСвет-"+color+"\n"+from;
    }

}
