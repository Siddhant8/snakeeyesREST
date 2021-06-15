package com.example.spring;

import java.util.List;
import java.util.Optional;

import org.springframework.web.bind.annotation.*;

@RestController
public class InfoController {

    private final CodeInterface codeInterface;

    public InfoController(CodeInterface codeInterface) {
        this.codeInterface = codeInterface;
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

        codeInterface.deleteById(id);
    }

    @GetMapping("/studyGuide/{id}")
    public Optional<Info> getInfo(@PathVariable Long id){
        return codeInterface.findById(id);
    }

}
