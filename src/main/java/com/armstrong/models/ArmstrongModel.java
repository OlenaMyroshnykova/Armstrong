package main.java.com.armstrong.models;

public class ArmstrongModel {
  
    public boolean isArmstrong(int number) {
        int sum = 0;
        int originalNumber = number;
        int digitsCount = (int) Math.floor(Math.log10(number) + 1);

        while (number != 0) {
            int digit = number % 10;
            sum += Math.pow(digit, digitsCount);
            number /= 10;
        }

        return sum == originalNumber;
    }    

}
