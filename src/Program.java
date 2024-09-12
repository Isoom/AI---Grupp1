import java.lang.reflect.Array;
import java.util.ArrayList;

public class Program {
    private ArrayList<String> KBdata = new ArrayList<>();
    private int amountOfHotels; //how many hotels base of KB
    private int amountOfAttributes = 6; //how many attributes the kB has


    public Program(java.util.Scanner KBscanner) throws Exception {
        amountOfHotels = KBscanner.nextInt();
        System.out.println(amountOfHotels); //print how many hotels we have (based from KB)
        while (KBscanner.hasNextLine()) {
            String line = KBscanner.nextLine();
            if (!line.equals("#")) {
                KBdata.add(line);
                /*
                if (line.equals("country: "))
                    System.out.println(line);
                KBdata.add(line);

                 */
            }
            else {
                if (line.equals("country: "))
                    System.out.println(line);
                KBdata.add(line);
            }


            /*
            for (int i = 0; i < amountOfLinesInKB; i++) {
                ArrayList<String> Hotel = new ArrayList<>();
                Hotel.add(line);

            }
            */
        }

    }

    public void displayKBInfo() {
        for (int i = 0; i < KBdata.size(); i++) {
            System.out.println(KBdata.get(i));
        }

    }



}
