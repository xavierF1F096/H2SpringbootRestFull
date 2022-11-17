package com.example.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.Model.Cuenta;

public interface cuentaRepository extends JpaRepository<Cuenta, Long> {

}
