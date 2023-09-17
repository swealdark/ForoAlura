package com.alura.apiForo.controller;


import com.alura.apiForo.topico.DatosRegistroTopico;
import com.alura.apiForo.topico.Topico;
import com.alura.apiForo.topico.TopicoRepository;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/topicos")
public class TopicoController {
    @Autowired
    private TopicoRepository topicoRepository;
    @PostMapping
    public String topico(@RequestBody @Valid DatosRegistroTopico datosRegistroTopico){

        topicoRepository.save(new Topico(datosRegistroTopico));
        return "ga";
    }
}
