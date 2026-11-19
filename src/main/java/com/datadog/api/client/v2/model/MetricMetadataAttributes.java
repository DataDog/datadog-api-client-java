/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v2.model;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * Metadata for one metric. Every attribute is always present. A value that is unknown or not set is
 * <code>null</code>.
 */
@JsonPropertyOrder({
  MetricMetadataAttributes.JSON_PROPERTY_DESCRIPTION,
  MetricMetadataAttributes.JSON_PROPERTY_HISTORICAL_METRICS_ENABLED,
  MetricMetadataAttributes.JSON_PROPERTY_INCLUDE_PERCENTILES,
  MetricMetadataAttributes.JSON_PROPERTY_INTEGRATION,
  MetricMetadataAttributes.JSON_PROPERTY_LAST_CONFIGURED_AT,
  MetricMetadataAttributes.JSON_PROPERTY_METRIC_TYPE,
  MetricMetadataAttributes.JSON_PROPERTY_ORIGIN,
  MetricMetadataAttributes.JSON_PROPERTY_PER_UNIT,
  MetricMetadataAttributes.JSON_PROPERTY_SHORT_NAME,
  MetricMetadataAttributes.JSON_PROPERTY_SOURCE,
  MetricMetadataAttributes.JSON_PROPERTY_STATSD_INTERVAL,
  MetricMetadataAttributes.JSON_PROPERTY_UNIT
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class MetricMetadataAttributes {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_DESCRIPTION = "description";
  private String description;

  public static final String JSON_PROPERTY_HISTORICAL_METRICS_ENABLED =
      "historical_metrics_enabled";
  private Boolean historicalMetricsEnabled;

  public static final String JSON_PROPERTY_INCLUDE_PERCENTILES = "include_percentiles";
  private Boolean includePercentiles;

  public static final String JSON_PROPERTY_INTEGRATION = "integration";
  private String integration;

  public static final String JSON_PROPERTY_LAST_CONFIGURED_AT = "last_configured_at";
  private OffsetDateTime lastConfiguredAt;

  public static final String JSON_PROPERTY_METRIC_TYPE = "metric_type";
  private String metricType;

  public static final String JSON_PROPERTY_ORIGIN = "origin";
  private MetricMetadataOrigin origin;

  public static final String JSON_PROPERTY_PER_UNIT = "per_unit";
  private MetricMetadataUnit perUnit;

  public static final String JSON_PROPERTY_SHORT_NAME = "short_name";
  private String shortName;

  public static final String JSON_PROPERTY_SOURCE = "source";
  private String source;

  public static final String JSON_PROPERTY_STATSD_INTERVAL = "statsd_interval";
  private Long statsdInterval;

  public static final String JSON_PROPERTY_UNIT = "unit";
  private MetricMetadataUnit unit;

  public MetricMetadataAttributes() {}

  @JsonCreator
  public MetricMetadataAttributes(
      @JsonProperty(required = true, value = JSON_PROPERTY_DESCRIPTION) String description,
      @JsonProperty(required = true, value = JSON_PROPERTY_HISTORICAL_METRICS_ENABLED)
          Boolean historicalMetricsEnabled,
      @JsonProperty(required = true, value = JSON_PROPERTY_INCLUDE_PERCENTILES)
          Boolean includePercentiles,
      @JsonProperty(required = true, value = JSON_PROPERTY_INTEGRATION) String integration,
      @JsonProperty(required = true, value = JSON_PROPERTY_LAST_CONFIGURED_AT)
          OffsetDateTime lastConfiguredAt,
      @JsonProperty(required = true, value = JSON_PROPERTY_METRIC_TYPE) String metricType,
      @JsonProperty(required = true, value = JSON_PROPERTY_ORIGIN) MetricMetadataOrigin origin,
      @JsonProperty(required = true, value = JSON_PROPERTY_PER_UNIT) MetricMetadataUnit perUnit,
      @JsonProperty(required = true, value = JSON_PROPERTY_SHORT_NAME) String shortName,
      @JsonProperty(required = true, value = JSON_PROPERTY_SOURCE) String source,
      @JsonProperty(required = true, value = JSON_PROPERTY_STATSD_INTERVAL) Long statsdInterval,
      @JsonProperty(required = true, value = JSON_PROPERTY_UNIT) MetricMetadataUnit unit) {
    this.description = description;
    if (description != null) {}
    this.historicalMetricsEnabled = historicalMetricsEnabled;
    this.includePercentiles = includePercentiles;
    this.integration = integration;
    if (integration != null) {}
    this.lastConfiguredAt = lastConfiguredAt;
    if (lastConfiguredAt != null) {}
    this.metricType = metricType;
    if (metricType != null) {}
    this.origin = origin;
    this.unparsed |= origin.unparsed;
    this.perUnit = perUnit;
    if (perUnit != null) {
      this.unparsed |= perUnit.unparsed;
    }
    this.shortName = shortName;
    if (shortName != null) {}
    this.source = source;
    if (source != null) {}
    this.statsdInterval = statsdInterval;
    if (statsdInterval != null) {}
    this.unit = unit;
    if (unit != null) {
      this.unparsed |= unit.unparsed;
    }
  }

  public MetricMetadataAttributes description(String description) {
    this.description = description;
    if (description != null) {}
    return this;
  }

  /**
   * Description of the metric, or <code>null</code> if none is set.
   *
   * @return description
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DESCRIPTION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public MetricMetadataAttributes historicalMetricsEnabled(Boolean historicalMetricsEnabled) {
    this.historicalMetricsEnabled = historicalMetricsEnabled;
    return this;
  }

  /**
   * Whether historical metrics ingestion is enabled for the metric.
   *
   * @return historicalMetricsEnabled
   */
  @JsonProperty(JSON_PROPERTY_HISTORICAL_METRICS_ENABLED)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Boolean getHistoricalMetricsEnabled() {
    return historicalMetricsEnabled;
  }

  public void setHistoricalMetricsEnabled(Boolean historicalMetricsEnabled) {
    this.historicalMetricsEnabled = historicalMetricsEnabled;
  }

  public MetricMetadataAttributes includePercentiles(Boolean includePercentiles) {
    this.includePercentiles = includePercentiles;
    return this;
  }

  /**
   * Whether percentile aggregations are enabled for the metric. Percentile aggregations are
   * available only for distribution metrics.
   *
   * @return includePercentiles
   */
  @JsonProperty(JSON_PROPERTY_INCLUDE_PERCENTILES)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Boolean getIncludePercentiles() {
    return includePercentiles;
  }

  public void setIncludePercentiles(Boolean includePercentiles) {
    this.includePercentiles = includePercentiles;
  }

  public MetricMetadataAttributes integration(String integration) {
    this.integration = integration;
    if (integration != null) {}
    return this;
  }

  /**
   * Name of the integration that sent the metric, or <code>null</code> if none is set. This is
   * always <code>null</code> for out-of-the-box RUM metrics.
   *
   * @return integration
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_INTEGRATION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getIntegration() {
    return integration;
  }

  public void setIntegration(String integration) {
    this.integration = integration;
  }

  public MetricMetadataAttributes lastConfiguredAt(OffsetDateTime lastConfiguredAt) {
    this.lastConfiguredAt = lastConfiguredAt;
    if (lastConfiguredAt != null) {}
    return this;
  }

  /**
   * When the metric's tag or percentile configuration was last changed, or <code>null</code> if it
   * has never been configured.
   *
   * @return lastConfiguredAt
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LAST_CONFIGURED_AT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public OffsetDateTime getLastConfiguredAt() {
    return lastConfiguredAt;
  }

  public void setLastConfiguredAt(OffsetDateTime lastConfiguredAt) {
    this.lastConfiguredAt = lastConfiguredAt;
  }

  public MetricMetadataAttributes metricType(String metricType) {
    this.metricType = metricType;
    if (metricType != null) {}
    return this;
  }

  /**
   * Metric type, or <code>null</code> if it isn't known. Known values are <code>gauge</code>,
   * <code>count</code>, <code>rate</code>, <code>distribution</code>, <code>explicit_histogram
   * </code>, and <code>exponential_histogram</code>, plus the legacy values <code>counter</code>
   * and <code>hll</code>. New values may be added. For histograms and sketches, this can differ
   * from the type returned by <code>GET /api/v1/metrics/{metric_name}</code>.
   *
   * @return metricType
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_METRIC_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getMetricType() {
    return metricType;
  }

  public void setMetricType(String metricType) {
    this.metricType = metricType;
  }

  public MetricMetadataAttributes origin(MetricMetadataOrigin origin) {
    this.origin = origin;
    this.unparsed |= origin.unparsed;
    return this;
  }

  /**
   * Where the metric comes from. Each value is the display label shown on the Metrics Summary page.
   * The set of labels can grow as Datadog adds products. Each field is <code>null</code> when it
   * isn't known.
   *
   * @return origin
   */
  @JsonProperty(JSON_PROPERTY_ORIGIN)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public MetricMetadataOrigin getOrigin() {
    return origin;
  }

  public void setOrigin(MetricMetadataOrigin origin) {
    this.origin = origin;
    if (origin != null) {
      this.unparsed |= origin.unparsed;
    }
  }

  public MetricMetadataAttributes perUnit(MetricMetadataUnit perUnit) {
    this.perUnit = perUnit;
    if (perUnit != null) {
      this.unparsed |= perUnit.unparsed;
    }
    return this;
  }

  /**
   * A unit of measure from the Datadog unit catalog, or <code>null</code> when no unit is set.
   *
   * @return perUnit
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PER_UNIT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public MetricMetadataUnit getPerUnit() {
    return perUnit;
  }

  public void setPerUnit(MetricMetadataUnit perUnit) {
    this.perUnit = perUnit;
    if (perUnit != null) {
      this.unparsed |= perUnit.unparsed;
    }
  }

  public MetricMetadataAttributes shortName(String shortName) {
    this.shortName = shortName;
    if (shortName != null) {}
    return this;
  }

  /**
   * Short display name of the metric, or <code>null</code> if none is set.
   *
   * @return shortName
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SHORT_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getShortName() {
    return shortName;
  }

  public void setShortName(String shortName) {
    this.shortName = shortName;
  }

  public MetricMetadataAttributes source(String source) {
    this.source = source;
    if (source != null) {}
    return this;
  }

  /**
   * How the metric reaches Datadog, or <code>null</code> if it isn't known. Known values are <code>
   * intake</code>, <code>api_default</code>, and <code>intake_serverless</code> for submitted
   * metrics, and <code>api_logs</code>, <code>api_processes</code>, <code>api_apm_spans</code>, and
   * <code>api_rum</code> for metrics generated from logs, processes, APM spans, and RUM events. New
   * values may be added.
   *
   * @return source
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SOURCE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getSource() {
    return source;
  }

  public void setSource(String source) {
    this.source = source;
  }

  public MetricMetadataAttributes statsdInterval(Long statsdInterval) {
    this.statsdInterval = statsdInterval;
    if (statsdInterval != null) {}
    return this;
  }

  /**
   * StatsD flush interval of the metric in seconds, or <code>null</code> if none is set.
   *
   * @return statsdInterval
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_STATSD_INTERVAL)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Long getStatsdInterval() {
    return statsdInterval;
  }

  public void setStatsdInterval(Long statsdInterval) {
    this.statsdInterval = statsdInterval;
  }

  public MetricMetadataAttributes unit(MetricMetadataUnit unit) {
    this.unit = unit;
    if (unit != null) {
      this.unparsed |= unit.unparsed;
    }
    return this;
  }

  /**
   * A unit of measure from the Datadog unit catalog, or <code>null</code> when no unit is set.
   *
   * @return unit
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_UNIT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public MetricMetadataUnit getUnit() {
    return unit;
  }

  public void setUnit(MetricMetadataUnit unit) {
    this.unit = unit;
    if (unit != null) {
      this.unparsed |= unit.unparsed;
    }
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
   * @return MetricMetadataAttributes
   */
  @JsonAnySetter
  public MetricMetadataAttributes putAdditionalProperty(String key, Object value) {
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

  /** Return true if this MetricMetadataAttributes object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MetricMetadataAttributes metricMetadataAttributes = (MetricMetadataAttributes) o;
    return Objects.equals(this.description, metricMetadataAttributes.description)
        && Objects.equals(
            this.historicalMetricsEnabled, metricMetadataAttributes.historicalMetricsEnabled)
        && Objects.equals(this.includePercentiles, metricMetadataAttributes.includePercentiles)
        && Objects.equals(this.integration, metricMetadataAttributes.integration)
        && Objects.equals(this.lastConfiguredAt, metricMetadataAttributes.lastConfiguredAt)
        && Objects.equals(this.metricType, metricMetadataAttributes.metricType)
        && Objects.equals(this.origin, metricMetadataAttributes.origin)
        && Objects.equals(this.perUnit, metricMetadataAttributes.perUnit)
        && Objects.equals(this.shortName, metricMetadataAttributes.shortName)
        && Objects.equals(this.source, metricMetadataAttributes.source)
        && Objects.equals(this.statsdInterval, metricMetadataAttributes.statsdInterval)
        && Objects.equals(this.unit, metricMetadataAttributes.unit)
        && Objects.equals(this.additionalProperties, metricMetadataAttributes.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        description,
        historicalMetricsEnabled,
        includePercentiles,
        integration,
        lastConfiguredAt,
        metricType,
        origin,
        perUnit,
        shortName,
        source,
        statsdInterval,
        unit,
        additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MetricMetadataAttributes {\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    historicalMetricsEnabled: ")
        .append(toIndentedString(historicalMetricsEnabled))
        .append("\n");
    sb.append("    includePercentiles: ").append(toIndentedString(includePercentiles)).append("\n");
    sb.append("    integration: ").append(toIndentedString(integration)).append("\n");
    sb.append("    lastConfiguredAt: ").append(toIndentedString(lastConfiguredAt)).append("\n");
    sb.append("    metricType: ").append(toIndentedString(metricType)).append("\n");
    sb.append("    origin: ").append(toIndentedString(origin)).append("\n");
    sb.append("    perUnit: ").append(toIndentedString(perUnit)).append("\n");
    sb.append("    shortName: ").append(toIndentedString(shortName)).append("\n");
    sb.append("    source: ").append(toIndentedString(source)).append("\n");
    sb.append("    statsdInterval: ").append(toIndentedString(statsdInterval)).append("\n");
    sb.append("    unit: ").append(toIndentedString(unit)).append("\n");
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
