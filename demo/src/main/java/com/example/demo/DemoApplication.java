package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@RequestMapping("/")
	public String home(){
		System.out.println("hola leonardo.ruizp");
		return "hola leonardo.ruizp";
	}

	@RequestMapping("/altas")
	public String altas(){
		return "altas";
	}

	@RequestMapping("/bajas")
	public String bajas(){
		return "bajas";
	}

	@RequestMapping("/cambios")
	public String cambios(){
		return "cambios";
	}
	
	@RequestMapping("/consultas")
	public String consultas(){
		return "consultas";
	}

	//Ejemplos de métodos REST sí adecuados al estilo RESTFUL

	@RequestMapping(value = "/sistema", method = RequestMethod.POST)
	public String altasRest(){
		return "altas";
	}

	@RequestMapping(value = "/sistema", method = RequestMethod.DELETE)
	public String bajasRest(){
		return "bajas";
	}

	@RequestMapping(value = "/sistema", method = RequestMethod.PUT)
	public String cambiosRest(){
		return "cambios";
	}
	
	@RequestMapping(value = "/sistema", method = RequestMethod.GET)
	public String consultasRest(){
		return "consultas";
	}


}
