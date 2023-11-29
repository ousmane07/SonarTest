package com.groupeisi.qualite.test;

import com.groupeisi.qualite.doa.PersonRepository;
import com.groupeisi.qualite.entities.Person;
import com.groupeisi.qualite.service.PersonService;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

public class PersonRepositoryTest {

    @Mock
    private PersonRepository personRepository;

    @InjectMocks
    private PersonService personService;

    public PersonRepositoryTest() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    void testGetPersonById() {
        // Simuler la réponse attendue de la couche de persistance
        long personId = 1L;
        Person expectedPerson = new Person();
        expectedPerson.setId(personId);
        when(personRepository.findById(personId)).thenReturn(Optional.of(expectedPerson));

        // Appeler la méthode dans le service
        Optional<Person> result = personService.getPersonById(personId);

        // Vérifier que le résultat correspond à ce qui est attendu
        assertTrue(result.isPresent());
        assertEquals(expectedPerson, result.get());

        // Vérifier que la méthode du repository a été appelée
        verify(personRepository, times(1)).findById(personId);
    }

    // Ajoutez d'autres tests pour les méthodes du repository si nécessaire
}
