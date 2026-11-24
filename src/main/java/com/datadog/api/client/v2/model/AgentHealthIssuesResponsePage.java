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

/** Pagination details and counts for the matching Agent Health issues. */
@JsonPropertyOrder({
  AgentHealthIssuesResponsePage.JSON_PROPERTY_COUNTS_BY_ISSUE_TYPE,
  AgentHealthIssuesResponsePage.JSON_PROPERTY_LIMIT,
  AgentHealthIssuesResponsePage.JSON_PROPERTY_OFFSET,
  AgentHealthIssuesResponsePage.JSON_PROPERTY_TOTAL_COUNT
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class AgentHealthIssuesResponsePage {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_COUNTS_BY_ISSUE_TYPE = "counts_by_issue_type";
  private Map<String, Long> countsByIssueType = null;

  public static final String JSON_PROPERTY_LIMIT = "limit";
  private Long limit;

  public static final String JSON_PROPERTY_OFFSET = "offset";
  private Long offset;

  public static final String JSON_PROPERTY_TOTAL_COUNT = "total_count";
  private Long totalCount;

  public AgentHealthIssuesResponsePage() {}

  @JsonCreator
  public AgentHealthIssuesResponsePage(
      @JsonProperty(required = true, value = JSON_PROPERTY_LIMIT) Long limit,
      @JsonProperty(required = true, value = JSON_PROPERTY_OFFSET) Long offset,
      @JsonProperty(required = true, value = JSON_PROPERTY_TOTAL_COUNT) Long totalCount) {
    this.limit = limit;
    this.offset = offset;
    this.totalCount = totalCount;
  }

  public AgentHealthIssuesResponsePage countsByIssueType(Map<String, Long> countsByIssueType) {
    this.countsByIssueType = countsByIssueType;
    return this;
  }

  public AgentHealthIssuesResponsePage putCountsByIssueTypeItem(
      String key, Long countsByIssueTypeItem) {
    if (this.countsByIssueType == null) {
      this.countsByIssueType = new HashMap<>();
    }
    this.countsByIssueType.put(key, countsByIssueTypeItem);
    return this;
  }

  /**
   * The number of open issues matching the filters in each issue-type group.
   *
   * @return countsByIssueType
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_COUNTS_BY_ISSUE_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Map<String, Long> getCountsByIssueType() {
    return countsByIssueType;
  }

  public void setCountsByIssueType(Map<String, Long> countsByIssueType) {
    this.countsByIssueType = countsByIssueType;
  }

  public AgentHealthIssuesResponsePage limit(Long limit) {
    this.limit = limit;
    return this;
  }

  /**
   * The maximum number of issues returned, echoing the requested <code>page[limit]</code>.
   *
   * @return limit
   */
  @JsonProperty(JSON_PROPERTY_LIMIT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Long getLimit() {
    return limit;
  }

  public void setLimit(Long limit) {
    this.limit = limit;
  }

  public AgentHealthIssuesResponsePage offset(Long offset) {
    this.offset = offset;
    return this;
  }

  /**
   * The number of issues skipped, echoing the requested <code>page[offset]</code>.
   *
   * @return offset
   */
  @JsonProperty(JSON_PROPERTY_OFFSET)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Long getOffset() {
    return offset;
  }

  public void setOffset(Long offset) {
    this.offset = offset;
  }

  public AgentHealthIssuesResponsePage totalCount(Long totalCount) {
    this.totalCount = totalCount;
    return this;
  }

  /**
   * The total number of open issues matching the filters.
   *
   * @return totalCount
   */
  @JsonProperty(JSON_PROPERTY_TOTAL_COUNT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Long getTotalCount() {
    return totalCount;
  }

  public void setTotalCount(Long totalCount) {
    this.totalCount = totalCount;
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
   * @return AgentHealthIssuesResponsePage
   */
  @JsonAnySetter
  public AgentHealthIssuesResponsePage putAdditionalProperty(String key, Object value) {
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

  /** Return true if this AgentHealthIssuesResponsePage object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AgentHealthIssuesResponsePage agentHealthIssuesResponsePage = (AgentHealthIssuesResponsePage) o;
    return Objects.equals(this.countsByIssueType, agentHealthIssuesResponsePage.countsByIssueType)
        && Objects.equals(this.limit, agentHealthIssuesResponsePage.limit)
        && Objects.equals(this.offset, agentHealthIssuesResponsePage.offset)
        && Objects.equals(this.totalCount, agentHealthIssuesResponsePage.totalCount)
        && Objects.equals(
            this.additionalProperties, agentHealthIssuesResponsePage.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(countsByIssueType, limit, offset, totalCount, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AgentHealthIssuesResponsePage {\n");
    sb.append("    countsByIssueType: ").append(toIndentedString(countsByIssueType)).append("\n");
    sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
    sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
    sb.append("    totalCount: ").append(toIndentedString(totalCount)).append("\n");
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
