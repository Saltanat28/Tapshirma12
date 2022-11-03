public class Main {
    public static void main(String[] args) {
        System.out.println(" Cars"+
        "\n~~~~~~~~~~~~~~~~~~~");
        Car car =new Car();
        car.setName(" Toyota");
        car.setMarka(" Croun");
        car.setPower(5);

        Car car1 =new Car();
        car1.setName(" Toyota");
        car1.setMarka(" isst");
        car1.setPower(6);

        Car car2 =new Car();
        car2.setName(" Toyota");
        car2.setMarka(" camry  ");
        car2.setPower(4);
        Car [] cars = {car, car1,car2};
        for (Car car3: cars) {
            System.out.println(car3.getName());
            System.out.println(car3.getMarka());
            System.out.println(car3.getPower());
        }
        System.out.println(" Universities" +
                "\n~~~~~~~~~~~~~~~~~~~~~~~~~~~");

            University university = new University();
            university.setName("BGU");
            university.setLocation(" Ch.Aytmatov");
            university.setRating(3);

            University university1 = new University();
            university1.setName("AUCA");
            university1.setLocation("Asanbay");
            university1.setRating(2);

            University university2 = new University();
            university2.setName("ALA-TOO");
            university2.setLocation("Tunguch");
            university2.setRating(1);
            University [] universities= {university, university1, university2};
            for (University students: universities) {
                System.out.println(students.getName());
                System.out.println(students.getLocation());
                System.out.println(students.getRating());

            }
        System.out.println(" Schools" +
                "" +
                "\n~~~~~~~~~~~~~~~~~~~~~~~");

            School school = new School();
            school.setName(" Cambridge");
            school.setLocation("Magistral1");
            school.setNumber(12);

            School school1 = new School();
            school1.setName("Oxford");
            school1.setLocation("Magistral2");
            school1.setNumber(12);

            School school2 = new School();
            school2.setName("Semetey");
            school2.setLocation("Magistral3");
            school2.setNumber(12);

            School[] schools = { school, school1, school2};
        for (School  school3: schools) {
            System.out.println();
            System.out.println(school3.getName());
            System.out.println(school3.getLocation());
            System.out.println(school3.getNumber());

        }
        System.out.println(" People" +
                "\n~~~~~~~~~~~~~~~~~~~~~~~");

        Person person = new Person();
        person.setName(" Asyl");
        person.setSurname(" Adilov");
        person.setAge(15);

        Person person1 = new Person();
        person1.setName(" Ruslan");
        person1.setSurname(" Adilov");
        person1.setAge(15);

        Person person2 = new Person();
        person2.setName("Saltanat");
        person2.setSurname(" Adilova");
        person2.setAge(15);

        Person [] people = {person, person1,person2};
        for (Person person3: people) {
            System.out.println(person3.getName());
            System.out.println(person3.getSurname());
            System.out.println(person3.getAge());
        }
        }
}