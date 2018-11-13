import java.time.LocalTime;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
       Train kyiv = new Train("Kyiv", LocalTime.parse("16:30"), new Places(0,5,7,8));
       Train odessa = new Train("Odessa", LocalTime.parse("12:14"), new Places(2,4,6,9));
       Train odessa1 = new Train("Odessa", LocalTime.parse("16:48"), new Places(2,4,6,9));
       Train lutsk = new Train("Lutsk", LocalTime.parse("07:40"), new Places(3,3,5,10));
       Train praga = new Train("Praga", LocalTime.parse("13:22"), new Places(0,2,4,11));
       Train poltava = new Train("Poltava", LocalTime.parse("14:15"), new Places(5,1,3,12));

        ArrayList<Train> trainList = new ArrayList<>();
        trainList.add(kyiv);
        trainList.add(odessa);
        trainList.add(odessa1);
        trainList.add(lutsk);
        trainList.add(praga);
        trainList.add(poltava);

       for (Train train : trainList) {
          if (train.getPlaces().generalCount > 0) {
              System.out.println(train.getDestination());
          }
       }

       System.out.println(" ");
       for (Train train : trainList) {
            if (train.getDestination().equals("Odessa") ||
                    train.getTime().isAfter(LocalTime.parse("14:00"))) {
                System.out.println(train.getDestination() + " - " + train.getTime());
            }
        }
    }
}
