package br.com.poc.restease.services;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import br.com.poc.restease.domain.EnderecoCEP;

/**
 * Definição dos serviços de usuários expostos pelo middleware do portal.
 */
public interface SearchCorreirosServices {

    @Path("{cep}.json")
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    EnderecoCEP search(@PathParam("cep") String cep);

}
