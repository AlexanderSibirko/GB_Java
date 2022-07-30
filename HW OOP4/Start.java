import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

import TaskNotepad.ExportImport.CsvLoad;
import TaskNotepad.ExportImport.CsvSave;
import TaskNotepad.Model.ActiveUser;
import TaskNotepad.Model.ArrayListTaskRepo;
import TaskNotepad.Model.Person;
import TaskNotepad.Model.Task;
import TaskNotepad.Model.TaskPriority;
import TaskNotepad.Model.TaskRepo;
import TaskNotepad.Model.Sorters.SortTaskByDeadlineTime;
import TaskNotepad.Model.Sorters.SortTaskById;
import TaskNotepad.Model.Sorters.SortTaskByName;
import TaskNotepad.Model.Sorters.SortTaskByPriority;
import TaskNotepad.Presenter.Presenter;
import TaskNotepad.View.ConsoleView;
import TaskNotepad.View.View;

public class Start {

    public static void main(String[] args) {
        Presenter<TaskRepo<Task>, View> p1 = new Presenter<TaskRepo<Task>, View>(new ArrayListTaskRepo(),
                new ConsoleView());

        p1.start();

        /*
         * ActiveUser.setActiveUser(new Person("Александр", "Евгеньевич", "Сибирко"));
         * 
         * DateTimeFormatter myDayTimeFormat =
         * DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
         * 
         * ArrayListTaskRepo tasks = new ArrayListTaskRepo();
         * Task t1 = new Task("Подумать о хорошем");
         * Task t2 = new Task("Изучть программирование", TaskPriority.MEDIUM);
         * Task t3 = new Task("ЯВдохнуть", TaskPriority.IMMEDIATE);
         * Task t4 = new Task("Подумать о другом");
         * Task t5 = new Task("Подумать о вечном");
         * Task t6 = new Task("Подумать о вечном", TaskPriority.IMMEDIATE);
         * Task t7 = new Task("Подумать о вечном", TaskPriority.MEDIUM);
         * Task t8 = new Task("Подумать о вечном", "", TaskPriority.MEDIUM,
         * LocalDateTime.parse("16/05/2005 10:00", myDayTimeFormat));
         * Task t9 = new Task("Подумать", "", TaskPriority.IMMEDIATE,
         * LocalDateTime.parse("16/05/1960 10:00", myDayTimeFormat));
         * Task t10 = new Task("Подумать", "", TaskPriority.MEDIUM,
         * LocalDateTime.parse("16/05/1960 12:00", myDayTimeFormat));
         * 
         * Task[] taskArr = { t1, t2, t5, t3, t4, t6, t7, t8, t9, t10 };
         * for (Task task : taskArr) {
         * tasks.add(task);
         * }
         * ArrayList<Task> curTasks = tasks.getAll();
         * 
         * {// sort test block
         * System.out.println("Без сортировки (порядок как добавили)");
         * printArr(curTasks);
         * 
         * System.out.println("\nСортировка по имени");
         * curTasks.sort(new SortTaskByName());
         * printArr(curTasks);
         * 
         * System.out.println("\nСортировка по ID");
         * curTasks.sort(new SortTaskById());
         * printArr(curTasks);
         * 
         * System.out.println("\nСортировка по приоритету потом по имени");
         * curTasks.sort(new SortTaskByPriority().thenComparing(new SortTaskByName()));
         * printArr(curTasks);
         * 
         * curTasks.sort(new SortTaskById());
         * System.out.println("\nСортировка по приоритету (обратный порядок)");
         * curTasks.sort(new SortTaskByPriority().reversed());
         * printArr(curTasks);
         * 
         * System.out.println("\nСортировка по дедлайну");
         * curTasks.sort(new SortTaskByDeadlineTime());
         * printArr(curTasks);
         * 
         * System.out.println("\nСортировка по дедлайну");
         * curTasks.sort(new SortTaskByDeadlineTime().reversed());
         * printArr(curTasks);
         * }
         * 
         * {// save load test
         * tasks.getAll().sort(new SortTaskById());
         * tasks.save(new CsvSave(), "data.csv");
         * 
         * ArrayListTaskRepo tasks2 = new ArrayListTaskRepo();
         * System.out.println("___________________");
         * printArr(tasks2.getAll());
         * tasks2.load(new CsvLoad(), "data.csv");
         * System.out.println("___________________");
         * printArr(tasks2.getAll());
         */
    }

    /*
     * private static void printArr(ArrayList array) {
     * for (Object element : array) {
     * System.out.println(element);
     * }
     * }
     */

}