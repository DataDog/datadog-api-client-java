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

/** Attributes of a journey drop-off analysis response. */
@JsonPropertyOrder({
  ProductAnalyticsJourneyDropOffResponseAttributes.JSON_PROPERTY_DROP_OFF_COUNT,
  ProductAnalyticsJourneyDropOffResponseAttributes.JSON_PROPERTY_ISSUES,
  ProductAnalyticsJourneyDropOffResponseAttributes.JSON_PROPERTY_SESSIONS_WITH_ERRORS,
  ProductAnalyticsJourneyDropOffResponseAttributes.JSON_PROPERTY_SESSIONS_WITH_FRUSTRATION_SIGNALS
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class ProductAnalyticsJourneyDropOffResponseAttributes {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_DROP_OFF_COUNT = "drop_off_count";
  private Long dropOffCount;

  public static final String JSON_PROPERTY_ISSUES = "issues";
  private List<ProductAnalyticsJourneyDropOffIssue> issues = new ArrayList<>();

  public static final String JSON_PROPERTY_SESSIONS_WITH_ERRORS = "sessions_with_errors";
  private Long sessionsWithErrors;

  public static final String JSON_PROPERTY_SESSIONS_WITH_FRUSTRATION_SIGNALS =
      "sessions_with_frustration_signals";
  private Long sessionsWithFrustrationSignals;

  public ProductAnalyticsJourneyDropOffResponseAttributes() {}

  @JsonCreator
  public ProductAnalyticsJourneyDropOffResponseAttributes(
      @JsonProperty(required = true, value = JSON_PROPERTY_DROP_OFF_COUNT) Long dropOffCount,
      @JsonProperty(required = true, value = JSON_PROPERTY_ISSUES)
          List<ProductAnalyticsJourneyDropOffIssue> issues,
      @JsonProperty(required = true, value = JSON_PROPERTY_SESSIONS_WITH_ERRORS)
          Long sessionsWithErrors,
      @JsonProperty(required = true, value = JSON_PROPERTY_SESSIONS_WITH_FRUSTRATION_SIGNALS)
          Long sessionsWithFrustrationSignals) {
    this.dropOffCount = dropOffCount;
    this.issues = issues;
    for (ProductAnalyticsJourneyDropOffIssue item : issues) {
      this.unparsed |= item.unparsed;
    }
    this.sessionsWithErrors = sessionsWithErrors;
    this.sessionsWithFrustrationSignals = sessionsWithFrustrationSignals;
  }

  public ProductAnalyticsJourneyDropOffResponseAttributes dropOffCount(Long dropOffCount) {
    this.dropOffCount = dropOffCount;
    return this;
  }

  /**
   * Number of sessions that reached the step before the target but not the target step.
   *
   * @return dropOffCount
   */
  @JsonProperty(JSON_PROPERTY_DROP_OFF_COUNT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Long getDropOffCount() {
    return dropOffCount;
  }

  public void setDropOffCount(Long dropOffCount) {
    this.dropOffCount = dropOffCount;
  }

  public ProductAnalyticsJourneyDropOffResponseAttributes issues(
      List<ProductAnalyticsJourneyDropOffIssue> issues) {
    this.issues = issues;
    for (ProductAnalyticsJourneyDropOffIssue item : issues) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }

  public ProductAnalyticsJourneyDropOffResponseAttributes addIssuesItem(
      ProductAnalyticsJourneyDropOffIssue issuesItem) {
    this.issues.add(issuesItem);
    this.unparsed |= issuesItem.unparsed;
    return this;
  }

  /**
   * The issues most associated with the drop-off.
   *
   * @return issues
   */
  @JsonProperty(JSON_PROPERTY_ISSUES)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public List<ProductAnalyticsJourneyDropOffIssue> getIssues() {
    return issues;
  }

  public void setIssues(List<ProductAnalyticsJourneyDropOffIssue> issues) {
    this.issues = issues;
    if (issues != null) {
      for (ProductAnalyticsJourneyDropOffIssue item : issues) {
        this.unparsed |= item.unparsed;
      }
    }
  }

  public ProductAnalyticsJourneyDropOffResponseAttributes sessionsWithErrors(
      Long sessionsWithErrors) {
    this.sessionsWithErrors = sessionsWithErrors;
    return this;
  }

  /**
   * Number of dropped-off sessions that contained an error.
   *
   * @return sessionsWithErrors
   */
  @JsonProperty(JSON_PROPERTY_SESSIONS_WITH_ERRORS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Long getSessionsWithErrors() {
    return sessionsWithErrors;
  }

  public void setSessionsWithErrors(Long sessionsWithErrors) {
    this.sessionsWithErrors = sessionsWithErrors;
  }

  public ProductAnalyticsJourneyDropOffResponseAttributes sessionsWithFrustrationSignals(
      Long sessionsWithFrustrationSignals) {
    this.sessionsWithFrustrationSignals = sessionsWithFrustrationSignals;
    return this;
  }

  /**
   * Number of dropped-off sessions that contained a frustration signal.
   *
   * @return sessionsWithFrustrationSignals
   */
  @JsonProperty(JSON_PROPERTY_SESSIONS_WITH_FRUSTRATION_SIGNALS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Long getSessionsWithFrustrationSignals() {
    return sessionsWithFrustrationSignals;
  }

  public void setSessionsWithFrustrationSignals(Long sessionsWithFrustrationSignals) {
    this.sessionsWithFrustrationSignals = sessionsWithFrustrationSignals;
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
   * @return ProductAnalyticsJourneyDropOffResponseAttributes
   */
  @JsonAnySetter
  public ProductAnalyticsJourneyDropOffResponseAttributes putAdditionalProperty(
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

  /** Return true if this ProductAnalyticsJourneyDropOffResponseAttributes object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProductAnalyticsJourneyDropOffResponseAttributes
        productAnalyticsJourneyDropOffResponseAttributes =
            (ProductAnalyticsJourneyDropOffResponseAttributes) o;
    return Objects.equals(
            this.dropOffCount, productAnalyticsJourneyDropOffResponseAttributes.dropOffCount)
        && Objects.equals(this.issues, productAnalyticsJourneyDropOffResponseAttributes.issues)
        && Objects.equals(
            this.sessionsWithErrors,
            productAnalyticsJourneyDropOffResponseAttributes.sessionsWithErrors)
        && Objects.equals(
            this.sessionsWithFrustrationSignals,
            productAnalyticsJourneyDropOffResponseAttributes.sessionsWithFrustrationSignals)
        && Objects.equals(
            this.additionalProperties,
            productAnalyticsJourneyDropOffResponseAttributes.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        dropOffCount,
        issues,
        sessionsWithErrors,
        sessionsWithFrustrationSignals,
        additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProductAnalyticsJourneyDropOffResponseAttributes {\n");
    sb.append("    dropOffCount: ").append(toIndentedString(dropOffCount)).append("\n");
    sb.append("    issues: ").append(toIndentedString(issues)).append("\n");
    sb.append("    sessionsWithErrors: ").append(toIndentedString(sessionsWithErrors)).append("\n");
    sb.append("    sessionsWithFrustrationSignals: ")
        .append(toIndentedString(sessionsWithFrustrationSignals))
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
