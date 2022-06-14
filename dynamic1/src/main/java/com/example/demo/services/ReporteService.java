package com.example.demo.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.interfaceService.IReporteService;
import com.example.demo.interfaces.IReporte;
import com.example.demo.model.Reporte;
@Service
public class ReporteService implements IReporteService{

	@Autowired
	private IReporte dat;
	@Override
	public List<Reporte> listar() {
		return (List<Reporte>) dat.findAll();
	}

	@Override
	public Optional<Reporte> listarId(int id) {
		return dat.findById(id);
	}

	@Override
	public int saveReporte(Reporte r) {
		int res=0;
		Reporte reporte=dat.save(r);
		if(!reporte.equals(null)) {
			res=1;
		}
		
		return res;
	}

	@Override
	public void eliminarReporte(int id) {
		dat.deleteById(id);
		
	}

   
}