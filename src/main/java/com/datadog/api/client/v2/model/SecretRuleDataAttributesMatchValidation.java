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

/** */
@JsonPropertyOrder({
  SecretRuleDataAttributesMatchValidation.JSON_PROPERTY_ENDPOINT,
  SecretRuleDataAttributesMatchValidation.JSON_PROPERTY_HOSTS,
  SecretRuleDataAttributesMatchValidation.JSON_PROPERTY_HTTP_METHOD,
  SecretRuleDataAttributesMatchValidation.JSON_PROPERTY_INVALID_HTTP_STATUS_CODE,
  SecretRuleDataAttributesMatchValidation.JSON_PROPERTY_REQUEST_HEADERS,
  SecretRuleDataAttributesMatchValidation.JSON_PROPERTY_TIMEOUT_SECONDS,
  SecretRuleDataAttributesMatchValidation.JSON_PROPERTY_TYPE,
  SecretRuleDataAttributesMatchValidation.JSON_PROPERTY_VALID_HTTP_STATUS_CODE
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class SecretRuleDataAttributesMatchValidation {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_ENDPOINT = "endpoint";
  private String endpoint;

  public static final String JSON_PROPERTY_HOSTS = "hosts";
  private List<String> hosts = null;

  public static final String JSON_PROPERTY_HTTP_METHOD = "http_method";
  private String httpMethod;

  public static final String JSON_PROPERTY_INVALID_HTTP_STATUS_CODE = "invalid_http_status_code";
  private List<SecretRuleDataAttributesMatchValidationInvalidHttpStatusCodeItems>
      invalidHttpStatusCode = null;

  public static final String JSON_PROPERTY_REQUEST_HEADERS = "request_headers";
  private Map<String, String> requestHeaders = null;

  public static final String JSON_PROPERTY_TIMEOUT_SECONDS = "timeout_seconds";
  private Long timeoutSeconds;

  public static final String JSON_PROPERTY_TYPE = "type";
  private String type;

  public static final String JSON_PROPERTY_VALID_HTTP_STATUS_CODE = "valid_http_status_code";
  private List<SecretRuleDataAttributesMatchValidationValidHttpStatusCodeItems>
      validHttpStatusCode = null;

  public SecretRuleDataAttributesMatchValidation endpoint(String endpoint) {
    this.endpoint = endpoint;
    return this;
  }

  /**
   * Getendpoint
   *
   * @return endpoint
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ENDPOINT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getEndpoint() {
    return endpoint;
  }

  public void setEndpoint(String endpoint) {
    this.endpoint = endpoint;
  }

  public SecretRuleDataAttributesMatchValidation hosts(List<String> hosts) {
    this.hosts = hosts;
    return this;
  }

  public SecretRuleDataAttributesMatchValidation addHostsItem(String hostsItem) {
    if (this.hosts == null) {
      this.hosts = new ArrayList<>();
    }
    this.hosts.add(hostsItem);
    return this;
  }

  /**
   * Gethosts
   *
   * @return hosts
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_HOSTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<String> getHosts() {
    return hosts;
  }

  public void setHosts(List<String> hosts) {
    this.hosts = hosts;
  }

  public SecretRuleDataAttributesMatchValidation httpMethod(String httpMethod) {
    this.httpMethod = httpMethod;
    return this;
  }

  /**
   * GethttpMethod
   *
   * @return httpMethod
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_HTTP_METHOD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getHttpMethod() {
    return httpMethod;
  }

  public void setHttpMethod(String httpMethod) {
    this.httpMethod = httpMethod;
  }

  public SecretRuleDataAttributesMatchValidation invalidHttpStatusCode(
      List<SecretRuleDataAttributesMatchValidationInvalidHttpStatusCodeItems>
          invalidHttpStatusCode) {
    this.invalidHttpStatusCode = invalidHttpStatusCode;
    for (SecretRuleDataAttributesMatchValidationInvalidHttpStatusCodeItems item :
        invalidHttpStatusCode) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }

  public SecretRuleDataAttributesMatchValidation addInvalidHttpStatusCodeItem(
      SecretRuleDataAttributesMatchValidationInvalidHttpStatusCodeItems invalidHttpStatusCodeItem) {
    if (this.invalidHttpStatusCode == null) {
      this.invalidHttpStatusCode = new ArrayList<>();
    }
    this.invalidHttpStatusCode.add(invalidHttpStatusCodeItem);
    this.unparsed |= invalidHttpStatusCodeItem.unparsed;
    return this;
  }

  /**
   * GetinvalidHttpStatusCode
   *
   * @return invalidHttpStatusCode
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_INVALID_HTTP_STATUS_CODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<SecretRuleDataAttributesMatchValidationInvalidHttpStatusCodeItems>
      getInvalidHttpStatusCode() {
    return invalidHttpStatusCode;
  }

  public void setInvalidHttpStatusCode(
      List<SecretRuleDataAttributesMatchValidationInvalidHttpStatusCodeItems>
          invalidHttpStatusCode) {
    this.invalidHttpStatusCode = invalidHttpStatusCode;
  }

  public SecretRuleDataAttributesMatchValidation requestHeaders(
      Map<String, String> requestHeaders) {
    this.requestHeaders = requestHeaders;
    return this;
  }

  public SecretRuleDataAttributesMatchValidation putRequestHeadersItem(
      String key, String requestHeadersItem) {
    if (this.requestHeaders == null) {
      this.requestHeaders = new HashMap<>();
    }
    this.requestHeaders.put(key, requestHeadersItem);
    return this;
  }

  /**
   * GetrequestHeaders
   *
   * @return requestHeaders
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_REQUEST_HEADERS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Map<String, String> getRequestHeaders() {
    return requestHeaders;
  }

  public void setRequestHeaders(Map<String, String> requestHeaders) {
    this.requestHeaders = requestHeaders;
  }

  public SecretRuleDataAttributesMatchValidation timeoutSeconds(Long timeoutSeconds) {
    this.timeoutSeconds = timeoutSeconds;
    return this;
  }

  /**
   * GettimeoutSeconds minimum: 0 maximum: 1.8446744073709552e+19
   *
   * @return timeoutSeconds
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TIMEOUT_SECONDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getTimeoutSeconds() {
    return timeoutSeconds;
  }

  public void setTimeoutSeconds(Long timeoutSeconds) {
    this.timeoutSeconds = timeoutSeconds;
  }

  public SecretRuleDataAttributesMatchValidation type(String type) {
    this.type = type;
    return this;
  }

  /**
   * Gettype
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

  public SecretRuleDataAttributesMatchValidation validHttpStatusCode(
      List<SecretRuleDataAttributesMatchValidationValidHttpStatusCodeItems> validHttpStatusCode) {
    this.validHttpStatusCode = validHttpStatusCode;
    for (SecretRuleDataAttributesMatchValidationValidHttpStatusCodeItems item :
        validHttpStatusCode) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }

  public SecretRuleDataAttributesMatchValidation addValidHttpStatusCodeItem(
      SecretRuleDataAttributesMatchValidationValidHttpStatusCodeItems validHttpStatusCodeItem) {
    if (this.validHttpStatusCode == null) {
      this.validHttpStatusCode = new ArrayList<>();
    }
    this.validHttpStatusCode.add(validHttpStatusCodeItem);
    this.unparsed |= validHttpStatusCodeItem.unparsed;
    return this;
  }

  /**
   * GetvalidHttpStatusCode
   *
   * @return validHttpStatusCode
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_VALID_HTTP_STATUS_CODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<SecretRuleDataAttributesMatchValidationValidHttpStatusCodeItems>
      getValidHttpStatusCode() {
    return validHttpStatusCode;
  }

  public void setValidHttpStatusCode(
      List<SecretRuleDataAttributesMatchValidationValidHttpStatusCodeItems> validHttpStatusCode) {
    this.validHttpStatusCode = validHttpStatusCode;
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
   * @return SecretRuleDataAttributesMatchValidation
   */
  @JsonAnySetter
  public SecretRuleDataAttributesMatchValidation putAdditionalProperty(String key, Object value) {
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

  /** Return true if this SecretRuleDataAttributesMatchValidation object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SecretRuleDataAttributesMatchValidation secretRuleDataAttributesMatchValidation =
        (SecretRuleDataAttributesMatchValidation) o;
    return Objects.equals(this.endpoint, secretRuleDataAttributesMatchValidation.endpoint)
        && Objects.equals(this.hosts, secretRuleDataAttributesMatchValidation.hosts)
        && Objects.equals(this.httpMethod, secretRuleDataAttributesMatchValidation.httpMethod)
        && Objects.equals(
            this.invalidHttpStatusCode,
            secretRuleDataAttributesMatchValidation.invalidHttpStatusCode)
        && Objects.equals(
            this.requestHeaders, secretRuleDataAttributesMatchValidation.requestHeaders)
        && Objects.equals(
            this.timeoutSeconds, secretRuleDataAttributesMatchValidation.timeoutSeconds)
        && Objects.equals(this.type, secretRuleDataAttributesMatchValidation.type)
        && Objects.equals(
            this.validHttpStatusCode, secretRuleDataAttributesMatchValidation.validHttpStatusCode)
        && Objects.equals(
            this.additionalProperties,
            secretRuleDataAttributesMatchValidation.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        endpoint,
        hosts,
        httpMethod,
        invalidHttpStatusCode,
        requestHeaders,
        timeoutSeconds,
        type,
        validHttpStatusCode,
        additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SecretRuleDataAttributesMatchValidation {\n");
    sb.append("    endpoint: ").append(toIndentedString(endpoint)).append("\n");
    sb.append("    hosts: ").append(toIndentedString(hosts)).append("\n");
    sb.append("    httpMethod: ").append(toIndentedString(httpMethod)).append("\n");
    sb.append("    invalidHttpStatusCode: ")
        .append(toIndentedString(invalidHttpStatusCode))
        .append("\n");
    sb.append("    requestHeaders: ").append(toIndentedString(requestHeaders)).append("\n");
    sb.append("    timeoutSeconds: ").append(toIndentedString(timeoutSeconds)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    validHttpStatusCode: ")
        .append(toIndentedString(validHttpStatusCode))
        .append("\n");
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
