package kz.aitu.advancedJava.service;


import kz.aitu.advancedJava.Model.person;
import kz.aitu.advancedJava.Repository.PersonRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class personService {
    public final PersonRepository personRepository;

    public personService(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }
    public List<person> getAll() {
        return (List<person>) personRepository.findAll();
    }

    public person getById(Long id) {
        return personRepository.findById(id).orElse(null);
    }

    public person create(person person) {
        return personRepository.save(person);
    }

    public person update(person person) {
        return personRepository.save(person);
    }

    public void delete(Long id) {
        personRepository.deleteById(id);
    }

}
