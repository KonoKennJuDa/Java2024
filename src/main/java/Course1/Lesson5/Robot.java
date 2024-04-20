package Course1.Lesson5;

public class Robot {

    private String name;
    private int age;

    public Robot(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void info() {
        System.out.println("name = " + name + " age = " + age);
    }
}
