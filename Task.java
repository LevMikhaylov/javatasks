import java.time.LocalDate;

public class Task {
    private String name;
    private LocalDate create_date;
    public Task(String name, LocalDate create_date) throws Exception{
        this.name = name;
        if(create_date.isAfter(LocalDate.now())||create_date.equals(LocalDate.now())){
            this.create_date = create_date;
        }
        else{
            throw new Exception("Дата формирования задачи должна быть после текущей даты или равна ей");
        }
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getCreate_date() {
        return create_date;
    }

    public void setCreate_date(LocalDate create_date) {
        this.create_date = create_date;
    }
}
