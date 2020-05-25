/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.datadog.api.v1.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.datadog.api.v1.client.model.SyntheticsErrorCode;
import com.datadog.api.v1.client.model.SyntheticsSSLCertificate;
import com.datadog.api.v1.client.model.SyntheticsTestProcessStatus;
import com.datadog.api.v1.client.model.SyntheticsTiming;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * Object containing results for your Synthetic API test.
 */
@ApiModel(description = "Object containing results for your Synthetic API test.")
@JsonPropertyOrder({
  SyntheticsAPITestResultData.JSON_PROPERTY_CERT,
  SyntheticsAPITestResultData.JSON_PROPERTY_ERROR_CODE,
  SyntheticsAPITestResultData.JSON_PROPERTY_ERROR_MESSAGE,
  SyntheticsAPITestResultData.JSON_PROPERTY_EVENT_TYPE,
  SyntheticsAPITestResultData.JSON_PROPERTY_HTTP_STATUS_CODE,
  SyntheticsAPITestResultData.JSON_PROPERTY_REQUEST_HEADERS,
  SyntheticsAPITestResultData.JSON_PROPERTY_RESPONSE_BODY,
  SyntheticsAPITestResultData.JSON_PROPERTY_RESPONSE_HEADERS,
  SyntheticsAPITestResultData.JSON_PROPERTY_RESPONSE_SIZE,
  SyntheticsAPITestResultData.JSON_PROPERTY_TIMINGS
})

public class SyntheticsAPITestResultData {
  public static final String JSON_PROPERTY_CERT = "cert";
  private SyntheticsSSLCertificate cert;

  public static final String JSON_PROPERTY_ERROR_CODE = "errorCode";
  private SyntheticsErrorCode errorCode;

  public static final String JSON_PROPERTY_ERROR_MESSAGE = "errorMessage";
  private String errorMessage;

  public static final String JSON_PROPERTY_EVENT_TYPE = "eventType";
  private SyntheticsTestProcessStatus eventType;

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
    return this;
  }

   /**
   * Get cert
   * @return cert
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_CERT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public SyntheticsSSLCertificate getCert() {
    return cert;
  }


  public void setCert(SyntheticsSSLCertificate cert) {
    this.cert = cert;
  }


  public SyntheticsAPITestResultData errorCode(SyntheticsErrorCode errorCode) {
    
    this.errorCode = errorCode;
    return this;
  }

   /**
   * Get errorCode
   * @return errorCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_ERROR_CODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public SyntheticsErrorCode getErrorCode() {
    return errorCode;
  }


  public void setErrorCode(SyntheticsErrorCode errorCode) {
    this.errorCode = errorCode;
  }


  public SyntheticsAPITestResultData errorMessage(String errorMessage) {
    
    this.errorMessage = errorMessage;
    return this;
  }

   /**
   * The API test error message.
   * @return errorMessage
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The API test error message.")
  @JsonProperty(JSON_PROPERTY_ERROR_MESSAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getErrorMessage() {
    return errorMessage;
  }


  public void setErrorMessage(String errorMessage) {
    this.errorMessage = errorMessage;
  }


  public SyntheticsAPITestResultData eventType(SyntheticsTestProcessStatus eventType) {
    
    this.eventType = eventType;
    return this;
  }

   /**
   * Get eventType
   * @return eventType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_EVENT_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public SyntheticsTestProcessStatus getEventType() {
    return eventType;
  }


  public void setEventType(SyntheticsTestProcessStatus eventType) {
    this.eventType = eventType;
  }


  public SyntheticsAPITestResultData httpStatusCode(Long httpStatusCode) {
    
    this.httpStatusCode = httpStatusCode;
    return this;
  }

   /**
   * The API test HTTP status code.
   * @return httpStatusCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The API test HTTP status code.")
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
   * @return requestHeaders
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Request header object used for the API test.")
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
   * @return responseBody
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Response body returned for the API test.")
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

  public SyntheticsAPITestResultData putResponseHeadersItem(String key, Object responseHeadersItem) {
    if (this.responseHeaders == null) {
      this.responseHeaders = new HashMap<>();
    }
    this.responseHeaders.put(key, responseHeadersItem);
    return this;
  }

   /**
   * Response headers returned for the API test.
   * @return responseHeaders
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Response headers returned for the API test.")
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
   * @return responseSize
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Global size in byte of the API test response.")
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
    return this;
  }

   /**
   * Get timings
   * @return timings
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_TIMINGS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public SyntheticsTiming getTimings() {
    return timings;
  }


  public void setTimings(SyntheticsTiming timings) {
    this.timings = timings;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SyntheticsAPITestResultData syntheticsAPITestResultData = (SyntheticsAPITestResultData) o;
    return Objects.equals(this.cert, syntheticsAPITestResultData.cert) &&
        Objects.equals(this.errorCode, syntheticsAPITestResultData.errorCode) &&
        Objects.equals(this.errorMessage, syntheticsAPITestResultData.errorMessage) &&
        Objects.equals(this.eventType, syntheticsAPITestResultData.eventType) &&
        Objects.equals(this.httpStatusCode, syntheticsAPITestResultData.httpStatusCode) &&
        Objects.equals(this.requestHeaders, syntheticsAPITestResultData.requestHeaders) &&
        Objects.equals(this.responseBody, syntheticsAPITestResultData.responseBody) &&
        Objects.equals(this.responseHeaders, syntheticsAPITestResultData.responseHeaders) &&
        Objects.equals(this.responseSize, syntheticsAPITestResultData.responseSize) &&
        Objects.equals(this.timings, syntheticsAPITestResultData.timings);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cert, errorCode, errorMessage, eventType, httpStatusCode, requestHeaders, responseBody, responseHeaders, responseSize, timings);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SyntheticsAPITestResultData {\n");
    sb.append("    cert: ").append(toIndentedString(cert)).append("\n");
    sb.append("    errorCode: ").append(toIndentedString(errorCode)).append("\n");
    sb.append("    errorMessage: ").append(toIndentedString(errorMessage)).append("\n");
    sb.append("    eventType: ").append(toIndentedString(eventType)).append("\n");
    sb.append("    httpStatusCode: ").append(toIndentedString(httpStatusCode)).append("\n");
    sb.append("    requestHeaders: ").append(toIndentedString(requestHeaders)).append("\n");
    sb.append("    responseBody: ").append(toIndentedString(responseBody)).append("\n");
    sb.append("    responseHeaders: ").append(toIndentedString(responseHeaders)).append("\n");
    sb.append("    responseSize: ").append(toIndentedString(responseSize)).append("\n");
    sb.append("    timings: ").append(toIndentedString(timings)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

