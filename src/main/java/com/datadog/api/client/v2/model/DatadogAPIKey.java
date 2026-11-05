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

/** The definition of the <code>DatadogAPIKey</code> object. */
@JsonPropertyOrder({
  DatadogAPIKey.JSON_PROPERTY_API_KEY,
  DatadogAPIKey.JSON_PROPERTY_APP_KEY,
  DatadogAPIKey.JSON_PROPERTY_DATACENTER,
  DatadogAPIKey.JSON_PROPERTY_SUBDOMAIN,
  DatadogAPIKey.JSON_PROPERTY_TYPE
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class DatadogAPIKey {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_API_KEY = "api_key";
  private DatadogAPIKeyApiKey apiKey;

  public static final String JSON_PROPERTY_APP_KEY = "app_key";
  private DatadogAPIKeyAppKey appKey;

  public static final String JSON_PROPERTY_DATACENTER = "datacenter";
  private DatadogAPIKeyDatacenter datacenter;

  public static final String JSON_PROPERTY_SUBDOMAIN = "subdomain";
  private DatadogAPIKeySubdomain subdomain;

  public static final String JSON_PROPERTY_TYPE = "type";
  private DatadogAPIKeyType type;

  public DatadogAPIKey() {}

  @JsonCreator
  public DatadogAPIKey(
      @JsonProperty(required = true, value = JSON_PROPERTY_API_KEY) DatadogAPIKeyApiKey apiKey,
      @JsonProperty(required = true, value = JSON_PROPERTY_APP_KEY) DatadogAPIKeyAppKey appKey,
      @JsonProperty(required = true, value = JSON_PROPERTY_DATACENTER)
          DatadogAPIKeyDatacenter datacenter,
      @JsonProperty(required = true, value = JSON_PROPERTY_TYPE) DatadogAPIKeyType type) {
    this.apiKey = apiKey;
    this.unparsed |= apiKey.unparsed;
    this.appKey = appKey;
    this.unparsed |= appKey.unparsed;
    this.datacenter = datacenter;
    this.unparsed |= datacenter.unparsed;
    this.type = type;
    this.unparsed |= !type.isValid();
  }

  public DatadogAPIKey apiKey(DatadogAPIKeyApiKey apiKey) {
    this.apiKey = apiKey;
    this.unparsed |= apiKey.unparsed;
    return this;
  }

  /**
   * The <code>DatadogAPIKey</code> <code>api_key</code>.
   *
   * @return apiKey
   */
  @JsonProperty(JSON_PROPERTY_API_KEY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public DatadogAPIKeyApiKey getApiKey() {
    return apiKey;
  }

  public void setApiKey(DatadogAPIKeyApiKey apiKey) {
    this.apiKey = apiKey;
    if (apiKey != null) {
      this.unparsed |= apiKey.unparsed;
    }
  }

  public DatadogAPIKey appKey(DatadogAPIKeyAppKey appKey) {
    this.appKey = appKey;
    this.unparsed |= appKey.unparsed;
    return this;
  }

  /**
   * The <code>DatadogAPIKey</code> <code>app_key</code>.
   *
   * @return appKey
   */
  @JsonProperty(JSON_PROPERTY_APP_KEY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public DatadogAPIKeyAppKey getAppKey() {
    return appKey;
  }

  public void setAppKey(DatadogAPIKeyAppKey appKey) {
    this.appKey = appKey;
    if (appKey != null) {
      this.unparsed |= appKey.unparsed;
    }
  }

  public DatadogAPIKey datacenter(DatadogAPIKeyDatacenter datacenter) {
    this.datacenter = datacenter;
    this.unparsed |= datacenter.unparsed;
    return this;
  }

  /**
   * The <code>DatadogAPIKey</code> <code>datacenter</code>.
   *
   * @return datacenter
   */
  @JsonProperty(JSON_PROPERTY_DATACENTER)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public DatadogAPIKeyDatacenter getDatacenter() {
    return datacenter;
  }

  public void setDatacenter(DatadogAPIKeyDatacenter datacenter) {
    this.datacenter = datacenter;
    if (datacenter != null) {
      this.unparsed |= datacenter.unparsed;
    }
  }

  public DatadogAPIKey subdomain(DatadogAPIKeySubdomain subdomain) {
    this.subdomain = subdomain;
    this.unparsed |= subdomain.unparsed;
    return this;
  }

  /**
   * Custom subdomain used for Datadog URLs generated with this Connection. For example, if this org
   * uses <code>https://acme.datadoghq.com</code> to access Datadog, set this field to <code>acme
   * </code>. If this field is omitted, generated URLs will use the default site URL for its
   * datacenter (see <a
   * href="https://docs.datadoghq.com/getting_started/site">https://docs.datadoghq.com/getting_started/site</a>).
   *
   * @return subdomain
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SUBDOMAIN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public DatadogAPIKeySubdomain getSubdomain() {
    return subdomain;
  }

  public void setSubdomain(DatadogAPIKeySubdomain subdomain) {
    this.subdomain = subdomain;
    if (subdomain != null) {
      this.unparsed |= subdomain.unparsed;
    }
  }

  public DatadogAPIKey type(DatadogAPIKeyType type) {
    this.type = type;
    this.unparsed |= !type.isValid();
    return this;
  }

  /**
   * The definition of the <code>DatadogAPIKey</code> object.
   *
   * @return type
   */
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
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

  /** Return true if this DatadogAPIKey object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DatadogAPIKey datadogApiKey = (DatadogAPIKey) o;
    return Objects.equals(this.apiKey, datadogApiKey.apiKey)
        && Objects.equals(this.appKey, datadogApiKey.appKey)
        && Objects.equals(this.datacenter, datadogApiKey.datacenter)
        && Objects.equals(this.subdomain, datadogApiKey.subdomain)
        && Objects.equals(this.type, datadogApiKey.type)
        && Objects.equals(this.additionalProperties, datadogApiKey.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(apiKey, appKey, datacenter, subdomain, type, additionalProperties);
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
   * Convert the given object to string with each line indented by 4 spaces (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
