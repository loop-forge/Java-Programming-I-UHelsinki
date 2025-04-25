
import java.util.Scanner;

public class GiftTax {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Value of the gift?");
        double gift = Double.valueOf(scan.nextLine());
        double giftPercentage = 0;
        double giftValue = 0;

        if (gift < 5000) {
            giftPercentage = 0;
        } else if (gift > 4999 && gift < 25000) {
            giftPercentage = 0.08;
            giftValue = 100 + ((gift-5000)*giftPercentage);
        } else if(gift > 24999 && gift < 55000) {
            giftPercentage = 0.1;
            giftValue = 1700 + ((gift-25000)*giftPercentage);
        } else if(gift > 54999 && gift < 200000) {
            giftPercentage = 0.12;
            giftValue = 4700 + ((gift-55000)*giftPercentage);
        } else if(gift > 199999 && gift < 1000000) {
            giftPercentage = 0.15;
            giftValue = 22100 + ((gift-200000)*giftPercentage);
        } else if(gift > 999999) {
            giftPercentage = 0.17;
            giftValue = 142100 + ((gift-1000000)*giftPercentage);
        }
        
        if (giftPercentage == 0) {
            System.out.println("No tax!");
        } else {
            System.out.println("Tax: " + giftValue);
        }
            
    }
}
