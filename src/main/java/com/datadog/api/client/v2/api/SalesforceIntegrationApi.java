package com.datadog.api.client.v2.api;

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.ApiResponse;
import com.datadog.api.client.Pair;
import com.datadog.api.client.v2.model.SalesforceIncidentsOrganizationsResponse;
import com.datadog.api.client.v2.model.SalesforceIncidentsTemplateCreateRequest;
import com.datadog.api.client.v2.model.SalesforceIncidentsTemplateResponse;
import com.datadog.api.client.v2.model.SalesforceIncidentsTemplateUpdateRequest;
import com.datadog.api.client.v2.model.SalesforceIncidentsTemplatesResponse;
import jakarta.ws.rs.client.Invocation;
import jakarta.ws.rs.core.GenericType;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.CompletableFuture;

@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class SalesforceIntegrationApi {
  private ApiClient apiClient;

  public SalesforceIntegrationApi() {
    this(ApiClient.getDefaultApiClient());
  }

  public SalesforceIntegrationApi(ApiClient apiClient) {
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
   * Create a Salesforce incident template.
   *
   * <p>See {@link #createIncidentTemplateWithHttpInfo}.
   *
   * @param body Salesforce incident template payload. (required)
   * @return SalesforceIncidentsTemplateResponse
   * @throws ApiException if fails to make API call
   */
  public SalesforceIncidentsTemplateResponse createIncidentTemplate(
      SalesforceIncidentsTemplateCreateRequest body) throws ApiException {
    return createIncidentTemplateWithHttpInfo(body).getData();
  }

  /**
   * Create a Salesforce incident template.
   *
   * <p>See {@link #createIncidentTemplateWithHttpInfoAsync}.
   *
   * @param body Salesforce incident template payload. (required)
   * @return CompletableFuture&lt;SalesforceIncidentsTemplateResponse&gt;
   */
  public CompletableFuture<SalesforceIncidentsTemplateResponse> createIncidentTemplateAsync(
      SalesforceIncidentsTemplateCreateRequest body) {
    return createIncidentTemplateWithHttpInfoAsync(body)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Create a new Salesforce incident template for your organization. Template names must be unique
   * within an organization.
   *
   * @param body Salesforce incident template payload. (required)
   * @return ApiResponse&lt;SalesforceIncidentsTemplateResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 201 </td><td> CREATED </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
   *       <tr><td> 409 </td><td> Conflict </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<SalesforceIncidentsTemplateResponse> createIncidentTemplateWithHttpInfo(
      SalesforceIncidentsTemplateCreateRequest body) throws ApiException {
    Object localVarPostBody = body;

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(
          400, "Missing the required parameter 'body' when calling createIncidentTemplate");
    }
    // create path and map variables
    String localVarPath = "/api/v2/integration/salesforce-incidents/incident-templates";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.SalesforceIntegrationApi.createIncidentTemplate",
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
        new GenericType<SalesforceIncidentsTemplateResponse>() {});
  }

  /**
   * Create a Salesforce incident template.
   *
   * <p>See {@link #createIncidentTemplateWithHttpInfo}.
   *
   * @param body Salesforce incident template payload. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;SalesforceIncidentsTemplateResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<SalesforceIncidentsTemplateResponse>>
      createIncidentTemplateWithHttpInfoAsync(SalesforceIncidentsTemplateCreateRequest body) {
    Object localVarPostBody = body;

    // verify the required parameter 'body' is set
    if (body == null) {
      CompletableFuture<ApiResponse<SalesforceIncidentsTemplateResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'body' when calling createIncidentTemplate"));
      return result;
    }
    // create path and map variables
    String localVarPath = "/api/v2/integration/salesforce-incidents/incident-templates";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.SalesforceIntegrationApi.createIncidentTemplate",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<SalesforceIncidentsTemplateResponse>> result =
          new CompletableFuture<>();
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
        new GenericType<SalesforceIncidentsTemplateResponse>() {});
  }

  /**
   * Delete a Salesforce incident template.
   *
   * <p>See {@link #deleteIncidentTemplateWithHttpInfo}.
   *
   * @param incidentTemplateId The ID of the Salesforce incident template. (required)
   * @throws ApiException if fails to make API call
   */
  public void deleteIncidentTemplate(String incidentTemplateId) throws ApiException {
    deleteIncidentTemplateWithHttpInfo(incidentTemplateId);
  }

  /**
   * Delete a Salesforce incident template.
   *
   * <p>See {@link #deleteIncidentTemplateWithHttpInfoAsync}.
   *
   * @param incidentTemplateId The ID of the Salesforce incident template. (required)
   * @return CompletableFuture
   */
  public CompletableFuture<Void> deleteIncidentTemplateAsync(String incidentTemplateId) {
    return deleteIncidentTemplateWithHttpInfoAsync(incidentTemplateId)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Delete a single Salesforce incident template from your organization.
   *
   * @param incidentTemplateId The ID of the Salesforce incident template. (required)
   * @return ApiResponse&lt;Void&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 204 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<Void> deleteIncidentTemplateWithHttpInfo(String incidentTemplateId)
      throws ApiException {
    Object localVarPostBody = null;

    // verify the required parameter 'incidentTemplateId' is set
    if (incidentTemplateId == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'incidentTemplateId' when calling"
              + " deleteIncidentTemplate");
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/integration/salesforce-incidents/incident-templates/{incident_template_id}"
            .replaceAll(
                "\\{" + "incident_template_id" + "\\}",
                apiClient.escapeString(incidentTemplateId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.SalesforceIntegrationApi.deleteIncidentTemplate",
            localVarPath,
            new ArrayList<Pair>(),
            localVarHeaderParams,
            new HashMap<String, String>(),
            new String[] {"*/*"},
            new String[] {"apiKeyAuth", "appKeyAuth"});
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
   * Delete a Salesforce incident template.
   *
   * <p>See {@link #deleteIncidentTemplateWithHttpInfo}.
   *
   * @param incidentTemplateId The ID of the Salesforce incident template. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;Void&gt;&gt;
   */
  public CompletableFuture<ApiResponse<Void>> deleteIncidentTemplateWithHttpInfoAsync(
      String incidentTemplateId) {
    Object localVarPostBody = null;

    // verify the required parameter 'incidentTemplateId' is set
    if (incidentTemplateId == null) {
      CompletableFuture<ApiResponse<Void>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'incidentTemplateId' when calling"
                  + " deleteIncidentTemplate"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/integration/salesforce-incidents/incident-templates/{incident_template_id}"
            .replaceAll(
                "\\{" + "incident_template_id" + "\\}",
                apiClient.escapeString(incidentTemplateId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.SalesforceIntegrationApi.deleteIncidentTemplate",
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
   * Delete a connected Salesforce organization.
   *
   * <p>See {@link #deleteSalesforceOrganizationWithHttpInfo}.
   *
   * @param salesforceOrgId The Datadog-assigned ID of the connected Salesforce organization.
   *     (required)
   * @throws ApiException if fails to make API call
   */
  public void deleteSalesforceOrganization(String salesforceOrgId) throws ApiException {
    deleteSalesforceOrganizationWithHttpInfo(salesforceOrgId);
  }

  /**
   * Delete a connected Salesforce organization.
   *
   * <p>See {@link #deleteSalesforceOrganizationWithHttpInfoAsync}.
   *
   * @param salesforceOrgId The Datadog-assigned ID of the connected Salesforce organization.
   *     (required)
   * @return CompletableFuture
   */
  public CompletableFuture<Void> deleteSalesforceOrganizationAsync(String salesforceOrgId) {
    return deleteSalesforceOrganizationWithHttpInfoAsync(salesforceOrgId)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Disconnect a Salesforce organization from your Datadog organization. This also deletes any
   * incident templates referencing the organization.
   *
   * @param salesforceOrgId The Datadog-assigned ID of the connected Salesforce organization.
   *     (required)
   * @return ApiResponse&lt;Void&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 204 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<Void> deleteSalesforceOrganizationWithHttpInfo(String salesforceOrgId)
      throws ApiException {
    Object localVarPostBody = null;

    // verify the required parameter 'salesforceOrgId' is set
    if (salesforceOrgId == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'salesforceOrgId' when calling"
              + " deleteSalesforceOrganization");
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/integration/salesforce-incidents/organizations/{salesforce_org_id}"
            .replaceAll(
                "\\{" + "salesforce_org_id" + "\\}",
                apiClient.escapeString(salesforceOrgId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.SalesforceIntegrationApi.deleteSalesforceOrganization",
            localVarPath,
            new ArrayList<Pair>(),
            localVarHeaderParams,
            new HashMap<String, String>(),
            new String[] {"*/*"},
            new String[] {"apiKeyAuth", "appKeyAuth"});
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
   * Delete a connected Salesforce organization.
   *
   * <p>See {@link #deleteSalesforceOrganizationWithHttpInfo}.
   *
   * @param salesforceOrgId The Datadog-assigned ID of the connected Salesforce organization.
   *     (required)
   * @return CompletableFuture&lt;ApiResponse&lt;Void&gt;&gt;
   */
  public CompletableFuture<ApiResponse<Void>> deleteSalesforceOrganizationWithHttpInfoAsync(
      String salesforceOrgId) {
    Object localVarPostBody = null;

    // verify the required parameter 'salesforceOrgId' is set
    if (salesforceOrgId == null) {
      CompletableFuture<ApiResponse<Void>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'salesforceOrgId' when calling"
                  + " deleteSalesforceOrganization"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/integration/salesforce-incidents/organizations/{salesforce_org_id}"
            .replaceAll(
                "\\{" + "salesforce_org_id" + "\\}",
                apiClient.escapeString(salesforceOrgId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.SalesforceIntegrationApi.deleteSalesforceOrganization",
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
   * Get all Salesforce incident templates.
   *
   * <p>See {@link #getIncidentTemplatesWithHttpInfo}.
   *
   * @return SalesforceIncidentsTemplatesResponse
   * @throws ApiException if fails to make API call
   */
  public SalesforceIncidentsTemplatesResponse getIncidentTemplates() throws ApiException {
    return getIncidentTemplatesWithHttpInfo().getData();
  }

  /**
   * Get all Salesforce incident templates.
   *
   * <p>See {@link #getIncidentTemplatesWithHttpInfoAsync}.
   *
   * @return CompletableFuture&lt;SalesforceIncidentsTemplatesResponse&gt;
   */
  public CompletableFuture<SalesforceIncidentsTemplatesResponse> getIncidentTemplatesAsync() {
    return getIncidentTemplatesWithHttpInfoAsync()
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Get all Salesforce incident templates configured for your organization.
   *
   * @return ApiResponse&lt;SalesforceIncidentsTemplatesResponse&gt;
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
  public ApiResponse<SalesforceIncidentsTemplatesResponse> getIncidentTemplatesWithHttpInfo()
      throws ApiException {
    Object localVarPostBody = null;
    // create path and map variables
    String localVarPath = "/api/v2/integration/salesforce-incidents/incident-templates";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.SalesforceIntegrationApi.getIncidentTemplates",
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
        new GenericType<SalesforceIncidentsTemplatesResponse>() {});
  }

  /**
   * Get all Salesforce incident templates.
   *
   * <p>See {@link #getIncidentTemplatesWithHttpInfo}.
   *
   * @return CompletableFuture&lt;ApiResponse&lt;SalesforceIncidentsTemplatesResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<SalesforceIncidentsTemplatesResponse>>
      getIncidentTemplatesWithHttpInfoAsync() {
    Object localVarPostBody = null;
    // create path and map variables
    String localVarPath = "/api/v2/integration/salesforce-incidents/incident-templates";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.SalesforceIntegrationApi.getIncidentTemplates",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<SalesforceIncidentsTemplatesResponse>> result =
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
        new GenericType<SalesforceIncidentsTemplatesResponse>() {});
  }

  /**
   * Get all connected Salesforce organizations.
   *
   * <p>See {@link #getSalesforceOrganizationsWithHttpInfo}.
   *
   * @return SalesforceIncidentsOrganizationsResponse
   * @throws ApiException if fails to make API call
   */
  public SalesforceIncidentsOrganizationsResponse getSalesforceOrganizations() throws ApiException {
    return getSalesforceOrganizationsWithHttpInfo().getData();
  }

  /**
   * Get all connected Salesforce organizations.
   *
   * <p>See {@link #getSalesforceOrganizationsWithHttpInfoAsync}.
   *
   * @return CompletableFuture&lt;SalesforceIncidentsOrganizationsResponse&gt;
   */
  public CompletableFuture<SalesforceIncidentsOrganizationsResponse>
      getSalesforceOrganizationsAsync() {
    return getSalesforceOrganizationsWithHttpInfoAsync()
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Get all Salesforce organizations connected to your Datadog organization through the Salesforce
   * integration. Salesforce organizations are connected through the OAuth setup flow in the Datadog
   * Salesforce integration page.
   *
   * @return ApiResponse&lt;SalesforceIncidentsOrganizationsResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<SalesforceIncidentsOrganizationsResponse>
      getSalesforceOrganizationsWithHttpInfo() throws ApiException {
    Object localVarPostBody = null;
    // create path and map variables
    String localVarPath = "/api/v2/integration/salesforce-incidents/organizations";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.SalesforceIntegrationApi.getSalesforceOrganizations",
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
        new GenericType<SalesforceIncidentsOrganizationsResponse>() {});
  }

  /**
   * Get all connected Salesforce organizations.
   *
   * <p>See {@link #getSalesforceOrganizationsWithHttpInfo}.
   *
   * @return CompletableFuture&lt;ApiResponse&lt;SalesforceIncidentsOrganizationsResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<SalesforceIncidentsOrganizationsResponse>>
      getSalesforceOrganizationsWithHttpInfoAsync() {
    Object localVarPostBody = null;
    // create path and map variables
    String localVarPath = "/api/v2/integration/salesforce-incidents/organizations";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.SalesforceIntegrationApi.getSalesforceOrganizations",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<SalesforceIncidentsOrganizationsResponse>> result =
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
        new GenericType<SalesforceIncidentsOrganizationsResponse>() {});
  }

  /**
   * Update a Salesforce incident template.
   *
   * <p>See {@link #updateIncidentTemplateWithHttpInfo}.
   *
   * @param incidentTemplateId The ID of the Salesforce incident template. (required)
   * @param body Salesforce incident template payload. (required)
   * @return SalesforceIncidentsTemplateResponse
   * @throws ApiException if fails to make API call
   */
  public SalesforceIncidentsTemplateResponse updateIncidentTemplate(
      String incidentTemplateId, SalesforceIncidentsTemplateUpdateRequest body)
      throws ApiException {
    return updateIncidentTemplateWithHttpInfo(incidentTemplateId, body).getData();
  }

  /**
   * Update a Salesforce incident template.
   *
   * <p>See {@link #updateIncidentTemplateWithHttpInfoAsync}.
   *
   * @param incidentTemplateId The ID of the Salesforce incident template. (required)
   * @param body Salesforce incident template payload. (required)
   * @return CompletableFuture&lt;SalesforceIncidentsTemplateResponse&gt;
   */
  public CompletableFuture<SalesforceIncidentsTemplateResponse> updateIncidentTemplateAsync(
      String incidentTemplateId, SalesforceIncidentsTemplateUpdateRequest body) {
    return updateIncidentTemplateWithHttpInfoAsync(incidentTemplateId, body)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Update a single Salesforce incident template in your organization.
   *
   * @param incidentTemplateId The ID of the Salesforce incident template. (required)
   * @param body Salesforce incident template payload. (required)
   * @return ApiResponse&lt;SalesforceIncidentsTemplateResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
   *       <tr><td> 409 </td><td> Conflict </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<SalesforceIncidentsTemplateResponse> updateIncidentTemplateWithHttpInfo(
      String incidentTemplateId, SalesforceIncidentsTemplateUpdateRequest body)
      throws ApiException {
    Object localVarPostBody = body;

    // verify the required parameter 'incidentTemplateId' is set
    if (incidentTemplateId == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'incidentTemplateId' when calling"
              + " updateIncidentTemplate");
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(
          400, "Missing the required parameter 'body' when calling updateIncidentTemplate");
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/integration/salesforce-incidents/incident-templates/{incident_template_id}"
            .replaceAll(
                "\\{" + "incident_template_id" + "\\}",
                apiClient.escapeString(incidentTemplateId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.SalesforceIntegrationApi.updateIncidentTemplate",
            localVarPath,
            new ArrayList<Pair>(),
            localVarHeaderParams,
            new HashMap<String, String>(),
            new String[] {"application/json"},
            new String[] {"apiKeyAuth", "appKeyAuth"});
    return apiClient.invokeAPI(
        "PATCH",
        builder,
        localVarHeaderParams,
        new String[] {"application/json"},
        localVarPostBody,
        new HashMap<String, Object>(),
        false,
        new GenericType<SalesforceIncidentsTemplateResponse>() {});
  }

  /**
   * Update a Salesforce incident template.
   *
   * <p>See {@link #updateIncidentTemplateWithHttpInfo}.
   *
   * @param incidentTemplateId The ID of the Salesforce incident template. (required)
   * @param body Salesforce incident template payload. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;SalesforceIncidentsTemplateResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<SalesforceIncidentsTemplateResponse>>
      updateIncidentTemplateWithHttpInfoAsync(
          String incidentTemplateId, SalesforceIncidentsTemplateUpdateRequest body) {
    Object localVarPostBody = body;

    // verify the required parameter 'incidentTemplateId' is set
    if (incidentTemplateId == null) {
      CompletableFuture<ApiResponse<SalesforceIncidentsTemplateResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400,
              "Missing the required parameter 'incidentTemplateId' when calling"
                  + " updateIncidentTemplate"));
      return result;
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      CompletableFuture<ApiResponse<SalesforceIncidentsTemplateResponse>> result =
          new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'body' when calling updateIncidentTemplate"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/integration/salesforce-incidents/incident-templates/{incident_template_id}"
            .replaceAll(
                "\\{" + "incident_template_id" + "\\}",
                apiClient.escapeString(incidentTemplateId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.SalesforceIntegrationApi.updateIncidentTemplate",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<SalesforceIncidentsTemplateResponse>> result =
          new CompletableFuture<>();
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
        new GenericType<SalesforceIncidentsTemplateResponse>() {});
  }
}
