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
import java.util.UUID;

/** Metric used to make an experiment decision, with its primary metric designation. */
@JsonPropertyOrder({
  ExperimentsCreateExperimentV2RequestDataAttributesDecisionMetricsItems.JSON_PROPERTY_IS_PRIMARY,
  ExperimentsCreateExperimentV2RequestDataAttributesDecisionMetricsItems.JSON_PROPERTY_METRIC_ID
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class ExperimentsCreateExperimentV2RequestDataAttributesDecisionMetricsItems {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_IS_PRIMARY = "is_primary";
  private Boolean isPrimary;

  public static final String JSON_PROPERTY_METRIC_ID = "metric_id";
  private UUID metricId;

  public ExperimentsCreateExperimentV2RequestDataAttributesDecisionMetricsItems() {}

  @JsonCreator
  public ExperimentsCreateExperimentV2RequestDataAttributesDecisionMetricsItems(
      @JsonProperty(required = true, value = JSON_PROPERTY_IS_PRIMARY) Boolean isPrimary,
      @JsonProperty(required = true, value = JSON_PROPERTY_METRIC_ID) UUID metricId) {
    this.isPrimary = isPrimary;
    this.metricId = metricId;
  }

  public ExperimentsCreateExperimentV2RequestDataAttributesDecisionMetricsItems isPrimary(
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

  public ExperimentsCreateExperimentV2RequestDataAttributesDecisionMetricsItems metricId(
      UUID metricId) {
    this.metricId = metricId;
    return this;
  }

  /**
   * Decision metric UUID.
   *
   * @return metricId
   */
  @JsonProperty(JSON_PROPERTY_METRIC_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public UUID getMetricId() {
    return metricId;
  }

  public void setMetricId(UUID metricId) {
    this.metricId = metricId;
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
   * @return ExperimentsCreateExperimentV2RequestDataAttributesDecisionMetricsItems
   */
  @JsonAnySetter
  public ExperimentsCreateExperimentV2RequestDataAttributesDecisionMetricsItems
      putAdditionalProperty(String key, Object value) {
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
   * Return true if this ExperimentsCreateExperimentV2RequestDataAttributesDecisionMetricsItems
   * object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ExperimentsCreateExperimentV2RequestDataAttributesDecisionMetricsItems
        experimentsCreateExperimentV2RequestDataAttributesDecisionMetricsItems =
            (ExperimentsCreateExperimentV2RequestDataAttributesDecisionMetricsItems) o;
    return Objects.equals(
            this.isPrimary,
            experimentsCreateExperimentV2RequestDataAttributesDecisionMetricsItems.isPrimary)
        && Objects.equals(
            this.metricId,
            experimentsCreateExperimentV2RequestDataAttributesDecisionMetricsItems.metricId)
        && Objects.equals(
            this.additionalProperties,
            experimentsCreateExperimentV2RequestDataAttributesDecisionMetricsItems
                .additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(isPrimary, metricId, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExperimentsCreateExperimentV2RequestDataAttributesDecisionMetricsItems {\n");
    sb.append("    isPrimary: ").append(toIndentedString(isPrimary)).append("\n");
    sb.append("    metricId: ").append(toIndentedString(metricId)).append("\n");
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
