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
   * <p>The definition of the <code>FreshserviceAPIKey</code> object.</p>
 */
@JsonPropertyOrder({
  FreshserviceAPIKey.JSON_PROPERTY_API_KEY,
  FreshserviceAPIKey.JSON_PROPERTY_DOMAIN,
  FreshserviceAPIKey.JSON_PROPERTY_TYPE
})
@jakarta.annotation.Generated(value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class FreshserviceAPIKey {
  @JsonIgnore
  public boolean unparsed = false;
  public static final String JSON_PROPERTY_API_KEY = "api_key";
  private String apiKey;

  public static final String JSON_PROPERTY_DOMAIN = "domain";
  private String domain;

  public static final String JSON_PROPERTY_TYPE = "type";
  private FreshserviceAPIKeyType type;

  public FreshserviceAPIKey() {}

  @JsonCreator
  public FreshserviceAPIKey(
            @JsonProperty(required=true, value=JSON_PROPERTY_API_KEY)String apiKey,
            @JsonProperty(required=true, value=JSON_PROPERTY_DOMAIN)String domain,
            @JsonProperty(required=true, value=JSON_PROPERTY_TYPE)FreshserviceAPIKeyType type) {
        this.apiKey = apiKey;
        this.domain = domain;
        this.type = type;
        this.unparsed |= !type.isValid();
  }
  public FreshserviceAPIKey apiKey(String apiKey) {
    this.apiKey = apiKey;
    return this;
  }

  /**
   * <p>The <code>FreshserviceAPIKey</code> <code>api_key</code>.</p>
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
  public FreshserviceAPIKey domain(String domain) {
    this.domain = domain;
    return this;
  }

  /**
   * <p>The <code>FreshserviceAPIKey</code> <code>domain</code>.</p>
   * @return domain
  **/
      @JsonProperty(JSON_PROPERTY_DOMAIN)
      @JsonInclude(
        value = JsonInclude.Include.ALWAYS)
      public String getDomain() {
        return domain;
      }
  public void setDomain(String domain) {
    this.domain = domain;
  }
  public FreshserviceAPIKey type(FreshserviceAPIKeyType type) {
    this.type = type;
    this.unparsed |= !type.isValid();
    return this;
  }

  /**
   * <p>The definition of the <code>FreshserviceAPIKey</code> object.</p>
   * @return type
  **/
      @JsonProperty(JSON_PROPERTY_TYPE)
      @JsonInclude(
        value = JsonInclude.Include.ALWAYS)
      public FreshserviceAPIKeyType getType() {
        return type;
      }
  public void setType(FreshserviceAPIKeyType type) {
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
   * @return FreshserviceAPIKey
   */
  @JsonAnySetter
  public FreshserviceAPIKey putAdditionalProperty(String key, Object value) {
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
   * Return true if this FreshserviceAPIKey object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FreshserviceAPIKey freshserviceApiKey = (FreshserviceAPIKey) o;
    return Objects.equals(this.apiKey, freshserviceApiKey.apiKey) && Objects.equals(this.domain, freshserviceApiKey.domain) && Objects.equals(this.type, freshserviceApiKey.type) && Objects.equals(this.additionalProperties, freshserviceApiKey.additionalProperties);
  }


  @Override
  public int hashCode() {
    return Objects.hash(apiKey,domain,type, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FreshserviceAPIKey {\n");
    sb.append("    apiKey: ").append(toIndentedString(apiKey)).append("\n");
    sb.append("    domain: ").append(toIndentedString(domain)).append("\n");
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
