import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class TestSocialNetwork {
    @Test
    public void testSocialNetwork() {
        SocialNetwork sn = new SocialNetwork();
        Person p = new Person("John", LocalDate.of(1991, 01, 01), Person.Sex.MALE, "email@email.com");
        List<Person> lp = new ArrayList<>();
        lp.add(p);

        CheckPerson cp = new Male30to39();
        sn.printPeople(lp, cp);

        sn.printPeople(
                lp,
                new CheckPerson() {
                    public boolean test(Person p) {
                        return p.getGender() == Person.Sex.MALE &&
                                p.getName().equals("John");
                    }
                }
        );

        sn.printPeople(
                lp,
                (Person pe) -> pe.getGender() == Person.Sex.MALE &&
                        pe.getBirthday().getYear() < 1993 &&
                        pe.getBirthday().getYear() > 1982
        );
    }
}
