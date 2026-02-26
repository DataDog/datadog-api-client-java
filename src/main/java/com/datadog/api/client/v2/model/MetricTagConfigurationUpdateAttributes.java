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
   * <p>Object containing the definition of a metric tag configuration to be updated.</p>
 */
@JsonPropertyOrder({
  MetricTagConfigurationUpdateAttributes.JSON_PROPERTY_AGGREGATIONS,
  MetricTagConfigurationUpdateAttributes.JSON_PROPERTY_EXCLUDE_TAGS_MODE,
  MetricTagConfigurationUpdateAttributes.JSON_PROPERTY_INCLUDE_PERCENTILES,
  MetricTagConfigurationUpdateAttributes.JSON_PROPERTY_TAGS
})
@jakarta.annotation.Generated(value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class MetricTagConfigurationUpdateAttributes {
  @JsonIgnore
  public boolean unparsed = false;
  public static final String JSON_PROPERTY_AGGREGATIONS = "aggregations";
  private List<MetricCustomAggregation> aggregations = null;

  public static final String JSON_PROPERTY_EXCLUDE_TAGS_MODE = "exclude_tags_mode";
  private Boolean excludeTagsMode;

  public static final String JSON_PROPERTY_INCLUDE_PERCENTILES = "include_percentiles";
  private Boolean includePercentiles;

  public static final String JSON_PROPERTY_TAGS = "tags";
  private List<String> tags = null;

  public MetricTagConfigurationUpdateAttributes aggregations(List<MetricCustomAggregation> aggregations) {
    this.aggregations = aggregations;
    for (MetricCustomAggregation item : aggregations) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }
  public MetricTagConfigurationUpdateAttributes addAggregationsItem(MetricCustomAggregation aggregationsItem) {
    if (this.aggregations == null) {
      this.aggregations = new ArrayList<>();
    }
    this.aggregations.add(aggregationsItem);
    this.unparsed |= aggregationsItem.unparsed;
    return this;
  }

  /**
   * <p>Deprecated. You no longer need to configure specific time and space aggregations for Metrics Without Limits.</p>
   * @return aggregations
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_AGGREGATIONS)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public List<MetricCustomAggregation> getAggregations() {
        return aggregations;
      }
  public void setAggregations(List<MetricCustomAggregation> aggregations) {
    this.aggregations = aggregations;
  }
  public MetricTagConfigurationUpdateAttributes excludeTagsMode(Boolean excludeTagsMode) {
    this.excludeTagsMode = excludeTagsMode;
    return this;
  }

  /**
   * <p>When set to true, the configuration will exclude the configured tags and include any other submitted tags.
   * When set to false, the configuration will include the configured tags and exclude any other submitted tags.
   * Defaults to false. Requires <code>tags</code> property.</p>
   * @return excludeTagsMode
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_EXCLUDE_TAGS_MODE)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public Boolean getExcludeTagsMode() {
        return excludeTagsMode;
      }
  public void setExcludeTagsMode(Boolean excludeTagsMode) {
    this.excludeTagsMode = excludeTagsMode;
  }
  public MetricTagConfigurationUpdateAttributes includePercentiles(Boolean includePercentiles) {
    this.includePercentiles = includePercentiles;
    return this;
  }

  /**
   * <p>Toggle to include/exclude percentiles for a distribution metric.
   * Defaults to false. Can only be applied to metrics that have a <code>metric_type</code> of <code>distribution</code>.</p>
   * @return includePercentiles
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_INCLUDE_PERCENTILES)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public Boolean getIncludePercentiles() {
        return includePercentiles;
      }
  public void setIncludePercentiles(Boolean includePercentiles) {
    this.includePercentiles = includePercentiles;
  }
  public MetricTagConfigurationUpdateAttributes tags(List<String> tags) {
    this.tags = tags;
    return this;
  }
  public MetricTagConfigurationUpdateAttributes addTagsItem(String tagsItem) {
    if (this.tags == null) {
      this.tags = new ArrayList<>();
    }
    this.tags.add(tagsItem);
    return this;
  }

  /**
   * <p>A list of tag keys that will be queryable for your metric.</p>
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
   * @return MetricTagConfigurationUpdateAttributes
   */
  @JsonAnySetter
  public MetricTagConfigurationUpdateAttributes putAdditionalProperty(String key, Object value) {
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
   * Return true if this MetricTagConfigurationUpdateAttributes object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MetricTagConfigurationUpdateAttributes metricTagConfigurationUpdateAttributes = (MetricTagConfigurationUpdateAttributes) o;
    return Objects.equals(this.aggregations, metricTagConfigurationUpdateAttributes.aggregations) && Objects.equals(this.excludeTagsMode, metricTagConfigurationUpdateAttributes.excludeTagsMode) && Objects.equals(this.includePercentiles, metricTagConfigurationUpdateAttributes.includePercentiles) && Objects.equals(this.tags, metricTagConfigurationUpdateAttributes.tags) && Objects.equals(this.additionalProperties, metricTagConfigurationUpdateAttributes.additionalProperties);
  }


  @Override
  public int hashCode() {
    return Objects.hash(aggregations,excludeTagsMode,includePercentiles,tags, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MetricTagConfigurationUpdateAttributes {\n");
    sb.append("    aggregations: ").append(toIndentedString(aggregations)).append("\n");
    sb.append("    excludeTagsMode: ").append(toIndentedString(excludeTagsMode)).append("\n");
    sb.append("    includePercentiles: ").append(toIndentedString(includePercentiles)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
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
