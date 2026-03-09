
import java.lang.String;
import java.awt.*;
import java.text.NumberFormat;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        NumberFormat currency = NumberFormat.getPercentInstance();
        String myCurr = currency.format(12);
        String myPer = NumberFormat.getPercentInstance().format(0.1);
        String myName = "local.brawit";
        String myPath = "C:\\Users\\local.brawit\\Outlook\\archives.pst";
        int myNum = 26;
        double result = Math.floor(1.1f);
        int myRes = (int) Math.floor(2.1f);
        double myResu = Math.random() * 2;
        Point p1 = new Point(1,1);
        p1.x = 3;
        System.out.println("Name: " + myName);
        System.out.println("Age: " + myNum);
        System.out.println(p1);
        System.out.println(myPath);
        System.out.println(result);
        System.out.println(myRes);
        System.out.println(myResu);
        System.out.println(myCurr);
        System.out.println(myPer);
        Scanner myScan = new Scanner(System.in);
        System.out.print("Enter you Name:");
        String myNe = myScan.nextLine().trim();
        System.out.println("Name:" + myNe);
    }
}