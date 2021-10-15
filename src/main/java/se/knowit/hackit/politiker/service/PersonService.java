package se.knowit.hackit.politiker.service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;
import se.knowit.hackit.politiker.api.PersonApi;
import se.knowit.hackit.politiker.model.riksdagen.person.PersonItem;

@Component
@AllArgsConstructor
public class PersonService {

  private PersonApi personApi;

  public Flux<PersonItem> getPersons(String partiKod, String utskottKod) {
    return personApi.getPersons(partiKod, utskottKod);
  }

  public Mono<PersonItem> getPerson(String personId) {
    return personApi.getPerson(personId);
  }
}
