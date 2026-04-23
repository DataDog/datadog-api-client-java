/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v2.model;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/** A step result from a browser, mobile, or multistep API test. */
@JsonPropertyOrder({
  SyntheticsTestResultStep.JSON_PROPERTY_ALLOW_FAILURE,
  SyntheticsTestResultStep.JSON_PROPERTY_API_TEST,
  SyntheticsTestResultStep.JSON_PROPERTY_ASSERTION_RESULT,
  SyntheticsTestResultStep.JSON_PROPERTY_ASSERTIONS,
  SyntheticsTestResultStep.JSON_PROPERTY_BLOCKED_REQUESTS_URLS,
  SyntheticsTestResultStep.JSON_PROPERTY_BOUNDS,
  SyntheticsTestResultStep.JSON_PROPERTY_BROWSER_ERRORS,
  SyntheticsTestResultStep.JSON_PROPERTY_BUCKET_KEYS,
  SyntheticsTestResultStep.JSON_PROPERTY_CDN_RESOURCES,
  SyntheticsTestResultStep.JSON_PROPERTY_CLICK_TYPE,
  SyntheticsTestResultStep.JSON_PROPERTY_COMPRESSED_JSON_DESCRIPTOR,
  SyntheticsTestResultStep.JSON_PROPERTY_CONFIG,
  SyntheticsTestResultStep.JSON_PROPERTY_DESCRIPTION,
  SyntheticsTestResultStep.JSON_PROPERTY_DURATION,
  SyntheticsTestResultStep.JSON_PROPERTY_ELEMENT_DESCRIPTION,
  SyntheticsTestResultStep.JSON_PROPERTY_ELEMENT_UPDATES,
  SyntheticsTestResultStep.JSON_PROPERTY_EXTRACTED_VALUE,
  SyntheticsTestResultStep.JSON_PROPERTY_FAILURE,
  SyntheticsTestResultStep.JSON_PROPERTY_HTTP_RESULTS,
  SyntheticsTestResultStep.JSON_PROPERTY_ID,
  SyntheticsTestResultStep.JSON_PROPERTY_IS_CRITICAL,
  SyntheticsTestResultStep.JSON_PROPERTY_JAVASCRIPT_CUSTOM_ASSERTION_CODE,
  SyntheticsTestResultStep.JSON_PROPERTY_LOCATE_ELEMENT_DURATION,
  SyntheticsTestResultStep.JSON_PROPERTY_NAME,
  SyntheticsTestResultStep.JSON_PROPERTY_REQUEST,
  SyntheticsTestResultStep.JSON_PROPERTY_RESPONSE,
  SyntheticsTestResultStep.JSON_PROPERTY_RETRIES,
  SyntheticsTestResultStep.JSON_PROPERTY_RETRY_COUNT,
  SyntheticsTestResultStep.JSON_PROPERTY_RUM_CONTEXT,
  SyntheticsTestResultStep.JSON_PROPERTY_STARTED_AT,
  SyntheticsTestResultStep.JSON_PROPERTY_STATUS,
  SyntheticsTestResultStep.JSON_PROPERTY_SUB_STEP,
  SyntheticsTestResultStep.JSON_PROPERTY_SUB_TEST,
  SyntheticsTestResultStep.JSON_PROPERTY_SUBTYPE,
  SyntheticsTestResultStep.JSON_PROPERTY_TABS,
  SyntheticsTestResultStep.JSON_PROPERTY_TIMINGS,
  SyntheticsTestResultStep.JSON_PROPERTY_TUNNEL,
  SyntheticsTestResultStep.JSON_PROPERTY_TYPE,
  SyntheticsTestResultStep.JSON_PROPERTY_URL,
  SyntheticsTestResultStep.JSON_PROPERTY_VALUE,
  SyntheticsTestResultStep.JSON_PROPERTY_VARIABLES,
  SyntheticsTestResultStep.JSON_PROPERTY_VITALS_METRICS,
  SyntheticsTestResultStep.JSON_PROPERTY_WARNINGS
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class SyntheticsTestResultStep {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_ALLOW_FAILURE = "allow_failure";
  private Boolean allowFailure;

  public static final String JSON_PROPERTY_API_TEST = "api_test";
  private Map<String, Object> apiTest = null;

  public static final String JSON_PROPERTY_ASSERTION_RESULT = "assertion_result";
  private SyntheticsTestResultStepAssertionResult assertionResult;

  public static final String JSON_PROPERTY_ASSERTIONS = "assertions";
  private List<SyntheticsTestResultAssertionResult> assertions = null;

  public static final String JSON_PROPERTY_BLOCKED_REQUESTS_URLS = "blocked_requests_urls";
  private List<String> blockedRequestsUrls = null;

  public static final String JSON_PROPERTY_BOUNDS = "bounds";
  private SyntheticsTestResultBounds bounds;

  public static final String JSON_PROPERTY_BROWSER_ERRORS = "browser_errors";
  private List<SyntheticsTestResultBrowserError> browserErrors = null;

  public static final String JSON_PROPERTY_BUCKET_KEYS = "bucket_keys";
  private SyntheticsTestResultBucketKeys bucketKeys;

  public static final String JSON_PROPERTY_CDN_RESOURCES = "cdn_resources";
  private List<SyntheticsTestResultCdnResource> cdnResources = null;

  public static final String JSON_PROPERTY_CLICK_TYPE = "click_type";
  private String clickType;

  public static final String JSON_PROPERTY_COMPRESSED_JSON_DESCRIPTOR =
      "compressed_json_descriptor";
  private String compressedJsonDescriptor;

  public static final String JSON_PROPERTY_CONFIG = "config";
  private Map<String, Object> config = null;

  public static final String JSON_PROPERTY_DESCRIPTION = "description";
  private String description;

  public static final String JSON_PROPERTY_DURATION = "duration";
  private Double duration;

  public static final String JSON_PROPERTY_ELEMENT_DESCRIPTION = "element_description";
  private String elementDescription;

  public static final String JSON_PROPERTY_ELEMENT_UPDATES = "element_updates";
  private SyntheticsTestResultStepElementUpdates elementUpdates;

  public static final String JSON_PROPERTY_EXTRACTED_VALUE = "extracted_value";
  private SyntheticsTestResultVariable extractedValue;

  public static final String JSON_PROPERTY_FAILURE = "failure";
  private SyntheticsTestResultFailure failure;

  public static final String JSON_PROPERTY_HTTP_RESULTS = "http_results";
  private List<SyntheticsTestResultAssertionResult> httpResults = null;

  public static final String JSON_PROPERTY_ID = "id";
  private String id;

  public static final String JSON_PROPERTY_IS_CRITICAL = "is_critical";
  private Boolean isCritical;

  public static final String JSON_PROPERTY_JAVASCRIPT_CUSTOM_ASSERTION_CODE =
      "javascript_custom_assertion_code";
  private Boolean javascriptCustomAssertionCode;

  public static final String JSON_PROPERTY_LOCATE_ELEMENT_DURATION = "locate_element_duration";
  private Double locateElementDuration;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_REQUEST = "request";
  private SyntheticsTestResultRequestInfo request;

  public static final String JSON_PROPERTY_RESPONSE = "response";
  private SyntheticsTestResultResponseInfo response;

  public static final String JSON_PROPERTY_RETRIES = "retries";
  private List<SyntheticsTestResultStep> retries = null;

  public static final String JSON_PROPERTY_RETRY_COUNT = "retry_count";
  private Long retryCount;

  public static final String JSON_PROPERTY_RUM_CONTEXT = "rum_context";
  private SyntheticsTestResultRumContext rumContext;

  public static final String JSON_PROPERTY_STARTED_AT = "started_at";
  private Long startedAt;

  public static final String JSON_PROPERTY_STATUS = "status";
  private String status;

  public static final String JSON_PROPERTY_SUB_STEP = "sub_step";
  private SyntheticsTestResultSubStep subStep;

  public static final String JSON_PROPERTY_SUB_TEST = "sub_test";
  private SyntheticsTestResultSubTest subTest;

  public static final String JSON_PROPERTY_SUBTYPE = "subtype";
  private String subtype;

  public static final String JSON_PROPERTY_TABS = "tabs";
  private List<SyntheticsTestResultTab> tabs = null;

  public static final String JSON_PROPERTY_TIMINGS = "timings";
  private Map<String, Object> timings = null;

  public static final String JSON_PROPERTY_TUNNEL = "tunnel";
  private Boolean tunnel;

  public static final String JSON_PROPERTY_TYPE = "type";
  private String type;

  public static final String JSON_PROPERTY_URL = "url";
  private String url;

  public static final String JSON_PROPERTY_VALUE = "value";
  private Object value = null;

  public static final String JSON_PROPERTY_VARIABLES = "variables";
  private SyntheticsTestResultVariables variables;

  public static final String JSON_PROPERTY_VITALS_METRICS = "vitals_metrics";
  private List<SyntheticsTestResultVitalsMetrics> vitalsMetrics = null;

  public static final String JSON_PROPERTY_WARNINGS = "warnings";
  private List<SyntheticsTestResultWarning> warnings = null;

  public SyntheticsTestResultStep allowFailure(Boolean allowFailure) {
    this.allowFailure = allowFailure;
    return this;
  }

  /**
   * Whether the test continues when this step fails.
   *
   * @return allowFailure
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ALLOW_FAILURE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getAllowFailure() {
    return allowFailure;
  }

  public void setAllowFailure(Boolean allowFailure) {
    this.allowFailure = allowFailure;
  }

  public SyntheticsTestResultStep apiTest(Map<String, Object> apiTest) {
    this.apiTest = apiTest;
    return this;
  }

  public SyntheticsTestResultStep putApiTestItem(String key, Object apiTestItem) {
    if (this.apiTest == null) {
      this.apiTest = new HashMap<>();
    }
    this.apiTest.put(key, apiTestItem);
    return this;
  }

  /**
   * Inner API test definition for browser <code>runApiTest</code> steps.
   *
   * @return apiTest
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_API_TEST)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Map<String, Object> getApiTest() {
    return apiTest;
  }

  public void setApiTest(Map<String, Object> apiTest) {
    this.apiTest = apiTest;
  }

  public SyntheticsTestResultStep assertionResult(
      SyntheticsTestResultStepAssertionResult assertionResult) {
    this.assertionResult = assertionResult;
    this.unparsed |= assertionResult.unparsed;
    return this;
  }

  /**
   * Assertion result for a browser or mobile step.
   *
   * @return assertionResult
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ASSERTION_RESULT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public SyntheticsTestResultStepAssertionResult getAssertionResult() {
    return assertionResult;
  }

  public void setAssertionResult(SyntheticsTestResultStepAssertionResult assertionResult) {
    this.assertionResult = assertionResult;
  }

  public SyntheticsTestResultStep assertions(List<SyntheticsTestResultAssertionResult> assertions) {
    this.assertions = assertions;
    for (SyntheticsTestResultAssertionResult item : assertions) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }

  public SyntheticsTestResultStep addAssertionsItem(
      SyntheticsTestResultAssertionResult assertionsItem) {
    if (this.assertions == null) {
      this.assertions = new ArrayList<>();
    }
    this.assertions.add(assertionsItem);
    this.unparsed |= assertionsItem.unparsed;
    return this;
  }

  /**
   * Assertion results produced by the step.
   *
   * @return assertions
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ASSERTIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<SyntheticsTestResultAssertionResult> getAssertions() {
    return assertions;
  }

  public void setAssertions(List<SyntheticsTestResultAssertionResult> assertions) {
    this.assertions = assertions;
  }

  public SyntheticsTestResultStep blockedRequestsUrls(List<String> blockedRequestsUrls) {
    this.blockedRequestsUrls = blockedRequestsUrls;
    return this;
  }

  public SyntheticsTestResultStep addBlockedRequestsUrlsItem(String blockedRequestsUrlsItem) {
    if (this.blockedRequestsUrls == null) {
      this.blockedRequestsUrls = new ArrayList<>();
    }
    this.blockedRequestsUrls.add(blockedRequestsUrlsItem);
    return this;
  }

  /**
   * URLs of requests blocked during the step.
   *
   * @return blockedRequestsUrls
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_BLOCKED_REQUESTS_URLS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<String> getBlockedRequestsUrls() {
    return blockedRequestsUrls;
  }

  public void setBlockedRequestsUrls(List<String> blockedRequestsUrls) {
    this.blockedRequestsUrls = blockedRequestsUrls;
  }

  public SyntheticsTestResultStep bounds(SyntheticsTestResultBounds bounds) {
    this.bounds = bounds;
    this.unparsed |= bounds.unparsed;
    return this;
  }

  /**
   * Bounding box of an element on the page.
   *
   * @return bounds
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_BOUNDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public SyntheticsTestResultBounds getBounds() {
    return bounds;
  }

  public void setBounds(SyntheticsTestResultBounds bounds) {
    this.bounds = bounds;
  }

  public SyntheticsTestResultStep browserErrors(
      List<SyntheticsTestResultBrowserError> browserErrors) {
    this.browserErrors = browserErrors;
    for (SyntheticsTestResultBrowserError item : browserErrors) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }

  public SyntheticsTestResultStep addBrowserErrorsItem(
      SyntheticsTestResultBrowserError browserErrorsItem) {
    if (this.browserErrors == null) {
      this.browserErrors = new ArrayList<>();
    }
    this.browserErrors.add(browserErrorsItem);
    this.unparsed |= browserErrorsItem.unparsed;
    return this;
  }

  /**
   * Browser errors captured during the step.
   *
   * @return browserErrors
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_BROWSER_ERRORS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<SyntheticsTestResultBrowserError> getBrowserErrors() {
    return browserErrors;
  }

  public void setBrowserErrors(List<SyntheticsTestResultBrowserError> browserErrors) {
    this.browserErrors = browserErrors;
  }

  public SyntheticsTestResultStep bucketKeys(SyntheticsTestResultBucketKeys bucketKeys) {
    this.bucketKeys = bucketKeys;
    this.unparsed |= bucketKeys.unparsed;
    return this;
  }

  /**
   * Storage bucket keys for artifacts produced during a step or test.
   *
   * @return bucketKeys
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_BUCKET_KEYS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public SyntheticsTestResultBucketKeys getBucketKeys() {
    return bucketKeys;
  }

  public void setBucketKeys(SyntheticsTestResultBucketKeys bucketKeys) {
    this.bucketKeys = bucketKeys;
  }

  public SyntheticsTestResultStep cdnResources(List<SyntheticsTestResultCdnResource> cdnResources) {
    this.cdnResources = cdnResources;
    for (SyntheticsTestResultCdnResource item : cdnResources) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }

  public SyntheticsTestResultStep addCdnResourcesItem(
      SyntheticsTestResultCdnResource cdnResourcesItem) {
    if (this.cdnResources == null) {
      this.cdnResources = new ArrayList<>();
    }
    this.cdnResources.add(cdnResourcesItem);
    this.unparsed |= cdnResourcesItem.unparsed;
    return this;
  }

  /**
   * CDN resources encountered during the step.
   *
   * @return cdnResources
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CDN_RESOURCES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<SyntheticsTestResultCdnResource> getCdnResources() {
    return cdnResources;
  }

  public void setCdnResources(List<SyntheticsTestResultCdnResource> cdnResources) {
    this.cdnResources = cdnResources;
  }

  public SyntheticsTestResultStep clickType(String clickType) {
    this.clickType = clickType;
    return this;
  }

  /**
   * Click type performed in a browser step.
   *
   * @return clickType
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CLICK_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getClickType() {
    return clickType;
  }

  public void setClickType(String clickType) {
    this.clickType = clickType;
  }

  public SyntheticsTestResultStep compressedJsonDescriptor(String compressedJsonDescriptor) {
    this.compressedJsonDescriptor = compressedJsonDescriptor;
    return this;
  }

  /**
   * Compressed JSON descriptor for the step (internal format).
   *
   * @return compressedJsonDescriptor
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_COMPRESSED_JSON_DESCRIPTOR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getCompressedJsonDescriptor() {
    return compressedJsonDescriptor;
  }

  public void setCompressedJsonDescriptor(String compressedJsonDescriptor) {
    this.compressedJsonDescriptor = compressedJsonDescriptor;
  }

  public SyntheticsTestResultStep config(Map<String, Object> config) {
    this.config = config;
    return this;
  }

  public SyntheticsTestResultStep putConfigItem(String key, Object configItem) {
    if (this.config == null) {
      this.config = new HashMap<>();
    }
    this.config.put(key, configItem);
    return this;
  }

  /**
   * Request configuration executed by this step (API test steps).
   *
   * @return config
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CONFIG)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Map<String, Object> getConfig() {
    return config;
  }

  public void setConfig(Map<String, Object> config) {
    this.config = config;
  }

  public SyntheticsTestResultStep description(String description) {
    this.description = description;
    return this;
  }

  /**
   * Human-readable description of the step.
   *
   * @return description
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DESCRIPTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public SyntheticsTestResultStep duration(Double duration) {
    this.duration = duration;
    return this;
  }

  /**
   * Duration of the step in milliseconds.
   *
   * @return duration
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DURATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getDuration() {
    return duration;
  }

  public void setDuration(Double duration) {
    this.duration = duration;
  }

  public SyntheticsTestResultStep elementDescription(String elementDescription) {
    this.elementDescription = elementDescription;
    return this;
  }

  /**
   * Description of the element interacted with by the step.
   *
   * @return elementDescription
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ELEMENT_DESCRIPTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getElementDescription() {
    return elementDescription;
  }

  public void setElementDescription(String elementDescription) {
    this.elementDescription = elementDescription;
  }

  public SyntheticsTestResultStep elementUpdates(
      SyntheticsTestResultStepElementUpdates elementUpdates) {
    this.elementUpdates = elementUpdates;
    this.unparsed |= elementUpdates.unparsed;
    return this;
  }

  /**
   * Element locator updates produced during a step.
   *
   * @return elementUpdates
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ELEMENT_UPDATES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public SyntheticsTestResultStepElementUpdates getElementUpdates() {
    return elementUpdates;
  }

  public void setElementUpdates(SyntheticsTestResultStepElementUpdates elementUpdates) {
    this.elementUpdates = elementUpdates;
  }

  public SyntheticsTestResultStep extractedValue(SyntheticsTestResultVariable extractedValue) {
    this.extractedValue = extractedValue;
    this.unparsed |= extractedValue.unparsed;
    return this;
  }

  /**
   * A variable used or extracted during a test.
   *
   * @return extractedValue
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_EXTRACTED_VALUE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public SyntheticsTestResultVariable getExtractedValue() {
    return extractedValue;
  }

  public void setExtractedValue(SyntheticsTestResultVariable extractedValue) {
    this.extractedValue = extractedValue;
  }

  public SyntheticsTestResultStep failure(SyntheticsTestResultFailure failure) {
    this.failure = failure;
    this.unparsed |= failure.unparsed;
    return this;
  }

  /**
   * Details about the failure of a Synthetic test.
   *
   * @return failure
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_FAILURE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public SyntheticsTestResultFailure getFailure() {
    return failure;
  }

  public void setFailure(SyntheticsTestResultFailure failure) {
    this.failure = failure;
  }

  public SyntheticsTestResultStep httpResults(
      List<SyntheticsTestResultAssertionResult> httpResults) {
    this.httpResults = httpResults;
    for (SyntheticsTestResultAssertionResult item : httpResults) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }

  public SyntheticsTestResultStep addHttpResultsItem(
      SyntheticsTestResultAssertionResult httpResultsItem) {
    if (this.httpResults == null) {
      this.httpResults = new ArrayList<>();
    }
    this.httpResults.add(httpResultsItem);
    this.unparsed |= httpResultsItem.unparsed;
    return this;
  }

  /**
   * HTTP results produced by an MCP step.
   *
   * @return httpResults
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_HTTP_RESULTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<SyntheticsTestResultAssertionResult> getHttpResults() {
    return httpResults;
  }

  public void setHttpResults(List<SyntheticsTestResultAssertionResult> httpResults) {
    this.httpResults = httpResults;
  }

  public SyntheticsTestResultStep id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Identifier of the step.
   *
   * @return id
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public SyntheticsTestResultStep isCritical(Boolean isCritical) {
    this.isCritical = isCritical;
    return this;
  }

  /**
   * Whether this step is critical for the test outcome.
   *
   * @return isCritical
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_IS_CRITICAL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getIsCritical() {
    return isCritical;
  }

  public void setIsCritical(Boolean isCritical) {
    this.isCritical = isCritical;
  }

  public SyntheticsTestResultStep javascriptCustomAssertionCode(
      Boolean javascriptCustomAssertionCode) {
    this.javascriptCustomAssertionCode = javascriptCustomAssertionCode;
    return this;
  }

  /**
   * Whether the step uses a custom JavaScript assertion.
   *
   * @return javascriptCustomAssertionCode
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_JAVASCRIPT_CUSTOM_ASSERTION_CODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getJavascriptCustomAssertionCode() {
    return javascriptCustomAssertionCode;
  }

  public void setJavascriptCustomAssertionCode(Boolean javascriptCustomAssertionCode) {
    this.javascriptCustomAssertionCode = javascriptCustomAssertionCode;
  }

  public SyntheticsTestResultStep locateElementDuration(Double locateElementDuration) {
    this.locateElementDuration = locateElementDuration;
    return this;
  }

  /**
   * Time taken to locate the element in milliseconds.
   *
   * @return locateElementDuration
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LOCATE_ELEMENT_DURATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getLocateElementDuration() {
    return locateElementDuration;
  }

  public void setLocateElementDuration(Double locateElementDuration) {
    this.locateElementDuration = locateElementDuration;
  }

  public SyntheticsTestResultStep name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Name of the step.
   *
   * @return name
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public SyntheticsTestResultStep request(SyntheticsTestResultRequestInfo request) {
    this.request = request;
    this.unparsed |= request.unparsed;
    return this;
  }

  /**
   * Details of the outgoing request made during the test execution.
   *
   * @return request
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_REQUEST)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public SyntheticsTestResultRequestInfo getRequest() {
    return request;
  }

  public void setRequest(SyntheticsTestResultRequestInfo request) {
    this.request = request;
  }

  public SyntheticsTestResultStep response(SyntheticsTestResultResponseInfo response) {
    this.response = response;
    this.unparsed |= response.unparsed;
    return this;
  }

  /**
   * Details of the response received during the test execution.
   *
   * @return response
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_RESPONSE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public SyntheticsTestResultResponseInfo getResponse() {
    return response;
  }

  public void setResponse(SyntheticsTestResultResponseInfo response) {
    this.response = response;
  }

  public SyntheticsTestResultStep retries(List<SyntheticsTestResultStep> retries) {
    this.retries = retries;
    for (SyntheticsTestResultStep item : retries) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }

  public SyntheticsTestResultStep addRetriesItem(SyntheticsTestResultStep retriesItem) {
    if (this.retries == null) {
      this.retries = new ArrayList<>();
    }
    this.retries.add(retriesItem);
    this.unparsed |= retriesItem.unparsed;
    return this;
  }

  /**
   * Retry results for the step.
   *
   * @return retries
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_RETRIES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<SyntheticsTestResultStep> getRetries() {
    return retries;
  }

  public void setRetries(List<SyntheticsTestResultStep> retries) {
    this.retries = retries;
  }

  public SyntheticsTestResultStep retryCount(Long retryCount) {
    this.retryCount = retryCount;
    return this;
  }

  /**
   * Number of times this step was retried.
   *
   * @return retryCount
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_RETRY_COUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getRetryCount() {
    return retryCount;
  }

  public void setRetryCount(Long retryCount) {
    this.retryCount = retryCount;
  }

  public SyntheticsTestResultStep rumContext(SyntheticsTestResultRumContext rumContext) {
    this.rumContext = rumContext;
    this.unparsed |= rumContext.unparsed;
    return this;
  }

  /**
   * RUM application context associated with a step or sub-test.
   *
   * @return rumContext
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_RUM_CONTEXT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public SyntheticsTestResultRumContext getRumContext() {
    return rumContext;
  }

  public void setRumContext(SyntheticsTestResultRumContext rumContext) {
    this.rumContext = rumContext;
  }

  public SyntheticsTestResultStep startedAt(Long startedAt) {
    this.startedAt = startedAt;
    return this;
  }

  /**
   * Unix timestamp (ms) of when the step started.
   *
   * @return startedAt
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_STARTED_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getStartedAt() {
    return startedAt;
  }

  public void setStartedAt(Long startedAt) {
    this.startedAt = startedAt;
  }

  public SyntheticsTestResultStep status(String status) {
    this.status = status;
    return this;
  }

  /**
   * Status of the step (for example, <code>passed</code>, <code>failed</code>).
   *
   * @return status
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public SyntheticsTestResultStep subStep(SyntheticsTestResultSubStep subStep) {
    this.subStep = subStep;
    this.unparsed |= subStep.unparsed;
    return this;
  }

  /**
   * Information about a sub-step in a nested test execution.
   *
   * @return subStep
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SUB_STEP)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public SyntheticsTestResultSubStep getSubStep() {
    return subStep;
  }

  public void setSubStep(SyntheticsTestResultSubStep subStep) {
    this.subStep = subStep;
  }

  public SyntheticsTestResultStep subTest(SyntheticsTestResultSubTest subTest) {
    this.subTest = subTest;
    this.unparsed |= subTest.unparsed;
    return this;
  }

  /**
   * Information about a sub-test played from a parent browser test.
   *
   * @return subTest
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SUB_TEST)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public SyntheticsTestResultSubTest getSubTest() {
    return subTest;
  }

  public void setSubTest(SyntheticsTestResultSubTest subTest) {
    this.subTest = subTest;
  }

  public SyntheticsTestResultStep subtype(String subtype) {
    this.subtype = subtype;
    return this;
  }

  /**
   * Subtype of the step.
   *
   * @return subtype
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SUBTYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getSubtype() {
    return subtype;
  }

  public void setSubtype(String subtype) {
    this.subtype = subtype;
  }

  public SyntheticsTestResultStep tabs(List<SyntheticsTestResultTab> tabs) {
    this.tabs = tabs;
    for (SyntheticsTestResultTab item : tabs) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }

  public SyntheticsTestResultStep addTabsItem(SyntheticsTestResultTab tabsItem) {
    if (this.tabs == null) {
      this.tabs = new ArrayList<>();
    }
    this.tabs.add(tabsItem);
    this.unparsed |= tabsItem.unparsed;
    return this;
  }

  /**
   * Browser tabs involved in the step.
   *
   * @return tabs
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TABS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<SyntheticsTestResultTab> getTabs() {
    return tabs;
  }

  public void setTabs(List<SyntheticsTestResultTab> tabs) {
    this.tabs = tabs;
  }

  public SyntheticsTestResultStep timings(Map<String, Object> timings) {
    this.timings = timings;
    return this;
  }

  public SyntheticsTestResultStep putTimingsItem(String key, Object timingsItem) {
    if (this.timings == null) {
      this.timings = new HashMap<>();
    }
    this.timings.put(key, timingsItem);
    return this;
  }

  /**
   * Timing breakdown of the step execution.
   *
   * @return timings
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TIMINGS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Map<String, Object> getTimings() {
    return timings;
  }

  public void setTimings(Map<String, Object> timings) {
    this.timings = timings;
  }

  public SyntheticsTestResultStep tunnel(Boolean tunnel) {
    this.tunnel = tunnel;
    return this;
  }

  /**
   * Whether the step was executed through a Synthetics tunnel.
   *
   * @return tunnel
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TUNNEL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getTunnel() {
    return tunnel;
  }

  public void setTunnel(Boolean tunnel) {
    this.tunnel = tunnel;
  }

  public SyntheticsTestResultStep type(String type) {
    this.type = type;
    return this;
  }

  /**
   * Type of the step (for example, <code>click</code>, <code>assertElementContent</code>, <code>
   * runApiTest</code>).
   *
   * @return type
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public SyntheticsTestResultStep url(String url) {
    this.url = url;
    return this;
  }

  /**
   * URL associated with the step (for navigation steps).
   *
   * @return url
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }

  public SyntheticsTestResultStep value(Object value) {
    this.value = value;
    return this;
  }

  /**
   * Step value. Its type depends on the step type.
   *
   * @return value
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_VALUE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Object getValue() {
    return value;
  }

  public void setValue(Object value) {
    this.value = value;
  }

  public SyntheticsTestResultStep variables(SyntheticsTestResultVariables variables) {
    this.variables = variables;
    this.unparsed |= variables.unparsed;
    return this;
  }

  /**
   * Variables captured during a test step.
   *
   * @return variables
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_VARIABLES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public SyntheticsTestResultVariables getVariables() {
    return variables;
  }

  public void setVariables(SyntheticsTestResultVariables variables) {
    this.variables = variables;
  }

  public SyntheticsTestResultStep vitalsMetrics(
      List<SyntheticsTestResultVitalsMetrics> vitalsMetrics) {
    this.vitalsMetrics = vitalsMetrics;
    for (SyntheticsTestResultVitalsMetrics item : vitalsMetrics) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }

  public SyntheticsTestResultStep addVitalsMetricsItem(
      SyntheticsTestResultVitalsMetrics vitalsMetricsItem) {
    if (this.vitalsMetrics == null) {
      this.vitalsMetrics = new ArrayList<>();
    }
    this.vitalsMetrics.add(vitalsMetricsItem);
    this.unparsed |= vitalsMetricsItem.unparsed;
    return this;
  }

  /**
   * Web vitals metrics captured during the step.
   *
   * @return vitalsMetrics
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_VITALS_METRICS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<SyntheticsTestResultVitalsMetrics> getVitalsMetrics() {
    return vitalsMetrics;
  }

  public void setVitalsMetrics(List<SyntheticsTestResultVitalsMetrics> vitalsMetrics) {
    this.vitalsMetrics = vitalsMetrics;
  }

  public SyntheticsTestResultStep warnings(List<SyntheticsTestResultWarning> warnings) {
    this.warnings = warnings;
    for (SyntheticsTestResultWarning item : warnings) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }

  public SyntheticsTestResultStep addWarningsItem(SyntheticsTestResultWarning warningsItem) {
    if (this.warnings == null) {
      this.warnings = new ArrayList<>();
    }
    this.warnings.add(warningsItem);
    this.unparsed |= warningsItem.unparsed;
    return this;
  }

  /**
   * Warnings emitted during the step.
   *
   * @return warnings
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_WARNINGS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<SyntheticsTestResultWarning> getWarnings() {
    return warnings;
  }

  public void setWarnings(List<SyntheticsTestResultWarning> warnings) {
    this.warnings = warnings;
  }

  /**
   * A container for additional, undeclared properties. This is a holder for any undeclared
   * properties as specified with the 'additionalProperties' keyword in the OAS document.
   */
  private Map<String, Object> additionalProperties;

  /**
   * Set the additional (undeclared) property with the specified name and value. If the property
   * does not already exist, create it otherwise replace it.
   *
   * @param key The arbitrary key to set
   * @param value The associated value
   * @return SyntheticsTestResultStep
   */
  @JsonAnySetter
  public SyntheticsTestResultStep putAdditionalProperty(String key, Object value) {
    if (this.additionalProperties == null) {
      this.additionalProperties = new HashMap<String, Object>();
    }
    this.additionalProperties.put(key, value);
    return this;
  }

  /**
   * Return the additional (undeclared) property.
   *
   * @return The additional properties
   */
  @JsonAnyGetter
  public Map<String, Object> getAdditionalProperties() {
    return additionalProperties;
  }

  /**
   * Return the additional (undeclared) property with the specified name.
   *
   * @param key The arbitrary key to get
   * @return The specific additional property for the given key
   */
  public Object getAdditionalProperty(String key) {
    if (this.additionalProperties == null) {
      return null;
    }
    return this.additionalProperties.get(key);
  }

  /** Return true if this SyntheticsTestResultStep object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SyntheticsTestResultStep syntheticsTestResultStep = (SyntheticsTestResultStep) o;
    return Objects.equals(this.allowFailure, syntheticsTestResultStep.allowFailure)
        && Objects.equals(this.apiTest, syntheticsTestResultStep.apiTest)
        && Objects.equals(this.assertionResult, syntheticsTestResultStep.assertionResult)
        && Objects.equals(this.assertions, syntheticsTestResultStep.assertions)
        && Objects.equals(this.blockedRequestsUrls, syntheticsTestResultStep.blockedRequestsUrls)
        && Objects.equals(this.bounds, syntheticsTestResultStep.bounds)
        && Objects.equals(this.browserErrors, syntheticsTestResultStep.browserErrors)
        && Objects.equals(this.bucketKeys, syntheticsTestResultStep.bucketKeys)
        && Objects.equals(this.cdnResources, syntheticsTestResultStep.cdnResources)
        && Objects.equals(this.clickType, syntheticsTestResultStep.clickType)
        && Objects.equals(
            this.compressedJsonDescriptor, syntheticsTestResultStep.compressedJsonDescriptor)
        && Objects.equals(this.config, syntheticsTestResultStep.config)
        && Objects.equals(this.description, syntheticsTestResultStep.description)
        && Objects.equals(this.duration, syntheticsTestResultStep.duration)
        && Objects.equals(this.elementDescription, syntheticsTestResultStep.elementDescription)
        && Objects.equals(this.elementUpdates, syntheticsTestResultStep.elementUpdates)
        && Objects.equals(this.extractedValue, syntheticsTestResultStep.extractedValue)
        && Objects.equals(this.failure, syntheticsTestResultStep.failure)
        && Objects.equals(this.httpResults, syntheticsTestResultStep.httpResults)
        && Objects.equals(this.id, syntheticsTestResultStep.id)
        && Objects.equals(this.isCritical, syntheticsTestResultStep.isCritical)
        && Objects.equals(
            this.javascriptCustomAssertionCode,
            syntheticsTestResultStep.javascriptCustomAssertionCode)
        && Objects.equals(
            this.locateElementDuration, syntheticsTestResultStep.locateElementDuration)
        && Objects.equals(this.name, syntheticsTestResultStep.name)
        && Objects.equals(this.request, syntheticsTestResultStep.request)
        && Objects.equals(this.response, syntheticsTestResultStep.response)
        && Objects.equals(this.retries, syntheticsTestResultStep.retries)
        && Objects.equals(this.retryCount, syntheticsTestResultStep.retryCount)
        && Objects.equals(this.rumContext, syntheticsTestResultStep.rumContext)
        && Objects.equals(this.startedAt, syntheticsTestResultStep.startedAt)
        && Objects.equals(this.status, syntheticsTestResultStep.status)
        && Objects.equals(this.subStep, syntheticsTestResultStep.subStep)
        && Objects.equals(this.subTest, syntheticsTestResultStep.subTest)
        && Objects.equals(this.subtype, syntheticsTestResultStep.subtype)
        && Objects.equals(this.tabs, syntheticsTestResultStep.tabs)
        && Objects.equals(this.timings, syntheticsTestResultStep.timings)
        && Objects.equals(this.tunnel, syntheticsTestResultStep.tunnel)
        && Objects.equals(this.type, syntheticsTestResultStep.type)
        && Objects.equals(this.url, syntheticsTestResultStep.url)
        && Objects.equals(this.value, syntheticsTestResultStep.value)
        && Objects.equals(this.variables, syntheticsTestResultStep.variables)
        && Objects.equals(this.vitalsMetrics, syntheticsTestResultStep.vitalsMetrics)
        && Objects.equals(this.warnings, syntheticsTestResultStep.warnings)
        && Objects.equals(this.additionalProperties, syntheticsTestResultStep.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        allowFailure,
        apiTest,
        assertionResult,
        assertions,
        blockedRequestsUrls,
        bounds,
        browserErrors,
        bucketKeys,
        cdnResources,
        clickType,
        compressedJsonDescriptor,
        config,
        description,
        duration,
        elementDescription,
        elementUpdates,
        extractedValue,
        failure,
        httpResults,
        id,
        isCritical,
        javascriptCustomAssertionCode,
        locateElementDuration,
        name,
        request,
        response,
        retries,
        retryCount,
        rumContext,
        startedAt,
        status,
        subStep,
        subTest,
        subtype,
        tabs,
        timings,
        tunnel,
        type,
        url,
        value,
        variables,
        vitalsMetrics,
        warnings,
        additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SyntheticsTestResultStep {\n");
    sb.append("    allowFailure: ").append(toIndentedString(allowFailure)).append("\n");
    sb.append("    apiTest: ").append(toIndentedString(apiTest)).append("\n");
    sb.append("    assertionResult: ").append(toIndentedString(assertionResult)).append("\n");
    sb.append("    assertions: ").append(toIndentedString(assertions)).append("\n");
    sb.append("    blockedRequestsUrls: ")
        .append(toIndentedString(blockedRequestsUrls))
        .append("\n");
    sb.append("    bounds: ").append(toIndentedString(bounds)).append("\n");
    sb.append("    browserErrors: ").append(toIndentedString(browserErrors)).append("\n");
    sb.append("    bucketKeys: ").append(toIndentedString(bucketKeys)).append("\n");
    sb.append("    cdnResources: ").append(toIndentedString(cdnResources)).append("\n");
    sb.append("    clickType: ").append(toIndentedString(clickType)).append("\n");
    sb.append("    compressedJsonDescriptor: ")
        .append(toIndentedString(compressedJsonDescriptor))
        .append("\n");
    sb.append("    config: ").append(toIndentedString(config)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    duration: ").append(toIndentedString(duration)).append("\n");
    sb.append("    elementDescription: ").append(toIndentedString(elementDescription)).append("\n");
    sb.append("    elementUpdates: ").append(toIndentedString(elementUpdates)).append("\n");
    sb.append("    extractedValue: ").append(toIndentedString(extractedValue)).append("\n");
    sb.append("    failure: ").append(toIndentedString(failure)).append("\n");
    sb.append("    httpResults: ").append(toIndentedString(httpResults)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    isCritical: ").append(toIndentedString(isCritical)).append("\n");
    sb.append("    javascriptCustomAssertionCode: ")
        .append(toIndentedString(javascriptCustomAssertionCode))
        .append("\n");
    sb.append("    locateElementDuration: ")
        .append(toIndentedString(locateElementDuration))
        .append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    request: ").append(toIndentedString(request)).append("\n");
    sb.append("    response: ").append(toIndentedString(response)).append("\n");
    sb.append("    retries: ").append(toIndentedString(retries)).append("\n");
    sb.append("    retryCount: ").append(toIndentedString(retryCount)).append("\n");
    sb.append("    rumContext: ").append(toIndentedString(rumContext)).append("\n");
    sb.append("    startedAt: ").append(toIndentedString(startedAt)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    subStep: ").append(toIndentedString(subStep)).append("\n");
    sb.append("    subTest: ").append(toIndentedString(subTest)).append("\n");
    sb.append("    subtype: ").append(toIndentedString(subtype)).append("\n");
    sb.append("    tabs: ").append(toIndentedString(tabs)).append("\n");
    sb.append("    timings: ").append(toIndentedString(timings)).append("\n");
    sb.append("    tunnel: ").append(toIndentedString(tunnel)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("    variables: ").append(toIndentedString(variables)).append("\n");
    sb.append("    vitalsMetrics: ").append(toIndentedString(vitalsMetrics)).append("\n");
    sb.append("    warnings: ").append(toIndentedString(warnings)).append("\n");
    sb.append("    additionalProperties: ")
        .append(toIndentedString(additionalProperties))
        .append("\n");
    sb.append('}');
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
