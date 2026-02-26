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
   * <p>A metric to submit to Datadog.
   * See <a href="https://docs.datadoghq.com/developers/metrics/#custom-metrics-properties">Datadog metrics</a>.</p>
 */
@JsonPropertyOrder({
  MetricSeries.JSON_PROPERTY_INTERVAL,
  MetricSeries.JSON_PROPERTY_METADATA,
  MetricSeries.JSON_PROPERTY_METRIC,
  MetricSeries.JSON_PROPERTY_POINTS,
  MetricSeries.JSON_PROPERTY_RESOURCES,
  MetricSeries.JSON_PROPERTY_SOURCE_TYPE_NAME,
  MetricSeries.JSON_PROPERTY_TAGS,
  MetricSeries.JSON_PROPERTY_TYPE,
  MetricSeries.JSON_PROPERTY_UNIT
})
@jakarta.annotation.Generated(value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class MetricSeries {
  @JsonIgnore
  public boolean unparsed = false;
  public static final String JSON_PROPERTY_INTERVAL = "interval";
  private Long interval;

  public static final String JSON_PROPERTY_METADATA = "metadata";
  private MetricMetadata metadata;

  public static final String JSON_PROPERTY_METRIC = "metric";
  private String metric;

  public static final String JSON_PROPERTY_POINTS = "points";
  private List<MetricPoint> points = new ArrayList<>();

  public static final String JSON_PROPERTY_RESOURCES = "resources";
  private List<MetricResource> resources = null;

  public static final String JSON_PROPERTY_SOURCE_TYPE_NAME = "source_type_name";
  private String sourceTypeName;

  public static final String JSON_PROPERTY_TAGS = "tags";
  private List<String> tags = null;

  public static final String JSON_PROPERTY_TYPE = "type";
  private MetricIntakeType type;

  public static final String JSON_PROPERTY_UNIT = "unit";
  private String unit;

  public MetricSeries() {}

  @JsonCreator
  public MetricSeries(
            @JsonProperty(required=true, value=JSON_PROPERTY_METRIC)String metric,
            @JsonProperty(required=true, value=JSON_PROPERTY_POINTS)List<MetricPoint> points) {
        this.metric = metric;
        this.points = points;
  }
  public MetricSeries interval(Long interval) {
    this.interval = interval;
    return this;
  }

  /**
   * <p>If the type of the metric is rate or count, define the corresponding interval in seconds.</p>
   * @return interval
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_INTERVAL)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public Long getInterval() {
        return interval;
      }
  public void setInterval(Long interval) {
    this.interval = interval;
  }
  public MetricSeries metadata(MetricMetadata metadata) {
    this.metadata = metadata;
    this.unparsed |= metadata.unparsed;
    return this;
  }

  /**
   * <p>Metadata for the metric.</p>
   * @return metadata
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_METADATA)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public MetricMetadata getMetadata() {
        return metadata;
      }
  public void setMetadata(MetricMetadata metadata) {
    this.metadata = metadata;
  }
  public MetricSeries metric(String metric) {
    this.metric = metric;
    return this;
  }

  /**
   * <p>The name of the timeseries.</p>
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
  public MetricSeries points(List<MetricPoint> points) {
    this.points = points;
    for (MetricPoint item : points) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }
  public MetricSeries addPointsItem(MetricPoint pointsItem) {
    this.points.add(pointsItem);
    this.unparsed |= pointsItem.unparsed;
    return this;
  }

  /**
   * <p>Points relating to a metric. All points must be objects with timestamp and a scalar value (cannot be a string). Timestamps should be in POSIX time in seconds, and cannot be more than ten minutes in the future or more than one hour in the past.</p>
   * @return points
  **/
      @JsonProperty(JSON_PROPERTY_POINTS)
      @JsonInclude(
        value = JsonInclude.Include.ALWAYS)
      public List<MetricPoint> getPoints() {
        return points;
      }
  public void setPoints(List<MetricPoint> points) {
    this.points = points;
  }
  public MetricSeries resources(List<MetricResource> resources) {
    this.resources = resources;
    for (MetricResource item : resources) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }
  public MetricSeries addResourcesItem(MetricResource resourcesItem) {
    if (this.resources == null) {
      this.resources = new ArrayList<>();
    }
    this.resources.add(resourcesItem);
    this.unparsed |= resourcesItem.unparsed;
    return this;
  }

  /**
   * <p>A list of resources to associate with this metric.</p>
   * @return resources
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_RESOURCES)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public List<MetricResource> getResources() {
        return resources;
      }
  public void setResources(List<MetricResource> resources) {
    this.resources = resources;
  }
  public MetricSeries sourceTypeName(String sourceTypeName) {
    this.sourceTypeName = sourceTypeName;
    return this;
  }

  /**
   * <p>The source type name.</p>
   * @return sourceTypeName
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_SOURCE_TYPE_NAME)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public String getSourceTypeName() {
        return sourceTypeName;
      }
  public void setSourceTypeName(String sourceTypeName) {
    this.sourceTypeName = sourceTypeName;
  }
  public MetricSeries tags(List<String> tags) {
    this.tags = tags;
    return this;
  }
  public MetricSeries addTagsItem(String tagsItem) {
    if (this.tags == null) {
      this.tags = new ArrayList<>();
    }
    this.tags.add(tagsItem);
    return this;
  }

  /**
   * <p>A list of tags associated with the metric.</p>
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
  public MetricSeries type(MetricIntakeType type) {
    this.type = type;
    this.unparsed |= !type.isValid();
    return this;
  }

  /**
   * <p>The type of metric. The available types are <code>0</code> (unspecified), <code>1</code> (count), <code>2</code> (rate), and <code>3</code> (gauge).</p>
   * @return type
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_TYPE)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public MetricIntakeType getType() {
        return type;
      }
  public void setType(MetricIntakeType type) {
    if (!type.isValid()) {
        this.unparsed = true;
    }
    this.type = type;
  }
  public MetricSeries unit(String unit) {
    this.unit = unit;
    return this;
  }

  /**
   * <p>The unit of point value.</p>
   * @return unit
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_UNIT)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public String getUnit() {
        return unit;
      }
  public void setUnit(String unit) {
    this.unit = unit;
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
   * @return MetricSeries
   */
  @JsonAnySetter
  public MetricSeries putAdditionalProperty(String key, Object value) {
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
   * Return true if this MetricSeries object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MetricSeries metricSeries = (MetricSeries) o;
    return Objects.equals(this.interval, metricSeries.interval) && Objects.equals(this.metadata, metricSeries.metadata) && Objects.equals(this.metric, metricSeries.metric) && Objects.equals(this.points, metricSeries.points) && Objects.equals(this.resources, metricSeries.resources) && Objects.equals(this.sourceTypeName, metricSeries.sourceTypeName) && Objects.equals(this.tags, metricSeries.tags) && Objects.equals(this.type, metricSeries.type) && Objects.equals(this.unit, metricSeries.unit) && Objects.equals(this.additionalProperties, metricSeries.additionalProperties);
  }


  @Override
  public int hashCode() {
    return Objects.hash(interval,metadata,metric,points,resources,sourceTypeName,tags,type,unit, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MetricSeries {\n");
    sb.append("    interval: ").append(toIndentedString(interval)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
    sb.append("    metric: ").append(toIndentedString(metric)).append("\n");
    sb.append("    points: ").append(toIndentedString(points)).append("\n");
    sb.append("    resources: ").append(toIndentedString(resources)).append("\n");
    sb.append("    sourceTypeName: ").append(toIndentedString(sourceTypeName)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    unit: ").append(toIndentedString(unit)).append("\n");
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
