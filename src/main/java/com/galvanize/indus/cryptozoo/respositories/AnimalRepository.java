package com.galvanize.indus.cryptozoo.respositories;

import com.galvanize.indus.cryptozoo.model.Animal;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AnimalRepository extends JpaRepository<Animal, String> {
}
