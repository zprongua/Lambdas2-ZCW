import java.util.List;

public class SocialNetwork {
    public void printPeople(List<Person> people, CheckPerson tester) {
        for (Person p : people) {
            p.printPerson();
        }
    }
}