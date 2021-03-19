package gostyle.api.controllers;

import gostyle.api.entities.Promotion;
import gostyle.api.services.PromotionService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
    @RequestMapping("/promotion")
public class PromotionController {
    private final static Logger log = LoggerFactory.getLogger(PromotionController.class);

    private PromotionService service;

    public PromotionController(PromotionService service){this.service = service;}

    @GetMapping({"","/all"})
    public List<Promotion> getAllPromotion(){
        return service.getAll();
    }

    @GetMapping({"","/{id}"})
    public Promotion getOne(@PathVariable("id") Long id){
        return service.getOne(id);
    }

}
