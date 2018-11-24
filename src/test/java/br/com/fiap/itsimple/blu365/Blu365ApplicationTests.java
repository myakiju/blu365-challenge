package br.com.fiap.itsimple.blu365;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import br.com.fiap.itsimple.blu365.api.client.ReceitaFederalClient;
import br.com.fiap.itsimple.blu365.api.client.builder.ApiClientBuilder;
import br.com.fiap.itsimple.blu365.resource.JsonResource;

@RunWith(SpringRunner.class)
@SpringBootTest
public class Blu365ApplicationTests {

	private ReceitaFederalClient receitaClient;

	@Before
	public void setup() {
		ApiClientBuilder clientBuilder = new ApiClientBuilder();
		receitaClient = clientBuilder.getReceitaClient();
	}

	@Test
	public void testReceitaApi() {
		JsonResource data = receitaClient.findByCnpj("27865757000102");
		System.out.println(data);
	}
}
