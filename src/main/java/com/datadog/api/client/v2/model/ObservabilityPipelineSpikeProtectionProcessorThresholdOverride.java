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
 * Defines a minimal threshold that applies to a specific partition instead of the processor-wide
 * <code>minimal_threshold</code>.
 */
@JsonPropertyOrder({
  ObservabilityPipelineSpikeProtectionProcessorThresholdOverride.JSON_PROPERTY_FIELDS,
  ObservabilityPipelineSpikeProtectionProcessorThresholdOverride.JSON_PROPERTY_MINIMAL_THRESHOLD
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class ObservabilityPipelineSpikeProtectionProcessorThresholdOverride {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_FIELDS = "fields";
  private List<ObservabilityPipelineFieldValue> fields = new ArrayList<>();

  public static final String JSON_PROPERTY_MINIMAL_THRESHOLD = "minimal_threshold";
  private ObservabilityPipelineSpikeProtectionProcessorMinimalThreshold minimalThreshold;

  public ObservabilityPipelineSpikeProtectionProcessorThresholdOverride() {}

  @JsonCreator
  public ObservabilityPipelineSpikeProtectionProcessorThresholdOverride(
      @JsonProperty(required = true, value = JSON_PROPERTY_FIELDS)
          List<ObservabilityPipelineFieldValue> fields,
      @JsonProperty(required = true, value = JSON_PROPERTY_MINIMAL_THRESHOLD)
          ObservabilityPipelineSpikeProtectionProcessorMinimalThreshold minimalThreshold) {
    this.fields = fields;
    for (ObservabilityPipelineFieldValue item : fields) {
      this.unparsed |= item.unparsed;
    }
    this.minimalThreshold = minimalThreshold;
    this.unparsed |= minimalThreshold.unparsed;
  }

  public ObservabilityPipelineSpikeProtectionProcessorThresholdOverride fields(
      List<ObservabilityPipelineFieldValue> fields) {
    this.fields = fields;
    for (ObservabilityPipelineFieldValue item : fields) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }

  public ObservabilityPipelineSpikeProtectionProcessorThresholdOverride addFieldsItem(
      ObservabilityPipelineFieldValue fieldsItem) {
    this.fields.add(fieldsItem);
    this.unparsed |= fieldsItem.unparsed;
    return this;
  }

  /**
   * The set of field matchers that identifies the partition this override applies to. Every field
   * name listed must also appear in <code>partition_fields</code>.
   *
   * @return fields
   */
  @JsonProperty(JSON_PROPERTY_FIELDS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public List<ObservabilityPipelineFieldValue> getFields() {
    return fields;
  }

  public void setFields(List<ObservabilityPipelineFieldValue> fields) {
    this.fields = fields;
    if (fields != null) {
      for (ObservabilityPipelineFieldValue item : fields) {
        this.unparsed |= item.unparsed;
      }
    }
  }

  public ObservabilityPipelineSpikeProtectionProcessorThresholdOverride minimalThreshold(
      ObservabilityPipelineSpikeProtectionProcessorMinimalThreshold minimalThreshold) {
    this.minimalThreshold = minimalThreshold;
    this.unparsed |= minimalThreshold.unparsed;
    return this;
  }

  /**
   * The minimal threshold to apply to the matching partition.
   *
   * @return minimalThreshold
   */
  @JsonProperty(JSON_PROPERTY_MINIMAL_THRESHOLD)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public ObservabilityPipelineSpikeProtectionProcessorMinimalThreshold getMinimalThreshold() {
    return minimalThreshold;
  }

  public void setMinimalThreshold(
      ObservabilityPipelineSpikeProtectionProcessorMinimalThreshold minimalThreshold) {
    this.minimalThreshold = minimalThreshold;
    if (minimalThreshold != null) {
      this.unparsed |= minimalThreshold.unparsed;
    }
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
   * @return ObservabilityPipelineSpikeProtectionProcessorThresholdOverride
   */
  @JsonAnySetter
  public ObservabilityPipelineSpikeProtectionProcessorThresholdOverride putAdditionalProperty(
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

  /**
   * Return true if this ObservabilityPipelineSpikeProtectionProcessorThresholdOverride object is
   * equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ObservabilityPipelineSpikeProtectionProcessorThresholdOverride
        observabilityPipelineSpikeProtectionProcessorThresholdOverride =
            (ObservabilityPipelineSpikeProtectionProcessorThresholdOverride) o;
    return Objects.equals(
            this.fields, observabilityPipelineSpikeProtectionProcessorThresholdOverride.fields)
        && Objects.equals(
            this.minimalThreshold,
            observabilityPipelineSpikeProtectionProcessorThresholdOverride.minimalThreshold)
        && Objects.equals(
            this.additionalProperties,
            observabilityPipelineSpikeProtectionProcessorThresholdOverride.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fields, minimalThreshold, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ObservabilityPipelineSpikeProtectionProcessorThresholdOverride {\n");
    sb.append("    fields: ").append(toIndentedString(fields)).append("\n");
    sb.append("    minimalThreshold: ").append(toIndentedString(minimalThreshold)).append("\n");
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
