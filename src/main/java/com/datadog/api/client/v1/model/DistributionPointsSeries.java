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
   * <p>A distribution points metric to submit to Datadog.</p>
 */
@JsonPropertyOrder({
  DistributionPointsSeries.JSON_PROPERTY_HOST,
  DistributionPointsSeries.JSON_PROPERTY_METRIC,
  DistributionPointsSeries.JSON_PROPERTY_POINTS,
  DistributionPointsSeries.JSON_PROPERTY_TAGS,
  DistributionPointsSeries.JSON_PROPERTY_TYPE
})
@jakarta.annotation.Generated(value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class DistributionPointsSeries {
  @JsonIgnore
  public boolean unparsed = false;
  public static final String JSON_PROPERTY_HOST = "host";
  private String host;

  public static final String JSON_PROPERTY_METRIC = "metric";
  private String metric;

  public static final String JSON_PROPERTY_POINTS = "points";
  private List<List<DistributionPointItem>> points = new ArrayList<>();

  public static final String JSON_PROPERTY_TAGS = "tags";
  private List<String> tags = null;

  public static final String JSON_PROPERTY_TYPE = "type";
  private DistributionPointsType type = DistributionPointsType.DISTRIBUTION;

  public DistributionPointsSeries() {}

  @JsonCreator
  public DistributionPointsSeries(
            @JsonProperty(required=true, value=JSON_PROPERTY_METRIC)String metric,
            @JsonProperty(required=true, value=JSON_PROPERTY_POINTS)List<List<DistributionPointItem>> points) {
        this.metric = metric;
        this.points = points;
  }
  public DistributionPointsSeries host(String host) {
    this.host = host;
    return this;
  }

  /**
   * <p>The name of the host that produced the distribution point metric.</p>
   * @return host
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_HOST)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public String getHost() {
        return host;
      }
  public void setHost(String host) {
    this.host = host;
  }
  public DistributionPointsSeries metric(String metric) {
    this.metric = metric;
    return this;
  }

  /**
   * <p>The name of the distribution points metric.</p>
   * @return metric
  **/
      @JsonProperty(JSON_PROPERTY_METRIC)
      @JsonInclude(
        value = JsonInclude.Include.ALWAYS)
      public String getMetric() {
        return metric;
      }
  public void setMetric(String metric) {
    this.metric = metric;
  }
  public DistributionPointsSeries points(List<List<DistributionPointItem>> points) {
    this.points = points;
    return this;
  }
  public DistributionPointsSeries addPointsItem(List<DistributionPointItem> pointsItem) {
    this.points.add(pointsItem);
    return this;
  }

  /**
   * <p>Points relating to the distribution point metric. All points must be tuples with timestamp and a list of values (cannot be a string). Timestamps should be in POSIX time in seconds.</p>
   * @return points
  **/
      @JsonProperty(JSON_PROPERTY_POINTS)
      @JsonInclude(
        value = JsonInclude.Include.ALWAYS)
      public List<List<DistributionPointItem>> getPoints() {
        return points;
      }
  public void setPoints(List<List<DistributionPointItem>> points) {
    this.points = points;
  }
  public DistributionPointsSeries tags(List<String> tags) {
    this.tags = tags;
    return this;
  }
  public DistributionPointsSeries addTagsItem(String tagsItem) {
    if (this.tags == null) {
      this.tags = new ArrayList<>();
    }
    this.tags.add(tagsItem);
    return this;
  }

  /**
   * <p>A list of tags associated with the distribution point metric.</p>
   * @return tags
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_TAGS)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public List<String> getTags() {
        return tags;
      }
  public void setTags(List<String> tags) {
    this.tags = tags;
  }
  public DistributionPointsSeries type(DistributionPointsType type) {
    this.type = type;
    this.unparsed |= !type.isValid();
    return this;
  }

  /**
   * <p>The type of the distribution point.</p>
   * @return type
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_TYPE)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public DistributionPointsType getType() {
        return type;
      }
  public void setType(DistributionPointsType type) {
    if (!type.isValid()) {
        this.unparsed = true;
    }
    this.type = type;
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
   * @return DistributionPointsSeries
   */
  @JsonAnySetter
  public DistributionPointsSeries putAdditionalProperty(String key, Object value) {
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
   * Return true if this DistributionPointsSeries object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DistributionPointsSeries distributionPointsSeries = (DistributionPointsSeries) o;
    return Objects.equals(this.host, distributionPointsSeries.host) && Objects.equals(this.metric, distributionPointsSeries.metric) && Objects.equals(this.points, distributionPointsSeries.points) && Objects.equals(this.tags, distributionPointsSeries.tags) && Objects.equals(this.type, distributionPointsSeries.type) && Objects.equals(this.additionalProperties, distributionPointsSeries.additionalProperties);
  }


  @Override
  public int hashCode() {
    return Objects.hash(host,metric,points,tags,type, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DistributionPointsSeries {\n");
    sb.append("    host: ").append(toIndentedString(host)).append("\n");
    sb.append("    metric: ").append(toIndentedString(metric)).append("\n");
    sb.append("    points: ").append(toIndentedString(points)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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
