package academy.devdojo.maratonajava.javacore.junit.service;

import academy.devdojo.maratonajava.javacore.junit.domain.Person;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

class PersonServiceTest {
    private Person adult;
    private Person notAdult;
    private PersonService personService;

    @BeforeEach
    public void setUp() {
        adult = new Person(18);
        notAdult = new Person(15);
        personService = new PersonService();
    }

    @Test
    @DisplayName("A person should be not adult when age is lower then 18")
    void isAdult_ReturnFalse_WhenAgeIsLowerThan18() {
        Assertions.assertFalse(personService.isAdult(notAdult));
    }

    @Test
    @DisplayName("A person should be adult when age is greater or equal then 18")
    void isAdult_ReturnTrue_WhenAgeIsGreaterOrEqualsThan18() {
        Assertions.assertTrue(personService.isAdult(adult));
    }

    @Test
    @DisplayName("Should throw NullPointerException with message when person is null")
    void isAdult_ThrowEsception_WhenPersonIsNull() {
        Assertions.assertThrows(NullPointerException.class,
                () -> personService.isAdult(null), "person can't be null");
    }

    @Test
    @DisplayName("Should return list with only adult")
    void filterRemovingNotAdult_ReturnListWithAdultOnly_WhenListOfPersonWithAdultIsPassed() {
        Person person1 = new Person(17);
        Person person2 = new Person(18);
        Person person3 = new Person(21);
        final List<Person> personList = List.of(person1, person2, person3);

        Assertions.assertEquals(2, personService.filterRemovingNotAdult(personList).size());
    }
}