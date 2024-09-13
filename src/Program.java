import java.lang.module.FindException;
import java.lang.reflect.Array;
import java.util.ArrayList;

/**
 * Reads hotel information from a knowledge base (KB) and manages the data.
 */
public class Program {
    // List of untouched data from the KB
    private ArrayList<String> KBdata = new ArrayList<>();
    private int amountOfHotels;
    private int amountOfAttributes = 5; // no. of attribute
    private int KBLenght; // Length of KB

    private ArrayList<String> countryList = new ArrayList<>();
    private ArrayList<String> hotelNameList = new ArrayList<>();
    private ArrayList<String> costList = new ArrayList<>(); //The arraylist that holds the cost for every hotel
    private ArrayList<String> poolExistList = new ArrayList<>();
    private ArrayList<String> kidsAllowedList = new ArrayList<>();
    private ArrayList<String> suitExistList = new ArrayList<>();

    //Ett förlsag för att göra koden snyggare, är att man tänker som med OU4 graf.
    // ALltenrativet är att attributen är som flygplatserna, deras grannar är deras attribut.
    // SÅ om man kollar efter ett hotell i spanien, har spanien 4 grannar. Utifrån vad användaren ber om får den gå igenom varje hotell och se så alla sttribut stämmer.
    // OM man orkar.

    /**
     * Constructor that initializes the program by reading hotel data from a Scanner.
     *
     * @param KBscanner A scanner object that reads from the knowledge base.
     * @throws Exception If there is an issue while reading the knowledge base.
     */
    public Program(java.util.Scanner KBscanner) throws Exception {
        amountOfHotels = KBscanner.nextInt();
        System.out.println("Amount of hotels in KB: "+amountOfHotels); //print how many hotels we have (based from KB)

        //I denna funktion ska man fixa att kunna dela upp chars, så man inte tar onödiga delar.
        //se om man kan split en string
        int index = 0;
        while (KBscanner.hasNextLine()) {
            String line = KBscanner.nextLine();

            //line = getLastWordUsingSplit(line); //splitter
            String newLine = getLastWordUsingSubString(line);

            if (line.equals("#")) {
                index++;
            }
            if (line.startsWith("name")) {
                hotelNameList.add(index,newLine);
            }
            if (line.startsWith("country")) {
                countryList.add(index, newLine);
            }
            if (line.startsWith("cost")) {
                costList.add(index, newLine);
            }
            if (line.startsWith("pool")) {
                poolExistList.add(index, newLine);
            }
            if (line.startsWith("kids")) {
                kidsAllowedList.add(index, newLine);
            }
            if (line.startsWith("suite")) {
                suitExistList.add(index, newLine);
            }

        }
    }

    /**
     * Converts a string to an integer.
     *
     * @param string The string to convert.
     * @return The integer value of the string.
     */
    private int StringToInt(String string) {
        return Integer.parseInt(string);
    }

    /**
     * Converts a string to a boolean.
     *
     * @param string The string to convert.
     * @return The boolean value of the string.
     */
    private boolean StringToBoolean(String string) {
        return Boolean.parseBoolean(string);
    }

    /**
     * Extracts the last word from a string using substring method.
     *
     * @param input The input string.
     * @return The last word of the string.
     */
    public String getLastWordUsingSubString(String input) {
        return input.substring(input.lastIndexOf(" ") + 1);
    }

    /**
     * Displays all hotel information stored in the knowledge base.
     */
    public void displayKBInfo() {
        for (int i = 0; i < amountOfHotels; i++) {
            System.out.println(
                    "On index: [" + i + "] "
                            + hotelNameList.get(i) +" | "+ countryList.get(i) +" | "+ costList.get(i) +" | "+ poolExistList.get(i) +" | "+ kidsAllowedList.get(i) +" | "+ suitExistList.get(i)
            );

        }
    }

    /**
     * Creates Hotel objects from the knowledge base and displays hotel information.
     */
    public void sumDisplayHotel() {
        for (int i = 0; i < amountOfHotels; i++) {
            String hotelName = hotelNameList.get(i);
            String hotelCountry = countryList.get(i);
            int hotelCost = StringToInt(costList.get(i));
            boolean poolAllowed = StringToBoolean(poolExistList.get(i));
            boolean kidsAllowed = StringToBoolean(kidsAllowedList.get(i));
            boolean suiteExist = StringToBoolean(suitExistList.get(i));

            // Create Hotel object and display its name
            Hotel hotel = new Hotel(i, hotelName, hotelCountry, hotelCost, poolAllowed,kidsAllowed, suiteExist);
            System.out.println(hotel + " name is:  "+ hotel.getHotelName());
        }
    }
}
