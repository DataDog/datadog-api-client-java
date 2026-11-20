/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v1_20270101.model;

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
  ToplistBackendRequest20270101OneOf4463529792.JSON_PROPERTY_AUDIT_QUERY,
  ToplistBackendRequest20270101OneOf4463529792.JSON_PROPERTY_CONDITIONAL_FORMATS
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class ToplistBackendRequest20270101OneOf4463529792 {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_AUDIT_QUERY = "audit_query";
  private LogQueryDefinition auditQuery;

  public static final String JSON_PROPERTY_CONDITIONAL_FORMATS = "conditional_formats";
  private List<ThresholdFormattingRule> conditionalFormats = null;

  public ToplistBackendRequest20270101OneOf4463529792() {}

  @JsonCreator
  public ToplistBackendRequest20270101OneOf4463529792(
      @JsonProperty(required = true, value = JSON_PROPERTY_AUDIT_QUERY)
          LogQueryDefinition auditQuery) {
    this.auditQuery = auditQuery;
    this.unparsed |= auditQuery.unparsed;
  }

  public ToplistBackendRequest20270101OneOf4463529792 auditQuery(LogQueryDefinition auditQuery) {
    this.auditQuery = auditQuery;
    this.unparsed |= auditQuery.unparsed;
    return this;
  }

  /**
   * Test-only generated schema for the dashboard versioning proof of concept.
   *
   * @return auditQuery
   */
  @JsonProperty(JSON_PROPERTY_AUDIT_QUERY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public LogQueryDefinition getAuditQuery() {
    return auditQuery;
  }

  public void setAuditQuery(LogQueryDefinition auditQuery) {
    this.auditQuery = auditQuery;
    if (auditQuery != null) {
      this.unparsed |= auditQuery.unparsed;
    }
  }

  public ToplistBackendRequest20270101OneOf4463529792 conditionalFormats(
      List<ThresholdFormattingRule> conditionalFormats) {
    this.conditionalFormats = conditionalFormats;
    if (conditionalFormats != null) {
      for (ThresholdFormattingRule item : conditionalFormats) {
        this.unparsed |= item.unparsed;
      }
    }
    return this;
  }

  public ToplistBackendRequest20270101OneOf4463529792 addConditionalFormatsItem(
      ThresholdFormattingRule conditionalFormatsItem) {
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
  public List<ThresholdFormattingRule> getConditionalFormats() {
    return conditionalFormats;
  }

  public void setConditionalFormats(List<ThresholdFormattingRule> conditionalFormats) {
    this.conditionalFormats = conditionalFormats;
    if (conditionalFormats != null) {
      for (ThresholdFormattingRule item : conditionalFormats) {
        this.unparsed |= item.unparsed;
      }
    }
  }

  /** Return true if this ToplistBackendRequest20270101OneOf4463529792 object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ToplistBackendRequest20270101OneOf4463529792 toplistBackendRequest20270101OneOf4463529792 =
        (ToplistBackendRequest20270101OneOf4463529792) o;
    return Objects.equals(this.auditQuery, toplistBackendRequest20270101OneOf4463529792.auditQuery)
        && Objects.equals(
            this.conditionalFormats,
            toplistBackendRequest20270101OneOf4463529792.conditionalFormats);
  }

  @Override
  public int hashCode() {
    return Objects.hash(auditQuery, conditionalFormats);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ToplistBackendRequest20270101OneOf4463529792 {\n");
    sb.append("    auditQuery: ").append(toIndentedString(auditQuery)).append("\n");
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
