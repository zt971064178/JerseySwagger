package cn.itcast.jersey.swagger.server;

import java.util.UUID;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

import com.alibaba.fastjson.JSONObject;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

@Path("/demo")
@Api(value="/demo")
public class DemoServer {
	
	@GET 
	@Path("{username}")
	@Produces("application/json")
	@ApiOperation(value = "Find product by ID", notes = "More notes about this method", response = Produces.class, httpMethod = "GET")
    @ApiResponses(value = {
            @ApiResponse(code = 400, message = "Invalid username supplied"),
            @ApiResponse(code = 404, message = "Product not found")
    })
	public String getUser(@ApiParam(value = "Resource identifier", required = true) @PathParam("username") String userName) {
		JSONObject jsonObject = new JSONObject() ;
		jsonObject.put("id", UUID.randomUUID().toString()) ;
		jsonObject.put("username", userName) ;
		jsonObject.put("address", "苏州园区莲花五区") ;
		
		return jsonObject.toJSONString() ;
	}
}
