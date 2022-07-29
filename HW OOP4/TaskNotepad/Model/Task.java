package TaskNotepad.Model;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Task {
    private int id;
    private String name;
    private String description;
    private TaskPriority priority;
    private LocalDateTime createdDateTime;
   
    /**
     * Конструктор задач
     * @param name - имя (обязательно для создания)
     * @param description - описание (По умолчанию: "")
     * @param taskPriority - уровень приоритета (По умолчанию: TaskPriority.LOW)
     */
    public Task(String name, String description, TaskPriority taskPriority) {
        this.id = TaskId.nextId();
        this.name = name;
        this.description = description;
        this.priority = taskPriority;
        this.createdDateTime = LocalDateTime.now();
    }
    public Task(String name, String description) {
        this(name, description, TaskPriority.LOW);
    }
    public Task(String name, TaskPriority taskPriority) {
        this(name, "", taskPriority);
    }
    public Task(String name) {
        this(name, "");
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }

    public TaskPriority getPriority() {
        return priority;
    }
    public void setPriority(TaskPriority taskPriority) {
        this.priority = taskPriority;
    }

    public LocalDateTime getCreatedDateTime() {
        return createdDateTime;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("id:")
                .append(id)
                .append("; Name: ")
                .append(name)
                .append("; Text: ")
                .append(description)
                .append("; Prio: ")
                .append(priority)
                .append("; Text: ")
                .append(createdDateTime.format(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss.SSS")).toString());
        return sb.toString();
    }
}
