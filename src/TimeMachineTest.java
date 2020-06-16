public class TimeMachineTest {
    public static void main(String[] args) {
        TimeMachine timeMachine = new TimeMachine();

        Person person1 = new Person("Jan", "Abacki", 20);
        System.out.print("Wiek: " + person1.age + ". Po podróży o 7: ");
        timeMachine.timeTravel(person1, 7);
        System.out.print(person1.age + ".\n");

        Person person2 = new Person("Jan", "Babacki", 10);
        System.out.print("Wiek: " + person2.age + ". Po podróży o -7: ");
        timeMachine.timeTravel(person2, -7);
        System.out.print(person2.age + ".\n");

        Person person3 = new Person("Janina", "Cabacka", 20);
        System.out.print("Wiek: " + person3.age + ". Po cofnięciu w czasie: ");
        timeMachine.backInTime(person3);
        System.out.print(person3.age);
        timeMachine.backInTime(person3);
        System.out.print(".  Po drugim cofnięciu w czasie: " + person3.age + ".\n");
    }
}
