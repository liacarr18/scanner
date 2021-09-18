import java.util.Scanner;

public class square {
        public static void main(String[] args){
            Scanner scanner = new Scanner(System.in);

            int side = 0;
            int area = 0;
            int perimeter = 0;

            System.out.println("Enter the length of side of a Square");
            side = scanner.nextInt();

            area = side * side;
            perimeter = 4 * side;

            System.out.println("The area of the square is: " + area);
            System.out.println("The perimeter of the square is: " + perimeter);
        }
    }

