/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v2.model;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/**
 * A column in a scalar response. When type is "group", values contains arrays of strings. When type
 * is "number", values contains numeric values.
 */
@JsonPropertyOrder({
  CommitmentsScalarColumn.JSON_PROPERTY_META,
  CommitmentsScalarColumn.JSON_PROPERTY_NAME,
  CommitmentsScalarColumn.JSON_PROPERTY_TYPE,
  CommitmentsScalarColumn.JSON_PROPERTY_VALUES
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class CommitmentsScalarColumn {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_META = "meta";
  private CommitmentsScalarColumnMeta meta;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_TYPE = "type";
  private CommitmentsScalarColumnType type;

  public static final String JSON_PROPERTY_VALUES = "values";
  private List<Object> values = new ArrayList<>();

  public CommitmentsScalarColumn() {}

  @JsonCreator
  public CommitmentsScalarColumn(
      @JsonProperty(required = true, value = JSON_PROPERTY_NAME) String name,
      @JsonProperty(required = true, value = JSON_PROPERTY_TYPE) CommitmentsScalarColumnType type,
      @JsonProperty(required = true, value = JSON_PROPERTY_VALUES) List<Object> values) {
    this.name = name;
    this.type = type;
    this.unparsed |= !type.isValid();
    this.values = values;
  }

  public CommitmentsScalarColumn meta(CommitmentsScalarColumnMeta meta) {
    this.meta = meta;
    this.unparsed |= meta.unparsed;
    return this;
  }

  /**
   * Metadata for a scalar column, including unit information.
   *
   * @return meta
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_META)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public CommitmentsScalarColumnMeta getMeta() {
    return meta;
  }

  public void setMeta(CommitmentsScalarColumnMeta meta) {
    this.meta = meta;
  }

  public CommitmentsScalarColumn name(String name) {
    this.name = name;
    return this;
  }

  /**
   * The column name.
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

  public CommitmentsScalarColumn type(CommitmentsScalarColumnType type) {
    this.type = type;
    this.unparsed |= !type.isValid();
    return this;
  }

  /**
   * The column type. "group" for dimension columns, "number" for metric columns.
   *
   * @return type
   */
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public CommitmentsScalarColumnType getType() {
    return type;
  }

  public void setType(CommitmentsScalarColumnType type) {
    if (!type.isValid()) {
      this.unparsed = true;
    }
    this.type = type;
  }

  public CommitmentsScalarColumn values(List<Object> values) {
    this.values = values;
    return this;
  }

  public CommitmentsScalarColumn addValuesItem(Object valuesItem) {
    this.values.add(valuesItem);
    return this;
  }

  /**
   * Values for a scalar column. Arrays of strings for group columns, numbers for value columns.
   *
   * @return values
   */
  @JsonProperty(JSON_PROPERTY_VALUES)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public List<Object> getValues() {
    return values;
  }

  public void setValues(List<Object> values) {
    this.values = values;
  }

  /**
   * A container for additional, undeclared properties. This is a holder for any undeclared
   * properties as specified with the 'additionalProperties' keyword in the OAS document.
   */
  private Map<String, Object> additionalProperties;

  /**
   * Set the additional (undeclared) property with the specified name and value. If the property
   * does not already exist, create it otherwise replace it.
   *
   * @param key The arbitrary key to set
   * @param value The associated value
   * @return CommitmentsScalarColumn
   */
  @JsonAnySetter
  public CommitmentsScalarColumn putAdditionalProperty(String key, Object value) {
    if (this.additionalProperties == null) {
      this.additionalProperties = new HashMap<String, Object>();
    }
    this.additionalProperties.put(key, value);
    return this;
  }

  /**
   * Return the additional (undeclared) property.
   *
   * @return The additional properties
   */
  @JsonAnyGetter
  public Map<String, Object> getAdditionalProperties() {
    return additionalProperties;
  }

  /**
   * Return the additional (undeclared) property with the specified name.
   *
   * @param key The arbitrary key to get
   * @return The specific additional property for the given key
   */
  public Object getAdditionalProperty(String key) {
    if (this.additionalProperties == null) {
      return null;
    }
    return this.additionalProperties.get(key);
  }

  /** Return true if this CommitmentsScalarColumn object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CommitmentsScalarColumn commitmentsScalarColumn = (CommitmentsScalarColumn) o;
    return Objects.equals(this.meta, commitmentsScalarColumn.meta)
        && Objects.equals(this.name, commitmentsScalarColumn.name)
        && Objects.equals(this.type, commitmentsScalarColumn.type)
        && Objects.equals(this.values, commitmentsScalarColumn.values)
        && Objects.equals(this.additionalProperties, commitmentsScalarColumn.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(meta, name, type, values, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CommitmentsScalarColumn {\n");
    sb.append("    meta: ").append(toIndentedString(meta)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    values: ").append(toIndentedString(values)).append("\n");
    sb.append("    additionalProperties: ")
        .append(toIndentedString(additionalProperties))
        .append("\n");
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
