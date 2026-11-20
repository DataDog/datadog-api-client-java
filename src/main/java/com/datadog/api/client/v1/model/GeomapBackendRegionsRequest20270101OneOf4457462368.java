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
  GeomapBackendRegionsRequest20270101OneOf4457462368.JSON_PROPERTY_CONDITIONAL_FORMATS,
  GeomapBackendRegionsRequest20270101OneOf4457462368.JSON_PROPERTY_STYLE,
  GeomapBackendRegionsRequest20270101OneOf4457462368.JSON_PROPERTY_SYNTHETICS_TEST_RUNS
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class GeomapBackendRegionsRequest20270101OneOf4457462368 {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_CONDITIONAL_FORMATS = "conditional_formats";
  private List<ThresholdFormattingRule_20270101> conditionalFormats = null;

  public static final String JSON_PROPERTY_STYLE = "style";
  private GeomapRequestStyle_20270101 style;

  public static final String JSON_PROPERTY_SYNTHETICS_TEST_RUNS = "synthetics_test_runs";
  private LogQueryDefinition_20270101 syntheticsTestRuns;

  public GeomapBackendRegionsRequest20270101OneOf4457462368() {}

  @JsonCreator
  public GeomapBackendRegionsRequest20270101OneOf4457462368(
      @JsonProperty(required = true, value = JSON_PROPERTY_SYNTHETICS_TEST_RUNS)
          LogQueryDefinition_20270101 syntheticsTestRuns) {
    this.syntheticsTestRuns = syntheticsTestRuns;
    this.unparsed |= syntheticsTestRuns.unparsed;
  }

  public GeomapBackendRegionsRequest20270101OneOf4457462368 conditionalFormats(
      List<ThresholdFormattingRule_20270101> conditionalFormats) {
    this.conditionalFormats = conditionalFormats;
    if (conditionalFormats != null) {
      for (ThresholdFormattingRule_20270101 item : conditionalFormats) {
        this.unparsed |= item.unparsed;
      }
    }
    return this;
  }

  public GeomapBackendRegionsRequest20270101OneOf4457462368 addConditionalFormatsItem(
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

  public GeomapBackendRegionsRequest20270101OneOf4457462368 style(
      GeomapRequestStyle_20270101 style) {
    this.style = style;
    this.unparsed |= style.unparsed;
    return this;
  }

  /**
   * Test-only generated schema for the dashboard versioning proof of concept.
   *
   * @return style
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_STYLE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public GeomapRequestStyle_20270101 getStyle() {
    return style;
  }

  public void setStyle(GeomapRequestStyle_20270101 style) {
    this.style = style;
    if (style != null) {
      this.unparsed |= style.unparsed;
    }
  }

  public GeomapBackendRegionsRequest20270101OneOf4457462368 syntheticsTestRuns(
      LogQueryDefinition_20270101 syntheticsTestRuns) {
    this.syntheticsTestRuns = syntheticsTestRuns;
    this.unparsed |= syntheticsTestRuns.unparsed;
    return this;
  }

  /**
   * Test-only generated schema for the dashboard versioning proof of concept.
   *
   * @return syntheticsTestRuns
   */
  @JsonProperty(JSON_PROPERTY_SYNTHETICS_TEST_RUNS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public LogQueryDefinition_20270101 getSyntheticsTestRuns() {
    return syntheticsTestRuns;
  }

  public void setSyntheticsTestRuns(LogQueryDefinition_20270101 syntheticsTestRuns) {
    this.syntheticsTestRuns = syntheticsTestRuns;
    if (syntheticsTestRuns != null) {
      this.unparsed |= syntheticsTestRuns.unparsed;
    }
  }

  /**
   * Return true if this GeomapBackendRegionsRequest20270101OneOf4457462368 object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GeomapBackendRegionsRequest20270101OneOf4457462368
        geomapBackendRegionsRequest20270101OneOf4457462368 =
            (GeomapBackendRegionsRequest20270101OneOf4457462368) o;
    return Objects.equals(
            this.conditionalFormats,
            geomapBackendRegionsRequest20270101OneOf4457462368.conditionalFormats)
        && Objects.equals(this.style, geomapBackendRegionsRequest20270101OneOf4457462368.style)
        && Objects.equals(
            this.syntheticsTestRuns,
            geomapBackendRegionsRequest20270101OneOf4457462368.syntheticsTestRuns);
  }

  @Override
  public int hashCode() {
    return Objects.hash(conditionalFormats, style, syntheticsTestRuns);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GeomapBackendRegionsRequest20270101OneOf4457462368 {\n");
    sb.append("    conditionalFormats: ").append(toIndentedString(conditionalFormats)).append("\n");
    sb.append("    style: ").append(toIndentedString(style)).append("\n");
    sb.append("    syntheticsTestRuns: ").append(toIndentedString(syntheticsTestRuns)).append("\n");
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
