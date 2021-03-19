package gostyle.api.repositories;

import gostyle.api.entities.Promotion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

public interface PromotionRepository extends JpaRepository<Promotion,Long>{
}
