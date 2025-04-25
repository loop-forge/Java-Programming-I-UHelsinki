
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;

public class IndexOfSmallest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // implement here a program that reads user input
        // until the user enters 9999
        ArrayList<Integer> list = new ArrayList<Integer>();
        while (true) {
            int i = Integer.valueOf(scanner.nextLine());
            if (i == 9999) {
                break;
            }
            list.add(i);
        }

        // after that, the program prints the smallest number
        // and its index -- the smallest number
        // might appear multiple times
        int smallest = Collections.min(list);
        System.out.println("Smallest number: " + smallest);
        ArrayList<Integer> allIndexes = searchIndexesOf(list, smallest);
        if (allIndexes.size() > 0) {
            int i = 0;
            while (i < allIndexes.size()) {
                System.out.println("Found at index: " + allIndexes.get(i));
                i++;
            }
        }
    }

    public static ArrayList<Integer> searchIndexesOf(ArrayList<Integer> list, int search) {
        ArrayList<Integer> allIndexes = new ArrayList<Integer>();
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) == search) {
                allIndexes.add(i);
            }
        }
        return allIndexes;
    }
}
