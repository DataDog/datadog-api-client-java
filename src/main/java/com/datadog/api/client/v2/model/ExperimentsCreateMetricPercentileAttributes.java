/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import java.util.Objects;
import org.openapitools.jackson.nullable.JsonNullable;

/**
 * Configuration for a percentile metric. Omit numerator_aggregation and denominator_aggregation.
 */
@JsonPropertyOrder({
  ExperimentsCreateMetricPercentileAttributes.JSON_PROPERTY_DATA_SOURCE_TYPE,
  ExperimentsCreateMetricPercentileAttributes.JSON_PROPERTY_DESCRIPTION,
  ExperimentsCreateMetricPercentileAttributes.JSON_PROPERTY_DESIRED_CHANGE,
  ExperimentsCreateMetricPercentileAttributes.JSON_PROPERTY_FORMAT_AS_PERCENT,
  ExperimentsCreateMetricPercentileAttributes.JSON_PROPERTY_GUARDRAIL_CUTOFF_THRESHOLD,
  ExperimentsCreateMetricPercentileAttributes.JSON_PROPERTY_MIGRATION_METADATA,
  ExperimentsCreateMetricPercentileAttributes.JSON_PROPERTY_NAME,
  ExperimentsCreateMetricPercentileAttributes.JSON_PROPERTY_PERCENTILE_AGGREGATION
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class ExperimentsCreateMetricPercentileAttributes {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_DATA_SOURCE_TYPE = "data_source_type";
  private ExperimentsCreateMetricV2RequestDataAttributesDataSourceType dataSourceType;

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

  public static final String JSON_PROPERTY_PERCENTILE_AGGREGATION = "percentile_aggregation";
  private ExperimentsCreateMetricV2RequestDataAttributesPercentileAggregation percentileAggregation;

  public ExperimentsCreateMetricPercentileAttributes() {}

  @JsonCreator
  public ExperimentsCreateMetricPercentileAttributes(
      @JsonProperty(required = true, value = JSON_PROPERTY_DATA_SOURCE_TYPE)
          ExperimentsCreateMetricV2RequestDataAttributesDataSourceType dataSourceType,
      @JsonProperty(required = true, value = JSON_PROPERTY_DESIRED_CHANGE)
          ExperimentsCreateMetricV2RequestDataAttributesDesiredChange desiredChange,
      @JsonProperty(required = true, value = JSON_PROPERTY_NAME) String name,
      @JsonProperty(required = true, value = JSON_PROPERTY_PERCENTILE_AGGREGATION)
          ExperimentsCreateMetricV2RequestDataAttributesPercentileAggregation
              percentileAggregation) {
    this.dataSourceType = dataSourceType;
    this.unparsed |= !dataSourceType.isValid();
    this.desiredChange = desiredChange;
    this.unparsed |= !desiredChange.isValid();
    this.name = name;
    this.percentileAggregation = percentileAggregation;
    this.unparsed |= percentileAggregation.unparsed;
  }

  public ExperimentsCreateMetricPercentileAttributes dataSourceType(
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
  @JsonProperty(JSON_PROPERTY_DATA_SOURCE_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
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

  public ExperimentsCreateMetricPercentileAttributes description(String description) {
    this.description = JsonNullable.<String>of(description);
    return this;
  }

  /**
   * Description of the metric. Send null to leave it unset.
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

  public ExperimentsCreateMetricPercentileAttributes desiredChange(
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
  @JsonProperty(JSON_PROPERTY_DESIRED_CHANGE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
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

  public ExperimentsCreateMetricPercentileAttributes formatAsPercent(Boolean formatAsPercent) {
    this.formatAsPercent = formatAsPercent;
    return this;
  }

  /**
   * Whether results render as a percentage. Defaults to false when omitted.
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

  public ExperimentsCreateMetricPercentileAttributes guardrailCutoffThreshold(
      Double guardrailCutoffThreshold) {
    this.guardrailCutoffThreshold = JsonNullable.<Double>of(guardrailCutoffThreshold);
    return this;
  }

  /**
   * Guardrail cutoff threshold. Send null to leave it unset.
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

  public ExperimentsCreateMetricPercentileAttributes migrationMetadata(Object migrationMetadata) {
    this.migrationMetadata = migrationMetadata;
    return this;
  }

  /**
   * Metadata associated with migration of this resource.
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

  public ExperimentsCreateMetricPercentileAttributes name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Name of the metric.
   *
   * @return name
   */
  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public ExperimentsCreateMetricPercentileAttributes percentileAggregation(
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
  @JsonProperty(JSON_PROPERTY_PERCENTILE_AGGREGATION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
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

  /** Return true if this ExperimentsCreateMetricPercentileAttributes object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ExperimentsCreateMetricPercentileAttributes experimentsCreateMetricPercentileAttributes =
        (ExperimentsCreateMetricPercentileAttributes) o;
    return Objects.equals(
            this.dataSourceType, experimentsCreateMetricPercentileAttributes.dataSourceType)
        && Objects.equals(this.description, experimentsCreateMetricPercentileAttributes.description)
        && Objects.equals(
            this.desiredChange, experimentsCreateMetricPercentileAttributes.desiredChange)
        && Objects.equals(
            this.formatAsPercent, experimentsCreateMetricPercentileAttributes.formatAsPercent)
        && Objects.equals(
            this.guardrailCutoffThreshold,
            experimentsCreateMetricPercentileAttributes.guardrailCutoffThreshold)
        && Objects.equals(
            this.migrationMetadata, experimentsCreateMetricPercentileAttributes.migrationMetadata)
        && Objects.equals(this.name, experimentsCreateMetricPercentileAttributes.name)
        && Objects.equals(
            this.percentileAggregation,
            experimentsCreateMetricPercentileAttributes.percentileAggregation);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        dataSourceType,
        description,
        desiredChange,
        formatAsPercent,
        guardrailCutoffThreshold,
        migrationMetadata,
        name,
        percentileAggregation);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExperimentsCreateMetricPercentileAttributes {\n");
    sb.append("    dataSourceType: ").append(toIndentedString(dataSourceType)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    desiredChange: ").append(toIndentedString(desiredChange)).append("\n");
    sb.append("    formatAsPercent: ").append(toIndentedString(formatAsPercent)).append("\n");
    sb.append("    guardrailCutoffThreshold: ")
        .append(toIndentedString(guardrailCutoffThreshold))
        .append("\n");
    sb.append("    migrationMetadata: ").append(toIndentedString(migrationMetadata)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    percentileAggregation: ")
        .append(toIndentedString(percentileAggregation))
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
