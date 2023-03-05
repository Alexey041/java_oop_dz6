import java.util.ArrayList;

/**
 * Main
 */
public class Main {

    public static void main(String[] args) {
        Meeting meeting = new Meeting("Пати", "Тусуем на хате", 21, "У Эрика");
        Meeting meeting2 = new Meeting("Собеседование", "На работу", 10.30, "<Улица>");
        Reminder reminder = new Reminder("Купить воды", "Не забыть", 12, 13);
        Planner<Meeting> meetingList = new Planner(new ArrayList<>());
        Planner<Reminder> reminderList = new Planner(new ArrayList<>());

        meetingList.addTask(meeting);
        meetingList.addTask(meeting2);
        reminderList.addTask(reminder);

        System.out.println(meetingList.toString());

    }
}