package com.datadog.api.v1.client.api;

import com.datadog.api.v1.client.ApiException;
import com.datadog.api.v1.client.ApiClient;
import com.datadog.api.v1.client.ApiResponse;
import com.datadog.api.v1.client.Configuration;
import com.datadog.api.v1.client.Pair;

import javax.ws.rs.core.GenericType;

import com.datadog.api.v1.client.model.APIErrorResponse;
import com.datadog.api.v1.client.model.LogsAPIErrorResponse;
import com.datadog.api.v1.client.model.LogsPipeline;
import com.datadog.api.v1.client.model.LogsPipelinesOrder;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class LogsPipelinesApi {
  private ApiClient apiClient;

  public LogsPipelinesApi() {
    this(Configuration.getDefaultApiClient());
  }

  public LogsPipelinesApi(ApiClient apiClient) {
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
   * Create a pipeline
   * Create a pipeline in your organization.
   * @param body Definition of the new pipeline. (required)
   * @return LogsPipeline
   * @throws ApiException if fails to make API call
   * @http.response.details
   * <table summary="Response Details" border="1">
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public LogsPipeline createLogsPipeline(LogsPipeline body) throws ApiException {
    return createLogsPipelineWithHttpInfo(body).getData();
  }

  /**
   * Create a pipeline
   * Create a pipeline in your organization.
   * @param body Definition of the new pipeline. (required)
   * @return ApiResponse&lt;LogsPipeline&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   * <table summary="Response Details" border="1">
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<LogsPipeline> createLogsPipelineWithHttpInfo(LogsPipeline body) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling createLogsPipeline");
    }
    // create path and map variables
    String localVarPath = "/api/v1/logs/config/pipelines";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    // Set Operation-ID header for telemetry
    localVarHeaderParams.put("DD-OPERATION-ID", "createLogsPipeline");

    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "apiKeyAuth", "appKeyAuth" };

    GenericType<LogsPipeline> localVarReturnType = new GenericType<LogsPipeline>() {};

    return apiClient.invokeAPI("LogsPipelinesApi.createLogsPipeline", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }


  /**
   * Delete a pipeline
   * Delete a given pipeline from your organization. This endpoint takes no JSON arguments.
   * @param pipelineId ID of the pipeline to delete. (required)
   * @throws ApiException if fails to make API call
   * @http.response.details
   * <table summary="Response Details" border="1">
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public void deleteLogsPipeline(String pipelineId) throws ApiException {
    deleteLogsPipelineWithHttpInfo(pipelineId);
  }

  /**
   * Delete a pipeline
   * Delete a given pipeline from your organization. This endpoint takes no JSON arguments.
   * @param pipelineId ID of the pipeline to delete. (required)
   * @return ApiResponse&lt;Void&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   * <table summary="Response Details" border="1">
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<Void> deleteLogsPipelineWithHttpInfo(String pipelineId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'pipelineId' is set
    if (pipelineId == null) {
      throw new ApiException(400, "Missing the required parameter 'pipelineId' when calling deleteLogsPipeline");
    }
    // create path and map variables
    String localVarPath = "/api/v1/logs/config/pipelines/{pipeline_id}"
      .replaceAll("\\{" + "pipeline_id" + "\\}", apiClient.escapeString(pipelineId.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    // Set Operation-ID header for telemetry
    localVarHeaderParams.put("DD-OPERATION-ID", "deleteLogsPipeline");

    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "apiKeyAuth", "appKeyAuth" };

    return apiClient.invokeAPI("LogsPipelinesApi.deleteLogsPipeline", localVarPath, "DELETE", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, null, false);
  }


  /**
   * Get a pipeline
   * Get a specific pipeline from your organization. This endpoint takes no JSON arguments.
   * @param pipelineId ID of the pipeline to get. (required)
   * @return LogsPipeline
   * @throws ApiException if fails to make API call
   * @http.response.details
   * <table summary="Response Details" border="1">
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public LogsPipeline getLogsPipeline(String pipelineId) throws ApiException {
    return getLogsPipelineWithHttpInfo(pipelineId).getData();
  }

  /**
   * Get a pipeline
   * Get a specific pipeline from your organization. This endpoint takes no JSON arguments.
   * @param pipelineId ID of the pipeline to get. (required)
   * @return ApiResponse&lt;LogsPipeline&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   * <table summary="Response Details" border="1">
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<LogsPipeline> getLogsPipelineWithHttpInfo(String pipelineId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'pipelineId' is set
    if (pipelineId == null) {
      throw new ApiException(400, "Missing the required parameter 'pipelineId' when calling getLogsPipeline");
    }
    // create path and map variables
    String localVarPath = "/api/v1/logs/config/pipelines/{pipeline_id}"
      .replaceAll("\\{" + "pipeline_id" + "\\}", apiClient.escapeString(pipelineId.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    // Set Operation-ID header for telemetry
    localVarHeaderParams.put("DD-OPERATION-ID", "getLogsPipeline");

    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "apiKeyAuth", "appKeyAuth" };

    GenericType<LogsPipeline> localVarReturnType = new GenericType<LogsPipeline>() {};

    return apiClient.invokeAPI("LogsPipelinesApi.getLogsPipeline", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }


  /**
   * Get pipeline order
   * Get the current order of your pipelines. This endpoint takes no JSON arguments.
   * @return LogsPipelinesOrder
   * @throws ApiException if fails to make API call
   * @http.response.details
   * <table summary="Response Details" border="1">
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public LogsPipelinesOrder getLogsPipelineOrder() throws ApiException {
    return getLogsPipelineOrderWithHttpInfo().getData();
  }

  /**
   * Get pipeline order
   * Get the current order of your pipelines. This endpoint takes no JSON arguments.
   * @return ApiResponse&lt;LogsPipelinesOrder&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   * <table summary="Response Details" border="1">
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<LogsPipelinesOrder> getLogsPipelineOrderWithHttpInfo() throws ApiException {
    Object localVarPostBody = null;
        // create path and map variables
    String localVarPath = "/api/v1/logs/config/pipeline-order";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    // Set Operation-ID header for telemetry
    localVarHeaderParams.put("DD-OPERATION-ID", "getLogsPipelineOrder");

    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "apiKeyAuth", "appKeyAuth" };

    GenericType<LogsPipelinesOrder> localVarReturnType = new GenericType<LogsPipelinesOrder>() {};

    return apiClient.invokeAPI("LogsPipelinesApi.getLogsPipelineOrder", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }


  /**
   * Get all pipelines
   * Get all pipelines from your organization. This endpoint takes no JSON arguments.
   * @return List&lt;LogsPipeline&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   * <table summary="Response Details" border="1">
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public List<LogsPipeline> listLogsPipelines() throws ApiException {
    return listLogsPipelinesWithHttpInfo().getData();
  }

  /**
   * Get all pipelines
   * Get all pipelines from your organization. This endpoint takes no JSON arguments.
   * @return ApiResponse&lt;List&lt;LogsPipeline&gt;&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   * <table summary="Response Details" border="1">
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<List<LogsPipeline>> listLogsPipelinesWithHttpInfo() throws ApiException {
    Object localVarPostBody = null;
        // create path and map variables
    String localVarPath = "/api/v1/logs/config/pipelines";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    // Set Operation-ID header for telemetry
    localVarHeaderParams.put("DD-OPERATION-ID", "listLogsPipelines");

    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "apiKeyAuth", "appKeyAuth" };

    GenericType<List<LogsPipeline>> localVarReturnType = new GenericType<List<LogsPipeline>>() {};

    return apiClient.invokeAPI("LogsPipelinesApi.listLogsPipelines", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }


  /**
   * Update a pipeline
   * Update a given pipeline configuration to change it’s processors or their order.  **Note**: Using this method updates your pipeline configuration by **replacing** your current configuration with the new one sent to your Datadog organization.
   * @param pipelineId ID of the pipeline to delete. (required)
   * @param body New definition of the pipeline. (required)
   * @return LogsPipeline
   * @throws ApiException if fails to make API call
   * @http.response.details
   * <table summary="Response Details" border="1">
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public LogsPipeline updateLogsPipeline(String pipelineId, LogsPipeline body) throws ApiException {
    return updateLogsPipelineWithHttpInfo(pipelineId, body).getData();
  }

  /**
   * Update a pipeline
   * Update a given pipeline configuration to change it’s processors or their order.  **Note**: Using this method updates your pipeline configuration by **replacing** your current configuration with the new one sent to your Datadog organization.
   * @param pipelineId ID of the pipeline to delete. (required)
   * @param body New definition of the pipeline. (required)
   * @return ApiResponse&lt;LogsPipeline&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   * <table summary="Response Details" border="1">
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<LogsPipeline> updateLogsPipelineWithHttpInfo(String pipelineId, LogsPipeline body) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'pipelineId' is set
    if (pipelineId == null) {
      throw new ApiException(400, "Missing the required parameter 'pipelineId' when calling updateLogsPipeline");
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling updateLogsPipeline");
    }
    // create path and map variables
    String localVarPath = "/api/v1/logs/config/pipelines/{pipeline_id}"
      .replaceAll("\\{" + "pipeline_id" + "\\}", apiClient.escapeString(pipelineId.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    // Set Operation-ID header for telemetry
    localVarHeaderParams.put("DD-OPERATION-ID", "updateLogsPipeline");

    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "apiKeyAuth", "appKeyAuth" };

    GenericType<LogsPipeline> localVarReturnType = new GenericType<LogsPipeline>() {};

    return apiClient.invokeAPI("LogsPipelinesApi.updateLogsPipeline", localVarPath, "PUT", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }


  /**
   * Update pipeline order
   * Update the order of your pipelines. Since logs are processed sequentially, reordering a pipeline may change the structure and content of the data processed by other pipelines and their processors.  **Note**: Using the &#x60;PUT&#x60; method updates your pipeline order by replacing your current order with the new one sent to your Datadog organization.
   * @param body Object containing the new ordered list of pipeline IDs. (required)
   * @return LogsPipelinesOrder
   * @throws ApiException if fails to make API call
   * @http.response.details
   * <table summary="Response Details" border="1">
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 422 </td><td> Unprocessable Entity </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public LogsPipelinesOrder updateLogsPipelineOrder(LogsPipelinesOrder body) throws ApiException {
    return updateLogsPipelineOrderWithHttpInfo(body).getData();
  }

  /**
   * Update pipeline order
   * Update the order of your pipelines. Since logs are processed sequentially, reordering a pipeline may change the structure and content of the data processed by other pipelines and their processors.  **Note**: Using the &#x60;PUT&#x60; method updates your pipeline order by replacing your current order with the new one sent to your Datadog organization.
   * @param body Object containing the new ordered list of pipeline IDs. (required)
   * @return ApiResponse&lt;LogsPipelinesOrder&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   * <table summary="Response Details" border="1">
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 422 </td><td> Unprocessable Entity </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<LogsPipelinesOrder> updateLogsPipelineOrderWithHttpInfo(LogsPipelinesOrder body) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling updateLogsPipelineOrder");
    }
    // create path and map variables
    String localVarPath = "/api/v1/logs/config/pipeline-order";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    // Set Operation-ID header for telemetry
    localVarHeaderParams.put("DD-OPERATION-ID", "updateLogsPipelineOrder");

    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "apiKeyAuth", "appKeyAuth" };

    GenericType<LogsPipelinesOrder> localVarReturnType = new GenericType<LogsPipelinesOrder>() {};

    return apiClient.invokeAPI("LogsPipelinesApi.updateLogsPipelineOrder", localVarPath, "PUT", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
}
