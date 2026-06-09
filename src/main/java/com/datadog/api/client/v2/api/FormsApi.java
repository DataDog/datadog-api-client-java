package com.datadog.api.client.v2.api;

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.ApiResponse;
import com.datadog.api.client.Pair;
import com.datadog.api.client.v2.model.CreateFormRequest;
import com.datadog.api.client.v2.model.DeleteFormResponse;
import com.datadog.api.client.v2.model.FormResponse;
import com.datadog.api.client.v2.model.FormsResponse;
import jakarta.ws.rs.client.Invocation;
import jakarta.ws.rs.core.GenericType;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.CompletableFuture;

@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
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
   * Create and publish a form.
   *
   * <p>See {@link #createAndPublishFormWithHttpInfo}.
   *
   * @param body (required)
   * @return FormResponse
   * @throws ApiException if fails to make API call
   */
  public FormResponse createAndPublishForm(CreateFormRequest body) throws ApiException {
    return createAndPublishFormWithHttpInfo(body).getData();
  }

  /**
   * Create and publish a form.
   *
   * <p>See {@link #createAndPublishFormWithHttpInfoAsync}.
   *
   * @param body (required)
   * @return CompletableFuture&lt;FormResponse&gt;
   */
  public CompletableFuture<FormResponse> createAndPublishFormAsync(CreateFormRequest body) {
    return createAndPublishFormWithHttpInfoAsync(body)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Creates a new form and immediately publishes its initial version. This also creates a new
   * datastore for form responses and links it to the form.
   *
   * @param body (required)
   * @return ApiResponse&lt;FormResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<FormResponse> createAndPublishFormWithHttpInfo(CreateFormRequest body)
      throws ApiException {
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
      throw new ApiException(
          400, "Missing the required parameter 'body' when calling createAndPublishForm");
    }
    // create path and map variables
    String localVarPath = "/api/v2/forms/create_and_publish";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.FormsApi.createAndPublishForm",
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
        new String[] {"application/json"},
        localVarPostBody,
        new HashMap<String, Object>(),
        false,
        new GenericType<FormResponse>() {});
  }

  /**
   * Create and publish a form.
   *
   * <p>See {@link #createAndPublishFormWithHttpInfo}.
   *
   * @param body (required)
   * @return CompletableFuture&lt;ApiResponse&lt;FormResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<FormResponse>> createAndPublishFormWithHttpInfoAsync(
      CreateFormRequest body) {
    // Check if unstable operation is enabled
    String operationId = "createAndPublishForm";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      CompletableFuture<ApiResponse<FormResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId)));
      return result;
    }
    Object localVarPostBody = body;

    // verify the required parameter 'body' is set
    if (body == null) {
      CompletableFuture<ApiResponse<FormResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'body' when calling createAndPublishForm"));
      return result;
    }
    // create path and map variables
    String localVarPath = "/api/v2/forms/create_and_publish";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.FormsApi.createAndPublishForm",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<FormResponse>> result = new CompletableFuture<>();
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
        new GenericType<FormResponse>() {});
  }

  /**
   * Create a form.
   *
   * <p>See {@link #createFormWithHttpInfo}.
   *
   * @param body (required)
   * @return FormResponse
   * @throws ApiException if fails to make API call
   */
  public FormResponse createForm(CreateFormRequest body) throws ApiException {
    return createFormWithHttpInfo(body).getData();
  }

  /**
   * Create a form.
   *
   * <p>See {@link #createFormWithHttpInfoAsync}.
   *
   * @param body (required)
   * @return CompletableFuture&lt;FormResponse&gt;
   */
  public CompletableFuture<FormResponse> createFormAsync(CreateFormRequest body) {
    return createFormWithHttpInfoAsync(body)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Create a new form. The form is created in draft mode and must be published before it can be
   * used. This also creates a new datastore for form responses and links it to the form.
   *
   * @param body (required)
   * @return ApiResponse&lt;FormResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<FormResponse> createFormWithHttpInfo(CreateFormRequest body)
      throws ApiException {
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

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.FormsApi.createForm",
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
        new String[] {"application/json"},
        localVarPostBody,
        new HashMap<String, Object>(),
        false,
        new GenericType<FormResponse>() {});
  }

  /**
   * Create a form.
   *
   * <p>See {@link #createFormWithHttpInfo}.
   *
   * @param body (required)
   * @return CompletableFuture&lt;ApiResponse&lt;FormResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<FormResponse>> createFormWithHttpInfoAsync(
      CreateFormRequest body) {
    // Check if unstable operation is enabled
    String operationId = "createForm";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      CompletableFuture<ApiResponse<FormResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId)));
      return result;
    }
    Object localVarPostBody = body;

    // verify the required parameter 'body' is set
    if (body == null) {
      CompletableFuture<ApiResponse<FormResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(400, "Missing the required parameter 'body' when calling createForm"));
      return result;
    }
    // create path and map variables
    String localVarPath = "/api/v2/forms";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.FormsApi.createForm",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<FormResponse>> result = new CompletableFuture<>();
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
        new GenericType<FormResponse>() {});
  }

  /**
   * Delete a form.
   *
   * <p>See {@link #deleteFormWithHttpInfo}.
   *
   * @param formId The ID of the form. (required)
   * @return DeleteFormResponse
   * @throws ApiException if fails to make API call
   */
  public DeleteFormResponse deleteForm(UUID formId) throws ApiException {
    return deleteFormWithHttpInfo(formId).getData();
  }

  /**
   * Delete a form.
   *
   * <p>See {@link #deleteFormWithHttpInfoAsync}.
   *
   * @param formId The ID of the form. (required)
   * @return CompletableFuture&lt;DeleteFormResponse&gt;
   */
  public CompletableFuture<DeleteFormResponse> deleteFormAsync(UUID formId) {
    return deleteFormWithHttpInfoAsync(formId)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Delete a form by its ID. This will also try to delete the associated datastore.
   *
   * @param formId The ID of the form. (required)
   * @return ApiResponse&lt;DeleteFormResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
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
      throw new ApiException(
          400, "Missing the required parameter 'formId' when calling deleteForm");
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/forms/{form_id}"
            .replaceAll("\\{" + "form_id" + "\\}", apiClient.escapeString(formId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.FormsApi.deleteForm",
            localVarPath,
            new ArrayList<Pair>(),
            localVarHeaderParams,
            new HashMap<String, String>(),
            new String[] {"application/json"},
            new String[] {"apiKeyAuth", "appKeyAuth"});
    return apiClient.invokeAPI(
        "DELETE",
        builder,
        localVarHeaderParams,
        new String[] {},
        localVarPostBody,
        new HashMap<String, Object>(),
        false,
        new GenericType<DeleteFormResponse>() {});
  }

  /**
   * Delete a form.
   *
   * <p>See {@link #deleteFormWithHttpInfo}.
   *
   * @param formId The ID of the form. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;DeleteFormResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<DeleteFormResponse>> deleteFormWithHttpInfoAsync(
      UUID formId) {
    // Check if unstable operation is enabled
    String operationId = "deleteForm";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      CompletableFuture<ApiResponse<DeleteFormResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId)));
      return result;
    }
    Object localVarPostBody = null;

    // verify the required parameter 'formId' is set
    if (formId == null) {
      CompletableFuture<ApiResponse<DeleteFormResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(400, "Missing the required parameter 'formId' when calling deleteForm"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/forms/{form_id}"
            .replaceAll("\\{" + "form_id" + "\\}", apiClient.escapeString(formId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.FormsApi.deleteForm",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<DeleteFormResponse>> result = new CompletableFuture<>();
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
        new GenericType<DeleteFormResponse>() {});
  }

  /** Manage optional parameters to getForm. */
  public static class GetFormOptionalParameters {
    private String version;

    /**
     * Set version.
     *
     * @param version The version of the form to retrieve. Use 'latest' for the most recent draft,
     *     'published' for the last published version, or a specific version number. (optional,
     *     default to "latest")
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
   * <p>See {@link #getFormWithHttpInfo}.
   *
   * @param formId The ID of the form. (required)
   * @return FormResponse
   * @throws ApiException if fails to make API call
   */
  public FormResponse getForm(UUID formId) throws ApiException {
    return getFormWithHttpInfo(formId, new GetFormOptionalParameters()).getData();
  }

  /**
   * Get a form.
   *
   * <p>See {@link #getFormWithHttpInfoAsync}.
   *
   * @param formId The ID of the form. (required)
   * @return CompletableFuture&lt;FormResponse&gt;
   */
  public CompletableFuture<FormResponse> getFormAsync(UUID formId) {
    return getFormWithHttpInfoAsync(formId, new GetFormOptionalParameters())
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Get a form.
   *
   * <p>See {@link #getFormWithHttpInfo}.
   *
   * @param formId The ID of the form. (required)
   * @param parameters Optional parameters for the request.
   * @return FormResponse
   * @throws ApiException if fails to make API call
   */
  public FormResponse getForm(UUID formId, GetFormOptionalParameters parameters)
      throws ApiException {
    return getFormWithHttpInfo(formId, parameters).getData();
  }

  /**
   * Get a form.
   *
   * <p>See {@link #getFormWithHttpInfoAsync}.
   *
   * @param formId The ID of the form. (required)
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;FormResponse&gt;
   */
  public CompletableFuture<FormResponse> getFormAsync(
      UUID formId, GetFormOptionalParameters parameters) {
    return getFormWithHttpInfoAsync(formId, parameters)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Get a form definition by its ID.
   *
   * @param formId The ID of the form. (required)
   * @param parameters Optional parameters for the request.
   * @return ApiResponse&lt;FormResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<FormResponse> getFormWithHttpInfo(
      UUID formId, GetFormOptionalParameters parameters) throws ApiException {
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
    String localVarPath =
        "/api/v2/forms/{form_id}"
            .replaceAll("\\{" + "form_id" + "\\}", apiClient.escapeString(formId.toString()));

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "version", version));

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.FormsApi.getForm",
            localVarPath,
            localVarQueryParams,
            localVarHeaderParams,
            new HashMap<String, String>(),
            new String[] {"application/json"},
            new String[] {"apiKeyAuth", "appKeyAuth"});
    return apiClient.invokeAPI(
        "GET",
        builder,
        localVarHeaderParams,
        new String[] {},
        localVarPostBody,
        new HashMap<String, Object>(),
        false,
        new GenericType<FormResponse>() {});
  }

  /**
   * Get a form.
   *
   * <p>See {@link #getFormWithHttpInfo}.
   *
   * @param formId The ID of the form. (required)
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;ApiResponse&lt;FormResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<FormResponse>> getFormWithHttpInfoAsync(
      UUID formId, GetFormOptionalParameters parameters) {
    // Check if unstable operation is enabled
    String operationId = "getForm";
    if (apiClient.isUnstableOperationEnabled("v2." + operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      CompletableFuture<ApiResponse<FormResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId)));
      return result;
    }
    Object localVarPostBody = null;

    // verify the required parameter 'formId' is set
    if (formId == null) {
      CompletableFuture<ApiResponse<FormResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(400, "Missing the required parameter 'formId' when calling getForm"));
      return result;
    }
    String version = parameters.version;
    // create path and map variables
    String localVarPath =
        "/api/v2/forms/{form_id}"
            .replaceAll("\\{" + "form_id" + "\\}", apiClient.escapeString(formId.toString()));

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "version", version));

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.FormsApi.getForm",
              localVarPath,
              localVarQueryParams,
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<FormResponse>> result = new CompletableFuture<>();
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
        new GenericType<FormResponse>() {});
  }

  /**
   * List forms.
   *
   * <p>See {@link #listFormsWithHttpInfo}.
   *
   * @return FormsResponse
   * @throws ApiException if fails to make API call
   */
  public FormsResponse listForms() throws ApiException {
    return listFormsWithHttpInfo().getData();
  }

  /**
   * List forms.
   *
   * <p>See {@link #listFormsWithHttpInfoAsync}.
   *
   * @return CompletableFuture&lt;FormsResponse&gt;
   */
  public CompletableFuture<FormsResponse> listFormsAsync() {
    return listFormsWithHttpInfoAsync()
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Get all forms for the authenticated user's organization.
   *
   * @return ApiResponse&lt;FormsResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
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

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.FormsApi.listForms",
            localVarPath,
            new ArrayList<Pair>(),
            localVarHeaderParams,
            new HashMap<String, String>(),
            new String[] {"application/json"},
            new String[] {"apiKeyAuth", "appKeyAuth"});
    return apiClient.invokeAPI(
        "GET",
        builder,
        localVarHeaderParams,
        new String[] {},
        localVarPostBody,
        new HashMap<String, Object>(),
        false,
        new GenericType<FormsResponse>() {});
  }

  /**
   * List forms.
   *
   * <p>See {@link #listFormsWithHttpInfo}.
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
      result.completeExceptionally(
          new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId)));
      return result;
    }
    Object localVarPostBody = null;
    // create path and map variables
    String localVarPath = "/api/v2/forms";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.FormsApi.listForms",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<FormsResponse>> result = new CompletableFuture<>();
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
        new GenericType<FormsResponse>() {});
  }
}
