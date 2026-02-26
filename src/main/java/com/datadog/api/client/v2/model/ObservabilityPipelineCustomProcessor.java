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
   * <p>The <code>custom_processor</code> processor transforms events using <a href="https://vector.dev/docs/reference/vrl/">Vector Remap Language (VRL)</a> scripts with advanced filtering capabilities.</p>
   * <p><strong>Supported pipeline types:</strong> logs</p>
 */
@JsonPropertyOrder({
  ObservabilityPipelineCustomProcessor.JSON_PROPERTY_DISPLAY_NAME,
  ObservabilityPipelineCustomProcessor.JSON_PROPERTY_ENABLED,
  ObservabilityPipelineCustomProcessor.JSON_PROPERTY_ID,
  ObservabilityPipelineCustomProcessor.JSON_PROPERTY_INCLUDE,
  ObservabilityPipelineCustomProcessor.JSON_PROPERTY_REMAPS,
  ObservabilityPipelineCustomProcessor.JSON_PROPERTY_TYPE
})
@jakarta.annotation.Generated(value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class ObservabilityPipelineCustomProcessor {
  @JsonIgnore
  public boolean unparsed = false;
  public static final String JSON_PROPERTY_DISPLAY_NAME = "display_name";
  private String displayName;

  public static final String JSON_PROPERTY_ENABLED = "enabled";
  private Boolean enabled;

  public static final String JSON_PROPERTY_ID = "id";
  private String id;

  public static final String JSON_PROPERTY_INCLUDE = "include";
  private String include = "*";

  public static final String JSON_PROPERTY_REMAPS = "remaps";
  private List<ObservabilityPipelineCustomProcessorRemap> remaps = new ArrayList<>();

  public static final String JSON_PROPERTY_TYPE = "type";
  private ObservabilityPipelineCustomProcessorType type = ObservabilityPipelineCustomProcessorType.CUSTOM_PROCESSOR;

  public ObservabilityPipelineCustomProcessor() {}

  @JsonCreator
  public ObservabilityPipelineCustomProcessor(
            @JsonProperty(required=true, value=JSON_PROPERTY_ENABLED)Boolean enabled,
            @JsonProperty(required=true, value=JSON_PROPERTY_ID)String id,
            @JsonProperty(required=true, value=JSON_PROPERTY_INCLUDE)String include,
            @JsonProperty(required=true, value=JSON_PROPERTY_REMAPS)List<ObservabilityPipelineCustomProcessorRemap> remaps,
            @JsonProperty(required=true, value=JSON_PROPERTY_TYPE)ObservabilityPipelineCustomProcessorType type) {
        this.enabled = enabled;
        this.id = id;
        this.include = include;
        this.remaps = remaps;
        this.type = type;
        this.unparsed |= !type.isValid();
  }
  public ObservabilityPipelineCustomProcessor displayName(String displayName) {
    this.displayName = displayName;
    return this;
  }

  /**
   * <p>The display name for a component.</p>
   * @return displayName
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_DISPLAY_NAME)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public String getDisplayName() {
        return displayName;
      }
  public void setDisplayName(String displayName) {
    this.displayName = displayName;
  }
  public ObservabilityPipelineCustomProcessor enabled(Boolean enabled) {
    this.enabled = enabled;
    return this;
  }

  /**
   * <p>Indicates whether the processor is enabled.</p>
   * @return enabled
  **/
      @JsonProperty(JSON_PROPERTY_ENABLED)
      @JsonInclude(
        value = JsonInclude.Include.ALWAYS)
      public Boolean getEnabled() {
        return enabled;
      }
  public void setEnabled(Boolean enabled) {
    this.enabled = enabled;
  }
  public ObservabilityPipelineCustomProcessor id(String id) {
    this.id = id;
    return this;
  }

  /**
   * <p>The unique identifier for this processor.</p>
   * @return id
  **/
      @JsonProperty(JSON_PROPERTY_ID)
      @JsonInclude(
        value = JsonInclude.Include.ALWAYS)
      public String getId() {
        return id;
      }
  public void setId(String id) {
    this.id = id;
  }
  public ObservabilityPipelineCustomProcessor include(String include) {
    this.include = include;
    return this;
  }

  /**
   * <p>A Datadog search query used to determine which logs this processor targets. This field should always be set to <code>*</code> for the custom_processor processor.</p>
   * @return include
  **/
      @JsonProperty(JSON_PROPERTY_INCLUDE)
      @JsonInclude(
        value = JsonInclude.Include.ALWAYS)
      public String getInclude() {
        return include;
      }
  public void setInclude(String include) {
    this.include = include;
  }
  public ObservabilityPipelineCustomProcessor remaps(List<ObservabilityPipelineCustomProcessorRemap> remaps) {
    this.remaps = remaps;
    for (ObservabilityPipelineCustomProcessorRemap item : remaps) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }
  public ObservabilityPipelineCustomProcessor addRemapsItem(ObservabilityPipelineCustomProcessorRemap remapsItem) {
    this.remaps.add(remapsItem);
    this.unparsed |= remapsItem.unparsed;
    return this;
  }

  /**
   * <p>Array of VRL remap rules.</p>
   * @return remaps
  **/
      @JsonProperty(JSON_PROPERTY_REMAPS)
      @JsonInclude(
        value = JsonInclude.Include.ALWAYS)
      public List<ObservabilityPipelineCustomProcessorRemap> getRemaps() {
        return remaps;
      }
  public void setRemaps(List<ObservabilityPipelineCustomProcessorRemap> remaps) {
    this.remaps = remaps;
  }
  public ObservabilityPipelineCustomProcessor type(ObservabilityPipelineCustomProcessorType type) {
    this.type = type;
    this.unparsed |= !type.isValid();
    return this;
  }

  /**
   * <p>The processor type. The value should always be <code>custom_processor</code>.</p>
   * @return type
  **/
      @JsonProperty(JSON_PROPERTY_TYPE)
      @JsonInclude(
        value = JsonInclude.Include.ALWAYS)
      public ObservabilityPipelineCustomProcessorType getType() {
        return type;
      }
  public void setType(ObservabilityPipelineCustomProcessorType type) {
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
   * @return ObservabilityPipelineCustomProcessor
   */
  @JsonAnySetter
  public ObservabilityPipelineCustomProcessor putAdditionalProperty(String key, Object value) {
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
   * Return true if this ObservabilityPipelineCustomProcessor object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ObservabilityPipelineCustomProcessor observabilityPipelineCustomProcessor = (ObservabilityPipelineCustomProcessor) o;
    return Objects.equals(this.displayName, observabilityPipelineCustomProcessor.displayName) && Objects.equals(this.enabled, observabilityPipelineCustomProcessor.enabled) && Objects.equals(this.id, observabilityPipelineCustomProcessor.id) && Objects.equals(this.include, observabilityPipelineCustomProcessor.include) && Objects.equals(this.remaps, observabilityPipelineCustomProcessor.remaps) && Objects.equals(this.type, observabilityPipelineCustomProcessor.type) && Objects.equals(this.additionalProperties, observabilityPipelineCustomProcessor.additionalProperties);
  }


  @Override
  public int hashCode() {
    return Objects.hash(displayName,enabled,id,include,remaps,type, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ObservabilityPipelineCustomProcessor {\n");
    sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
    sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    include: ").append(toIndentedString(include)).append("\n");
    sb.append("    remaps: ").append(toIndentedString(remaps)).append("\n");
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
