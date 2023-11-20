package serialization;

import java.io.Serializable;

public class Q1 implements Serializable {
    private static final long serialVersionUID = 1L; // Serialization version UID

    private String name;
     private int age;

    public Q1(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Q1{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
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
        this.age = age;
    }
}
