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
   * <p>Attributes object for updating a Confluent resource.</p>
 */
@JsonPropertyOrder({
  ConfluentResourceRequestAttributes.JSON_PROPERTY_ENABLE_CUSTOM_METRICS,
  ConfluentResourceRequestAttributes.JSON_PROPERTY_RESOURCE_TYPE,
  ConfluentResourceRequestAttributes.JSON_PROPERTY_TAGS
})
@jakarta.annotation.Generated(value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class ConfluentResourceRequestAttributes {
  @JsonIgnore
  public boolean unparsed = false;
  public static final String JSON_PROPERTY_ENABLE_CUSTOM_METRICS = "enable_custom_metrics";
  private Boolean enableCustomMetrics = false;

  public static final String JSON_PROPERTY_RESOURCE_TYPE = "resource_type";
  private String resourceType;

  public static final String JSON_PROPERTY_TAGS = "tags";
  private List<String> tags = null;

  public ConfluentResourceRequestAttributes() {}

  @JsonCreator
  public ConfluentResourceRequestAttributes(
            @JsonProperty(required=true, value=JSON_PROPERTY_RESOURCE_TYPE)String resourceType) {
        this.resourceType = resourceType;
  }
  public ConfluentResourceRequestAttributes enableCustomMetrics(Boolean enableCustomMetrics) {
    this.enableCustomMetrics = enableCustomMetrics;
    return this;
  }

  /**
   * <p>Enable the <code>custom.consumer_lag_offset</code> metric, which contains extra metric tags.</p>
   * @return enableCustomMetrics
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_ENABLE_CUSTOM_METRICS)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public Boolean getEnableCustomMetrics() {
        return enableCustomMetrics;
      }
  public void setEnableCustomMetrics(Boolean enableCustomMetrics) {
    this.enableCustomMetrics = enableCustomMetrics;
  }
  public ConfluentResourceRequestAttributes resourceType(String resourceType) {
    this.resourceType = resourceType;
    return this;
  }

  /**
   * <p>The resource type of the Resource. Can be <code>kafka</code>, <code>connector</code>, <code>ksql</code>, or <code>schema_registry</code>.</p>
   * @return resourceType
  **/
      @JsonProperty(JSON_PROPERTY_RESOURCE_TYPE)
      @JsonInclude(
        value = JsonInclude.Include.ALWAYS)
      public String getResourceType() {
        return resourceType;
      }
  public void setResourceType(String resourceType) {
    this.resourceType = resourceType;
  }
  public ConfluentResourceRequestAttributes tags(List<String> tags) {
    this.tags = tags;
    return this;
  }
  public ConfluentResourceRequestAttributes addTagsItem(String tagsItem) {
    if (this.tags == null) {
      this.tags = new ArrayList<>();
    }
    this.tags.add(tagsItem);
    return this;
  }

  /**
   * <p>A list of strings representing tags. Can be a single key, or key-value pairs separated by a colon.</p>
   * @return tags
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_TAGS)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public List<String> getTags() {
        return tags;
      }
  public void setTags(List<String> tags) {
    this.tags = tags;
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
   * @return ConfluentResourceRequestAttributes
   */
  @JsonAnySetter
  public ConfluentResourceRequestAttributes putAdditionalProperty(String key, Object value) {
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
   * Return true if this ConfluentResourceRequestAttributes object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConfluentResourceRequestAttributes confluentResourceRequestAttributes = (ConfluentResourceRequestAttributes) o;
    return Objects.equals(this.enableCustomMetrics, confluentResourceRequestAttributes.enableCustomMetrics) && Objects.equals(this.resourceType, confluentResourceRequestAttributes.resourceType) && Objects.equals(this.tags, confluentResourceRequestAttributes.tags) && Objects.equals(this.additionalProperties, confluentResourceRequestAttributes.additionalProperties);
  }


  @Override
  public int hashCode() {
    return Objects.hash(enableCustomMetrics,resourceType,tags, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConfluentResourceRequestAttributes {\n");
    sb.append("    enableCustomMetrics: ").append(toIndentedString(enableCustomMetrics)).append("\n");
    sb.append("    resourceType: ").append(toIndentedString(resourceType)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
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
