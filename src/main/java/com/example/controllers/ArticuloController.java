package com.example.controllers;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.entities.Articulo;
import com.example.repository.ArticuloRepo;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/articulos")
public class ArticuloController {
	
	private final ArticuloRepo articuloRepo;
	
	public ArticuloController(ArticuloRepo articuloRepo) {
		this.articuloRepo = articuloRepo;
	}
	
	@GetMapping("/find/{cod}")
    public Optional<Articulo> get(@PathVariable String cod) {
		return this.articuloRepo.findById(cod);
    }
	
	@GetMapping("/findAll")
    public Iterable<Articulo> findAll() {
		return this.articuloRepo.findAll();
    }
	
	@PostMapping("/insert")
    public Articulo insert(@RequestBody Articulo articulo) {
		return this.articuloRepo.save(articulo);
    }
	
	@PostMapping("/update")
    public Articulo update(@RequestBody Articulo articulo) {
		return this.articuloRepo.save(articulo);
    }
	
	@PostMapping("/delete")
    public boolean delete(@RequestBody String cod) {
		try {
			this.articuloRepo.deleteById(cod);
			return true;
		} catch (Exception e) {
			return false;
		}
		
		
    }
	

}
