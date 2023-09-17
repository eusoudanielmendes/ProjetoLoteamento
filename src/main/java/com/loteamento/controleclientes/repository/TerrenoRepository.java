package com.loteamento.controleclientes.repository;

import com.loteamento.controleclientes.model.Terreno;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.*;
@Repository
public interface TerrenoRepository extends JpaRepository<Terreno, Long> {
    Terreno findByLote(String lote);
}