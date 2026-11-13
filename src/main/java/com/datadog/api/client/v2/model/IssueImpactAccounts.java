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

/** Accounts whose users are affected by the issue. */
@JsonPropertyOrder({
  IssueImpactAccounts.JSON_PROPERTY_DISTINCT_COUNT,
  IssueImpactAccounts.JSON_PROPERTY_TOP
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class IssueImpactAccounts {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_DISTINCT_COUNT = "distinct_count";
  private Long distinctCount;

  public static final String JSON_PROPERTY_TOP = "top";
  private List<IssueImpactAccount> top = new ArrayList<>();

  public IssueImpactAccounts() {}

  @JsonCreator
  public IssueImpactAccounts(
      @JsonProperty(required = true, value = JSON_PROPERTY_DISTINCT_COUNT) Long distinctCount,
      @JsonProperty(required = true, value = JSON_PROPERTY_TOP) List<IssueImpactAccount> top) {
    this.distinctCount = distinctCount;
    this.top = top;
    for (IssueImpactAccount item : top) {
      this.unparsed |= item.unparsed;
    }
  }

  public IssueImpactAccounts distinctCount(Long distinctCount) {
    this.distinctCount = distinctCount;
    return this;
  }

  /**
   * Number of distinct accounts affected by the issue in the time window.
   *
   * @return distinctCount
   */
  @JsonProperty(JSON_PROPERTY_DISTINCT_COUNT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Long getDistinctCount() {
    return distinctCount;
  }

  public void setDistinctCount(Long distinctCount) {
    this.distinctCount = distinctCount;
  }

  public IssueImpactAccounts top(List<IssueImpactAccount> top) {
    this.top = top;
    for (IssueImpactAccount item : top) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }

  public IssueImpactAccounts addTopItem(IssueImpactAccount topItem) {
    this.top.add(topItem);
    this.unparsed |= topItem.unparsed;
    return this;
  }

  /**
   * Up to five accounts with the most errors, most affected first.
   *
   * @return top
   */
  @JsonProperty(JSON_PROPERTY_TOP)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public List<IssueImpactAccount> getTop() {
    return top;
  }

  public void setTop(List<IssueImpactAccount> top) {
    this.top = top;
    if (top != null) {
      for (IssueImpactAccount item : top) {
        this.unparsed |= item.unparsed;
      }
    }
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
   * @return IssueImpactAccounts
   */
  @JsonAnySetter
  public IssueImpactAccounts putAdditionalProperty(String key, Object value) {
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

  /** Return true if this IssueImpactAccounts object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IssueImpactAccounts issueImpactAccounts = (IssueImpactAccounts) o;
    return Objects.equals(this.distinctCount, issueImpactAccounts.distinctCount)
        && Objects.equals(this.top, issueImpactAccounts.top)
        && Objects.equals(this.additionalProperties, issueImpactAccounts.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(distinctCount, top, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IssueImpactAccounts {\n");
    sb.append("    distinctCount: ").append(toIndentedString(distinctCount)).append("\n");
    sb.append("    top: ").append(toIndentedString(top)).append("\n");
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
