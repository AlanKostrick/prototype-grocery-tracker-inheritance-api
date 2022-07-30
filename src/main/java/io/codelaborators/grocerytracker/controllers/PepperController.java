package io.codelaborators.grocerytracker.controllers;

import io.codelaborators.grocerytracker.repositories.PepperRepository;
import io.codelaborators.grocerytracker.models.Pepper;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.Collection;

@RestController
@CrossOrigin
public class PepperController {

    @Resource
    private PepperRepository pepperRepo;

    @GetMapping("/peppers")
    public Collection<Pepper> getPeppers() {
        return (Collection<Pepper>) pepperRepo.findAll();
    }
}