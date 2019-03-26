// no funciona aquest import
import person.Person.Gender.*;

import person.Person.Gender;

import static person.Person.Gender.FEMALE;
import static person.Person.Gender.MALE;

public class TestPerson {

    public static void main(String[] args) {
        Gender m = MALE;
        Gender f = FEMALE;
        System.out.println(m);
        System.out.println(f);
    }

    /**
     * MALE
     * FEMALE
     */

}
