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

/** An issue contributing to drop-off at the target step. */
@JsonPropertyOrder({
  ProductAnalyticsJourneyDropOffIssue.JSON_PROPERTY_ERROR_COUNT,
  ProductAnalyticsJourneyDropOffIssue.JSON_PROPERTY_ISSUE_ID,
  ProductAnalyticsJourneyDropOffIssue.JSON_PROPERTY_SESSION_COUNT
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class ProductAnalyticsJourneyDropOffIssue {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_ERROR_COUNT = "error_count";
  private Long errorCount;

  public static final String JSON_PROPERTY_ISSUE_ID = "issue_id";
  private String issueId;

  public static final String JSON_PROPERTY_SESSION_COUNT = "session_count";
  private Long sessionCount;

  public ProductAnalyticsJourneyDropOffIssue() {}

  @JsonCreator
  public ProductAnalyticsJourneyDropOffIssue(
      @JsonProperty(required = true, value = JSON_PROPERTY_ERROR_COUNT) Long errorCount,
      @JsonProperty(required = true, value = JSON_PROPERTY_ISSUE_ID) String issueId,
      @JsonProperty(required = true, value = JSON_PROPERTY_SESSION_COUNT) Long sessionCount) {
    this.errorCount = errorCount;
    this.issueId = issueId;
    this.sessionCount = sessionCount;
  }

  public ProductAnalyticsJourneyDropOffIssue errorCount(Long errorCount) {
    this.errorCount = errorCount;
    return this;
  }

  /**
   * Number of errors attributed to this issue.
   *
   * @return errorCount
   */
  @JsonProperty(JSON_PROPERTY_ERROR_COUNT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Long getErrorCount() {
    return errorCount;
  }

  public void setErrorCount(Long errorCount) {
    this.errorCount = errorCount;
  }

  public ProductAnalyticsJourneyDropOffIssue issueId(String issueId) {
    this.issueId = issueId;
    return this;
  }

  /**
   * Identifier of the issue.
   *
   * @return issueId
   */
  @JsonProperty(JSON_PROPERTY_ISSUE_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getIssueId() {
    return issueId;
  }

  public void setIssueId(String issueId) {
    this.issueId = issueId;
  }

  public ProductAnalyticsJourneyDropOffIssue sessionCount(Long sessionCount) {
    this.sessionCount = sessionCount;
    return this;
  }

  /**
   * Number of sessions affected by this issue.
   *
   * @return sessionCount
   */
  @JsonProperty(JSON_PROPERTY_SESSION_COUNT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Long getSessionCount() {
    return sessionCount;
  }

  public void setSessionCount(Long sessionCount) {
    this.sessionCount = sessionCount;
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
   * @return ProductAnalyticsJourneyDropOffIssue
   */
  @JsonAnySetter
  public ProductAnalyticsJourneyDropOffIssue putAdditionalProperty(String key, Object value) {
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

  /** Return true if this ProductAnalyticsJourneyDropOffIssue object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProductAnalyticsJourneyDropOffIssue productAnalyticsJourneyDropOffIssue =
        (ProductAnalyticsJourneyDropOffIssue) o;
    return Objects.equals(this.errorCount, productAnalyticsJourneyDropOffIssue.errorCount)
        && Objects.equals(this.issueId, productAnalyticsJourneyDropOffIssue.issueId)
        && Objects.equals(this.sessionCount, productAnalyticsJourneyDropOffIssue.sessionCount)
        && Objects.equals(
            this.additionalProperties, productAnalyticsJourneyDropOffIssue.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(errorCount, issueId, sessionCount, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProductAnalyticsJourneyDropOffIssue {\n");
    sb.append("    errorCount: ").append(toIndentedString(errorCount)).append("\n");
    sb.append("    issueId: ").append(toIndentedString(issueId)).append("\n");
    sb.append("    sessionCount: ").append(toIndentedString(sessionCount)).append("\n");
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
