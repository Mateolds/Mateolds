package com.example.demo.controler;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.interfaceService.IReporteService;
import com.example.demo.model.Reporte;



@Controller
@RequestMapping
public class Controlador {
	
	@Autowired
	private IReporteService service;
	
	
	
	@GetMapping("/listarReporte")
	public String listar(Model model) {
		List<Reporte>reportes=service.listar();
		model.addAttribute("reportes", reportes);
		return "Reporte";
		
	}
	
	
	
	
	@GetMapping("/CrearReporte")
	public String saveReporte(Model model) {
		model.addAttribute("reportes", new Reporte());
		return "CrearReporte";
	}
	
	@PostMapping("/saveReporte")
	public String saveReporte(@Validated Reporte r, Model model) {
		service.saveReporte(r);
		return "redirect:/listarReporte";
	}
	
	
	@GetMapping("/editarReporte/{idReporte}")
	public String editarReporte(@PathVariable("idReporte") int id, Model model) {
		Optional<Reporte> reporte=service.listarId(id);
		model.addAttribute("reportes", reporte);
		return "CrearReporte";
		
	}
	
	@GetMapping("/eliminarReporte/{idReporte}")
	public String eliminarReporte(@PathVariable("idReporte") int id) {
	 service.eliminarReporte(id);
		return "redirect:/listarReporte";
	}
	
	
	@RequestMapping("/bodega")
    public String bodega(){
        return " bodega";
    }
	

		
	}
	
	


