import java.util.ArrayList;

import TaskNotepad.Model.Task;
import TaskNotepad.Model.TaskPriority;
import TaskNotepad.Model.Sorters.SortTaskById;
import TaskNotepad.Model.Sorters.SortTaskByName;
import TaskNotepad.Model.Sorters.SortTaskByPriority;

public class Start {

    public static void main(String[] args) {
        ArrayList<Task> tasks = new ArrayList<>();
        Task t1 = new Task("Подумать о хорошем");
        Task t2 = new Task("Изучть программирование", TaskPriority.MEDIUM);
        Task t3 = new Task("ЯВдохнуть", TaskPriority.IMMEDIATE);
        Task t4 = new Task("Подумать о другом");
        Task t5 = new Task("Подумать о вечном");
        Task t6 = new Task("Подумать о вечном", TaskPriority.IMMEDIATE);
        Task t7 = new Task("Подумать о вечном", TaskPriority.MEDIUM);

        Task[] taskArr = { t1, t2, t5, t3, t4, t6, t7 };
        for (Task task : taskArr) {
            tasks.add(task);
        }

        System.out.println("Без сортировки (порядок как добавили)");
        for (Task task : tasks) {
            System.out.println(task);
        }
        
        System.out.println("\nСортировка по имени");
        tasks.sort(new SortTaskByName());
        for (Task task : tasks) {
            System.out.println(task);
        }
        
        System.out.println("\nСортировка по ID");
        tasks.sort(new SortTaskById());
        for (Task task : tasks) {
            System.out.println(task);
        }
        System.out.println("\nСортировка по приоритету потом по имени");
        tasks.sort(new SortTaskByPriority().thenComparing(new SortTaskByName()));
        for (Task task : tasks) {
            System.out.println(task);
        }

        tasks.sort(new SortTaskById());
        System.out.println("\nСортировка по приоритету (обратный порядок)");
        tasks.sort(new SortTaskByPriority().reversed());
        for (Task task : tasks) {
            System.out.println(task);
        }
    }
}