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
   * <p>Schema validation warnings.</p>
 */
@JsonPropertyOrder({
  ServiceDefinitionMetaWarnings.JSON_PROPERTY_INSTANCE_LOCATION,
  ServiceDefinitionMetaWarnings.JSON_PROPERTY_KEYWORD_LOCATION,
  ServiceDefinitionMetaWarnings.JSON_PROPERTY_MESSAGE
})
@jakarta.annotation.Generated(value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class ServiceDefinitionMetaWarnings {
  @JsonIgnore
  public boolean unparsed = false;
  public static final String JSON_PROPERTY_INSTANCE_LOCATION = "instance-location";
  private String instanceLocation;

  public static final String JSON_PROPERTY_KEYWORD_LOCATION = "keyword-location";
  private String keywordLocation;

  public static final String JSON_PROPERTY_MESSAGE = "message";
  private String message;

  public ServiceDefinitionMetaWarnings instanceLocation(String instanceLocation) {
    this.instanceLocation = instanceLocation;
    return this;
  }

  /**
   * <p>The warning instance location.</p>
   * @return instanceLocation
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_INSTANCE_LOCATION)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public String getInstanceLocation() {
        return instanceLocation;
      }
  public void setInstanceLocation(String instanceLocation) {
    this.instanceLocation = instanceLocation;
  }
  public ServiceDefinitionMetaWarnings keywordLocation(String keywordLocation) {
    this.keywordLocation = keywordLocation;
    return this;
  }

  /**
   * <p>The warning keyword location.</p>
   * @return keywordLocation
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_KEYWORD_LOCATION)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public String getKeywordLocation() {
        return keywordLocation;
      }
  public void setKeywordLocation(String keywordLocation) {
    this.keywordLocation = keywordLocation;
  }
  public ServiceDefinitionMetaWarnings message(String message) {
    this.message = message;
    return this;
  }

  /**
   * <p>The warning message.</p>
   * @return message
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_MESSAGE)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public String getMessage() {
        return message;
      }
  public void setMessage(String message) {
    this.message = message;
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
   * @return ServiceDefinitionMetaWarnings
   */
  @JsonAnySetter
  public ServiceDefinitionMetaWarnings putAdditionalProperty(String key, Object value) {
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
   * Return true if this ServiceDefinitionMetaWarnings object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ServiceDefinitionMetaWarnings serviceDefinitionMetaWarnings = (ServiceDefinitionMetaWarnings) o;
    return Objects.equals(this.instanceLocation, serviceDefinitionMetaWarnings.instanceLocation) && Objects.equals(this.keywordLocation, serviceDefinitionMetaWarnings.keywordLocation) && Objects.equals(this.message, serviceDefinitionMetaWarnings.message) && Objects.equals(this.additionalProperties, serviceDefinitionMetaWarnings.additionalProperties);
  }


  @Override
  public int hashCode() {
    return Objects.hash(instanceLocation,keywordLocation,message, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ServiceDefinitionMetaWarnings {\n");
    sb.append("    instanceLocation: ").append(toIndentedString(instanceLocation)).append("\n");
    sb.append("    keywordLocation: ").append(toIndentedString(keywordLocation)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
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
