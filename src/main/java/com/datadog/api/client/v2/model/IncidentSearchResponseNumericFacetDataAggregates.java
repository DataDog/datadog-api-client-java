/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v2.model;

import java.io.File;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;
import java.util.HashMap;
import java.util.Map;
import java.util.List;
import java.util.ArrayList;
import java.time.OffsetDateTime;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import org.openapitools.jackson.nullable.JsonNullable;

import com.datadog.api.client.JsonTimeSerializer;


/**
   * <p>Aggregate information for numeric incident data.</p>
 */
@JsonPropertyOrder({
  IncidentSearchResponseNumericFacetDataAggregates.JSON_PROPERTY_MAX,
  IncidentSearchResponseNumericFacetDataAggregates.JSON_PROPERTY_MIN
})
@jakarta.annotation.Generated(value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class IncidentSearchResponseNumericFacetDataAggregates {
  @JsonIgnore
  public boolean unparsed = false;
  public static final String JSON_PROPERTY_MAX = "max";
  private JsonNullable<Double> max = JsonNullable.<Double>undefined();

  public static final String JSON_PROPERTY_MIN = "min";
  private JsonNullable<Double> min = JsonNullable.<Double>undefined();

  public IncidentSearchResponseNumericFacetDataAggregates max(Double max) {
    this.max = JsonNullable.<Double>of(max);
    return this;
  }

  /**
   * <p>Maximum value of the numeric aggregates.</p>
   * @return max
  **/
      @jakarta.annotation.Nullable
      @JsonIgnore
      public Double getMax() {
        return max.orElse(null);
      }
  @JsonProperty(JSON_PROPERTY_MAX)
  @JsonInclude(
    value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<Double> getMax_JsonNullable() {
    return max;
  }
  @JsonProperty(JSON_PROPERTY_MAX)public void setMax_JsonNullable(JsonNullable<Double> max) {
    this.max = max;
  }
  public void setMax(Double max) {
    this.max = JsonNullable.<Double>of(max);
  }
  public IncidentSearchResponseNumericFacetDataAggregates min(Double min) {
    this.min = JsonNullable.<Double>of(min);
    return this;
  }

  /**
   * <p>Minimum value of the numeric aggregates.</p>
   * @return min
  **/
      @jakarta.annotation.Nullable
      @JsonIgnore
      public Double getMin() {
        return min.orElse(null);
      }
  @JsonProperty(JSON_PROPERTY_MIN)
  @JsonInclude(
    value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<Double> getMin_JsonNullable() {
    return min;
  }
  @JsonProperty(JSON_PROPERTY_MIN)public void setMin_JsonNullable(JsonNullable<Double> min) {
    this.min = min;
  }
  public void setMin(Double min) {
    this.min = JsonNullable.<Double>of(min);
  }

  /**
   * Return true if this IncidentSearchResponseNumericFacetDataAggregates object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IncidentSearchResponseNumericFacetDataAggregates incidentSearchResponseNumericFacetDataAggregates = (IncidentSearchResponseNumericFacetDataAggregates) o;
    return Objects.equals(this.max, incidentSearchResponseNumericFacetDataAggregates.max) && Objects.equals(this.min, incidentSearchResponseNumericFacetDataAggregates.min);
  }


  @Override
  public int hashCode() {
    return Objects.hash(max,min);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IncidentSearchResponseNumericFacetDataAggregates {\n");
    sb.append("    max: ").append(toIndentedString(max)).append("\n");
    sb.append("    min: ").append(toIndentedString(min)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
