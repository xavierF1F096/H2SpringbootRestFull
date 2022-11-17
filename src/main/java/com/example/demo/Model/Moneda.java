package com.example.demo.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity(name = "moneda")
@Table( name = "moneda")
@NoArgsConstructor @ToString @Getter @Setter
public class Moneda {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	@Column(name = "codigomoneda",updatable = false)
   private Long codigoMoneda;
	@Column(name = "nombremoneda",nullable = false)
   private String nombreMoneda;
  
  
  public Moneda(String nombreMoneda) {
	this.nombreMoneda = nombreMoneda;
}
}
