package com.example.demo.controler;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.interfaceService.ITipoReporteService;
import com.example.demo.model.TipoReporte;



@Controller
@RequestMapping
public class ControladorTipoReporte {
	
	@Autowired
	private ITipoReporteService service;
	
	@GetMapping("/listartiporeporte")
	public String listarTipoReporte(Model model) {
		List<TipoReporte>tiporeportes=service.listar();
		model.addAttribute("tiporeportes", tiporeportes);
		return "TipoReporte";
		
	}
	
	
	
	
	@GetMapping("/crearTR")
	public String agregar(Model model) {
		model.addAttribute("tiporeportes", new TipoReporte());
		return "Crear TipoReporte";
	}
	
	public String saveTipoReporte(@Validated TipoReporte tr, Model model) {
		service.saveTipoReporte(tr);
		return "redirect:/listarTipoReporte";
	}
	
	
}