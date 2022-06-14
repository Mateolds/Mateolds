package com.example.demo.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.interfaceService.ITipoReporteService;
import com.example.demo.interfaces.ITipoReporte;
import com.example.demo.model.TipoReporte;
@Service
public class TipoReporteService implements ITipoReporteService{

	  @Autowired
	private ITipoReporte dataTipoReporte;
	
	@Override
	public List<TipoReporte> listar() {
		// TODO Auto-generated method stub
		return dataTipoReporte.findAll();
	}

	@Override
	public Optional<TipoReporte> listarid(long idr) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int saveTipoReporte(TipoReporte tr) {
		int res=0;
		TipoReporte tiporeporte=dataTipoReporte.save(tr);
		if(tiporeporte.equals(null)) {
			res=1;
		}
		return 0;
	}

	@Override
	public void deleteTipoReporte(long idr) {
		// TODO Auto-generated method stub
		
	}

	


	
	
	
}