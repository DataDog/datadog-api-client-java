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
  ToplistBackendRequest20270101OneOf4463329120.JSON_PROPERTY_COMPLIANCE_FINDINGS_QUERY,
  ToplistBackendRequest20270101OneOf4463329120.JSON_PROPERTY_CONDITIONAL_FORMATS
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class ToplistBackendRequest20270101OneOf4463329120 {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_COMPLIANCE_FINDINGS_QUERY = "compliance_findings_query";
  private LogQueryDefinition_20270101 complianceFindingsQuery;

  public static final String JSON_PROPERTY_CONDITIONAL_FORMATS = "conditional_formats";
  private List<ThresholdFormattingRule_20270101> conditionalFormats = null;

  public ToplistBackendRequest20270101OneOf4463329120() {}

  @JsonCreator
  public ToplistBackendRequest20270101OneOf4463329120(
      @JsonProperty(required = true, value = JSON_PROPERTY_COMPLIANCE_FINDINGS_QUERY)
          LogQueryDefinition_20270101 complianceFindingsQuery) {
    this.complianceFindingsQuery = complianceFindingsQuery;
    this.unparsed |= complianceFindingsQuery.unparsed;
  }

  public ToplistBackendRequest20270101OneOf4463329120 complianceFindingsQuery(
      LogQueryDefinition_20270101 complianceFindingsQuery) {
    this.complianceFindingsQuery = complianceFindingsQuery;
    this.unparsed |= complianceFindingsQuery.unparsed;
    return this;
  }

  /**
   * Test-only generated schema for the dashboard versioning proof of concept.
   *
   * @return complianceFindingsQuery
   */
  @JsonProperty(JSON_PROPERTY_COMPLIANCE_FINDINGS_QUERY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public LogQueryDefinition_20270101 getComplianceFindingsQuery() {
    return complianceFindingsQuery;
  }

  public void setComplianceFindingsQuery(LogQueryDefinition_20270101 complianceFindingsQuery) {
    this.complianceFindingsQuery = complianceFindingsQuery;
    if (complianceFindingsQuery != null) {
      this.unparsed |= complianceFindingsQuery.unparsed;
    }
  }

  public ToplistBackendRequest20270101OneOf4463329120 conditionalFormats(
      List<ThresholdFormattingRule_20270101> conditionalFormats) {
    this.conditionalFormats = conditionalFormats;
    if (conditionalFormats != null) {
      for (ThresholdFormattingRule_20270101 item : conditionalFormats) {
        this.unparsed |= item.unparsed;
      }
    }
    return this;
  }

  public ToplistBackendRequest20270101OneOf4463329120 addConditionalFormatsItem(
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

  /** Return true if this ToplistBackendRequest20270101OneOf4463329120 object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ToplistBackendRequest20270101OneOf4463329120 toplistBackendRequest20270101OneOf4463329120 =
        (ToplistBackendRequest20270101OneOf4463329120) o;
    return Objects.equals(
            this.complianceFindingsQuery,
            toplistBackendRequest20270101OneOf4463329120.complianceFindingsQuery)
        && Objects.equals(
            this.conditionalFormats,
            toplistBackendRequest20270101OneOf4463329120.conditionalFormats);
  }

  @Override
  public int hashCode() {
    return Objects.hash(complianceFindingsQuery, conditionalFormats);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ToplistBackendRequest20270101OneOf4463329120 {\n");
    sb.append("    complianceFindingsQuery: ")
        .append(toIndentedString(complianceFindingsQuery))
        .append("\n");
    sb.append("    conditionalFormats: ").append(toIndentedString(conditionalFormats)).append("\n");
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
