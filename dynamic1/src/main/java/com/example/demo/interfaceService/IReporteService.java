 package com.example.demo.interfaceService;

import java.util.List;
import java.util.Optional;

import com.example.demo.model.Reporte;



public interface IReporteService {
	
	
	public List<Reporte>listar();
	public Optional<Reporte>listarId(int id);
	public int saveReporte(Reporte r);
	public void eliminarReporte(int id);

}

