package com.idat.EFLeonardoHuamaniPerezPIZZA.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.idat.EFLeonardoHuamaniPerezPIZZA.DTO.Pizzeria;
import com.idat.EFLeonardoHuamaniPerezPIZZA.Entity.PizzeriaDetalle;

public interface PizzeriaDetalleRepository extends JpaRepository<PizzeriaDetalle, Integer>{

	void save(Pizzeria pizzeria);

}
