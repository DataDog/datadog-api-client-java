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

/** Metric values and statistical results for one variant. */
@JsonPropertyOrder({
  ExperimentsVariantResultsV2DTODataAttributesMetricsItems.JSON_PROPERTY_ANALYSES,
  ExperimentsVariantResultsV2DTODataAttributesMetricsItems.JSON_PROPERTY_ASSIGNMENT_COUNT,
  ExperimentsVariantResultsV2DTODataAttributesMetricsItems.JSON_PROPERTY_COVERAGE,
  ExperimentsVariantResultsV2DTODataAttributesMetricsItems.JSON_PROPERTY_COVERAGE_SUMMARY,
  ExperimentsVariantResultsV2DTODataAttributesMetricsItems
      .JSON_PROPERTY_COVERAGE_UNAVAILABLE_REASON,
  ExperimentsVariantResultsV2DTODataAttributesMetricsItems.JSON_PROPERTY_DENOMINATOR,
  ExperimentsVariantResultsV2DTODataAttributesMetricsItems.JSON_PROPERTY_DESIRED_CHANGE,
  ExperimentsVariantResultsV2DTODataAttributesMetricsItems.JSON_PROPERTY_METRIC_ID,
  ExperimentsVariantResultsV2DTODataAttributesMetricsItems.JSON_PROPERTY_METRIC_NAME,
  ExperimentsVariantResultsV2DTODataAttributesMetricsItems.JSON_PROPERTY_NUMERATOR,
  ExperimentsVariantResultsV2DTODataAttributesMetricsItems.JSON_PROPERTY_SUB_METRIC_PROPERTY_NAME,
  ExperimentsVariantResultsV2DTODataAttributesMetricsItems.JSON_PROPERTY_SUB_METRIC_PROPERTY_VALUE
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class ExperimentsVariantResultsV2DTODataAttributesMetricsItems {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_ANALYSES = "analyses";
  private List<ExperimentsVariantResultsV2DTODataAttributesMetricsItemsAnalysesItems> analyses =
      null;

  public static final String JSON_PROPERTY_ASSIGNMENT_COUNT = "assignment_count";
  private Long assignmentCount;

  public static final String JSON_PROPERTY_COVERAGE = "coverage";
  private Double coverage;

  public static final String JSON_PROPERTY_COVERAGE_SUMMARY = "coverage_summary";
  private ExperimentsVariantResultsV2DTODataAttributesMetricsItemsCoverageSummary coverageSummary;

  public static final String JSON_PROPERTY_COVERAGE_UNAVAILABLE_REASON =
      "coverage_unavailable_reason";
  private String coverageUnavailableReason;

  public static final String JSON_PROPERTY_DENOMINATOR = "denominator";
  private JsonNullable<Double> denominator = JsonNullable.<Double>undefined();

  public static final String JSON_PROPERTY_DESIRED_CHANGE = "desired_change";
  private ExperimentsMetricV2DTODataAttributesDesiredChange desiredChange;

  public static final String JSON_PROPERTY_METRIC_ID = "metric_id";
  private String metricId;

  public static final String JSON_PROPERTY_METRIC_NAME = "metric_name";
  private String metricName;

  public static final String JSON_PROPERTY_NUMERATOR = "numerator";
  private JsonNullable<Double> numerator = JsonNullable.<Double>undefined();

  public static final String JSON_PROPERTY_SUB_METRIC_PROPERTY_NAME = "sub_metric_property_name";
  private String subMetricPropertyName;

  public static final String JSON_PROPERTY_SUB_METRIC_PROPERTY_VALUE = "sub_metric_property_value";
  private String subMetricPropertyValue;

  public ExperimentsVariantResultsV2DTODataAttributesMetricsItems analyses(
      List<ExperimentsVariantResultsV2DTODataAttributesMetricsItemsAnalysesItems> analyses) {
    this.analyses = analyses;
    if (analyses != null) {
      for (ExperimentsVariantResultsV2DTODataAttributesMetricsItemsAnalysesItems item : analyses) {
        this.unparsed |= item.unparsed;
      }
    }
    return this;
  }

  public ExperimentsVariantResultsV2DTODataAttributesMetricsItems addAnalysesItem(
      ExperimentsVariantResultsV2DTODataAttributesMetricsItemsAnalysesItems analysesItem) {
    if (this.analyses == null) {
      this.analyses = new ArrayList<>();
    }
    this.analyses.add(analysesItem);
    this.unparsed |= analysesItem.unparsed;
    return this;
  }

  /**
   * Statistical analyses calculated for this metric and variant.
   *
   * @return analyses
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ANALYSES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<ExperimentsVariantResultsV2DTODataAttributesMetricsItemsAnalysesItems> getAnalyses() {
    return analyses;
  }

  public void setAnalyses(
      List<ExperimentsVariantResultsV2DTODataAttributesMetricsItemsAnalysesItems> analyses) {
    this.analyses = analyses;
    if (analyses != null) {
      for (ExperimentsVariantResultsV2DTODataAttributesMetricsItemsAnalysesItems item : analyses) {
        this.unparsed |= item.unparsed;
      }
    }
  }

  public ExperimentsVariantResultsV2DTODataAttributesMetricsItems assignmentCount(
      Long assignmentCount) {
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

  public ExperimentsVariantResultsV2DTODataAttributesMetricsItems coverage(Double coverage) {
    this.coverage = coverage;
    return this;
  }

  /**
   * Estimated share of the global metric total from the eligible population if that population
   * received control. The estimate can exceed 1.
   *
   * @return coverage
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_COVERAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getCoverage() {
    return coverage;
  }

  public void setCoverage(Double coverage) {
    this.coverage = coverage;
  }

  public ExperimentsVariantResultsV2DTODataAttributesMetricsItems coverageSummary(
      ExperimentsVariantResultsV2DTODataAttributesMetricsItemsCoverageSummary coverageSummary) {
    this.coverageSummary = coverageSummary;
    this.unparsed |= coverageSummary.unparsed;
    return this;
  }

  /**
   * Population totals and allocation used to calculate metric coverage.
   *
   * @return coverageSummary
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_COVERAGE_SUMMARY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public ExperimentsVariantResultsV2DTODataAttributesMetricsItemsCoverageSummary
      getCoverageSummary() {
    return coverageSummary;
  }

  public void setCoverageSummary(
      ExperimentsVariantResultsV2DTODataAttributesMetricsItemsCoverageSummary coverageSummary) {
    this.coverageSummary = coverageSummary;
    if (coverageSummary != null) {
      this.unparsed |= coverageSummary.unparsed;
    }
  }

  public ExperimentsVariantResultsV2DTODataAttributesMetricsItems coverageUnavailableReason(
      String coverageUnavailableReason) {
    this.coverageUnavailableReason = coverageUnavailableReason;
    return this;
  }

  /**
   * Reason that metric coverage could not be calculated.
   *
   * @return coverageUnavailableReason
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_COVERAGE_UNAVAILABLE_REASON)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getCoverageUnavailableReason() {
    return coverageUnavailableReason;
  }

  public void setCoverageUnavailableReason(String coverageUnavailableReason) {
    this.coverageUnavailableReason = coverageUnavailableReason;
  }

  public ExperimentsVariantResultsV2DTODataAttributesMetricsItems denominator(Double denominator) {
    this.denominator = JsonNullable.<Double>of(denominator);
    return this;
  }

  /**
   * Aggregated denominator value for this metric and variant.
   *
   * @return denominator
   */
  @jakarta.annotation.Nullable
  @JsonIgnore
  public Double getDenominator() {
    return denominator.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_DENOMINATOR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<Double> getDenominator_JsonNullable() {
    return denominator;
  }

  @JsonProperty(JSON_PROPERTY_DENOMINATOR)
  public void setDenominator_JsonNullable(JsonNullable<Double> denominator) {
    this.denominator = denominator;
  }

  public void setDenominator(Double denominator) {
    this.denominator = JsonNullable.<Double>of(denominator);
  }

  public ExperimentsVariantResultsV2DTODataAttributesMetricsItems desiredChange(
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

  public ExperimentsVariantResultsV2DTODataAttributesMetricsItems metricId(String metricId) {
    this.metricId = metricId;
    return this;
  }

  /**
   * ID of the metric represented by this entry.
   *
   * @return metricId
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_METRIC_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getMetricId() {
    return metricId;
  }

  public void setMetricId(String metricId) {
    this.metricId = metricId;
  }

  public ExperimentsVariantResultsV2DTODataAttributesMetricsItems metricName(String metricName) {
    this.metricName = metricName;
    return this;
  }

  /**
   * Display name of the metric represented by this entry.
   *
   * @return metricName
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_METRIC_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getMetricName() {
    return metricName;
  }

  public void setMetricName(String metricName) {
    this.metricName = metricName;
  }

  public ExperimentsVariantResultsV2DTODataAttributesMetricsItems numerator(Double numerator) {
    this.numerator = JsonNullable.<Double>of(numerator);
    return this;
  }

  /**
   * Aggregated numerator value for this metric and variant.
   *
   * @return numerator
   */
  @jakarta.annotation.Nullable
  @JsonIgnore
  public Double getNumerator() {
    return numerator.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_NUMERATOR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<Double> getNumerator_JsonNullable() {
    return numerator;
  }

  @JsonProperty(JSON_PROPERTY_NUMERATOR)
  public void setNumerator_JsonNullable(JsonNullable<Double> numerator) {
    this.numerator = numerator;
  }

  public void setNumerator(Double numerator) {
    this.numerator = JsonNullable.<Double>of(numerator);
  }

  public ExperimentsVariantResultsV2DTODataAttributesMetricsItems subMetricPropertyName(
      String subMetricPropertyName) {
    this.subMetricPropertyName = subMetricPropertyName;
    return this;
  }

  /**
   * Name of the property used to split this metric result.
   *
   * @return subMetricPropertyName
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SUB_METRIC_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getSubMetricPropertyName() {
    return subMetricPropertyName;
  }

  public void setSubMetricPropertyName(String subMetricPropertyName) {
    this.subMetricPropertyName = subMetricPropertyName;
  }

  public ExperimentsVariantResultsV2DTODataAttributesMetricsItems subMetricPropertyValue(
      String subMetricPropertyValue) {
    this.subMetricPropertyValue = subMetricPropertyValue;
    return this;
  }

  /**
   * Property value represented by this split metric result.
   *
   * @return subMetricPropertyValue
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SUB_METRIC_PROPERTY_VALUE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getSubMetricPropertyValue() {
    return subMetricPropertyValue;
  }

  public void setSubMetricPropertyValue(String subMetricPropertyValue) {
    this.subMetricPropertyValue = subMetricPropertyValue;
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
   * @return ExperimentsVariantResultsV2DTODataAttributesMetricsItems
   */
  @JsonAnySetter
  public ExperimentsVariantResultsV2DTODataAttributesMetricsItems putAdditionalProperty(
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
   * Return true if this ExperimentsVariantResultsV2DTODataAttributesMetricsItems object is equal to
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
    ExperimentsVariantResultsV2DTODataAttributesMetricsItems
        experimentsVariantResultsV2DtoDataAttributesMetricsItems =
            (ExperimentsVariantResultsV2DTODataAttributesMetricsItems) o;
    return Objects.equals(
            this.analyses, experimentsVariantResultsV2DtoDataAttributesMetricsItems.analyses)
        && Objects.equals(
            this.assignmentCount,
            experimentsVariantResultsV2DtoDataAttributesMetricsItems.assignmentCount)
        && Objects.equals(
            this.coverage, experimentsVariantResultsV2DtoDataAttributesMetricsItems.coverage)
        && Objects.equals(
            this.coverageSummary,
            experimentsVariantResultsV2DtoDataAttributesMetricsItems.coverageSummary)
        && Objects.equals(
            this.coverageUnavailableReason,
            experimentsVariantResultsV2DtoDataAttributesMetricsItems.coverageUnavailableReason)
        && Objects.equals(
            this.denominator, experimentsVariantResultsV2DtoDataAttributesMetricsItems.denominator)
        && Objects.equals(
            this.desiredChange,
            experimentsVariantResultsV2DtoDataAttributesMetricsItems.desiredChange)
        && Objects.equals(
            this.metricId, experimentsVariantResultsV2DtoDataAttributesMetricsItems.metricId)
        && Objects.equals(
            this.metricName, experimentsVariantResultsV2DtoDataAttributesMetricsItems.metricName)
        && Objects.equals(
            this.numerator, experimentsVariantResultsV2DtoDataAttributesMetricsItems.numerator)
        && Objects.equals(
            this.subMetricPropertyName,
            experimentsVariantResultsV2DtoDataAttributesMetricsItems.subMetricPropertyName)
        && Objects.equals(
            this.subMetricPropertyValue,
            experimentsVariantResultsV2DtoDataAttributesMetricsItems.subMetricPropertyValue)
        && Objects.equals(
            this.additionalProperties,
            experimentsVariantResultsV2DtoDataAttributesMetricsItems.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        analyses,
        assignmentCount,
        coverage,
        coverageSummary,
        coverageUnavailableReason,
        denominator,
        desiredChange,
        metricId,
        metricName,
        numerator,
        subMetricPropertyName,
        subMetricPropertyValue,
        additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExperimentsVariantResultsV2DTODataAttributesMetricsItems {\n");
    sb.append("    analyses: ").append(toIndentedString(analyses)).append("\n");
    sb.append("    assignmentCount: ").append(toIndentedString(assignmentCount)).append("\n");
    sb.append("    coverage: ").append(toIndentedString(coverage)).append("\n");
    sb.append("    coverageSummary: ").append(toIndentedString(coverageSummary)).append("\n");
    sb.append("    coverageUnavailableReason: ")
        .append(toIndentedString(coverageUnavailableReason))
        .append("\n");
    sb.append("    denominator: ").append(toIndentedString(denominator)).append("\n");
    sb.append("    desiredChange: ").append(toIndentedString(desiredChange)).append("\n");
    sb.append("    metricId: ").append(toIndentedString(metricId)).append("\n");
    sb.append("    metricName: ").append(toIndentedString(metricName)).append("\n");
    sb.append("    numerator: ").append(toIndentedString(numerator)).append("\n");
    sb.append("    subMetricPropertyName: ")
        .append(toIndentedString(subMetricPropertyName))
        .append("\n");
    sb.append("    subMetricPropertyValue: ")
        .append(toIndentedString(subMetricPropertyValue))
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
