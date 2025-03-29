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
  QuotaProcessor.JSON_PROPERTY_DROP_EVENTS,
  QuotaProcessor.JSON_PROPERTY_ID,
  QuotaProcessor.JSON_PROPERTY_IGNORE_WHEN_MISSING_PARTITIONS,
  QuotaProcessor.JSON_PROPERTY_INPUTS,
  QuotaProcessor.JSON_PROPERTY_LIMIT,
  QuotaProcessor.JSON_PROPERTY_NAME,
  QuotaProcessor.JSON_PROPERTY_OVERRIDES,
  QuotaProcessor.JSON_PROPERTY_PARTITION_FIELDS,
  QuotaProcessor.JSON_PROPERTY_TYPE
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class QuotaProcessor {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_DROP_EVENTS = "drop_events";
  private Boolean dropEvents;

  public static final String JSON_PROPERTY_ID = "id";
  private String id;

  public static final String JSON_PROPERTY_IGNORE_WHEN_MISSING_PARTITIONS =
      "ignore_when_missing_partitions";
  private Boolean ignoreWhenMissingPartitions;

  public static final String JSON_PROPERTY_INPUTS = "inputs";
  private List<String> inputs = new ArrayList<>();

  public static final String JSON_PROPERTY_LIMIT = "limit";
  private QuotaLimit limit;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_OVERRIDES = "overrides";
  private List<QuotaProcessorOverride> overrides = null;

  public static final String JSON_PROPERTY_PARTITION_FIELDS = "partition_fields";
  private List<String> partitionFields = null;

  public static final String JSON_PROPERTY_TYPE = "type";
  private QuotaProcessorType type;

  public QuotaProcessor() {}

  @JsonCreator
  public QuotaProcessor(
      @JsonProperty(required = true, value = JSON_PROPERTY_DROP_EVENTS) Boolean dropEvents,
      @JsonProperty(required = true, value = JSON_PROPERTY_ID) String id,
      @JsonProperty(required = true, value = JSON_PROPERTY_INPUTS) List<String> inputs,
      @JsonProperty(required = true, value = JSON_PROPERTY_LIMIT) QuotaLimit limit,
      @JsonProperty(required = true, value = JSON_PROPERTY_NAME) String name,
      @JsonProperty(required = true, value = JSON_PROPERTY_TYPE) QuotaProcessorType type) {
    this.dropEvents = dropEvents;
    this.id = id;
    this.inputs = inputs;
    this.limit = limit;
    this.unparsed |= limit.unparsed;
    this.name = name;
    this.type = type;
    this.unparsed |= !type.isValid();
  }

  public QuotaProcessor dropEvents(Boolean dropEvents) {
    this.dropEvents = dropEvents;
    return this;
  }

  /**
   * The <code>QuotaProcessor</code> <code>drop_events</code>.
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

  public QuotaProcessor id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Unique identifier.
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

  public QuotaProcessor ignoreWhenMissingPartitions(Boolean ignoreWhenMissingPartitions) {
    this.ignoreWhenMissingPartitions = ignoreWhenMissingPartitions;
    return this;
  }

  /**
   * The <code>QuotaProcessor</code> <code>ignore_when_missing_partitions</code>.
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

  public QuotaProcessor inputs(List<String> inputs) {
    this.inputs = inputs;
    return this;
  }

  public QuotaProcessor addInputsItem(String inputsItem) {
    this.inputs.add(inputsItem);
    return this;
  }

  /**
   * The <code>QuotaProcessor</code> <code>inputs</code>.
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

  public QuotaProcessor limit(QuotaLimit limit) {
    this.limit = limit;
    this.unparsed |= limit.unparsed;
    return this;
  }

  /**
   * Unified definition of <code>QuotaLimit</code> object.
   *
   * @return limit
   */
  @JsonProperty(JSON_PROPERTY_LIMIT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public QuotaLimit getLimit() {
    return limit;
  }

  public void setLimit(QuotaLimit limit) {
    this.limit = limit;
  }

  public QuotaProcessor name(String name) {
    this.name = name;
    return this;
  }

  /**
   * The <code>QuotaProcessor</code> <code>name</code>.
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

  public QuotaProcessor overrides(List<QuotaProcessorOverride> overrides) {
    this.overrides = overrides;
    for (QuotaProcessorOverride item : overrides) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }

  public QuotaProcessor addOverridesItem(QuotaProcessorOverride overridesItem) {
    if (this.overrides == null) {
      this.overrides = new ArrayList<>();
    }
    this.overrides.add(overridesItem);
    this.unparsed |= overridesItem.unparsed;
    return this;
  }

  /**
   * The <code>QuotaProcessor</code> <code>overrides</code>.
   *
   * @return overrides
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_OVERRIDES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<QuotaProcessorOverride> getOverrides() {
    return overrides;
  }

  public void setOverrides(List<QuotaProcessorOverride> overrides) {
    this.overrides = overrides;
  }

  public QuotaProcessor partitionFields(List<String> partitionFields) {
    this.partitionFields = partitionFields;
    return this;
  }

  public QuotaProcessor addPartitionFieldsItem(String partitionFieldsItem) {
    if (this.partitionFields == null) {
      this.partitionFields = new ArrayList<>();
    }
    this.partitionFields.add(partitionFieldsItem);
    return this;
  }

  /**
   * The <code>QuotaProcessor</code> <code>partition_fields</code>.
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

  public QuotaProcessor type(QuotaProcessorType type) {
    this.type = type;
    this.unparsed |= !type.isValid();
    return this;
  }

  /**
   * The definition of <code>QuotaProcessorType</code> object.
   *
   * @return type
   */
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public QuotaProcessorType getType() {
    return type;
  }

  public void setType(QuotaProcessorType type) {
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
   * @return QuotaProcessor
   */
  @JsonAnySetter
  public QuotaProcessor putAdditionalProperty(String key, Object value) {
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

  /** Return true if this QuotaProcessor object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    QuotaProcessor quotaProcessor = (QuotaProcessor) o;
    return Objects.equals(this.dropEvents, quotaProcessor.dropEvents)
        && Objects.equals(this.id, quotaProcessor.id)
        && Objects.equals(
            this.ignoreWhenMissingPartitions, quotaProcessor.ignoreWhenMissingPartitions)
        && Objects.equals(this.inputs, quotaProcessor.inputs)
        && Objects.equals(this.limit, quotaProcessor.limit)
        && Objects.equals(this.name, quotaProcessor.name)
        && Objects.equals(this.overrides, quotaProcessor.overrides)
        && Objects.equals(this.partitionFields, quotaProcessor.partitionFields)
        && Objects.equals(this.type, quotaProcessor.type)
        && Objects.equals(this.additionalProperties, quotaProcessor.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        dropEvents,
        id,
        ignoreWhenMissingPartitions,
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
    sb.append("class QuotaProcessor {\n");
    sb.append("    dropEvents: ").append(toIndentedString(dropEvents)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    ignoreWhenMissingPartitions: ")
        .append(toIndentedString(ignoreWhenMissingPartitions))
        .append("\n");
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
