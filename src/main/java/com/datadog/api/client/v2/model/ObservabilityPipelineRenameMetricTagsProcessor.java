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
 * The <code>rename_metric_tags</code> processor changes the keys of tags on metrics.
 *
 * <p><strong>Supported pipeline types:</strong> metrics
 */
@JsonPropertyOrder({
  ObservabilityPipelineRenameMetricTagsProcessor.JSON_PROPERTY_DISPLAY_NAME,
  ObservabilityPipelineRenameMetricTagsProcessor.JSON_PROPERTY_ENABLED,
  ObservabilityPipelineRenameMetricTagsProcessor.JSON_PROPERTY_ID,
  ObservabilityPipelineRenameMetricTagsProcessor.JSON_PROPERTY_INCLUDE,
  ObservabilityPipelineRenameMetricTagsProcessor.JSON_PROPERTY_TAGS,
  ObservabilityPipelineRenameMetricTagsProcessor.JSON_PROPERTY_TYPE
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class ObservabilityPipelineRenameMetricTagsProcessor {
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
  private List<ObservabilityPipelineRenameMetricTagsProcessorTag> tags = new ArrayList<>();

  public static final String JSON_PROPERTY_TYPE = "type";
  private ObservabilityPipelineRenameMetricTagsProcessorType type =
      ObservabilityPipelineRenameMetricTagsProcessorType.RENAME_METRIC_TAGS;

  public ObservabilityPipelineRenameMetricTagsProcessor() {}

  @JsonCreator
  public ObservabilityPipelineRenameMetricTagsProcessor(
      @JsonProperty(required = true, value = JSON_PROPERTY_ENABLED) Boolean enabled,
      @JsonProperty(required = true, value = JSON_PROPERTY_ID) String id,
      @JsonProperty(required = true, value = JSON_PROPERTY_INCLUDE) String include,
      @JsonProperty(required = true, value = JSON_PROPERTY_TAGS)
          List<ObservabilityPipelineRenameMetricTagsProcessorTag> tags,
      @JsonProperty(required = true, value = JSON_PROPERTY_TYPE)
          ObservabilityPipelineRenameMetricTagsProcessorType type) {
    this.enabled = enabled;
    this.id = id;
    this.include = include;
    this.tags = tags;
    for (ObservabilityPipelineRenameMetricTagsProcessorTag item : tags) {
      this.unparsed |= item.unparsed;
    }
    this.type = type;
    this.unparsed |= !type.isValid();
  }

  public ObservabilityPipelineRenameMetricTagsProcessor displayName(String displayName) {
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

  public ObservabilityPipelineRenameMetricTagsProcessor enabled(Boolean enabled) {
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

  public ObservabilityPipelineRenameMetricTagsProcessor id(String id) {
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

  public ObservabilityPipelineRenameMetricTagsProcessor include(String include) {
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

  public ObservabilityPipelineRenameMetricTagsProcessor tags(
      List<ObservabilityPipelineRenameMetricTagsProcessorTag> tags) {
    this.tags = tags;
    for (ObservabilityPipelineRenameMetricTagsProcessorTag item : tags) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }

  public ObservabilityPipelineRenameMetricTagsProcessor addTagsItem(
      ObservabilityPipelineRenameMetricTagsProcessorTag tagsItem) {
    this.tags.add(tagsItem);
    this.unparsed |= tagsItem.unparsed;
    return this;
  }

  /**
   * A list of rename rules specifying which tag keys to rename on each metric.
   *
   * @return tags
   */
  @JsonProperty(JSON_PROPERTY_TAGS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public List<ObservabilityPipelineRenameMetricTagsProcessorTag> getTags() {
    return tags;
  }

  public void setTags(List<ObservabilityPipelineRenameMetricTagsProcessorTag> tags) {
    this.tags = tags;
    if (tags != null) {
      for (ObservabilityPipelineRenameMetricTagsProcessorTag item : tags) {
        this.unparsed |= item.unparsed;
      }
    }
  }

  public ObservabilityPipelineRenameMetricTagsProcessor type(
      ObservabilityPipelineRenameMetricTagsProcessorType type) {
    this.type = type;
    this.unparsed |= !type.isValid();
    return this;
  }

  /**
   * The processor type. The value must be <code>rename_metric_tags</code>.
   *
   * @return type
   */
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public ObservabilityPipelineRenameMetricTagsProcessorType getType() {
    return type;
  }

  public void setType(ObservabilityPipelineRenameMetricTagsProcessorType type) {
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
   * @return ObservabilityPipelineRenameMetricTagsProcessor
   */
  @JsonAnySetter
  public ObservabilityPipelineRenameMetricTagsProcessor putAdditionalProperty(
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

  /** Return true if this ObservabilityPipelineRenameMetricTagsProcessor object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ObservabilityPipelineRenameMetricTagsProcessor observabilityPipelineRenameMetricTagsProcessor =
        (ObservabilityPipelineRenameMetricTagsProcessor) o;
    return Objects.equals(
            this.displayName, observabilityPipelineRenameMetricTagsProcessor.displayName)
        && Objects.equals(this.enabled, observabilityPipelineRenameMetricTagsProcessor.enabled)
        && Objects.equals(this.id, observabilityPipelineRenameMetricTagsProcessor.id)
        && Objects.equals(this.include, observabilityPipelineRenameMetricTagsProcessor.include)
        && Objects.equals(this.tags, observabilityPipelineRenameMetricTagsProcessor.tags)
        && Objects.equals(this.type, observabilityPipelineRenameMetricTagsProcessor.type)
        && Objects.equals(
            this.additionalProperties,
            observabilityPipelineRenameMetricTagsProcessor.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(displayName, enabled, id, include, tags, type, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ObservabilityPipelineRenameMetricTagsProcessor {\n");
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
