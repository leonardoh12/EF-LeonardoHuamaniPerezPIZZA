package com.idat.EFLeonardoHuamaniPerezPIZZA.Service;

import com.idat.EFLeonardoHuamaniPerezPIZZA.DTO.Cliente;
import com.idat.EFLeonardoHuamaniPerezPIZZA.DTO.Pizzeria;

public interface PizzaService {
	void guardarCliente(Cliente cliente);
	void guardarPizzeria(Pizzeria pizzeria);
	void asignarPizzeriaPizza();
	void asignarClientePizza();
}
