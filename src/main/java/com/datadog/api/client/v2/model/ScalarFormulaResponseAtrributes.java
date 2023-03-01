/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v2.model;

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
   * <p>The object describing a scalar response.</p>
 */
@JsonPropertyOrder({
  ScalarFormulaResponseAtrributes.JSON_PROPERTY_COLUMNS
})
@jakarta.annotation.Generated(value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class ScalarFormulaResponseAtrributes {
  @JsonIgnore
  public boolean unparsed = false;
  public static final String JSON_PROPERTY_COLUMNS = "columns";
  private List<ScalarColumn> columns = null;

  public ScalarFormulaResponseAtrributes columns(List<ScalarColumn> columns) {
    this.columns = columns;
    for (ScalarColumn item : columns) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }
  public ScalarFormulaResponseAtrributes addColumnsItem(ScalarColumn columnsItem) {
    if (this.columns == null) {
      this.columns = new ArrayList<>();
    }
    this.columns.add(columnsItem);
    this.unparsed |= columnsItem.unparsed;
    return this;
  }

  /**
   * <p>List of response columns, each corresponding to an individual formula or query in the request and with values in parallel arrays matching the series list.</p>
   * @return columns
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_COLUMNS)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public List<ScalarColumn> getColumns() {
        return columns;
      }
  public void setColumns(List<ScalarColumn> columns) {
    this.columns = columns;
  }

  /**
   * Return true if this ScalarFormulaResponseAtrributes object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ScalarFormulaResponseAtrributes scalarFormulaResponseAtrributes = (ScalarFormulaResponseAtrributes) o;
    return Objects.equals(this.columns, scalarFormulaResponseAtrributes.columns);
  }


  @Override
  public int hashCode() {
    return Objects.hash(columns);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ScalarFormulaResponseAtrributes {\n");
    sb.append("    columns: ").append(toIndentedString(columns)).append("\n");
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
