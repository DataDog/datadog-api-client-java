/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v2.model;

import java.io.File;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;
import java.util.HashMap;
import java.util.Map;
import java.util.List;
import java.util.ArrayList;
import java.util.UUID;
import java.time.OffsetDateTime;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import org.openapitools.jackson.nullable.JsonNullable;

import com.datadog.api.client.JsonTimeSerializer;


/**
   * <p>The definition of the <code>ConfigCatSDKKey</code> object.</p>
 */
@JsonPropertyOrder({
  ConfigCatSDKKeyUpdate.JSON_PROPERTY_API_PASSWORD,
  ConfigCatSDKKeyUpdate.JSON_PROPERTY_API_USERNAME,
  ConfigCatSDKKeyUpdate.JSON_PROPERTY_SDK_KEY,
  ConfigCatSDKKeyUpdate.JSON_PROPERTY_TYPE
})
@jakarta.annotation.Generated(value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class ConfigCatSDKKeyUpdate {
  @JsonIgnore
  public boolean unparsed = false;
  public static final String JSON_PROPERTY_API_PASSWORD = "api_password";
  private String apiPassword;

  public static final String JSON_PROPERTY_API_USERNAME = "api_username";
  private String apiUsername;

  public static final String JSON_PROPERTY_SDK_KEY = "sdk_key";
  private String sdkKey;

  public static final String JSON_PROPERTY_TYPE = "type";
  private ConfigCatSDKKeyType type;

  public ConfigCatSDKKeyUpdate() {}

  @JsonCreator
  public ConfigCatSDKKeyUpdate(
            @JsonProperty(required=true, value=JSON_PROPERTY_TYPE)ConfigCatSDKKeyType type) {
        this.type = type;
        this.unparsed |= !type.isValid();
  }
  public ConfigCatSDKKeyUpdate apiPassword(String apiPassword) {
    this.apiPassword = apiPassword;
    return this;
  }

  /**
   * <p>The <code>ConfigCatSDKKeyUpdate</code> <code>api_password</code>.</p>
   * @return apiPassword
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_API_PASSWORD)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public String getApiPassword() {
        return apiPassword;
      }
  public void setApiPassword(String apiPassword) {
    this.apiPassword = apiPassword;
  }
  public ConfigCatSDKKeyUpdate apiUsername(String apiUsername) {
    this.apiUsername = apiUsername;
    return this;
  }

  /**
   * <p>The <code>ConfigCatSDKKeyUpdate</code> <code>api_username</code>.</p>
   * @return apiUsername
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_API_USERNAME)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public String getApiUsername() {
        return apiUsername;
      }
  public void setApiUsername(String apiUsername) {
    this.apiUsername = apiUsername;
  }
  public ConfigCatSDKKeyUpdate sdkKey(String sdkKey) {
    this.sdkKey = sdkKey;
    return this;
  }

  /**
   * <p>The <code>ConfigCatSDKKeyUpdate</code> <code>sdk_key</code>.</p>
   * @return sdkKey
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_SDK_KEY)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public String getSdkKey() {
        return sdkKey;
      }
  public void setSdkKey(String sdkKey) {
    this.sdkKey = sdkKey;
  }
  public ConfigCatSDKKeyUpdate type(ConfigCatSDKKeyType type) {
    this.type = type;
    this.unparsed |= !type.isValid();
    return this;
  }

  /**
   * <p>The definition of the <code>ConfigCatSDKKey</code> object.</p>
   * @return type
  **/
      @JsonProperty(JSON_PROPERTY_TYPE)
      @JsonInclude(
        value = JsonInclude.Include.ALWAYS)
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
   * A container for additional, undeclared properties.
   * This is a holder for any undeclared properties as specified with
   * the 'additionalProperties' keyword in the OAS document.
   */
  private Map<String, Object> additionalProperties;

  /**
   * Set the additional (undeclared) property with the specified name and value.
   * If the property does not already exist, create it otherwise replace it.
   *
   * @param key The arbitrary key to set
   * @param value The associated value
   * @return ConfigCatSDKKeyUpdate
   */
  @JsonAnySetter
  public ConfigCatSDKKeyUpdate putAdditionalProperty(String key, Object value) {
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

  /**
   * Return true if this ConfigCatSDKKeyUpdate object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConfigCatSDKKeyUpdate configCatSdkKeyUpdate = (ConfigCatSDKKeyUpdate) o;
    return Objects.equals(this.apiPassword, configCatSdkKeyUpdate.apiPassword) && Objects.equals(this.apiUsername, configCatSdkKeyUpdate.apiUsername) && Objects.equals(this.sdkKey, configCatSdkKeyUpdate.sdkKey) && Objects.equals(this.type, configCatSdkKeyUpdate.type) && Objects.equals(this.additionalProperties, configCatSdkKeyUpdate.additionalProperties);
  }


  @Override
  public int hashCode() {
    return Objects.hash(apiPassword,apiUsername,sdkKey,type, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConfigCatSDKKeyUpdate {\n");
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
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
