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
  ToplistBackendRequest20270101OneOf4463526592.JSON_PROPERTY_CONDITIONAL_FORMATS,
  ToplistBackendRequest20270101OneOf4463526592.JSON_PROPERTY_EVENT_QUERY
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class ToplistBackendRequest20270101OneOf4463526592 {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_CONDITIONAL_FORMATS = "conditional_formats";
  private List<ThresholdFormattingRule_20270101> conditionalFormats = null;

  public static final String JSON_PROPERTY_EVENT_QUERY = "event_query";
  private LogQueryDefinition_20270101 eventQuery;

  public ToplistBackendRequest20270101OneOf4463526592() {}

  @JsonCreator
  public ToplistBackendRequest20270101OneOf4463526592(
      @JsonProperty(required = true, value = JSON_PROPERTY_EVENT_QUERY)
          LogQueryDefinition_20270101 eventQuery) {
    this.eventQuery = eventQuery;
    this.unparsed |= eventQuery.unparsed;
  }

  public ToplistBackendRequest20270101OneOf4463526592 conditionalFormats(
      List<ThresholdFormattingRule_20270101> conditionalFormats) {
    this.conditionalFormats = conditionalFormats;
    if (conditionalFormats != null) {
      for (ThresholdFormattingRule_20270101 item : conditionalFormats) {
        this.unparsed |= item.unparsed;
      }
    }
    return this;
  }

  public ToplistBackendRequest20270101OneOf4463526592 addConditionalFormatsItem(
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

  public ToplistBackendRequest20270101OneOf4463526592 eventQuery(
      LogQueryDefinition_20270101 eventQuery) {
    this.eventQuery = eventQuery;
    this.unparsed |= eventQuery.unparsed;
    return this;
  }

  /**
   * Test-only generated schema for the dashboard versioning proof of concept.
   *
   * @return eventQuery
   */
  @JsonProperty(JSON_PROPERTY_EVENT_QUERY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public LogQueryDefinition_20270101 getEventQuery() {
    return eventQuery;
  }

  public void setEventQuery(LogQueryDefinition_20270101 eventQuery) {
    this.eventQuery = eventQuery;
    if (eventQuery != null) {
      this.unparsed |= eventQuery.unparsed;
    }
  }

  /** Return true if this ToplistBackendRequest20270101OneOf4463526592 object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ToplistBackendRequest20270101OneOf4463526592 toplistBackendRequest20270101OneOf4463526592 =
        (ToplistBackendRequest20270101OneOf4463526592) o;
    return Objects.equals(
            this.conditionalFormats,
            toplistBackendRequest20270101OneOf4463526592.conditionalFormats)
        && Objects.equals(this.eventQuery, toplistBackendRequest20270101OneOf4463526592.eventQuery);
  }

  @Override
  public int hashCode() {
    return Objects.hash(conditionalFormats, eventQuery);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ToplistBackendRequest20270101OneOf4463526592 {\n");
    sb.append("    conditionalFormats: ").append(toIndentedString(conditionalFormats)).append("\n");
    sb.append("    eventQuery: ").append(toIndentedString(eventQuery)).append("\n");
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
