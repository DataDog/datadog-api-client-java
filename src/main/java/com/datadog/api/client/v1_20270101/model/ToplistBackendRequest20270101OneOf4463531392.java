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
  ToplistBackendRequest20270101OneOf4463531392.JSON_PROPERTY_CONDITIONAL_FORMATS,
  ToplistBackendRequest20270101OneOf4463531392.JSON_PROPERTY_SYNTHETICS_BATCHES
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class ToplistBackendRequest20270101OneOf4463531392 {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_CONDITIONAL_FORMATS = "conditional_formats";
  private List<ThresholdFormattingRule> conditionalFormats = null;

  public static final String JSON_PROPERTY_SYNTHETICS_BATCHES = "synthetics_batches";
  private LogQueryDefinition syntheticsBatches;

  public ToplistBackendRequest20270101OneOf4463531392() {}

  @JsonCreator
  public ToplistBackendRequest20270101OneOf4463531392(
      @JsonProperty(required = true, value = JSON_PROPERTY_SYNTHETICS_BATCHES)
          LogQueryDefinition syntheticsBatches) {
    this.syntheticsBatches = syntheticsBatches;
    this.unparsed |= syntheticsBatches.unparsed;
  }

  public ToplistBackendRequest20270101OneOf4463531392 conditionalFormats(
      List<ThresholdFormattingRule> conditionalFormats) {
    this.conditionalFormats = conditionalFormats;
    if (conditionalFormats != null) {
      for (ThresholdFormattingRule item : conditionalFormats) {
        this.unparsed |= item.unparsed;
      }
    }
    return this;
  }

  public ToplistBackendRequest20270101OneOf4463531392 addConditionalFormatsItem(
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

  public ToplistBackendRequest20270101OneOf4463531392 syntheticsBatches(
      LogQueryDefinition syntheticsBatches) {
    this.syntheticsBatches = syntheticsBatches;
    this.unparsed |= syntheticsBatches.unparsed;
    return this;
  }

  /**
   * Test-only generated schema for the dashboard versioning proof of concept.
   *
   * @return syntheticsBatches
   */
  @JsonProperty(JSON_PROPERTY_SYNTHETICS_BATCHES)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public LogQueryDefinition getSyntheticsBatches() {
    return syntheticsBatches;
  }

  public void setSyntheticsBatches(LogQueryDefinition syntheticsBatches) {
    this.syntheticsBatches = syntheticsBatches;
    if (syntheticsBatches != null) {
      this.unparsed |= syntheticsBatches.unparsed;
    }
  }

  /** Return true if this ToplistBackendRequest20270101OneOf4463531392 object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ToplistBackendRequest20270101OneOf4463531392 toplistBackendRequest20270101OneOf4463531392 =
        (ToplistBackendRequest20270101OneOf4463531392) o;
    return Objects.equals(
            this.conditionalFormats,
            toplistBackendRequest20270101OneOf4463531392.conditionalFormats)
        && Objects.equals(
            this.syntheticsBatches, toplistBackendRequest20270101OneOf4463531392.syntheticsBatches);
  }

  @Override
  public int hashCode() {
    return Objects.hash(conditionalFormats, syntheticsBatches);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ToplistBackendRequest20270101OneOf4463531392 {\n");
    sb.append("    conditionalFormats: ").append(toIndentedString(conditionalFormats)).append("\n");
    sb.append("    syntheticsBatches: ").append(toIndentedString(syntheticsBatches)).append("\n");
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
