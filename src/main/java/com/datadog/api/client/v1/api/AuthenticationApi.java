
package com.datadog.api.client.v1.api;

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.ApiResponse;
import com.datadog.api.client.Pair;
import com.datadog.api.client.PaginationIterable;

import jakarta.ws.rs.core.GenericType;
import jakarta.ws.rs.client.Invocation;

import java.io.File;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.LinkedHashMap;
import java.util.concurrent.CompletableFuture;
import java.time.OffsetDateTime;
import java.util.UUID;
import com.datadog.api.client.v1.model.AuthenticationValidationResponse;


@jakarta.annotation.Generated(value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class AuthenticationApi {
  private ApiClient apiClient;
  public AuthenticationApi() {
    this(ApiClient.getDefaultApiClient());
  }

  public AuthenticationApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /**
   * Get the API client.
   *
   * @return API client
   */
  public ApiClient getApiClient() {
    return apiClient;
  }

  /**
   * Set the API client.
   *
   * @param apiClient an instance of API client
   */
  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /**
 * Validate API key.
 *
 * See {@link #validateWithHttpInfo}.
 *
 * @return AuthenticationValidationResponse
 * @throws ApiException if fails to make API call
 */
  public AuthenticationValidationResponse  validate() throws ApiException {
    return validateWithHttpInfo().getData();
  }

  /**
 * Validate API key.
 *
 * See {@link #validateWithHttpInfoAsync}.
 *
 * @return CompletableFuture&lt;AuthenticationValidationResponse&gt;
 */
  public CompletableFuture<AuthenticationValidationResponse>validateAsync() {
    return validateWithHttpInfoAsync().thenApply(response -> {
        return response.getData();
    });
  }


  /**
   * <p>Check if the API key (not the APP key) is valid. If invalid, a 403 is returned.</p>
   *
   * @return ApiResponse&lt;AuthenticationValidationResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   * <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Authentication error </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<AuthenticationValidationResponse> validateWithHttpInfo() throws ApiException {
    Object localVarPostBody = null;
    // create path and map variables
    String localVarPath = "/api/v1/validate";

    
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();


    Invocation.Builder builder = apiClient.createBuilder("v1.AuthenticationApi.validate", localVarPath, new ArrayList<Pair>(), localVarHeaderParams, new HashMap<String, String>(), new String[] {"application/json" }, new String[] { "apiKeyAuth" });
    return apiClient.invokeAPI("GET", builder, localVarHeaderParams,  new String[] { }, localVarPostBody,new HashMap<String, Object>() , false, new GenericType<AuthenticationValidationResponse>() {});
  }

  /**
   * Validate API key.
   *
   * See {@link #validateWithHttpInfo}.
   *
   * @return CompletableFuture&lt;ApiResponse&lt;AuthenticationValidationResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<AuthenticationValidationResponse>> validateWithHttpInfoAsync() {
    Object localVarPostBody = null;
    // create path and map variables
    String localVarPath = "/api/v1/validate";

    
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();


    Invocation.Builder builder;
    try {
      builder = apiClient.createBuilder("v1.AuthenticationApi.validate", localVarPath, new ArrayList<Pair>(), localVarHeaderParams, new HashMap<String, String>(), new String[] {"application/json" }, new String[] { "apiKeyAuth" });
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<AuthenticationValidationResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(ex);
      return result;
    }
    return apiClient.invokeAPIAsync("GET", builder, localVarHeaderParams,  new String[] { }, localVarPostBody,new HashMap<String, Object>() , false, new GenericType<AuthenticationValidationResponse>() {});
  }
}