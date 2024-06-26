import java.util.*;
public class Program {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        
        Pen p1 = new Pen(); // Created a new object called p1
        p1.setColor("blue");
        System.out.println(p1.color);
    }
}

class Pen {
    String color;
    int tip;

    void setColor(String newColor) {
        color = newColor;
    }

    void setTip(int newTip) {
        tip = newTip;
    }
}