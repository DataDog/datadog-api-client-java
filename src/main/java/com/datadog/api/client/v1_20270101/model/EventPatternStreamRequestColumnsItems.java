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
  EventPatternStreamRequestColumnsItems.JSON_PROPERTY_ALIAS,
  EventPatternStreamRequestColumnsItems.JSON_PROPERTY_FIELD,
  EventPatternStreamRequestColumnsItems.JSON_PROPERTY_WIDTH
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class EventPatternStreamRequestColumnsItems {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_ALIAS = "alias";
  private String alias;

  public static final String JSON_PROPERTY_FIELD = "field";
  private String field;

  public static final String JSON_PROPERTY_WIDTH = "width";
  private EventPatternStreamRequestColumnsItems20270101Width width;

  public EventPatternStreamRequestColumnsItems() {}

  @JsonCreator
  public EventPatternStreamRequestColumnsItems(
      @JsonProperty(required = true, value = JSON_PROPERTY_FIELD) String field,
      @JsonProperty(required = true, value = JSON_PROPERTY_WIDTH)
          EventPatternStreamRequestColumnsItems20270101Width width) {
    this.field = field;
    this.width = width;
    this.unparsed |= width.unparsed;
  }

  public EventPatternStreamRequestColumnsItems alias(String alias) {
    this.alias = alias;
    return this;
  }

  /**
   * Test-only generated schema for the dashboard versioning proof of concept.
   *
   * @return alias
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ALIAS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getAlias() {
    return alias;
  }

  public void setAlias(String alias) {
    this.alias = alias;
  }

  public EventPatternStreamRequestColumnsItems field(String field) {
    this.field = field;
    return this;
  }

  /**
   * Test-only generated schema for the dashboard versioning proof of concept.
   *
   * @return field
   */
  @JsonProperty(JSON_PROPERTY_FIELD)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getField() {
    return field;
  }

  public void setField(String field) {
    this.field = field;
  }

  public EventPatternStreamRequestColumnsItems width(
      EventPatternStreamRequestColumnsItems20270101Width width) {
    this.width = width;
    this.unparsed |= width.unparsed;
    return this;
  }

  /**
   * Test-only generated schema for the dashboard versioning proof of concept.
   *
   * @return width
   */
  @JsonProperty(JSON_PROPERTY_WIDTH)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public EventPatternStreamRequestColumnsItems20270101Width getWidth() {
    return width;
  }

  public void setWidth(EventPatternStreamRequestColumnsItems20270101Width width) {
    this.width = width;
    if (width != null) {
      this.unparsed |= width.unparsed;
    }
  }

  /** Return true if this EventPatternStreamRequestColumnsItems object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EventPatternStreamRequestColumnsItems eventPatternStreamRequestColumnsItems =
        (EventPatternStreamRequestColumnsItems) o;
    return Objects.equals(this.alias, eventPatternStreamRequestColumnsItems.alias)
        && Objects.equals(this.field, eventPatternStreamRequestColumnsItems.field)
        && Objects.equals(this.width, eventPatternStreamRequestColumnsItems.width);
  }

  @Override
  public int hashCode() {
    return Objects.hash(alias, field, width);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EventPatternStreamRequestColumnsItems {\n");
    sb.append("    alias: ").append(toIndentedString(alias)).append("\n");
    sb.append("    field: ").append(toIndentedString(field)).append("\n");
    sb.append("    width: ").append(toIndentedString(width)).append("\n");
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
