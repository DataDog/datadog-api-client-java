package com.datadog.api.v1.client.api;

import com.datadog.api.v1.client.ApiClient;
import com.datadog.api.v1.client.ApiException;
import com.datadog.api.v1.client.ApiResponse;
import com.datadog.api.v1.client.Configuration;
import com.datadog.api.v1.client.Pair;
import com.datadog.api.v1.client.model.APIErrorResponse;
import com.datadog.api.v1.client.model.PagerDutyService;
import com.datadog.api.v1.client.model.PagerDutyServiceKey;
import com.datadog.api.v1.client.model.PagerDutyServiceName;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.ws.rs.core.GenericType;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class PagerDutyIntegrationApi {

    private ApiClient apiClient;

    public PagerDutyIntegrationApi() {
        this(Configuration.getDefaultApiClient());
    }

    public PagerDutyIntegrationApi(ApiClient apiClient) {
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
     * Create a new service object
     * Create a new service object in the PagerDuty integration.
     * @param body Create a new service object request body. (required)
     * @return PagerDutyServiceName
     * @throws ApiException if fails to make API call
     * @http.response.details
     * <table summary="Response Details" border="1">
     *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     *       <tr><td> 201 </td><td> OK </td><td>  -  </td></tr>
     *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
     *       <tr><td> 403 </td><td> Authentication error </td><td>  -  </td></tr>
     *     </table>
     */
    public PagerDutyServiceName createPagerDutyIntegrationService(PagerDutyService body) throws ApiException {
        return createPagerDutyIntegrationServiceWithHttpInfo(body).getData();
    }

    /**
     * Create a new service object
     * Create a new service object in the PagerDuty integration.
     * @param body Create a new service object request body. (required)
     * @return ApiResponse&lt;PagerDutyServiceName&gt;
     * @throws ApiException if fails to make API call
     * @http.response.details
     * <table summary="Response Details" border="1">
     *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     *       <tr><td> 201 </td><td> OK </td><td>  -  </td></tr>
     *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
     *       <tr><td> 403 </td><td> Authentication error </td><td>  -  </td></tr>
     *     </table>
     */
    public ApiResponse<PagerDutyServiceName> createPagerDutyIntegrationServiceWithHttpInfo(PagerDutyService body) throws ApiException {
        Object localVarPostBody = body;

        // verify the required parameter 'body' is set
        if (body == null) {
            throw new ApiException(400, "Missing the required parameter 'body' when calling createPagerDutyIntegrationService");
        }
        // create path and map variables
        String localVarPath = "/api/v1/integration/pagerduty/configuration/services";

        // query params
        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        // Set Operation-ID header for telemetry
        localVarHeaderParams.put("DD-OPERATION-ID", "createPagerDutyIntegrationService");

        final String[] localVarAccepts = { "application/json" };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

        final String[] localVarContentTypes = { "application/json" };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "apiKeyAuth", "appKeyAuth" };

        GenericType<PagerDutyServiceName> localVarReturnType = new GenericType<PagerDutyServiceName>() {};

        return apiClient.invokeAPI(
            "PagerDutyIntegrationApi.createPagerDutyIntegrationService",
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
            false
        );
    }

    /**
     * Delete a single service object
     * Delete a single service object in the Datadog-PagerDuty integration.
     * @param serviceName The service name (required)
     * @throws ApiException if fails to make API call
     * @http.response.details
     * <table summary="Response Details" border="1">
     *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     *       <tr><td> 403 </td><td> Authentication error </td><td>  -  </td></tr>
     *       <tr><td> 404 </td><td> Item Not Found </td><td>  -  </td></tr>
     *     </table>
     */
    public void deletePagerDutyIntegrationService(String serviceName) throws ApiException {
        deletePagerDutyIntegrationServiceWithHttpInfo(serviceName);
    }

    /**
     * Delete a single service object
     * Delete a single service object in the Datadog-PagerDuty integration.
     * @param serviceName The service name (required)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException if fails to make API call
     * @http.response.details
     * <table summary="Response Details" border="1">
     *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     *       <tr><td> 403 </td><td> Authentication error </td><td>  -  </td></tr>
     *       <tr><td> 404 </td><td> Item Not Found </td><td>  -  </td></tr>
     *     </table>
     */
    public ApiResponse<Void> deletePagerDutyIntegrationServiceWithHttpInfo(String serviceName) throws ApiException {
        Object localVarPostBody = null;

        // verify the required parameter 'serviceName' is set
        if (serviceName == null) {
            throw new ApiException(400, "Missing the required parameter 'serviceName' when calling deletePagerDutyIntegrationService");
        }
        // create path and map variables
        String localVarPath =
            "/api/v1/integration/pagerduty/configuration/services/{service_name}".replaceAll(
                    "\\{" + "service_name" + "\\}",
                    apiClient.escapeString(serviceName.toString())
                );

        // query params
        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        // Set Operation-ID header for telemetry
        localVarHeaderParams.put("DD-OPERATION-ID", "deletePagerDutyIntegrationService");

        final String[] localVarAccepts = { "application/json" };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

        final String[] localVarContentTypes = {};
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "apiKeyAuth", "appKeyAuth" };

        return apiClient.invokeAPI(
            "PagerDutyIntegrationApi.deletePagerDutyIntegrationService",
            localVarPath,
            "DELETE",
            localVarQueryParams,
            localVarPostBody,
            localVarHeaderParams,
            localVarCookieParams,
            localVarFormParams,
            localVarAccept,
            localVarContentType,
            localVarAuthNames,
            null,
            false
        );
    }

    /**
     * Get a single service object
     * Get service name in the Datadog-PagerDuty integration.
     * @param serviceName The service name. (required)
     * @return PagerDutyServiceName
     * @throws ApiException if fails to make API call
     * @http.response.details
     * <table summary="Response Details" border="1">
     *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     *       <tr><td> 403 </td><td> Authentication error </td><td>  -  </td></tr>
     *       <tr><td> 404 </td><td> Item Not Found </td><td>  -  </td></tr>
     *     </table>
     */
    public PagerDutyServiceName getPagerDutyIntegrationService(String serviceName) throws ApiException {
        return getPagerDutyIntegrationServiceWithHttpInfo(serviceName).getData();
    }

    /**
     * Get a single service object
     * Get service name in the Datadog-PagerDuty integration.
     * @param serviceName The service name. (required)
     * @return ApiResponse&lt;PagerDutyServiceName&gt;
     * @throws ApiException if fails to make API call
     * @http.response.details
     * <table summary="Response Details" border="1">
     *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     *       <tr><td> 403 </td><td> Authentication error </td><td>  -  </td></tr>
     *       <tr><td> 404 </td><td> Item Not Found </td><td>  -  </td></tr>
     *     </table>
     */
    public ApiResponse<PagerDutyServiceName> getPagerDutyIntegrationServiceWithHttpInfo(String serviceName) throws ApiException {
        Object localVarPostBody = null;

        // verify the required parameter 'serviceName' is set
        if (serviceName == null) {
            throw new ApiException(400, "Missing the required parameter 'serviceName' when calling getPagerDutyIntegrationService");
        }
        // create path and map variables
        String localVarPath =
            "/api/v1/integration/pagerduty/configuration/services/{service_name}".replaceAll(
                    "\\{" + "service_name" + "\\}",
                    apiClient.escapeString(serviceName.toString())
                );

        // query params
        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        // Set Operation-ID header for telemetry
        localVarHeaderParams.put("DD-OPERATION-ID", "getPagerDutyIntegrationService");

        final String[] localVarAccepts = { "application/json" };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

        final String[] localVarContentTypes = {};
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "apiKeyAuth", "appKeyAuth" };

        GenericType<PagerDutyServiceName> localVarReturnType = new GenericType<PagerDutyServiceName>() {};

        return apiClient.invokeAPI(
            "PagerDutyIntegrationApi.getPagerDutyIntegrationService",
            localVarPath,
            "GET",
            localVarQueryParams,
            localVarPostBody,
            localVarHeaderParams,
            localVarCookieParams,
            localVarFormParams,
            localVarAccept,
            localVarContentType,
            localVarAuthNames,
            localVarReturnType,
            false
        );
    }

    /**
     * Update a single service object
     * Update a single service object in the Datadog-PagerDuty integration.
     * @param serviceName The service name (required)
     * @param body Update an existing service object request body. (required)
     * @throws ApiException if fails to make API call
     * @http.response.details
     * <table summary="Response Details" border="1">
     *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
     *       <tr><td> 403 </td><td> Authentication error </td><td>  -  </td></tr>
     *       <tr><td> 404 </td><td> Item Not Found </td><td>  -  </td></tr>
     *     </table>
     */
    public void updatePagerDutyIntegrationService(String serviceName, PagerDutyServiceKey body) throws ApiException {
        updatePagerDutyIntegrationServiceWithHttpInfo(serviceName, body);
    }

    /**
     * Update a single service object
     * Update a single service object in the Datadog-PagerDuty integration.
     * @param serviceName The service name (required)
     * @param body Update an existing service object request body. (required)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException if fails to make API call
     * @http.response.details
     * <table summary="Response Details" border="1">
     *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
     *       <tr><td> 403 </td><td> Authentication error </td><td>  -  </td></tr>
     *       <tr><td> 404 </td><td> Item Not Found </td><td>  -  </td></tr>
     *     </table>
     */
    public ApiResponse<Void> updatePagerDutyIntegrationServiceWithHttpInfo(String serviceName, PagerDutyServiceKey body)
        throws ApiException {
        Object localVarPostBody = body;

        // verify the required parameter 'serviceName' is set
        if (serviceName == null) {
            throw new ApiException(400, "Missing the required parameter 'serviceName' when calling updatePagerDutyIntegrationService");
        }

        // verify the required parameter 'body' is set
        if (body == null) {
            throw new ApiException(400, "Missing the required parameter 'body' when calling updatePagerDutyIntegrationService");
        }
        // create path and map variables
        String localVarPath =
            "/api/v1/integration/pagerduty/configuration/services/{service_name}".replaceAll(
                    "\\{" + "service_name" + "\\}",
                    apiClient.escapeString(serviceName.toString())
                );

        // query params
        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        // Set Operation-ID header for telemetry
        localVarHeaderParams.put("DD-OPERATION-ID", "updatePagerDutyIntegrationService");

        final String[] localVarAccepts = { "application/json" };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

        final String[] localVarContentTypes = { "application/json" };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "apiKeyAuth", "appKeyAuth" };

        return apiClient.invokeAPI(
            "PagerDutyIntegrationApi.updatePagerDutyIntegrationService",
            localVarPath,
            "PUT",
            localVarQueryParams,
            localVarPostBody,
            localVarHeaderParams,
            localVarCookieParams,
            localVarFormParams,
            localVarAccept,
            localVarContentType,
            localVarAuthNames,
            null,
            false
        );
    }
}
