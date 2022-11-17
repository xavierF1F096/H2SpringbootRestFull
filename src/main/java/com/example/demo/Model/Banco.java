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

@Entity(name = "banco")
@Table(name = "banco")
@NoArgsConstructor @Setter@Getter @ToString
public class Banco {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	@Column(name = "codigobanco", updatable = false)
   private Long codigoBanco;
	
	@Column(name = "nombrebanco",nullable = false)
   private String nombreBanco;
	
	
	public Banco(String nombreBanco) {
		this.nombreBanco = nombreBanco;
	}
	
	
	
}
