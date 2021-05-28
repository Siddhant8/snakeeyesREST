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
    Info one(@PathVariable Long id) {

        return codeInterface.findById(id)
                .orElseThrow(() -> new InfoNotFoundException(id));
    }

    /*@GetMapping("/studyGuide")
    public List<Info> everything() {
        return codeInterface.findAll();
    }*/

    @GetMapping("/studyGuide")
    CollectionModel<EntityModel<Info>> all() {

        List<EntityModel<Info>> infos = codeInterface.findAll().stream()
                .map(info -> EntityModel.of(info,
                        linkTo(methodOn(InfoController.class).one(info.getId())).withSelfRel(),
                        linkTo(methodOn(InfoController.class).all()).withRel("info")))
                .collect(Collectors.toList());

        return CollectionModel.of(infos, linkTo(methodOn(InfoController.class).all()).withSelfRel());
    }

    @PostMapping("/studyGuide")
    Info newInfo(@RequestBody Info newInfo) {
        return codeInterface.save(newInfo);
    }

}