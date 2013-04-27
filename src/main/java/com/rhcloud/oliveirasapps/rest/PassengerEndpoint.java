package com.rhcloud.oliveirasapps.rest;

import java.util.List;

import javax.ejb.Stateless;
import javax.ejb.TransactionAttribute;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.PersistenceContextType;
import javax.ws.rs.*;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;
import javax.ws.rs.core.UriBuilder;
import com.rhcloud.oliveirasapps.taxibolt.model.Passenger;

/**
 * 
 */
@Stateless
@Path("/passengers")
public class PassengerEndpoint
{
   @PersistenceContext
   private EntityManager em;

   @POST
   @Consumes("application/json")
   public Response create(Passenger entity)
   {
      em.persist(entity);
      return Response.created(UriBuilder.fromResource(PassengerEndpoint.class).path(String.valueOf(entity.getId())).build()).build();
   }

   @DELETE
   @Path("/{id:[0-9][0-9]*}")
   public Response deleteById(@PathParam("id")
   Long id)
   {
      Passenger entity = em.find(Passenger.class, id);
      if (entity == null)
      {
         return Response.status(Status.NOT_FOUND).build();
      }
      em.remove(entity);
      return Response.noContent().build();
   }

   @GET
   @Path("/{id:[0-9][0-9]*}")
   @Produces("application/json")
   public Response findById(@PathParam("id")
   Long id)
   {
      Passenger entity = em.find(Passenger.class, id);
      if (entity == null)
      {
         return Response.status(Status.NOT_FOUND).build();
      }
      return Response.ok(entity).build();
   }

   @GET
   @Produces("application/json")
   public List<Passenger> listAll()
   {
      final List<Passenger> results = em.createQuery("FROM Passenger", Passenger.class).getResultList();
      return results;
   }

   @PUT
   @Path("/{id:[0-9][0-9]*}")
   @Consumes("application/json")
   public Response update(@PathParam("id")
   Long id, Passenger entity)
   {
      entity.setId(id);
      entity = em.merge(entity);
      return Response.noContent().build();
   }
}