package br.com.zyon.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/values")
public class ValuesController {

	@Value("${variavel}")
	private String variavel;

	@Value("${variavelUm}")
	private String variavelUm;

	@RequestMapping(method = RequestMethod.GET, value = "all")
	public List<String> values() {
		return Arrays.asList(variavel, variavelUm);
	}

}
