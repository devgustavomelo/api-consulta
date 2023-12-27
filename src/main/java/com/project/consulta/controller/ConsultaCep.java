package com.project.consulta.controller;

import com.project.consulta.dto.CepDTO;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping(value = "consulta-cep")
public class ConsultaCep {

    @GetMapping(value = "/{cep}")
    public ResponseEntity<CepDTO> consultaCep(@PathVariable String cep) {

        try {
            RestTemplate restTemplate = new RestTemplate();
            ResponseEntity<CepDTO> resp = restTemplate.getForEntity(
                    String.format("https://viacep.com.br/ws/%s/json/", cep),
                    CepDTO.class);

            return ResponseEntity.ok(resp.getBody());
        }
        catch (Exception e) {
            return ResponseEntity.notFound().build();
        }
    }
}
