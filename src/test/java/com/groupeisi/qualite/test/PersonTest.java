package com.groupeisi.qualite.test;



import com.groupeisi.qualite.entities.Person;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PersonTest {

    @Test
    void testPersonCreation() {
        // Créer une instance de la classe Person
        Person person = new Person();

        // Vérifier que les propriétés sont initialement à null
        assertNull(person.getId());
        assertNull(person.getFirstName());
        assertNull(person.getLastName());

        // Vous pouvez ajouter d'autres assertions ou tests ici en fonction de la logique de votre classe Person
    }

    // Ajoutez d'autres tests pour les méthodes de la classe Person si nécessaire
}
