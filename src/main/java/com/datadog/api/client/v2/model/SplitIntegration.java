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

/** The definition of the <code>SplitIntegration</code> object. */
@JsonPropertyOrder({
  SplitIntegration.JSON_PROPERTY_CREDENTIALS,
  SplitIntegration.JSON_PROPERTY_TYPE
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class SplitIntegration {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_CREDENTIALS = "credentials";
  private SplitCredentials credentials;

  public static final String JSON_PROPERTY_TYPE = "type";
  private SplitIntegrationType type;

  public SplitIntegration() {}

  @JsonCreator
  public SplitIntegration(
      @JsonProperty(required = true, value = JSON_PROPERTY_CREDENTIALS)
          SplitCredentials credentials,
      @JsonProperty(required = true, value = JSON_PROPERTY_TYPE) SplitIntegrationType type) {
    this.credentials = credentials;
    this.unparsed |= credentials.unparsed;
    this.type = type;
    this.unparsed |= !type.isValid();
  }

  public SplitIntegration credentials(SplitCredentials credentials) {
    this.credentials = credentials;
    this.unparsed |= credentials.unparsed;
    return this;
  }

  /**
   * The definition of the <code>SplitCredentials</code> object.
   *
   * @return credentials
   */
  @JsonProperty(JSON_PROPERTY_CREDENTIALS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public SplitCredentials getCredentials() {
    return credentials;
  }

  public void setCredentials(SplitCredentials credentials) {
    this.credentials = credentials;
  }

  public SplitIntegration type(SplitIntegrationType type) {
    this.type = type;
    this.unparsed |= !type.isValid();
    return this;
  }

  /**
   * The definition of the <code>SplitIntegrationType</code> object.
   *
   * @return type
   */
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public SplitIntegrationType getType() {
    return type;
  }

  public void setType(SplitIntegrationType type) {
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
   * @return SplitIntegration
   */
  @JsonAnySetter
  public SplitIntegration putAdditionalProperty(String key, Object value) {
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

  /** Return true if this SplitIntegration object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SplitIntegration splitIntegration = (SplitIntegration) o;
    return Objects.equals(this.credentials, splitIntegration.credentials)
        && Objects.equals(this.type, splitIntegration.type)
        && Objects.equals(this.additionalProperties, splitIntegration.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(credentials, type, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SplitIntegration {\n");
    sb.append("    credentials: ").append(toIndentedString(credentials)).append("\n");
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
