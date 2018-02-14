package model;

public class Mensaje {


    private String text;
    private static long adder = 0;

    public Mensaje(String text) {
        this.text = text;
        adder++;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public static long getAdder() {
        return adder;
    }

    public static void setAdder(long adder) {
        Mensaje.adder = adder;
    }


    //Additional methods
    public String personalize (String additionalMesage){
        return getText() + " " + additionalMesage;
    }





}
