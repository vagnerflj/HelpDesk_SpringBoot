package com.example.demo.domain;

import com.example.demo.domain.enums.Perfil;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;

import java.util.ArrayList;
import java.util.List;

@Entity
public class Tecnico extends Pessoa{
    private static final long serialVersionUID = 1L;

    @OneToMany(mappedBy = "tecnico")
    private List<Chamado> chamados = new ArrayList<>();

    public Tecnico() {
       super();
       addPerfis(Perfil.TECNICO);
    }

    public Tecnico(String nome, String cpf, String email, String senha, List<Chamado> chamados) {
        super(nome, cpf, email, senha);
        addPerfis(Perfil.TECNICO);
    }

    public List<Chamado> getChamados() {
        return chamados;
    }

    public void setChamados(List<Chamado> chamados) {
        this.chamados = chamados;
    }
}
