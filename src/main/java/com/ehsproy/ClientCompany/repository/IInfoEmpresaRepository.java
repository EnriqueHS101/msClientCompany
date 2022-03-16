package com.ehsproy.ClientCompany.repository;

import org.springframework.data.repository.reactive.ReactiveCrudRepository;

import com.ehsproy.ClientCompany.model.InfoEmpresa;

import reactor.core.publisher.Mono;

public interface IInfoEmpresaRepository extends ReactiveCrudRepository<InfoEmpresa, String> {

	Mono<InfoEmpresa> findByDocNumber(String numDoc);
}
