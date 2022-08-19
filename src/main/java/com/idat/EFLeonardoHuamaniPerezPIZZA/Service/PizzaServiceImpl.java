package com.idat.EFLeonardoHuamaniPerezPIZZA.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.idat.EFLeonardoHuamaniPerezPIZZA.Client.OPenFeignPizzeria;
import com.idat.EFLeonardoHuamaniPerezPIZZA.Client.OpenFeignCliente;
import com.idat.EFLeonardoHuamaniPerezPIZZA.DTO.Cliente;
import com.idat.EFLeonardoHuamaniPerezPIZZA.DTO.Pizzeria;
import com.idat.EFLeonardoHuamaniPerezPIZZA.Entity.ClienteDetalle;
import com.idat.EFLeonardoHuamaniPerezPIZZA.Entity.Pizza;
import com.idat.EFLeonardoHuamaniPerezPIZZA.Entity.PizzaClienteFK;
import com.idat.EFLeonardoHuamaniPerezPIZZA.Entity.PizzaPizzeriaFK;
import com.idat.EFLeonardoHuamaniPerezPIZZA.Entity.PizzeriaDetalle;
import com.idat.EFLeonardoHuamaniPerezPIZZA.Repository.ClienteDetalleRepository;
import com.idat.EFLeonardoHuamaniPerezPIZZA.Repository.PizzaRepository;
import com.idat.EFLeonardoHuamaniPerezPIZZA.Repository.PizzeriaDetalleRepository;

public class PizzaServiceImpl implements PizzaService{

	@Autowired
	private PizzaRepository repositoryPizza;
	
	@Autowired
	private ClienteDetalleRepository repositoryClienteDetalle;
	
	@Autowired
	private PizzeriaDetalleRepository repositoryPizzeriaDetalle;
	
	@Autowired
	private OpenFeignCliente feignCliente;
	
	@Autowired
	private OPenFeignPizzeria feignPizzeria;

	@Override
	public void asignarPizzeriaPizza() {
		List<Pizzeria> listado = feignPizzeria.listaPizzeriaSeleccionados();
		PizzaPizzeriaFK fk = null;
		PizzeriaDetalle detalle = null;

		
		for (Pizzeria pizzeria : listado) {
			
			fk = new PizzaPizzeriaFK();
			fk.setIdPizzeria(pizzeria.getIdPizzeria());
			fk.setIdPizza(1);
			
			detalle = new PizzeriaDetalle();
			detalle.setFk(fk);	
			
			repositoryPizzeriaDetalle.save(detalle);
		}
	}

	@Override
	public void asignarClientePizza() {
		List<Cliente> listado = feignCliente.listaClientesSeleccionados();
		PizzaClienteFK fk = null;
		ClienteDetalle detalle = null;

		
		for (Cliente cliente : listado) {
			
			fk = new PizzaClienteFK();
			fk.setIdCliente(cliente.getIdCliente());
			fk.setIdPizza(1);
			
			detalle = new ClienteDetalle();
			detalle.setFk(fk);	
			
			repositoryClienteDetalle.save(detalle);
		}
	}

	@Override
	public void guardarCliente(Cliente cliente) {
		repositoryClienteDetalle.save(cliente);
	}

	@Override
	public void guardarPizzeria(Pizzeria pizzeria) {
		repositoryPizzeriaDetalle.save(pizzeria);
	}

	

}
