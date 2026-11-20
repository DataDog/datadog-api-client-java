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
  EventsDataExtractionExtraction.JSON_PROPERTY_PATTERN,
  EventsDataExtractionExtraction.JSON_PROPERTY_TYPE
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class EventsDataExtractionExtraction {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_PATTERN = "pattern";
  private String pattern;

  public static final String JSON_PROPERTY_TYPE = "type";
  private EventsDataExtractionExtractionType type;

  public EventsDataExtractionExtraction() {}

  @JsonCreator
  public EventsDataExtractionExtraction(
      @JsonProperty(required = true, value = JSON_PROPERTY_PATTERN) String pattern,
      @JsonProperty(required = true, value = JSON_PROPERTY_TYPE)
          EventsDataExtractionExtractionType type) {
    this.pattern = pattern;
    this.type = type;
    this.unparsed |= !type.isValid();
  }

  public EventsDataExtractionExtraction pattern(String pattern) {
    this.pattern = pattern;
    return this;
  }

  /**
   * Test-only generated schema for the dashboard versioning proof of concept.
   *
   * @return pattern
   */
  @JsonProperty(JSON_PROPERTY_PATTERN)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getPattern() {
    return pattern;
  }

  public void setPattern(String pattern) {
    this.pattern = pattern;
  }

  public EventsDataExtractionExtraction type(EventsDataExtractionExtractionType type) {
    this.type = type;
    this.unparsed |= !type.isValid();
    return this;
  }

  /**
   * Test-only generated schema for the dashboard versioning proof of concept.
   *
   * @return type
   */
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public EventsDataExtractionExtractionType getType() {
    return type;
  }

  public void setType(EventsDataExtractionExtractionType type) {
    if (!type.isValid()) {
      this.unparsed = true;
    }
    this.type = type;
  }

  /** Return true if this EventsDataExtractionExtraction object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EventsDataExtractionExtraction eventsDataExtractionExtraction =
        (EventsDataExtractionExtraction) o;
    return Objects.equals(this.pattern, eventsDataExtractionExtraction.pattern)
        && Objects.equals(this.type, eventsDataExtractionExtraction.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pattern, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EventsDataExtractionExtraction {\n");
    sb.append("    pattern: ").append(toIndentedString(pattern)).append("\n");
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
