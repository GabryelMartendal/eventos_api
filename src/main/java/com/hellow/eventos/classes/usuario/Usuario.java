package com.hellow.eventos.classes.usuario;

import com.hellow.eventos.classes.tipo.Tipo;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Entity(name = "usuario")
@Table(name = "usuario")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer usuario_id;
    private String login;
    private String senha;
    private Integer email;
    private Date dt_nascimento;

    @ManyToOne
    @JoinColumn(name = "tipo_id")
    private Tipo tipo;
}
