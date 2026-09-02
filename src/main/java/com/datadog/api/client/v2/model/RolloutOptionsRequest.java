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
import org.openapitools.jackson.nullable.JsonNullable;

/** Rollout options request payload. */
@JsonPropertyOrder({
  RolloutOptionsRequest.JSON_PROPERTY_AUTOSTART,
  RolloutOptionsRequest.JSON_PROPERTY_SELECTION_INTERVAL_MS,
  RolloutOptionsRequest.JSON_PROPERTY_STRATEGY
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class RolloutOptionsRequest {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_AUTOSTART = "autostart";
  private JsonNullable<Boolean> autostart = JsonNullable.<Boolean>undefined();

  public static final String JSON_PROPERTY_SELECTION_INTERVAL_MS = "selection_interval_ms";
  private Long selectionIntervalMs;

  public static final String JSON_PROPERTY_STRATEGY = "strategy";
  private RolloutStrategy strategy;

  public RolloutOptionsRequest() {}

  @JsonCreator
  public RolloutOptionsRequest(
      @JsonProperty(required = true, value = JSON_PROPERTY_STRATEGY) RolloutStrategy strategy) {
    this.strategy = strategy;
    this.unparsed |= !strategy.isValid();
  }

  public RolloutOptionsRequest autostart(Boolean autostart) {
    this.autostart = JsonNullable.<Boolean>of(autostart);
    return this;
  }

  /**
   * Whether the schedule should begin automatically.
   *
   * @return autostart
   */
  @jakarta.annotation.Nullable
  @JsonIgnore
  public Boolean getAutostart() {
    return autostart.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_AUTOSTART)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<Boolean> getAutostart_JsonNullable() {
    return autostart;
  }

  @JsonProperty(JSON_PROPERTY_AUTOSTART)
  public void setAutostart_JsonNullable(JsonNullable<Boolean> autostart) {
    this.autostart = autostart;
  }

  public void setAutostart(Boolean autostart) {
    this.autostart = JsonNullable.<Boolean>of(autostart);
  }

  public RolloutOptionsRequest selectionIntervalMs(Long selectionIntervalMs) {
    this.selectionIntervalMs = selectionIntervalMs;
    return this;
  }

  /**
   * Interval in milliseconds for uniform interval strategies.
   *
   * @return selectionIntervalMs
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SELECTION_INTERVAL_MS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getSelectionIntervalMs() {
    return selectionIntervalMs;
  }

  public void setSelectionIntervalMs(Long selectionIntervalMs) {
    this.selectionIntervalMs = selectionIntervalMs;
  }

  public RolloutOptionsRequest strategy(RolloutStrategy strategy) {
    this.strategy = strategy;
    this.unparsed |= !strategy.isValid();
    return this;
  }

  /**
   * The progression strategy used by a progressive rollout.
   *
   * @return strategy
   */
  @JsonProperty(JSON_PROPERTY_STRATEGY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public RolloutStrategy getStrategy() {
    return strategy;
  }

  public void setStrategy(RolloutStrategy strategy) {
    if (!strategy.isValid()) {
      this.unparsed = true;
    }
    this.strategy = strategy;
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
   * @return RolloutOptionsRequest
   */
  @JsonAnySetter
  public RolloutOptionsRequest putAdditionalProperty(String key, Object value) {
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

  /** Return true if this RolloutOptionsRequest object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RolloutOptionsRequest rolloutOptionsRequest = (RolloutOptionsRequest) o;
    return Objects.equals(this.autostart, rolloutOptionsRequest.autostart)
        && Objects.equals(this.selectionIntervalMs, rolloutOptionsRequest.selectionIntervalMs)
        && Objects.equals(this.strategy, rolloutOptionsRequest.strategy)
        && Objects.equals(this.additionalProperties, rolloutOptionsRequest.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(autostart, selectionIntervalMs, strategy, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RolloutOptionsRequest {\n");
    sb.append("    autostart: ").append(toIndentedString(autostart)).append("\n");
    sb.append("    selectionIntervalMs: ")
        .append(toIndentedString(selectionIntervalMs))
        .append("\n");
    sb.append("    strategy: ").append(toIndentedString(strategy)).append("\n");
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
