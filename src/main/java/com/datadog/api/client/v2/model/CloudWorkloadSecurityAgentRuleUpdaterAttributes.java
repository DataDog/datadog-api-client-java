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
   * <p>The attributes of the user who last updated the Agent rule</p>
 */
@JsonPropertyOrder({
  CloudWorkloadSecurityAgentRuleUpdaterAttributes.JSON_PROPERTY_HANDLE,
  CloudWorkloadSecurityAgentRuleUpdaterAttributes.JSON_PROPERTY_NAME
})
@jakarta.annotation.Generated(value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class CloudWorkloadSecurityAgentRuleUpdaterAttributes {
  @JsonIgnore
  public boolean unparsed = false;
  public static final String JSON_PROPERTY_HANDLE = "handle";
  private String handle;

  public static final String JSON_PROPERTY_NAME = "name";
  private JsonNullable<String> name = JsonNullable.<String>undefined();

  public CloudWorkloadSecurityAgentRuleUpdaterAttributes handle(String handle) {
    this.handle = handle;
    return this;
  }

  /**
   * <p>The handle of the user</p>
   * @return handle
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_HANDLE)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public String getHandle() {
        return handle;
      }
  public void setHandle(String handle) {
    this.handle = handle;
  }
  public CloudWorkloadSecurityAgentRuleUpdaterAttributes name(String name) {
    this.name = JsonNullable.<String>of(name);
    return this;
  }

  /**
   * <p>The name of the user</p>
   * @return name
  **/
      @jakarta.annotation.Nullable
      @JsonIgnore
      public String getName() {
        return name.orElse(null);
      }
  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(
    value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<String> getName_JsonNullable() {
    return name;
  }
  @JsonProperty(JSON_PROPERTY_NAME)public void setName_JsonNullable(JsonNullable<String> name) {
    this.name = name;
  }
  public void setName(String name) {
    this.name = JsonNullable.<String>of(name);
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
   * @return CloudWorkloadSecurityAgentRuleUpdaterAttributes
   */
  @JsonAnySetter
  public CloudWorkloadSecurityAgentRuleUpdaterAttributes putAdditionalProperty(String key, Object value) {
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
   * Return true if this CloudWorkloadSecurityAgentRuleUpdaterAttributes object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CloudWorkloadSecurityAgentRuleUpdaterAttributes cloudWorkloadSecurityAgentRuleUpdaterAttributes = (CloudWorkloadSecurityAgentRuleUpdaterAttributes) o;
    return Objects.equals(this.handle, cloudWorkloadSecurityAgentRuleUpdaterAttributes.handle) && Objects.equals(this.name, cloudWorkloadSecurityAgentRuleUpdaterAttributes.name) && Objects.equals(this.additionalProperties, cloudWorkloadSecurityAgentRuleUpdaterAttributes.additionalProperties);
  }


  @Override
  public int hashCode() {
    return Objects.hash(handle,name, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CloudWorkloadSecurityAgentRuleUpdaterAttributes {\n");
    sb.append("    handle: ").append(toIndentedString(handle)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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
