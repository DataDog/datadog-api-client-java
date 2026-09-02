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

/** An accepted HEC token used to authenticate incoming Splunk HEC requests. */
@JsonPropertyOrder({
  ObservabilityPipelineSplunkHecSourceValidToken.JSON_PROPERTY_ENABLED,
  ObservabilityPipelineSplunkHecSourceValidToken.JSON_PROPERTY_FIELD_TO_ADD,
  ObservabilityPipelineSplunkHecSourceValidToken.JSON_PROPERTY_TOKEN_KEY
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class ObservabilityPipelineSplunkHecSourceValidToken {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_ENABLED = "enabled";
  private Boolean enabled = true;

  public static final String JSON_PROPERTY_FIELD_TO_ADD = "field_to_add";
  private ObservabilityPipelineSourceValidTokenFieldToAdd fieldToAdd;

  public static final String JSON_PROPERTY_TOKEN_KEY = "token_key";
  private String tokenKey;

  public ObservabilityPipelineSplunkHecSourceValidToken() {}

  @JsonCreator
  public ObservabilityPipelineSplunkHecSourceValidToken(
      @JsonProperty(required = true, value = JSON_PROPERTY_TOKEN_KEY) String tokenKey) {
    this.tokenKey = tokenKey;
  }

  public ObservabilityPipelineSplunkHecSourceValidToken enabled(Boolean enabled) {
    this.enabled = enabled;
    return this;
  }

  /**
   * Indicates whether this token is currently accepted. Disabled tokens are rejected without being
   * removed from the configuration.
   *
   * @return enabled
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ENABLED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getEnabled() {
    return enabled;
  }

  public void setEnabled(Boolean enabled) {
    this.enabled = enabled;
  }

  public ObservabilityPipelineSplunkHecSourceValidToken fieldToAdd(
      ObservabilityPipelineSourceValidTokenFieldToAdd fieldToAdd) {
    this.fieldToAdd = fieldToAdd;
    this.unparsed |= fieldToAdd.unparsed;
    return this;
  }

  /**
   * An optional metadata field that is attached to every event authenticated by the associated
   * token. Both <code>key</code> and <code>value</code> must match <code>^[A-Za-z0-9_]+$</code>.
   *
   * @return fieldToAdd
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_FIELD_TO_ADD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public ObservabilityPipelineSourceValidTokenFieldToAdd getFieldToAdd() {
    return fieldToAdd;
  }

  public void setFieldToAdd(ObservabilityPipelineSourceValidTokenFieldToAdd fieldToAdd) {
    this.fieldToAdd = fieldToAdd;
    if (fieldToAdd != null) {
      this.unparsed |= fieldToAdd.unparsed;
    }
  }

  public ObservabilityPipelineSplunkHecSourceValidToken tokenKey(String tokenKey) {
    this.tokenKey = tokenKey;
    return this;
  }

  /**
   * Name of the environment variable or secret that holds the expected HEC token value.
   *
   * @return tokenKey
   */
  @JsonProperty(JSON_PROPERTY_TOKEN_KEY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getTokenKey() {
    return tokenKey;
  }

  public void setTokenKey(String tokenKey) {
    this.tokenKey = tokenKey;
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
   * @return ObservabilityPipelineSplunkHecSourceValidToken
   */
  @JsonAnySetter
  public ObservabilityPipelineSplunkHecSourceValidToken putAdditionalProperty(
      String key, Object value) {
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

  /** Return true if this ObservabilityPipelineSplunkHecSourceValidToken object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ObservabilityPipelineSplunkHecSourceValidToken observabilityPipelineSplunkHecSourceValidToken =
        (ObservabilityPipelineSplunkHecSourceValidToken) o;
    return Objects.equals(this.enabled, observabilityPipelineSplunkHecSourceValidToken.enabled)
        && Objects.equals(
            this.fieldToAdd, observabilityPipelineSplunkHecSourceValidToken.fieldToAdd)
        && Objects.equals(this.tokenKey, observabilityPipelineSplunkHecSourceValidToken.tokenKey)
        && Objects.equals(
            this.additionalProperties,
            observabilityPipelineSplunkHecSourceValidToken.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(enabled, fieldToAdd, tokenKey, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ObservabilityPipelineSplunkHecSourceValidToken {\n");
    sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
    sb.append("    fieldToAdd: ").append(toIndentedString(fieldToAdd)).append("\n");
    sb.append("    tokenKey: ").append(toIndentedString(tokenKey)).append("\n");
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
