package mk.finki.ukim.mk.lab.repository.impl;

import mk.finki.ukim.mk.lab.bootstrap.DataHolder;
import mk.finki.ukim.mk.lab.model.Production;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class ProductionRepository {
    public List<Production> findAll(){
        return DataHolder.productions;
    }
    public Optional<Production> findByID(Long id){
        return DataHolder.productions.stream()
                .filter(production -> production.getId().equals(id))
                .findFirst();
    }
    public Optional<Production> save(String name,String country,String address){
        Production production=new Production(name,country,address);
        DataHolder.productions.add(production);
        return Optional.of(production);
    }
    public void deleteById(Long id){
        DataHolder.productions.removeIf(production -> production.getId().equals(id));
    }
}