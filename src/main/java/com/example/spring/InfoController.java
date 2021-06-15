package com.example.spring;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.hateoas.CollectionModel;
import org.springframework.hateoas.EntityModel;
import org.springframework.web.bind.annotation.*;

import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.linkTo;
import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.methodOn;

@RestController
public class InfoController {

    private final CodeInterface codeInterface;

    public InfoController(CodeInterface codeInterface) {
        this.codeInterface = codeInterface;
    }

    @GetMapping("/studyGuide/{id}")
    public Optional<Info> getInfo(@PathVariable Long id) {

        return codeInterface.findById(id)
                
    }

    @GetMapping("/studyGuide")
    public List<Info> everything() {
        return codeInterface.findAll();
    }

 

    @PostMapping("/studyGuide")
    Info newInfo(@RequestBody Info newInfo) {
        return codeInterface.save(newInfo);
    }
    
    @DeleteMapping("/studyGuide/{id}")
    public void deleteInfo(@PathVariable Long id){
        return codeInterface.deleteById(id);
    }

}
