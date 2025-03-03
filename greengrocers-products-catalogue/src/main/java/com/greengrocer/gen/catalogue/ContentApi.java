/**
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech) (7.12.0).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
package com.greengrocer.gen.catalogue;

import com.greengrocer.gen.entity.ProductsSummary;
import com.greengrocer.gen.entity.SupplierSummaryInner;
import io.swagger.v3.oas.annotations.ExternalDocumentation;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.Parameters;
import io.swagger.v3.oas.annotations.media.ArraySchema;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import io.swagger.v3.oas.annotations.tags.Tag;
import io.swagger.v3.oas.annotations.enums.ParameterIn;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.context.request.NativeWebRequest;
import org.springframework.web.multipart.MultipartFile;

import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import jakarta.annotation.Generated;

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-03-02T22:12:19.538108500Z[Europe/London]", comments = "Generator version: 7.12.0")
@Validated
@Tag(name = "developers", description = "Development API for suppliers and products data")
public interface ContentApi {

    default Optional<NativeWebRequest> getRequest() {
        return Optional.empty();
    }

    /**
     * GET /content/v1/health-check : Health check ping
     * Perform health check of product inventory services availability
     *
     * @return All good! (status code 200)
     *         or System unhealthy; find a solution to avoid disrupting others! (status code 400)
     */
    @Operation(
        operationId = "healthCheck",
        summary = "Health check ping",
        description = "Perform health check of product inventory services availability",
        tags = { "developers" },
        responses = {
            @ApiResponse(responseCode = "200", description = "All good!", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = String.class))
            }),
            @ApiResponse(responseCode = "400", description = "System unhealthy; find a solution to avoid disrupting others!", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = String.class))
            })
        }
    )
    @RequestMapping(
        method = RequestMethod.GET,
        value = "/content/v1/health-check",
        produces = { "application/json" }
    )
    
    default ResponseEntity<String> healthCheck(
        
    ) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * GET /content/v1/suppliers/{supplierId}/products/{productId} : Details of a product
     * Gets details a product
     *
     * @param supplierId  (required)
     * @param productId  (required)
     * @return Details of the product (status code 200)
     */
    @Operation(
        operationId = "product",
        summary = "Details of a product",
        description = "Gets details a product",
        tags = { "developers" },
        responses = {
            @ApiResponse(responseCode = "200", description = "Details of the product")
        }
    )
    @RequestMapping(
        method = RequestMethod.GET,
        value = "/content/v1/suppliers/{supplierId}/products/{productId}"
    )
    
    default ResponseEntity<Void> product(
        @Parameter(name = "supplierId", description = "", required = true, in = ParameterIn.PATH) @PathVariable("supplierId") String supplierId,
        @Parameter(name = "productId", description = "", required = true, in = ParameterIn.PATH) @PathVariable("productId") String productId
    ) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * GET /content/v1/products : All product
     * Gets a list of all products
     *
     * @return List of all products (status code 200)
     */
    @Operation(
        operationId = "products",
        summary = "All product",
        description = "Gets a list of all products",
        tags = { "developers" },
        responses = {
            @ApiResponse(responseCode = "200", description = "List of all products")
        }
    )
    @RequestMapping(
        method = RequestMethod.GET,
        value = "/content/v1/products"
    )
    
    default ResponseEntity<Void> products(
        
    ) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * GET /content/v1/suppliers : List of all available suppliers
     * Fetch all the suppliers of greengrocer (admin only) 
     *
     * @return Return the list of all suppliers (status code 200)
     */
    @Operation(
        operationId = "suppliers",
        summary = "List of all available suppliers",
        description = "Fetch all the suppliers of greengrocer (admin only) ",
        tags = { "admins" },
        responses = {
            @ApiResponse(responseCode = "200", description = "Return the list of all suppliers", content = {
                @Content(mediaType = "application/json", array = @ArraySchema(schema = @Schema(implementation = SupplierSummaryInner.class)))
            })
        }
    )
    @RequestMapping(
        method = RequestMethod.GET,
        value = "/content/v1/suppliers",
        produces = { "application/json" }
    )
    
    default ResponseEntity<List<SupplierSummaryInner>> suppliers(
        
    ) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "[ { \"name\" : \"World Record Breaker\", \"id\" : \"UK-123\", \"products\" : [ [ { \"productId\" : 345, \"name\" : \"Kulkuli\", \"sellUnitPrice\" : 3.0, \"sellUnitCurrency\" : \"GBP\", \"barCode\" : \"99999\" } ], [ { \"productId\" : 345, \"name\" : \"Kulkuli\", \"sellUnitPrice\" : 3.0, \"sellUnitCurrency\" : \"GBP\", \"barCode\" : \"99999\" } ] ] }, { \"name\" : \"World Record Breaker\", \"id\" : \"UK-123\", \"products\" : [ [ { \"productId\" : 345, \"name\" : \"Kulkuli\", \"sellUnitPrice\" : 3.0, \"sellUnitCurrency\" : \"GBP\", \"barCode\" : \"99999\" } ], [ { \"productId\" : 345, \"name\" : \"Kulkuli\", \"sellUnitPrice\" : 3.0, \"sellUnitCurrency\" : \"GBP\", \"barCode\" : \"99999\" } ] ] } ]";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * GET /content/v1/suppliers/{supplierId}/products : List of all available products for the given supplier
     * Fetch all products supplied by a specific suppliers (developers only) 
     *
     * @param supplierId  (required)
     * @return List of products by the supplier (status code 200)
     */
    @Operation(
        operationId = "suppliersProducts",
        summary = "List of all available products for the given supplier",
        description = "Fetch all products supplied by a specific suppliers (developers only) ",
        tags = { "developers" },
        responses = {
            @ApiResponse(responseCode = "200", description = "List of products by the supplier", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = ProductsSummary.class))
            })
        }
    )
    @RequestMapping(
        method = RequestMethod.GET,
        value = "/content/v1/suppliers/{supplierId}/products",
        produces = { "application/json" }
    )
    
    default ResponseEntity<ProductsSummary> suppliersProducts(
        @Parameter(name = "supplierId", description = "", required = true, in = ParameterIn.PATH) @PathVariable("supplierId") String supplierId
    ) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "[ { \"productId\" : 345, \"name\" : \"Kulkuli\", \"sellUnitPrice\" : 3.0, \"sellUnitCurrency\" : \"GBP\", \"barCode\" : \"99999\" } ]";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

}
