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
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/** Attributes of the API key validation response. */
@JsonPropertyOrder({
  ValidateV2Attributes.JSON_PROPERTY_API_KEY_ID,
  ValidateV2Attributes.JSON_PROPERTY_API_KEY_SCOPES,
  ValidateV2Attributes.JSON_PROPERTY_VALID
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class ValidateV2Attributes {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_API_KEY_ID = "api_key_id";
  private String apiKeyId;

  public static final String JSON_PROPERTY_API_KEY_SCOPES = "api_key_scopes";
  private List<String> apiKeyScopes = new ArrayList<>();

  public static final String JSON_PROPERTY_VALID = "valid";
  private Boolean valid;

  public ValidateV2Attributes() {}

  @JsonCreator
  public ValidateV2Attributes(
      @JsonProperty(required = true, value = JSON_PROPERTY_API_KEY_ID) String apiKeyId,
      @JsonProperty(required = true, value = JSON_PROPERTY_API_KEY_SCOPES)
          List<String> apiKeyScopes,
      @JsonProperty(required = true, value = JSON_PROPERTY_VALID) Boolean valid) {
    this.apiKeyId = apiKeyId;
    this.apiKeyScopes = apiKeyScopes;
    this.valid = valid;
  }

  public ValidateV2Attributes apiKeyId(String apiKeyId) {
    this.apiKeyId = apiKeyId;
    return this;
  }

  /**
   * The UUID of the API key.
   *
   * @return apiKeyId
   */
  @JsonProperty(JSON_PROPERTY_API_KEY_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getApiKeyId() {
    return apiKeyId;
  }

  public void setApiKeyId(String apiKeyId) {
    this.apiKeyId = apiKeyId;
  }

  public ValidateV2Attributes apiKeyScopes(List<String> apiKeyScopes) {
    this.apiKeyScopes = apiKeyScopes;
    return this;
  }

  public ValidateV2Attributes addApiKeyScopesItem(String apiKeyScopesItem) {
    this.apiKeyScopes.add(apiKeyScopesItem);
    return this;
  }

  /**
   * List of scope names associated with the API key.
   *
   * @return apiKeyScopes
   */
  @JsonProperty(JSON_PROPERTY_API_KEY_SCOPES)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public List<String> getApiKeyScopes() {
    return apiKeyScopes;
  }

  public void setApiKeyScopes(List<String> apiKeyScopes) {
    this.apiKeyScopes = apiKeyScopes;
  }

  public ValidateV2Attributes valid(Boolean valid) {
    this.valid = valid;
    return this;
  }

  /**
   * Whether the API key is valid.
   *
   * @return valid
   */
  @JsonProperty(JSON_PROPERTY_VALID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Boolean getValid() {
    return valid;
  }

  public void setValid(Boolean valid) {
    this.valid = valid;
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
   * @return ValidateV2Attributes
   */
  @JsonAnySetter
  public ValidateV2Attributes putAdditionalProperty(String key, Object value) {
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

  /** Return true if this ValidateV2Attributes object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ValidateV2Attributes validateV2Attributes = (ValidateV2Attributes) o;
    return Objects.equals(this.apiKeyId, validateV2Attributes.apiKeyId)
        && Objects.equals(this.apiKeyScopes, validateV2Attributes.apiKeyScopes)
        && Objects.equals(this.valid, validateV2Attributes.valid)
        && Objects.equals(this.additionalProperties, validateV2Attributes.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(apiKeyId, apiKeyScopes, valid, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ValidateV2Attributes {\n");
    sb.append("    apiKeyId: ").append(toIndentedString(apiKeyId)).append("\n");
    sb.append("    apiKeyScopes: ").append(toIndentedString(apiKeyScopes)).append("\n");
    sb.append("    valid: ").append(toIndentedString(valid)).append("\n");
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
