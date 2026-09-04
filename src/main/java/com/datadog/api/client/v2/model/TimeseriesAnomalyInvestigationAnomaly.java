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
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/** Most significant anomaly detected in the request. */
@JsonPropertyOrder({
  TimeseriesAnomalyInvestigationAnomaly.JSON_PROPERTY_ANOMALY_DETECTION,
  TimeseriesAnomalyInvestigationAnomaly.JSON_PROPERTY_DETECTED_INTERVAL,
  TimeseriesAnomalyInvestigationAnomaly.JSON_PROPERTY_DISPLAY_INTERVAL,
  TimeseriesAnomalyInvestigationAnomaly.JSON_PROPERTY_FINDINGS,
  TimeseriesAnomalyInvestigationAnomaly.JSON_PROPERTY_MAXIMUM_DEVIATION,
  TimeseriesAnomalyInvestigationAnomaly.JSON_PROPERTY_SERIES,
  TimeseriesAnomalyInvestigationAnomaly.JSON_PROPERTY_TAG_ANALYSIS,
  TimeseriesAnomalyInvestigationAnomaly.JSON_PROPERTY_TYPE
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class TimeseriesAnomalyInvestigationAnomaly {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_ANOMALY_DETECTION = "anomaly_detection";
  private TimeseriesAnomalyInvestigationDetection anomalyDetection;

  public static final String JSON_PROPERTY_DETECTED_INTERVAL = "detected_interval";
  private TimeseriesAnomalyInvestigationInterval detectedInterval;

  public static final String JSON_PROPERTY_DISPLAY_INTERVAL = "display_interval";
  private TimeseriesAnomalyInvestigationInterval displayInterval;

  public static final String JSON_PROPERTY_FINDINGS = "findings";
  private List<TimeseriesAnomalyInvestigationFinding> findings = new ArrayList<>();

  public static final String JSON_PROPERTY_MAXIMUM_DEVIATION = "maximum_deviation";
  private TimeseriesAnomalyInvestigationMaximumDeviation maximumDeviation;

  public static final String JSON_PROPERTY_SERIES = "series";
  private TimeseriesAnomalyInvestigationSeries series;

  public static final String JSON_PROPERTY_TAG_ANALYSIS = "tag_analysis";
  private TimeseriesAnomalyInvestigationTagAnalysis tagAnalysis;

  public static final String JSON_PROPERTY_TYPE = "type";
  private TimeseriesAnomalyInvestigationAnomalyType type;

  public TimeseriesAnomalyInvestigationAnomaly() {}

  @JsonCreator
  public TimeseriesAnomalyInvestigationAnomaly(
      @JsonProperty(required = true, value = JSON_PROPERTY_ANOMALY_DETECTION)
          TimeseriesAnomalyInvestigationDetection anomalyDetection,
      @JsonProperty(required = true, value = JSON_PROPERTY_DETECTED_INTERVAL)
          TimeseriesAnomalyInvestigationInterval detectedInterval,
      @JsonProperty(required = true, value = JSON_PROPERTY_DISPLAY_INTERVAL)
          TimeseriesAnomalyInvestigationInterval displayInterval,
      @JsonProperty(required = true, value = JSON_PROPERTY_FINDINGS)
          List<TimeseriesAnomalyInvestigationFinding> findings,
      @JsonProperty(required = true, value = JSON_PROPERTY_MAXIMUM_DEVIATION)
          TimeseriesAnomalyInvestigationMaximumDeviation maximumDeviation,
      @JsonProperty(required = true, value = JSON_PROPERTY_SERIES)
          TimeseriesAnomalyInvestigationSeries series,
      @JsonProperty(required = true, value = JSON_PROPERTY_TAG_ANALYSIS)
          TimeseriesAnomalyInvestigationTagAnalysis tagAnalysis,
      @JsonProperty(required = true, value = JSON_PROPERTY_TYPE)
          TimeseriesAnomalyInvestigationAnomalyType type) {
    this.anomalyDetection = anomalyDetection;
    this.unparsed |= anomalyDetection.unparsed;
    this.detectedInterval = detectedInterval;
    this.unparsed |= detectedInterval.unparsed;
    this.displayInterval = displayInterval;
    this.unparsed |= displayInterval.unparsed;
    this.findings = findings;
    for (TimeseriesAnomalyInvestigationFinding item : findings) {
      this.unparsed |= item.unparsed;
    }
    this.maximumDeviation = maximumDeviation;
    this.unparsed |= maximumDeviation.unparsed;
    this.series = series;
    this.unparsed |= series.unparsed;
    this.tagAnalysis = tagAnalysis;
    this.unparsed |= tagAnalysis.unparsed;
    this.type = type;
    this.unparsed |= !type.isValid();
  }

  public TimeseriesAnomalyInvestigationAnomaly anomalyDetection(
      TimeseriesAnomalyInvestigationDetection anomalyDetection) {
    this.anomalyDetection = anomalyDetection;
    this.unparsed |= anomalyDetection.unparsed;
    return this;
  }

  /**
   * Anomaly detection configuration used for the result.
   *
   * @return anomalyDetection
   */
  @JsonProperty(JSON_PROPERTY_ANOMALY_DETECTION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public TimeseriesAnomalyInvestigationDetection getAnomalyDetection() {
    return anomalyDetection;
  }

  public void setAnomalyDetection(TimeseriesAnomalyInvestigationDetection anomalyDetection) {
    this.anomalyDetection = anomalyDetection;
    if (anomalyDetection != null) {
      this.unparsed |= anomalyDetection.unparsed;
    }
  }

  public TimeseriesAnomalyInvestigationAnomaly detectedInterval(
      TimeseriesAnomalyInvestigationInterval detectedInterval) {
    this.detectedInterval = detectedInterval;
    this.unparsed |= detectedInterval.unparsed;
    return this;
  }

  /**
   * Half-open time interval in milliseconds since the Unix epoch.
   *
   * @return detectedInterval
   */
  @JsonProperty(JSON_PROPERTY_DETECTED_INTERVAL)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public TimeseriesAnomalyInvestigationInterval getDetectedInterval() {
    return detectedInterval;
  }

  public void setDetectedInterval(TimeseriesAnomalyInvestigationInterval detectedInterval) {
    this.detectedInterval = detectedInterval;
    if (detectedInterval != null) {
      this.unparsed |= detectedInterval.unparsed;
    }
  }

  public TimeseriesAnomalyInvestigationAnomaly displayInterval(
      TimeseriesAnomalyInvestigationInterval displayInterval) {
    this.displayInterval = displayInterval;
    this.unparsed |= displayInterval.unparsed;
    return this;
  }

  /**
   * Half-open time interval in milliseconds since the Unix epoch.
   *
   * @return displayInterval
   */
  @JsonProperty(JSON_PROPERTY_DISPLAY_INTERVAL)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public TimeseriesAnomalyInvestigationInterval getDisplayInterval() {
    return displayInterval;
  }

  public void setDisplayInterval(TimeseriesAnomalyInvestigationInterval displayInterval) {
    this.displayInterval = displayInterval;
    if (displayInterval != null) {
      this.unparsed |= displayInterval.unparsed;
    }
  }

  public TimeseriesAnomalyInvestigationAnomaly findings(
      List<TimeseriesAnomalyInvestigationFinding> findings) {
    this.findings = findings;
    for (TimeseriesAnomalyInvestigationFinding item : findings) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }

  public TimeseriesAnomalyInvestigationAnomaly addFindingsItem(
      TimeseriesAnomalyInvestigationFinding findingsItem) {
    this.findings.add(findingsItem);
    this.unparsed |= findingsItem.unparsed;
    return this;
  }

  /**
   * Deterministic explanations for the anomaly, ordered by importance.
   *
   * @return findings
   */
  @JsonProperty(JSON_PROPERTY_FINDINGS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public List<TimeseriesAnomalyInvestigationFinding> getFindings() {
    return findings;
  }

  public void setFindings(List<TimeseriesAnomalyInvestigationFinding> findings) {
    this.findings = findings;
    if (findings != null) {
      for (TimeseriesAnomalyInvestigationFinding item : findings) {
        this.unparsed |= item.unparsed;
      }
    }
  }

  public TimeseriesAnomalyInvestigationAnomaly maximumDeviation(
      TimeseriesAnomalyInvestigationMaximumDeviation maximumDeviation) {
    this.maximumDeviation = maximumDeviation;
    this.unparsed |= maximumDeviation.unparsed;
    return this;
  }

  /**
   * Most anomalous point within the detected interval.
   *
   * @return maximumDeviation
   */
  @JsonProperty(JSON_PROPERTY_MAXIMUM_DEVIATION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public TimeseriesAnomalyInvestigationMaximumDeviation getMaximumDeviation() {
    return maximumDeviation;
  }

  public void setMaximumDeviation(TimeseriesAnomalyInvestigationMaximumDeviation maximumDeviation) {
    this.maximumDeviation = maximumDeviation;
    if (maximumDeviation != null) {
      this.unparsed |= maximumDeviation.unparsed;
    }
  }

  public TimeseriesAnomalyInvestigationAnomaly series(TimeseriesAnomalyInvestigationSeries series) {
    this.series = series;
    this.unparsed |= series.unparsed;
    return this;
  }

  /**
   * Logical series on which the anomaly was detected.
   *
   * @return series
   */
  @JsonProperty(JSON_PROPERTY_SERIES)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public TimeseriesAnomalyInvestigationSeries getSeries() {
    return series;
  }

  public void setSeries(TimeseriesAnomalyInvestigationSeries series) {
    this.series = series;
    if (series != null) {
      this.unparsed |= series.unparsed;
    }
  }

  public TimeseriesAnomalyInvestigationAnomaly tagAnalysis(
      TimeseriesAnomalyInvestigationTagAnalysis tagAnalysis) {
    this.tagAnalysis = tagAnalysis;
    this.unparsed |= tagAnalysis.unparsed;
    return this;
  }

  /**
   * Summary of optional influential-tag enrichment. Count and key fields are present only when
   * analysis completes; enrichment availability does not affect completion of the investigation
   * result.
   *
   * @return tagAnalysis
   */
  @JsonProperty(JSON_PROPERTY_TAG_ANALYSIS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public TimeseriesAnomalyInvestigationTagAnalysis getTagAnalysis() {
    return tagAnalysis;
  }

  public void setTagAnalysis(TimeseriesAnomalyInvestigationTagAnalysis tagAnalysis) {
    this.tagAnalysis = tagAnalysis;
    if (tagAnalysis != null) {
      this.unparsed |= tagAnalysis.unparsed;
    }
  }

  public TimeseriesAnomalyInvestigationAnomaly type(
      TimeseriesAnomalyInvestigationAnomalyType type) {
    this.type = type;
    this.unparsed |= !type.isValid();
    return this;
  }

  /**
   * Direction of an anomaly relative to its expected range.
   *
   * @return type
   */
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public TimeseriesAnomalyInvestigationAnomalyType getType() {
    return type;
  }

  public void setType(TimeseriesAnomalyInvestigationAnomalyType type) {
    if (!type.isValid()) {
      this.unparsed = true;
    }
    this.type = type;
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
   * @return TimeseriesAnomalyInvestigationAnomaly
   */
  @JsonAnySetter
  public TimeseriesAnomalyInvestigationAnomaly putAdditionalProperty(String key, Object value) {
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

  /** Return true if this TimeseriesAnomalyInvestigationAnomaly object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TimeseriesAnomalyInvestigationAnomaly timeseriesAnomalyInvestigationAnomaly =
        (TimeseriesAnomalyInvestigationAnomaly) o;
    return Objects.equals(
            this.anomalyDetection, timeseriesAnomalyInvestigationAnomaly.anomalyDetection)
        && Objects.equals(
            this.detectedInterval, timeseriesAnomalyInvestigationAnomaly.detectedInterval)
        && Objects.equals(
            this.displayInterval, timeseriesAnomalyInvestigationAnomaly.displayInterval)
        && Objects.equals(this.findings, timeseriesAnomalyInvestigationAnomaly.findings)
        && Objects.equals(
            this.maximumDeviation, timeseriesAnomalyInvestigationAnomaly.maximumDeviation)
        && Objects.equals(this.series, timeseriesAnomalyInvestigationAnomaly.series)
        && Objects.equals(this.tagAnalysis, timeseriesAnomalyInvestigationAnomaly.tagAnalysis)
        && Objects.equals(this.type, timeseriesAnomalyInvestigationAnomaly.type)
        && Objects.equals(
            this.additionalProperties, timeseriesAnomalyInvestigationAnomaly.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        anomalyDetection,
        detectedInterval,
        displayInterval,
        findings,
        maximumDeviation,
        series,
        tagAnalysis,
        type,
        additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TimeseriesAnomalyInvestigationAnomaly {\n");
    sb.append("    anomalyDetection: ").append(toIndentedString(anomalyDetection)).append("\n");
    sb.append("    detectedInterval: ").append(toIndentedString(detectedInterval)).append("\n");
    sb.append("    displayInterval: ").append(toIndentedString(displayInterval)).append("\n");
    sb.append("    findings: ").append(toIndentedString(findings)).append("\n");
    sb.append("    maximumDeviation: ").append(toIndentedString(maximumDeviation)).append("\n");
    sb.append("    series: ").append(toIndentedString(series)).append("\n");
    sb.append("    tagAnalysis: ").append(toIndentedString(tagAnalysis)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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
