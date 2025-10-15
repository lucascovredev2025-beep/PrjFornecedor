package com.lucascovre.prjCadFornecedor.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.lucascovre.prjCadFornecedor.Repository.FornecedorRepository;
import com.lucascovre.prjCadFornecedor.entitis.Fornecedor;


@Service
public class FornecedorService {

	private final FornecedorRepository FornecedorRepository;
	
	@Autowired
	public FornecedorService(FornecedorRepository FornecedorRepository) {
		 this.FornecedorRepository = FornecedorRepository;
	}
	
	public Fornecedor salvarFornecedor(Fornecedor fornecedor) {
		 return FornecedorRepository.save(fornecedor);
	}

	public Fornecedor getFornecedorbyId(Long id) {
		return FornecedorRepository.findById(id).orElse(null);
	}

	public List<Fornecedor> getAllFornecedor(){
		return FornecedorRepository.findAll();
	}

	public void DeletarFornecedor(Long id) {
		FornecedorRepository.deleteById(id);
	}
	
}
