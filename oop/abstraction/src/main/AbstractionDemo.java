package main;

public class AbstractionDemo {
    
    public static void main(String [] args) {
        Salary s = new Salary("Tony Stark", "Marvel", 3);
        Employee e = new Salary("John Adams", "Boston, MA", 2);
        System.out.println("Call mailCheck using Salary reference --");
        s.mailCheck();
        System.out.println("\n Call mailCheck using Employee reference--");
        e.mailCheck();
    }
}
