package classes;

public abstract class Human {
    private int age;
    private String name;
    private String secondName;

    protected Human(int age, String name, String secondName){
        this.age = age;
        this.name = name;
        this.secondName = secondName;
    }
    public final int getAge() {
        return age;
    }

    public final String getName() {
        return name;
    }

    public final String getSecondName() {
        return secondName;
    }

    public final void setName(String name) {
        this.name = name;
    }

    public final void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public final void setAge(int age) {
        this.age = age;
    }
}
