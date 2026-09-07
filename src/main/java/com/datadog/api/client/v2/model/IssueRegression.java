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
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/** Regression information for an issue that was previously resolved and then reopened. */
@JsonPropertyOrder({
  IssueRegression.JSON_PROPERTY_REGRESSED_AT,
  IssueRegression.JSON_PROPERTY_REGRESSED_AT_VERSION,
  IssueRegression.JSON_PROPERTY_RESOLVED_AT
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class IssueRegression {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_REGRESSED_AT = "regressed_at";
  private OffsetDateTime regressedAt;

  public static final String JSON_PROPERTY_REGRESSED_AT_VERSION = "regressed_at_version";
  private String regressedAtVersion;

  public static final String JSON_PROPERTY_RESOLVED_AT = "resolved_at";
  private OffsetDateTime resolvedAt;

  public IssueRegression() {}

  @JsonCreator
  public IssueRegression(
      @JsonProperty(required = true, value = JSON_PROPERTY_REGRESSED_AT) OffsetDateTime regressedAt,
      @JsonProperty(required = true, value = JSON_PROPERTY_RESOLVED_AT) OffsetDateTime resolvedAt) {
    this.regressedAt = regressedAt;
    this.resolvedAt = resolvedAt;
  }

  public IssueRegression regressedAt(OffsetDateTime regressedAt) {
    this.regressedAt = regressedAt;
    return this;
  }

  /**
   * Timestamp when the issue was reopened (regressed).
   *
   * @return regressedAt
   */
  @JsonProperty(JSON_PROPERTY_REGRESSED_AT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public OffsetDateTime getRegressedAt() {
    return regressedAt;
  }

  public void setRegressedAt(OffsetDateTime regressedAt) {
    this.regressedAt = regressedAt;
  }

  public IssueRegression regressedAtVersion(String regressedAtVersion) {
    this.regressedAtVersion = regressedAtVersion;
    return this;
  }

  /**
   * Application version where the regression was observed.
   *
   * @return regressedAtVersion
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_REGRESSED_AT_VERSION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getRegressedAtVersion() {
    return regressedAtVersion;
  }

  public void setRegressedAtVersion(String regressedAtVersion) {
    this.regressedAtVersion = regressedAtVersion;
  }

  public IssueRegression resolvedAt(OffsetDateTime resolvedAt) {
    this.resolvedAt = resolvedAt;
    return this;
  }

  /**
   * Timestamp when the issue was resolved before the regression.
   *
   * @return resolvedAt
   */
  @JsonProperty(JSON_PROPERTY_RESOLVED_AT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public OffsetDateTime getResolvedAt() {
    return resolvedAt;
  }

  public void setResolvedAt(OffsetDateTime resolvedAt) {
    this.resolvedAt = resolvedAt;
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
   * @return IssueRegression
   */
  @JsonAnySetter
  public IssueRegression putAdditionalProperty(String key, Object value) {
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

  /** Return true if this IssueRegression object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IssueRegression issueRegression = (IssueRegression) o;
    return Objects.equals(this.regressedAt, issueRegression.regressedAt)
        && Objects.equals(this.regressedAtVersion, issueRegression.regressedAtVersion)
        && Objects.equals(this.resolvedAt, issueRegression.resolvedAt)
        && Objects.equals(this.additionalProperties, issueRegression.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(regressedAt, regressedAtVersion, resolvedAt, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IssueRegression {\n");
    sb.append("    regressedAt: ").append(toIndentedString(regressedAt)).append("\n");
    sb.append("    regressedAtVersion: ").append(toIndentedString(regressedAtVersion)).append("\n");
    sb.append("    resolvedAt: ").append(toIndentedString(resolvedAt)).append("\n");
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
