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

    public Hotel(int index, String name, String country, int cost, boolean poolExist, boolean kidsAllowed, boolean suiteExist) {
        this.index = index;
        this.name = name;
        this.cost = cost;
        this.country = country;
        this.kidsAllowed = kidsAllowed;
        this.poolExist = poolExist;
        this.suiteExist = suiteExist;
    }

    public String getHotelName() {
        return this.name;
    }
    public String getHotelCountry() {
        return this.country;
    }



}



