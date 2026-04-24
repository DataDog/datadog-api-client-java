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

/** Handshake request and response for protocol-level tests. */
@JsonPropertyOrder({
  SyntheticsTestResultHandshake.JSON_PROPERTY_REQUEST,
  SyntheticsTestResultHandshake.JSON_PROPERTY_RESPONSE
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class SyntheticsTestResultHandshake {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_REQUEST = "request";
  private SyntheticsTestResultRequestInfo request;

  public static final String JSON_PROPERTY_RESPONSE = "response";
  private SyntheticsTestResultResponseInfo response;

  public SyntheticsTestResultHandshake request(SyntheticsTestResultRequestInfo request) {
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

  public SyntheticsTestResultHandshake response(SyntheticsTestResultResponseInfo response) {
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
   * @return SyntheticsTestResultHandshake
   */
  @JsonAnySetter
  public SyntheticsTestResultHandshake putAdditionalProperty(String key, Object value) {
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

  /** Return true if this SyntheticsTestResultHandshake object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SyntheticsTestResultHandshake syntheticsTestResultHandshake = (SyntheticsTestResultHandshake) o;
    return Objects.equals(this.request, syntheticsTestResultHandshake.request)
        && Objects.equals(this.response, syntheticsTestResultHandshake.response)
        && Objects.equals(
            this.additionalProperties, syntheticsTestResultHandshake.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(request, response, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SyntheticsTestResultHandshake {\n");
    sb.append("    request: ").append(toIndentedString(request)).append("\n");
    sb.append("    response: ").append(toIndentedString(response)).append("\n");
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
