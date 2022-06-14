package com.example.demo.interfaces;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Reporte;

@Repository
public interface IReporte extends CrudRepository<Reporte, Integer>{

}
