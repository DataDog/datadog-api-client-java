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
  ErrorsStreamRequestColumnsItems.JSON_PROPERTY_ALIAS,
  ErrorsStreamRequestColumnsItems.JSON_PROPERTY_FIELD,
  ErrorsStreamRequestColumnsItems.JSON_PROPERTY_WIDTH
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class ErrorsStreamRequestColumnsItems {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_ALIAS = "alias";
  private String alias;

  public static final String JSON_PROPERTY_FIELD = "field";
  private String field;

  public static final String JSON_PROPERTY_WIDTH = "width";
  private ErrorsStreamRequestColumnsItems20270101Width width;

  public ErrorsStreamRequestColumnsItems() {}

  @JsonCreator
  public ErrorsStreamRequestColumnsItems(
      @JsonProperty(required = true, value = JSON_PROPERTY_FIELD) String field,
      @JsonProperty(required = true, value = JSON_PROPERTY_WIDTH)
          ErrorsStreamRequestColumnsItems20270101Width width) {
    this.field = field;
    this.width = width;
    this.unparsed |= width.unparsed;
  }

  public ErrorsStreamRequestColumnsItems alias(String alias) {
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

  public ErrorsStreamRequestColumnsItems field(String field) {
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

  public ErrorsStreamRequestColumnsItems width(ErrorsStreamRequestColumnsItems20270101Width width) {
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
  public ErrorsStreamRequestColumnsItems20270101Width getWidth() {
    return width;
  }

  public void setWidth(ErrorsStreamRequestColumnsItems20270101Width width) {
    this.width = width;
    if (width != null) {
      this.unparsed |= width.unparsed;
    }
  }

  /** Return true if this ErrorsStreamRequestColumnsItems object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ErrorsStreamRequestColumnsItems errorsStreamRequestColumnsItems =
        (ErrorsStreamRequestColumnsItems) o;
    return Objects.equals(this.alias, errorsStreamRequestColumnsItems.alias)
        && Objects.equals(this.field, errorsStreamRequestColumnsItems.field)
        && Objects.equals(this.width, errorsStreamRequestColumnsItems.width);
  }

  @Override
  public int hashCode() {
    return Objects.hash(alias, field, width);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ErrorsStreamRequestColumnsItems {\n");
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
