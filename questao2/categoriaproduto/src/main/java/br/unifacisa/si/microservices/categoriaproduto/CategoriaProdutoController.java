package br.unifacisa.si.microservices.categoriaproduto;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("categoriaproduto")
public class CategoriaProdutoController {
	
	@GetMapping
	public ResponseEntity<List<String>> getAll(){
		List<String> ls = new ArrayList<>();
		ls.add("categoriaProduto");
		return new ResponseEntity<>(ls,HttpStatus.OK);
	}
	

}
