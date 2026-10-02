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
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import org.openapitools.jackson.nullable.JsonNullable;

/**
 * Fields supplied to update the metric. Every attribute is optional; omit an attribute to leave it
 * unchanged.
 */
@JsonPropertyOrder({
  ExperimentsUpdateMetricV2RequestDataAttributes.JSON_PROPERTY_DATA_SOURCE_TYPE,
  ExperimentsUpdateMetricV2RequestDataAttributes.JSON_PROPERTY_DENOMINATOR_AGGREGATION,
  ExperimentsUpdateMetricV2RequestDataAttributes.JSON_PROPERTY_DESCRIPTION,
  ExperimentsUpdateMetricV2RequestDataAttributes.JSON_PROPERTY_DESIRED_CHANGE,
  ExperimentsUpdateMetricV2RequestDataAttributes.JSON_PROPERTY_FORMAT_AS_PERCENT,
  ExperimentsUpdateMetricV2RequestDataAttributes.JSON_PROPERTY_GUARDRAIL_CUTOFF_THRESHOLD,
  ExperimentsUpdateMetricV2RequestDataAttributes.JSON_PROPERTY_MIGRATION_METADATA,
  ExperimentsUpdateMetricV2RequestDataAttributes.JSON_PROPERTY_NAME,
  ExperimentsUpdateMetricV2RequestDataAttributes.JSON_PROPERTY_NUMERATOR_AGGREGATION,
  ExperimentsUpdateMetricV2RequestDataAttributes.JSON_PROPERTY_PERCENTILE_AGGREGATION
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class ExperimentsUpdateMetricV2RequestDataAttributes {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_DATA_SOURCE_TYPE = "data_source_type";
  private ExperimentsCreateMetricV2RequestDataAttributesDataSourceType dataSourceType;

  public static final String JSON_PROPERTY_DENOMINATOR_AGGREGATION = "denominator_aggregation";
  private ExperimentsCreateMetricV2RequestDataAttributesNumeratorAggregation denominatorAggregation;

  public static final String JSON_PROPERTY_DESCRIPTION = "description";
  private JsonNullable<String> description = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_DESIRED_CHANGE = "desired_change";
  private ExperimentsCreateMetricV2RequestDataAttributesDesiredChange desiredChange;

  public static final String JSON_PROPERTY_FORMAT_AS_PERCENT = "format_as_percent";
  private Boolean formatAsPercent;

  public static final String JSON_PROPERTY_GUARDRAIL_CUTOFF_THRESHOLD =
      "guardrail_cutoff_threshold";
  private JsonNullable<Double> guardrailCutoffThreshold = JsonNullable.<Double>undefined();

  public static final String JSON_PROPERTY_MIGRATION_METADATA = "migration_metadata";
  private Object migrationMetadata = null;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_NUMERATOR_AGGREGATION = "numerator_aggregation";
  private ExperimentsCreateMetricV2RequestDataAttributesNumeratorAggregation numeratorAggregation;

  public static final String JSON_PROPERTY_PERCENTILE_AGGREGATION = "percentile_aggregation";
  private ExperimentsCreateMetricV2RequestDataAttributesPercentileAggregation percentileAggregation;

  public ExperimentsUpdateMetricV2RequestDataAttributes dataSourceType(
      ExperimentsCreateMetricV2RequestDataAttributesDataSourceType dataSourceType) {
    this.dataSourceType = dataSourceType;
    this.unparsed |= !dataSourceType.isValid();
    return this;
  }

  /**
   * Source of the data backing this metric.
   *
   * @return dataSourceType
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DATA_SOURCE_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public ExperimentsCreateMetricV2RequestDataAttributesDataSourceType getDataSourceType() {
    return dataSourceType;
  }

  public void setDataSourceType(
      ExperimentsCreateMetricV2RequestDataAttributesDataSourceType dataSourceType) {
    if (!dataSourceType.isValid()) {
      this.unparsed = true;
    }
    this.dataSourceType = dataSourceType;
  }

  public ExperimentsUpdateMetricV2RequestDataAttributes denominatorAggregation(
      ExperimentsCreateMetricV2RequestDataAttributesNumeratorAggregation denominatorAggregation) {
    this.denominatorAggregation = denominatorAggregation;
    this.unparsed |= denominatorAggregation.unparsed;
    return this;
  }

  /**
   * Measure and calculation settings for a numerator or denominator aggregation. Supply exactly one
   * non-null measure.
   *
   * @return denominatorAggregation
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DENOMINATOR_AGGREGATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public ExperimentsCreateMetricV2RequestDataAttributesNumeratorAggregation
      getDenominatorAggregation() {
    return denominatorAggregation;
  }

  public void setDenominatorAggregation(
      ExperimentsCreateMetricV2RequestDataAttributesNumeratorAggregation denominatorAggregation) {
    this.denominatorAggregation = denominatorAggregation;
    if (denominatorAggregation != null) {
      this.unparsed |= denominatorAggregation.unparsed;
    }
  }

  public ExperimentsUpdateMetricV2RequestDataAttributes description(String description) {
    this.description = JsonNullable.<String>of(description);
    return this;
  }

  /**
   * Send null to clear the description. Omit to leave it unchanged.
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

  public ExperimentsUpdateMetricV2RequestDataAttributes desiredChange(
      ExperimentsCreateMetricV2RequestDataAttributesDesiredChange desiredChange) {
    this.desiredChange = desiredChange;
    this.unparsed |= !desiredChange.isValid();
    return this;
  }

  /**
   * Direction of change that represents an improvement for this metric.
   *
   * @return desiredChange
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DESIRED_CHANGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public ExperimentsCreateMetricV2RequestDataAttributesDesiredChange getDesiredChange() {
    return desiredChange;
  }

  public void setDesiredChange(
      ExperimentsCreateMetricV2RequestDataAttributesDesiredChange desiredChange) {
    if (!desiredChange.isValid()) {
      this.unparsed = true;
    }
    this.desiredChange = desiredChange;
  }

  public ExperimentsUpdateMetricV2RequestDataAttributes formatAsPercent(Boolean formatAsPercent) {
    this.formatAsPercent = formatAsPercent;
    return this;
  }

  /**
   * Whether results render as a percentage. Omit to leave it unchanged.
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

  public ExperimentsUpdateMetricV2RequestDataAttributes guardrailCutoffThreshold(
      Double guardrailCutoffThreshold) {
    this.guardrailCutoffThreshold = JsonNullable.<Double>of(guardrailCutoffThreshold);
    return this;
  }

  /**
   * Send null to clear a stored threshold. Omit to leave it unchanged.
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

  public ExperimentsUpdateMetricV2RequestDataAttributes migrationMetadata(
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

  public ExperimentsUpdateMetricV2RequestDataAttributes name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Name of the metric. Omit to leave it unchanged.
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

  public ExperimentsUpdateMetricV2RequestDataAttributes numeratorAggregation(
      ExperimentsCreateMetricV2RequestDataAttributesNumeratorAggregation numeratorAggregation) {
    this.numeratorAggregation = numeratorAggregation;
    this.unparsed |= numeratorAggregation.unparsed;
    return this;
  }

  /**
   * Measure and calculation settings for a numerator or denominator aggregation. Supply exactly one
   * non-null measure.
   *
   * @return numeratorAggregation
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_NUMERATOR_AGGREGATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public ExperimentsCreateMetricV2RequestDataAttributesNumeratorAggregation
      getNumeratorAggregation() {
    return numeratorAggregation;
  }

  public void setNumeratorAggregation(
      ExperimentsCreateMetricV2RequestDataAttributesNumeratorAggregation numeratorAggregation) {
    this.numeratorAggregation = numeratorAggregation;
    if (numeratorAggregation != null) {
      this.unparsed |= numeratorAggregation.unparsed;
    }
  }

  public ExperimentsUpdateMetricV2RequestDataAttributes percentileAggregation(
      ExperimentsCreateMetricV2RequestDataAttributesPercentileAggregation percentileAggregation) {
    this.percentileAggregation = percentileAggregation;
    this.unparsed |= percentileAggregation.unparsed;
    return this;
  }

  /**
   * Measure and percentile to calculate for the metric. Supply exactly one non-null measure.
   *
   * @return percentileAggregation
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PERCENTILE_AGGREGATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public ExperimentsCreateMetricV2RequestDataAttributesPercentileAggregation
      getPercentileAggregation() {
    return percentileAggregation;
  }

  public void setPercentileAggregation(
      ExperimentsCreateMetricV2RequestDataAttributesPercentileAggregation percentileAggregation) {
    this.percentileAggregation = percentileAggregation;
    if (percentileAggregation != null) {
      this.unparsed |= percentileAggregation.unparsed;
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
   * @return ExperimentsUpdateMetricV2RequestDataAttributes
   */
  @JsonAnySetter
  public ExperimentsUpdateMetricV2RequestDataAttributes putAdditionalProperty(
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

  /** Return true if this ExperimentsUpdateMetricV2RequestDataAttributes object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ExperimentsUpdateMetricV2RequestDataAttributes experimentsUpdateMetricV2RequestDataAttributes =
        (ExperimentsUpdateMetricV2RequestDataAttributes) o;
    return Objects.equals(
            this.dataSourceType, experimentsUpdateMetricV2RequestDataAttributes.dataSourceType)
        && Objects.equals(
            this.denominatorAggregation,
            experimentsUpdateMetricV2RequestDataAttributes.denominatorAggregation)
        && Objects.equals(
            this.description, experimentsUpdateMetricV2RequestDataAttributes.description)
        && Objects.equals(
            this.desiredChange, experimentsUpdateMetricV2RequestDataAttributes.desiredChange)
        && Objects.equals(
            this.formatAsPercent, experimentsUpdateMetricV2RequestDataAttributes.formatAsPercent)
        && Objects.equals(
            this.guardrailCutoffThreshold,
            experimentsUpdateMetricV2RequestDataAttributes.guardrailCutoffThreshold)
        && Objects.equals(
            this.migrationMetadata,
            experimentsUpdateMetricV2RequestDataAttributes.migrationMetadata)
        && Objects.equals(this.name, experimentsUpdateMetricV2RequestDataAttributes.name)
        && Objects.equals(
            this.numeratorAggregation,
            experimentsUpdateMetricV2RequestDataAttributes.numeratorAggregation)
        && Objects.equals(
            this.percentileAggregation,
            experimentsUpdateMetricV2RequestDataAttributes.percentileAggregation)
        && Objects.equals(
            this.additionalProperties,
            experimentsUpdateMetricV2RequestDataAttributes.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        dataSourceType,
        denominatorAggregation,
        description,
        desiredChange,
        formatAsPercent,
        guardrailCutoffThreshold,
        migrationMetadata,
        name,
        numeratorAggregation,
        percentileAggregation,
        additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExperimentsUpdateMetricV2RequestDataAttributes {\n");
    sb.append("    dataSourceType: ").append(toIndentedString(dataSourceType)).append("\n");
    sb.append("    denominatorAggregation: ")
        .append(toIndentedString(denominatorAggregation))
        .append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    desiredChange: ").append(toIndentedString(desiredChange)).append("\n");
    sb.append("    formatAsPercent: ").append(toIndentedString(formatAsPercent)).append("\n");
    sb.append("    guardrailCutoffThreshold: ")
        .append(toIndentedString(guardrailCutoffThreshold))
        .append("\n");
    sb.append("    migrationMetadata: ").append(toIndentedString(migrationMetadata)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    numeratorAggregation: ")
        .append(toIndentedString(numeratorAggregation))
        .append("\n");
    sb.append("    percentileAggregation: ")
        .append(toIndentedString(percentileAggregation))
        .append("\n");
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
