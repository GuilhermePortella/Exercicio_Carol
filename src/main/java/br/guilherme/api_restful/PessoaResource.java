package br.guilherme.api_restful;

import java.util.List;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import org.glassfish.jersey.message.internal.MediaTypes;

/**
 *
 * @author Guilherme
 */
@Path("/pessoa")
public class PessoaResource {

    private PessoaRepository _repository = new PessoaRepository();

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Pessoa> get() {
        return _repository.GetAll();
    }
    
    @GET
    @Path("{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Pessoa getById(@PathParam("id") int id){
        return _repository.Get(id);
    }
    
    @POST
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public Response post(Pessoa pessoa){
        try{
            _repository.Add(pessoa);
            return Response.status(Response.Status.CREATED).entity(pessoa).build();
        }catch(Exception exception){
            return Response.status(Response.Status.INTERNAL_SERVER_ERROR).entity(exception.getMessage()).build();
        }
    }
    
    @PUT
    public Response put(){
        return null;
    }

}
