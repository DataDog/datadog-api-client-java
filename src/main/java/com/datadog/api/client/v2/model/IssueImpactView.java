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

/** A RUM view where the issue occurred. */
@JsonPropertyOrder({
  IssueImpactView.JSON_PROPERTY_AFFECTED,
  IssueImpactView.JSON_PROPERTY_BASELINE,
  IssueImpactView.JSON_PROPERTY_ERROR_COUNTS,
  IssueImpactView.JSON_PROPERTY_NAME,
  IssueImpactView.JSON_PROPERTY_SIGNIFICANT
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class IssueImpactView {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_AFFECTED = "affected";
  private IssueImpactViewCounts affected;

  public static final String JSON_PROPERTY_BASELINE = "baseline";
  private IssueImpactViewCounts baseline;

  public static final String JSON_PROPERTY_ERROR_COUNTS = "error_counts";
  private IssueImpactErrorCounts errorCounts;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_SIGNIFICANT = "significant";
  private Boolean significant;

  public IssueImpactView() {}

  @JsonCreator
  public IssueImpactView(
      @JsonProperty(required = true, value = JSON_PROPERTY_AFFECTED) IssueImpactViewCounts affected,
      @JsonProperty(required = true, value = JSON_PROPERTY_ERROR_COUNTS)
          IssueImpactErrorCounts errorCounts,
      @JsonProperty(required = true, value = JSON_PROPERTY_NAME) String name,
      @JsonProperty(required = true, value = JSON_PROPERTY_SIGNIFICANT) Boolean significant) {
    this.affected = affected;
    this.unparsed |= affected.unparsed;
    this.errorCounts = errorCounts;
    this.unparsed |= errorCounts.unparsed;
    this.name = name;
    this.significant = significant;
  }

  public IssueImpactView affected(IssueImpactViewCounts affected) {
    this.affected = affected;
    this.unparsed |= affected.unparsed;
    return this;
  }

  /**
   * Distinct users, accounts, sessions, and view instances on a view. <code>affected</code> counts
   * only those with the issue's errors. <code>baseline</code> counts all users, accounts, sessions,
   * and view instances on the view in the time window. It is absent when RUM has no data for the
   * view.
   *
   * @return affected
   */
  @JsonProperty(JSON_PROPERTY_AFFECTED)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public IssueImpactViewCounts getAffected() {
    return affected;
  }

  public void setAffected(IssueImpactViewCounts affected) {
    this.affected = affected;
    if (affected != null) {
      this.unparsed |= affected.unparsed;
    }
  }

  public IssueImpactView baseline(IssueImpactViewCounts baseline) {
    this.baseline = baseline;
    this.unparsed |= baseline.unparsed;
    return this;
  }

  /**
   * Distinct users, accounts, sessions, and view instances on a view. <code>affected</code> counts
   * only those with the issue's errors. <code>baseline</code> counts all users, accounts, sessions,
   * and view instances on the view in the time window. It is absent when RUM has no data for the
   * view.
   *
   * @return baseline
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_BASELINE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public IssueImpactViewCounts getBaseline() {
    return baseline;
  }

  public void setBaseline(IssueImpactViewCounts baseline) {
    this.baseline = baseline;
    if (baseline != null) {
      this.unparsed |= baseline.unparsed;
    }
  }

  public IssueImpactView errorCounts(IssueImpactErrorCounts errorCounts) {
    this.errorCounts = errorCounts;
    this.unparsed |= errorCounts.unparsed;
    return this;
  }

  /**
   * Number of errors reported by each source. Several sources can report the same error, such as an
   * APM span and a log, so the counts overlap: don't add them together.
   *
   * @return errorCounts
   */
  @JsonProperty(JSON_PROPERTY_ERROR_COUNTS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public IssueImpactErrorCounts getErrorCounts() {
    return errorCounts;
  }

  public void setErrorCounts(IssueImpactErrorCounts errorCounts) {
    this.errorCounts = errorCounts;
    if (errorCounts != null) {
      this.unparsed |= errorCounts.unparsed;
    }
  }

  public IssueImpactView name(String name) {
    this.name = name;
    return this;
  }

  /**
   * View name.
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

  public IssueImpactView significant(Boolean significant) {
    this.significant = significant;
    return this;
  }

  /**
   * Whether the entry stands out as a likely driver of the issue, because it accounts for most of
   * the issue's errors or for far more errors than the other listed entries.
   *
   * @return significant
   */
  @JsonProperty(JSON_PROPERTY_SIGNIFICANT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Boolean getSignificant() {
    return significant;
  }

  public void setSignificant(Boolean significant) {
    this.significant = significant;
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
   * @return IssueImpactView
   */
  @JsonAnySetter
  public IssueImpactView putAdditionalProperty(String key, Object value) {
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

  /** Return true if this IssueImpactView object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IssueImpactView issueImpactView = (IssueImpactView) o;
    return Objects.equals(this.affected, issueImpactView.affected)
        && Objects.equals(this.baseline, issueImpactView.baseline)
        && Objects.equals(this.errorCounts, issueImpactView.errorCounts)
        && Objects.equals(this.name, issueImpactView.name)
        && Objects.equals(this.significant, issueImpactView.significant)
        && Objects.equals(this.additionalProperties, issueImpactView.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(affected, baseline, errorCounts, name, significant, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IssueImpactView {\n");
    sb.append("    affected: ").append(toIndentedString(affected)).append("\n");
    sb.append("    baseline: ").append(toIndentedString(baseline)).append("\n");
    sb.append("    errorCounts: ").append(toIndentedString(errorCounts)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    significant: ").append(toIndentedString(significant)).append("\n");
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
