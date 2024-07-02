package Course2.Lesson3;

import java.util.Objects;

public class User implements Comparable<User> {

    private int age;

    public User(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return age == user.age;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(age);
    }

    @Override
    public String toString() {
        return "User{" +
                "age = " + age +
                '}';
    }

    @Override
    public int compareTo(User o) {          // <0 усли меньше 0 если равны >0 если больше
        return this.age - o.getAge();
    }
}
