package com.groupeisi.qualite.doa;

import com.groupeisi.qualite.entities.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepository extends JpaRepository<Person, Long> {
}
