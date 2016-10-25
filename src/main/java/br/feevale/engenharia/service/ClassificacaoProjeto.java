//package br.feevale.engenharia.service;
//
//import java.util.List;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Component;
//
//import br.feevale.engenharia.model.Aluno;
//import br.feevale.engenharia.repository.AlunoRepository;
//
//@Component
//public class ClassificacaoProjeto {
//
//	@Autowired
//	private AlunoRepository repository;
//	
//	public void save(ClassificacaoProjeto model){
//		repository.saveAndFlush(model);
//	}
//	
//	public ClassificacaoProjeto findById(Long id){
//		return repository.findOne(id);
//	}
//	
//	public void delete(Long id) {
//		repository.delete(id);
//	}
//	
//	public List<ClassificacaoProjeto> findAll() {
//		return repository.findAll();
//	}
//	
//}
