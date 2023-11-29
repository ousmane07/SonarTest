package com.groupeisi.qualite.test;




import com.groupeisi.qualite.doa.PersonRepository;
import com.groupeisi.qualite.entities.Person;
import com.groupeisi.qualite.service.PersonService;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

public class PersonServiceTest {

    @Mock
    private PersonRepository personRepository;

    @InjectMocks
    private PersonService personService;

    public PersonServiceTest() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    void testGetAllPersons() {
        // Simuler la réponse attendue du repository
        Person person1 = new Person();
        person1.setId(1L);
        person1.setFirstName("John");
        person1.setLastName("Doe");

        Person person2 = new Person();
        person2.setId(2L);
        person2.setFirstName("Jane");
        person2.setLastName("Smith");

        List<Person> expectedPersons = Arrays.asList(person1, person2);
        when(personRepository.findAll()).thenReturn(expectedPersons);

        // Appeler la méthode dans le service
        List<Person> result = personService.getAllPersons();

        // Vérifier que le résultat correspond à ce qui est attendu
        assertEquals(expectedPersons, result);

        // Vérifier que la méthode du repository a été appelée
        verify(personRepository, times(1)).findAll();
    }

    // Ajoutez d'autres tests pour les méthodes du service si nécessaire
}
