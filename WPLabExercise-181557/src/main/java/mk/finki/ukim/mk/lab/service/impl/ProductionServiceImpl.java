package mk.finki.ukim.mk.lab.service.impl;

import mk.finki.ukim.mk.lab.model.Production;
import mk.finki.ukim.mk.lab.repository.ProductionRepository;
import mk.finki.ukim.mk.lab.service.ProductionService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductionServiceImpl implements ProductionService {
    private final ProductionRepository productionRepository;

    public ProductionServiceImpl(ProductionRepository pRepository){
        this.productionRepository = pRepository;
    }

    @Override
    public List<Production> findAll() {
        return productionRepository.findAll();
    }
}
