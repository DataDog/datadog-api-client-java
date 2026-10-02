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
import org.openapitools.jackson.nullable.JsonNullable;

/** Fields supplied to update the metric collection. */
@JsonPropertyOrder({
  ExperimentsPatchMetricCollectionV2RequestDataAttributes.JSON_PROPERTY_DESCRIPTION,
  ExperimentsPatchMetricCollectionV2RequestDataAttributes.JSON_PROPERTY_IS_GUARDRAIL,
  ExperimentsPatchMetricCollectionV2RequestDataAttributes.JSON_PROPERTY_METRICS,
  ExperimentsPatchMetricCollectionV2RequestDataAttributes.JSON_PROPERTY_NAME
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class ExperimentsPatchMetricCollectionV2RequestDataAttributes {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_DESCRIPTION = "description";
  private JsonNullable<String> description = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_IS_GUARDRAIL = "is_guardrail";
  private Boolean isGuardrail;

  public static final String JSON_PROPERTY_METRICS = "metrics";
  private List<ExperimentsCreateMetricCollectionV2RequestDataAttributesMetricsItems> metrics = null;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public ExperimentsPatchMetricCollectionV2RequestDataAttributes description(String description) {
    this.description = JsonNullable.<String>of(description);
    return this;
  }

  /**
   * Text that explains the metric collection.
   *
   * @return description
   */
  @jakarta.annotation.Nullable
  @JsonIgnore
  public String getDescription() {
    return description.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_DESCRIPTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<String> getDescription_JsonNullable() {
    return description;
  }

  @JsonProperty(JSON_PROPERTY_DESCRIPTION)
  public void setDescription_JsonNullable(JsonNullable<String> description) {
    this.description = description;
  }

  public void setDescription(String description) {
    this.description = JsonNullable.<String>of(description);
  }

  public ExperimentsPatchMetricCollectionV2RequestDataAttributes isGuardrail(Boolean isGuardrail) {
    this.isGuardrail = isGuardrail;
    return this;
  }

  /**
   * Whether the collection is used for guardrail metrics.
   *
   * @return isGuardrail
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_IS_GUARDRAIL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getIsGuardrail() {
    return isGuardrail;
  }

  public void setIsGuardrail(Boolean isGuardrail) {
    this.isGuardrail = isGuardrail;
  }

  public ExperimentsPatchMetricCollectionV2RequestDataAttributes metrics(
      List<ExperimentsCreateMetricCollectionV2RequestDataAttributesMetricsItems> metrics) {
    this.metrics = metrics;
    if (metrics != null) {
      for (ExperimentsCreateMetricCollectionV2RequestDataAttributesMetricsItems item : metrics) {
        this.unparsed |= item.unparsed;
      }
    }
    return this;
  }

  public ExperimentsPatchMetricCollectionV2RequestDataAttributes addMetricsItem(
      ExperimentsCreateMetricCollectionV2RequestDataAttributesMetricsItems metricsItem) {
    if (this.metrics == null) {
      this.metrics = new ArrayList<>();
    }
    this.metrics.add(metricsItem);
    this.unparsed |= metricsItem.unparsed;
    return this;
  }

  /**
   * Metrics included in this collection.
   *
   * @return metrics
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_METRICS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<ExperimentsCreateMetricCollectionV2RequestDataAttributesMetricsItems> getMetrics() {
    return metrics;
  }

  public void setMetrics(
      List<ExperimentsCreateMetricCollectionV2RequestDataAttributesMetricsItems> metrics) {
    this.metrics = metrics;
    if (metrics != null) {
      for (ExperimentsCreateMetricCollectionV2RequestDataAttributesMetricsItems item : metrics) {
        this.unparsed |= item.unparsed;
      }
    }
  }

  public ExperimentsPatchMetricCollectionV2RequestDataAttributes name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Display name of the metric collection.
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
   * @return ExperimentsPatchMetricCollectionV2RequestDataAttributes
   */
  @JsonAnySetter
  public ExperimentsPatchMetricCollectionV2RequestDataAttributes putAdditionalProperty(
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
   * Return true if this ExperimentsPatchMetricCollectionV2RequestDataAttributes object is equal to
   * o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ExperimentsPatchMetricCollectionV2RequestDataAttributes
        experimentsPatchMetricCollectionV2RequestDataAttributes =
            (ExperimentsPatchMetricCollectionV2RequestDataAttributes) o;
    return Objects.equals(
            this.description, experimentsPatchMetricCollectionV2RequestDataAttributes.description)
        && Objects.equals(
            this.isGuardrail, experimentsPatchMetricCollectionV2RequestDataAttributes.isGuardrail)
        && Objects.equals(
            this.metrics, experimentsPatchMetricCollectionV2RequestDataAttributes.metrics)
        && Objects.equals(this.name, experimentsPatchMetricCollectionV2RequestDataAttributes.name)
        && Objects.equals(
            this.additionalProperties,
            experimentsPatchMetricCollectionV2RequestDataAttributes.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, isGuardrail, metrics, name, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExperimentsPatchMetricCollectionV2RequestDataAttributes {\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    isGuardrail: ").append(toIndentedString(isGuardrail)).append("\n");
    sb.append("    metrics: ").append(toIndentedString(metrics)).append("\n");
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
