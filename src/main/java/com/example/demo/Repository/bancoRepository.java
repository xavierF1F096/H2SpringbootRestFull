package com.example.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.Model.Banco;

public interface bancoRepository extends JpaRepository<Banco, Long>{

}
