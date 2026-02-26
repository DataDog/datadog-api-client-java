/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v1.model;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/** Object containing results for your Synthetic API test. */
@JsonPropertyOrder({
  SyntheticsAPITestResultData.JSON_PROPERTY_CERT,
  SyntheticsAPITestResultData.JSON_PROPERTY_EVENT_TYPE,
  SyntheticsAPITestResultData.JSON_PROPERTY_FAILURE,
  SyntheticsAPITestResultData.JSON_PROPERTY_HTTP_STATUS_CODE,
  SyntheticsAPITestResultData.JSON_PROPERTY_REQUEST_HEADERS,
  SyntheticsAPITestResultData.JSON_PROPERTY_RESPONSE_BODY,
  SyntheticsAPITestResultData.JSON_PROPERTY_RESPONSE_HEADERS,
  SyntheticsAPITestResultData.JSON_PROPERTY_RESPONSE_SIZE,
  SyntheticsAPITestResultData.JSON_PROPERTY_TIMINGS
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class SyntheticsAPITestResultData {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_CERT = "cert";
  private SyntheticsSSLCertificate cert;

  public static final String JSON_PROPERTY_EVENT_TYPE = "eventType";
  private SyntheticsTestProcessStatus eventType;

  public static final String JSON_PROPERTY_FAILURE = "failure";
  private SyntheticsApiTestResultFailure failure;

  public static final String JSON_PROPERTY_HTTP_STATUS_CODE = "httpStatusCode";
  private Long httpStatusCode;

  public static final String JSON_PROPERTY_REQUEST_HEADERS = "requestHeaders";
  private Map<String, Object> requestHeaders = null;

  public static final String JSON_PROPERTY_RESPONSE_BODY = "responseBody";
  private String responseBody;

  public static final String JSON_PROPERTY_RESPONSE_HEADERS = "responseHeaders";
  private Map<String, Object> responseHeaders = null;

  public static final String JSON_PROPERTY_RESPONSE_SIZE = "responseSize";
  private Long responseSize;

  public static final String JSON_PROPERTY_TIMINGS = "timings";
  private SyntheticsTiming timings;

  public SyntheticsAPITestResultData cert(SyntheticsSSLCertificate cert) {
    this.cert = cert;
    this.unparsed |= cert.unparsed;
    return this;
  }

  /**
   * Object describing the SSL certificate used for a Synthetic test.
   *
   * @return cert
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CERT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public SyntheticsSSLCertificate getCert() {
    return cert;
  }

  public void setCert(SyntheticsSSLCertificate cert) {
    this.cert = cert;
  }

  public SyntheticsAPITestResultData eventType(SyntheticsTestProcessStatus eventType) {
    this.eventType = eventType;
    this.unparsed |= !eventType.isValid();
    return this;
  }

  /**
   * Status of a Synthetic test.
   *
   * @return eventType
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_EVENT_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public SyntheticsTestProcessStatus getEventType() {
    return eventType;
  }

  public void setEventType(SyntheticsTestProcessStatus eventType) {
    if (!eventType.isValid()) {
      this.unparsed = true;
    }
    this.eventType = eventType;
  }

  public SyntheticsAPITestResultData failure(SyntheticsApiTestResultFailure failure) {
    this.failure = failure;
    this.unparsed |= failure.unparsed;
    return this;
  }

  /**
   * The API test failure details.
   *
   * @return failure
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_FAILURE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public SyntheticsApiTestResultFailure getFailure() {
    return failure;
  }

  public void setFailure(SyntheticsApiTestResultFailure failure) {
    this.failure = failure;
  }

  public SyntheticsAPITestResultData httpStatusCode(Long httpStatusCode) {
    this.httpStatusCode = httpStatusCode;
    return this;
  }

  /**
   * The API test HTTP status code.
   *
   * @return httpStatusCode
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_HTTP_STATUS_CODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getHttpStatusCode() {
    return httpStatusCode;
  }

  public void setHttpStatusCode(Long httpStatusCode) {
    this.httpStatusCode = httpStatusCode;
  }

  public SyntheticsAPITestResultData requestHeaders(Map<String, Object> requestHeaders) {
    this.requestHeaders = requestHeaders;
    return this;
  }

  public SyntheticsAPITestResultData putRequestHeadersItem(String key, Object requestHeadersItem) {
    if (this.requestHeaders == null) {
      this.requestHeaders = new HashMap<>();
    }
    this.requestHeaders.put(key, requestHeadersItem);
    return this;
  }

  /**
   * Request header object used for the API test.
   *
   * @return requestHeaders
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_REQUEST_HEADERS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Map<String, Object> getRequestHeaders() {
    return requestHeaders;
  }

  public void setRequestHeaders(Map<String, Object> requestHeaders) {
    this.requestHeaders = requestHeaders;
  }

  public SyntheticsAPITestResultData responseBody(String responseBody) {
    this.responseBody = responseBody;
    return this;
  }

  /**
   * Response body returned for the API test.
   *
   * @return responseBody
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_RESPONSE_BODY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getResponseBody() {
    return responseBody;
  }

  public void setResponseBody(String responseBody) {
    this.responseBody = responseBody;
  }

  public SyntheticsAPITestResultData responseHeaders(Map<String, Object> responseHeaders) {
    this.responseHeaders = responseHeaders;
    return this;
  }

  public SyntheticsAPITestResultData putResponseHeadersItem(
      String key, Object responseHeadersItem) {
    if (this.responseHeaders == null) {
      this.responseHeaders = new HashMap<>();
    }
    this.responseHeaders.put(key, responseHeadersItem);
    return this;
  }

  /**
   * Response headers returned for the API test.
   *
   * @return responseHeaders
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_RESPONSE_HEADERS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Map<String, Object> getResponseHeaders() {
    return responseHeaders;
  }

  public void setResponseHeaders(Map<String, Object> responseHeaders) {
    this.responseHeaders = responseHeaders;
  }

  public SyntheticsAPITestResultData responseSize(Long responseSize) {
    this.responseSize = responseSize;
    return this;
  }

  /**
   * Global size in byte of the API test response.
   *
   * @return responseSize
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_RESPONSE_SIZE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getResponseSize() {
    return responseSize;
  }

  public void setResponseSize(Long responseSize) {
    this.responseSize = responseSize;
  }

  public SyntheticsAPITestResultData timings(SyntheticsTiming timings) {
    this.timings = timings;
    this.unparsed |= timings.unparsed;
    return this;
  }

  /**
   * Object containing all metrics and their values collected for a Synthetic API test. See the <a
   * href="https://docs.datadoghq.com/synthetics/metrics/">Synthetic Monitoring Metrics
   * documentation</a>.
   *
   * @return timings
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TIMINGS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public SyntheticsTiming getTimings() {
    return timings;
  }

  public void setTimings(SyntheticsTiming timings) {
    this.timings = timings;
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
   * @return SyntheticsAPITestResultData
   */
  @JsonAnySetter
  public SyntheticsAPITestResultData putAdditionalProperty(String key, Object value) {
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

  /** Return true if this SyntheticsAPITestResultData object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SyntheticsAPITestResultData syntheticsApiTestResultData = (SyntheticsAPITestResultData) o;
    return Objects.equals(this.cert, syntheticsApiTestResultData.cert)
        && Objects.equals(this.eventType, syntheticsApiTestResultData.eventType)
        && Objects.equals(this.failure, syntheticsApiTestResultData.failure)
        && Objects.equals(this.httpStatusCode, syntheticsApiTestResultData.httpStatusCode)
        && Objects.equals(this.requestHeaders, syntheticsApiTestResultData.requestHeaders)
        && Objects.equals(this.responseBody, syntheticsApiTestResultData.responseBody)
        && Objects.equals(this.responseHeaders, syntheticsApiTestResultData.responseHeaders)
        && Objects.equals(this.responseSize, syntheticsApiTestResultData.responseSize)
        && Objects.equals(this.timings, syntheticsApiTestResultData.timings)
        && Objects.equals(
            this.additionalProperties, syntheticsApiTestResultData.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        cert,
        eventType,
        failure,
        httpStatusCode,
        requestHeaders,
        responseBody,
        responseHeaders,
        responseSize,
        timings,
        additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SyntheticsAPITestResultData {\n");
    sb.append("    cert: ").append(toIndentedString(cert)).append("\n");
    sb.append("    eventType: ").append(toIndentedString(eventType)).append("\n");
    sb.append("    failure: ").append(toIndentedString(failure)).append("\n");
    sb.append("    httpStatusCode: ").append(toIndentedString(httpStatusCode)).append("\n");
    sb.append("    requestHeaders: ").append(toIndentedString(requestHeaders)).append("\n");
    sb.append("    responseBody: ").append(toIndentedString(responseBody)).append("\n");
    sb.append("    responseHeaders: ").append(toIndentedString(responseHeaders)).append("\n");
    sb.append("    responseSize: ").append(toIndentedString(responseSize)).append("\n");
    sb.append("    timings: ").append(toIndentedString(timings)).append("\n");
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
