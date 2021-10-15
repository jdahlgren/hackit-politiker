package se.knowit.hackit.politiker.service;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import reactor.core.publisher.Flux;
import se.knowit.hackit.politiker.api.OrganApi;
import se.knowit.hackit.politiker.model.riksdagen.organ.OrganItem;

@Component
@AllArgsConstructor
@Slf4j
public class OrganService {

 private OrganApi organApi;

 public Flux<OrganItem> getUtskott() {
  return organApi.getOrgan()
      .flatMapMany(Flux::fromIterable)
      .filter(i -> i.getTyp().equals("utskott"));

 }
}
