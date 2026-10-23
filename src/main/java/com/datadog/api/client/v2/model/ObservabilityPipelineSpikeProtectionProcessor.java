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
 * The <code>spike_protection</code> processor learns the normal ingestion volume for the logs that
 * match a specified filter and takes action when the volume spikes unexpectedly.
 *
 * <p><strong>Supported pipeline types:</strong> logs
 */
@JsonPropertyOrder({
  ObservabilityPipelineSpikeProtectionProcessor.JSON_PROPERTY_ACTION_WHEN_MISSING_PARTITIONS,
  ObservabilityPipelineSpikeProtectionProcessor.JSON_PROPERTY_DISPLAY_NAME,
  ObservabilityPipelineSpikeProtectionProcessor.JSON_PROPERTY_ENABLED,
  ObservabilityPipelineSpikeProtectionProcessor.JSON_PROPERTY_ID,
  ObservabilityPipelineSpikeProtectionProcessor.JSON_PROPERTY_INCLUDE,
  ObservabilityPipelineSpikeProtectionProcessor.JSON_PROPERTY_MINIMAL_THRESHOLD,
  ObservabilityPipelineSpikeProtectionProcessor.JSON_PROPERTY_MINIMAL_THRESHOLD_OVERRIDES,
  ObservabilityPipelineSpikeProtectionProcessor.JSON_PROPERTY_NAME,
  ObservabilityPipelineSpikeProtectionProcessor.JSON_PROPERTY_PARTITION_FIELDS,
  ObservabilityPipelineSpikeProtectionProcessor.JSON_PROPERTY_SPIKE_ACTION,
  ObservabilityPipelineSpikeProtectionProcessor.JSON_PROPERTY_SPIKE_THRESHOLD,
  ObservabilityPipelineSpikeProtectionProcessor.JSON_PROPERTY_TYPE
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class ObservabilityPipelineSpikeProtectionProcessor {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_ACTION_WHEN_MISSING_PARTITIONS =
      "action_when_missing_partitions";
  private ObservabilityPipelineSpikeProtectionProcessorActionWhenMissingPartitions
      actionWhenMissingPartitions =
          ObservabilityPipelineSpikeProtectionProcessorActionWhenMissingPartitions.IGNORE;

  public static final String JSON_PROPERTY_DISPLAY_NAME = "display_name";
  private String displayName;

  public static final String JSON_PROPERTY_ENABLED = "enabled";
  private Boolean enabled;

  public static final String JSON_PROPERTY_ID = "id";
  private String id;

  public static final String JSON_PROPERTY_INCLUDE = "include";
  private String include;

  public static final String JSON_PROPERTY_MINIMAL_THRESHOLD = "minimal_threshold";
  private Long minimalThreshold;

  public static final String JSON_PROPERTY_MINIMAL_THRESHOLD_OVERRIDES =
      "minimal_threshold_overrides";
  private List<ObservabilityPipelineSpikeProtectionProcessorThresholdOverride>
      minimalThresholdOverrides = null;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_PARTITION_FIELDS = "partition_fields";
  private List<String> partitionFields = null;

  public static final String JSON_PROPERTY_SPIKE_ACTION = "spike_action";
  private ObservabilityPipelineSpikeProtectionProcessorSpikeAction spikeAction;

  public static final String JSON_PROPERTY_SPIKE_THRESHOLD = "spike_threshold";
  private Double spikeThreshold;

  public static final String JSON_PROPERTY_TYPE = "type";
  private ObservabilityPipelineSpikeProtectionProcessorType type =
      ObservabilityPipelineSpikeProtectionProcessorType.SPIKE_PROTECTION;

  public ObservabilityPipelineSpikeProtectionProcessor() {}

  @JsonCreator
  public ObservabilityPipelineSpikeProtectionProcessor(
      @JsonProperty(required = true, value = JSON_PROPERTY_ENABLED) Boolean enabled,
      @JsonProperty(required = true, value = JSON_PROPERTY_ID) String id,
      @JsonProperty(required = true, value = JSON_PROPERTY_INCLUDE) String include,
      @JsonProperty(required = true, value = JSON_PROPERTY_NAME) String name,
      @JsonProperty(required = true, value = JSON_PROPERTY_SPIKE_ACTION)
          ObservabilityPipelineSpikeProtectionProcessorSpikeAction spikeAction,
      @JsonProperty(required = true, value = JSON_PROPERTY_TYPE)
          ObservabilityPipelineSpikeProtectionProcessorType type) {
    this.enabled = enabled;
    this.id = id;
    this.include = include;
    this.name = name;
    this.spikeAction = spikeAction;
    this.unparsed |= !spikeAction.isValid();
    this.type = type;
    this.unparsed |= !type.isValid();
  }

  public ObservabilityPipelineSpikeProtectionProcessor actionWhenMissingPartitions(
      ObservabilityPipelineSpikeProtectionProcessorActionWhenMissingPartitions
          actionWhenMissingPartitions) {
    this.actionWhenMissingPartitions = actionWhenMissingPartitions;
    this.unparsed |= !actionWhenMissingPartitions.isValid();
    return this;
  }

  /**
   * How to handle logs that are missing one of the <code>partition_fields</code>. Options: - <code>
   * ignore</code>: Forward the event without applying spike protection. - <code>default_bucket
   * </code>: Assign the event to a default partition.
   *
   * @return actionWhenMissingPartitions
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ACTION_WHEN_MISSING_PARTITIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public ObservabilityPipelineSpikeProtectionProcessorActionWhenMissingPartitions
      getActionWhenMissingPartitions() {
    return actionWhenMissingPartitions;
  }

  public void setActionWhenMissingPartitions(
      ObservabilityPipelineSpikeProtectionProcessorActionWhenMissingPartitions
          actionWhenMissingPartitions) {
    if (!actionWhenMissingPartitions.isValid()) {
      this.unparsed = true;
    }
    this.actionWhenMissingPartitions = actionWhenMissingPartitions;
  }

  public ObservabilityPipelineSpikeProtectionProcessor displayName(String displayName) {
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

  public ObservabilityPipelineSpikeProtectionProcessor enabled(Boolean enabled) {
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

  public ObservabilityPipelineSpikeProtectionProcessor id(String id) {
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

  public ObservabilityPipelineSpikeProtectionProcessor include(String include) {
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

  public ObservabilityPipelineSpikeProtectionProcessor minimalThreshold(Long minimalThreshold) {
    this.minimalThreshold = minimalThreshold;
    return this;
  }

  /**
   * The minimum volume, in bytes, that must be observed within 24 hours before spike protection can
   * activate. Defaults to 100 GiB.
   *
   * @return minimalThreshold
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_MINIMAL_THRESHOLD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getMinimalThreshold() {
    return minimalThreshold;
  }

  public void setMinimalThreshold(Long minimalThreshold) {
    this.minimalThreshold = minimalThreshold;
  }

  public ObservabilityPipelineSpikeProtectionProcessor minimalThresholdOverrides(
      List<ObservabilityPipelineSpikeProtectionProcessorThresholdOverride>
          minimalThresholdOverrides) {
    this.minimalThresholdOverrides = minimalThresholdOverrides;
    if (minimalThresholdOverrides != null) {
      for (ObservabilityPipelineSpikeProtectionProcessorThresholdOverride item :
          minimalThresholdOverrides) {
        this.unparsed |= item.unparsed;
      }
    }
    return this;
  }

  public ObservabilityPipelineSpikeProtectionProcessor addMinimalThresholdOverridesItem(
      ObservabilityPipelineSpikeProtectionProcessorThresholdOverride
          minimalThresholdOverridesItem) {
    if (this.minimalThresholdOverrides == null) {
      this.minimalThresholdOverrides = new ArrayList<>();
    }
    this.minimalThresholdOverrides.add(minimalThresholdOverridesItem);
    this.unparsed |= minimalThresholdOverridesItem.unparsed;
    return this;
  }

  /**
   * A list of per-partition overrides for the minimal threshold, identified by matching field
   * values. Requires <code>partition_fields</code> to be set.
   *
   * @return minimalThresholdOverrides
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_MINIMAL_THRESHOLD_OVERRIDES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<ObservabilityPipelineSpikeProtectionProcessorThresholdOverride>
      getMinimalThresholdOverrides() {
    return minimalThresholdOverrides;
  }

  public void setMinimalThresholdOverrides(
      List<ObservabilityPipelineSpikeProtectionProcessorThresholdOverride>
          minimalThresholdOverrides) {
    this.minimalThresholdOverrides = minimalThresholdOverrides;
    if (minimalThresholdOverrides != null) {
      for (ObservabilityPipelineSpikeProtectionProcessorThresholdOverride item :
          minimalThresholdOverrides) {
        this.unparsed |= item.unparsed;
      }
    }
  }

  public ObservabilityPipelineSpikeProtectionProcessor name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Name of the spike protection rule.
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

  public ObservabilityPipelineSpikeProtectionProcessor partitionFields(
      List<String> partitionFields) {
    this.partitionFields = partitionFields;
    return this;
  }

  public ObservabilityPipelineSpikeProtectionProcessor addPartitionFieldsItem(
      String partitionFieldsItem) {
    if (this.partitionFields == null) {
      this.partitionFields = new ArrayList<>();
    }
    this.partitionFields.add(partitionFieldsItem);
    return this;
  }

  /**
   * A list of fields used to segment log traffic. Volume is learned and evaluated independently for
   * each unique combination of these field values. A maximum of five fields is supported.
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

  public ObservabilityPipelineSpikeProtectionProcessor spikeAction(
      ObservabilityPipelineSpikeProtectionProcessorSpikeAction spikeAction) {
    this.spikeAction = spikeAction;
    this.unparsed |= !spikeAction.isValid();
    return this;
  }

  /**
   * The action to take with matching logs while spike protection is active. Options: - <code>drop
   * </code>: Drop the event. - <code>no_action</code>: Let the event pass through. - <code>
   * overflow_routing</code>: Route to an overflow destination.
   *
   * <p>When <code>overflow_routing</code> is used, there must be a destination whose <code>inputs
   * </code> reference this processor with the <code>&lt;processor-id&gt;.overflow_events</code>
   * suffix to route the overflowing events.
   *
   * @return spikeAction
   */
  @JsonProperty(JSON_PROPERTY_SPIKE_ACTION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public ObservabilityPipelineSpikeProtectionProcessorSpikeAction getSpikeAction() {
    return spikeAction;
  }

  public void setSpikeAction(ObservabilityPipelineSpikeProtectionProcessorSpikeAction spikeAction) {
    if (!spikeAction.isValid()) {
      this.unparsed = true;
    }
    this.spikeAction = spikeAction;
  }

  public ObservabilityPipelineSpikeProtectionProcessor spikeThreshold(Double spikeThreshold) {
    this.spikeThreshold = spikeThreshold;
    return this;
  }

  /**
   * The number of standard deviations above the learned mean volume that must be exceeded before a
   * spike is detected. Defaults to <code>5</code>.
   *
   * @return spikeThreshold
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SPIKE_THRESHOLD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getSpikeThreshold() {
    return spikeThreshold;
  }

  public void setSpikeThreshold(Double spikeThreshold) {
    this.spikeThreshold = spikeThreshold;
  }

  public ObservabilityPipelineSpikeProtectionProcessor type(
      ObservabilityPipelineSpikeProtectionProcessorType type) {
    this.type = type;
    this.unparsed |= !type.isValid();
    return this;
  }

  /**
   * The processor type. The value should always be <code>spike_protection</code>.
   *
   * @return type
   */
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public ObservabilityPipelineSpikeProtectionProcessorType getType() {
    return type;
  }

  public void setType(ObservabilityPipelineSpikeProtectionProcessorType type) {
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
   * @return ObservabilityPipelineSpikeProtectionProcessor
   */
  @JsonAnySetter
  public ObservabilityPipelineSpikeProtectionProcessor putAdditionalProperty(
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

  /** Return true if this ObservabilityPipelineSpikeProtectionProcessor object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ObservabilityPipelineSpikeProtectionProcessor observabilityPipelineSpikeProtectionProcessor =
        (ObservabilityPipelineSpikeProtectionProcessor) o;
    return Objects.equals(
            this.actionWhenMissingPartitions,
            observabilityPipelineSpikeProtectionProcessor.actionWhenMissingPartitions)
        && Objects.equals(
            this.displayName, observabilityPipelineSpikeProtectionProcessor.displayName)
        && Objects.equals(this.enabled, observabilityPipelineSpikeProtectionProcessor.enabled)
        && Objects.equals(this.id, observabilityPipelineSpikeProtectionProcessor.id)
        && Objects.equals(this.include, observabilityPipelineSpikeProtectionProcessor.include)
        && Objects.equals(
            this.minimalThreshold, observabilityPipelineSpikeProtectionProcessor.minimalThreshold)
        && Objects.equals(
            this.minimalThresholdOverrides,
            observabilityPipelineSpikeProtectionProcessor.minimalThresholdOverrides)
        && Objects.equals(this.name, observabilityPipelineSpikeProtectionProcessor.name)
        && Objects.equals(
            this.partitionFields, observabilityPipelineSpikeProtectionProcessor.partitionFields)
        && Objects.equals(
            this.spikeAction, observabilityPipelineSpikeProtectionProcessor.spikeAction)
        && Objects.equals(
            this.spikeThreshold, observabilityPipelineSpikeProtectionProcessor.spikeThreshold)
        && Objects.equals(this.type, observabilityPipelineSpikeProtectionProcessor.type)
        && Objects.equals(
            this.additionalProperties,
            observabilityPipelineSpikeProtectionProcessor.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        actionWhenMissingPartitions,
        displayName,
        enabled,
        id,
        include,
        minimalThreshold,
        minimalThresholdOverrides,
        name,
        partitionFields,
        spikeAction,
        spikeThreshold,
        type,
        additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ObservabilityPipelineSpikeProtectionProcessor {\n");
    sb.append("    actionWhenMissingPartitions: ")
        .append(toIndentedString(actionWhenMissingPartitions))
        .append("\n");
    sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
    sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    include: ").append(toIndentedString(include)).append("\n");
    sb.append("    minimalThreshold: ").append(toIndentedString(minimalThreshold)).append("\n");
    sb.append("    minimalThresholdOverrides: ")
        .append(toIndentedString(minimalThresholdOverrides))
        .append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    partitionFields: ").append(toIndentedString(partitionFields)).append("\n");
    sb.append("    spikeAction: ").append(toIndentedString(spikeAction)).append("\n");
    sb.append("    spikeThreshold: ").append(toIndentedString(spikeThreshold)).append("\n");
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
