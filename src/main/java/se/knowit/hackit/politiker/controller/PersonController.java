package se.knowit.hackit.politiker.controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;
import se.knowit.hackit.politiker.model.riksdagen.person.PersonItem;
import se.knowit.hackit.politiker.service.PersonService;

@RestController()
@RequestMapping("person")
@AllArgsConstructor
public class PersonController {

  private PersonService personService;

  @GetMapping()
  public Flux<PersonItem> getPersons(
      @RequestParam(required = false) String partiKod,
      @RequestParam(required = false) String utskottKod) {
    return personService.getPersons(partiKod, utskottKod);
  }

  @GetMapping("{personId}")
  public Mono<PersonItem> getPerson(@PathVariable String personId) {
    return personService.getPerson(personId);
  }
}
