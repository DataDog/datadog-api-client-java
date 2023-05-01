package com.datadog.api.client.v2.api;

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.ApiResponse;
import com.datadog.api.client.Pair;
import jakarta.ws.rs.client.Invocation;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.CompletableFuture;

@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class OrganizationsApi {
  private ApiClient apiClient;

  public OrganizationsApi() {
    this(ApiClient.getDefaultApiClient());
  }

  public OrganizationsApi(ApiClient apiClient) {
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

  /** Manage optional parameters to uploadIdPMetadata. */
  public static class UploadIdPMetadataOptionalParameters {
    private File idpFile;

    /**
     * Set idpFile.
     *
     * @param idpFile The IdP metadata XML file (optional)
     * @return UploadIdPMetadataOptionalParameters
     */
    public UploadIdPMetadataOptionalParameters idpFile(File idpFile) {
      this.idpFile = idpFile;
      return this;
    }
  }

  /**
   * Upload IdP metadata.
   *
   * <p>See {@link #uploadIdPMetadataWithHttpInfo}.
   *
   * @throws ApiException if fails to make API call
   */
  public void uploadIdPMetadata() throws ApiException {
    uploadIdPMetadataWithHttpInfo(new UploadIdPMetadataOptionalParameters());
  }

  /**
   * Upload IdP metadata.
   *
   * <p>See {@link #uploadIdPMetadataWithHttpInfoAsync}.
   *
   * @return CompletableFuture
   */
  public CompletableFuture<Void> uploadIdPMetadataAsync() {
    return uploadIdPMetadataWithHttpInfoAsync(new UploadIdPMetadataOptionalParameters())
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Upload IdP metadata.
   *
   * <p>See {@link #uploadIdPMetadataWithHttpInfo}.
   *
   * @param parameters Optional parameters for the request.
   * @throws ApiException if fails to make API call
   */
  public void uploadIdPMetadata(UploadIdPMetadataOptionalParameters parameters)
      throws ApiException {
    uploadIdPMetadataWithHttpInfo(parameters);
  }

  /**
   * Upload IdP metadata.
   *
   * <p>See {@link #uploadIdPMetadataWithHttpInfoAsync}.
   *
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture
   */
  public CompletableFuture<Void> uploadIdPMetadataAsync(
      UploadIdPMetadataOptionalParameters parameters) {
    return uploadIdPMetadataWithHttpInfoAsync(parameters)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Endpoint for uploading IdP metadata for SAML setup.
   *
   * <p>Use this endpoint to upload or replace IdP metadata for SAML login configuration.
   *
   * @param parameters Optional parameters for the request.
   * @return ApiResponse&lt;Void&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<Void> uploadIdPMetadataWithHttpInfo(
      UploadIdPMetadataOptionalParameters parameters) throws ApiException {
    Object localVarPostBody = null;
    File idpFile = parameters.idpFile;
    // create path and map variables
    String localVarPath = "/api/v2/saml_configurations/idp_metadata";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    if (idpFile != null) localVarFormParams.put("idp_file", idpFile);

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.OrganizationsApi.uploadIdPMetadata",
            localVarPath,
            new ArrayList<Pair>(),
            localVarHeaderParams,
            new HashMap<String, String>(),
            new String[] {"*/*"},
            new String[] {"apiKeyAuth", "appKeyAuth"});
    return apiClient.invokeAPI(
        "POST",
        builder,
        localVarHeaderParams,
        new String[] {"multipart/form-data"},
        localVarPostBody,
        localVarFormParams,
        false,
        null);
  }

  /**
   * Upload IdP metadata.
   *
   * <p>See {@link #uploadIdPMetadataWithHttpInfo}.
   *
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;ApiResponse&lt;Void&gt;&gt;
   */
  public CompletableFuture<ApiResponse<Void>> uploadIdPMetadataWithHttpInfoAsync(
      UploadIdPMetadataOptionalParameters parameters) {
    Object localVarPostBody = null;
    File idpFile = parameters.idpFile;
    // create path and map variables
    String localVarPath = "/api/v2/saml_configurations/idp_metadata";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    if (idpFile != null) localVarFormParams.put("idp_file", idpFile);

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.OrganizationsApi.uploadIdPMetadata",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"*/*"},
              new String[] {"apiKeyAuth", "appKeyAuth"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<Void>> result = new CompletableFuture<>();
      result.completeExceptionally(ex);
      return result;
    }
    return apiClient.invokeAPIAsync(
        "POST",
        builder,
        localVarHeaderParams,
        new String[] {"multipart/form-data"},
        localVarPostBody,
        localVarFormParams,
        false,
        null);
  }
}
