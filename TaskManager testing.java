import java.time.LocalDate;
import java.util.List;
import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int point;
        TaskManager taskManager = new TaskManager();
        do{
            System.out.println("Меню"+"\n"+"1. Добавление задачи"+"\n"+"2. Удаление задачи по индексу"+"\n"+"3. Поиск задач по названию"+"\n"+"4. Поиск задач по дате формирования"+"\n"+"5. Вывод задач"+"\n"+"6. Выход");
            point = s.nextInt();
            switch (point){
                case 1:
                    System.out.println("Введите имя задачи");
                    String name = s.next();
                    System.out.println("Введите год формирования задачи");
                    int create_year = s.nextInt();
                    System.out.println("Введите номер месяца формирования задачи");
                    int month_number = s.nextInt();
                    System.out.println("Введите день формирования задачи");
                    int day = s.nextInt();
                    LocalDate create_date = LocalDate.of(create_year, month_number, day);
                    try {
                        taskManager.addTask(new Task(name, create_date));
                    } catch (IllegalAccessException e) {
                        System.out.println(e.getMessage());
                    } catch (Exception e) {
                        System.out.println(e.getMessage());;
                    }
                    break;
                case 2:
                    System.out.println("Введите индекс задачи");
                    int id = s.nextInt();
                    taskManager.removeTask(id);
                    taskManager.showTasks();
                    break;
                case 3:
                    System.out.println("Введите имя задачи");
                    String name1 = s.next();
                    List<Task>foundTasksByName = taskManager.findTaskByName(name1);
                    for(Task t:foundTasksByName){
                        System.out.println(t.getName()+" "+t.getCreate_date());
                    }
                    break;
                case 4:
                    System.out.println("Введите год формирования задачи");
                    int create_year1 = s.nextInt();
                    System.out.println("Введите номер месяца формирования задачи");
                    int month_number1 = s.nextInt();
                    System.out.println("Введите день формирования задачи");
                    int day1 = s.nextInt();
                    LocalDate create_date1 = LocalDate.of(create_year1,month_number1,day1);
                    List<Task> foundTasksByCreateDate = taskManager.findTaskByCreateDate(create_date1);
                    for(Task t:foundTasksByCreateDate){
                        System.out.println(t.getName()+" "+t.getCreate_date());
                    }
                    break;
                case 5:
                    taskManager.showTasks();
                    break;
                case 6:
                    System.out.println("Вы вышли из программы");
                    break;
                default:
                    System.out.println("Повтроите,пожалуйста,ввод");
                    break;
            }
        }while(point != 6);
    }
}
