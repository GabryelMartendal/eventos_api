package com.hellow.eventos.controller;

import com.hellow.eventos.classes.cliente.Cliente;
import com.hellow.eventos.classes.cliente.ClienteRepository;
import com.hellow.eventos.classes.endereco.Endereco;
import com.hellow.eventos.classes.endereco.Endereco;
import com.hellow.eventos.classes.endereco.EnderecoRepository;
import com.hellow.eventos.classes.usuario.Usuario;
import com.hellow.eventos.classes.usuario.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping(path = "usuario")

public class UsuarioController {

    @Autowired
    private UsuarioRepository usuarioRepository;

    @GetMapping("todos")
    public List<Usuario> getAllUsuarios (){return this.usuarioRepository.findAll();}

    @PostMapping("add")
    public Usuario addCliente(@RequestBody Usuario usuario){
        this.usuarioRepository.save(usuario);
        return usuario;
    }
}
