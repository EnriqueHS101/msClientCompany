package com.ehsproy.ClientCompany.service;

import com.ehsproy.ClientCompany.model.InfoEmpresa;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface IInfoEmpresaService {

	public Flux<InfoEmpresa> findAll();
	public Mono<InfoEmpresa> findById(String id);
	public Mono<InfoEmpresa> save(InfoEmpresa client);
	public Mono<Void> deleteById(String id);
	
	public Mono<InfoEmpresa> findByDocNumber(String numDoc);
}
