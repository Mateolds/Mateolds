package com.example.demo.interfaces;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.TipoReporte;

@Repository
public interface ITipoReporte extends JpaRepository<TipoReporte, Long> {

}
