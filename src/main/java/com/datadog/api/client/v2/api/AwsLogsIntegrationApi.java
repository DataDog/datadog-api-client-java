
package com.datadog.api.client.v2.api;

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
import com.datadog.api.client.v2.model.AWSLogsServicesResponse;


@jakarta.annotation.Generated(value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class AwsLogsIntegrationApi {
  private ApiClient apiClient;
  public AwsLogsIntegrationApi() {
    this(ApiClient.getDefaultApiClient());
  }

  public AwsLogsIntegrationApi(ApiClient apiClient) {
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
 * Get list of AWS log ready services.
 *
 * See {@link #listAWSLogsServicesWithHttpInfo}.
 *
 * @return AWSLogsServicesResponse
 * @throws ApiException if fails to make API call
 */
  public AWSLogsServicesResponse  listAWSLogsServices() throws ApiException {
    return listAWSLogsServicesWithHttpInfo().getData();
  }

  /**
 * Get list of AWS log ready services.
 *
 * See {@link #listAWSLogsServicesWithHttpInfoAsync}.
 *
 * @return CompletableFuture&lt;AWSLogsServicesResponse&gt;
 */
  public CompletableFuture<AWSLogsServicesResponse>listAWSLogsServicesAsync() {
    return listAWSLogsServicesWithHttpInfoAsync().thenApply(response -> {
        return response.getData();
    });
  }


  /**
   * <p>Get a list of AWS services that can send logs to Datadog.</p>
   *
   * @return ApiResponse&lt;AWSLogsServicesResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   * <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> AWS Logs Services List object </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<AWSLogsServicesResponse> listAWSLogsServicesWithHttpInfo() throws ApiException {
    Object localVarPostBody = null;
    // create path and map variables
    String localVarPath = "/api/v2/integration/aws/logs/services";

    
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();


    Invocation.Builder builder = apiClient.createBuilder("v2.AwsLogsIntegrationApi.listAWSLogsServices", localVarPath, new ArrayList<Pair>(), localVarHeaderParams, new HashMap<String, String>(), new String[] {"application/json" }, new String[] { "apiKeyAuth", "appKeyAuth" });
    return apiClient.invokeAPI("GET", builder, localVarHeaderParams,  new String[] { }, localVarPostBody,new HashMap<String, Object>() , false, new GenericType<AWSLogsServicesResponse>() {});
  }

  /**
   * Get list of AWS log ready services.
   *
   * See {@link #listAWSLogsServicesWithHttpInfo}.
   *
   * @return CompletableFuture&lt;ApiResponse&lt;AWSLogsServicesResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<AWSLogsServicesResponse>> listAWSLogsServicesWithHttpInfoAsync() {
    Object localVarPostBody = null;
    // create path and map variables
    String localVarPath = "/api/v2/integration/aws/logs/services";

    
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();


    Invocation.Builder builder;
    try {
      builder = apiClient.createBuilder("v2.AwsLogsIntegrationApi.listAWSLogsServices", localVarPath, new ArrayList<Pair>(), localVarHeaderParams, new HashMap<String, String>(), new String[] {"application/json" }, new String[] { "apiKeyAuth", "appKeyAuth" });
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<AWSLogsServicesResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(ex);
      return result;
    }
    return apiClient.invokeAPIAsync("GET", builder, localVarHeaderParams,  new String[] { }, localVarPostBody,new HashMap<String, Object>() , false, new GenericType<AWSLogsServicesResponse>() {});
  }
}