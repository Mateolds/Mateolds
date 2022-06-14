 package com.example.demo.interfaceService;

import java.util.List;
import java.util.Optional;


import com.example.demo.model.TipoReporte;



public interface ITipoReporteService {
	public List<TipoReporte> listar();
  public Optional<TipoReporte>listarid(long idr);
  public int saveTipoReporte(TipoReporte tr);
  public void deleteTipoReporte(long idr);

}

