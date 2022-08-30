package com.api.helprback.repositories;

import com.api.helprback.domain.Chamado;
import com.api.helprback.domain.Tecnico;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.Optional;

public interface TecnicoRepository extends JpaRepository<Tecnico, Integer> {
    @Query(value="CALL sps_relatorio_prioridade_alta_dia_atual(CURRENT_DATE())", nativeQuery=true)
    Optional<List<Tecnico>> reportByTecnicoChamadoPrioridadeDia();
}
