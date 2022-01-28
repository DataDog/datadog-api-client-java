package com.datadog.api.v1.client.api;

import com.datadog.api.v1.client.ApiClient;
import com.datadog.api.v1.client.ApiException;
import com.datadog.api.v1.client.ApiResponse;
import com.datadog.api.v1.client.Configuration;
import com.datadog.api.v1.client.Pair;
import com.datadog.api.v1.client.model.IntakePayloadAccepted;
import com.datadog.api.v1.client.model.ServiceCheck;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CompletableFuture;
import javax.ws.rs.core.GenericType;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class ServiceChecksApi {
  private ApiClient apiClient;

  public ServiceChecksApi() {
    this(Configuration.getDefaultApiClient());
  }

  public ServiceChecksApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /**
   * Get the API client
   *
   * @return API client
   */
  public ApiClient getApiClient() {
    return apiClient;
  }

  /**
   * Set the API client
   *
   * @param apiClient an instance of API client
   */
  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /**
   * Submit a Service Check
   *
   * <p>See {@link #submitServiceCheckWithHttpInfo}.
   *
   * @param body Service Check request body. (required)
   * @return IntakePayloadAccepted
   * @throws ApiException if fails to make API call
   */
  public IntakePayloadAccepted submitServiceCheck(List<ServiceCheck> body) throws ApiException {
    return submitServiceCheckWithHttpInfo(body).getData();
  }

  public CompletableFuture<IntakePayloadAccepted> submitServiceCheckAsync(List<ServiceCheck> body) {
    return submitServiceCheckWithHttpInfoAsync(body)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Submit a Service Check
   *
   * <p>Submit a list of Service Checks. **Notes**: - A valid API key is required. - Service checks
   * can be submitted up to 10 minutes in the past.
   *
   * @param body Service Check request body. (required)
   * @return ApiResponse&lt;IntakePayloadAccepted&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 202 </td><td> Payload accepted </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Authentication Error </td><td>  -  </td></tr>
   *       <tr><td> 408 </td><td> Request timeout </td><td>  -  </td></tr>
   *       <tr><td> 413 </td><td> Payload too large </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<IntakePayloadAccepted> submitServiceCheckWithHttpInfo(List<ServiceCheck> body)
      throws ApiException {
    Object localVarPostBody = body;

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(
          400, "Missing the required parameter 'body' when calling submitServiceCheck");
    }
    // create path and map variables
    String localVarPath = "/api/v1/check_run";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    // Set Operation-ID header for telemetry
    localVarHeaderParams.put("DD-OPERATION-ID", "submitServiceCheck");

    final String[] localVarAccepts = {"text/json", "application/json"};
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {"application/json"};
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {"apiKeyAuth"};

    GenericType<IntakePayloadAccepted> localVarReturnType =
        new GenericType<IntakePayloadAccepted>() {};

    return apiClient.invokeAPI(
        "ServiceChecksApi.submitServiceCheck",
        localVarPath,
        "POST",
        localVarQueryParams,
        localVarPostBody,
        localVarHeaderParams,
        localVarCookieParams,
        localVarFormParams,
        localVarAccept,
        localVarContentType,
        localVarAuthNames,
        localVarReturnType,
        false);
  }

  /**
   * Submit a Service Check
   *
   * <p>See {@link #submitServiceCheckWithHttpInfo}.
   *
   * @param body Service Check request body. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;IntakePayloadAccepted&gt;&gt;
   */
  public CompletableFuture<ApiResponse<IntakePayloadAccepted>> submitServiceCheckWithHttpInfoAsync(
      List<ServiceCheck> body) {
    Object localVarPostBody = body;

    // verify the required parameter 'body' is set
    if (body == null) {
      CompletableFuture<ApiResponse<IntakePayloadAccepted>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'body' when calling submitServiceCheck"));
      return result;
    }
    // create path and map variables
    String localVarPath = "/api/v1/check_run";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    // Set Operation-ID header for telemetry
    localVarHeaderParams.put("DD-OPERATION-ID", "submitServiceCheck");

    final String[] localVarAccepts = {"text/json", "application/json"};
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {"application/json"};
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {"apiKeyAuth"};

    GenericType<IntakePayloadAccepted> localVarReturnType =
        new GenericType<IntakePayloadAccepted>() {};

    return apiClient.invokeAPIAsync(
        "ServiceChecksApi.submitServiceCheck",
        localVarPath,
        "POST",
        localVarQueryParams,
        localVarPostBody,
        localVarHeaderParams,
        localVarCookieParams,
        localVarFormParams,
        localVarAccept,
        localVarContentType,
        localVarAuthNames,
        localVarReturnType,
        false);
  }
}
