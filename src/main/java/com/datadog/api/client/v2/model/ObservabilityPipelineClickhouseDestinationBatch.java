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
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/** Batching configuration for ClickHouse inserts. */
@JsonPropertyOrder({
  ObservabilityPipelineClickhouseDestinationBatch.JSON_PROPERTY_MAX_EVENTS,
  ObservabilityPipelineClickhouseDestinationBatch.JSON_PROPERTY_TIMEOUT_SECS
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class ObservabilityPipelineClickhouseDestinationBatch {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_MAX_EVENTS = "max_events";
  private Long maxEvents;

  public static final String JSON_PROPERTY_TIMEOUT_SECS = "timeout_secs";
  private Long timeoutSecs;

  public ObservabilityPipelineClickhouseDestinationBatch maxEvents(Long maxEvents) {
    this.maxEvents = maxEvents;
    return this;
  }

  /**
   * Maximum number of events per batch before it is flushed. minimum: 1
   *
   * @return maxEvents
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_MAX_EVENTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getMaxEvents() {
    return maxEvents;
  }

  public void setMaxEvents(Long maxEvents) {
    this.maxEvents = maxEvents;
  }

  public ObservabilityPipelineClickhouseDestinationBatch timeoutSecs(Long timeoutSecs) {
    this.timeoutSecs = timeoutSecs;
    return this;
  }

  /**
   * Maximum number of seconds to wait before flushing a partial batch. minimum: 1 maximum: 65535
   *
   * @return timeoutSecs
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TIMEOUT_SECS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getTimeoutSecs() {
    return timeoutSecs;
  }

  public void setTimeoutSecs(Long timeoutSecs) {
    this.timeoutSecs = timeoutSecs;
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
   * @return ObservabilityPipelineClickhouseDestinationBatch
   */
  @JsonAnySetter
  public ObservabilityPipelineClickhouseDestinationBatch putAdditionalProperty(
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

  /** Return true if this ObservabilityPipelineClickhouseDestinationBatch object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ObservabilityPipelineClickhouseDestinationBatch
        observabilityPipelineClickhouseDestinationBatch =
            (ObservabilityPipelineClickhouseDestinationBatch) o;
    return Objects.equals(this.maxEvents, observabilityPipelineClickhouseDestinationBatch.maxEvents)
        && Objects.equals(
            this.timeoutSecs, observabilityPipelineClickhouseDestinationBatch.timeoutSecs)
        && Objects.equals(
            this.additionalProperties,
            observabilityPipelineClickhouseDestinationBatch.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(maxEvents, timeoutSecs, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ObservabilityPipelineClickhouseDestinationBatch {\n");
    sb.append("    maxEvents: ").append(toIndentedString(maxEvents)).append("\n");
    sb.append("    timeoutSecs: ").append(toIndentedString(timeoutSecs)).append("\n");
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
