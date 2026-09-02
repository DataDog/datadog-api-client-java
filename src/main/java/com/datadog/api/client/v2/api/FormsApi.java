
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
import com.datadog.api.client.v2.model.FormsResponse;
import com.datadog.api.client.v2.model.FormResponse;
import com.datadog.api.client.v2.model.CreateFormRequest;
import com.datadog.api.client.v2.model.DeleteFormResponse;
import com.datadog.api.client.v2.model.UpdateFormRequest;
import com.datadog.api.client.v2.model.CloneFormRequest;
import com.datadog.api.client.v2.model.FormPublicationResponse;
import com.datadog.api.client.v2.model.PublishFormRequest;
import com.datadog.api.client.v2.model.FormVersionResponse;
import com.datadog.api.client.v2.model.UpsertFormVersionRequest;
import com.datadog.api.client.v2.model.UpsertAndPublishFormVersionRequest;


@jakarta.annotation.Generated(value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class FormsApi {
  private ApiClient apiClient;
  public FormsApi() {
    this(ApiClient.getDefaultApiClient());
  }

  public FormsApi(ApiClient apiClient) {
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
 * Clone a form.
 *
 * See {@link #cloneFormWithHttpInfo}.
 *
 * @param formId The ID of the form to clone. (required)
 * @param body  (required)
 * @return FormResponse
 * @throws ApiException if fails to make API call
 */
  public FormResponse  cloneForm(UUID formId, CloneFormRequest body) throws ApiException {
    return cloneFormWithHttpInfo(formId, body).getData();
  }

  /**
 * Clone a form.
 *
 * See {@link #cloneFormWithHttpInfoAsync}.
 *
 * @param formId The ID of the form to clone. (required)
 * @param body  (required)
 * @return CompletableFuture&lt;FormResponse&gt;
 */
  public CompletableFuture<FormResponse>cloneFormAsync(UUID formId, CloneFormRequest body) {
    return cloneFormWithHttpInfoAsync(formId, body).thenApply(response -> {
        return response.getData();
    });
  }


  /**
   * <p>Clone an existing form. The clone is created in draft mode using the source form's latest version.</p>
   *
   * @param formId The ID of the form to clone. (required)
   * @param body  (required)
   * @return ApiResponse&lt;FormResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   * <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<FormResponse> cloneFormWithHttpInfo(UUID formId, CloneFormRequest body) throws ApiException {
    // Check if unstable operation is enabled
    String operationId = "cloneForm";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      throw new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId));
    }
    Object localVarPostBody = body;

    // verify the required parameter 'formId' is set
    if (formId == null) {
      throw new ApiException(400, "Missing the required parameter 'formId' when calling cloneForm");
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling cloneForm");
    }
    // create path and map variables
    String localVarPath = "/api/v2/forms/{form_id}/clone"
      .replaceAll("\\{" + "form_id" + "\\}", apiClient.escapeString(formId.toString()));

    
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();


    Invocation.Builder builder = apiClient.createBuilder("v2.FormsApi.cloneForm", localVarPath, new ArrayList<Pair>(), localVarHeaderParams, new HashMap<String, String>(), new String[] {"application/json" }, new String[] { "apiKeyAuth", "appKeyAuth" });
    return apiClient.invokeAPI("POST", builder, localVarHeaderParams,  new String[] {"application/json" }, localVarPostBody,new HashMap<String, Object>() , false, new GenericType<FormResponse>() {});
  }

  /**
   * Clone a form.
   *
   * See {@link #cloneFormWithHttpInfo}.
   *
   * @param formId The ID of the form to clone. (required)
   * @param body  (required)
   * @return CompletableFuture&lt;ApiResponse&lt;FormResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<FormResponse>> cloneFormWithHttpInfoAsync(UUID formId, CloneFormRequest body) {
    // Check if unstable operation is enabled
    String operationId = "cloneForm";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      CompletableFuture<ApiResponse<FormResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId)));
      return result;
    }
    Object localVarPostBody = body;

    // verify the required parameter 'formId' is set
    if (formId == null) {
        CompletableFuture<ApiResponse<FormResponse>> result = new CompletableFuture<>();
        result.completeExceptionally(new ApiException(400, "Missing the required parameter 'formId' when calling cloneForm"));
        return result;
    }

    // verify the required parameter 'body' is set
    if (body == null) {
        CompletableFuture<ApiResponse<FormResponse>> result = new CompletableFuture<>();
        result.completeExceptionally(new ApiException(400, "Missing the required parameter 'body' when calling cloneForm"));
        return result;
    }
    // create path and map variables
    String localVarPath = "/api/v2/forms/{form_id}/clone"
      .replaceAll("\\{" + "form_id" + "\\}", apiClient.escapeString(formId.toString()));

    
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();


    Invocation.Builder builder;
    try {
      builder = apiClient.createBuilder("v2.FormsApi.cloneForm", localVarPath, new ArrayList<Pair>(), localVarHeaderParams, new HashMap<String, String>(), new String[] {"application/json" }, new String[] { "apiKeyAuth", "appKeyAuth" });
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<FormResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(ex);
      return result;
    }
    return apiClient.invokeAPIAsync("POST", builder, localVarHeaderParams,  new String[] {"application/json" }, localVarPostBody,new HashMap<String, Object>() , false, new GenericType<FormResponse>() {});
  }

  /**
 * Create and publish a form.
 *
 * See {@link #createAndPublishFormWithHttpInfo}.
 *
 * @param body  (required)
 * @return FormResponse
 * @throws ApiException if fails to make API call
 */
  public FormResponse  createAndPublishForm(CreateFormRequest body) throws ApiException {
    return createAndPublishFormWithHttpInfo(body).getData();
  }

  /**
 * Create and publish a form.
 *
 * See {@link #createAndPublishFormWithHttpInfoAsync}.
 *
 * @param body  (required)
 * @return CompletableFuture&lt;FormResponse&gt;
 */
  public CompletableFuture<FormResponse>createAndPublishFormAsync(CreateFormRequest body) {
    return createAndPublishFormWithHttpInfoAsync(body).thenApply(response -> {
        return response.getData();
    });
  }


  /**
   * <p>Creates a new form and immediately publishes its initial version. This also creates a new datastore for form responses and links it to the form.</p>
   *
   * @param body  (required)
   * @return ApiResponse&lt;FormResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   * <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<FormResponse> createAndPublishFormWithHttpInfo(CreateFormRequest body) throws ApiException {
    // Check if unstable operation is enabled
    String operationId = "createAndPublishForm";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      throw new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId));
    }
    Object localVarPostBody = body;

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling createAndPublishForm");
    }
    // create path and map variables
    String localVarPath = "/api/v2/forms/create_and_publish";

    
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();


    Invocation.Builder builder = apiClient.createBuilder("v2.FormsApi.createAndPublishForm", localVarPath, new ArrayList<Pair>(), localVarHeaderParams, new HashMap<String, String>(), new String[] {"application/json" }, new String[] { "apiKeyAuth", "appKeyAuth" });
    return apiClient.invokeAPI("POST", builder, localVarHeaderParams,  new String[] {"application/json" }, localVarPostBody,new HashMap<String, Object>() , false, new GenericType<FormResponse>() {});
  }

  /**
   * Create and publish a form.
   *
   * See {@link #createAndPublishFormWithHttpInfo}.
   *
   * @param body  (required)
   * @return CompletableFuture&lt;ApiResponse&lt;FormResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<FormResponse>> createAndPublishFormWithHttpInfoAsync(CreateFormRequest body) {
    // Check if unstable operation is enabled
    String operationId = "createAndPublishForm";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      CompletableFuture<ApiResponse<FormResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId)));
      return result;
    }
    Object localVarPostBody = body;

    // verify the required parameter 'body' is set
    if (body == null) {
        CompletableFuture<ApiResponse<FormResponse>> result = new CompletableFuture<>();
        result.completeExceptionally(new ApiException(400, "Missing the required parameter 'body' when calling createAndPublishForm"));
        return result;
    }
    // create path and map variables
    String localVarPath = "/api/v2/forms/create_and_publish";

    
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();


    Invocation.Builder builder;
    try {
      builder = apiClient.createBuilder("v2.FormsApi.createAndPublishForm", localVarPath, new ArrayList<Pair>(), localVarHeaderParams, new HashMap<String, String>(), new String[] {"application/json" }, new String[] { "apiKeyAuth", "appKeyAuth" });
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<FormResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(ex);
      return result;
    }
    return apiClient.invokeAPIAsync("POST", builder, localVarHeaderParams,  new String[] {"application/json" }, localVarPostBody,new HashMap<String, Object>() , false, new GenericType<FormResponse>() {});
  }

  /**
 * Create a form.
 *
 * See {@link #createFormWithHttpInfo}.
 *
 * @param body  (required)
 * @return FormResponse
 * @throws ApiException if fails to make API call
 */
  public FormResponse  createForm(CreateFormRequest body) throws ApiException {
    return createFormWithHttpInfo(body).getData();
  }

  /**
 * Create a form.
 *
 * See {@link #createFormWithHttpInfoAsync}.
 *
 * @param body  (required)
 * @return CompletableFuture&lt;FormResponse&gt;
 */
  public CompletableFuture<FormResponse>createFormAsync(CreateFormRequest body) {
    return createFormWithHttpInfoAsync(body).thenApply(response -> {
        return response.getData();
    });
  }


  /**
   * <p>Create a new form. The form is created in draft mode and must be published before it can be used. This also creates a new datastore for form responses and links it to the form.</p>
   *
   * @param body  (required)
   * @return ApiResponse&lt;FormResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   * <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<FormResponse> createFormWithHttpInfo(CreateFormRequest body) throws ApiException {
    // Check if unstable operation is enabled
    String operationId = "createForm";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      throw new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId));
    }
    Object localVarPostBody = body;

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling createForm");
    }
    // create path and map variables
    String localVarPath = "/api/v2/forms";

    
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();


    Invocation.Builder builder = apiClient.createBuilder("v2.FormsApi.createForm", localVarPath, new ArrayList<Pair>(), localVarHeaderParams, new HashMap<String, String>(), new String[] {"application/json" }, new String[] { "apiKeyAuth", "appKeyAuth" });
    return apiClient.invokeAPI("POST", builder, localVarHeaderParams,  new String[] {"application/json" }, localVarPostBody,new HashMap<String, Object>() , false, new GenericType<FormResponse>() {});
  }

  /**
   * Create a form.
   *
   * See {@link #createFormWithHttpInfo}.
   *
   * @param body  (required)
   * @return CompletableFuture&lt;ApiResponse&lt;FormResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<FormResponse>> createFormWithHttpInfoAsync(CreateFormRequest body) {
    // Check if unstable operation is enabled
    String operationId = "createForm";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      CompletableFuture<ApiResponse<FormResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId)));
      return result;
    }
    Object localVarPostBody = body;

    // verify the required parameter 'body' is set
    if (body == null) {
        CompletableFuture<ApiResponse<FormResponse>> result = new CompletableFuture<>();
        result.completeExceptionally(new ApiException(400, "Missing the required parameter 'body' when calling createForm"));
        return result;
    }
    // create path and map variables
    String localVarPath = "/api/v2/forms";

    
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();


    Invocation.Builder builder;
    try {
      builder = apiClient.createBuilder("v2.FormsApi.createForm", localVarPath, new ArrayList<Pair>(), localVarHeaderParams, new HashMap<String, String>(), new String[] {"application/json" }, new String[] { "apiKeyAuth", "appKeyAuth" });
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<FormResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(ex);
      return result;
    }
    return apiClient.invokeAPIAsync("POST", builder, localVarHeaderParams,  new String[] {"application/json" }, localVarPostBody,new HashMap<String, Object>() , false, new GenericType<FormResponse>() {});
  }

  /**
 * Delete a form.
 *
 * See {@link #deleteFormWithHttpInfo}.
 *
 * @param formId The ID of the form. (required)
 * @return DeleteFormResponse
 * @throws ApiException if fails to make API call
 */
  public DeleteFormResponse  deleteForm(UUID formId) throws ApiException {
    return deleteFormWithHttpInfo(formId).getData();
  }

  /**
 * Delete a form.
 *
 * See {@link #deleteFormWithHttpInfoAsync}.
 *
 * @param formId The ID of the form. (required)
 * @return CompletableFuture&lt;DeleteFormResponse&gt;
 */
  public CompletableFuture<DeleteFormResponse>deleteFormAsync(UUID formId) {
    return deleteFormWithHttpInfoAsync(formId).thenApply(response -> {
        return response.getData();
    });
  }


  /**
   * <p>Delete a form by its ID. This will also try to delete the associated datastore.</p>
   *
   * @param formId The ID of the form. (required)
   * @return ApiResponse&lt;DeleteFormResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   * <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<DeleteFormResponse> deleteFormWithHttpInfo(UUID formId) throws ApiException {
    // Check if unstable operation is enabled
    String operationId = "deleteForm";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      throw new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId));
    }
    Object localVarPostBody = null;

    // verify the required parameter 'formId' is set
    if (formId == null) {
      throw new ApiException(400, "Missing the required parameter 'formId' when calling deleteForm");
    }
    // create path and map variables
    String localVarPath = "/api/v2/forms/{form_id}"
      .replaceAll("\\{" + "form_id" + "\\}", apiClient.escapeString(formId.toString()));

    
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();


    Invocation.Builder builder = apiClient.createBuilder("v2.FormsApi.deleteForm", localVarPath, new ArrayList<Pair>(), localVarHeaderParams, new HashMap<String, String>(), new String[] {"application/json" }, new String[] { "apiKeyAuth", "appKeyAuth" });
    return apiClient.invokeAPI("DELETE", builder, localVarHeaderParams,  new String[] { }, localVarPostBody,new HashMap<String, Object>() , false, new GenericType<DeleteFormResponse>() {});
  }

  /**
   * Delete a form.
   *
   * See {@link #deleteFormWithHttpInfo}.
   *
   * @param formId The ID of the form. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;DeleteFormResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<DeleteFormResponse>> deleteFormWithHttpInfoAsync(UUID formId) {
    // Check if unstable operation is enabled
    String operationId = "deleteForm";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      CompletableFuture<ApiResponse<DeleteFormResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId)));
      return result;
    }
    Object localVarPostBody = null;

    // verify the required parameter 'formId' is set
    if (formId == null) {
        CompletableFuture<ApiResponse<DeleteFormResponse>> result = new CompletableFuture<>();
        result.completeExceptionally(new ApiException(400, "Missing the required parameter 'formId' when calling deleteForm"));
        return result;
    }
    // create path and map variables
    String localVarPath = "/api/v2/forms/{form_id}"
      .replaceAll("\\{" + "form_id" + "\\}", apiClient.escapeString(formId.toString()));

    
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();


    Invocation.Builder builder;
    try {
      builder = apiClient.createBuilder("v2.FormsApi.deleteForm", localVarPath, new ArrayList<Pair>(), localVarHeaderParams, new HashMap<String, String>(), new String[] {"application/json" }, new String[] { "apiKeyAuth", "appKeyAuth" });
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<DeleteFormResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(ex);
      return result;
    }
    return apiClient.invokeAPIAsync("DELETE", builder, localVarHeaderParams,  new String[] { }, localVarPostBody,new HashMap<String, Object>() , false, new GenericType<DeleteFormResponse>() {});
  }

  /**
   * Manage optional parameters to getForm.
   */
  public static class GetFormOptionalParameters {
    private String version;

    /**
     * Set version.
     * @param version The version of the form to retrieve. Use 'latest' for the most recent draft, 'published' for the last published version, or a specific version number. (optional, default to "latest")
     * @return GetFormOptionalParameters
     */
    public GetFormOptionalParameters version(String version) {
      this.version = version;
      return this;
    }
  }

  /**
 * Get a form.
 *
 * See {@link #getFormWithHttpInfo}.
 *
 * @param formId The ID of the form. (required)
 * @return FormResponse
 * @throws ApiException if fails to make API call
 */
  public FormResponse getForm (UUID formId) throws ApiException {
    return getFormWithHttpInfo( formId, new GetFormOptionalParameters()).getData();
  }

  /**
 * Get a form.
 *
 * See {@link #getFormWithHttpInfoAsync}.
 *
 * @param formId The ID of the form. (required)
 * @return CompletableFuture&lt;FormResponse&gt;
 */
  public CompletableFuture<FormResponse>getFormAsync(UUID formId) {
    return getFormWithHttpInfoAsync(formId, new GetFormOptionalParameters()).thenApply(response -> {
        return response.getData();
    });
  }

  /**
 * Get a form.
 *
 * See {@link #getFormWithHttpInfo}.
 *
 * @param formId The ID of the form. (required)
 * @param parameters Optional parameters for the request.
 * @return FormResponse
 * @throws ApiException if fails to make API call
 */
  public FormResponse getForm(UUID formId, GetFormOptionalParameters parameters) throws ApiException {
    return getFormWithHttpInfo(formId, parameters).getData();
  }

  /**
 * Get a form.
 *
 * See {@link #getFormWithHttpInfoAsync}.
 *
 * @param formId The ID of the form. (required)
 * @param parameters Optional parameters for the request.
 * @return CompletableFuture&lt;FormResponse&gt;
 */
  public CompletableFuture<FormResponse>getFormAsync( UUID formId, GetFormOptionalParameters parameters) {
    return getFormWithHttpInfoAsync(formId, parameters).thenApply(response -> {
        return response.getData();
    });
  }


  /**
   * <p>Get a form definition by its ID.</p>
   *
   * @param formId The ID of the form. (required)
   * @param parameters Optional parameters for the request.
   * @return ApiResponse&lt;FormResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   * <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<FormResponse> getFormWithHttpInfo(UUID formId, GetFormOptionalParameters parameters) throws ApiException {
    // Check if unstable operation is enabled
    String operationId = "getForm";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      throw new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId));
    }
    Object localVarPostBody = null;

    // verify the required parameter 'formId' is set
    if (formId == null) {
      throw new ApiException(400, "Missing the required parameter 'formId' when calling getForm");
    }
    String version = parameters.version;
    // create path and map variables
    String localVarPath = "/api/v2/forms/{form_id}"
      .replaceAll("\\{" + "form_id" + "\\}", apiClient.escapeString(formId.toString()));

    
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "version", version));

    Invocation.Builder builder = apiClient.createBuilder("v2.FormsApi.getForm", localVarPath, localVarQueryParams, localVarHeaderParams, new HashMap<String, String>(), new String[] {"application/json" }, new String[] { "apiKeyAuth", "appKeyAuth" });
    return apiClient.invokeAPI("GET", builder, localVarHeaderParams,  new String[] { }, localVarPostBody,new HashMap<String, Object>() , false, new GenericType<FormResponse>() {});
  }

  /**
   * Get a form.
   *
   * See {@link #getFormWithHttpInfo}.
   *
   * @param formId The ID of the form. (required)
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;ApiResponse&lt;FormResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<FormResponse>> getFormWithHttpInfoAsync(UUID formId, GetFormOptionalParameters parameters) {
    // Check if unstable operation is enabled
    String operationId = "getForm";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      CompletableFuture<ApiResponse<FormResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId)));
      return result;
    }
    Object localVarPostBody = null;

    // verify the required parameter 'formId' is set
    if (formId == null) {
        CompletableFuture<ApiResponse<FormResponse>> result = new CompletableFuture<>();
        result.completeExceptionally(new ApiException(400, "Missing the required parameter 'formId' when calling getForm"));
        return result;
    }
    String version = parameters.version;
    // create path and map variables
    String localVarPath = "/api/v2/forms/{form_id}"
      .replaceAll("\\{" + "form_id" + "\\}", apiClient.escapeString(formId.toString()));

    
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "version", version));

    Invocation.Builder builder;
    try {
      builder = apiClient.createBuilder("v2.FormsApi.getForm", localVarPath, localVarQueryParams, localVarHeaderParams, new HashMap<String, String>(), new String[] {"application/json" }, new String[] { "apiKeyAuth", "appKeyAuth" });
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<FormResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(ex);
      return result;
    }
    return apiClient.invokeAPIAsync("GET", builder, localVarHeaderParams,  new String[] { }, localVarPostBody,new HashMap<String, Object>() , false, new GenericType<FormResponse>() {});
  }

  /**
 * List forms.
 *
 * See {@link #listFormsWithHttpInfo}.
 *
 * @return FormsResponse
 * @throws ApiException if fails to make API call
 */
  public FormsResponse  listForms() throws ApiException {
    return listFormsWithHttpInfo().getData();
  }

  /**
 * List forms.
 *
 * See {@link #listFormsWithHttpInfoAsync}.
 *
 * @return CompletableFuture&lt;FormsResponse&gt;
 */
  public CompletableFuture<FormsResponse>listFormsAsync() {
    return listFormsWithHttpInfoAsync().thenApply(response -> {
        return response.getData();
    });
  }


  /**
   * <p>Get all forms for the authenticated user's organization.</p>
   *
   * @return ApiResponse&lt;FormsResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   * <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<FormsResponse> listFormsWithHttpInfo() throws ApiException {
    // Check if unstable operation is enabled
    String operationId = "listForms";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      throw new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId));
    }
    Object localVarPostBody = null;
    // create path and map variables
    String localVarPath = "/api/v2/forms";

    
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();


    Invocation.Builder builder = apiClient.createBuilder("v2.FormsApi.listForms", localVarPath, new ArrayList<Pair>(), localVarHeaderParams, new HashMap<String, String>(), new String[] {"application/json" }, new String[] { "apiKeyAuth", "appKeyAuth" });
    return apiClient.invokeAPI("GET", builder, localVarHeaderParams,  new String[] { }, localVarPostBody,new HashMap<String, Object>() , false, new GenericType<FormsResponse>() {});
  }

  /**
   * List forms.
   *
   * See {@link #listFormsWithHttpInfo}.
   *
   * @return CompletableFuture&lt;ApiResponse&lt;FormsResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<FormsResponse>> listFormsWithHttpInfoAsync() {
    // Check if unstable operation is enabled
    String operationId = "listForms";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      CompletableFuture<ApiResponse<FormsResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId)));
      return result;
    }
    Object localVarPostBody = null;
    // create path and map variables
    String localVarPath = "/api/v2/forms";

    
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();


    Invocation.Builder builder;
    try {
      builder = apiClient.createBuilder("v2.FormsApi.listForms", localVarPath, new ArrayList<Pair>(), localVarHeaderParams, new HashMap<String, String>(), new String[] {"application/json" }, new String[] { "apiKeyAuth", "appKeyAuth" });
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<FormsResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(ex);
      return result;
    }
    return apiClient.invokeAPIAsync("GET", builder, localVarHeaderParams,  new String[] { }, localVarPostBody,new HashMap<String, Object>() , false, new GenericType<FormsResponse>() {});
  }

  /**
 * Publish a form version.
 *
 * See {@link #publishFormWithHttpInfo}.
 *
 * @param formId The ID of the form. (required)
 * @param body  (required)
 * @return FormPublicationResponse
 * @throws ApiException if fails to make API call
 */
  public FormPublicationResponse  publishForm(UUID formId, PublishFormRequest body) throws ApiException {
    return publishFormWithHttpInfo(formId, body).getData();
  }

  /**
 * Publish a form version.
 *
 * See {@link #publishFormWithHttpInfoAsync}.
 *
 * @param formId The ID of the form. (required)
 * @param body  (required)
 * @return CompletableFuture&lt;FormPublicationResponse&gt;
 */
  public CompletableFuture<FormPublicationResponse>publishFormAsync(UUID formId, PublishFormRequest body) {
    return publishFormWithHttpInfoAsync(formId, body).thenApply(response -> {
        return response.getData();
    });
  }


  /**
   * <p>Publish a specific version of a form, making it available for submissions.</p>
   *
   * @param formId The ID of the form. (required)
   * @param body  (required)
   * @return ApiResponse&lt;FormPublicationResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   * <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<FormPublicationResponse> publishFormWithHttpInfo(UUID formId, PublishFormRequest body) throws ApiException {
    // Check if unstable operation is enabled
    String operationId = "publishForm";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      throw new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId));
    }
    Object localVarPostBody = body;

    // verify the required parameter 'formId' is set
    if (formId == null) {
      throw new ApiException(400, "Missing the required parameter 'formId' when calling publishForm");
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling publishForm");
    }
    // create path and map variables
    String localVarPath = "/api/v2/forms/{form_id}/publish"
      .replaceAll("\\{" + "form_id" + "\\}", apiClient.escapeString(formId.toString()));

    
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();


    Invocation.Builder builder = apiClient.createBuilder("v2.FormsApi.publishForm", localVarPath, new ArrayList<Pair>(), localVarHeaderParams, new HashMap<String, String>(), new String[] {"application/json" }, new String[] { "apiKeyAuth", "appKeyAuth" });
    return apiClient.invokeAPI("POST", builder, localVarHeaderParams,  new String[] {"application/json" }, localVarPostBody,new HashMap<String, Object>() , false, new GenericType<FormPublicationResponse>() {});
  }

  /**
   * Publish a form version.
   *
   * See {@link #publishFormWithHttpInfo}.
   *
   * @param formId The ID of the form. (required)
   * @param body  (required)
   * @return CompletableFuture&lt;ApiResponse&lt;FormPublicationResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<FormPublicationResponse>> publishFormWithHttpInfoAsync(UUID formId, PublishFormRequest body) {
    // Check if unstable operation is enabled
    String operationId = "publishForm";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      CompletableFuture<ApiResponse<FormPublicationResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId)));
      return result;
    }
    Object localVarPostBody = body;

    // verify the required parameter 'formId' is set
    if (formId == null) {
        CompletableFuture<ApiResponse<FormPublicationResponse>> result = new CompletableFuture<>();
        result.completeExceptionally(new ApiException(400, "Missing the required parameter 'formId' when calling publishForm"));
        return result;
    }

    // verify the required parameter 'body' is set
    if (body == null) {
        CompletableFuture<ApiResponse<FormPublicationResponse>> result = new CompletableFuture<>();
        result.completeExceptionally(new ApiException(400, "Missing the required parameter 'body' when calling publishForm"));
        return result;
    }
    // create path and map variables
    String localVarPath = "/api/v2/forms/{form_id}/publish"
      .replaceAll("\\{" + "form_id" + "\\}", apiClient.escapeString(formId.toString()));

    
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();


    Invocation.Builder builder;
    try {
      builder = apiClient.createBuilder("v2.FormsApi.publishForm", localVarPath, new ArrayList<Pair>(), localVarHeaderParams, new HashMap<String, String>(), new String[] {"application/json" }, new String[] { "apiKeyAuth", "appKeyAuth" });
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<FormPublicationResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(ex);
      return result;
    }
    return apiClient.invokeAPIAsync("POST", builder, localVarHeaderParams,  new String[] {"application/json" }, localVarPostBody,new HashMap<String, Object>() , false, new GenericType<FormPublicationResponse>() {});
  }

  /**
 * Update a form.
 *
 * See {@link #updateFormWithHttpInfo}.
 *
 * @param formId The ID of the form. (required)
 * @param body  (required)
 * @return FormResponse
 * @throws ApiException if fails to make API call
 */
  public FormResponse  updateForm(UUID formId, UpdateFormRequest body) throws ApiException {
    return updateFormWithHttpInfo(formId, body).getData();
  }

  /**
 * Update a form.
 *
 * See {@link #updateFormWithHttpInfoAsync}.
 *
 * @param formId The ID of the form. (required)
 * @param body  (required)
 * @return CompletableFuture&lt;FormResponse&gt;
 */
  public CompletableFuture<FormResponse>updateFormAsync(UUID formId, UpdateFormRequest body) {
    return updateFormWithHttpInfoAsync(formId, body).thenApply(response -> {
        return response.getData();
    });
  }


  /**
   * <p>Update a form's properties such as its name, description, or datastore configuration.</p>
   *
   * @param formId The ID of the form. (required)
   * @param body  (required)
   * @return ApiResponse&lt;FormResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   * <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<FormResponse> updateFormWithHttpInfo(UUID formId, UpdateFormRequest body) throws ApiException {
    // Check if unstable operation is enabled
    String operationId = "updateForm";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      throw new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId));
    }
    Object localVarPostBody = body;

    // verify the required parameter 'formId' is set
    if (formId == null) {
      throw new ApiException(400, "Missing the required parameter 'formId' when calling updateForm");
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling updateForm");
    }
    // create path and map variables
    String localVarPath = "/api/v2/forms/{form_id}"
      .replaceAll("\\{" + "form_id" + "\\}", apiClient.escapeString(formId.toString()));

    
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();


    Invocation.Builder builder = apiClient.createBuilder("v2.FormsApi.updateForm", localVarPath, new ArrayList<Pair>(), localVarHeaderParams, new HashMap<String, String>(), new String[] {"application/json" }, new String[] { "apiKeyAuth", "appKeyAuth" });
    return apiClient.invokeAPI("PATCH", builder, localVarHeaderParams,  new String[] {"application/json" }, localVarPostBody,new HashMap<String, Object>() , false, new GenericType<FormResponse>() {});
  }

  /**
   * Update a form.
   *
   * See {@link #updateFormWithHttpInfo}.
   *
   * @param formId The ID of the form. (required)
   * @param body  (required)
   * @return CompletableFuture&lt;ApiResponse&lt;FormResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<FormResponse>> updateFormWithHttpInfoAsync(UUID formId, UpdateFormRequest body) {
    // Check if unstable operation is enabled
    String operationId = "updateForm";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      CompletableFuture<ApiResponse<FormResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId)));
      return result;
    }
    Object localVarPostBody = body;

    // verify the required parameter 'formId' is set
    if (formId == null) {
        CompletableFuture<ApiResponse<FormResponse>> result = new CompletableFuture<>();
        result.completeExceptionally(new ApiException(400, "Missing the required parameter 'formId' when calling updateForm"));
        return result;
    }

    // verify the required parameter 'body' is set
    if (body == null) {
        CompletableFuture<ApiResponse<FormResponse>> result = new CompletableFuture<>();
        result.completeExceptionally(new ApiException(400, "Missing the required parameter 'body' when calling updateForm"));
        return result;
    }
    // create path and map variables
    String localVarPath = "/api/v2/forms/{form_id}"
      .replaceAll("\\{" + "form_id" + "\\}", apiClient.escapeString(formId.toString()));

    
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();


    Invocation.Builder builder;
    try {
      builder = apiClient.createBuilder("v2.FormsApi.updateForm", localVarPath, new ArrayList<Pair>(), localVarHeaderParams, new HashMap<String, String>(), new String[] {"application/json" }, new String[] { "apiKeyAuth", "appKeyAuth" });
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<FormResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(ex);
      return result;
    }
    return apiClient.invokeAPIAsync("PATCH", builder, localVarHeaderParams,  new String[] {"application/json" }, localVarPostBody,new HashMap<String, Object>() , false, new GenericType<FormResponse>() {});
  }

  /**
 * Upsert and publish a form version.
 *
 * See {@link #upsertAndPublishFormVersionWithHttpInfo}.
 *
 * @param formId The ID of the form. (required)
 * @param body  (required)
 * @return FormResponse
 * @throws ApiException if fails to make API call
 */
  public FormResponse  upsertAndPublishFormVersion(UUID formId, UpsertAndPublishFormVersionRequest body) throws ApiException {
    return upsertAndPublishFormVersionWithHttpInfo(formId, body).getData();
  }

  /**
 * Upsert and publish a form version.
 *
 * See {@link #upsertAndPublishFormVersionWithHttpInfoAsync}.
 *
 * @param formId The ID of the form. (required)
 * @param body  (required)
 * @return CompletableFuture&lt;FormResponse&gt;
 */
  public CompletableFuture<FormResponse>upsertAndPublishFormVersionAsync(UUID formId, UpsertAndPublishFormVersionRequest body) {
    return upsertAndPublishFormVersionWithHttpInfoAsync(formId, body).thenApply(response -> {
        return response.getData();
    });
  }


  /**
   * <p>Upsert the latest form version and publish it in a single atomic transaction.</p>
   *
   * @param formId The ID of the form. (required)
   * @param body  (required)
   * @return ApiResponse&lt;FormResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   * <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<FormResponse> upsertAndPublishFormVersionWithHttpInfo(UUID formId, UpsertAndPublishFormVersionRequest body) throws ApiException {
    // Check if unstable operation is enabled
    String operationId = "upsertAndPublishFormVersion";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      throw new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId));
    }
    Object localVarPostBody = body;

    // verify the required parameter 'formId' is set
    if (formId == null) {
      throw new ApiException(400, "Missing the required parameter 'formId' when calling upsertAndPublishFormVersion");
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling upsertAndPublishFormVersion");
    }
    // create path and map variables
    String localVarPath = "/api/v2/forms/{form_id}/versions/upsert_and_publish"
      .replaceAll("\\{" + "form_id" + "\\}", apiClient.escapeString(formId.toString()));

    
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();


    Invocation.Builder builder = apiClient.createBuilder("v2.FormsApi.upsertAndPublishFormVersion", localVarPath, new ArrayList<Pair>(), localVarHeaderParams, new HashMap<String, String>(), new String[] {"application/json" }, new String[] { "apiKeyAuth", "appKeyAuth" });
    return apiClient.invokeAPI("POST", builder, localVarHeaderParams,  new String[] {"application/json" }, localVarPostBody,new HashMap<String, Object>() , false, new GenericType<FormResponse>() {});
  }

  /**
   * Upsert and publish a form version.
   *
   * See {@link #upsertAndPublishFormVersionWithHttpInfo}.
   *
   * @param formId The ID of the form. (required)
   * @param body  (required)
   * @return CompletableFuture&lt;ApiResponse&lt;FormResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<FormResponse>> upsertAndPublishFormVersionWithHttpInfoAsync(UUID formId, UpsertAndPublishFormVersionRequest body) {
    // Check if unstable operation is enabled
    String operationId = "upsertAndPublishFormVersion";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      CompletableFuture<ApiResponse<FormResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId)));
      return result;
    }
    Object localVarPostBody = body;

    // verify the required parameter 'formId' is set
    if (formId == null) {
        CompletableFuture<ApiResponse<FormResponse>> result = new CompletableFuture<>();
        result.completeExceptionally(new ApiException(400, "Missing the required parameter 'formId' when calling upsertAndPublishFormVersion"));
        return result;
    }

    // verify the required parameter 'body' is set
    if (body == null) {
        CompletableFuture<ApiResponse<FormResponse>> result = new CompletableFuture<>();
        result.completeExceptionally(new ApiException(400, "Missing the required parameter 'body' when calling upsertAndPublishFormVersion"));
        return result;
    }
    // create path and map variables
    String localVarPath = "/api/v2/forms/{form_id}/versions/upsert_and_publish"
      .replaceAll("\\{" + "form_id" + "\\}", apiClient.escapeString(formId.toString()));

    
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();


    Invocation.Builder builder;
    try {
      builder = apiClient.createBuilder("v2.FormsApi.upsertAndPublishFormVersion", localVarPath, new ArrayList<Pair>(), localVarHeaderParams, new HashMap<String, String>(), new String[] {"application/json" }, new String[] { "apiKeyAuth", "appKeyAuth" });
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<FormResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(ex);
      return result;
    }
    return apiClient.invokeAPIAsync("POST", builder, localVarHeaderParams,  new String[] {"application/json" }, localVarPostBody,new HashMap<String, Object>() , false, new GenericType<FormResponse>() {});
  }

  /**
 * Create or update a form version.
 *
 * See {@link #upsertFormVersionWithHttpInfo}.
 *
 * @param formId The ID of the form. (required)
 * @param body  (required)
 * @return FormVersionResponse
 * @throws ApiException if fails to make API call
 */
  public FormVersionResponse  upsertFormVersion(UUID formId, UpsertFormVersionRequest body) throws ApiException {
    return upsertFormVersionWithHttpInfo(formId, body).getData();
  }

  /**
 * Create or update a form version.
 *
 * See {@link #upsertFormVersionWithHttpInfoAsync}.
 *
 * @param formId The ID of the form. (required)
 * @param body  (required)
 * @return CompletableFuture&lt;FormVersionResponse&gt;
 */
  public CompletableFuture<FormVersionResponse>upsertFormVersionAsync(UUID formId, UpsertFormVersionRequest body) {
    return upsertFormVersionWithHttpInfoAsync(formId, body).thenApply(response -> {
        return response.getData();
    });
  }


  /**
   * <p>Create or update the latest draft version of a form. The <code>upsert_params</code> field controls
   * optimistic concurrency behavior.</p>
   *
   * @param formId The ID of the form. (required)
   * @param body  (required)
   * @return ApiResponse&lt;FormVersionResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   * <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<FormVersionResponse> upsertFormVersionWithHttpInfo(UUID formId, UpsertFormVersionRequest body) throws ApiException {
    // Check if unstable operation is enabled
    String operationId = "upsertFormVersion";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      throw new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId));
    }
    Object localVarPostBody = body;

    // verify the required parameter 'formId' is set
    if (formId == null) {
      throw new ApiException(400, "Missing the required parameter 'formId' when calling upsertFormVersion");
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling upsertFormVersion");
    }
    // create path and map variables
    String localVarPath = "/api/v2/forms/{form_id}/versions"
      .replaceAll("\\{" + "form_id" + "\\}", apiClient.escapeString(formId.toString()));

    
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();


    Invocation.Builder builder = apiClient.createBuilder("v2.FormsApi.upsertFormVersion", localVarPath, new ArrayList<Pair>(), localVarHeaderParams, new HashMap<String, String>(), new String[] {"application/json" }, new String[] { "apiKeyAuth", "appKeyAuth" });
    return apiClient.invokeAPI("POST", builder, localVarHeaderParams,  new String[] {"application/json" }, localVarPostBody,new HashMap<String, Object>() , false, new GenericType<FormVersionResponse>() {});
  }

  /**
   * Create or update a form version.
   *
   * See {@link #upsertFormVersionWithHttpInfo}.
   *
   * @param formId The ID of the form. (required)
   * @param body  (required)
   * @return CompletableFuture&lt;ApiResponse&lt;FormVersionResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<FormVersionResponse>> upsertFormVersionWithHttpInfoAsync(UUID formId, UpsertFormVersionRequest body) {
    // Check if unstable operation is enabled
    String operationId = "upsertFormVersion";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      CompletableFuture<ApiResponse<FormVersionResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId)));
      return result;
    }
    Object localVarPostBody = body;

    // verify the required parameter 'formId' is set
    if (formId == null) {
        CompletableFuture<ApiResponse<FormVersionResponse>> result = new CompletableFuture<>();
        result.completeExceptionally(new ApiException(400, "Missing the required parameter 'formId' when calling upsertFormVersion"));
        return result;
    }

    // verify the required parameter 'body' is set
    if (body == null) {
        CompletableFuture<ApiResponse<FormVersionResponse>> result = new CompletableFuture<>();
        result.completeExceptionally(new ApiException(400, "Missing the required parameter 'body' when calling upsertFormVersion"));
        return result;
    }
    // create path and map variables
    String localVarPath = "/api/v2/forms/{form_id}/versions"
      .replaceAll("\\{" + "form_id" + "\\}", apiClient.escapeString(formId.toString()));

    
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();


    Invocation.Builder builder;
    try {
      builder = apiClient.createBuilder("v2.FormsApi.upsertFormVersion", localVarPath, new ArrayList<Pair>(), localVarHeaderParams, new HashMap<String, String>(), new String[] {"application/json" }, new String[] { "apiKeyAuth", "appKeyAuth" });
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<FormVersionResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(ex);
      return result;
    }
    return apiClient.invokeAPIAsync("POST", builder, localVarHeaderParams,  new String[] {"application/json" }, localVarPostBody,new HashMap<String, Object>() , false, new GenericType<FormVersionResponse>() {});
  }
}