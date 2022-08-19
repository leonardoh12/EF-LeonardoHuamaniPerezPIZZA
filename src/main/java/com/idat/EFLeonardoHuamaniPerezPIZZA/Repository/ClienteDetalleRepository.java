package com.idat.EFLeonardoHuamaniPerezPIZZA.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.idat.EFLeonardoHuamaniPerezPIZZA.DTO.Cliente;
import com.idat.EFLeonardoHuamaniPerezPIZZA.Entity.ClienteDetalle;

public interface ClienteDetalleRepository extends JpaRepository<ClienteDetalle, Integer>{

	void save(Cliente cliente);

}
