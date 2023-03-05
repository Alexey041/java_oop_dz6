import java.util.ArrayList;
import java.util.List;

public class Planner<T extends Tasks> {
    private List<T> tasks = new ArrayList<>();

    public List<T> getTasks() {
        return tasks;
    }

    public Planner(List<T> tasks) {
        this.tasks = tasks;
    }

    public void addTask(T someTask){
        tasks.add(someTask);
    }
    public void removeTask(T someTask){
        tasks.remove(someTask);
    }

    public void merge(Planner<T> newPlanner){
        tasks.addAll(newPlanner.getTasks());
    }

    public String toString(List<T> tasks) {
        return tasks.toString();
    }
}
