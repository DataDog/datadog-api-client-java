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

/** Fields supplied to update the experiment metric group. */
@JsonPropertyOrder({
  ExperimentsPatchExperimentMetricGroupV2RequestDataAttributes.JSON_PROPERTY_METRICS,
  ExperimentsPatchExperimentMetricGroupV2RequestDataAttributes.JSON_PROPERTY_MIGRATION_METADATA,
  ExperimentsPatchExperimentMetricGroupV2RequestDataAttributes.JSON_PROPERTY_NAME
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class ExperimentsPatchExperimentMetricGroupV2RequestDataAttributes {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_METRICS = "metrics";
  private List<ExperimentsCreateExperimentMetricGroupV2RequestDataAttributesMetricsItems> metrics =
      null;

  public static final String JSON_PROPERTY_MIGRATION_METADATA = "migration_metadata";
  private Object migrationMetadata = null;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public ExperimentsPatchExperimentMetricGroupV2RequestDataAttributes metrics(
      List<ExperimentsCreateExperimentMetricGroupV2RequestDataAttributesMetricsItems> metrics) {
    this.metrics = metrics;
    if (metrics != null) {
      for (ExperimentsCreateExperimentMetricGroupV2RequestDataAttributesMetricsItems item :
          metrics) {
        this.unparsed |= item.unparsed;
      }
    }
    return this;
  }

  public ExperimentsPatchExperimentMetricGroupV2RequestDataAttributes addMetricsItem(
      ExperimentsCreateExperimentMetricGroupV2RequestDataAttributesMetricsItems metricsItem) {
    if (this.metrics == null) {
      this.metrics = new ArrayList<>();
    }
    this.metrics.add(metricsItem);
    this.unparsed |= metricsItem.unparsed;
    return this;
  }

  /**
   * Metrics included in this group.
   *
   * @return metrics
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_METRICS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<ExperimentsCreateExperimentMetricGroupV2RequestDataAttributesMetricsItems>
      getMetrics() {
    return metrics;
  }

  public void setMetrics(
      List<ExperimentsCreateExperimentMetricGroupV2RequestDataAttributesMetricsItems> metrics) {
    this.metrics = metrics;
    if (metrics != null) {
      for (ExperimentsCreateExperimentMetricGroupV2RequestDataAttributesMetricsItems item :
          metrics) {
        this.unparsed |= item.unparsed;
      }
    }
  }

  public ExperimentsPatchExperimentMetricGroupV2RequestDataAttributes migrationMetadata(
      Object migrationMetadata) {
    this.migrationMetadata = migrationMetadata;
    return this;
  }

  /**
   * Metadata retained for resources imported from another system.
   *
   * @return migrationMetadata
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_MIGRATION_METADATA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Object getMigrationMetadata() {
    return migrationMetadata;
  }

  public void setMigrationMetadata(Object migrationMetadata) {
    this.migrationMetadata = migrationMetadata;
  }

  public ExperimentsPatchExperimentMetricGroupV2RequestDataAttributes name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Display name of the experiment metric group.
   *
   * @return name
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
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
   * @return ExperimentsPatchExperimentMetricGroupV2RequestDataAttributes
   */
  @JsonAnySetter
  public ExperimentsPatchExperimentMetricGroupV2RequestDataAttributes putAdditionalProperty(
      String key, Object value) {
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
   * Return true if this ExperimentsPatchExperimentMetricGroupV2RequestDataAttributes object is
   * equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ExperimentsPatchExperimentMetricGroupV2RequestDataAttributes
        experimentsPatchExperimentMetricGroupV2RequestDataAttributes =
            (ExperimentsPatchExperimentMetricGroupV2RequestDataAttributes) o;
    return Objects.equals(
            this.metrics, experimentsPatchExperimentMetricGroupV2RequestDataAttributes.metrics)
        && Objects.equals(
            this.migrationMetadata,
            experimentsPatchExperimentMetricGroupV2RequestDataAttributes.migrationMetadata)
        && Objects.equals(
            this.name, experimentsPatchExperimentMetricGroupV2RequestDataAttributes.name)
        && Objects.equals(
            this.additionalProperties,
            experimentsPatchExperimentMetricGroupV2RequestDataAttributes.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(metrics, migrationMetadata, name, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExperimentsPatchExperimentMetricGroupV2RequestDataAttributes {\n");
    sb.append("    metrics: ").append(toIndentedString(metrics)).append("\n");
    sb.append("    migrationMetadata: ").append(toIndentedString(migrationMetadata)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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
