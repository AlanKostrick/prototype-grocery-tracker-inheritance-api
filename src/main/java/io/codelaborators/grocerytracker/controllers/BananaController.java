package io.codelaborators.grocerytracker.controllers;

import io.codelaborators.grocerytracker.repositories.BananaRepository;
import io.codelaborators.grocerytracker.models.Banana;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.Collection;

@RestController
@CrossOrigin
public class BananaController {

    @Resource
    private BananaRepository bananaRepo;

    @GetMapping("/bananas")
    public Collection<Banana> getBananas() {
        return (Collection<Banana>) bananaRepo.findAll();
    }
}