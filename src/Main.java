import java.io.File;
import java.util.Scanner;

class Main {
    // Store user input from the scanner?
    String input;

    /**
     * Method to take input from the user regarding their hotel search.
     */
    public void MainScanner() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Vad söker du för hotell idag?");
        String input = scanner.nextLine();
    }


    public static void main(String[] args) throws Exception {
        // Create a Program object using a Scanner that reads from the file passed as the first argument
        Program program = new Program(new Scanner(new File(args[0])));

        // Just nu för att display information?
        program.displayKBInfo();
        program.sumDisplayHotel();


    }

}



