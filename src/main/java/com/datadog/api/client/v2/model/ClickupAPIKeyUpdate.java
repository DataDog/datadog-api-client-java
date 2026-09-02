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

/** The definition of the <code>ClickupAPIKey</code> object. */
@JsonPropertyOrder({
  ClickupAPIKeyUpdate.JSON_PROPERTY_API_TOKEN,
  ClickupAPIKeyUpdate.JSON_PROPERTY_TYPE
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class ClickupAPIKeyUpdate {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_API_TOKEN = "api_token";
  private String apiToken;

  public static final String JSON_PROPERTY_TYPE = "type";
  private ClickupAPIKeyType type;

  public ClickupAPIKeyUpdate() {}

  @JsonCreator
  public ClickupAPIKeyUpdate(
      @JsonProperty(required = true, value = JSON_PROPERTY_TYPE) ClickupAPIKeyType type) {
    this.type = type;
    this.unparsed |= !type.isValid();
  }

  public ClickupAPIKeyUpdate apiToken(String apiToken) {
    this.apiToken = apiToken;
    return this;
  }

  /**
   * The <code>ClickupAPIKeyUpdate</code> <code>api_token</code>.
   *
   * @return apiToken
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_API_TOKEN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getApiToken() {
    return apiToken;
  }

  public void setApiToken(String apiToken) {
    this.apiToken = apiToken;
  }

  public ClickupAPIKeyUpdate type(ClickupAPIKeyType type) {
    this.type = type;
    this.unparsed |= !type.isValid();
    return this;
  }

  /**
   * The definition of the <code>ClickupAPIKey</code> object.
   *
   * @return type
   */
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public ClickupAPIKeyType getType() {
    return type;
  }

  public void setType(ClickupAPIKeyType type) {
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
   * @return ClickupAPIKeyUpdate
   */
  @JsonAnySetter
  public ClickupAPIKeyUpdate putAdditionalProperty(String key, Object value) {
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

  /** Return true if this ClickupAPIKeyUpdate object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ClickupAPIKeyUpdate clickupApiKeyUpdate = (ClickupAPIKeyUpdate) o;
    return Objects.equals(this.apiToken, clickupApiKeyUpdate.apiToken)
        && Objects.equals(this.type, clickupApiKeyUpdate.type)
        && Objects.equals(this.additionalProperties, clickupApiKeyUpdate.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(apiToken, type, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ClickupAPIKeyUpdate {\n");
    sb.append("    apiToken: ").append(toIndentedString(apiToken)).append("\n");
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
