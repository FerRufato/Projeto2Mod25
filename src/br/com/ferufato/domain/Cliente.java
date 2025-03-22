package br.com.ferufato.domain;

import anotacao.TipoChave;

public class Cliente {

    private String nome;
    @TipoChave("getCPF")
    private long cpf;
    private long tel;
    private String end;
    private Integer numero;
    private String ciadade;
    private String estado;

    public static Cliente getCPF() {
        return null;
    }

    public String getNome() {
        return nome ;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public long getCpf() {
        return cpf;
    }

    public void setCpf(long cpf) {
        this.cpf = cpf;
    }

    public long getTel() {
        return tel;
    }

    public void setTel(long tel) {
        this.tel = tel;
    }

    public String getEnd() {
        return end;
    }

    public void setEnd(String end) {
        this.end = end;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public String getCiadade() {
        return ciadade;
    }

    public void setCiadade(String ciadade) {
        this.ciadade = ciadade;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }


    public void getCidade(String sãoPaulo) {
    }

    public void setCidade(String sãoPaulo) {
    }
}
