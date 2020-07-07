import java.util.Scanner;

class Basic {
    public static void main(String args[]){  
    System.out.println("Hello Java");  

    Scanner reader = new Scanner(System.in);
    System.out.print("Enter a number: ");

    // nextInt() reads the next integer from the keyboard
    int number = reader.nextInt();
        // HEllo
    
    // println() prints the following line to the output screen
    System.out.println("You entered: " + number);
    }  
}   