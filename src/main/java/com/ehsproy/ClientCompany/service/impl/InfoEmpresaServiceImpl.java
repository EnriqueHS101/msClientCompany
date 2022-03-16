package com.ehsproy.ClientCompany.service.impl;

import org.springframework.stereotype.Service;

import com.ehsproy.ClientCompany.model.InfoEmpresa;
import com.ehsproy.ClientCompany.repository.IInfoEmpresaRepository;
import com.ehsproy.ClientCompany.service.IInfoEmpresaService;

import lombok.RequiredArgsConstructor;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
@RequiredArgsConstructor
public class InfoEmpresaServiceImpl implements IInfoEmpresaService {

	private final IInfoEmpresaRepository infoEmpRepo;

	@Override
	public Flux<InfoEmpresa> findAll() {
		return infoEmpRepo.findAll();
	}

	@Override
	public Mono<InfoEmpresa> findById(String id) {
		return infoEmpRepo.findById(id);
	}

	@Override
	public Mono<InfoEmpresa> save(InfoEmpresa client) {
		return infoEmpRepo.save(client);
	}

	@Override
	public Mono<Void> deleteById(String id) {
		return infoEmpRepo.deleteById(id);
	}

	@Override
	public Mono<InfoEmpresa> findByDocNumber(String numDoc) {
		return infoEmpRepo.findByDocNumber(numDoc);
	}
	
	
}
