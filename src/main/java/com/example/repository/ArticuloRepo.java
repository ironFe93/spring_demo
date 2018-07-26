package com.example.repository;

import org.springframework.data.repository.CrudRepository;

import com.example.entities.Articulo;
import java.util.Collection;

public interface ArticuloRepo extends CrudRepository<Articulo, String>{

}
