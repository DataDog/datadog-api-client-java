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
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/**
 * The <code>add_metric_tags</code> processor adds static tags to metrics.
 *
 * <p><strong>Supported pipeline types:</strong> metrics
 */
@JsonPropertyOrder({
  ObservabilityPipelineAddMetricTagsProcessor.JSON_PROPERTY_DISPLAY_NAME,
  ObservabilityPipelineAddMetricTagsProcessor.JSON_PROPERTY_ENABLED,
  ObservabilityPipelineAddMetricTagsProcessor.JSON_PROPERTY_ID,
  ObservabilityPipelineAddMetricTagsProcessor.JSON_PROPERTY_INCLUDE,
  ObservabilityPipelineAddMetricTagsProcessor.JSON_PROPERTY_TAGS,
  ObservabilityPipelineAddMetricTagsProcessor.JSON_PROPERTY_TYPE
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class ObservabilityPipelineAddMetricTagsProcessor {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_DISPLAY_NAME = "display_name";
  private String displayName;

  public static final String JSON_PROPERTY_ENABLED = "enabled";
  private Boolean enabled;

  public static final String JSON_PROPERTY_ID = "id";
  private String id;

  public static final String JSON_PROPERTY_INCLUDE = "include";
  private String include;

  public static final String JSON_PROPERTY_TAGS = "tags";
  private List<ObservabilityPipelineFieldValue> tags = new ArrayList<>();

  public static final String JSON_PROPERTY_TYPE = "type";
  private ObservabilityPipelineAddMetricTagsProcessorType type =
      ObservabilityPipelineAddMetricTagsProcessorType.ADD_METRIC_TAGS;

  public ObservabilityPipelineAddMetricTagsProcessor() {}

  @JsonCreator
  public ObservabilityPipelineAddMetricTagsProcessor(
      @JsonProperty(required = true, value = JSON_PROPERTY_ENABLED) Boolean enabled,
      @JsonProperty(required = true, value = JSON_PROPERTY_ID) String id,
      @JsonProperty(required = true, value = JSON_PROPERTY_INCLUDE) String include,
      @JsonProperty(required = true, value = JSON_PROPERTY_TAGS)
          List<ObservabilityPipelineFieldValue> tags,
      @JsonProperty(required = true, value = JSON_PROPERTY_TYPE)
          ObservabilityPipelineAddMetricTagsProcessorType type) {
    this.enabled = enabled;
    this.id = id;
    this.include = include;
    this.tags = tags;
    this.type = type;
    this.unparsed |= !type.isValid();
  }

  public ObservabilityPipelineAddMetricTagsProcessor displayName(String displayName) {
    this.displayName = displayName;
    return this;
  }

  /**
   * The display name for a component.
   *
   * @return displayName
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DISPLAY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getDisplayName() {
    return displayName;
  }

  public void setDisplayName(String displayName) {
    this.displayName = displayName;
  }

  public ObservabilityPipelineAddMetricTagsProcessor enabled(Boolean enabled) {
    this.enabled = enabled;
    return this;
  }

  /**
   * Indicates whether the processor is enabled.
   *
   * @return enabled
   */
  @JsonProperty(JSON_PROPERTY_ENABLED)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Boolean getEnabled() {
    return enabled;
  }

  public void setEnabled(Boolean enabled) {
    this.enabled = enabled;
  }

  public ObservabilityPipelineAddMetricTagsProcessor id(String id) {
    this.id = id;
    return this;
  }

  /**
   * The unique identifier for this component. Used in other parts of the pipeline to reference this
   * component (for example, as the <code>input</code> to downstream components).
   *
   * @return id
   */
  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public ObservabilityPipelineAddMetricTagsProcessor include(String include) {
    this.include = include;
    return this;
  }

  /**
   * A Datadog search query used to determine which metrics this processor targets.
   *
   * @return include
   */
  @JsonProperty(JSON_PROPERTY_INCLUDE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getInclude() {
    return include;
  }

  public void setInclude(String include) {
    this.include = include;
  }

  public ObservabilityPipelineAddMetricTagsProcessor tags(
      List<ObservabilityPipelineFieldValue> tags) {
    this.tags = tags;
    for (ObservabilityPipelineFieldValue item : tags) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }

  public ObservabilityPipelineAddMetricTagsProcessor addTagsItem(
      ObservabilityPipelineFieldValue tagsItem) {
    this.tags.add(tagsItem);
    this.unparsed |= tagsItem.unparsed;
    return this;
  }

  /**
   * A list of static tags (key-value pairs) added to each metric processed by this component.
   *
   * @return tags
   */
  @JsonProperty(JSON_PROPERTY_TAGS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public List<ObservabilityPipelineFieldValue> getTags() {
    return tags;
  }

  public void setTags(List<ObservabilityPipelineFieldValue> tags) {
    this.tags = tags;
  }

  public ObservabilityPipelineAddMetricTagsProcessor type(
      ObservabilityPipelineAddMetricTagsProcessorType type) {
    this.type = type;
    this.unparsed |= !type.isValid();
    return this;
  }

  /**
   * The processor type. The value must be <code>add_metric_tags</code>.
   *
   * @return type
   */
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public ObservabilityPipelineAddMetricTagsProcessorType getType() {
    return type;
  }

  public void setType(ObservabilityPipelineAddMetricTagsProcessorType type) {
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
   * @return ObservabilityPipelineAddMetricTagsProcessor
   */
  @JsonAnySetter
  public ObservabilityPipelineAddMetricTagsProcessor putAdditionalProperty(
      String key, Object value) {
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

  /** Return true if this ObservabilityPipelineAddMetricTagsProcessor object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ObservabilityPipelineAddMetricTagsProcessor observabilityPipelineAddMetricTagsProcessor =
        (ObservabilityPipelineAddMetricTagsProcessor) o;
    return Objects.equals(this.displayName, observabilityPipelineAddMetricTagsProcessor.displayName)
        && Objects.equals(this.enabled, observabilityPipelineAddMetricTagsProcessor.enabled)
        && Objects.equals(this.id, observabilityPipelineAddMetricTagsProcessor.id)
        && Objects.equals(this.include, observabilityPipelineAddMetricTagsProcessor.include)
        && Objects.equals(this.tags, observabilityPipelineAddMetricTagsProcessor.tags)
        && Objects.equals(this.type, observabilityPipelineAddMetricTagsProcessor.type)
        && Objects.equals(
            this.additionalProperties,
            observabilityPipelineAddMetricTagsProcessor.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(displayName, enabled, id, include, tags, type, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ObservabilityPipelineAddMetricTagsProcessor {\n");
    sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
    sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    include: ").append(toIndentedString(include)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
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
