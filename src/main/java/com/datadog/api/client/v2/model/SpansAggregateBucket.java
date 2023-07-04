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

/** A bucket values. */
@JsonPropertyOrder({
  SpansAggregateBucket.JSON_PROPERTY_BY,
  SpansAggregateBucket.JSON_PROPERTY_COMPUTES
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class SpansAggregateBucket {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_BY = "by";
  private Map<String, Object> by = null;

  public static final String JSON_PROPERTY_COMPUTES = "computes";
  private Map<String, SpansAggregateBucketValue> computes = null;

  public SpansAggregateBucket by(Map<String, Object> by) {
    this.by = by;
    return this;
  }

  public SpansAggregateBucket putByItem(String key, Object byItem) {
    if (this.by == null) {
      this.by = new HashMap<>();
    }
    this.by.put(key, byItem);
    return this;
  }

  /**
   * The key, value pairs for each group by.
   *
   * @return by
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_BY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Map<String, Object> getBy() {
    return by;
  }

  public void setBy(Map<String, Object> by) {
    this.by = by;
  }

  public SpansAggregateBucket computes(Map<String, SpansAggregateBucketValue> computes) {
    this.computes = computes;
    return this;
  }

  public SpansAggregateBucket putComputesItem(String key, SpansAggregateBucketValue computesItem) {
    if (this.computes == null) {
      this.computes = new HashMap<>();
    }
    this.computes.put(key, computesItem);
    return this;
  }

  /**
   * A map of the metric name -&gt; value for regular compute or list of values for a timeseries.
   *
   * @return computes
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_COMPUTES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Map<String, SpansAggregateBucketValue> getComputes() {
    return computes;
  }

  public void setComputes(Map<String, SpansAggregateBucketValue> computes) {
    this.computes = computes;
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
   * @return SpansAggregateBucket
   */
  @JsonAnySetter
  public SpansAggregateBucket putAdditionalProperty(String key, Object value) {
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

  /** Return true if this SpansAggregateBucket object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SpansAggregateBucket spansAggregateBucket = (SpansAggregateBucket) o;
    return Objects.equals(this.by, spansAggregateBucket.by)
        && Objects.equals(this.computes, spansAggregateBucket.computes)
        && Objects.equals(this.additionalProperties, spansAggregateBucket.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(by, computes, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SpansAggregateBucket {\n");
    sb.append("    by: ").append(toIndentedString(by)).append("\n");
    sb.append("    computes: ").append(toIndentedString(computes)).append("\n");
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
