package com.project.consulta.dto.entitiesdto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
public class Socio {

    @JsonProperty(value = "cpf_cnpj_socio")
    private String cpfCnpjSocio;

    @JsonProperty(value = "nome")
    private String nome;

    @JsonProperty(value = "tipo")
    private String tipo;

    @JsonProperty(value = "data_entrada")
    private String dataEntrada;

    @JsonProperty(value = "cpf_representante_legal")
    private String cpfRepresentanteLegal;

    @JsonProperty(value = "nome_representante")
    private String nomeRepresentante;

    @JsonProperty(value = "faixa_etaria")
    private String faixaEtaria;

    @JsonProperty(value = "atualizado_em")
    private String atualizadoEm;

    @JsonProperty(value = "pais_id")
    private String paisId;

}