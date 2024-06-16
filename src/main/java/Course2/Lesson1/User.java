package Course2.Lesson1;

public abstract class User {

    private int id;
    private String name;
    private int age;

    // Стандартный конструктор, пустой
    public User() {

    }

    // Параметрезованный конструктор
    public User(int id, String name) {     // Сигнатура - (int id, String name)
        this.id = id;                      // Перегрузка методов - методы с разной сигнатурой, но с одинаковым именем
        this.name = name;
    }

    public User(int id) {
        this(id, "default name");
    }

    // Getter & Setter.
    // Getter - (читающий метод) метод чтения, метод, позволяющий получить данные, доступ к которым напрямую ограничен
    // Setter - (модифицирующий метод) метод, используемый в объектно-ориентированном программировании для присвоения какого-либо значения инкапсулированному полю
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age > 0) {
            this.age = age;
        }
    }

    public abstract void doAction();

    String info() {
        return this.toString();
    }

    public int getAgeBefore18() {
        if (age >= 18) {
            return 0;
        } else {
            return 18 - age;
        }
    }
}
