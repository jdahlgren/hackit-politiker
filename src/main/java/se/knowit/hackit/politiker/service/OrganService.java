package se.knowit.hackit.politiker.service;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import reactor.core.publisher.Flux;
import se.knowit.hackit.politiker.api.OrganApi;
import se.knowit.hackit.politiker.model.knowit.organ.Organ;

@Component
@AllArgsConstructor
@Slf4j
public class OrganService {

 private OrganApi organApi;

 public Flux<Organ> getOrgan() {
  return getOrganItems();
 }

 public Flux<Organ> getUtskott() {
  return getOrganItems()
      .filter(i -> i.getTyp().equals("utskott"));
 }

 private Flux<Organ> getOrganItems() {
  return organApi.getOrgan().map(Organ::from);
 }
}
