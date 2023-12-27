package com.project.consulta.controller;

import com.project.consulta.dto.CnpjDTO;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping(value = "/consulta-cnpj")
public class ConsultaCnpj {

    @GetMapping(value = "/{cnpj}")
    public ResponseEntity<CnpjDTO> consultaCnpj(@PathVariable String cnpj) {

        try {
            RestTemplate restTemplate = new RestTemplate();
            ResponseEntity<CnpjDTO> resp = restTemplate.getForEntity(
                    String.format("https://publica.cnpj.ws/cnpj/%s", cnpj),
                    CnpjDTO.class);

            return ResponseEntity.ok(resp.getBody());
        }
        catch (Exception e) {
            return ResponseEntity.notFound().build();
        }
    }
}
