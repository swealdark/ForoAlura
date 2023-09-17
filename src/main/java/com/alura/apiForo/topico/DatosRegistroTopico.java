package com.alura.apiForo.topico;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

import java.time.LocalDate;

public record DatosRegistroTopico(@NotBlank String title,
                                  @NotBlank String message,
                                  @NotNull LocalDate dateCreation,
                                  @NotBlank String statusTopic,
                                  @NotBlank String autor,
                                  @NotNull Curso curso) {
}
