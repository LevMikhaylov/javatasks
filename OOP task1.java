class Person{
    private String name;
    private int age;
    private String gender;
    public Person(String name, int age, String gender){
        this.name = name;
        this.age = age;
        this.gender = gender;
    }
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
    public String getGender(){
        return gender;
    }
    public void updateAge(){
        ++age;
    }
    public void updateName(String newName){
        this.name = newName;
    }
}
public class Main
{
    public static void main(String[] args) {
        Person person = new Person("Ринго Старр",23,"Мужчина");
        System.out.println("Имя: "+person.getName()+"\n"+"Возраст: "+person.getAge()+"\n"+"Пол: "+person.getGender()+"\n");
        person.updateAge();
        System.out.println("Имя: "+person.getName()+"\n"+"Возраст: "+person.getAge()+"\n"+"Пол: "+person.getGender()+"\n");
        person.updateName("Пол Маккартни");
        System.out.println("Имя: "+person.getName()+"\n"+"Возраст: "+person.getAge()+"\n"+"Пол: "+person.getGender()+"\n");
    }
}
