/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v2.model;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/** */
@JsonPropertyOrder({
  FunnelResponseDataAttributes.JSON_PROPERTY_END_TO_END_CONVERSION_RATE,
  FunnelResponseDataAttributes.JSON_PROPERTY_END_TO_END_ELAPSED_TIME,
  FunnelResponseDataAttributes.JSON_PROPERTY_FUNNEL_STEPS,
  FunnelResponseDataAttributes.JSON_PROPERTY_INITIAL_COUNT
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class FunnelResponseDataAttributes {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_END_TO_END_CONVERSION_RATE =
      "end_to_end_conversion_rate";
  private Double endToEndConversionRate;

  public static final String JSON_PROPERTY_END_TO_END_ELAPSED_TIME = "end_to_end_elapsed_time";
  private FunnelResponseElapsedTime endToEndElapsedTime;

  public static final String JSON_PROPERTY_FUNNEL_STEPS = "funnel_steps";
  private List<FunnelResponseDataAttributesFunnelStepsItems> funnelSteps = null;

  public static final String JSON_PROPERTY_INITIAL_COUNT = "initial_count";
  private Long initialCount;

  public FunnelResponseDataAttributes endToEndConversionRate(Double endToEndConversionRate) {
    this.endToEndConversionRate = endToEndConversionRate;
    return this;
  }

  /**
   * GetendToEndConversionRate
   *
   * @return endToEndConversionRate
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_END_TO_END_CONVERSION_RATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getEndToEndConversionRate() {
    return endToEndConversionRate;
  }

  public void setEndToEndConversionRate(Double endToEndConversionRate) {
    this.endToEndConversionRate = endToEndConversionRate;
  }

  public FunnelResponseDataAttributes endToEndElapsedTime(
      FunnelResponseElapsedTime endToEndElapsedTime) {
    this.endToEndElapsedTime = endToEndElapsedTime;
    this.unparsed |= endToEndElapsedTime.unparsed;
    return this;
  }

  /**
   * GetendToEndElapsedTime
   *
   * @return endToEndElapsedTime
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_END_TO_END_ELAPSED_TIME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public FunnelResponseElapsedTime getEndToEndElapsedTime() {
    return endToEndElapsedTime;
  }

  public void setEndToEndElapsedTime(FunnelResponseElapsedTime endToEndElapsedTime) {
    this.endToEndElapsedTime = endToEndElapsedTime;
  }

  public FunnelResponseDataAttributes funnelSteps(
      List<FunnelResponseDataAttributesFunnelStepsItems> funnelSteps) {
    this.funnelSteps = funnelSteps;
    for (FunnelResponseDataAttributesFunnelStepsItems item : funnelSteps) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }

  public FunnelResponseDataAttributes addFunnelStepsItem(
      FunnelResponseDataAttributesFunnelStepsItems funnelStepsItem) {
    if (this.funnelSteps == null) {
      this.funnelSteps = new ArrayList<>();
    }
    this.funnelSteps.add(funnelStepsItem);
    this.unparsed |= funnelStepsItem.unparsed;
    return this;
  }

  /**
   * GetfunnelSteps
   *
   * @return funnelSteps
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_FUNNEL_STEPS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<FunnelResponseDataAttributesFunnelStepsItems> getFunnelSteps() {
    return funnelSteps;
  }

  public void setFunnelSteps(List<FunnelResponseDataAttributesFunnelStepsItems> funnelSteps) {
    this.funnelSteps = funnelSteps;
  }

  public FunnelResponseDataAttributes initialCount(Long initialCount) {
    this.initialCount = initialCount;
    return this;
  }

  /**
   * GetinitialCount
   *
   * @return initialCount
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_INITIAL_COUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getInitialCount() {
    return initialCount;
  }

  public void setInitialCount(Long initialCount) {
    this.initialCount = initialCount;
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
   * @return FunnelResponseDataAttributes
   */
  @JsonAnySetter
  public FunnelResponseDataAttributes putAdditionalProperty(String key, Object value) {
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

  /** Return true if this FunnelResponseDataAttributes object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FunnelResponseDataAttributes funnelResponseDataAttributes = (FunnelResponseDataAttributes) o;
    return Objects.equals(
            this.endToEndConversionRate, funnelResponseDataAttributes.endToEndConversionRate)
        && Objects.equals(
            this.endToEndElapsedTime, funnelResponseDataAttributes.endToEndElapsedTime)
        && Objects.equals(this.funnelSteps, funnelResponseDataAttributes.funnelSteps)
        && Objects.equals(this.initialCount, funnelResponseDataAttributes.initialCount)
        && Objects.equals(
            this.additionalProperties, funnelResponseDataAttributes.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        endToEndConversionRate,
        endToEndElapsedTime,
        funnelSteps,
        initialCount,
        additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FunnelResponseDataAttributes {\n");
    sb.append("    endToEndConversionRate: ")
        .append(toIndentedString(endToEndConversionRate))
        .append("\n");
    sb.append("    endToEndElapsedTime: ")
        .append(toIndentedString(endToEndElapsedTime))
        .append("\n");
    sb.append("    funnelSteps: ").append(toIndentedString(funnelSteps)).append("\n");
    sb.append("    initialCount: ").append(toIndentedString(initialCount)).append("\n");
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
