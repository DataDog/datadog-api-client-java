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
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/** A cardinality override for a specific tag key within a per-metric limit. */
@JsonPropertyOrder({
  ObservabilityPipelineTagCardinalityLimitProcessorPerTagLimit.JSON_PROPERTY_MODE,
  ObservabilityPipelineTagCardinalityLimitProcessorPerTagLimit.JSON_PROPERTY_TAG_KEY,
  ObservabilityPipelineTagCardinalityLimitProcessorPerTagLimit.JSON_PROPERTY_VALUE_LIMIT
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class ObservabilityPipelineTagCardinalityLimitProcessorPerTagLimit {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_MODE = "mode";
  private ObservabilityPipelineTagCardinalityLimitProcessorPerTagMode mode;

  public static final String JSON_PROPERTY_TAG_KEY = "tag_key";
  private String tagKey;

  public static final String JSON_PROPERTY_VALUE_LIMIT = "value_limit";
  private Long valueLimit;

  public ObservabilityPipelineTagCardinalityLimitProcessorPerTagLimit() {}

  @JsonCreator
  public ObservabilityPipelineTagCardinalityLimitProcessorPerTagLimit(
      @JsonProperty(required = true, value = JSON_PROPERTY_MODE)
          ObservabilityPipelineTagCardinalityLimitProcessorPerTagMode mode,
      @JsonProperty(required = true, value = JSON_PROPERTY_TAG_KEY) String tagKey) {
    this.mode = mode;
    this.unparsed |= !mode.isValid();
    this.tagKey = tagKey;
  }

  public ObservabilityPipelineTagCardinalityLimitProcessorPerTagLimit mode(
      ObservabilityPipelineTagCardinalityLimitProcessorPerTagMode mode) {
    this.mode = mode;
    this.unparsed |= !mode.isValid();
    return this;
  }

  /**
   * How the per-tag override is applied. <code>limit_override</code> enforces a custom limit on the
   * tag; <code>excluded</code> skips the tag from cardinality tracking.
   *
   * @return mode
   */
  @JsonProperty(JSON_PROPERTY_MODE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public ObservabilityPipelineTagCardinalityLimitProcessorPerTagMode getMode() {
    return mode;
  }

  public void setMode(ObservabilityPipelineTagCardinalityLimitProcessorPerTagMode mode) {
    if (!mode.isValid()) {
      this.unparsed = true;
    }
    this.mode = mode;
  }

  public ObservabilityPipelineTagCardinalityLimitProcessorPerTagLimit tagKey(String tagKey) {
    this.tagKey = tagKey;
    return this;
  }

  /**
   * The tag key this override applies to.
   *
   * @return tagKey
   */
  @JsonProperty(JSON_PROPERTY_TAG_KEY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getTagKey() {
    return tagKey;
  }

  public void setTagKey(String tagKey) {
    this.tagKey = tagKey;
  }

  public ObservabilityPipelineTagCardinalityLimitProcessorPerTagLimit valueLimit(Long valueLimit) {
    this.valueLimit = valueLimit;
    return this;
  }

  /**
   * The maximum number of distinct values allowed for this tag. Required when <code>mode</code> is
   * <code>limit_override</code>. Must be omitted when <code>mode</code> is <code>excluded</code>.
   * minimum: 0 maximum: 1000000
   *
   * @return valueLimit
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_VALUE_LIMIT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getValueLimit() {
    return valueLimit;
  }

  public void setValueLimit(Long valueLimit) {
    this.valueLimit = valueLimit;
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
   * @return ObservabilityPipelineTagCardinalityLimitProcessorPerTagLimit
   */
  @JsonAnySetter
  public ObservabilityPipelineTagCardinalityLimitProcessorPerTagLimit putAdditionalProperty(
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
   * Return true if this ObservabilityPipelineTagCardinalityLimitProcessorPerTagLimit object is
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
    ObservabilityPipelineTagCardinalityLimitProcessorPerTagLimit
        observabilityPipelineTagCardinalityLimitProcessorPerTagLimit =
            (ObservabilityPipelineTagCardinalityLimitProcessorPerTagLimit) o;
    return Objects.equals(
            this.mode, observabilityPipelineTagCardinalityLimitProcessorPerTagLimit.mode)
        && Objects.equals(
            this.tagKey, observabilityPipelineTagCardinalityLimitProcessorPerTagLimit.tagKey)
        && Objects.equals(
            this.valueLimit,
            observabilityPipelineTagCardinalityLimitProcessorPerTagLimit.valueLimit)
        && Objects.equals(
            this.additionalProperties,
            observabilityPipelineTagCardinalityLimitProcessorPerTagLimit.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(mode, tagKey, valueLimit, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ObservabilityPipelineTagCardinalityLimitProcessorPerTagLimit {\n");
    sb.append("    mode: ").append(toIndentedString(mode)).append("\n");
    sb.append("    tagKey: ").append(toIndentedString(tagKey)).append("\n");
    sb.append("    valueLimit: ").append(toIndentedString(valueLimit)).append("\n");
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
