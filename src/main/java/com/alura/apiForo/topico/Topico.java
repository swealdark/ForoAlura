package com.alura.apiForo.topico;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Table(name="topicos")
@Entity(name="Topico")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of="id")
public class Topico {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    private String message;
    private LocalDate dateCreation;
    private String statusTopic;
    private String autor;
    @Enumerated(EnumType.STRING)
    private Curso curso;


    public Topico(DatosRegistroTopico datosRegistroTopico) {
        this.title = datosRegistroTopico.title();
        this.message = datosRegistroTopico.message();
        this.dateCreation = datosRegistroTopico.dateCreation();
        this.statusTopic = datosRegistroTopico.statusTopic();
        this.autor = datosRegistroTopico.autor();
        this.curso = datosRegistroTopico.curso();
    }
}
