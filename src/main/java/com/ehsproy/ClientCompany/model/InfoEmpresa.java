package com.ehsproy.ClientCompany.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Data
@Document("infoDataEmpresa")
public class InfoEmpresa {

	@Id
	private String id;
	@Indexed(unique = true)
	private String docNumber;
	private String razonSocial;
	private String telephoneNumber;
	private String direction;
	private String email;
	private String codeTypeDoc;
}
