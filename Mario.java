import java.util.Scanner;

public class Mario{
    public static void main(String[] args) {
        Scanner UserInput = new Scanner(System.in);
        System.out.print("Enter the number of rows to print out: ");
        int num_rows = Integer.parseInt(UserInput.nextLine());
        print_blocks(num_rows);
    }

    public static void print_blocks(int num_rows) {
        int num_spaces = num_rows - 1;
        int num_hashes = 1;
        for (int i = 0; i < num_rows; i++) {
            print_row(num_spaces, num_hashes);
            num_spaces--;
            num_hashes++;
        }
    }

    public static void print_row(int num_spaces, int num_hashes) {
        for (int j = 0; j < num_spaces; j++) {
                System.out.print(' ');
            }

            for (int j = 0; j < num_hashes; j++) {
                System.out.print('#');
            }
            
            System.out.print("  ");

            for (int j = 0; j < num_hashes; j++) {
                System.out.print('#');
            }

            for (int j = 0; j < num_spaces; j++) {
                System.out.print(' ');
            }
            System.out.println();
    }
}