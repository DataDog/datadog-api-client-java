package com.datadog.api.client.v2.api;

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.ApiResponse;
import com.datadog.api.client.Pair;
import com.datadog.api.client.v2.model.AwsCURConfigPatchRequest;
import com.datadog.api.client.v2.model.AwsCURConfigPostRequest;
import com.datadog.api.client.v2.model.AwsCURConfigResponse;
import com.datadog.api.client.v2.model.AwsCURConfigsResponse;
import com.datadog.api.client.v2.model.AzureUCConfigPairsResponse;
import com.datadog.api.client.v2.model.AzureUCConfigPatchRequest;
import com.datadog.api.client.v2.model.AzureUCConfigPostRequest;
import com.datadog.api.client.v2.model.AzureUCConfigsResponse;
import com.datadog.api.client.v2.model.CloudCostActivityResponse;
import com.datadog.api.client.v2.model.CustomCostsFileGetResponse;
import com.datadog.api.client.v2.model.CustomCostsFileLineItem;
import com.datadog.api.client.v2.model.CustomCostsFileListResponse;
import com.datadog.api.client.v2.model.CustomCostsFileUploadResponse;
import jakarta.ws.rs.client.Invocation;
import jakarta.ws.rs.core.GenericType;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CompletableFuture;

@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class CloudCostManagementApi {
  private ApiClient apiClient;

  public CloudCostManagementApi() {
    this(ApiClient.getDefaultApiClient());
  }

  public CloudCostManagementApi(ApiClient apiClient) {
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
   * Create Cloud Cost Management AWS CUR config.
   *
   * <p>See {@link #createCostAWSCURConfigWithHttpInfo}.
   *
   * @param body (required)
   * @return AwsCURConfigResponse
   * @throws ApiException if fails to make API call
   */
  public AwsCURConfigResponse createCostAWSCURConfig(AwsCURConfigPostRequest body)
      throws ApiException {
    return createCostAWSCURConfigWithHttpInfo(body).getData();
  }

  /**
   * Create Cloud Cost Management AWS CUR config.
   *
   * <p>See {@link #createCostAWSCURConfigWithHttpInfoAsync}.
   *
   * @param body (required)
   * @return CompletableFuture&lt;AwsCURConfigResponse&gt;
   */
  public CompletableFuture<AwsCURConfigResponse> createCostAWSCURConfigAsync(
      AwsCURConfigPostRequest body) {
    return createCostAWSCURConfigWithHttpInfoAsync(body)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Create a Cloud Cost Management account for an AWS CUR config.
   *
   * @param body (required)
   * @return ApiResponse&lt;AwsCURConfigResponse&gt;
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
  public ApiResponse<AwsCURConfigResponse> createCostAWSCURConfigWithHttpInfo(
      AwsCURConfigPostRequest body) throws ApiException {
    Object localVarPostBody = body;

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(
          400, "Missing the required parameter 'body' when calling createCostAWSCURConfig");
    }
    // create path and map variables
    String localVarPath = "/api/v2/cost/aws_cur_config";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.CloudCostManagementApi.createCostAWSCURConfig",
            localVarPath,
            new ArrayList<Pair>(),
            localVarHeaderParams,
            new HashMap<String, String>(),
            new String[] {"application/json"},
            new String[] {"AuthZ", "apiKeyAuth", "appKeyAuth"});
    return apiClient.invokeAPI(
        "POST",
        builder,
        localVarHeaderParams,
        new String[] {"application/json"},
        localVarPostBody,
        new HashMap<String, Object>(),
        false,
        new GenericType<AwsCURConfigResponse>() {});
  }

  /**
   * Create Cloud Cost Management AWS CUR config.
   *
   * <p>See {@link #createCostAWSCURConfigWithHttpInfo}.
   *
   * @param body (required)
   * @return CompletableFuture&lt;ApiResponse&lt;AwsCURConfigResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<AwsCURConfigResponse>>
      createCostAWSCURConfigWithHttpInfoAsync(AwsCURConfigPostRequest body) {
    Object localVarPostBody = body;

    // verify the required parameter 'body' is set
    if (body == null) {
      CompletableFuture<ApiResponse<AwsCURConfigResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'body' when calling createCostAWSCURConfig"));
      return result;
    }
    // create path and map variables
    String localVarPath = "/api/v2/cost/aws_cur_config";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.CloudCostManagementApi.createCostAWSCURConfig",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"AuthZ", "apiKeyAuth", "appKeyAuth"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<AwsCURConfigResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(ex);
      return result;
    }
    return apiClient.invokeAPIAsync(
        "POST",
        builder,
        localVarHeaderParams,
        new String[] {"application/json"},
        localVarPostBody,
        new HashMap<String, Object>(),
        false,
        new GenericType<AwsCURConfigResponse>() {});
  }

  /**
   * Create Cloud Cost Management Azure configs.
   *
   * <p>See {@link #createCostAzureUCConfigsWithHttpInfo}.
   *
   * @param body (required)
   * @return AzureUCConfigPairsResponse
   * @throws ApiException if fails to make API call
   */
  public AzureUCConfigPairsResponse createCostAzureUCConfigs(AzureUCConfigPostRequest body)
      throws ApiException {
    return createCostAzureUCConfigsWithHttpInfo(body).getData();
  }

  /**
   * Create Cloud Cost Management Azure configs.
   *
   * <p>See {@link #createCostAzureUCConfigsWithHttpInfoAsync}.
   *
   * @param body (required)
   * @return CompletableFuture&lt;AzureUCConfigPairsResponse&gt;
   */
  public CompletableFuture<AzureUCConfigPairsResponse> createCostAzureUCConfigsAsync(
      AzureUCConfigPostRequest body) {
    return createCostAzureUCConfigsWithHttpInfoAsync(body)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Create a Cloud Cost Management account for an Azure config.
   *
   * @param body (required)
   * @return ApiResponse&lt;AzureUCConfigPairsResponse&gt;
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
  public ApiResponse<AzureUCConfigPairsResponse> createCostAzureUCConfigsWithHttpInfo(
      AzureUCConfigPostRequest body) throws ApiException {
    Object localVarPostBody = body;

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(
          400, "Missing the required parameter 'body' when calling createCostAzureUCConfigs");
    }
    // create path and map variables
    String localVarPath = "/api/v2/cost/azure_uc_config";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.CloudCostManagementApi.createCostAzureUCConfigs",
            localVarPath,
            new ArrayList<Pair>(),
            localVarHeaderParams,
            new HashMap<String, String>(),
            new String[] {"application/json"},
            new String[] {"AuthZ", "apiKeyAuth", "appKeyAuth"});
    return apiClient.invokeAPI(
        "POST",
        builder,
        localVarHeaderParams,
        new String[] {"application/json"},
        localVarPostBody,
        new HashMap<String, Object>(),
        false,
        new GenericType<AzureUCConfigPairsResponse>() {});
  }

  /**
   * Create Cloud Cost Management Azure configs.
   *
   * <p>See {@link #createCostAzureUCConfigsWithHttpInfo}.
   *
   * @param body (required)
   * @return CompletableFuture&lt;ApiResponse&lt;AzureUCConfigPairsResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<AzureUCConfigPairsResponse>>
      createCostAzureUCConfigsWithHttpInfoAsync(AzureUCConfigPostRequest body) {
    Object localVarPostBody = body;

    // verify the required parameter 'body' is set
    if (body == null) {
      CompletableFuture<ApiResponse<AzureUCConfigPairsResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'body' when calling createCostAzureUCConfigs"));
      return result;
    }
    // create path and map variables
    String localVarPath = "/api/v2/cost/azure_uc_config";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.CloudCostManagementApi.createCostAzureUCConfigs",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"AuthZ", "apiKeyAuth", "appKeyAuth"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<AzureUCConfigPairsResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(ex);
      return result;
    }
    return apiClient.invokeAPIAsync(
        "POST",
        builder,
        localVarHeaderParams,
        new String[] {"application/json"},
        localVarPostBody,
        new HashMap<String, Object>(),
        false,
        new GenericType<AzureUCConfigPairsResponse>() {});
  }

  /**
   * Delete Cloud Cost Management AWS CUR config.
   *
   * <p>See {@link #deleteCostAWSCURConfigWithHttpInfo}.
   *
   * @param cloudAccountId Cloud Account id. (required)
   * @throws ApiException if fails to make API call
   */
  public void deleteCostAWSCURConfig(String cloudAccountId) throws ApiException {
    deleteCostAWSCURConfigWithHttpInfo(cloudAccountId);
  }

  /**
   * Delete Cloud Cost Management AWS CUR config.
   *
   * <p>See {@link #deleteCostAWSCURConfigWithHttpInfoAsync}.
   *
   * @param cloudAccountId Cloud Account id. (required)
   * @return CompletableFuture
   */
  public CompletableFuture<Void> deleteCostAWSCURConfigAsync(String cloudAccountId) {
    return deleteCostAWSCURConfigWithHttpInfoAsync(cloudAccountId)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Archive a Cloud Cost Management Account.
   *
   * @param cloudAccountId Cloud Account id. (required)
   * @return ApiResponse&lt;Void&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 204 </td><td> No Content </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<Void> deleteCostAWSCURConfigWithHttpInfo(String cloudAccountId)
      throws ApiException {
    Object localVarPostBody = null;

    // verify the required parameter 'cloudAccountId' is set
    if (cloudAccountId == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'cloudAccountId' when calling deleteCostAWSCURConfig");
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/cost/aws_cur_config/{cloud_account_id}"
            .replaceAll(
                "\\{" + "cloud_account_id" + "\\}",
                apiClient.escapeString(cloudAccountId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.CloudCostManagementApi.deleteCostAWSCURConfig",
            localVarPath,
            new ArrayList<Pair>(),
            localVarHeaderParams,
            new HashMap<String, String>(),
            new String[] {"*/*"},
            new String[] {"AuthZ", "apiKeyAuth", "appKeyAuth"});
    return apiClient.invokeAPI(
        "DELETE",
        builder,
        localVarHeaderParams,
        new String[] {},
        localVarPostBody,
        new HashMap<String, Object>(),
        false,
        null);
  }

  /**
   * Delete Cloud Cost Management AWS CUR config.
   *
   * <p>See {@link #deleteCostAWSCURConfigWithHttpInfo}.
   *
   * @param cloudAccountId Cloud Account id. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;Void&gt;&gt;
   */
  public CompletableFuture<ApiResponse<Void>> deleteCostAWSCURConfigWithHttpInfoAsync(
      String cloudAccountId) {
    Object localVarPostBody = null;

    // verify the required parameter 'cloudAccountId' is set
    if (cloudAccountId == null) {
      CompletableFuture<ApiResponse<Void>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'cloudAccountId' when calling"
                  + " deleteCostAWSCURConfig"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/cost/aws_cur_config/{cloud_account_id}"
            .replaceAll(
                "\\{" + "cloud_account_id" + "\\}",
                apiClient.escapeString(cloudAccountId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.CloudCostManagementApi.deleteCostAWSCURConfig",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"*/*"},
              new String[] {"AuthZ", "apiKeyAuth", "appKeyAuth"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<Void>> result = new CompletableFuture<>();
      result.completeExceptionally(ex);
      return result;
    }
    return apiClient.invokeAPIAsync(
        "DELETE",
        builder,
        localVarHeaderParams,
        new String[] {},
        localVarPostBody,
        new HashMap<String, Object>(),
        false,
        null);
  }

  /**
   * Delete Cloud Cost Management Azure config.
   *
   * <p>See {@link #deleteCostAzureUCConfigWithHttpInfo}.
   *
   * @param cloudAccountId Cloud Account id. (required)
   * @throws ApiException if fails to make API call
   */
  public void deleteCostAzureUCConfig(String cloudAccountId) throws ApiException {
    deleteCostAzureUCConfigWithHttpInfo(cloudAccountId);
  }

  /**
   * Delete Cloud Cost Management Azure config.
   *
   * <p>See {@link #deleteCostAzureUCConfigWithHttpInfoAsync}.
   *
   * @param cloudAccountId Cloud Account id. (required)
   * @return CompletableFuture
   */
  public CompletableFuture<Void> deleteCostAzureUCConfigAsync(String cloudAccountId) {
    return deleteCostAzureUCConfigWithHttpInfoAsync(cloudAccountId)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Archive a Cloud Cost Management Account.
   *
   * @param cloudAccountId Cloud Account id. (required)
   * @return ApiResponse&lt;Void&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 204 </td><td> No Content </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<Void> deleteCostAzureUCConfigWithHttpInfo(String cloudAccountId)
      throws ApiException {
    Object localVarPostBody = null;

    // verify the required parameter 'cloudAccountId' is set
    if (cloudAccountId == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'cloudAccountId' when calling deleteCostAzureUCConfig");
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/cost/azure_uc_config/{cloud_account_id}"
            .replaceAll(
                "\\{" + "cloud_account_id" + "\\}",
                apiClient.escapeString(cloudAccountId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.CloudCostManagementApi.deleteCostAzureUCConfig",
            localVarPath,
            new ArrayList<Pair>(),
            localVarHeaderParams,
            new HashMap<String, String>(),
            new String[] {"*/*"},
            new String[] {"AuthZ", "apiKeyAuth", "appKeyAuth"});
    return apiClient.invokeAPI(
        "DELETE",
        builder,
        localVarHeaderParams,
        new String[] {},
        localVarPostBody,
        new HashMap<String, Object>(),
        false,
        null);
  }

  /**
   * Delete Cloud Cost Management Azure config.
   *
   * <p>See {@link #deleteCostAzureUCConfigWithHttpInfo}.
   *
   * @param cloudAccountId Cloud Account id. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;Void&gt;&gt;
   */
  public CompletableFuture<ApiResponse<Void>> deleteCostAzureUCConfigWithHttpInfoAsync(
      String cloudAccountId) {
    Object localVarPostBody = null;

    // verify the required parameter 'cloudAccountId' is set
    if (cloudAccountId == null) {
      CompletableFuture<ApiResponse<Void>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'cloudAccountId' when calling"
                  + " deleteCostAzureUCConfig"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/cost/azure_uc_config/{cloud_account_id}"
            .replaceAll(
                "\\{" + "cloud_account_id" + "\\}",
                apiClient.escapeString(cloudAccountId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.CloudCostManagementApi.deleteCostAzureUCConfig",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"*/*"},
              new String[] {"AuthZ", "apiKeyAuth", "appKeyAuth"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<Void>> result = new CompletableFuture<>();
      result.completeExceptionally(ex);
      return result;
    }
    return apiClient.invokeAPIAsync(
        "DELETE",
        builder,
        localVarHeaderParams,
        new String[] {},
        localVarPostBody,
        new HashMap<String, Object>(),
        false,
        null);
  }

  /**
   * Delete Custom Costs file.
   *
   * <p>See {@link #deleteCustomCostsFileWithHttpInfo}.
   *
   * @param fileId File ID. (required)
   * @throws ApiException if fails to make API call
   */
  public void deleteCustomCostsFile(String fileId) throws ApiException {
    deleteCustomCostsFileWithHttpInfo(fileId);
  }

  /**
   * Delete Custom Costs file.
   *
   * <p>See {@link #deleteCustomCostsFileWithHttpInfoAsync}.
   *
   * @param fileId File ID. (required)
   * @return CompletableFuture
   */
  public CompletableFuture<Void> deleteCustomCostsFileAsync(String fileId) {
    return deleteCustomCostsFileWithHttpInfoAsync(fileId)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Delete the specified Custom Costs file.
   *
   * @param fileId File ID. (required)
   * @return ApiResponse&lt;Void&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 204 </td><td> No Content </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<Void> deleteCustomCostsFileWithHttpInfo(String fileId) throws ApiException {
    Object localVarPostBody = null;

    // verify the required parameter 'fileId' is set
    if (fileId == null) {
      throw new ApiException(
          400, "Missing the required parameter 'fileId' when calling deleteCustomCostsFile");
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/cost/custom_costs/{file_id}"
            .replaceAll("\\{" + "file_id" + "\\}", apiClient.escapeString(fileId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.CloudCostManagementApi.deleteCustomCostsFile",
            localVarPath,
            new ArrayList<Pair>(),
            localVarHeaderParams,
            new HashMap<String, String>(),
            new String[] {"*/*"},
            new String[] {"AuthZ", "apiKeyAuth", "appKeyAuth"});
    return apiClient.invokeAPI(
        "DELETE",
        builder,
        localVarHeaderParams,
        new String[] {},
        localVarPostBody,
        new HashMap<String, Object>(),
        false,
        null);
  }

  /**
   * Delete Custom Costs file.
   *
   * <p>See {@link #deleteCustomCostsFileWithHttpInfo}.
   *
   * @param fileId File ID. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;Void&gt;&gt;
   */
  public CompletableFuture<ApiResponse<Void>> deleteCustomCostsFileWithHttpInfoAsync(
      String fileId) {
    Object localVarPostBody = null;

    // verify the required parameter 'fileId' is set
    if (fileId == null) {
      CompletableFuture<ApiResponse<Void>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'fileId' when calling deleteCustomCostsFile"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/cost/custom_costs/{file_id}"
            .replaceAll("\\{" + "file_id" + "\\}", apiClient.escapeString(fileId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.CloudCostManagementApi.deleteCustomCostsFile",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"*/*"},
              new String[] {"AuthZ", "apiKeyAuth", "appKeyAuth"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<Void>> result = new CompletableFuture<>();
      result.completeExceptionally(ex);
      return result;
    }
    return apiClient.invokeAPIAsync(
        "DELETE",
        builder,
        localVarHeaderParams,
        new String[] {},
        localVarPostBody,
        new HashMap<String, Object>(),
        false,
        null);
  }

  /**
   * Cloud Cost Enabled.
   *
   * <p>See {@link #getCloudCostActivityWithHttpInfo}.
   *
   * @return CloudCostActivityResponse
   * @throws ApiException if fails to make API call
   */
  public CloudCostActivityResponse getCloudCostActivity() throws ApiException {
    return getCloudCostActivityWithHttpInfo().getData();
  }

  /**
   * Cloud Cost Enabled.
   *
   * <p>See {@link #getCloudCostActivityWithHttpInfoAsync}.
   *
   * @return CompletableFuture&lt;CloudCostActivityResponse&gt;
   */
  public CompletableFuture<CloudCostActivityResponse> getCloudCostActivityAsync() {
    return getCloudCostActivityWithHttpInfoAsync()
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Get the Cloud Cost Management activity.
   *
   * @return ApiResponse&lt;CloudCostActivityResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<CloudCostActivityResponse> getCloudCostActivityWithHttpInfo()
      throws ApiException {
    Object localVarPostBody = null;
    // create path and map variables
    String localVarPath = "/api/v2/cost/enabled";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.CloudCostManagementApi.getCloudCostActivity",
            localVarPath,
            new ArrayList<Pair>(),
            localVarHeaderParams,
            new HashMap<String, String>(),
            new String[] {"application/json"},
            new String[] {"AuthZ", "apiKeyAuth", "appKeyAuth"});
    return apiClient.invokeAPI(
        "GET",
        builder,
        localVarHeaderParams,
        new String[] {},
        localVarPostBody,
        new HashMap<String, Object>(),
        false,
        new GenericType<CloudCostActivityResponse>() {});
  }

  /**
   * Cloud Cost Enabled.
   *
   * <p>See {@link #getCloudCostActivityWithHttpInfo}.
   *
   * @return CompletableFuture&lt;ApiResponse&lt;CloudCostActivityResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<CloudCostActivityResponse>>
      getCloudCostActivityWithHttpInfoAsync() {
    Object localVarPostBody = null;
    // create path and map variables
    String localVarPath = "/api/v2/cost/enabled";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.CloudCostManagementApi.getCloudCostActivity",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"AuthZ", "apiKeyAuth", "appKeyAuth"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<CloudCostActivityResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(ex);
      return result;
    }
    return apiClient.invokeAPIAsync(
        "GET",
        builder,
        localVarHeaderParams,
        new String[] {},
        localVarPostBody,
        new HashMap<String, Object>(),
        false,
        new GenericType<CloudCostActivityResponse>() {});
  }

  /**
   * Get Custom Costs file.
   *
   * <p>See {@link #getCustomCostsFileWithHttpInfo}.
   *
   * @param fileId File ID. (required)
   * @return CustomCostsFileGetResponse
   * @throws ApiException if fails to make API call
   */
  public CustomCostsFileGetResponse getCustomCostsFile(String fileId) throws ApiException {
    return getCustomCostsFileWithHttpInfo(fileId).getData();
  }

  /**
   * Get Custom Costs file.
   *
   * <p>See {@link #getCustomCostsFileWithHttpInfoAsync}.
   *
   * @param fileId File ID. (required)
   * @return CompletableFuture&lt;CustomCostsFileGetResponse&gt;
   */
  public CompletableFuture<CustomCostsFileGetResponse> getCustomCostsFileAsync(String fileId) {
    return getCustomCostsFileWithHttpInfoAsync(fileId)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Fetch the specified Custom Costs file.
   *
   * @param fileId File ID. (required)
   * @return ApiResponse&lt;CustomCostsFileGetResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<CustomCostsFileGetResponse> getCustomCostsFileWithHttpInfo(String fileId)
      throws ApiException {
    Object localVarPostBody = null;

    // verify the required parameter 'fileId' is set
    if (fileId == null) {
      throw new ApiException(
          400, "Missing the required parameter 'fileId' when calling getCustomCostsFile");
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/cost/custom_costs/{file_id}"
            .replaceAll("\\{" + "file_id" + "\\}", apiClient.escapeString(fileId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.CloudCostManagementApi.getCustomCostsFile",
            localVarPath,
            new ArrayList<Pair>(),
            localVarHeaderParams,
            new HashMap<String, String>(),
            new String[] {"application/json"},
            new String[] {"AuthZ", "apiKeyAuth", "appKeyAuth"});
    return apiClient.invokeAPI(
        "GET",
        builder,
        localVarHeaderParams,
        new String[] {},
        localVarPostBody,
        new HashMap<String, Object>(),
        false,
        new GenericType<CustomCostsFileGetResponse>() {});
  }

  /**
   * Get Custom Costs file.
   *
   * <p>See {@link #getCustomCostsFileWithHttpInfo}.
   *
   * @param fileId File ID. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;CustomCostsFileGetResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<CustomCostsFileGetResponse>>
      getCustomCostsFileWithHttpInfoAsync(String fileId) {
    Object localVarPostBody = null;

    // verify the required parameter 'fileId' is set
    if (fileId == null) {
      CompletableFuture<ApiResponse<CustomCostsFileGetResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'fileId' when calling getCustomCostsFile"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/cost/custom_costs/{file_id}"
            .replaceAll("\\{" + "file_id" + "\\}", apiClient.escapeString(fileId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.CloudCostManagementApi.getCustomCostsFile",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"AuthZ", "apiKeyAuth", "appKeyAuth"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<CustomCostsFileGetResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(ex);
      return result;
    }
    return apiClient.invokeAPIAsync(
        "GET",
        builder,
        localVarHeaderParams,
        new String[] {},
        localVarPostBody,
        new HashMap<String, Object>(),
        false,
        new GenericType<CustomCostsFileGetResponse>() {});
  }

  /**
   * List Cloud Cost Management AWS CUR configs.
   *
   * <p>See {@link #listCostAWSCURConfigsWithHttpInfo}.
   *
   * @return AwsCURConfigsResponse
   * @throws ApiException if fails to make API call
   */
  public AwsCURConfigsResponse listCostAWSCURConfigs() throws ApiException {
    return listCostAWSCURConfigsWithHttpInfo().getData();
  }

  /**
   * List Cloud Cost Management AWS CUR configs.
   *
   * <p>See {@link #listCostAWSCURConfigsWithHttpInfoAsync}.
   *
   * @return CompletableFuture&lt;AwsCURConfigsResponse&gt;
   */
  public CompletableFuture<AwsCURConfigsResponse> listCostAWSCURConfigsAsync() {
    return listCostAWSCURConfigsWithHttpInfoAsync()
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * List the AWS CUR configs.
   *
   * @return ApiResponse&lt;AwsCURConfigsResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<AwsCURConfigsResponse> listCostAWSCURConfigsWithHttpInfo()
      throws ApiException {
    Object localVarPostBody = null;
    // create path and map variables
    String localVarPath = "/api/v2/cost/aws_cur_config";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.CloudCostManagementApi.listCostAWSCURConfigs",
            localVarPath,
            new ArrayList<Pair>(),
            localVarHeaderParams,
            new HashMap<String, String>(),
            new String[] {"application/json"},
            new String[] {"AuthZ", "apiKeyAuth", "appKeyAuth"});
    return apiClient.invokeAPI(
        "GET",
        builder,
        localVarHeaderParams,
        new String[] {},
        localVarPostBody,
        new HashMap<String, Object>(),
        false,
        new GenericType<AwsCURConfigsResponse>() {});
  }

  /**
   * List Cloud Cost Management AWS CUR configs.
   *
   * <p>See {@link #listCostAWSCURConfigsWithHttpInfo}.
   *
   * @return CompletableFuture&lt;ApiResponse&lt;AwsCURConfigsResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<AwsCURConfigsResponse>>
      listCostAWSCURConfigsWithHttpInfoAsync() {
    Object localVarPostBody = null;
    // create path and map variables
    String localVarPath = "/api/v2/cost/aws_cur_config";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.CloudCostManagementApi.listCostAWSCURConfigs",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"AuthZ", "apiKeyAuth", "appKeyAuth"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<AwsCURConfigsResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(ex);
      return result;
    }
    return apiClient.invokeAPIAsync(
        "GET",
        builder,
        localVarHeaderParams,
        new String[] {},
        localVarPostBody,
        new HashMap<String, Object>(),
        false,
        new GenericType<AwsCURConfigsResponse>() {});
  }

  /**
   * List Cloud Cost Management Azure configs.
   *
   * <p>See {@link #listCostAzureUCConfigsWithHttpInfo}.
   *
   * @return AzureUCConfigsResponse
   * @throws ApiException if fails to make API call
   */
  public AzureUCConfigsResponse listCostAzureUCConfigs() throws ApiException {
    return listCostAzureUCConfigsWithHttpInfo().getData();
  }

  /**
   * List Cloud Cost Management Azure configs.
   *
   * <p>See {@link #listCostAzureUCConfigsWithHttpInfoAsync}.
   *
   * @return CompletableFuture&lt;AzureUCConfigsResponse&gt;
   */
  public CompletableFuture<AzureUCConfigsResponse> listCostAzureUCConfigsAsync() {
    return listCostAzureUCConfigsWithHttpInfoAsync()
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * List the Azure configs.
   *
   * @return ApiResponse&lt;AzureUCConfigsResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<AzureUCConfigsResponse> listCostAzureUCConfigsWithHttpInfo()
      throws ApiException {
    Object localVarPostBody = null;
    // create path and map variables
    String localVarPath = "/api/v2/cost/azure_uc_config";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.CloudCostManagementApi.listCostAzureUCConfigs",
            localVarPath,
            new ArrayList<Pair>(),
            localVarHeaderParams,
            new HashMap<String, String>(),
            new String[] {"application/json"},
            new String[] {"AuthZ", "apiKeyAuth", "appKeyAuth"});
    return apiClient.invokeAPI(
        "GET",
        builder,
        localVarHeaderParams,
        new String[] {},
        localVarPostBody,
        new HashMap<String, Object>(),
        false,
        new GenericType<AzureUCConfigsResponse>() {});
  }

  /**
   * List Cloud Cost Management Azure configs.
   *
   * <p>See {@link #listCostAzureUCConfigsWithHttpInfo}.
   *
   * @return CompletableFuture&lt;ApiResponse&lt;AzureUCConfigsResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<AzureUCConfigsResponse>>
      listCostAzureUCConfigsWithHttpInfoAsync() {
    Object localVarPostBody = null;
    // create path and map variables
    String localVarPath = "/api/v2/cost/azure_uc_config";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.CloudCostManagementApi.listCostAzureUCConfigs",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"AuthZ", "apiKeyAuth", "appKeyAuth"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<AzureUCConfigsResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(ex);
      return result;
    }
    return apiClient.invokeAPIAsync(
        "GET",
        builder,
        localVarHeaderParams,
        new String[] {},
        localVarPostBody,
        new HashMap<String, Object>(),
        false,
        new GenericType<AzureUCConfigsResponse>() {});
  }

  /**
   * List Custom Costs files.
   *
   * <p>See {@link #listCustomCostsFilesWithHttpInfo}.
   *
   * @return CustomCostsFileListResponse
   * @throws ApiException if fails to make API call
   */
  public CustomCostsFileListResponse listCustomCostsFiles() throws ApiException {
    return listCustomCostsFilesWithHttpInfo().getData();
  }

  /**
   * List Custom Costs files.
   *
   * <p>See {@link #listCustomCostsFilesWithHttpInfoAsync}.
   *
   * @return CompletableFuture&lt;CustomCostsFileListResponse&gt;
   */
  public CompletableFuture<CustomCostsFileListResponse> listCustomCostsFilesAsync() {
    return listCustomCostsFilesWithHttpInfoAsync()
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * List the Custom Costs files.
   *
   * @return ApiResponse&lt;CustomCostsFileListResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<CustomCostsFileListResponse> listCustomCostsFilesWithHttpInfo()
      throws ApiException {
    Object localVarPostBody = null;
    // create path and map variables
    String localVarPath = "/api/v2/cost/custom_costs";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.CloudCostManagementApi.listCustomCostsFiles",
            localVarPath,
            new ArrayList<Pair>(),
            localVarHeaderParams,
            new HashMap<String, String>(),
            new String[] {"application/json"},
            new String[] {"AuthZ", "apiKeyAuth", "appKeyAuth"});
    return apiClient.invokeAPI(
        "GET",
        builder,
        localVarHeaderParams,
        new String[] {},
        localVarPostBody,
        new HashMap<String, Object>(),
        false,
        new GenericType<CustomCostsFileListResponse>() {});
  }

  /**
   * List Custom Costs files.
   *
   * <p>See {@link #listCustomCostsFilesWithHttpInfo}.
   *
   * @return CompletableFuture&lt;ApiResponse&lt;CustomCostsFileListResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<CustomCostsFileListResponse>>
      listCustomCostsFilesWithHttpInfoAsync() {
    Object localVarPostBody = null;
    // create path and map variables
    String localVarPath = "/api/v2/cost/custom_costs";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.CloudCostManagementApi.listCustomCostsFiles",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"AuthZ", "apiKeyAuth", "appKeyAuth"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<CustomCostsFileListResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(ex);
      return result;
    }
    return apiClient.invokeAPIAsync(
        "GET",
        builder,
        localVarHeaderParams,
        new String[] {},
        localVarPostBody,
        new HashMap<String, Object>(),
        false,
        new GenericType<CustomCostsFileListResponse>() {});
  }

  /**
   * Update Cloud Cost Management AWS CUR config.
   *
   * <p>See {@link #updateCostAWSCURConfigWithHttpInfo}.
   *
   * @param cloudAccountId Cloud Account id. (required)
   * @param body (required)
   * @return AwsCURConfigsResponse
   * @throws ApiException if fails to make API call
   */
  public AwsCURConfigsResponse updateCostAWSCURConfig(
      String cloudAccountId, AwsCURConfigPatchRequest body) throws ApiException {
    return updateCostAWSCURConfigWithHttpInfo(cloudAccountId, body).getData();
  }

  /**
   * Update Cloud Cost Management AWS CUR config.
   *
   * <p>See {@link #updateCostAWSCURConfigWithHttpInfoAsync}.
   *
   * @param cloudAccountId Cloud Account id. (required)
   * @param body (required)
   * @return CompletableFuture&lt;AwsCURConfigsResponse&gt;
   */
  public CompletableFuture<AwsCURConfigsResponse> updateCostAWSCURConfigAsync(
      String cloudAccountId, AwsCURConfigPatchRequest body) {
    return updateCostAWSCURConfigWithHttpInfoAsync(cloudAccountId, body)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Update the status of an AWS CUR config (active/archived).
   *
   * @param cloudAccountId Cloud Account id. (required)
   * @param body (required)
   * @return ApiResponse&lt;AwsCURConfigsResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<AwsCURConfigsResponse> updateCostAWSCURConfigWithHttpInfo(
      String cloudAccountId, AwsCURConfigPatchRequest body) throws ApiException {
    Object localVarPostBody = body;

    // verify the required parameter 'cloudAccountId' is set
    if (cloudAccountId == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'cloudAccountId' when calling updateCostAWSCURConfig");
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(
          400, "Missing the required parameter 'body' when calling updateCostAWSCURConfig");
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/cost/aws_cur_config/{cloud_account_id}"
            .replaceAll(
                "\\{" + "cloud_account_id" + "\\}",
                apiClient.escapeString(cloudAccountId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.CloudCostManagementApi.updateCostAWSCURConfig",
            localVarPath,
            new ArrayList<Pair>(),
            localVarHeaderParams,
            new HashMap<String, String>(),
            new String[] {"application/json"},
            new String[] {"AuthZ", "apiKeyAuth", "appKeyAuth"});
    return apiClient.invokeAPI(
        "PATCH",
        builder,
        localVarHeaderParams,
        new String[] {"application/json"},
        localVarPostBody,
        new HashMap<String, Object>(),
        false,
        new GenericType<AwsCURConfigsResponse>() {});
  }

  /**
   * Update Cloud Cost Management AWS CUR config.
   *
   * <p>See {@link #updateCostAWSCURConfigWithHttpInfo}.
   *
   * @param cloudAccountId Cloud Account id. (required)
   * @param body (required)
   * @return CompletableFuture&lt;ApiResponse&lt;AwsCURConfigsResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<AwsCURConfigsResponse>>
      updateCostAWSCURConfigWithHttpInfoAsync(
          String cloudAccountId, AwsCURConfigPatchRequest body) {
    Object localVarPostBody = body;

    // verify the required parameter 'cloudAccountId' is set
    if (cloudAccountId == null) {
      CompletableFuture<ApiResponse<AwsCURConfigsResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'cloudAccountId' when calling"
                  + " updateCostAWSCURConfig"));
      return result;
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      CompletableFuture<ApiResponse<AwsCURConfigsResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'body' when calling updateCostAWSCURConfig"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/cost/aws_cur_config/{cloud_account_id}"
            .replaceAll(
                "\\{" + "cloud_account_id" + "\\}",
                apiClient.escapeString(cloudAccountId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.CloudCostManagementApi.updateCostAWSCURConfig",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"AuthZ", "apiKeyAuth", "appKeyAuth"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<AwsCURConfigsResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(ex);
      return result;
    }
    return apiClient.invokeAPIAsync(
        "PATCH",
        builder,
        localVarHeaderParams,
        new String[] {"application/json"},
        localVarPostBody,
        new HashMap<String, Object>(),
        false,
        new GenericType<AwsCURConfigsResponse>() {});
  }

  /**
   * Update Cloud Cost Management Azure config.
   *
   * <p>See {@link #updateCostAzureUCConfigsWithHttpInfo}.
   *
   * @param cloudAccountId Cloud Account id. (required)
   * @param body (required)
   * @return AzureUCConfigPairsResponse
   * @throws ApiException if fails to make API call
   */
  public AzureUCConfigPairsResponse updateCostAzureUCConfigs(
      String cloudAccountId, AzureUCConfigPatchRequest body) throws ApiException {
    return updateCostAzureUCConfigsWithHttpInfo(cloudAccountId, body).getData();
  }

  /**
   * Update Cloud Cost Management Azure config.
   *
   * <p>See {@link #updateCostAzureUCConfigsWithHttpInfoAsync}.
   *
   * @param cloudAccountId Cloud Account id. (required)
   * @param body (required)
   * @return CompletableFuture&lt;AzureUCConfigPairsResponse&gt;
   */
  public CompletableFuture<AzureUCConfigPairsResponse> updateCostAzureUCConfigsAsync(
      String cloudAccountId, AzureUCConfigPatchRequest body) {
    return updateCostAzureUCConfigsWithHttpInfoAsync(cloudAccountId, body)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Update the status of an Azure config (active/archived).
   *
   * @param cloudAccountId Cloud Account id. (required)
   * @param body (required)
   * @return ApiResponse&lt;AzureUCConfigPairsResponse&gt;
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
  public ApiResponse<AzureUCConfigPairsResponse> updateCostAzureUCConfigsWithHttpInfo(
      String cloudAccountId, AzureUCConfigPatchRequest body) throws ApiException {
    Object localVarPostBody = body;

    // verify the required parameter 'cloudAccountId' is set
    if (cloudAccountId == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'cloudAccountId' when calling updateCostAzureUCConfigs");
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(
          400, "Missing the required parameter 'body' when calling updateCostAzureUCConfigs");
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/cost/azure_uc_config/{cloud_account_id}"
            .replaceAll(
                "\\{" + "cloud_account_id" + "\\}",
                apiClient.escapeString(cloudAccountId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.CloudCostManagementApi.updateCostAzureUCConfigs",
            localVarPath,
            new ArrayList<Pair>(),
            localVarHeaderParams,
            new HashMap<String, String>(),
            new String[] {"application/json"},
            new String[] {"AuthZ", "apiKeyAuth", "appKeyAuth"});
    return apiClient.invokeAPI(
        "PATCH",
        builder,
        localVarHeaderParams,
        new String[] {"application/json"},
        localVarPostBody,
        new HashMap<String, Object>(),
        false,
        new GenericType<AzureUCConfigPairsResponse>() {});
  }

  /**
   * Update Cloud Cost Management Azure config.
   *
   * <p>See {@link #updateCostAzureUCConfigsWithHttpInfo}.
   *
   * @param cloudAccountId Cloud Account id. (required)
   * @param body (required)
   * @return CompletableFuture&lt;ApiResponse&lt;AzureUCConfigPairsResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<AzureUCConfigPairsResponse>>
      updateCostAzureUCConfigsWithHttpInfoAsync(
          String cloudAccountId, AzureUCConfigPatchRequest body) {
    Object localVarPostBody = body;

    // verify the required parameter 'cloudAccountId' is set
    if (cloudAccountId == null) {
      CompletableFuture<ApiResponse<AzureUCConfigPairsResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'cloudAccountId' when calling"
                  + " updateCostAzureUCConfigs"));
      return result;
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      CompletableFuture<ApiResponse<AzureUCConfigPairsResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'body' when calling updateCostAzureUCConfigs"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/cost/azure_uc_config/{cloud_account_id}"
            .replaceAll(
                "\\{" + "cloud_account_id" + "\\}",
                apiClient.escapeString(cloudAccountId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.CloudCostManagementApi.updateCostAzureUCConfigs",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"AuthZ", "apiKeyAuth", "appKeyAuth"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<AzureUCConfigPairsResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(ex);
      return result;
    }
    return apiClient.invokeAPIAsync(
        "PATCH",
        builder,
        localVarHeaderParams,
        new String[] {"application/json"},
        localVarPostBody,
        new HashMap<String, Object>(),
        false,
        new GenericType<AzureUCConfigPairsResponse>() {});
  }

  /**
   * Upload Custom Costs file.
   *
   * <p>See {@link #uploadCustomCostsFileWithHttpInfo}.
   *
   * @param body (required)
   * @return CustomCostsFileUploadResponse
   * @throws ApiException if fails to make API call
   */
  public CustomCostsFileUploadResponse uploadCustomCostsFile(List<CustomCostsFileLineItem> body)
      throws ApiException {
    return uploadCustomCostsFileWithHttpInfo(body).getData();
  }

  /**
   * Upload Custom Costs file.
   *
   * <p>See {@link #uploadCustomCostsFileWithHttpInfoAsync}.
   *
   * @param body (required)
   * @return CompletableFuture&lt;CustomCostsFileUploadResponse&gt;
   */
  public CompletableFuture<CustomCostsFileUploadResponse> uploadCustomCostsFileAsync(
      List<CustomCostsFileLineItem> body) {
    return uploadCustomCostsFileWithHttpInfoAsync(body)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Upload a Custom Costs file.
   *
   * @param body (required)
   * @return ApiResponse&lt;CustomCostsFileUploadResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 202 </td><td> Accepted </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<CustomCostsFileUploadResponse> uploadCustomCostsFileWithHttpInfo(
      List<CustomCostsFileLineItem> body) throws ApiException {
    Object localVarPostBody = body;

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(
          400, "Missing the required parameter 'body' when calling uploadCustomCostsFile");
    }
    // create path and map variables
    String localVarPath = "/api/v2/cost/custom_costs";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.CloudCostManagementApi.uploadCustomCostsFile",
            localVarPath,
            new ArrayList<Pair>(),
            localVarHeaderParams,
            new HashMap<String, String>(),
            new String[] {"application/json"},
            new String[] {"AuthZ", "apiKeyAuth", "appKeyAuth"});
    return apiClient.invokeAPI(
        "PUT",
        builder,
        localVarHeaderParams,
        new String[] {"application/json"},
        localVarPostBody,
        new HashMap<String, Object>(),
        false,
        new GenericType<CustomCostsFileUploadResponse>() {});
  }

  /**
   * Upload Custom Costs file.
   *
   * <p>See {@link #uploadCustomCostsFileWithHttpInfo}.
   *
   * @param body (required)
   * @return CompletableFuture&lt;ApiResponse&lt;CustomCostsFileUploadResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<CustomCostsFileUploadResponse>>
      uploadCustomCostsFileWithHttpInfoAsync(List<CustomCostsFileLineItem> body) {
    Object localVarPostBody = body;

    // verify the required parameter 'body' is set
    if (body == null) {
      CompletableFuture<ApiResponse<CustomCostsFileUploadResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'body' when calling uploadCustomCostsFile"));
      return result;
    }
    // create path and map variables
    String localVarPath = "/api/v2/cost/custom_costs";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.CloudCostManagementApi.uploadCustomCostsFile",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"AuthZ", "apiKeyAuth", "appKeyAuth"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<CustomCostsFileUploadResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(ex);
      return result;
    }
    return apiClient.invokeAPIAsync(
        "PUT",
        builder,
        localVarHeaderParams,
        new String[] {"application/json"},
        localVarPostBody,
        new HashMap<String, Object>(),
        false,
        new GenericType<CustomCostsFileUploadResponse>() {});
  }
}
