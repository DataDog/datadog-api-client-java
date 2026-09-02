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

/** Error payload returned by OAuth2 dynamic client registration as defined by RFC 7591. */
@JsonPropertyOrder({
  OAuthClientRegistrationError.JSON_PROPERTY_ERROR,
  OAuthClientRegistrationError.JSON_PROPERTY_ERROR_DESCRIPTION
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class OAuthClientRegistrationError {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_ERROR = "error";
  private String error;

  public static final String JSON_PROPERTY_ERROR_DESCRIPTION = "error_description";
  private String errorDescription;

  public OAuthClientRegistrationError() {}

  @JsonCreator
  public OAuthClientRegistrationError(
      @JsonProperty(required = true, value = JSON_PROPERTY_ERROR) String error,
      @JsonProperty(required = true, value = JSON_PROPERTY_ERROR_DESCRIPTION)
          String errorDescription) {
    this.error = error;
    this.errorDescription = errorDescription;
  }

  public OAuthClientRegistrationError error(String error) {
    this.error = error;
    return this;
  }

  /**
   * Single ASCII error code per RFC 7591, such as <code>invalid_request</code> or <code>
   * invalid_client_metadata</code>.
   *
   * @return error
   */
  @JsonProperty(JSON_PROPERTY_ERROR)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getError() {
    return error;
  }

  public void setError(String error) {
    this.error = error;
  }

  public OAuthClientRegistrationError errorDescription(String errorDescription) {
    this.errorDescription = errorDescription;
    return this;
  }

  /**
   * Human-readable description of the error.
   *
   * @return errorDescription
   */
  @JsonProperty(JSON_PROPERTY_ERROR_DESCRIPTION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getErrorDescription() {
    return errorDescription;
  }

  public void setErrorDescription(String errorDescription) {
    this.errorDescription = errorDescription;
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
   * @return OAuthClientRegistrationError
   */
  @JsonAnySetter
  public OAuthClientRegistrationError putAdditionalProperty(String key, Object value) {
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

  /** Return true if this OAuthClientRegistrationError object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OAuthClientRegistrationError oAuthClientRegistrationError = (OAuthClientRegistrationError) o;
    return Objects.equals(this.error, oAuthClientRegistrationError.error)
        && Objects.equals(this.errorDescription, oAuthClientRegistrationError.errorDescription)
        && Objects.equals(
            this.additionalProperties, oAuthClientRegistrationError.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(error, errorDescription, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OAuthClientRegistrationError {\n");
    sb.append("    error: ").append(toIndentedString(error)).append("\n");
    sb.append("    errorDescription: ").append(toIndentedString(errorDescription)).append("\n");
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
