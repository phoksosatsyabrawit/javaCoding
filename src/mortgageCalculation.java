import java.text.NumberFormat;
import java.util.Scanner;

public class mortgageCalculation {
    public static void main(String[] args){
        final byte myPercentage = 100;
        NumberFormat myCurr = NumberFormat.getCurrencyInstance();

        Scanner myPrin = new Scanner(System.in);
        System.out.print("Principal: $");
        int principal = myPrin.nextInt();

        Scanner mymonthlyInterest = new Scanner(System.in);
        System.out.print("Monthly Interest: %");
        float monthlyInterest = mymonthlyInterest.nextFloat();

        Scanner myPer = new Scanner(System.in);
        System.out.print("Period: ");
        short period = myPer.nextShort();

        Scanner myDeposit = new Scanner(System.in);
        System.out.print("Deposit: %");
        short deposit = myDeposit.nextShort();

        int depositCal = principal - (principal * deposit / myPercentage);
        int myPeriod = period * 12;
        float sumprinplusInterest = depositCal * monthlyInterest * myPeriod / myPercentage;
        float mymonthlyPaid = sumprinplusInterest / period;

        System.out.println("Monthly Paid: " + myCurr.format(mymonthlyPaid));
    }
}
