package gostyle.api.services;

import gostyle.api.entities.Promotion;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PromotionService  {
    List<Promotion> getAll();
    Promotion getOne(Long id);
    Promotion create(Promotion promotion);


}
