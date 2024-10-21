import java.time.LocalDate;
import java.util.List;
import java.util.ArrayList;
public class TaskManager {
    private List<Task>tasks;
    public TaskManager() {
        this.tasks = new ArrayList<>();
    }
    public void addTask(Task newTask) throws IllegalArgumentException{
        for(Task t1:tasks){
            if(t1.getName().equals(newTask.getName()) && t1.getCreate_date().equals(newTask.getCreate_date())){
                throw new IllegalArgumentException("Такая задача уже существует!");
            }
        }
        tasks.add(newTask);

    }
    public void removeTask(int id){
        tasks.remove(id);;
    }
    public List<Task> findTaskByName(String name){
        List<Task>foundTasks = new ArrayList<>();
        for(Task t:tasks){
            if(t.getName().equals(name)){
                foundTasks.add(t);
            }
        }
        return foundTasks;
    }
    public List<Task> findTaskByCreateDate(LocalDate create_date){
        List<Task>foundTasksByCreateDate = new ArrayList<>();
        for(Task t:tasks){
            if(t.getCreate_date().equals(create_date)){
                foundTasksByCreateDate.add(t);
            }
        }
        return foundTasksByCreateDate;
    }
    public void showTasks(){
        for(Task t:tasks){
            System.out.println(t.getName()+" "+t.getCreate_date());
        }
    }
}
