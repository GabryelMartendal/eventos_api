package com.hellow.eventos.controller;

import com.hellow.eventos.classes.cliente.Cliente;
import com.hellow.eventos.classes.cliente.ClienteRepository;
import com.hellow.eventos.classes.endereco.Endereco;
import com.hellow.eventos.classes.endereco.Endereco;
import com.hellow.eventos.classes.endereco.EnderecoRepository;
import com.hellow.eventos.classes.ingresso.Ingresso;
import com.hellow.eventos.classes.ingresso.IngressoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping(path = "ingresso")

public class IngressoController {

    @Autowired
    private IngressoRepository ingressoRepository;

    @GetMapping("todos")
    public List<Ingresso> getAllClientes (){return this.ingressoRepository.findAll();}

    @PostMapping("add")
    public Ingresso addIngresso(@RequestBody Ingresso ingresso){
        this.ingressoRepository.save(ingresso);
        return ingresso;
    }
}
