package io.swagger.api;

import io.swagger.model.EmployeeInfoSchema;
import io.swagger.model.InputError;
import org.threeten.bp.LocalDate;
import io.swagger.model.ServerError;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.enums.ParameterIn;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.media.ArraySchema;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.constraints.*;
import javax.validation.Valid;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2021-05-25T15:44:43.284425+02:00[Africa/Johannesburg]")
@RestController
public class TenureApiController implements TenureApi {

    private static final Logger log = LoggerFactory.getLogger(TenureApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;

    @org.springframework.beans.factory.annotation.Autowired
    public TenureApiController(ObjectMapper objectMapper, HttpServletRequest request) {
        this.objectMapper = objectMapper;
        this.request = request;
    }

    public ResponseEntity<EmployeeInfoSchema> getTenureById(@NotNull @Min(0)@Parameter(in = ParameterIn.QUERY, description = "ID of employee whose tenure is to be returned" ,required=true,schema=@Schema(allowableValues={  }
)) @Valid @RequestParam(value = "id", required = true) Integer id) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<EmployeeInfoSchema>(objectMapper.readValue("{\n  \"name\" : \"Joe Soap\",\n  \"id\" : 1,\n  \"tenure\" : 371\n}", EmployeeInfoSchema.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<EmployeeInfoSchema>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<EmployeeInfoSchema>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<EmployeeInfoSchema> patchTenure(@NotNull @Parameter(in = ParameterIn.QUERY, description = "ID of employee whose tenure is to be returned" ,required=true,schema=@Schema()) @Valid @RequestParam(value = "id", required = true) Integer id,@NotNull @Parameter(in = ParameterIn.QUERY, description = "The date (YYYY-MM-DD) on which the employee started. If not provided, the current date will be used." ,required=true,schema=@Schema()) @Valid @RequestParam(value = "StartDate", required = true) String startDate) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<EmployeeInfoSchema>(objectMapper.readValue("{\n  \"name\" : \"Joe Soap\",\n  \"id\" : 1,\n  \"tenure\" : 371\n}", EmployeeInfoSchema.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<EmployeeInfoSchema>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<EmployeeInfoSchema>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<EmployeeInfoSchema> postTenure(@NotNull @Parameter(in = ParameterIn.QUERY, description = "The name of the new Employee" ,required=true,schema=@Schema()) @Valid @RequestParam(value = "EmployeeName", required = true) String employeeName,@Parameter(in = ParameterIn.QUERY, description = "The date (YYYY-MM-DD) on which the employee started. If not provided, the current date will be used." ,schema=@Schema()) @Valid @RequestParam(value = "StartDate", required = false) LocalDate startDate) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<EmployeeInfoSchema>(objectMapper.readValue("{\n  \"name\" : \"Joe Soap\",\n  \"id\" : 1,\n  \"tenure\" : 371\n}", EmployeeInfoSchema.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<EmployeeInfoSchema>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<EmployeeInfoSchema>(HttpStatus.NOT_IMPLEMENTED);
    }

}
