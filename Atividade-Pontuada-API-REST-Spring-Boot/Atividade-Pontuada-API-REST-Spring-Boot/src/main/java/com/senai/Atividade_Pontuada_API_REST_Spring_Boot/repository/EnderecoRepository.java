package com.senai.Atividade_Pontuada_API_REST_Spring_Boot.repository;

import com.senai.Atividade_Pontuada_API_REST_Spring_Boot.model.Endereco;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EnderecoRepository extends JpaRepository<Endereco, Long> {
}
