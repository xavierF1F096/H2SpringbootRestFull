package com.example.demo.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity(name = "cuenta")
@Table(name = "cuenta")
@NoArgsConstructor @ToString @Getter @Setter
public class Cuenta {
   @Id
   @GeneratedValue(strategy = GenerationType.SEQUENCE)
   @Column(name = "codigocuenta",updatable = false)
   private Long codigoCuenta;
   @Column(name = "descripcioncuenta",nullable = false)
   private String descripcionCuenta;
   @Column(name = "titularcuenta",nullable = false)
   private String titularCuenta;

   public Cuenta(String descripcionCuenta, String titularCuenta) {
		this.descripcionCuenta = descripcionCuenta;
		this.titularCuenta = titularCuenta;
	}
   
    @ManyToOne
	@JoinColumn(name = "codigobanco")
    Banco banco ;
    
    @ManyToOne
    @JoinColumn(name = "codigomoneda")
    Moneda moneda;
    
}
