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
import java.util.Objects;

/** Test-only generated schema for the dashboard versioning proof of concept. */
@JsonPropertyOrder({
  AudienceFiltersSegmentsItems.JSON_PROPERTY_NAME,
  AudienceFiltersSegmentsItems.JSON_PROPERTY_SEGMENT_ID
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class AudienceFiltersSegmentsItems {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_SEGMENT_ID = "segment_id";
  private String segmentId;

  public AudienceFiltersSegmentsItems() {}

  @JsonCreator
  public AudienceFiltersSegmentsItems(
      @JsonProperty(required = true, value = JSON_PROPERTY_NAME) String name,
      @JsonProperty(required = true, value = JSON_PROPERTY_SEGMENT_ID) String segmentId) {
    this.name = name;
    this.segmentId = segmentId;
  }

  public AudienceFiltersSegmentsItems name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Test-only generated schema for the dashboard versioning proof of concept.
   *
   * @return name
   */
  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public AudienceFiltersSegmentsItems segmentId(String segmentId) {
    this.segmentId = segmentId;
    return this;
  }

  /**
   * Test-only generated schema for the dashboard versioning proof of concept.
   *
   * @return segmentId
   */
  @JsonProperty(JSON_PROPERTY_SEGMENT_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getSegmentId() {
    return segmentId;
  }

  public void setSegmentId(String segmentId) {
    this.segmentId = segmentId;
  }

  /** Return true if this AudienceFiltersSegmentsItems object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AudienceFiltersSegmentsItems audienceFiltersSegmentsItems = (AudienceFiltersSegmentsItems) o;
    return Objects.equals(this.name, audienceFiltersSegmentsItems.name)
        && Objects.equals(this.segmentId, audienceFiltersSegmentsItems.segmentId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, segmentId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AudienceFiltersSegmentsItems {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    segmentId: ").append(toIndentedString(segmentId)).append("\n");
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
