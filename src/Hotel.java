import java.util.ArrayList;

public class Hotel {

    private String name;
    private Integer cost;
    private boolean poolExist;
    private boolean childOK;
    private boolean suiteExist;
    private ArrayList<String> hotelInfo = new ArrayList<>();

    public Hotel(String name) {
        this.name = name;
        //this.hotelInfo = arrayList;
    }

    public void setPoolStatusTrue(boolean bool) {
        poolExist = true;
    }

}



