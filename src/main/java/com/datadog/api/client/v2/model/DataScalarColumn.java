/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v2.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/** A column containing the numerical results for a formula or query. */
@JsonPropertyOrder({
  DataScalarColumn.JSON_PROPERTY_META,
  DataScalarColumn.JSON_PROPERTY_NAME,
  DataScalarColumn.JSON_PROPERTY_TYPE,
  DataScalarColumn.JSON_PROPERTY_VALUES
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class DataScalarColumn {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_META = "meta";
  private ScalarMeta meta;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_TYPE = "type";
  private String type;

  public static final String JSON_PROPERTY_VALUES = "values";
  private List<Double> values = null;

  public DataScalarColumn meta(ScalarMeta meta) {
    this.meta = meta;
    this.unparsed |= meta.unparsed;
    return this;
  }

  /**
   * Metadata for the resulting numerical values.
   *
   * @return meta
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_META)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public ScalarMeta getMeta() {
    return meta;
  }

  public void setMeta(ScalarMeta meta) {
    this.meta = meta;
  }

  public DataScalarColumn name(String name) {
    this.name = name;
    return this;
  }

  /**
   * The name referencing the formula or query for this column.
   *
   * @return name
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public DataScalarColumn type(String type) {
    this.type = type;
    return this;
  }

  /**
   * The type of column present.
   *
   * @return type
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public DataScalarColumn values(List<Double> values) {
    this.values = values;
    return this;
  }

  public DataScalarColumn addValuesItem(Double valuesItem) {
    if (this.values == null) {
      this.values = new ArrayList<>();
    }
    this.values.add(valuesItem);
    return this;
  }

  /**
   * The array of numerical values for one formula or query.
   *
   * @return values
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_VALUES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<Double> getValues() {
    return values;
  }

  public void setValues(List<Double> values) {
    this.values = values;
  }

  /** Return true if this DataScalarColumn object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DataScalarColumn dataScalarColumn = (DataScalarColumn) o;
    return Objects.equals(this.meta, dataScalarColumn.meta)
        && Objects.equals(this.name, dataScalarColumn.name)
        && Objects.equals(this.type, dataScalarColumn.type)
        && Objects.equals(this.values, dataScalarColumn.values);
  }

  @Override
  public int hashCode() {
    return Objects.hash(meta, name, type, values);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DataScalarColumn {\n");
    sb.append("    meta: ").append(toIndentedString(meta)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    values: ").append(toIndentedString(values)).append("\n");
    sb.append("}");
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
