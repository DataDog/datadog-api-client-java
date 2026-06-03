package com.datadog.api.client.v2.api;

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.ApiResponse;
import com.datadog.api.client.Pair;
import com.datadog.api.client.v2.model.StegadographyGetWidgetsResponse;
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

  /**
   * Get widgets from an image.
   *
   * <p>See {@link #getStegadographyWidgetsWithHttpInfo}.
   *
   * @param image PNG image file to scan for embedded watermarks. (required)
   * @return StegadographyGetWidgetsResponse
   * @throws ApiException if fails to make API call
   */
  public StegadographyGetWidgetsResponse getStegadographyWidgets(File image) throws ApiException {
    return getStegadographyWidgetsWithHttpInfo(image).getData();
  }

  /**
   * Get widgets from an image.
   *
   * <p>See {@link #getStegadographyWidgetsWithHttpInfoAsync}.
   *
   * @param image PNG image file to scan for embedded watermarks. (required)
   * @return CompletableFuture&lt;StegadographyGetWidgetsResponse&gt;
   */
  public CompletableFuture<StegadographyGetWidgetsResponse> getStegadographyWidgetsAsync(
      File image) {
    return getStegadographyWidgetsWithHttpInfoAsync(image)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Extracts watermarks from a PNG image and returns the cached widget data associated with each
   * watermark found. The image must be uploaded as a <code>multipart/form-data</code> request with
   * the file in the <code>image</code> field. Only widgets belonging to the authenticated
   * organization are returned.
   *
   * @param image PNG image file to scan for embedded watermarks. (required)
   * @return ApiResponse&lt;StegadographyGetWidgetsResponse&gt;
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
  public ApiResponse<StegadographyGetWidgetsResponse> getStegadographyWidgetsWithHttpInfo(
      File image) throws ApiException {
    Object localVarPostBody = null;

    // verify the required parameter 'image' is set
    if (image == null) {
      throw new ApiException(
          400, "Missing the required parameter 'image' when calling getStegadographyWidgets");
    }
    // create path and map variables
    String localVarPath = "/api/v2/stegadography/get-widgets";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    if (image != null) {
      localVarFormParams.put("image", image);
    }

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.StegadographyApi.getStegadographyWidgets",
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
        new GenericType<StegadographyGetWidgetsResponse>() {});
  }

  /**
   * Get widgets from an image.
   *
   * <p>See {@link #getStegadographyWidgetsWithHttpInfo}.
   *
   * @param image PNG image file to scan for embedded watermarks. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;StegadographyGetWidgetsResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<StegadographyGetWidgetsResponse>>
      getStegadographyWidgetsWithHttpInfoAsync(File image) {
    Object localVarPostBody = null;

    // verify the required parameter 'image' is set
    if (image == null) {
      CompletableFuture<ApiResponse<StegadographyGetWidgetsResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'image' when calling getStegadographyWidgets"));
      return result;
    }
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
              "v2.StegadographyApi.getStegadographyWidgets",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<StegadographyGetWidgetsResponse>> result =
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
        new GenericType<StegadographyGetWidgetsResponse>() {});
  }
}
