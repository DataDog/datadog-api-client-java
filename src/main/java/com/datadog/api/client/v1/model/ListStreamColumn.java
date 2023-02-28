/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v1.model;

import java.io.File;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;
import java.util.HashMap;
import java.util.Map;
import java.util.List;
import java.util.ArrayList;
import java.time.OffsetDateTime;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import org.openapitools.jackson.nullable.JsonNullable;

import com.datadog.api.client.JsonTimeSerializer;


/**
   * <p>Widget column.</p>
 */
@JsonPropertyOrder({
  ListStreamColumn.JSON_PROPERTY_FIELD,
  ListStreamColumn.JSON_PROPERTY_WIDTH
})
@jakarta.annotation.Generated(value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class ListStreamColumn {
  @JsonIgnore
  public boolean unparsed = false;
  public static final String JSON_PROPERTY_FIELD = "field";
  private String field;

  public static final String JSON_PROPERTY_WIDTH = "width";
  private ListStreamColumnWidth width;

  public ListStreamColumn() {}

  @JsonCreator
  public ListStreamColumn(
            @JsonProperty(required=true, value=JSON_PROPERTY_FIELD)String field,
            @JsonProperty(required=true, value=JSON_PROPERTY_WIDTH)ListStreamColumnWidth width) {
        this.field = field;
        this.width = width;
        this.unparsed |= !width.isValid();
  }
  public ListStreamColumn field(String field) {
    this.field = field;
    return this;
  }

  /**
   * <p>Widget column field.</p>
   * @return field
  **/
      @JsonProperty(JSON_PROPERTY_FIELD)
      @JsonInclude(
        value = JsonInclude.Include.ALWAYS)
      public String getField() {
        return field;
      }
  public void setField(String field) {
    this.field = field;
  }
  public ListStreamColumn width(ListStreamColumnWidth width) {
    this.width = width;
    this.unparsed |= !width.isValid();
    return this;
  }

  /**
   * <p>Widget column width.</p>
   * @return width
  **/
      @JsonProperty(JSON_PROPERTY_WIDTH)
      @JsonInclude(
        value = JsonInclude.Include.ALWAYS)
      public ListStreamColumnWidth getWidth() {
        return width;
      }
  public void setWidth(ListStreamColumnWidth width) {
    if (!width.isValid()) {
        this.unparsed = true;
    }
    this.width = width;
  }

  /**
   * Return true if this ListStreamColumn object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ListStreamColumn listStreamColumn = (ListStreamColumn) o;
    return Objects.equals(this.field, listStreamColumn.field) && Objects.equals(this.width, listStreamColumn.width);
  }


  @Override
  public int hashCode() {
    return Objects.hash(field,width);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ListStreamColumn {\n");
    sb.append("    field: ").append(toIndentedString(field)).append("\n");
    sb.append("    width: ").append(toIndentedString(width)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
