
enum Gender{M,F};

public class Person {

    String name;
    int age;
    Gender gender;
    String address;

    public String getName() {

        System.out.println("In name getter");
        return name;
    }

    public void setName(String name) {

        System.out.println("In name setter");
        this.name = name;
    }

    public int getAge() {

        System.out.println("In age getter");
        return age;
    }

    public void setAge(int age) {

        System.out.println("In age setter");
        this.age = age;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", address='" + address + '\'' +
                '}';
    }
}
