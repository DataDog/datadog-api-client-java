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
  EventsDataExtraction.JSON_PROPERTY_COLUMN,
  EventsDataExtraction.JSON_PROPERTY_EXTRACTION
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class EventsDataExtraction {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_COLUMN = "column";
  private String column;

  public static final String JSON_PROPERTY_EXTRACTION = "extraction";
  private EventsDataExtractionExtraction extraction;

  public EventsDataExtraction() {}

  @JsonCreator
  public EventsDataExtraction(
      @JsonProperty(required = true, value = JSON_PROPERTY_COLUMN) String column,
      @JsonProperty(required = true, value = JSON_PROPERTY_EXTRACTION)
          EventsDataExtractionExtraction extraction) {
    this.column = column;
    this.extraction = extraction;
    this.unparsed |= extraction.unparsed;
  }

  public EventsDataExtraction column(String column) {
    this.column = column;
    return this;
  }

  /**
   * Test-only generated schema for the dashboard versioning proof of concept.
   *
   * @return column
   */
  @JsonProperty(JSON_PROPERTY_COLUMN)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getColumn() {
    return column;
  }

  public void setColumn(String column) {
    this.column = column;
  }

  public EventsDataExtraction extraction(EventsDataExtractionExtraction extraction) {
    this.extraction = extraction;
    this.unparsed |= extraction.unparsed;
    return this;
  }

  /**
   * Test-only generated schema for the dashboard versioning proof of concept.
   *
   * @return extraction
   */
  @JsonProperty(JSON_PROPERTY_EXTRACTION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public EventsDataExtractionExtraction getExtraction() {
    return extraction;
  }

  public void setExtraction(EventsDataExtractionExtraction extraction) {
    this.extraction = extraction;
    if (extraction != null) {
      this.unparsed |= extraction.unparsed;
    }
  }

  /** Return true if this EventsDataExtraction object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EventsDataExtraction eventsDataExtraction = (EventsDataExtraction) o;
    return Objects.equals(this.column, eventsDataExtraction.column)
        && Objects.equals(this.extraction, eventsDataExtraction.extraction);
  }

  @Override
  public int hashCode() {
    return Objects.hash(column, extraction);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EventsDataExtraction {\n");
    sb.append("    column: ").append(toIndentedString(column)).append("\n");
    sb.append("    extraction: ").append(toIndentedString(extraction)).append("\n");
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
