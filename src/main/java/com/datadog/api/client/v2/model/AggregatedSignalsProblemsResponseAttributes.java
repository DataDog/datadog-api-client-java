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

/** Attributes of an aggregated signals and problems response. */
@JsonPropertyOrder({
  AggregatedSignalsProblemsResponseAttributes.JSON_PROPERTY_APPLICATION_ID,
  AggregatedSignalsProblemsResponseAttributes.JSON_PROPERTY_CRITERIA,
  AggregatedSignalsProblemsResponseAttributes.JSON_PROPERTY_FROM,
  AggregatedSignalsProblemsResponseAttributes.JSON_PROPERTY_PROBLEM_DETECTIONS,
  AggregatedSignalsProblemsResponseAttributes.JSON_PROPERTY_SAMPLE_METADATA,
  AggregatedSignalsProblemsResponseAttributes.JSON_PROPERTY_TO,
  AggregatedSignalsProblemsResponseAttributes.JSON_PROPERTY_VIEW_NAME
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class AggregatedSignalsProblemsResponseAttributes {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_APPLICATION_ID = "application_id";
  private String applicationId;

  public static final String JSON_PROPERTY_CRITERIA = "criteria";
  private AggregatedWaterfallPerformanceCriteria criteria;

  public static final String JSON_PROPERTY_FROM = "from";
  private Long from;

  public static final String JSON_PROPERTY_PROBLEM_DETECTIONS = "problem_detections";
  private SignalsProblemsDetections problemDetections;

  public static final String JSON_PROPERTY_SAMPLE_METADATA = "sample_metadata";
  private SignalsProblemsSampleMetadata sampleMetadata;

  public static final String JSON_PROPERTY_TO = "to";
  private Long to;

  public static final String JSON_PROPERTY_VIEW_NAME = "view_name";
  private String viewName;

  public AggregatedSignalsProblemsResponseAttributes() {}

  @JsonCreator
  public AggregatedSignalsProblemsResponseAttributes(
      @JsonProperty(required = true, value = JSON_PROPERTY_APPLICATION_ID) String applicationId,
      @JsonProperty(required = true, value = JSON_PROPERTY_FROM) Long from,
      @JsonProperty(required = true, value = JSON_PROPERTY_PROBLEM_DETECTIONS)
          SignalsProblemsDetections problemDetections,
      @JsonProperty(required = true, value = JSON_PROPERTY_SAMPLE_METADATA)
          SignalsProblemsSampleMetadata sampleMetadata,
      @JsonProperty(required = true, value = JSON_PROPERTY_TO) Long to,
      @JsonProperty(required = true, value = JSON_PROPERTY_VIEW_NAME) String viewName) {
    this.applicationId = applicationId;
    this.from = from;
    this.problemDetections = problemDetections;
    this.unparsed |= problemDetections.unparsed;
    this.sampleMetadata = sampleMetadata;
    this.unparsed |= sampleMetadata.unparsed;
    this.to = to;
    this.viewName = viewName;
  }

  public AggregatedSignalsProblemsResponseAttributes applicationId(String applicationId) {
    this.applicationId = applicationId;
    return this;
  }

  /**
   * The RUM application ID that was analyzed.
   *
   * @return applicationId
   */
  @JsonProperty(JSON_PROPERTY_APPLICATION_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getApplicationId() {
    return applicationId;
  }

  public void setApplicationId(String applicationId) {
    this.applicationId = applicationId;
  }

  public AggregatedSignalsProblemsResponseAttributes criteria(
      AggregatedWaterfallPerformanceCriteria criteria) {
    this.criteria = criteria;
    this.unparsed |= criteria.unparsed;
    return this;
  }

  /**
   * Performance criteria to filter view instances by a metric threshold.
   *
   * @return criteria
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CRITERIA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public AggregatedWaterfallPerformanceCriteria getCriteria() {
    return criteria;
  }

  public void setCriteria(AggregatedWaterfallPerformanceCriteria criteria) {
    this.criteria = criteria;
    if (criteria != null) {
      this.unparsed |= criteria.unparsed;
    }
  }

  public AggregatedSignalsProblemsResponseAttributes from(Long from) {
    this.from = from;
    return this;
  }

  /**
   * Start of the analyzed time range as a Unix timestamp in seconds.
   *
   * @return from
   */
  @JsonProperty(JSON_PROPERTY_FROM)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Long getFrom() {
    return from;
  }

  public void setFrom(Long from) {
    this.from = from;
  }

  public AggregatedSignalsProblemsResponseAttributes problemDetections(
      SignalsProblemsDetections problemDetections) {
    this.problemDetections = problemDetections;
    this.unparsed |= problemDetections.unparsed;
    return this;
  }

  /**
   * Grouped detection results by detection type.
   *
   * @return problemDetections
   */
  @JsonProperty(JSON_PROPERTY_PROBLEM_DETECTIONS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public SignalsProblemsDetections getProblemDetections() {
    return problemDetections;
  }

  public void setProblemDetections(SignalsProblemsDetections problemDetections) {
    this.problemDetections = problemDetections;
    if (problemDetections != null) {
      this.unparsed |= problemDetections.unparsed;
    }
  }

  public AggregatedSignalsProblemsResponseAttributes sampleMetadata(
      SignalsProblemsSampleMetadata sampleMetadata) {
    this.sampleMetadata = sampleMetadata;
    this.unparsed |= sampleMetadata.unparsed;
    return this;
  }

  /**
   * Metadata about the sampling quality for a signals and problems query.
   *
   * @return sampleMetadata
   */
  @JsonProperty(JSON_PROPERTY_SAMPLE_METADATA)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public SignalsProblemsSampleMetadata getSampleMetadata() {
    return sampleMetadata;
  }

  public void setSampleMetadata(SignalsProblemsSampleMetadata sampleMetadata) {
    this.sampleMetadata = sampleMetadata;
    if (sampleMetadata != null) {
      this.unparsed |= sampleMetadata.unparsed;
    }
  }

  public AggregatedSignalsProblemsResponseAttributes to(Long to) {
    this.to = to;
    return this;
  }

  /**
   * End of the analyzed time range as a Unix timestamp in seconds.
   *
   * @return to
   */
  @JsonProperty(JSON_PROPERTY_TO)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Long getTo() {
    return to;
  }

  public void setTo(Long to) {
    this.to = to;
  }

  public AggregatedSignalsProblemsResponseAttributes viewName(String viewName) {
    this.viewName = viewName;
    return this;
  }

  /**
   * The RUM view name that was analyzed.
   *
   * @return viewName
   */
  @JsonProperty(JSON_PROPERTY_VIEW_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getViewName() {
    return viewName;
  }

  public void setViewName(String viewName) {
    this.viewName = viewName;
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
   * @return AggregatedSignalsProblemsResponseAttributes
   */
  @JsonAnySetter
  public AggregatedSignalsProblemsResponseAttributes putAdditionalProperty(
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

  /** Return true if this AggregatedSignalsProblemsResponseAttributes object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AggregatedSignalsProblemsResponseAttributes aggregatedSignalsProblemsResponseAttributes =
        (AggregatedSignalsProblemsResponseAttributes) o;
    return Objects.equals(
            this.applicationId, aggregatedSignalsProblemsResponseAttributes.applicationId)
        && Objects.equals(this.criteria, aggregatedSignalsProblemsResponseAttributes.criteria)
        && Objects.equals(this.from, aggregatedSignalsProblemsResponseAttributes.from)
        && Objects.equals(
            this.problemDetections, aggregatedSignalsProblemsResponseAttributes.problemDetections)
        && Objects.equals(
            this.sampleMetadata, aggregatedSignalsProblemsResponseAttributes.sampleMetadata)
        && Objects.equals(this.to, aggregatedSignalsProblemsResponseAttributes.to)
        && Objects.equals(this.viewName, aggregatedSignalsProblemsResponseAttributes.viewName)
        && Objects.equals(
            this.additionalProperties,
            aggregatedSignalsProblemsResponseAttributes.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        applicationId,
        criteria,
        from,
        problemDetections,
        sampleMetadata,
        to,
        viewName,
        additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AggregatedSignalsProblemsResponseAttributes {\n");
    sb.append("    applicationId: ").append(toIndentedString(applicationId)).append("\n");
    sb.append("    criteria: ").append(toIndentedString(criteria)).append("\n");
    sb.append("    from: ").append(toIndentedString(from)).append("\n");
    sb.append("    problemDetections: ").append(toIndentedString(problemDetections)).append("\n");
    sb.append("    sampleMetadata: ").append(toIndentedString(sampleMetadata)).append("\n");
    sb.append("    to: ").append(toIndentedString(to)).append("\n");
    sb.append("    viewName: ").append(toIndentedString(viewName)).append("\n");
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
