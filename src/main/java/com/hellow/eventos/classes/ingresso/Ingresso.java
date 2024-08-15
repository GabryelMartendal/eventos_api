package com.hellow.eventos.classes.ingresso;

import com.hellow.eventos.classes.evento.Evento;
import com.hellow.eventos.classes.tipo.Tipo;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Entity(name = "ingresso")
@Table(name = "ingresso")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class Ingresso {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer ingresso_id;
    private Integer valor_base;
    private Integer meia;
    private String social;
    private boolean pago;
    private boolean vip;


    @ManyToOne
    @JoinColumn(name = "evento_id")
    private Evento evento;

    @ManyToOne
    @JoinColumn(name = "tipo_id")
    private Tipo tipo;
}
