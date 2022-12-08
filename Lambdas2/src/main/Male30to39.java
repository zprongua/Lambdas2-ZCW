import java.time.LocalDate;

public class Male30to39 implements CheckPerson {

    @Override
    public boolean test(Person p) {
        int age = p.birthday.getYear() - LocalDate.now().getYear();
        return p.gender == Person.Sex.MALE &&
            age >= 30 && age <= 39;
    }
}
