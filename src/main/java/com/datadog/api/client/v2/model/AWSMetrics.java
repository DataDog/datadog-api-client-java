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
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/** AWS Metrics config */
@JsonPropertyOrder({
  AWSMetrics.JSON_PROPERTY_AUTOMUTE_ENABLED,
  AWSMetrics.JSON_PROPERTY_COLLECT_CLOUDWATCH_ALARMS,
  AWSMetrics.JSON_PROPERTY_COLLECT_CUSTOM_METRICS,
  AWSMetrics.JSON_PROPERTY_ENABLED,
  AWSMetrics.JSON_PROPERTY_NAMESPACE_FILTERS,
  AWSMetrics.JSON_PROPERTY_TAG_FILTERS
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class AWSMetrics {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_AUTOMUTE_ENABLED = "automute_enabled";
  private Boolean automuteEnabled;

  public static final String JSON_PROPERTY_COLLECT_CLOUDWATCH_ALARMS = "collect_cloudwatch_alarms";
  private Boolean collectCloudwatchAlarms;

  public static final String JSON_PROPERTY_COLLECT_CUSTOM_METRICS = "collect_custom_metrics";
  private Boolean collectCustomMetrics;

  public static final String JSON_PROPERTY_ENABLED = "enabled";
  private Boolean enabled;

  public static final String JSON_PROPERTY_NAMESPACE_FILTERS = "namespace_filters";
  private AWSNamespacesList namespaceFilters;

  public static final String JSON_PROPERTY_TAG_FILTERS = "tag_filters";
  private List<AWSNamespaceTagFilter> tagFilters = null;

  public AWSMetrics automuteEnabled(Boolean automuteEnabled) {
    this.automuteEnabled = automuteEnabled;
    return this;
  }

  /**
   * Enable EC2 automute for AWS metrics
   *
   * @return automuteEnabled
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_AUTOMUTE_ENABLED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getAutomuteEnabled() {
    return automuteEnabled;
  }

  public void setAutomuteEnabled(Boolean automuteEnabled) {
    this.automuteEnabled = automuteEnabled;
  }

  public AWSMetrics collectCloudwatchAlarms(Boolean collectCloudwatchAlarms) {
    this.collectCloudwatchAlarms = collectCloudwatchAlarms;
    return this;
  }

  /**
   * Enable CloudWatch alarms collection
   *
   * @return collectCloudwatchAlarms
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_COLLECT_CLOUDWATCH_ALARMS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getCollectCloudwatchAlarms() {
    return collectCloudwatchAlarms;
  }

  public void setCollectCloudwatchAlarms(Boolean collectCloudwatchAlarms) {
    this.collectCloudwatchAlarms = collectCloudwatchAlarms;
  }

  public AWSMetrics collectCustomMetrics(Boolean collectCustomMetrics) {
    this.collectCustomMetrics = collectCustomMetrics;
    return this;
  }

  /**
   * Enable custom metrics collection
   *
   * @return collectCustomMetrics
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_COLLECT_CUSTOM_METRICS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getCollectCustomMetrics() {
    return collectCustomMetrics;
  }

  public void setCollectCustomMetrics(Boolean collectCustomMetrics) {
    this.collectCustomMetrics = collectCustomMetrics;
  }

  public AWSMetrics enabled(Boolean enabled) {
    this.enabled = enabled;
    return this;
  }

  /**
   * Enable AWS metrics collection
   *
   * @return enabled
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ENABLED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getEnabled() {
    return enabled;
  }

  public void setEnabled(Boolean enabled) {
    this.enabled = enabled;
  }

  public AWSMetrics namespaceFilters(AWSNamespacesList namespaceFilters) {
    this.namespaceFilters = namespaceFilters;
    this.unparsed |= namespaceFilters.unparsed;
    return this;
  }

  /**
   * AWS Metrics namespace filters
   *
   * @return namespaceFilters
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_NAMESPACE_FILTERS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public AWSNamespacesList getNamespaceFilters() {
    return namespaceFilters;
  }

  public void setNamespaceFilters(AWSNamespacesList namespaceFilters) {
    this.namespaceFilters = namespaceFilters;
  }

  public AWSMetrics tagFilters(List<AWSNamespaceTagFilter> tagFilters) {
    this.tagFilters = tagFilters;
    for (AWSNamespaceTagFilter item : tagFilters) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }

  public AWSMetrics addTagFiltersItem(AWSNamespaceTagFilter tagFiltersItem) {
    if (this.tagFilters == null) {
      this.tagFilters = new ArrayList<>();
    }
    this.tagFilters.add(tagFiltersItem);
    this.unparsed |= tagFiltersItem.unparsed;
    return this;
  }

  /**
   * AWS Metrics tag filters list
   *
   * @return tagFilters
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TAG_FILTERS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<AWSNamespaceTagFilter> getTagFilters() {
    return tagFilters;
  }

  public void setTagFilters(List<AWSNamespaceTagFilter> tagFilters) {
    this.tagFilters = tagFilters;
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
   * @return AWSMetrics
   */
  @JsonAnySetter
  public AWSMetrics putAdditionalProperty(String key, Object value) {
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

  /** Return true if this AWSMetrics object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AWSMetrics awsMetrics = (AWSMetrics) o;
    return Objects.equals(this.automuteEnabled, awsMetrics.automuteEnabled)
        && Objects.equals(this.collectCloudwatchAlarms, awsMetrics.collectCloudwatchAlarms)
        && Objects.equals(this.collectCustomMetrics, awsMetrics.collectCustomMetrics)
        && Objects.equals(this.enabled, awsMetrics.enabled)
        && Objects.equals(this.namespaceFilters, awsMetrics.namespaceFilters)
        && Objects.equals(this.tagFilters, awsMetrics.tagFilters)
        && Objects.equals(this.additionalProperties, awsMetrics.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        automuteEnabled,
        collectCloudwatchAlarms,
        collectCustomMetrics,
        enabled,
        namespaceFilters,
        tagFilters,
        additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AWSMetrics {\n");
    sb.append("    automuteEnabled: ").append(toIndentedString(automuteEnabled)).append("\n");
    sb.append("    collectCloudwatchAlarms: ")
        .append(toIndentedString(collectCloudwatchAlarms))
        .append("\n");
    sb.append("    collectCustomMetrics: ")
        .append(toIndentedString(collectCustomMetrics))
        .append("\n");
    sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
    sb.append("    namespaceFilters: ").append(toIndentedString(namespaceFilters)).append("\n");
    sb.append("    tagFilters: ").append(toIndentedString(tagFilters)).append("\n");
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
