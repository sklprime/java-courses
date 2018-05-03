// Создание объекта кот
package hw1.pkg1;

public class Cat {

    private String name;
    private String breed;
    private String color;
    private String sex;
    private int age;
    private double weight;
    private String food;

    public Cat(String name, String breed, String color, String sex, int age, double weight, String food) {
        this.name = name;
        this.breed = breed;
        this.color = color;
        this.sex = sex;
        this.age = age;
        this.weight = weight;
        this.food = food;
    }

    public Cat() {
    }

    void voice() {
        System.out.println("Мр-рррррррр");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getFood() {
        return food;
    }

    public void setFood(String food) {
        this.food = food;
    }

    @Override
    public String toString() {
        return "Cat{" + "name=" + name + ", breed=" + breed + ", color=" + color + ", sex=" + sex + ", age=" + age + ", weight=" + weight + ", food=" + food + '}';
    }
    
}
