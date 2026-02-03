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

/** A feedback section containing metrics. */
@JsonPropertyOrder({
  SecurityMonitoringSignalInvestigationFeedbackSection.JSON_PROPERTY_ID,
  SecurityMonitoringSignalInvestigationFeedbackSection.JSON_PROPERTY_METRICS,
  SecurityMonitoringSignalInvestigationFeedbackSection.JSON_PROPERTY_TITLE
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class SecurityMonitoringSignalInvestigationFeedbackSection {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_ID = "id";
  private String id;

  public static final String JSON_PROPERTY_METRICS = "metrics";
  private List<SecurityMonitoringSignalInvestigationFeedbackMetric> metrics = new ArrayList<>();

  public static final String JSON_PROPERTY_TITLE = "title";
  private String title;

  public SecurityMonitoringSignalInvestigationFeedbackSection() {}

  @JsonCreator
  public SecurityMonitoringSignalInvestigationFeedbackSection(
      @JsonProperty(required = true, value = JSON_PROPERTY_ID) String id,
      @JsonProperty(required = true, value = JSON_PROPERTY_METRICS)
          List<SecurityMonitoringSignalInvestigationFeedbackMetric> metrics,
      @JsonProperty(required = true, value = JSON_PROPERTY_TITLE) String title) {
    this.id = id;
    this.metrics = metrics;
    this.title = title;
  }

  public SecurityMonitoringSignalInvestigationFeedbackSection id(String id) {
    this.id = id;
    return this;
  }

  /**
   * The section identifier.
   *
   * @return id
   */
  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public SecurityMonitoringSignalInvestigationFeedbackSection metrics(
      List<SecurityMonitoringSignalInvestigationFeedbackMetric> metrics) {
    this.metrics = metrics;
    for (SecurityMonitoringSignalInvestigationFeedbackMetric item : metrics) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }

  public SecurityMonitoringSignalInvestigationFeedbackSection addMetricsItem(
      SecurityMonitoringSignalInvestigationFeedbackMetric metricsItem) {
    this.metrics.add(metricsItem);
    this.unparsed |= metricsItem.unparsed;
    return this;
  }

  /**
   * Array of feedback metrics.
   *
   * @return metrics
   */
  @JsonProperty(JSON_PROPERTY_METRICS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public List<SecurityMonitoringSignalInvestigationFeedbackMetric> getMetrics() {
    return metrics;
  }

  public void setMetrics(List<SecurityMonitoringSignalInvestigationFeedbackMetric> metrics) {
    this.metrics = metrics;
  }

  public SecurityMonitoringSignalInvestigationFeedbackSection title(String title) {
    this.title = title;
    return this;
  }

  /**
   * The section title.
   *
   * @return title
   */
  @JsonProperty(JSON_PROPERTY_TITLE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
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
   * @return SecurityMonitoringSignalInvestigationFeedbackSection
   */
  @JsonAnySetter
  public SecurityMonitoringSignalInvestigationFeedbackSection putAdditionalProperty(
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
   * Return true if this SecurityMonitoringSignalInvestigationFeedbackSection object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SecurityMonitoringSignalInvestigationFeedbackSection
        securityMonitoringSignalInvestigationFeedbackSection =
            (SecurityMonitoringSignalInvestigationFeedbackSection) o;
    return Objects.equals(this.id, securityMonitoringSignalInvestigationFeedbackSection.id)
        && Objects.equals(
            this.metrics, securityMonitoringSignalInvestigationFeedbackSection.metrics)
        && Objects.equals(this.title, securityMonitoringSignalInvestigationFeedbackSection.title)
        && Objects.equals(
            this.additionalProperties,
            securityMonitoringSignalInvestigationFeedbackSection.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, metrics, title, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SecurityMonitoringSignalInvestigationFeedbackSection {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    metrics: ").append(toIndentedString(metrics)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
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
