
public class AdvancedAstrology {

    public static void printStars(int number) {
        // part 1 of the exercise
         for(int i = 0; i < number ; i++) {
            System.out.print("*");
        }
        System.out.println("");
    }

    public static void printSpaces(int number) {
        // part 1 of the exercise
        for (int i = 0; i <= number; i++) {
            System.out.print(" ");
        }
    }

    public static void printTriangle(int size) {
        // part 2 of the exercise
        int end = size;
        for(int i = 1; i <= size ; i++) {
            printSpaces(end);
            printStars(i);
            end--;
        }
    }

    public static void printInvertedTriangle(int size) {
        // part 2 of the exercise
        for(int i = 1; i <= size ; i++) {
            printSpaces(size);
            printStars(i);
        }
    }

    public static void christmasTree(int height) {
        // part 3 of the exercise
        
        printTriangle(height);
        printInvertedTriangle(height);
        printSpaces(height);
        printStars(3);
        printSpaces(height);
        printStars(3);
    }

    public static void main(String[] args) {
        // The tests are not checking the main, so you can modify it freely.

        printTriangle(5);
        System.out.println("---");
        christmasTree(4);
        System.out.println("---");
        christmasTree(10);
    }
}
