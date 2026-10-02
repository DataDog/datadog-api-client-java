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
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import org.openapitools.jackson.nullable.JsonNullable;

/** Details of the metric collection. */
@JsonPropertyOrder({
  ExperimentsMetricCollectionV2DTODataAttributes.JSON_PROPERTY_CREATED_AT,
  ExperimentsMetricCollectionV2DTODataAttributes.JSON_PROPERTY_DESCRIPTION,
  ExperimentsMetricCollectionV2DTODataAttributes.JSON_PROPERTY_IS_GUARDRAIL,
  ExperimentsMetricCollectionV2DTODataAttributes.JSON_PROPERTY_METRIC_COUNT,
  ExperimentsMetricCollectionV2DTODataAttributes.JSON_PROPERTY_METRICS,
  ExperimentsMetricCollectionV2DTODataAttributes.JSON_PROPERTY_NAME,
  ExperimentsMetricCollectionV2DTODataAttributes.JSON_PROPERTY_UPDATED_AT
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class ExperimentsMetricCollectionV2DTODataAttributes {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_CREATED_AT = "created_at";
  private OffsetDateTime createdAt;

  public static final String JSON_PROPERTY_DESCRIPTION = "description";
  private JsonNullable<String> description = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_IS_GUARDRAIL = "is_guardrail";
  private Boolean isGuardrail;

  public static final String JSON_PROPERTY_METRIC_COUNT = "metric_count";
  private Long metricCount;

  public static final String JSON_PROPERTY_METRICS = "metrics";
  private List<ExperimentsMetricCollectionV2DTODataAttributesMetricsItems> metrics = null;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_UPDATED_AT = "updated_at";
  private OffsetDateTime updatedAt;

  public ExperimentsMetricCollectionV2DTODataAttributes createdAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
    return this;
  }

  /**
   * Time when this resource was created.
   *
   * @return createdAt
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CREATED_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
  }

  public ExperimentsMetricCollectionV2DTODataAttributes description(String description) {
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

  public ExperimentsMetricCollectionV2DTODataAttributes isGuardrail(Boolean isGuardrail) {
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

  public ExperimentsMetricCollectionV2DTODataAttributes metricCount(Long metricCount) {
    this.metricCount = metricCount;
    return this;
  }

  /**
   * Number of metrics in this collection.
   *
   * @return metricCount
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_METRIC_COUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getMetricCount() {
    return metricCount;
  }

  public void setMetricCount(Long metricCount) {
    this.metricCount = metricCount;
  }

  public ExperimentsMetricCollectionV2DTODataAttributes metrics(
      List<ExperimentsMetricCollectionV2DTODataAttributesMetricsItems> metrics) {
    this.metrics = metrics;
    if (metrics != null) {
      for (ExperimentsMetricCollectionV2DTODataAttributesMetricsItems item : metrics) {
        this.unparsed |= item.unparsed;
      }
    }
    return this;
  }

  public ExperimentsMetricCollectionV2DTODataAttributes addMetricsItem(
      ExperimentsMetricCollectionV2DTODataAttributesMetricsItems metricsItem) {
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
  public List<ExperimentsMetricCollectionV2DTODataAttributesMetricsItems> getMetrics() {
    return metrics;
  }

  public void setMetrics(List<ExperimentsMetricCollectionV2DTODataAttributesMetricsItems> metrics) {
    this.metrics = metrics;
    if (metrics != null) {
      for (ExperimentsMetricCollectionV2DTODataAttributesMetricsItems item : metrics) {
        this.unparsed |= item.unparsed;
      }
    }
  }

  public ExperimentsMetricCollectionV2DTODataAttributes name(String name) {
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

  public ExperimentsMetricCollectionV2DTODataAttributes updatedAt(OffsetDateTime updatedAt) {
    this.updatedAt = updatedAt;
    return this;
  }

  /**
   * Time when this resource was last updated.
   *
   * @return updatedAt
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_UPDATED_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public OffsetDateTime getUpdatedAt() {
    return updatedAt;
  }

  public void setUpdatedAt(OffsetDateTime updatedAt) {
    this.updatedAt = updatedAt;
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
   * @return ExperimentsMetricCollectionV2DTODataAttributes
   */
  @JsonAnySetter
  public ExperimentsMetricCollectionV2DTODataAttributes putAdditionalProperty(
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

  /** Return true if this ExperimentsMetricCollectionV2DTODataAttributes object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ExperimentsMetricCollectionV2DTODataAttributes experimentsMetricCollectionV2DtoDataAttributes =
        (ExperimentsMetricCollectionV2DTODataAttributes) o;
    return Objects.equals(this.createdAt, experimentsMetricCollectionV2DtoDataAttributes.createdAt)
        && Objects.equals(
            this.description, experimentsMetricCollectionV2DtoDataAttributes.description)
        && Objects.equals(
            this.isGuardrail, experimentsMetricCollectionV2DtoDataAttributes.isGuardrail)
        && Objects.equals(
            this.metricCount, experimentsMetricCollectionV2DtoDataAttributes.metricCount)
        && Objects.equals(this.metrics, experimentsMetricCollectionV2DtoDataAttributes.metrics)
        && Objects.equals(this.name, experimentsMetricCollectionV2DtoDataAttributes.name)
        && Objects.equals(this.updatedAt, experimentsMetricCollectionV2DtoDataAttributes.updatedAt)
        && Objects.equals(
            this.additionalProperties,
            experimentsMetricCollectionV2DtoDataAttributes.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        createdAt,
        description,
        isGuardrail,
        metricCount,
        metrics,
        name,
        updatedAt,
        additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExperimentsMetricCollectionV2DTODataAttributes {\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    isGuardrail: ").append(toIndentedString(isGuardrail)).append("\n");
    sb.append("    metricCount: ").append(toIndentedString(metricCount)).append("\n");
    sb.append("    metrics: ").append(toIndentedString(metrics)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
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
