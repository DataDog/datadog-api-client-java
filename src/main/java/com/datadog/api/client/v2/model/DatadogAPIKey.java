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
   * <p>The definition of the <code>DatadogAPIKey</code> object.</p>
 */
@JsonPropertyOrder({
  DatadogAPIKey.JSON_PROPERTY_API_KEY,
  DatadogAPIKey.JSON_PROPERTY_APP_KEY,
  DatadogAPIKey.JSON_PROPERTY_DATACENTER,
  DatadogAPIKey.JSON_PROPERTY_SUBDOMAIN,
  DatadogAPIKey.JSON_PROPERTY_TYPE
})
@jakarta.annotation.Generated(value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class DatadogAPIKey {
  @JsonIgnore
  public boolean unparsed = false;
  public static final String JSON_PROPERTY_API_KEY = "api_key";
  private String apiKey;

  public static final String JSON_PROPERTY_APP_KEY = "app_key";
  private String appKey;

  public static final String JSON_PROPERTY_DATACENTER = "datacenter";
  private String datacenter;

  public static final String JSON_PROPERTY_SUBDOMAIN = "subdomain";
  private String subdomain;

  public static final String JSON_PROPERTY_TYPE = "type";
  private DatadogAPIKeyType type;

  public DatadogAPIKey() {}

  @JsonCreator
  public DatadogAPIKey(
            @JsonProperty(required=true, value=JSON_PROPERTY_API_KEY)String apiKey,
            @JsonProperty(required=true, value=JSON_PROPERTY_APP_KEY)String appKey,
            @JsonProperty(required=true, value=JSON_PROPERTY_DATACENTER)String datacenter,
            @JsonProperty(required=true, value=JSON_PROPERTY_TYPE)DatadogAPIKeyType type) {
        this.apiKey = apiKey;
        this.appKey = appKey;
        this.datacenter = datacenter;
        this.type = type;
        this.unparsed |= !type.isValid();
  }
  public DatadogAPIKey apiKey(String apiKey) {
    this.apiKey = apiKey;
    return this;
  }

  /**
   * <p>The <code>DatadogAPIKey</code> <code>api_key</code>.</p>
   * @return apiKey
  **/
      @JsonProperty(JSON_PROPERTY_API_KEY)
      @JsonInclude(
        value = JsonInclude.Include.ALWAYS)
      public String getApiKey() {
        return apiKey;
      }
  public void setApiKey(String apiKey) {
    this.apiKey = apiKey;
  }
  public DatadogAPIKey appKey(String appKey) {
    this.appKey = appKey;
    return this;
  }

  /**
   * <p>The <code>DatadogAPIKey</code> <code>app_key</code>.</p>
   * @return appKey
  **/
      @JsonProperty(JSON_PROPERTY_APP_KEY)
      @JsonInclude(
        value = JsonInclude.Include.ALWAYS)
      public String getAppKey() {
        return appKey;
      }
  public void setAppKey(String appKey) {
    this.appKey = appKey;
  }
  public DatadogAPIKey datacenter(String datacenter) {
    this.datacenter = datacenter;
    return this;
  }

  /**
   * <p>The <code>DatadogAPIKey</code> <code>datacenter</code>.</p>
   * @return datacenter
  **/
      @JsonProperty(JSON_PROPERTY_DATACENTER)
      @JsonInclude(
        value = JsonInclude.Include.ALWAYS)
      public String getDatacenter() {
        return datacenter;
      }
  public void setDatacenter(String datacenter) {
    this.datacenter = datacenter;
  }
  public DatadogAPIKey subdomain(String subdomain) {
    this.subdomain = subdomain;
    return this;
  }

  /**
   * <p>Custom subdomain used for Datadog URLs generated with this Connection. For example, if this org uses <code>https://acme.datadoghq.com</code> to access Datadog, set this field to <code>acme</code>. If this field is omitted, generated URLs will use the default site URL for its datacenter (see <a href="https://docs.datadoghq.com/getting_started/site">https://docs.datadoghq.com/getting_started/site</a>).</p>
   * @return subdomain
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_SUBDOMAIN)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public String getSubdomain() {
        return subdomain;
      }
  public void setSubdomain(String subdomain) {
    this.subdomain = subdomain;
  }
  public DatadogAPIKey type(DatadogAPIKeyType type) {
    this.type = type;
    this.unparsed |= !type.isValid();
    return this;
  }

  /**
   * <p>The definition of the <code>DatadogAPIKey</code> object.</p>
   * @return type
  **/
      @JsonProperty(JSON_PROPERTY_TYPE)
      @JsonInclude(
        value = JsonInclude.Include.ALWAYS)
      public DatadogAPIKeyType getType() {
        return type;
      }
  public void setType(DatadogAPIKeyType type) {
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
   * @return DatadogAPIKey
   */
  @JsonAnySetter
  public DatadogAPIKey putAdditionalProperty(String key, Object value) {
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
   * Return true if this DatadogAPIKey object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DatadogAPIKey datadogApiKey = (DatadogAPIKey) o;
    return Objects.equals(this.apiKey, datadogApiKey.apiKey) && Objects.equals(this.appKey, datadogApiKey.appKey) && Objects.equals(this.datacenter, datadogApiKey.datacenter) && Objects.equals(this.subdomain, datadogApiKey.subdomain) && Objects.equals(this.type, datadogApiKey.type) && Objects.equals(this.additionalProperties, datadogApiKey.additionalProperties);
  }


  @Override
  public int hashCode() {
    return Objects.hash(apiKey,appKey,datacenter,subdomain,type, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DatadogAPIKey {\n");
    sb.append("    apiKey: ").append(toIndentedString(apiKey)).append("\n");
    sb.append("    appKey: ").append(toIndentedString(appKey)).append("\n");
    sb.append("    datacenter: ").append(toIndentedString(datacenter)).append("\n");
    sb.append("    subdomain: ").append(toIndentedString(subdomain)).append("\n");
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
