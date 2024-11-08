package com.example.ClientService;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.http.ResponseEntity;
import org.springframework.web.ErrorResponse;

public interface ClientApi{
    @Tag( name = "Client", description = "Obtain the info for client service")
    @Operation(
            summary = "Add client",
            description = "Adding correct info for new client"
    )
    @ApiResponses(
            value = {
                    @ApiResponse(
                            responseCode = "200", description = "Successful"
                    ),
                    @ApiResponse(
                            responseCode = "500",
                            description = "Internal Server Error. See response message for more information",
                            content = {
                                    @Content(mediaType = "application/json",
                                            schema = @Schema(implementation = ErrorResponse.class))
                            }
                    ),
            }
    )
    ResponseEntity<ResponseDto> addClient(RequestDto requestdto);
}


