public class TrainFilter {
    private Train[] list;
    TrainFilter(Train[] list) {
        this.list = list;
    }

    public void getTrainsWithType(String type) {
        for (Train train: list) {
            if (train.getPlaces()[type] > 0) {
                System.out.println(train.getDestination());
            }
        }
    }
}
