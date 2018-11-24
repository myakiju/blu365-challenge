package br.com.fiap.itsimple.blu365.api.client;

import br.com.fiap.itsimple.blu365.resource.JsonResource;
import feign.Param;
import feign.RequestLine;

public interface ReceitaFederalClient {
	@RequestLine("GET /cnpj/{cpf}")
	JsonResource findByCnpj(@Param("cnpj") String cnpj);

}
