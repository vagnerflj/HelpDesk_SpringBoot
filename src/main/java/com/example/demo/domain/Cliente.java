package com.example.demo.domain;

import com.example.demo.domain.enums.Perfil;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;

import java.util.ArrayList;
import java.util.List;

@Entity
public class Cliente extends Pessoa{
    private static final long serialVersionUID = 1L;

    @ManyToMany(mappedBy = "cliente")
    private List<Chamado> chamados = new ArrayList<>();

    public Cliente() {
        super();
        addPerfis(Perfil.CLIENTE);
    }

    public Cliente(String nome, String cpf, String email, String senha, List<Chamado> chamados) {
        super(nome, cpf, email, senha);
        addPerfis(Perfil.CLIENTE);
    }

    public List<Chamado> getChamados() {
        return chamados;
    }

    public void setChamados(List<Chamado> chamados) {
        this.chamados = chamados;
    }
}
