package com.realdolmen.spring.repository;

import com.realdolmen.spring.domain.Animal;
import com.realdolmen.spring.domain.DietEntry;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface DietEntryRepository extends JpaRepository<DietEntry, Integer> {

    List<DietEntry> findDietEntryByAnimalType(Animal.Type type);
}
