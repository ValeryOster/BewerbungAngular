package de.bewerbung.main.controllers;

import de.bewerbung.main.entities.Bewerbung;
import de.bewerbung.main.repositories.BewerbungsRepo;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("bewerbungen")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class MainController {
    @Autowired
    private BewerbungsRepo bewerbungsRepo;

    @GetMapping("getall")
    public List<Bewerbung> listBewerbungen() {
        return bewerbungsRepo.findAll();
    }

    @GetMapping("{id}")
    public Bewerbung getBewerbung(@PathVariable("id") Bewerbung bewerbung) {
        return bewerbung;
    }

    @PostMapping()
    @CrossOrigin(origins = "*", allowedHeaders = "*")
    public Bewerbung create(@RequestBody Bewerbung bewerbung) {
        System.out.println(bewerbung.toString());
        return bewerbungsRepo.save(bewerbung);
    }


    @PutMapping("update/{id}")
    @CrossOrigin(origins = "*", allowedHeaders = "*")
    public Bewerbung update(@PathVariable("id") Bewerbung bewerbungFromDB, @RequestBody Bewerbung bewerbung) {
        System.out.println(bewerbung.toString());
        BeanUtils.copyProperties(bewerbung, bewerbungFromDB, "id");
        return bewerbungsRepo.save(bewerbungFromDB);
    }

    @DeleteMapping("{id}")
    public void delete(@PathVariable("id") Bewerbung bewerbung) {
        bewerbungsRepo.delete(bewerbung);
    }
}
