/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v1.model;

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
   * <p>Custom variable for Webhook integration.</p>
 */
@JsonPropertyOrder({
  WebhooksIntegrationCustomVariableResponse.JSON_PROPERTY_IS_SECRET,
  WebhooksIntegrationCustomVariableResponse.JSON_PROPERTY_NAME,
  WebhooksIntegrationCustomVariableResponse.JSON_PROPERTY_VALUE
})
@jakarta.annotation.Generated(value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class WebhooksIntegrationCustomVariableResponse {
  @JsonIgnore
  public boolean unparsed = false;
  public static final String JSON_PROPERTY_IS_SECRET = "is_secret";
  private Boolean isSecret;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_VALUE = "value";
  private String value;

  public WebhooksIntegrationCustomVariableResponse() {}

  @JsonCreator
  public WebhooksIntegrationCustomVariableResponse(
            @JsonProperty(required=true, value=JSON_PROPERTY_IS_SECRET)Boolean isSecret,
            @JsonProperty(required=true, value=JSON_PROPERTY_NAME)String name) {
        this.isSecret = isSecret;
        this.name = name;
  }
  public WebhooksIntegrationCustomVariableResponse isSecret(Boolean isSecret) {
    this.isSecret = isSecret;
    return this;
  }

  /**
   * <p>Make custom variable is secret or not.
   * If the custom variable is secret, the value is not returned in the response payload.</p>
   * @return isSecret
  **/
      @JsonProperty(JSON_PROPERTY_IS_SECRET)
      @JsonInclude(
        value = JsonInclude.Include.ALWAYS)
      public Boolean getIsSecret() {
        return isSecret;
      }
  public void setIsSecret(Boolean isSecret) {
    this.isSecret = isSecret;
  }
  public WebhooksIntegrationCustomVariableResponse name(String name) {
    this.name = name;
    return this;
  }

  /**
   * <p>The name of the variable. It corresponds with <code>&lt;CUSTOM_VARIABLE_NAME&gt;</code>. It must only contains upper-case characters, integers or underscores.</p>
   * @return name
  **/
      @JsonProperty(JSON_PROPERTY_NAME)
      @JsonInclude(
        value = JsonInclude.Include.ALWAYS)
      public String getName() {
        return name;
      }
  public void setName(String name) {
    this.name = name;
  }
  public WebhooksIntegrationCustomVariableResponse value(String value) {
    this.value = value;
    return this;
  }

  /**
   * <p>Value of the custom variable. It won't be returned if the variable is secret.</p>
   * @return value
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_VALUE)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public String getValue() {
        return value;
      }
  public void setValue(String value) {
    this.value = value;
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
   * @return WebhooksIntegrationCustomVariableResponse
   */
  @JsonAnySetter
  public WebhooksIntegrationCustomVariableResponse putAdditionalProperty(String key, Object value) {
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
   * Return true if this WebhooksIntegrationCustomVariableResponse object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WebhooksIntegrationCustomVariableResponse webhooksIntegrationCustomVariableResponse = (WebhooksIntegrationCustomVariableResponse) o;
    return Objects.equals(this.isSecret, webhooksIntegrationCustomVariableResponse.isSecret) && Objects.equals(this.name, webhooksIntegrationCustomVariableResponse.name) && Objects.equals(this.value, webhooksIntegrationCustomVariableResponse.value) && Objects.equals(this.additionalProperties, webhooksIntegrationCustomVariableResponse.additionalProperties);
  }


  @Override
  public int hashCode() {
    return Objects.hash(isSecret,name,value, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WebhooksIntegrationCustomVariableResponse {\n");
    sb.append("    isSecret: ").append(toIndentedString(isSecret)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
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
