/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/** Test-only generated schema for the dashboard versioning proof of concept. */
@JsonPropertyOrder({
  ToplistBackendRequest20270101OneOf4463535232.JSON_PROPERTY_CONDITIONAL_FORMATS,
  ToplistBackendRequest20270101OneOf4463535232.JSON_PROPERTY_PROFILEMETRICS_QUERY
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class ToplistBackendRequest20270101OneOf4463535232 {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_CONDITIONAL_FORMATS = "conditional_formats";
  private List<ThresholdFormattingRule_20270101> conditionalFormats = null;

  public static final String JSON_PROPERTY_PROFILEMETRICS_QUERY = "profilemetrics_query";
  private LogQueryDefinition_20270101 profilemetricsQuery;

  public ToplistBackendRequest20270101OneOf4463535232() {}

  @JsonCreator
  public ToplistBackendRequest20270101OneOf4463535232(
      @JsonProperty(required = true, value = JSON_PROPERTY_PROFILEMETRICS_QUERY)
          LogQueryDefinition_20270101 profilemetricsQuery) {
    this.profilemetricsQuery = profilemetricsQuery;
    this.unparsed |= profilemetricsQuery.unparsed;
  }

  public ToplistBackendRequest20270101OneOf4463535232 conditionalFormats(
      List<ThresholdFormattingRule_20270101> conditionalFormats) {
    this.conditionalFormats = conditionalFormats;
    if (conditionalFormats != null) {
      for (ThresholdFormattingRule_20270101 item : conditionalFormats) {
        this.unparsed |= item.unparsed;
      }
    }
    return this;
  }

  public ToplistBackendRequest20270101OneOf4463535232 addConditionalFormatsItem(
      ThresholdFormattingRule_20270101 conditionalFormatsItem) {
    if (this.conditionalFormats == null) {
      this.conditionalFormats = new ArrayList<>();
    }
    this.conditionalFormats.add(conditionalFormatsItem);
    this.unparsed |= conditionalFormatsItem.unparsed;
    return this;
  }

  /**
   * Test-only generated schema for the dashboard versioning proof of concept.
   *
   * @return conditionalFormats
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CONDITIONAL_FORMATS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<ThresholdFormattingRule_20270101> getConditionalFormats() {
    return conditionalFormats;
  }

  public void setConditionalFormats(List<ThresholdFormattingRule_20270101> conditionalFormats) {
    this.conditionalFormats = conditionalFormats;
    if (conditionalFormats != null) {
      for (ThresholdFormattingRule_20270101 item : conditionalFormats) {
        this.unparsed |= item.unparsed;
      }
    }
  }

  public ToplistBackendRequest20270101OneOf4463535232 profilemetricsQuery(
      LogQueryDefinition_20270101 profilemetricsQuery) {
    this.profilemetricsQuery = profilemetricsQuery;
    this.unparsed |= profilemetricsQuery.unparsed;
    return this;
  }

  /**
   * Test-only generated schema for the dashboard versioning proof of concept.
   *
   * @return profilemetricsQuery
   */
  @JsonProperty(JSON_PROPERTY_PROFILEMETRICS_QUERY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public LogQueryDefinition_20270101 getProfilemetricsQuery() {
    return profilemetricsQuery;
  }

  public void setProfilemetricsQuery(LogQueryDefinition_20270101 profilemetricsQuery) {
    this.profilemetricsQuery = profilemetricsQuery;
    if (profilemetricsQuery != null) {
      this.unparsed |= profilemetricsQuery.unparsed;
    }
  }

  /** Return true if this ToplistBackendRequest20270101OneOf4463535232 object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ToplistBackendRequest20270101OneOf4463535232 toplistBackendRequest20270101OneOf4463535232 =
        (ToplistBackendRequest20270101OneOf4463535232) o;
    return Objects.equals(
            this.conditionalFormats,
            toplistBackendRequest20270101OneOf4463535232.conditionalFormats)
        && Objects.equals(
            this.profilemetricsQuery,
            toplistBackendRequest20270101OneOf4463535232.profilemetricsQuery);
  }

  @Override
  public int hashCode() {
    return Objects.hash(conditionalFormats, profilemetricsQuery);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ToplistBackendRequest20270101OneOf4463535232 {\n");
    sb.append("    conditionalFormats: ").append(toIndentedString(conditionalFormats)).append("\n");
    sb.append("    profilemetricsQuery: ")
        .append(toIndentedString(profilemetricsQuery))
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
