package com.datadog.api.client.v2.api;

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.ApiResponse;
import com.datadog.api.client.Pair;
import com.datadog.api.client.v2.model.StegadographyWidgetsResponse;
import jakarta.ws.rs.client.Invocation;
import jakarta.ws.rs.core.GenericType;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.CompletableFuture;

@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class StegadographyApi {
  private ApiClient apiClient;

  public StegadographyApi() {
    this(ApiClient.getDefaultApiClient());
  }

  public StegadographyApi(ApiClient apiClient) {
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

  /** Manage optional parameters to getWidgetsFromImage. */
  public static class GetWidgetsFromImageOptionalParameters {
    private File image;

    /**
     * Set image.
     *
     * @param image A PNG image (for example, a dashboard screenshot) containing embedded widget
     *     watermarks. (optional)
     * @return GetWidgetsFromImageOptionalParameters
     */
    public GetWidgetsFromImageOptionalParameters image(File image) {
      this.image = image;
      return this;
    }
  }

  /**
   * Get widgets from an image.
   *
   * <p>See {@link #getWidgetsFromImageWithHttpInfo}.
   *
   * @return StegadographyWidgetsResponse
   * @throws ApiException if fails to make API call
   */
  public StegadographyWidgetsResponse getWidgetsFromImage() throws ApiException {
    return getWidgetsFromImageWithHttpInfo(new GetWidgetsFromImageOptionalParameters()).getData();
  }

  /**
   * Get widgets from an image.
   *
   * <p>See {@link #getWidgetsFromImageWithHttpInfoAsync}.
   *
   * @return CompletableFuture&lt;StegadographyWidgetsResponse&gt;
   */
  public CompletableFuture<StegadographyWidgetsResponse> getWidgetsFromImageAsync() {
    return getWidgetsFromImageWithHttpInfoAsync(new GetWidgetsFromImageOptionalParameters())
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Get widgets from an image.
   *
   * <p>See {@link #getWidgetsFromImageWithHttpInfo}.
   *
   * @param parameters Optional parameters for the request.
   * @return StegadographyWidgetsResponse
   * @throws ApiException if fails to make API call
   */
  public StegadographyWidgetsResponse getWidgetsFromImage(
      GetWidgetsFromImageOptionalParameters parameters) throws ApiException {
    return getWidgetsFromImageWithHttpInfo(parameters).getData();
  }

  /**
   * Get widgets from an image.
   *
   * <p>See {@link #getWidgetsFromImageWithHttpInfoAsync}.
   *
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;StegadographyWidgetsResponse&gt;
   */
  public CompletableFuture<StegadographyWidgetsResponse> getWidgetsFromImageAsync(
      GetWidgetsFromImageOptionalParameters parameters) {
    return getWidgetsFromImageWithHttpInfoAsync(parameters)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Extracts embedded watermarks from an uploaded PNG image (for example, a dashboard screenshot)
   * and returns the cached widget state matching each watermark found.
   *
   * @param parameters Optional parameters for the request.
   * @return ApiResponse&lt;StegadographyWidgetsResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 415 </td><td> Unsupported Media Type </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *       <tr><td> 500 </td><td> Internal Server Error </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<StegadographyWidgetsResponse> getWidgetsFromImageWithHttpInfo(
      GetWidgetsFromImageOptionalParameters parameters) throws ApiException {
    // Check if unstable operation is enabled
    String operationId = "getWidgetsFromImage";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      throw new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId));
    }
    Object localVarPostBody = null;
    File image = parameters.image;
    // create path and map variables
    String localVarPath = "/api/v2/stegadography/get-widgets";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    if (image != null) {
      localVarFormParams.put("image", image);
    }

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.StegadographyApi.getWidgetsFromImage",
            localVarPath,
            new ArrayList<Pair>(),
            localVarHeaderParams,
            new HashMap<String, String>(),
            new String[] {"application/json"},
            new String[] {"apiKeyAuth", "appKeyAuth"});
    return apiClient.invokeAPI(
        "POST",
        builder,
        localVarHeaderParams,
        new String[] {"multipart/form-data"},
        localVarPostBody,
        localVarFormParams,
        false,
        new GenericType<StegadographyWidgetsResponse>() {});
  }

  /**
   * Get widgets from an image.
   *
   * <p>See {@link #getWidgetsFromImageWithHttpInfo}.
   *
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;ApiResponse&lt;StegadographyWidgetsResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<StegadographyWidgetsResponse>>
      getWidgetsFromImageWithHttpInfoAsync(GetWidgetsFromImageOptionalParameters parameters) {
    // Check if unstable operation is enabled
    String operationId = "getWidgetsFromImage";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      CompletableFuture<ApiResponse<StegadographyWidgetsResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId)));
      return result;
    }
    Object localVarPostBody = null;
    File image = parameters.image;
    // create path and map variables
    String localVarPath = "/api/v2/stegadography/get-widgets";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    if (image != null) {
      localVarFormParams.put("image", image);
    }

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.StegadographyApi.getWidgetsFromImage",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<StegadographyWidgetsResponse>> result =
          new CompletableFuture<>();
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
        new GenericType<StegadographyWidgetsResponse>() {});
  }
}
