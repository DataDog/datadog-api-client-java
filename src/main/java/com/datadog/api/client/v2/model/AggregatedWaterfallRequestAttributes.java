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

/** Attributes for an aggregated waterfall query. */
@JsonPropertyOrder({
  AggregatedWaterfallRequestAttributes.JSON_PROPERTY_APPLICATION_ID,
  AggregatedWaterfallRequestAttributes.JSON_PROPERTY_CRITERIA,
  AggregatedWaterfallRequestAttributes.JSON_PROPERTY_FILTER,
  AggregatedWaterfallRequestAttributes.JSON_PROPERTY_FROM,
  AggregatedWaterfallRequestAttributes.JSON_PROPERTY_INCLUDE_GLOBAL_APPEARANCE,
  AggregatedWaterfallRequestAttributes.JSON_PROPERTY_SAMPLE_SIZE,
  AggregatedWaterfallRequestAttributes.JSON_PROPERTY_TO,
  AggregatedWaterfallRequestAttributes.JSON_PROPERTY_VIEW_NAME
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class AggregatedWaterfallRequestAttributes {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_APPLICATION_ID = "application_id";
  private String applicationId;

  public static final String JSON_PROPERTY_CRITERIA = "criteria";
  private AggregatedWaterfallPerformanceCriteria criteria;

  public static final String JSON_PROPERTY_FILTER = "filter";
  private String filter;

  public static final String JSON_PROPERTY_FROM = "from";
  private Long from;

  public static final String JSON_PROPERTY_INCLUDE_GLOBAL_APPEARANCE = "include_global_appearance";
  private Boolean includeGlobalAppearance;

  public static final String JSON_PROPERTY_SAMPLE_SIZE = "sample_size";
  private Integer sampleSize;

  public static final String JSON_PROPERTY_TO = "to";
  private Long to;

  public static final String JSON_PROPERTY_VIEW_NAME = "view_name";
  private String viewName;

  public AggregatedWaterfallRequestAttributes() {}

  @JsonCreator
  public AggregatedWaterfallRequestAttributes(
      @JsonProperty(required = true, value = JSON_PROPERTY_APPLICATION_ID) String applicationId,
      @JsonProperty(required = true, value = JSON_PROPERTY_FROM) Long from,
      @JsonProperty(required = true, value = JSON_PROPERTY_SAMPLE_SIZE) Integer sampleSize,
      @JsonProperty(required = true, value = JSON_PROPERTY_TO) Long to,
      @JsonProperty(required = true, value = JSON_PROPERTY_VIEW_NAME) String viewName) {
    this.applicationId = applicationId;
    this.from = from;
    this.sampleSize = sampleSize;
    this.to = to;
    this.viewName = viewName;
  }

  public AggregatedWaterfallRequestAttributes applicationId(String applicationId) {
    this.applicationId = applicationId;
    return this;
  }

  /**
   * The RUM application ID to analyze.
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

  public AggregatedWaterfallRequestAttributes criteria(
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

  public AggregatedWaterfallRequestAttributes filter(String filter) {
    this.filter = filter;
    return this;
  }

  /**
   * RUM query string to filter events (for example, @session.type:user @geo.country:US).
   *
   * @return filter
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_FILTER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getFilter() {
    return filter;
  }

  public void setFilter(String filter) {
    this.filter = filter;
  }

  public AggregatedWaterfallRequestAttributes from(Long from) {
    this.from = from;
    return this;
  }

  /**
   * Start of the time range as a Unix timestamp in seconds.
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

  public AggregatedWaterfallRequestAttributes includeGlobalAppearance(
      Boolean includeGlobalAppearance) {
    this.includeGlobalAppearance = includeGlobalAppearance;
    return this;
  }

  /**
   * When true, enriches each resource with cross-view appearance statistics.
   *
   * @return includeGlobalAppearance
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_INCLUDE_GLOBAL_APPEARANCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getIncludeGlobalAppearance() {
    return includeGlobalAppearance;
  }

  public void setIncludeGlobalAppearance(Boolean includeGlobalAppearance) {
    this.includeGlobalAppearance = includeGlobalAppearance;
  }

  public AggregatedWaterfallRequestAttributes sampleSize(Integer sampleSize) {
    this.sampleSize = sampleSize;
    return this;
  }

  /**
   * Number of view instances to sample, between 1 and 500. minimum: 1 maximum: 500
   *
   * @return sampleSize
   */
  @JsonProperty(JSON_PROPERTY_SAMPLE_SIZE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Integer getSampleSize() {
    return sampleSize;
  }

  public void setSampleSize(Integer sampleSize) {
    this.sampleSize = sampleSize;
  }

  public AggregatedWaterfallRequestAttributes to(Long to) {
    this.to = to;
    return this;
  }

  /**
   * End of the time range as a Unix timestamp in seconds.
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

  public AggregatedWaterfallRequestAttributes viewName(String viewName) {
    this.viewName = viewName;
    return this;
  }

  /**
   * The RUM view name to analyze (for example, /account/login).
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
   * @return AggregatedWaterfallRequestAttributes
   */
  @JsonAnySetter
  public AggregatedWaterfallRequestAttributes putAdditionalProperty(String key, Object value) {
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

  /** Return true if this AggregatedWaterfallRequestAttributes object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AggregatedWaterfallRequestAttributes aggregatedWaterfallRequestAttributes =
        (AggregatedWaterfallRequestAttributes) o;
    return Objects.equals(this.applicationId, aggregatedWaterfallRequestAttributes.applicationId)
        && Objects.equals(this.criteria, aggregatedWaterfallRequestAttributes.criteria)
        && Objects.equals(this.filter, aggregatedWaterfallRequestAttributes.filter)
        && Objects.equals(this.from, aggregatedWaterfallRequestAttributes.from)
        && Objects.equals(
            this.includeGlobalAppearance,
            aggregatedWaterfallRequestAttributes.includeGlobalAppearance)
        && Objects.equals(this.sampleSize, aggregatedWaterfallRequestAttributes.sampleSize)
        && Objects.equals(this.to, aggregatedWaterfallRequestAttributes.to)
        && Objects.equals(this.viewName, aggregatedWaterfallRequestAttributes.viewName)
        && Objects.equals(
            this.additionalProperties, aggregatedWaterfallRequestAttributes.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        applicationId,
        criteria,
        filter,
        from,
        includeGlobalAppearance,
        sampleSize,
        to,
        viewName,
        additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AggregatedWaterfallRequestAttributes {\n");
    sb.append("    applicationId: ").append(toIndentedString(applicationId)).append("\n");
    sb.append("    criteria: ").append(toIndentedString(criteria)).append("\n");
    sb.append("    filter: ").append(toIndentedString(filter)).append("\n");
    sb.append("    from: ").append(toIndentedString(from)).append("\n");
    sb.append("    includeGlobalAppearance: ")
        .append(toIndentedString(includeGlobalAppearance))
        .append("\n");
    sb.append("    sampleSize: ").append(toIndentedString(sampleSize)).append("\n");
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
