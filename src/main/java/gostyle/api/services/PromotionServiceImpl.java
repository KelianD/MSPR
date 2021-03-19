package gostyle.api.services;

import gostyle.api.entities.Promotion;
import gostyle.api.repositories.PromotionRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PromotionServiceImpl implements PromotionService{

    private PromotionRepository repository;

    public PromotionServiceImpl(PromotionRepository repository) {
        this.repository = repository;
    }

    @Override
    public List<Promotion> getAll() {
        return repository.findAll();
    }

    @Override
    public Promotion getOne(Long id) {
        return repository.findById(id).orElse(null);
    }

    @Override
    public Promotion create(Promotion promotion) {
        return repository.save(promotion);
    }
}
