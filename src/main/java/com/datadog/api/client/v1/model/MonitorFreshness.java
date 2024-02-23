/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v1.model;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import org.openapitools.jackson.nullable.JsonNullable;

/**
 * The freshness of the monitor, indicating if the monitor evaluation is up to date. <strong>This
 * feature is currently in private beta.</strong>
 */
@JsonPropertyOrder({
  MonitorFreshness.JSON_PROPERTY_ERROR,
  MonitorFreshness.JSON_PROPERTY_IS_FRESH,
  MonitorFreshness.JSON_PROPERTY_LAST_EVALUATED
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class MonitorFreshness {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_ERROR = "error";
  private JsonNullable<String> error = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_IS_FRESH = "is_fresh";
  private Boolean isFresh;

  public static final String JSON_PROPERTY_LAST_EVALUATED = "last_evaluated";
  private OffsetDateTime lastEvaluated;

  public MonitorFreshness error(String error) {
    this.error = JsonNullable.<String>of(error);
    return this;
  }

  /**
   * The error message if the monitor freshness was not able to be determined.
   *
   * @return error
   */
  @jakarta.annotation.Nullable
  @JsonIgnore
  public String getError() {
    return error.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_ERROR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<String> getError_JsonNullable() {
    return error;
  }

  @JsonProperty(JSON_PROPERTY_ERROR)
  public void setError_JsonNullable(JsonNullable<String> error) {
    this.error = error;
  }

  public void setError(String error) {
    this.error = JsonNullable.<String>of(error);
  }

  public MonitorFreshness isFresh(Boolean isFresh) {
    this.isFresh = isFresh;
    return this;
  }

  /**
   * Whether the monitor evaluation is up to date.
   *
   * @return isFresh
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_IS_FRESH)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getIsFresh() {
    return isFresh;
  }

  public void setIsFresh(Boolean isFresh) {
    this.isFresh = isFresh;
  }

  public MonitorFreshness lastEvaluated(OffsetDateTime lastEvaluated) {
    this.lastEvaluated = lastEvaluated;
    return this;
  }

  /**
   * The timestamp of the last evaluation.
   *
   * @return lastEvaluated
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LAST_EVALUATED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public OffsetDateTime getLastEvaluated() {
    return lastEvaluated;
  }

  public void setLastEvaluated(OffsetDateTime lastEvaluated) {
    this.lastEvaluated = lastEvaluated;
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
   * @return MonitorFreshness
   */
  @JsonAnySetter
  public MonitorFreshness putAdditionalProperty(String key, Object value) {
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

  /** Return true if this MonitorFreshness object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MonitorFreshness monitorFreshness = (MonitorFreshness) o;
    return Objects.equals(this.error, monitorFreshness.error)
        && Objects.equals(this.isFresh, monitorFreshness.isFresh)
        && Objects.equals(this.lastEvaluated, monitorFreshness.lastEvaluated)
        && Objects.equals(this.additionalProperties, monitorFreshness.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(error, isFresh, lastEvaluated, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MonitorFreshness {\n");
    sb.append("    error: ").append(toIndentedString(error)).append("\n");
    sb.append("    isFresh: ").append(toIndentedString(isFresh)).append("\n");
    sb.append("    lastEvaluated: ").append(toIndentedString(lastEvaluated)).append("\n");
    sb.append("    additionalProperties: ")
        .append(toIndentedString(additionalProperties))
        .append("\n");
    sb.append("}");
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
