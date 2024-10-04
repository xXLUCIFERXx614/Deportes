package com.ProyectoDavidDeportes.David.app.repositorio;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.ProyectoDavidDeportes.David.app.variables.Entrenador;

public interface EntrenadorRepositorio extends JpaRepository<Entrenador, Integer> {
	@Query("SELECT e FROM Entrenador e WHERE e.club IS NULL")
    List<Entrenador> findEntrenadoresSinClub();
}
