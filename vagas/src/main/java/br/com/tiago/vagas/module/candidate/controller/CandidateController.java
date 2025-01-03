package br.com.tiago.vagas.module.candidate.controller;

import br.com.tiago.vagas.module.candidate.CandidateEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/candidate")
public class CandidateController {

    @PostMapping("/")
    public void create(@RequestBody CandidateEntity candidate) {
        var candidato ="Email candidato: " + candidate.getEmail();
        System.out.println(candidato);
    }
}
