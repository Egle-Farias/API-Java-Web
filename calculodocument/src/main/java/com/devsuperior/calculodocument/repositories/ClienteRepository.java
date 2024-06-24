package com.devsuperior.calculodocument.repository;

import com.devsuperior.calculodocument.entities.Cliente;
import com.devsuperior.calculodocument.services.ClienteService;

import java.util.List;

public interface ClienteRepository {
    List<ClienteService> findById(Long id);
}
