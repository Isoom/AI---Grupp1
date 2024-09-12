import java.io.File;
import java.util.Scanner;

class Main {

    String input;

    public void MainScanner() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Vad söker du för hotell idag?");
        String input = scanner.nextLine();
    }


    public static void main(String[] args) throws Exception {
        Program program = new Program(new Scanner(new File(args[0])));
        program.displayKBInfo();
        program.sumDisplayHotel();


    }

}



