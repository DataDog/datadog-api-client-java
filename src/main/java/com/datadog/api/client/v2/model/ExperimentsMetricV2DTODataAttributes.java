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
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import org.openapitools.jackson.nullable.JsonNullable;

/** Details of the metric. */
@JsonPropertyOrder({
  ExperimentsMetricV2DTODataAttributes.JSON_PROPERTY_CERTIFIED_AT,
  ExperimentsMetricV2DTODataAttributes.JSON_PROPERTY_CREATED_AT,
  ExperimentsMetricV2DTODataAttributes.JSON_PROPERTY_DATA_SOURCE_TYPE,
  ExperimentsMetricV2DTODataAttributes.JSON_PROPERTY_DENOMINATOR_AGGREGATION,
  ExperimentsMetricV2DTODataAttributes.JSON_PROPERTY_DESCRIPTION,
  ExperimentsMetricV2DTODataAttributes.JSON_PROPERTY_DESIRED_CHANGE,
  ExperimentsMetricV2DTODataAttributes.JSON_PROPERTY_EXPERIMENT_COUNT,
  ExperimentsMetricV2DTODataAttributes.JSON_PROPERTY_FORMAT_AS_PERCENT,
  ExperimentsMetricV2DTODataAttributes.JSON_PROPERTY_GUARDRAIL_CUTOFF_THRESHOLD,
  ExperimentsMetricV2DTODataAttributes.JSON_PROPERTY_METRIC_TYPE,
  ExperimentsMetricV2DTODataAttributes.JSON_PROPERTY_MIGRATION_METADATA,
  ExperimentsMetricV2DTODataAttributes.JSON_PROPERTY_NAME,
  ExperimentsMetricV2DTODataAttributes.JSON_PROPERTY_NUMERATOR_AGGREGATION,
  ExperimentsMetricV2DTODataAttributes.JSON_PROPERTY_PERCENTILE_AGGREGATION,
  ExperimentsMetricV2DTODataAttributes.JSON_PROPERTY_REFERENCE_URL,
  ExperimentsMetricV2DTODataAttributes.JSON_PROPERTY_UPDATED_AT
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class ExperimentsMetricV2DTODataAttributes {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_CERTIFIED_AT = "certified_at";
  private JsonNullable<OffsetDateTime> certifiedAt = JsonNullable.<OffsetDateTime>undefined();

  public static final String JSON_PROPERTY_CREATED_AT = "created_at";
  private OffsetDateTime createdAt;

  public static final String JSON_PROPERTY_DATA_SOURCE_TYPE = "data_source_type";
  private ExperimentsMetricV2DTODataAttributesDataSourceType dataSourceType;

  public static final String JSON_PROPERTY_DENOMINATOR_AGGREGATION = "denominator_aggregation";
  private JsonNullable<ExperimentsMetricV2DTODataAttributesNumeratorAggregation>
      denominatorAggregation =
          JsonNullable.<ExperimentsMetricV2DTODataAttributesNumeratorAggregation>undefined();

  public static final String JSON_PROPERTY_DESCRIPTION = "description";
  private String description;

  public static final String JSON_PROPERTY_DESIRED_CHANGE = "desired_change";
  private ExperimentsMetricV2DTODataAttributesDesiredChange desiredChange;

  public static final String JSON_PROPERTY_EXPERIMENT_COUNT = "experiment_count";
  private JsonNullable<Long> experimentCount = JsonNullable.<Long>undefined();

  public static final String JSON_PROPERTY_FORMAT_AS_PERCENT = "format_as_percent";
  private Boolean formatAsPercent;

  public static final String JSON_PROPERTY_GUARDRAIL_CUTOFF_THRESHOLD =
      "guardrail_cutoff_threshold";
  private JsonNullable<Double> guardrailCutoffThreshold = JsonNullable.<Double>undefined();

  public static final String JSON_PROPERTY_METRIC_TYPE = "metric_type";
  private ExperimentsMetricV2DTODataAttributesMetricType metricType;

  public static final String JSON_PROPERTY_MIGRATION_METADATA = "migration_metadata";
  private Object migrationMetadata = null;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_NUMERATOR_AGGREGATION = "numerator_aggregation";
  private JsonNullable<ExperimentsMetricV2DTODataAttributesNumeratorAggregation>
      numeratorAggregation =
          JsonNullable.<ExperimentsMetricV2DTODataAttributesNumeratorAggregation>undefined();

  public static final String JSON_PROPERTY_PERCENTILE_AGGREGATION = "percentile_aggregation";
  private JsonNullable<ExperimentsMetricV2DTODataAttributesPercentileAggregation>
      percentileAggregation =
          JsonNullable.<ExperimentsMetricV2DTODataAttributesPercentileAggregation>undefined();

  public static final String JSON_PROPERTY_REFERENCE_URL = "reference_url";
  private String referenceUrl;

  public static final String JSON_PROPERTY_UPDATED_AT = "updated_at";
  private OffsetDateTime updatedAt;

  public ExperimentsMetricV2DTODataAttributes certifiedAt(OffsetDateTime certifiedAt) {
    this.certifiedAt = JsonNullable.<OffsetDateTime>of(certifiedAt);
    return this;
  }

  /**
   * Time when this resource was certified.
   *
   * @return certifiedAt
   */
  @jakarta.annotation.Nullable
  @JsonIgnore
  public OffsetDateTime getCertifiedAt() {
    return certifiedAt.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_CERTIFIED_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<OffsetDateTime> getCertifiedAt_JsonNullable() {
    return certifiedAt;
  }

  @JsonProperty(JSON_PROPERTY_CERTIFIED_AT)
  public void setCertifiedAt_JsonNullable(JsonNullable<OffsetDateTime> certifiedAt) {
    this.certifiedAt = certifiedAt;
  }

  public void setCertifiedAt(OffsetDateTime certifiedAt) {
    this.certifiedAt = JsonNullable.<OffsetDateTime>of(certifiedAt);
  }

  public ExperimentsMetricV2DTODataAttributes createdAt(OffsetDateTime createdAt) {
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

  public ExperimentsMetricV2DTODataAttributes dataSourceType(
      ExperimentsMetricV2DTODataAttributesDataSourceType dataSourceType) {
    this.dataSourceType = dataSourceType;
    this.unparsed |= !dataSourceType.isValid();
    return this;
  }

  /**
   * Source of the data used to calculate the metric.
   *
   * @return dataSourceType
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DATA_SOURCE_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public ExperimentsMetricV2DTODataAttributesDataSourceType getDataSourceType() {
    return dataSourceType;
  }

  public void setDataSourceType(ExperimentsMetricV2DTODataAttributesDataSourceType dataSourceType) {
    if (!dataSourceType.isValid()) {
      this.unparsed = true;
    }
    this.dataSourceType = dataSourceType;
  }

  public ExperimentsMetricV2DTODataAttributes denominatorAggregation(
      ExperimentsMetricV2DTODataAttributesNumeratorAggregation denominatorAggregation) {
    this.denominatorAggregation =
        JsonNullable.<ExperimentsMetricV2DTODataAttributesNumeratorAggregation>of(
            denominatorAggregation);
    return this;
  }

  /**
   * Source measure and aggregation settings for a metric value.
   *
   * @return denominatorAggregation
   */
  @jakarta.annotation.Nullable
  @JsonIgnore
  public ExperimentsMetricV2DTODataAttributesNumeratorAggregation getDenominatorAggregation() {
    return denominatorAggregation.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_DENOMINATOR_AGGREGATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<ExperimentsMetricV2DTODataAttributesNumeratorAggregation>
      getDenominatorAggregation_JsonNullable() {
    return denominatorAggregation;
  }

  @JsonProperty(JSON_PROPERTY_DENOMINATOR_AGGREGATION)
  public void setDenominatorAggregation_JsonNullable(
      JsonNullable<ExperimentsMetricV2DTODataAttributesNumeratorAggregation>
          denominatorAggregation) {
    this.denominatorAggregation = denominatorAggregation;
  }

  public void setDenominatorAggregation(
      ExperimentsMetricV2DTODataAttributesNumeratorAggregation denominatorAggregation) {
    this.denominatorAggregation =
        JsonNullable.<ExperimentsMetricV2DTODataAttributesNumeratorAggregation>of(
            denominatorAggregation);
  }

  public ExperimentsMetricV2DTODataAttributes description(String description) {
    this.description = description;
    return this;
  }

  /**
   * Text that explains the metric.
   *
   * @return description
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DESCRIPTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public ExperimentsMetricV2DTODataAttributes desiredChange(
      ExperimentsMetricV2DTODataAttributesDesiredChange desiredChange) {
    this.desiredChange = desiredChange;
    this.unparsed |= !desiredChange.isValid();
    return this;
  }

  /**
   * Direction of metric change considered desirable.
   *
   * @return desiredChange
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DESIRED_CHANGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public ExperimentsMetricV2DTODataAttributesDesiredChange getDesiredChange() {
    return desiredChange;
  }

  public void setDesiredChange(ExperimentsMetricV2DTODataAttributesDesiredChange desiredChange) {
    if (!desiredChange.isValid()) {
      this.unparsed = true;
    }
    this.desiredChange = desiredChange;
  }

  public ExperimentsMetricV2DTODataAttributes experimentCount(Long experimentCount) {
    this.experimentCount = JsonNullable.<Long>of(experimentCount);
    return this;
  }

  /**
   * Number of experiments that reference this resource.
   *
   * @return experimentCount
   */
  @jakarta.annotation.Nullable
  @JsonIgnore
  public Long getExperimentCount() {
    return experimentCount.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_EXPERIMENT_COUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<Long> getExperimentCount_JsonNullable() {
    return experimentCount;
  }

  @JsonProperty(JSON_PROPERTY_EXPERIMENT_COUNT)
  public void setExperimentCount_JsonNullable(JsonNullable<Long> experimentCount) {
    this.experimentCount = experimentCount;
  }

  public void setExperimentCount(Long experimentCount) {
    this.experimentCount = JsonNullable.<Long>of(experimentCount);
  }

  public ExperimentsMetricV2DTODataAttributes formatAsPercent(Boolean formatAsPercent) {
    this.formatAsPercent = formatAsPercent;
    return this;
  }

  /**
   * Whether to display the metric value as a percentage.
   *
   * @return formatAsPercent
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_FORMAT_AS_PERCENT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getFormatAsPercent() {
    return formatAsPercent;
  }

  public void setFormatAsPercent(Boolean formatAsPercent) {
    this.formatAsPercent = formatAsPercent;
  }

  public ExperimentsMetricV2DTODataAttributes guardrailCutoffThreshold(
      Double guardrailCutoffThreshold) {
    this.guardrailCutoffThreshold = JsonNullable.<Double>of(guardrailCutoffThreshold);
    return this;
  }

  /**
   * Threshold used when evaluating this metric as a guardrail.
   *
   * @return guardrailCutoffThreshold
   */
  @jakarta.annotation.Nullable
  @JsonIgnore
  public Double getGuardrailCutoffThreshold() {
    return guardrailCutoffThreshold.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_GUARDRAIL_CUTOFF_THRESHOLD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<Double> getGuardrailCutoffThreshold_JsonNullable() {
    return guardrailCutoffThreshold;
  }

  @JsonProperty(JSON_PROPERTY_GUARDRAIL_CUTOFF_THRESHOLD)
  public void setGuardrailCutoffThreshold_JsonNullable(
      JsonNullable<Double> guardrailCutoffThreshold) {
    this.guardrailCutoffThreshold = guardrailCutoffThreshold;
  }

  public void setGuardrailCutoffThreshold(Double guardrailCutoffThreshold) {
    this.guardrailCutoffThreshold = JsonNullable.<Double>of(guardrailCutoffThreshold);
  }

  public ExperimentsMetricV2DTODataAttributes metricType(
      ExperimentsMetricV2DTODataAttributesMetricType metricType) {
    this.metricType = metricType;
    this.unparsed |= !metricType.isValid();
    return this;
  }

  /**
   * Type of metric calculation.
   *
   * @return metricType
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_METRIC_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public ExperimentsMetricV2DTODataAttributesMetricType getMetricType() {
    return metricType;
  }

  public void setMetricType(ExperimentsMetricV2DTODataAttributesMetricType metricType) {
    if (!metricType.isValid()) {
      this.unparsed = true;
    }
    this.metricType = metricType;
  }

  public ExperimentsMetricV2DTODataAttributes migrationMetadata(Object migrationMetadata) {
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

  public ExperimentsMetricV2DTODataAttributes name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Display name of the metric.
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

  public ExperimentsMetricV2DTODataAttributes numeratorAggregation(
      ExperimentsMetricV2DTODataAttributesNumeratorAggregation numeratorAggregation) {
    this.numeratorAggregation =
        JsonNullable.<ExperimentsMetricV2DTODataAttributesNumeratorAggregation>of(
            numeratorAggregation);
    return this;
  }

  /**
   * Source measure and aggregation settings for a metric value.
   *
   * @return numeratorAggregation
   */
  @jakarta.annotation.Nullable
  @JsonIgnore
  public ExperimentsMetricV2DTODataAttributesNumeratorAggregation getNumeratorAggregation() {
    return numeratorAggregation.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_NUMERATOR_AGGREGATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<ExperimentsMetricV2DTODataAttributesNumeratorAggregation>
      getNumeratorAggregation_JsonNullable() {
    return numeratorAggregation;
  }

  @JsonProperty(JSON_PROPERTY_NUMERATOR_AGGREGATION)
  public void setNumeratorAggregation_JsonNullable(
      JsonNullable<ExperimentsMetricV2DTODataAttributesNumeratorAggregation> numeratorAggregation) {
    this.numeratorAggregation = numeratorAggregation;
  }

  public void setNumeratorAggregation(
      ExperimentsMetricV2DTODataAttributesNumeratorAggregation numeratorAggregation) {
    this.numeratorAggregation =
        JsonNullable.<ExperimentsMetricV2DTODataAttributesNumeratorAggregation>of(
            numeratorAggregation);
  }

  public ExperimentsMetricV2DTODataAttributes percentileAggregation(
      ExperimentsMetricV2DTODataAttributesPercentileAggregation percentileAggregation) {
    this.percentileAggregation =
        JsonNullable.<ExperimentsMetricV2DTODataAttributesPercentileAggregation>of(
            percentileAggregation);
    return this;
  }

  /**
   * Source measure and settings for a percentile metric.
   *
   * @return percentileAggregation
   */
  @jakarta.annotation.Nullable
  @JsonIgnore
  public ExperimentsMetricV2DTODataAttributesPercentileAggregation getPercentileAggregation() {
    return percentileAggregation.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_PERCENTILE_AGGREGATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<ExperimentsMetricV2DTODataAttributesPercentileAggregation>
      getPercentileAggregation_JsonNullable() {
    return percentileAggregation;
  }

  @JsonProperty(JSON_PROPERTY_PERCENTILE_AGGREGATION)
  public void setPercentileAggregation_JsonNullable(
      JsonNullable<ExperimentsMetricV2DTODataAttributesPercentileAggregation>
          percentileAggregation) {
    this.percentileAggregation = percentileAggregation;
  }

  public void setPercentileAggregation(
      ExperimentsMetricV2DTODataAttributesPercentileAggregation percentileAggregation) {
    this.percentileAggregation =
        JsonNullable.<ExperimentsMetricV2DTODataAttributesPercentileAggregation>of(
            percentileAggregation);
  }

  public ExperimentsMetricV2DTODataAttributes referenceUrl(String referenceUrl) {
    this.referenceUrl = referenceUrl;
    return this;
  }

  /**
   * URL with supporting information about the metric.
   *
   * @return referenceUrl
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_REFERENCE_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getReferenceUrl() {
    return referenceUrl;
  }

  public void setReferenceUrl(String referenceUrl) {
    this.referenceUrl = referenceUrl;
  }

  public ExperimentsMetricV2DTODataAttributes updatedAt(OffsetDateTime updatedAt) {
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
   * @return ExperimentsMetricV2DTODataAttributes
   */
  @JsonAnySetter
  public ExperimentsMetricV2DTODataAttributes putAdditionalProperty(String key, Object value) {
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

  /** Return true if this ExperimentsMetricV2DTODataAttributes object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ExperimentsMetricV2DTODataAttributes experimentsMetricV2DtoDataAttributes =
        (ExperimentsMetricV2DTODataAttributes) o;
    return Objects.equals(this.certifiedAt, experimentsMetricV2DtoDataAttributes.certifiedAt)
        && Objects.equals(this.createdAt, experimentsMetricV2DtoDataAttributes.createdAt)
        && Objects.equals(this.dataSourceType, experimentsMetricV2DtoDataAttributes.dataSourceType)
        && Objects.equals(
            this.denominatorAggregation,
            experimentsMetricV2DtoDataAttributes.denominatorAggregation)
        && Objects.equals(this.description, experimentsMetricV2DtoDataAttributes.description)
        && Objects.equals(this.desiredChange, experimentsMetricV2DtoDataAttributes.desiredChange)
        && Objects.equals(
            this.experimentCount, experimentsMetricV2DtoDataAttributes.experimentCount)
        && Objects.equals(
            this.formatAsPercent, experimentsMetricV2DtoDataAttributes.formatAsPercent)
        && Objects.equals(
            this.guardrailCutoffThreshold,
            experimentsMetricV2DtoDataAttributes.guardrailCutoffThreshold)
        && Objects.equals(this.metricType, experimentsMetricV2DtoDataAttributes.metricType)
        && Objects.equals(
            this.migrationMetadata, experimentsMetricV2DtoDataAttributes.migrationMetadata)
        && Objects.equals(this.name, experimentsMetricV2DtoDataAttributes.name)
        && Objects.equals(
            this.numeratorAggregation, experimentsMetricV2DtoDataAttributes.numeratorAggregation)
        && Objects.equals(
            this.percentileAggregation, experimentsMetricV2DtoDataAttributes.percentileAggregation)
        && Objects.equals(this.referenceUrl, experimentsMetricV2DtoDataAttributes.referenceUrl)
        && Objects.equals(this.updatedAt, experimentsMetricV2DtoDataAttributes.updatedAt)
        && Objects.equals(
            this.additionalProperties, experimentsMetricV2DtoDataAttributes.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        certifiedAt,
        createdAt,
        dataSourceType,
        denominatorAggregation,
        description,
        desiredChange,
        experimentCount,
        formatAsPercent,
        guardrailCutoffThreshold,
        metricType,
        migrationMetadata,
        name,
        numeratorAggregation,
        percentileAggregation,
        referenceUrl,
        updatedAt,
        additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExperimentsMetricV2DTODataAttributes {\n");
    sb.append("    certifiedAt: ").append(toIndentedString(certifiedAt)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    dataSourceType: ").append(toIndentedString(dataSourceType)).append("\n");
    sb.append("    denominatorAggregation: ")
        .append(toIndentedString(denominatorAggregation))
        .append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    desiredChange: ").append(toIndentedString(desiredChange)).append("\n");
    sb.append("    experimentCount: ").append(toIndentedString(experimentCount)).append("\n");
    sb.append("    formatAsPercent: ").append(toIndentedString(formatAsPercent)).append("\n");
    sb.append("    guardrailCutoffThreshold: ")
        .append(toIndentedString(guardrailCutoffThreshold))
        .append("\n");
    sb.append("    metricType: ").append(toIndentedString(metricType)).append("\n");
    sb.append("    migrationMetadata: ").append(toIndentedString(migrationMetadata)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    numeratorAggregation: ")
        .append(toIndentedString(numeratorAggregation))
        .append("\n");
    sb.append("    percentileAggregation: ")
        .append(toIndentedString(percentileAggregation))
        .append("\n");
    sb.append("    referenceUrl: ").append(toIndentedString(referenceUrl)).append("\n");
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
