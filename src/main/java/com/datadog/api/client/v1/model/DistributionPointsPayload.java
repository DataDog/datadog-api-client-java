/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v1.model;

import java.io.File;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;
import java.util.HashMap;
import java.util.Map;
import java.util.List;
import java.util.ArrayList;
import java.util.UUID;
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
   * <p>The distribution points payload.</p>
 */
@JsonPropertyOrder({
  DistributionPointsPayload.JSON_PROPERTY_SERIES
})
@jakarta.annotation.Generated(value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class DistributionPointsPayload {
  @JsonIgnore
  public boolean unparsed = false;
  public static final String JSON_PROPERTY_SERIES = "series";
  private List<DistributionPointsSeries> series = new ArrayList<>();

  public DistributionPointsPayload() {}

  @JsonCreator
  public DistributionPointsPayload(
            @JsonProperty(required=true, value=JSON_PROPERTY_SERIES)List<DistributionPointsSeries> series) {
        this.series = series;
  }
  public DistributionPointsPayload series(List<DistributionPointsSeries> series) {
    this.series = series;
    for (DistributionPointsSeries item : series) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }
  public DistributionPointsPayload addSeriesItem(DistributionPointsSeries seriesItem) {
    this.series.add(seriesItem);
    this.unparsed |= seriesItem.unparsed;
    return this;
  }

  /**
   * <p>A list of distribution points series to submit to Datadog.</p>
   * @return series
  **/
      @JsonProperty(JSON_PROPERTY_SERIES)
      @JsonInclude(
        value = JsonInclude.Include.ALWAYS)
      public List<DistributionPointsSeries> getSeries() {
        return series;
      }
  public void setSeries(List<DistributionPointsSeries> series) {
    this.series = series;
  }

  /**
   * A container for additional, undeclared properties.
   * This is a holder for any undeclared properties as specified with
   * the 'additionalProperties' keyword in the OAS document.
   */
  private Map<String, Object> additionalProperties;

  /**
   * Set the additional (undeclared) property with the specified name and value.
   * If the property does not already exist, create it otherwise replace it.
   *
   * @param key The arbitrary key to set
   * @param value The associated value
   * @return DistributionPointsPayload
   */
  @JsonAnySetter
  public DistributionPointsPayload putAdditionalProperty(String key, Object value) {
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
   * Return true if this DistributionPointsPayload object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DistributionPointsPayload distributionPointsPayload = (DistributionPointsPayload) o;
    return Objects.equals(this.series, distributionPointsPayload.series) && Objects.equals(this.additionalProperties, distributionPointsPayload.additionalProperties);
  }


  @Override
  public int hashCode() {
    return Objects.hash(series, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DistributionPointsPayload {\n");
    sb.append("    series: ").append(toIndentedString(series)).append("\n");
    sb.append("    additionalProperties: ")
        .append(toIndentedString(additionalProperties))
        .append("\n");
    sb.append('}');
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
