package spring_pratice;

public class get_set_01 {

    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public void setAge(int age) {
        this.age = age;
    }

    public static void main(String[] args) {
        get_set_01 person = new get_set_01();
        person.setName("Stuti");
        person.setAge(23);  

        System.out.println("Name: " + person.getName());
        System.out.println("Age: " + person.getAge());
    }
}
