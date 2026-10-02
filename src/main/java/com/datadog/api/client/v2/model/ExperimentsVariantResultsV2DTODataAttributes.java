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

/** Details of the variant result. */
@JsonPropertyOrder({
  ExperimentsVariantResultsV2DTODataAttributes.JSON_PROPERTY_ASSIGNMENT_COUNT,
  ExperimentsVariantResultsV2DTODataAttributes.JSON_PROPERTY_EXPERIMENT_ID,
  ExperimentsVariantResultsV2DTODataAttributes.JSON_PROPERTY_IS_CONTROL,
  ExperimentsVariantResultsV2DTODataAttributes.JSON_PROPERTY_METRICS,
  ExperimentsVariantResultsV2DTODataAttributes.JSON_PROPERTY_VARIANT_KEY,
  ExperimentsVariantResultsV2DTODataAttributes.JSON_PROPERTY_VARIANT_NAME
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class ExperimentsVariantResultsV2DTODataAttributes {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_ASSIGNMENT_COUNT = "assignment_count";
  private Long assignmentCount;

  public static final String JSON_PROPERTY_EXPERIMENT_ID = "experiment_id";
  private String experimentId;

  public static final String JSON_PROPERTY_IS_CONTROL = "is_control";
  private Boolean isControl;

  public static final String JSON_PROPERTY_METRICS = "metrics";
  private List<ExperimentsVariantResultsV2DTODataAttributesMetricsItems> metrics = null;

  public static final String JSON_PROPERTY_VARIANT_KEY = "variant_key";
  private String variantKey;

  public static final String JSON_PROPERTY_VARIANT_NAME = "variant_name";
  private String variantName;

  public ExperimentsVariantResultsV2DTODataAttributes assignmentCount(Long assignmentCount) {
    this.assignmentCount = assignmentCount;
    return this;
  }

  /**
   * Number of subjects assigned to this variant.
   *
   * @return assignmentCount
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ASSIGNMENT_COUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getAssignmentCount() {
    return assignmentCount;
  }

  public void setAssignmentCount(Long assignmentCount) {
    this.assignmentCount = assignmentCount;
  }

  public ExperimentsVariantResultsV2DTODataAttributes experimentId(String experimentId) {
    this.experimentId = experimentId;
    return this;
  }

  /**
   * ID of the experiment associated with this result.
   *
   * @return experimentId
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_EXPERIMENT_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getExperimentId() {
    return experimentId;
  }

  public void setExperimentId(String experimentId) {
    this.experimentId = experimentId;
  }

  public ExperimentsVariantResultsV2DTODataAttributes isControl(Boolean isControl) {
    this.isControl = isControl;
    return this;
  }

  /**
   * Whether this variant is the experiment's control.
   *
   * @return isControl
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_IS_CONTROL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getIsControl() {
    return isControl;
  }

  public void setIsControl(Boolean isControl) {
    this.isControl = isControl;
  }

  public ExperimentsVariantResultsV2DTODataAttributes metrics(
      List<ExperimentsVariantResultsV2DTODataAttributesMetricsItems> metrics) {
    this.metrics = metrics;
    if (metrics != null) {
      for (ExperimentsVariantResultsV2DTODataAttributesMetricsItems item : metrics) {
        this.unparsed |= item.unparsed;
      }
    }
    return this;
  }

  public ExperimentsVariantResultsV2DTODataAttributes addMetricsItem(
      ExperimentsVariantResultsV2DTODataAttributesMetricsItems metricsItem) {
    if (this.metrics == null) {
      this.metrics = new ArrayList<>();
    }
    this.metrics.add(metricsItem);
    this.unparsed |= metricsItem.unparsed;
    return this;
  }

  /**
   * Metrics reported for this variant.
   *
   * @return metrics
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_METRICS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<ExperimentsVariantResultsV2DTODataAttributesMetricsItems> getMetrics() {
    return metrics;
  }

  public void setMetrics(List<ExperimentsVariantResultsV2DTODataAttributesMetricsItems> metrics) {
    this.metrics = metrics;
    if (metrics != null) {
      for (ExperimentsVariantResultsV2DTODataAttributesMetricsItems item : metrics) {
        this.unparsed |= item.unparsed;
      }
    }
  }

  public ExperimentsVariantResultsV2DTODataAttributes variantKey(String variantKey) {
    this.variantKey = variantKey;
    return this;
  }

  /**
   * Key that identifies the experiment variant.
   *
   * @return variantKey
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_VARIANT_KEY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getVariantKey() {
    return variantKey;
  }

  public void setVariantKey(String variantKey) {
    this.variantKey = variantKey;
  }

  public ExperimentsVariantResultsV2DTODataAttributes variantName(String variantName) {
    this.variantName = variantName;
    return this;
  }

  /**
   * Display name of the experiment variant.
   *
   * @return variantName
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_VARIANT_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getVariantName() {
    return variantName;
  }

  public void setVariantName(String variantName) {
    this.variantName = variantName;
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
   * @return ExperimentsVariantResultsV2DTODataAttributes
   */
  @JsonAnySetter
  public ExperimentsVariantResultsV2DTODataAttributes putAdditionalProperty(
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

  /** Return true if this ExperimentsVariantResultsV2DTODataAttributes object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ExperimentsVariantResultsV2DTODataAttributes experimentsVariantResultsV2DtoDataAttributes =
        (ExperimentsVariantResultsV2DTODataAttributes) o;
    return Objects.equals(
            this.assignmentCount, experimentsVariantResultsV2DtoDataAttributes.assignmentCount)
        && Objects.equals(
            this.experimentId, experimentsVariantResultsV2DtoDataAttributes.experimentId)
        && Objects.equals(this.isControl, experimentsVariantResultsV2DtoDataAttributes.isControl)
        && Objects.equals(this.metrics, experimentsVariantResultsV2DtoDataAttributes.metrics)
        && Objects.equals(this.variantKey, experimentsVariantResultsV2DtoDataAttributes.variantKey)
        && Objects.equals(
            this.variantName, experimentsVariantResultsV2DtoDataAttributes.variantName)
        && Objects.equals(
            this.additionalProperties,
            experimentsVariantResultsV2DtoDataAttributes.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        assignmentCount,
        experimentId,
        isControl,
        metrics,
        variantKey,
        variantName,
        additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExperimentsVariantResultsV2DTODataAttributes {\n");
    sb.append("    assignmentCount: ").append(toIndentedString(assignmentCount)).append("\n");
    sb.append("    experimentId: ").append(toIndentedString(experimentId)).append("\n");
    sb.append("    isControl: ").append(toIndentedString(isControl)).append("\n");
    sb.append("    metrics: ").append(toIndentedString(metrics)).append("\n");
    sb.append("    variantKey: ").append(toIndentedString(variantKey)).append("\n");
    sb.append("    variantName: ").append(toIndentedString(variantName)).append("\n");
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
