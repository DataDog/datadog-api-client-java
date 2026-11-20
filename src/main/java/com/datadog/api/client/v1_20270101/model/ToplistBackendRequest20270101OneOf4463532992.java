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
  ToplistBackendRequest20270101OneOf4463532992.JSON_PROPERTY_CONDITIONAL_FORMATS,
  ToplistBackendRequest20270101OneOf4463532992.JSON_PROPERTY_PROCESS_QUERY
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class ToplistBackendRequest20270101OneOf4463532992 {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_CONDITIONAL_FORMATS = "conditional_formats";
  private List<ThresholdFormattingRule> conditionalFormats = null;

  public static final String JSON_PROPERTY_PROCESS_QUERY = "process_query";
  private ProcessQueryDefinition processQuery;

  public ToplistBackendRequest20270101OneOf4463532992() {}

  @JsonCreator
  public ToplistBackendRequest20270101OneOf4463532992(
      @JsonProperty(required = true, value = JSON_PROPERTY_PROCESS_QUERY)
          ProcessQueryDefinition processQuery) {
    this.processQuery = processQuery;
    this.unparsed |= processQuery.unparsed;
  }

  public ToplistBackendRequest20270101OneOf4463532992 conditionalFormats(
      List<ThresholdFormattingRule> conditionalFormats) {
    this.conditionalFormats = conditionalFormats;
    if (conditionalFormats != null) {
      for (ThresholdFormattingRule item : conditionalFormats) {
        this.unparsed |= item.unparsed;
      }
    }
    return this;
  }

  public ToplistBackendRequest20270101OneOf4463532992 addConditionalFormatsItem(
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

  public ToplistBackendRequest20270101OneOf4463532992 processQuery(
      ProcessQueryDefinition processQuery) {
    this.processQuery = processQuery;
    this.unparsed |= processQuery.unparsed;
    return this;
  }

  /**
   * Test-only generated schema for the dashboard versioning proof of concept.
   *
   * @return processQuery
   */
  @JsonProperty(JSON_PROPERTY_PROCESS_QUERY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public ProcessQueryDefinition getProcessQuery() {
    return processQuery;
  }

  public void setProcessQuery(ProcessQueryDefinition processQuery) {
    this.processQuery = processQuery;
    if (processQuery != null) {
      this.unparsed |= processQuery.unparsed;
    }
  }

  /** Return true if this ToplistBackendRequest20270101OneOf4463532992 object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ToplistBackendRequest20270101OneOf4463532992 toplistBackendRequest20270101OneOf4463532992 =
        (ToplistBackendRequest20270101OneOf4463532992) o;
    return Objects.equals(
            this.conditionalFormats,
            toplistBackendRequest20270101OneOf4463532992.conditionalFormats)
        && Objects.equals(
            this.processQuery, toplistBackendRequest20270101OneOf4463532992.processQuery);
  }

  @Override
  public int hashCode() {
    return Objects.hash(conditionalFormats, processQuery);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ToplistBackendRequest20270101OneOf4463532992 {\n");
    sb.append("    conditionalFormats: ").append(toIndentedString(conditionalFormats)).append("\n");
    sb.append("    processQuery: ").append(toIndentedString(processQuery)).append("\n");
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
