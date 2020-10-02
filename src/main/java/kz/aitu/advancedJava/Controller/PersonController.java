package kz.aitu.advancedJava.Controller;

import kz.aitu.advancedJava.Model.person;
import kz.aitu.advancedJava.service.personService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class PersonController {
    public final personService personService;

    public PersonController(kz.aitu.advancedJava.service.personService personService) {
        this.personService = personService;
    }


    @GetMapping("/api/person/{id}")
    public ResponseEntity<?> getPerson(@PathVariable Long id) {
        return ResponseEntity.ok(personService.getById(id));
    }

    @GetMapping("/api/v2")
    public ResponseEntity<?> getPerson() {
        return ResponseEntity.ok(personService.getAll());
    }



    @PostMapping("/api/create")
    public ResponseEntity<?> savePerson(@RequestBody person person) {
        return ResponseEntity.ok(personService.create(person));
    }

    @PutMapping("/api/person")
    public ResponseEntity<?> updatePerson(@RequestBody person person) {
        return ResponseEntity.ok(personService.create(person));
    }

    @DeleteMapping("/api/v2/users/{id}")
    public void deletePerson(@PathVariable Long id) {
        personService.delete(id);
    }

}
