package com.project.consulta.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.project.consulta.dto.entitiesdto.Socio;
import lombok.*;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
public class CnpjDTO {

    @JsonProperty(value = "cnpj_raiz")
    private String cnpjRaiz;

    @JsonProperty(value = "razao_social")
    private String razaoSocial;

    @JsonProperty(value = "capital_social")
    private String capitalSocial;

    @JsonProperty(value = "responsavel_federativo")
    private String responsavelFederativo;

    @JsonProperty(value = "atualizado_em")
    private String atualizadoEm;

    @JsonProperty(value = "socios")
    private List<Socio> socios;
}