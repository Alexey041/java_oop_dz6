public class Reminder extends Tasks {
    private double startTime;
    private double stopTime;

    public Reminder(String name, String description, double startTime, double stopTime) {
        super(name, description);
        this.startTime = startTime;
        this.stopTime = stopTime;
    }
    
    public double getStartTime() {
        return startTime;
    }
    public void setStartTime(double startTime) {
        this.startTime = startTime;
    }

    public double getStopTime() {
        return stopTime;
    }
    public void setStopTime(double stopTime) {
        this.stopTime = stopTime;
    }
    @Override
    public String toString() {
        return super.toString() + ", начало: " + startTime + ", конец: " + stopTime;
    }

    
}
