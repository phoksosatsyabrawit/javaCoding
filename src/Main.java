//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import javax.sql.PooledConnection;
import java.lang.String;
import java.awt.*;

public class Main {
    public static void main(String[] args){
        String myName = "local.brawit";
        int myNum = 26;
        Point p1 = new Point(1,1);
        Point p3 = p1;
        p1.x = 3;
        System.out.println("Name: " + myName);
        System.out.println("Age: " + myNum);
        System.out.println(p1);
    }
}