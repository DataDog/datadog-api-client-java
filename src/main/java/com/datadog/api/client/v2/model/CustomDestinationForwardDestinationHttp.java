/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v2.model;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/** The HTTP destination. */
@JsonPropertyOrder({
  CustomDestinationForwardDestinationHttp.JSON_PROPERTY_AUTH,
  CustomDestinationForwardDestinationHttp.JSON_PROPERTY_ENDPOINT,
  CustomDestinationForwardDestinationHttp.JSON_PROPERTY_TYPE
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class CustomDestinationForwardDestinationHttp {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_AUTH = "auth";
  private CustomDestinationHttpDestinationAuth auth;

  public static final String JSON_PROPERTY_ENDPOINT = "endpoint";
  private String endpoint;

  public static final String JSON_PROPERTY_TYPE = "type";
  private CustomDestinationForwardDestinationHttpType type =
      CustomDestinationForwardDestinationHttpType.HTTP;

  public CustomDestinationForwardDestinationHttp() {}

  @JsonCreator
  public CustomDestinationForwardDestinationHttp(
      @JsonProperty(required = true, value = JSON_PROPERTY_AUTH)
          CustomDestinationHttpDestinationAuth auth,
      @JsonProperty(required = true, value = JSON_PROPERTY_ENDPOINT) String endpoint,
      @JsonProperty(required = true, value = JSON_PROPERTY_TYPE)
          CustomDestinationForwardDestinationHttpType type) {
    this.auth = auth;
    this.unparsed |= auth.unparsed;
    this.endpoint = endpoint;
    this.type = type;
    this.unparsed |= !type.isValid();
  }

  public CustomDestinationForwardDestinationHttp auth(CustomDestinationHttpDestinationAuth auth) {
    this.auth = auth;
    this.unparsed |= auth.unparsed;
    return this;
  }

  /**
   * Authentication method of the HTTP requests.
   *
   * @return auth
   */
  @JsonProperty(JSON_PROPERTY_AUTH)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public CustomDestinationHttpDestinationAuth getAuth() {
    return auth;
  }

  public void setAuth(CustomDestinationHttpDestinationAuth auth) {
    this.auth = auth;
  }

  public CustomDestinationForwardDestinationHttp endpoint(String endpoint) {
    this.endpoint = endpoint;
    return this;
  }

  /**
   * The destination for which logs will be forwarded to. Must have HTTPS scheme and forwarding back
   * to Datadog is not allowed.
   *
   * @return endpoint
   */
  @JsonProperty(JSON_PROPERTY_ENDPOINT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getEndpoint() {
    return endpoint;
  }

  public void setEndpoint(String endpoint) {
    this.endpoint = endpoint;
  }

  public CustomDestinationForwardDestinationHttp type(
      CustomDestinationForwardDestinationHttpType type) {
    this.type = type;
    this.unparsed |= !type.isValid();
    return this;
  }

  /**
   * Type of the HTTP destination.
   *
   * @return type
   */
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public CustomDestinationForwardDestinationHttpType getType() {
    return type;
  }

  public void setType(CustomDestinationForwardDestinationHttpType type) {
    if (!type.isValid()) {
      this.unparsed = true;
    }
    this.type = type;
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
   * @return CustomDestinationForwardDestinationHttp
   */
  @JsonAnySetter
  public CustomDestinationForwardDestinationHttp putAdditionalProperty(String key, Object value) {
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

  /** Return true if this CustomDestinationForwardDestinationHttp object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CustomDestinationForwardDestinationHttp customDestinationForwardDestinationHttp =
        (CustomDestinationForwardDestinationHttp) o;
    return Objects.equals(this.auth, customDestinationForwardDestinationHttp.auth)
        && Objects.equals(this.endpoint, customDestinationForwardDestinationHttp.endpoint)
        && Objects.equals(this.type, customDestinationForwardDestinationHttp.type)
        && Objects.equals(
            this.additionalProperties,
            customDestinationForwardDestinationHttp.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(auth, endpoint, type, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CustomDestinationForwardDestinationHttp {\n");
    sb.append("    auth: ").append(toIndentedString(auth)).append("\n");
    sb.append("    endpoint: ").append(toIndentedString(endpoint)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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
