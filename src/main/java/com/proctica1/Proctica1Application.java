package com.proctica1;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.proctica1.componentes.Componte_Dependencia;

@SpringBootApplication
public class Proctica1Application implements CommandLineRunner{

	Componte_Dependencia componte_Dependencia;
	
		
	public Proctica1Application(Componte_Dependencia componte_Dependencia) {
		this.componte_Dependencia=componte_Dependencia;
		
	}

	public static void main(String[] args) {
		SpringApplication.run(Proctica1Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		String nombre=this.componte_Dependencia.leer_teclado();
		this.componte_Dependencia.salida_mensaje(nombre);
		
	}

}
