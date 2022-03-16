package com.ehsproy.ClientCompany.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ehsproy.ClientCompany.model.InfoEmpresa;
import com.ehsproy.ClientCompany.service.IInfoEmpresaService;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Slf4j
@RestController
@RequestMapping("/clients")
@RequiredArgsConstructor
public class InfoEmpresaController {
	
	private final IInfoEmpresaService infoEmpService;
	
	@GetMapping
	public Flux<InfoEmpresa> findAll(){
		return infoEmpService.findAll();
	}
	
	@GetMapping("/{id}")
	public Mono<InfoEmpresa> findById(@PathVariable String id){
		return infoEmpService.findById(id);
	}
	
	@PostMapping
	public Mono<InfoEmpresa> save(@RequestBody InfoEmpresa client){
		log.info("grabado");
		return infoEmpService.save(client);
	}
	
	@PutMapping
	public Mono<InfoEmpresa> put(@RequestBody InfoEmpresa client){
		return infoEmpService.save(client);
	}
	
	@DeleteMapping("/{id}")
	public Mono<Void> deleteById(@PathVariable String id){
		return infoEmpService.deleteById(id);
	}
	
	@GetMapping("/busca/{numDoc}")
	public Mono<InfoEmpresa> findByDocNumber(@PathVariable String numDoc){
		return infoEmpService.findByDocNumber(numDoc);
	}

}
