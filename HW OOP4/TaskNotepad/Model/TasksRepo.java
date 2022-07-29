package TaskNotepad.Model;

public interface TasksRepo {
    void add(Task task);
    Task getById(int id);
    Task getByName(String name);
    Task[] getAll();
    void updateById(int id, Task task);
    void updateByName(String name, Task task);
    void removeById(int id);
    void removeByName(String name);
}
