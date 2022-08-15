package homework_1;

public class Prince {

    private String name;
    private int age;
    private int shoeSize;

    public Prince(String name, int age, int shoeSize) {
        this.name = name;
        this.age = age;
        this.shoeSize = shoeSize;
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

    public int getShoeSize() {
        return shoeSize;
    }

    public void setShoeSize(int shoeSize) {
        this.shoeSize = shoeSize;
    }

    @Override
    public String toString() {
        return "Prince{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", shoeSize=" + shoeSize +
                '}';
    }
}
