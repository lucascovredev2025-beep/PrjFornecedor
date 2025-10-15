package com.lucascovre.prjCadFornecedor.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lucascovre.prjCadFornecedor.entitis.Fornecedor;
import com.lucascovre.prjCadFornecedor.service.FornecedorService;

@RestController
@RequestMapping("/Fornecedor")
public class FornecedorController {
	
	private final FornecedorService fornecedorService;
	@Autowired
	public FornecedorController(FornecedorService fornecedorService) {
		this.fornecedorService = fornecedorService;
	}
	@PostMapping
	public Fornecedor criarFornecedor(@RequestBody Fornecedor fornecedor) {
		return fornecedorService.salvarFornecedor(fornecedor);
	}
	@GetMapping("/{id}")
	public Fornecedor buscarFornecedorPorId(@PathVariable Long Id) {
		return fornecedorService.getFornecedorbyId(Id);
	}
	@GetMapping
	public List<Fornecedor> ListarOsFornecedores(){
		return fornecedorService.getAllFornecedor();
	}
	@DeleteMapping("/{id}")
	public void DeletarFornecedor(@PathVariable Long id) {
		fornecedorService.DeletarFornecedor(id);
	}

}
