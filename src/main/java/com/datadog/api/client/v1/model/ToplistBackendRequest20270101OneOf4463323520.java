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
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/** Test-only generated schema for the dashboard versioning proof of concept. */
@JsonPropertyOrder({
  ToplistBackendRequest20270101OneOf4463323520.JSON_PROPERTY__QUERY_OPTIONS,
  ToplistBackendRequest20270101OneOf4463323520.JSON_PROPERTY_CONDITIONAL_FORMATS,
  ToplistBackendRequest20270101OneOf4463323520.JSON_PROPERTY_Q
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class ToplistBackendRequest20270101OneOf4463323520 {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY__QUERY_OPTIONS = "_query_options";
  private Map<String, DashboardInlineSchema1_20270101> QueryOptions = null;

  public static final String JSON_PROPERTY_CONDITIONAL_FORMATS = "conditional_formats";
  private List<ThresholdFormattingRule_20270101> conditionalFormats = null;

  public static final String JSON_PROPERTY_Q = "q";
  private String q;

  public ToplistBackendRequest20270101OneOf4463323520() {}

  @JsonCreator
  public ToplistBackendRequest20270101OneOf4463323520(
      @JsonProperty(required = true, value = JSON_PROPERTY_Q) String q) {
    this.q = q;
  }

  public ToplistBackendRequest20270101OneOf4463323520 QueryOptions(
      Map<String, DashboardInlineSchema1_20270101> QueryOptions) {
    this.QueryOptions = QueryOptions;
    return this;
  }

  public ToplistBackendRequest20270101OneOf4463323520 putQueryOptionsItem(
      String key, DashboardInlineSchema1_20270101 QueryOptionsItem) {
    if (this.QueryOptions == null) {
      this.QueryOptions = new HashMap<>();
    }
    this.QueryOptions.put(key, QueryOptionsItem);
    return this;
  }

  /**
   * Test-only generated schema for the dashboard versioning proof of concept.
   *
   * @return QueryOptions
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY__QUERY_OPTIONS)
  @JsonInclude(content = JsonInclude.Include.ALWAYS, value = JsonInclude.Include.USE_DEFAULTS)
  public Map<String, DashboardInlineSchema1_20270101> getQueryOptions() {
    return QueryOptions;
  }

  public void setQueryOptions(Map<String, DashboardInlineSchema1_20270101> QueryOptions) {
    this.QueryOptions = QueryOptions;
  }

  public ToplistBackendRequest20270101OneOf4463323520 conditionalFormats(
      List<ThresholdFormattingRule_20270101> conditionalFormats) {
    this.conditionalFormats = conditionalFormats;
    if (conditionalFormats != null) {
      for (ThresholdFormattingRule_20270101 item : conditionalFormats) {
        this.unparsed |= item.unparsed;
      }
    }
    return this;
  }

  public ToplistBackendRequest20270101OneOf4463323520 addConditionalFormatsItem(
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

  public ToplistBackendRequest20270101OneOf4463323520 q(String q) {
    this.q = q;
    return this;
  }

  /**
   * Test-only generated schema for the dashboard versioning proof of concept.
   *
   * @return q
   */
  @JsonProperty(JSON_PROPERTY_Q)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getQ() {
    return q;
  }

  public void setQ(String q) {
    this.q = q;
  }

  /** Return true if this ToplistBackendRequest20270101OneOf4463323520 object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ToplistBackendRequest20270101OneOf4463323520 toplistBackendRequest20270101OneOf4463323520 =
        (ToplistBackendRequest20270101OneOf4463323520) o;
    return Objects.equals(
            this.QueryOptions, toplistBackendRequest20270101OneOf4463323520.QueryOptions)
        && Objects.equals(
            this.conditionalFormats,
            toplistBackendRequest20270101OneOf4463323520.conditionalFormats)
        && Objects.equals(this.q, toplistBackendRequest20270101OneOf4463323520.q);
  }

  @Override
  public int hashCode() {
    return Objects.hash(QueryOptions, conditionalFormats, q);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ToplistBackendRequest20270101OneOf4463323520 {\n");
    sb.append("    QueryOptions: ").append(toIndentedString(QueryOptions)).append("\n");
    sb.append("    conditionalFormats: ").append(toIndentedString(conditionalFormats)).append("\n");
    sb.append("    q: ").append(toIndentedString(q)).append("\n");
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
