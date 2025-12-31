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
 * The <code>reduce</code> processor aggregates and merges logs based on matching keys and merge
 * strategies.
 *
 * <p><strong>Supported pipeline types:</strong> logs
 */
@JsonPropertyOrder({
  ObservabilityPipelineReduceProcessor.JSON_PROPERTY_DISPLAY_NAME,
  ObservabilityPipelineReduceProcessor.JSON_PROPERTY_ENABLED,
  ObservabilityPipelineReduceProcessor.JSON_PROPERTY_GROUP_BY,
  ObservabilityPipelineReduceProcessor.JSON_PROPERTY_ID,
  ObservabilityPipelineReduceProcessor.JSON_PROPERTY_INCLUDE,
  ObservabilityPipelineReduceProcessor.JSON_PROPERTY_MERGE_STRATEGIES,
  ObservabilityPipelineReduceProcessor.JSON_PROPERTY_TYPE
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class ObservabilityPipelineReduceProcessor {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_DISPLAY_NAME = "display_name";
  private String displayName;

  public static final String JSON_PROPERTY_ENABLED = "enabled";
  private Boolean enabled;

  public static final String JSON_PROPERTY_GROUP_BY = "group_by";
  private List<String> groupBy = new ArrayList<>();

  public static final String JSON_PROPERTY_ID = "id";
  private String id;

  public static final String JSON_PROPERTY_INCLUDE = "include";
  private String include;

  public static final String JSON_PROPERTY_MERGE_STRATEGIES = "merge_strategies";
  private List<ObservabilityPipelineReduceProcessorMergeStrategy> mergeStrategies =
      new ArrayList<>();

  public static final String JSON_PROPERTY_TYPE = "type";
  private ObservabilityPipelineReduceProcessorType type =
      ObservabilityPipelineReduceProcessorType.REDUCE;

  public ObservabilityPipelineReduceProcessor() {}

  @JsonCreator
  public ObservabilityPipelineReduceProcessor(
      @JsonProperty(required = true, value = JSON_PROPERTY_ENABLED) Boolean enabled,
      @JsonProperty(required = true, value = JSON_PROPERTY_GROUP_BY) List<String> groupBy,
      @JsonProperty(required = true, value = JSON_PROPERTY_ID) String id,
      @JsonProperty(required = true, value = JSON_PROPERTY_INCLUDE) String include,
      @JsonProperty(required = true, value = JSON_PROPERTY_MERGE_STRATEGIES)
          List<ObservabilityPipelineReduceProcessorMergeStrategy> mergeStrategies,
      @JsonProperty(required = true, value = JSON_PROPERTY_TYPE)
          ObservabilityPipelineReduceProcessorType type) {
    this.enabled = enabled;
    this.groupBy = groupBy;
    this.id = id;
    this.include = include;
    this.mergeStrategies = mergeStrategies;
    this.type = type;
    this.unparsed |= !type.isValid();
  }

  public ObservabilityPipelineReduceProcessor displayName(String displayName) {
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

  public ObservabilityPipelineReduceProcessor enabled(Boolean enabled) {
    this.enabled = enabled;
    return this;
  }

  /**
   * Whether this processor is enabled.
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

  public ObservabilityPipelineReduceProcessor groupBy(List<String> groupBy) {
    this.groupBy = groupBy;
    return this;
  }

  public ObservabilityPipelineReduceProcessor addGroupByItem(String groupByItem) {
    this.groupBy.add(groupByItem);
    return this;
  }

  /**
   * A list of fields used to group log events for merging.
   *
   * @return groupBy
   */
  @JsonProperty(JSON_PROPERTY_GROUP_BY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public List<String> getGroupBy() {
    return groupBy;
  }

  public void setGroupBy(List<String> groupBy) {
    this.groupBy = groupBy;
  }

  public ObservabilityPipelineReduceProcessor id(String id) {
    this.id = id;
    return this;
  }

  /**
   * The unique identifier for this processor.
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

  public ObservabilityPipelineReduceProcessor include(String include) {
    this.include = include;
    return this;
  }

  /**
   * A Datadog search query used to determine which logs this processor targets.
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

  public ObservabilityPipelineReduceProcessor mergeStrategies(
      List<ObservabilityPipelineReduceProcessorMergeStrategy> mergeStrategies) {
    this.mergeStrategies = mergeStrategies;
    for (ObservabilityPipelineReduceProcessorMergeStrategy item : mergeStrategies) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }

  public ObservabilityPipelineReduceProcessor addMergeStrategiesItem(
      ObservabilityPipelineReduceProcessorMergeStrategy mergeStrategiesItem) {
    this.mergeStrategies.add(mergeStrategiesItem);
    this.unparsed |= mergeStrategiesItem.unparsed;
    return this;
  }

  /**
   * List of merge strategies defining how values from grouped events should be combined.
   *
   * @return mergeStrategies
   */
  @JsonProperty(JSON_PROPERTY_MERGE_STRATEGIES)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public List<ObservabilityPipelineReduceProcessorMergeStrategy> getMergeStrategies() {
    return mergeStrategies;
  }

  public void setMergeStrategies(
      List<ObservabilityPipelineReduceProcessorMergeStrategy> mergeStrategies) {
    this.mergeStrategies = mergeStrategies;
  }

  public ObservabilityPipelineReduceProcessor type(ObservabilityPipelineReduceProcessorType type) {
    this.type = type;
    this.unparsed |= !type.isValid();
    return this;
  }

  /**
   * The processor type. The value should always be <code>reduce</code>.
   *
   * @return type
   */
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public ObservabilityPipelineReduceProcessorType getType() {
    return type;
  }

  public void setType(ObservabilityPipelineReduceProcessorType type) {
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
   * @return ObservabilityPipelineReduceProcessor
   */
  @JsonAnySetter
  public ObservabilityPipelineReduceProcessor putAdditionalProperty(String key, Object value) {
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

  /** Return true if this ObservabilityPipelineReduceProcessor object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ObservabilityPipelineReduceProcessor observabilityPipelineReduceProcessor =
        (ObservabilityPipelineReduceProcessor) o;
    return Objects.equals(this.displayName, observabilityPipelineReduceProcessor.displayName)
        && Objects.equals(this.enabled, observabilityPipelineReduceProcessor.enabled)
        && Objects.equals(this.groupBy, observabilityPipelineReduceProcessor.groupBy)
        && Objects.equals(this.id, observabilityPipelineReduceProcessor.id)
        && Objects.equals(this.include, observabilityPipelineReduceProcessor.include)
        && Objects.equals(
            this.mergeStrategies, observabilityPipelineReduceProcessor.mergeStrategies)
        && Objects.equals(this.type, observabilityPipelineReduceProcessor.type)
        && Objects.equals(
            this.additionalProperties, observabilityPipelineReduceProcessor.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        displayName, enabled, groupBy, id, include, mergeStrategies, type, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ObservabilityPipelineReduceProcessor {\n");
    sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
    sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
    sb.append("    groupBy: ").append(toIndentedString(groupBy)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    include: ").append(toIndentedString(include)).append("\n");
    sb.append("    mergeStrategies: ").append(toIndentedString(mergeStrategies)).append("\n");
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
