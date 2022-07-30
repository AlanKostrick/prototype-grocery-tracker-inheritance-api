package io.codelaborators.grocerytracker;

import io.codelaborators.grocerytracker.models.Apple;
import io.codelaborators.grocerytracker.models.Banana;
import io.codelaborators.grocerytracker.models.Pepper;
import io.codelaborators.grocerytracker.repositories.AppleRepository;
import io.codelaborators.grocerytracker.repositories.BananaRepository;
import io.codelaborators.grocerytracker.repositories.PepperRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

@Component
public class Populator implements CommandLineRunner {

@Resource
private AppleRepository appleRepo;
@Resource
private BananaRepository bananaRepo;
@Resource
private PepperRepository pepperRepo;


    @Override
    public void run(String... args) throws Exception {

        Apple goldenDelicious = new Apple("Golden Delicious", .50, 4, 7);
        appleRepo.save(goldenDelicious);

        Apple red = new Apple("Red Apples", .50, 4, 7);
        appleRepo.save(red);

        Banana miniBanana = new Banana("Mini Bananas", .50, 8, 6);
        bananaRepo.save(miniBanana);

        Pepper redPepper = new Pepper("Red Peppers", 1, 3, 8);
        pepperRepo.save(redPepper);

        Pepper greenPepper = new Pepper("Green Peppers", .75, 5, 6);
        pepperRepo.save(greenPepper);
    }
}
