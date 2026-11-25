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
  ComparisonRequest.JSON_PROPERTY_DIRECTIONALITY,
  ComparisonRequest.JSON_PROPERTY_DURATION,
  ComparisonRequest.JSON_PROPERTY_LAYOUT,
  ComparisonRequest.JSON_PROPERTY_TYPE
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class ComparisonRequest {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_DIRECTIONALITY = "directionality";
  private ChangeDirectionality directionality;

  public static final String JSON_PROPERTY_DURATION = "duration";
  private ChangeDuration duration;

  public static final String JSON_PROPERTY_LAYOUT = "layout";
  private ChangeLayout layout;

  public static final String JSON_PROPERTY_TYPE = "type";
  private ChangeType type;

  public ComparisonRequest() {}

  @JsonCreator
  public ComparisonRequest(
      @JsonProperty(required = true, value = JSON_PROPERTY_DURATION) ChangeDuration duration) {
    this.duration = duration;
    this.unparsed |= duration.unparsed;
  }

  public ComparisonRequest directionality(ChangeDirectionality directionality) {
    this.directionality = directionality;
    this.unparsed |= !directionality.isValid();
    return this;
  }

  /**
   * Test-only generated schema for the dashboard versioning proof of concept.
   *
   * @return directionality
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DIRECTIONALITY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public ChangeDirectionality getDirectionality() {
    return directionality;
  }

  public void setDirectionality(ChangeDirectionality directionality) {
    if (!directionality.isValid()) {
      this.unparsed = true;
    }
    this.directionality = directionality;
  }

  public ComparisonRequest duration(ChangeDuration duration) {
    this.duration = duration;
    this.unparsed |= duration.unparsed;
    return this;
  }

  /**
   * Test-only generated schema for the dashboard versioning proof of concept.
   *
   * @return duration
   */
  @JsonProperty(JSON_PROPERTY_DURATION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public ChangeDuration getDuration() {
    return duration;
  }

  public void setDuration(ChangeDuration duration) {
    this.duration = duration;
    if (duration != null) {
      this.unparsed |= duration.unparsed;
    }
  }

  public ComparisonRequest layout(ChangeLayout layout) {
    this.layout = layout;
    this.unparsed |= !layout.isValid();
    return this;
  }

  /**
   * Test-only generated schema for the dashboard versioning proof of concept.
   *
   * @return layout
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LAYOUT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public ChangeLayout getLayout() {
    return layout;
  }

  public void setLayout(ChangeLayout layout) {
    if (!layout.isValid()) {
      this.unparsed = true;
    }
    this.layout = layout;
  }

  public ComparisonRequest type(ChangeType type) {
    this.type = type;
    this.unparsed |= !type.isValid();
    return this;
  }

  /**
   * Test-only generated schema for the dashboard versioning proof of concept.
   *
   * @return type
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public ChangeType getType() {
    return type;
  }

  public void setType(ChangeType type) {
    if (!type.isValid()) {
      this.unparsed = true;
    }
    this.type = type;
  }

  /** Return true if this ComparisonRequest object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComparisonRequest comparisonRequest = (ComparisonRequest) o;
    return Objects.equals(this.directionality, comparisonRequest.directionality)
        && Objects.equals(this.duration, comparisonRequest.duration)
        && Objects.equals(this.layout, comparisonRequest.layout)
        && Objects.equals(this.type, comparisonRequest.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(directionality, duration, layout, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComparisonRequest {\n");
    sb.append("    directionality: ").append(toIndentedString(directionality)).append("\n");
    sb.append("    duration: ").append(toIndentedString(duration)).append("\n");
    sb.append("    layout: ").append(toIndentedString(layout)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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
