package se.knowit.hackit.politiker.api;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Flux;
import se.knowit.hackit.politiker.model.riksdagen.person.PersonItem;
import se.knowit.hackit.politiker.model.riksdagen.person.PersonLista;
import se.knowit.hackit.politiker.model.riksdagen.person.PersonRoot;
import se.knowit.hackit.politiker.model.riksdagen.person.PersonRootSingle;

@Component
@AllArgsConstructor
public class PersonApi {

  private WebClient webClient;

  public Flux<PersonItem> getPersons(String partiKod, String utskottKod) {
    return webClient.get()
        .uri(builder -> builder
            .path("personlista/")
            .queryParam("parti", partiKod)
            .queryParam("org", utskottKod)
            .queryParam("utformat", "json")
            .build()
        )
        .retrieve()
        .bodyToMono(PersonRoot.class)
        .map(PersonRoot::getPersonLista)
        .map(PersonLista::getPerson)
        .flatMapMany(Flux::fromIterable);
  }

  public Flux<PersonItem> getPerson(String personId) {
    return webClient.get()
        .uri(builder -> builder
            .path("personlista/")
            .queryParam("iid", personId)
            .queryParam("utformat", "json")
            .build()
        )
        .retrieve()
        .bodyToMono(PersonRootSingle.class)
        .map(PersonRootSingle::getPersonLista)
        .map(PersonLista::getPerson)
        .flatMapMany(Flux::fromIterable);
  }
}
