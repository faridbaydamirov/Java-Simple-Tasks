package Tasks;

public class Person {
    String name;
    String age;

    public Person(String name, String age) {
        this.name = name;
        this.age = age;
    }
    public void Introduce() {
       System.out.println("Name : "+name);
       System.out.println("Age : "+age);
    }
    public static void main(String[] args) {
        Person person1 = new Person("Farid", "Baydamirov");
        Person person2 = new Person ("Mauro","Icardi");
        person1.Introduce();
        person2.Introduce();
    }
}