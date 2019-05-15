import java.util.Scanner;
public class Draw {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice = -1;
        while (choice != 0) {
            System.out.println("Menu:");
            System.out.println("1. Print the rectangle");
            System.out.println("2. Print the square triangle");
            System.out.println("3.Print the isosceles triangle");
            System.out.println("0.Exit");
            System.out.println("Enter your choice:");
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    for (int i = 0; i < 5; i++) {
                        System.out.println();
                        for (int j = 0; j < 8; j++) {
                            System.out.print(" * ");
                        }
                    }
                    break;
                case 2:
                    for (int i = 1; i <= 5; i++) {
                        System.out.println();
                        for (int j = 1; j < i; j++) {
                            System.out.print(" * ");
                        }
                    }
                    break;
                case 3:
                    for (int i = 1; i < 7; i++) {
                        System.out.println();
                        for (int j = 1; j < 7 - i; j++) {
                            System.out.print(" ");
                        }
                        for (int k = 1; k < 2 * i - 1; k++) {
                            System.out.print("*");
                        }
                    }
                    break;
                case 0:
                    System.exit(0);
            }

        }


    }
}
