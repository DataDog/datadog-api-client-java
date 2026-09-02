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
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/** A browser error captured during a browser test step. */
@JsonPropertyOrder({
  SyntheticsTestResultBrowserError.JSON_PROPERTY_DESCRIPTION,
  SyntheticsTestResultBrowserError.JSON_PROPERTY_METHOD,
  SyntheticsTestResultBrowserError.JSON_PROPERTY_NAME,
  SyntheticsTestResultBrowserError.JSON_PROPERTY_STATUS,
  SyntheticsTestResultBrowserError.JSON_PROPERTY_TYPE,
  SyntheticsTestResultBrowserError.JSON_PROPERTY_URL
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class SyntheticsTestResultBrowserError {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_DESCRIPTION = "description";
  private String description;

  public static final String JSON_PROPERTY_METHOD = "method";
  private String method;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_STATUS = "status";
  private Long status;

  public static final String JSON_PROPERTY_TYPE = "type";
  private String type;

  public static final String JSON_PROPERTY_URL = "url";
  private Map<String, Object> url = null;

  public SyntheticsTestResultBrowserError description(String description) {
    this.description = description;
    return this;
  }

  /**
   * Error description.
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

  public SyntheticsTestResultBrowserError method(String method) {
    this.method = method;
    return this;
  }

  /**
   * HTTP method associated with the error (for network errors).
   *
   * @return method
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_METHOD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getMethod() {
    return method;
  }

  public void setMethod(String method) {
    this.method = method;
  }

  public SyntheticsTestResultBrowserError name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Error name.
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

  public SyntheticsTestResultBrowserError status(Long status) {
    this.status = status;
    return this;
  }

  /**
   * HTTP status code associated with the error (for network errors).
   *
   * @return status
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getStatus() {
    return status;
  }

  public void setStatus(Long status) {
    this.status = status;
  }

  public SyntheticsTestResultBrowserError type(String type) {
    this.type = type;
    return this;
  }

  /**
   * Type of the browser error.
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

  public SyntheticsTestResultBrowserError url(Map<String, Object> url) {
    this.url = url;
    return this;
  }

  public SyntheticsTestResultBrowserError putUrlItem(String key, Object urlItem) {
    if (this.url == null) {
      this.url = new HashMap<>();
    }
    this.url.put(key, urlItem);
    return this;
  }

  /**
   * URL associated with the error.
   *
   * @return url
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Map<String, Object> getUrl() {
    return url;
  }

  public void setUrl(Map<String, Object> url) {
    this.url = url;
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
   * @return SyntheticsTestResultBrowserError
   */
  @JsonAnySetter
  public SyntheticsTestResultBrowserError putAdditionalProperty(String key, Object value) {
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

  /** Return true if this SyntheticsTestResultBrowserError object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SyntheticsTestResultBrowserError syntheticsTestResultBrowserError =
        (SyntheticsTestResultBrowserError) o;
    return Objects.equals(this.description, syntheticsTestResultBrowserError.description)
        && Objects.equals(this.method, syntheticsTestResultBrowserError.method)
        && Objects.equals(this.name, syntheticsTestResultBrowserError.name)
        && Objects.equals(this.status, syntheticsTestResultBrowserError.status)
        && Objects.equals(this.type, syntheticsTestResultBrowserError.type)
        && Objects.equals(this.url, syntheticsTestResultBrowserError.url)
        && Objects.equals(
            this.additionalProperties, syntheticsTestResultBrowserError.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, method, name, status, type, url, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SyntheticsTestResultBrowserError {\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    method: ").append(toIndentedString(method)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
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
