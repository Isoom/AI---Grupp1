import java.util.ArrayList;

public class Hotel {
    private String name;
    int cost;
    int index;
    String country;
    boolean kidsAllowed;
    boolean poolExist;
    boolean suiteExist;

    private ArrayList<String> hotelInfo = new ArrayList<>();

    /**
     * Constructs a new Hotel instance with the specified attributes.
     *
     * @param index The index or ID of the hotel.
     * @param name The name of the hotel.
     * @param country The country where the hotel is located.
     * @param cost The cost per stay at the hotel.
     * @param poolExist Whether the hotel has a pool.
     * @param kidsAllowed Whether children are allowed at the hotel.
     * @param suiteExist Whether the hotel has suites available.
     */
    public Hotel(int index, String name, String country, int cost, boolean poolExist, boolean kidsAllowed, boolean suiteExist) {
        this.index = index;
        this.name = name;
        this.cost = cost;
        this.country = country;
        this.kidsAllowed = kidsAllowed;
        this.poolExist = poolExist;
        this.suiteExist = suiteExist;
    }

    /**
     * Gets the name of the hotel.
     *
     * @return The name of the hotel.
     */
    public String getHotelName() {
        return this.name;
    }

    /**
     * Gets the country where the hotel is located.
     *
     * @return The country of the hotel.
     */
    public String getHotelCountry() {
        return this.country;
    }
}