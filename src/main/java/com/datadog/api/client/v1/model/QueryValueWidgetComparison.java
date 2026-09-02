/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v1.model;

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

/** A change indicator that compares the current value to a historical period. */
@JsonPropertyOrder({
  QueryValueWidgetComparison.JSON_PROPERTY_DIRECTIONALITY,
  QueryValueWidgetComparison.JSON_PROPERTY_DURATION,
  QueryValueWidgetComparison.JSON_PROPERTY_TYPE
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class QueryValueWidgetComparison {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_DIRECTIONALITY = "directionality";
  private QueryValueWidgetComparisonDirectionality directionality =
      QueryValueWidgetComparisonDirectionality.NEUTRAL;

  public static final String JSON_PROPERTY_DURATION = "duration";
  private ComparisonDuration duration;

  public static final String JSON_PROPERTY_TYPE = "type";
  private QueryValueWidgetComparisonType type = QueryValueWidgetComparisonType.ABSOLUTE;

  public QueryValueWidgetComparison() {}

  @JsonCreator
  public QueryValueWidgetComparison(
      @JsonProperty(required = true, value = JSON_PROPERTY_DURATION) ComparisonDuration duration) {
    this.duration = duration;
    this.unparsed |= duration.unparsed;
  }

  public QueryValueWidgetComparison directionality(
      QueryValueWidgetComparisonDirectionality directionality) {
    this.directionality = directionality;
    this.unparsed |= !directionality.isValid();
    return this;
  }

  /**
   * Color-coding direction: <code>increase_better</code> (green on rise), <code>decrease_better
   * </code> (green on drop), or <code>neutral</code> (no color).
   *
   * @return directionality
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DIRECTIONALITY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public QueryValueWidgetComparisonDirectionality getDirectionality() {
    return directionality;
  }

  public void setDirectionality(QueryValueWidgetComparisonDirectionality directionality) {
    if (!directionality.isValid()) {
      this.unparsed = true;
    }
    this.directionality = directionality;
  }

  public QueryValueWidgetComparison duration(ComparisonDuration duration) {
    this.duration = duration;
    this.unparsed |= duration.unparsed;
    return this;
  }

  /**
   * The comparison period. Use a preset <code>type</code> value or set <code>type</code> to <code>
   * custom_timeframe</code> and provide <code>custom_timeframe</code> with explicit millisecond
   * epoch bounds.
   *
   * @return duration
   */
  @JsonProperty(JSON_PROPERTY_DURATION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public ComparisonDuration getDuration() {
    return duration;
  }

  public void setDuration(ComparisonDuration duration) {
    this.duration = duration;
    if (duration != null) {
      this.unparsed |= duration.unparsed;
    }
  }

  public QueryValueWidgetComparison type(QueryValueWidgetComparisonType type) {
    this.type = type;
    this.unparsed |= !type.isValid();
    return this;
  }

  /**
   * How the delta is expressed: <code>absolute</code> (raw difference), <code>relative</code>
   * (percentage), or <code>both</code>.
   *
   * @return type
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public QueryValueWidgetComparisonType getType() {
    return type;
  }

  public void setType(QueryValueWidgetComparisonType type) {
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
   * @return QueryValueWidgetComparison
   */
  @JsonAnySetter
  public QueryValueWidgetComparison putAdditionalProperty(String key, Object value) {
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

  /** Return true if this QueryValueWidgetComparison object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    QueryValueWidgetComparison queryValueWidgetComparison = (QueryValueWidgetComparison) o;
    return Objects.equals(this.directionality, queryValueWidgetComparison.directionality)
        && Objects.equals(this.duration, queryValueWidgetComparison.duration)
        && Objects.equals(this.type, queryValueWidgetComparison.type)
        && Objects.equals(
            this.additionalProperties, queryValueWidgetComparison.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(directionality, duration, type, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class QueryValueWidgetComparison {\n");
    sb.append("    directionality: ").append(toIndentedString(directionality)).append("\n");
    sb.append("    duration: ").append(toIndentedString(duration)).append("\n");
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
