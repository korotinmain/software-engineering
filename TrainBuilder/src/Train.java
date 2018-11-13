import java.time.LocalTime;

public class Train {

    private String destination;
    private LocalTime time;
    private Places places;

    Train(String destination, LocalTime time, Places places){
        this.destination = destination;
        this.places = places;
        this.time = time;
    }

    public Places getPlaces() {
        return places;
    }

    public String getDestination() {
        return destination;
    }

    public LocalTime getTime() {
        return time;
    }
}
