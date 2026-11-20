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

/**
 * Counts of the group's open findings. The counts include every finding in the group, including
 * findings that don't match <code>filter[query]</code>.
 */
@JsonPropertyOrder({
  RemediationGroupFindings.JSON_PROPERTY_BY_SEVERITY,
  RemediationGroupFindings.JSON_PROPERTY_TOTAL
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class RemediationGroupFindings {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_BY_SEVERITY = "by_severity";
  private RemediationGroupFindingsBySeverity bySeverity;

  public static final String JSON_PROPERTY_TOTAL = "total";
  private Long total;

  public RemediationGroupFindings() {}

  @JsonCreator
  public RemediationGroupFindings(
      @JsonProperty(required = true, value = JSON_PROPERTY_BY_SEVERITY)
          RemediationGroupFindingsBySeverity bySeverity,
      @JsonProperty(required = true, value = JSON_PROPERTY_TOTAL) Long total) {
    this.bySeverity = bySeverity;
    this.unparsed |= bySeverity.unparsed;
    this.total = total;
  }

  public RemediationGroupFindings bySeverity(RemediationGroupFindingsBySeverity bySeverity) {
    this.bySeverity = bySeverity;
    this.unparsed |= bySeverity.unparsed;
    return this;
  }

  /**
   * Number of the group's findings for each value of their <code>@severity</code> attribute. The
   * response includes every level, including levels with a count of zero.
   *
   * @return bySeverity
   */
  @JsonProperty(JSON_PROPERTY_BY_SEVERITY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public RemediationGroupFindingsBySeverity getBySeverity() {
    return bySeverity;
  }

  public void setBySeverity(RemediationGroupFindingsBySeverity bySeverity) {
    this.bySeverity = bySeverity;
    if (bySeverity != null) {
      this.unparsed |= bySeverity.unparsed;
    }
  }

  public RemediationGroupFindings total(Long total) {
    this.total = total;
    return this;
  }

  /**
   * Number of open findings in the group.
   *
   * @return total
   */
  @JsonProperty(JSON_PROPERTY_TOTAL)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Long getTotal() {
    return total;
  }

  public void setTotal(Long total) {
    this.total = total;
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
   * @return RemediationGroupFindings
   */
  @JsonAnySetter
  public RemediationGroupFindings putAdditionalProperty(String key, Object value) {
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

  /** Return true if this RemediationGroupFindings object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RemediationGroupFindings remediationGroupFindings = (RemediationGroupFindings) o;
    return Objects.equals(this.bySeverity, remediationGroupFindings.bySeverity)
        && Objects.equals(this.total, remediationGroupFindings.total)
        && Objects.equals(this.additionalProperties, remediationGroupFindings.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(bySeverity, total, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RemediationGroupFindings {\n");
    sb.append("    bySeverity: ").append(toIndentedString(bySeverity)).append("\n");
    sb.append("    total: ").append(toIndentedString(total)).append("\n");
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
