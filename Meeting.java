public class Meeting extends Tasks {

    private double startTime;
    private String place;

    public Meeting(String name, String description, double startTime, String place) {
        super(name, description);
        this.startTime = startTime;
        this.place = place;
    }

    public double getStartTime() {
        return startTime;
    }
    public void setStartTime(double startTime) {
        this.startTime = startTime;
    }
    
    public String getPlace() {
        return place;
    }
    public void setPlace(String place) {
        this.place = place;
    }

    @Override
    public String toString() {
        return super.toString() + ", начало: " + startTime + ", место: " + place;
    }
    
}
