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
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/** Metric in an experiment metric group, with its name and primary metric designation. */
@JsonPropertyOrder({
  ExperimentsExperimentMetricGroupMutationV2DataAttributesMetricsItems.JSON_PROPERTY_IS_PRIMARY,
  ExperimentsExperimentMetricGroupMutationV2DataAttributesMetricsItems.JSON_PROPERTY_METRIC_ID,
  ExperimentsExperimentMetricGroupMutationV2DataAttributesMetricsItems.JSON_PROPERTY_METRIC_NAME
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class ExperimentsExperimentMetricGroupMutationV2DataAttributesMetricsItems {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_IS_PRIMARY = "is_primary";
  private Boolean isPrimary;

  public static final String JSON_PROPERTY_METRIC_ID = "metric_id";
  private String metricId;

  public static final String JSON_PROPERTY_METRIC_NAME = "metric_name";
  private String metricName;

  public ExperimentsExperimentMetricGroupMutationV2DataAttributesMetricsItems() {}

  @JsonCreator
  public ExperimentsExperimentMetricGroupMutationV2DataAttributesMetricsItems(
      @JsonProperty(required = true, value = JSON_PROPERTY_IS_PRIMARY) Boolean isPrimary,
      @JsonProperty(required = true, value = JSON_PROPERTY_METRIC_ID) String metricId,
      @JsonProperty(required = true, value = JSON_PROPERTY_METRIC_NAME) String metricName) {
    this.isPrimary = isPrimary;
    this.metricId = metricId;
    this.metricName = metricName;
  }

  public ExperimentsExperimentMetricGroupMutationV2DataAttributesMetricsItems isPrimary(
      Boolean isPrimary) {
    this.isPrimary = isPrimary;
    return this;
  }

  /**
   * Whether this is the experiment primary metric.
   *
   * @return isPrimary
   */
  @JsonProperty(JSON_PROPERTY_IS_PRIMARY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Boolean getIsPrimary() {
    return isPrimary;
  }

  public void setIsPrimary(Boolean isPrimary) {
    this.isPrimary = isPrimary;
  }

  public ExperimentsExperimentMetricGroupMutationV2DataAttributesMetricsItems metricId(
      String metricId) {
    this.metricId = metricId;
    return this;
  }

  /**
   * Identifier of the metric in the group.
   *
   * @return metricId
   */
  @JsonProperty(JSON_PROPERTY_METRIC_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getMetricId() {
    return metricId;
  }

  public void setMetricId(String metricId) {
    this.metricId = metricId;
  }

  public ExperimentsExperimentMetricGroupMutationV2DataAttributesMetricsItems metricName(
      String metricName) {
    this.metricName = metricName;
    return this;
  }

  /**
   * Display name of the metric in the group.
   *
   * @return metricName
   */
  @JsonProperty(JSON_PROPERTY_METRIC_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getMetricName() {
    return metricName;
  }

  public void setMetricName(String metricName) {
    this.metricName = metricName;
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
   * @return ExperimentsExperimentMetricGroupMutationV2DataAttributesMetricsItems
   */
  @JsonAnySetter
  public ExperimentsExperimentMetricGroupMutationV2DataAttributesMetricsItems putAdditionalProperty(
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
   * Return true if this ExperimentsExperimentMetricGroupMutationV2DataAttributesMetricsItems object
   * is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ExperimentsExperimentMetricGroupMutationV2DataAttributesMetricsItems
        experimentsExperimentMetricGroupMutationV2DataAttributesMetricsItems =
            (ExperimentsExperimentMetricGroupMutationV2DataAttributesMetricsItems) o;
    return Objects.equals(
            this.isPrimary,
            experimentsExperimentMetricGroupMutationV2DataAttributesMetricsItems.isPrimary)
        && Objects.equals(
            this.metricId,
            experimentsExperimentMetricGroupMutationV2DataAttributesMetricsItems.metricId)
        && Objects.equals(
            this.metricName,
            experimentsExperimentMetricGroupMutationV2DataAttributesMetricsItems.metricName)
        && Objects.equals(
            this.additionalProperties,
            experimentsExperimentMetricGroupMutationV2DataAttributesMetricsItems
                .additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(isPrimary, metricId, metricName, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExperimentsExperimentMetricGroupMutationV2DataAttributesMetricsItems {\n");
    sb.append("    isPrimary: ").append(toIndentedString(isPrimary)).append("\n");
    sb.append("    metricId: ").append(toIndentedString(metricId)).append("\n");
    sb.append("    metricName: ").append(toIndentedString(metricName)).append("\n");
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
