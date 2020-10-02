package kz.aitu.advancedJava.Controller;

import kz.aitu.advancedJava.Model.person;
import kz.aitu.advancedJava.service.personService;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class PersonController {
    public final personService personService;

    public PersonController(kz.aitu.advancedJava.service.personService personService) {
        this.personService = personService;
    }


    @GetMapping("/api/person/{id}")
    public ResponseEntity<?> getActivate_journal(@PathVariable Long id) {
        return ResponseEntity.ok(personService.getById(id));
    }

    @GetMapping("/api/v2")
    public String showTables(Model model){
        Iterable<person> per = personService.getAll();
        model.addAttribute("per", per);
        return "index";
    }


    @PostMapping("/api/create")
    public ResponseEntity<?> saveActivate_journal(@RequestBody person person) {
        return ResponseEntity.ok(personService.create(person));
    }

    @PutMapping("/api/person")
    public ResponseEntity<?> updateActivate_journal(@RequestBody person person) {
        return ResponseEntity.ok(personService.create(person));
    }

    @DeleteMapping("/api/v2/users/{id}")
    public void deleteActivate_journal(@PathVariable Long id) {
        personService.delete(id);
    }

}
