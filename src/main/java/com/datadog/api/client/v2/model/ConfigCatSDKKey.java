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

/** The definition of the <code>ConfigCatSDKKey</code> object. */
@JsonPropertyOrder({
  ConfigCatSDKKey.JSON_PROPERTY_API_PASSWORD,
  ConfigCatSDKKey.JSON_PROPERTY_API_USERNAME,
  ConfigCatSDKKey.JSON_PROPERTY_SDK_KEY,
  ConfigCatSDKKey.JSON_PROPERTY_TYPE
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class ConfigCatSDKKey {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_API_PASSWORD = "api_password";
  private String apiPassword;

  public static final String JSON_PROPERTY_API_USERNAME = "api_username";
  private String apiUsername;

  public static final String JSON_PROPERTY_SDK_KEY = "sdk_key";
  private String sdkKey;

  public static final String JSON_PROPERTY_TYPE = "type";
  private ConfigCatSDKKeyType type;

  public ConfigCatSDKKey() {}

  @JsonCreator
  public ConfigCatSDKKey(
      @JsonProperty(required = true, value = JSON_PROPERTY_API_PASSWORD) String apiPassword,
      @JsonProperty(required = true, value = JSON_PROPERTY_API_USERNAME) String apiUsername,
      @JsonProperty(required = true, value = JSON_PROPERTY_SDK_KEY) String sdkKey,
      @JsonProperty(required = true, value = JSON_PROPERTY_TYPE) ConfigCatSDKKeyType type) {
    this.apiPassword = apiPassword;
    this.apiUsername = apiUsername;
    this.sdkKey = sdkKey;
    this.type = type;
    this.unparsed |= !type.isValid();
  }

  public ConfigCatSDKKey apiPassword(String apiPassword) {
    this.apiPassword = apiPassword;
    return this;
  }

  /**
   * The <code>ConfigCatSDKKey</code> <code>api_password</code>.
   *
   * @return apiPassword
   */
  @JsonProperty(JSON_PROPERTY_API_PASSWORD)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getApiPassword() {
    return apiPassword;
  }

  public void setApiPassword(String apiPassword) {
    this.apiPassword = apiPassword;
  }

  public ConfigCatSDKKey apiUsername(String apiUsername) {
    this.apiUsername = apiUsername;
    return this;
  }

  /**
   * The <code>ConfigCatSDKKey</code> <code>api_username</code>.
   *
   * @return apiUsername
   */
  @JsonProperty(JSON_PROPERTY_API_USERNAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getApiUsername() {
    return apiUsername;
  }

  public void setApiUsername(String apiUsername) {
    this.apiUsername = apiUsername;
  }

  public ConfigCatSDKKey sdkKey(String sdkKey) {
    this.sdkKey = sdkKey;
    return this;
  }

  /**
   * The <code>ConfigCatSDKKey</code> <code>sdk_key</code>.
   *
   * @return sdkKey
   */
  @JsonProperty(JSON_PROPERTY_SDK_KEY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getSdkKey() {
    return sdkKey;
  }

  public void setSdkKey(String sdkKey) {
    this.sdkKey = sdkKey;
  }

  public ConfigCatSDKKey type(ConfigCatSDKKeyType type) {
    this.type = type;
    this.unparsed |= !type.isValid();
    return this;
  }

  /**
   * The definition of the <code>ConfigCatSDKKey</code> object.
   *
   * @return type
   */
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public ConfigCatSDKKeyType getType() {
    return type;
  }

  public void setType(ConfigCatSDKKeyType type) {
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
   * @return ConfigCatSDKKey
   */
  @JsonAnySetter
  public ConfigCatSDKKey putAdditionalProperty(String key, Object value) {
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

  /** Return true if this ConfigCatSDKKey object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConfigCatSDKKey configCatSdkKey = (ConfigCatSDKKey) o;
    return Objects.equals(this.apiPassword, configCatSdkKey.apiPassword)
        && Objects.equals(this.apiUsername, configCatSdkKey.apiUsername)
        && Objects.equals(this.sdkKey, configCatSdkKey.sdkKey)
        && Objects.equals(this.type, configCatSdkKey.type)
        && Objects.equals(this.additionalProperties, configCatSdkKey.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(apiPassword, apiUsername, sdkKey, type, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConfigCatSDKKey {\n");
    sb.append("    apiPassword: ").append(toIndentedString(apiPassword)).append("\n");
    sb.append("    apiUsername: ").append(toIndentedString(apiUsername)).append("\n");
    sb.append("    sdkKey: ").append(toIndentedString(sdkKey)).append("\n");
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
