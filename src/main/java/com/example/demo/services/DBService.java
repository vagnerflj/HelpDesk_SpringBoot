package com.example.demo.services;

import com.example.demo.domain.Chamado;
import com.example.demo.domain.Cliente;
import com.example.demo.domain.Tecnico;
import com.example.demo.domain.enums.Perfil;
import com.example.demo.domain.enums.Prioridade;
import com.example.demo.domain.enums.Status;
import com.example.demo.repositories.ChamadoRepository;
import com.example.demo.repositories.ClienteRepository;
import com.example.demo.repositories.TecnicoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Arrays;

@Service
public class DBService {
    @Autowired
    private TecnicoRepository tecnicoRepository;

    @Autowired
    private ClienteRepository clienteRepository;

    @Autowired
    private ChamadoRepository chamadoRepository;


    public void instanciaDB(){

        Tecnico tec1 = new Tecnico(null, "Vagner Ferreira", "0656334343", "vagner@hotmail.com", "1221");
        tec1.addPerfil(Perfil.ADMIN);

        Cliente cli1 = new Cliente(null, "Leandro vital", "06324256377", "leandro@hotmail.com", "1222");

        Chamado c1 = new Chamado(null, Prioridade.MEDIA, Status.ANDAMENTO, "Chamado 1", "Primeiro Chamado", tec1, cli1);

        tecnicoRepository.saveAll(Arrays.asList(tec1));
        clienteRepository.saveAll(Arrays.asList(cli1));
        chamadoRepository.saveAll(Arrays.asList(c1));



    }
}
