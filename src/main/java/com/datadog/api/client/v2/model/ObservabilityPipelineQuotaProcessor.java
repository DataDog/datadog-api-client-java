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
 * The Quota Processor measures logging traffic for logs that match a specified filter. When the
 * configured daily quota is met, the processor can drop or alert.
 */
@JsonPropertyOrder({
  ObservabilityPipelineQuotaProcessor.JSON_PROPERTY_DROP_EVENTS,
  ObservabilityPipelineQuotaProcessor.JSON_PROPERTY_ID,
  ObservabilityPipelineQuotaProcessor.JSON_PROPERTY_IGNORE_WHEN_MISSING_PARTITIONS,
  ObservabilityPipelineQuotaProcessor.JSON_PROPERTY_INCLUDE,
  ObservabilityPipelineQuotaProcessor.JSON_PROPERTY_INPUTS,
  ObservabilityPipelineQuotaProcessor.JSON_PROPERTY_LIMIT,
  ObservabilityPipelineQuotaProcessor.JSON_PROPERTY_NAME,
  ObservabilityPipelineQuotaProcessor.JSON_PROPERTY_OVERRIDES,
  ObservabilityPipelineQuotaProcessor.JSON_PROPERTY_PARTITION_FIELDS,
  ObservabilityPipelineQuotaProcessor.JSON_PROPERTY_TYPE
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class ObservabilityPipelineQuotaProcessor {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_DROP_EVENTS = "drop_events";
  private Boolean dropEvents;

  public static final String JSON_PROPERTY_ID = "id";
  private String id;

  public static final String JSON_PROPERTY_IGNORE_WHEN_MISSING_PARTITIONS =
      "ignore_when_missing_partitions";
  private Boolean ignoreWhenMissingPartitions;

  public static final String JSON_PROPERTY_INCLUDE = "include";
  private String include;

  public static final String JSON_PROPERTY_INPUTS = "inputs";
  private List<String> inputs = new ArrayList<>();

  public static final String JSON_PROPERTY_LIMIT = "limit";
  private ObservabilityPipelineQuotaProcessorLimit limit;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_OVERRIDES = "overrides";
  private List<ObservabilityPipelineQuotaProcessorOverride> overrides = null;

  public static final String JSON_PROPERTY_PARTITION_FIELDS = "partition_fields";
  private List<String> partitionFields = null;

  public static final String JSON_PROPERTY_TYPE = "type";
  private ObservabilityPipelineQuotaProcessorType type =
      ObservabilityPipelineQuotaProcessorType.QUOTA;

  public ObservabilityPipelineQuotaProcessor() {}

  @JsonCreator
  public ObservabilityPipelineQuotaProcessor(
      @JsonProperty(required = true, value = JSON_PROPERTY_DROP_EVENTS) Boolean dropEvents,
      @JsonProperty(required = true, value = JSON_PROPERTY_ID) String id,
      @JsonProperty(required = true, value = JSON_PROPERTY_INCLUDE) String include,
      @JsonProperty(required = true, value = JSON_PROPERTY_INPUTS) List<String> inputs,
      @JsonProperty(required = true, value = JSON_PROPERTY_LIMIT)
          ObservabilityPipelineQuotaProcessorLimit limit,
      @JsonProperty(required = true, value = JSON_PROPERTY_NAME) String name,
      @JsonProperty(required = true, value = JSON_PROPERTY_TYPE)
          ObservabilityPipelineQuotaProcessorType type) {
    this.dropEvents = dropEvents;
    this.id = id;
    this.include = include;
    this.inputs = inputs;
    this.limit = limit;
    this.unparsed |= limit.unparsed;
    this.name = name;
    this.type = type;
    this.unparsed |= !type.isValid();
  }

  public ObservabilityPipelineQuotaProcessor dropEvents(Boolean dropEvents) {
    this.dropEvents = dropEvents;
    return this;
  }

  /**
   * If set to <code>true</code>, logs that matched the quota filter and sent after the quota has
   * been met are dropped; only logs that did not match the filter query continue through the
   * pipeline.
   *
   * @return dropEvents
   */
  @JsonProperty(JSON_PROPERTY_DROP_EVENTS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Boolean getDropEvents() {
    return dropEvents;
  }

  public void setDropEvents(Boolean dropEvents) {
    this.dropEvents = dropEvents;
  }

  public ObservabilityPipelineQuotaProcessor id(String id) {
    this.id = id;
    return this;
  }

  /**
   * The unique identifier for this component. Used to reference this component in other parts of
   * the pipeline (for example, as the <code>input</code> to downstream components).
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

  public ObservabilityPipelineQuotaProcessor ignoreWhenMissingPartitions(
      Boolean ignoreWhenMissingPartitions) {
    this.ignoreWhenMissingPartitions = ignoreWhenMissingPartitions;
    return this;
  }

  /**
   * If <code>true</code>, the processor skips quota checks when partition fields are missing from
   * the logs.
   *
   * @return ignoreWhenMissingPartitions
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_IGNORE_WHEN_MISSING_PARTITIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getIgnoreWhenMissingPartitions() {
    return ignoreWhenMissingPartitions;
  }

  public void setIgnoreWhenMissingPartitions(Boolean ignoreWhenMissingPartitions) {
    this.ignoreWhenMissingPartitions = ignoreWhenMissingPartitions;
  }

  public ObservabilityPipelineQuotaProcessor include(String include) {
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

  public ObservabilityPipelineQuotaProcessor inputs(List<String> inputs) {
    this.inputs = inputs;
    return this;
  }

  public ObservabilityPipelineQuotaProcessor addInputsItem(String inputsItem) {
    this.inputs.add(inputsItem);
    return this;
  }

  /**
   * A list of component IDs whose output is used as the <code>input</code> for this component.
   *
   * @return inputs
   */
  @JsonProperty(JSON_PROPERTY_INPUTS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public List<String> getInputs() {
    return inputs;
  }

  public void setInputs(List<String> inputs) {
    this.inputs = inputs;
  }

  public ObservabilityPipelineQuotaProcessor limit(ObservabilityPipelineQuotaProcessorLimit limit) {
    this.limit = limit;
    this.unparsed |= limit.unparsed;
    return this;
  }

  /**
   * The maximum amount of data or number of events allowed before the quota is enforced. Can be
   * specified in bytes or events.
   *
   * @return limit
   */
  @JsonProperty(JSON_PROPERTY_LIMIT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public ObservabilityPipelineQuotaProcessorLimit getLimit() {
    return limit;
  }

  public void setLimit(ObservabilityPipelineQuotaProcessorLimit limit) {
    this.limit = limit;
  }

  public ObservabilityPipelineQuotaProcessor name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Name for identifying the processor.
   *
   * @return name
   */
  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public ObservabilityPipelineQuotaProcessor overrides(
      List<ObservabilityPipelineQuotaProcessorOverride> overrides) {
    this.overrides = overrides;
    for (ObservabilityPipelineQuotaProcessorOverride item : overrides) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }

  public ObservabilityPipelineQuotaProcessor addOverridesItem(
      ObservabilityPipelineQuotaProcessorOverride overridesItem) {
    if (this.overrides == null) {
      this.overrides = new ArrayList<>();
    }
    this.overrides.add(overridesItem);
    this.unparsed |= overridesItem.unparsed;
    return this;
  }

  /**
   * A list of alternate quota rules that apply to specific sets of events, identified by matching
   * field values. Each override can define a custom limit.
   *
   * @return overrides
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_OVERRIDES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<ObservabilityPipelineQuotaProcessorOverride> getOverrides() {
    return overrides;
  }

  public void setOverrides(List<ObservabilityPipelineQuotaProcessorOverride> overrides) {
    this.overrides = overrides;
  }

  public ObservabilityPipelineQuotaProcessor partitionFields(List<String> partitionFields) {
    this.partitionFields = partitionFields;
    return this;
  }

  public ObservabilityPipelineQuotaProcessor addPartitionFieldsItem(String partitionFieldsItem) {
    if (this.partitionFields == null) {
      this.partitionFields = new ArrayList<>();
    }
    this.partitionFields.add(partitionFieldsItem);
    return this;
  }

  /**
   * A list of fields used to segment log traffic for quota enforcement. Quotas are tracked
   * independently by unique combinations of these field values.
   *
   * @return partitionFields
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PARTITION_FIELDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<String> getPartitionFields() {
    return partitionFields;
  }

  public void setPartitionFields(List<String> partitionFields) {
    this.partitionFields = partitionFields;
  }

  public ObservabilityPipelineQuotaProcessor type(ObservabilityPipelineQuotaProcessorType type) {
    this.type = type;
    this.unparsed |= !type.isValid();
    return this;
  }

  /**
   * The processor type. The value should always be <code>quota</code>.
   *
   * @return type
   */
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public ObservabilityPipelineQuotaProcessorType getType() {
    return type;
  }

  public void setType(ObservabilityPipelineQuotaProcessorType type) {
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
   * @return ObservabilityPipelineQuotaProcessor
   */
  @JsonAnySetter
  public ObservabilityPipelineQuotaProcessor putAdditionalProperty(String key, Object value) {
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

  /** Return true if this ObservabilityPipelineQuotaProcessor object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ObservabilityPipelineQuotaProcessor observabilityPipelineQuotaProcessor =
        (ObservabilityPipelineQuotaProcessor) o;
    return Objects.equals(this.dropEvents, observabilityPipelineQuotaProcessor.dropEvents)
        && Objects.equals(this.id, observabilityPipelineQuotaProcessor.id)
        && Objects.equals(
            this.ignoreWhenMissingPartitions,
            observabilityPipelineQuotaProcessor.ignoreWhenMissingPartitions)
        && Objects.equals(this.include, observabilityPipelineQuotaProcessor.include)
        && Objects.equals(this.inputs, observabilityPipelineQuotaProcessor.inputs)
        && Objects.equals(this.limit, observabilityPipelineQuotaProcessor.limit)
        && Objects.equals(this.name, observabilityPipelineQuotaProcessor.name)
        && Objects.equals(this.overrides, observabilityPipelineQuotaProcessor.overrides)
        && Objects.equals(this.partitionFields, observabilityPipelineQuotaProcessor.partitionFields)
        && Objects.equals(this.type, observabilityPipelineQuotaProcessor.type)
        && Objects.equals(
            this.additionalProperties, observabilityPipelineQuotaProcessor.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        dropEvents,
        id,
        ignoreWhenMissingPartitions,
        include,
        inputs,
        limit,
        name,
        overrides,
        partitionFields,
        type,
        additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ObservabilityPipelineQuotaProcessor {\n");
    sb.append("    dropEvents: ").append(toIndentedString(dropEvents)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    ignoreWhenMissingPartitions: ")
        .append(toIndentedString(ignoreWhenMissingPartitions))
        .append("\n");
    sb.append("    include: ").append(toIndentedString(include)).append("\n");
    sb.append("    inputs: ").append(toIndentedString(inputs)).append("\n");
    sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    overrides: ").append(toIndentedString(overrides)).append("\n");
    sb.append("    partitionFields: ").append(toIndentedString(partitionFields)).append("\n");
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
