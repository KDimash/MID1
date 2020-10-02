package kz.aitu.advancedJava.Repository;

import kz.aitu.advancedJava.Model.person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonRepository extends JpaRepository<person,Long> {

}
