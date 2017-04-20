public class MainApp {

    public static void main(String[] args) {

        Person person = new Person();

        person.setName("Sargam");
        person.setAge(23);
        person.setGender(Gender.F);
        person.setAddress("Delhi-34");

        System.out.println(person.getName() + " " +person.getAge() +" " +person.getGender() +" " +person.getAddress());
    }
}
