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

/** A single column of a DDSQL tabular query result. */
@JsonPropertyOrder({
  DdsqlTabularQueryColumn.JSON_PROPERTY_NAME,
  DdsqlTabularQueryColumn.JSON_PROPERTY_TYPE,
  DdsqlTabularQueryColumn.JSON_PROPERTY_VALUES
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class DdsqlTabularQueryColumn {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_TYPE = "type";
  private String type;

  public static final String JSON_PROPERTY_VALUES = "values";
  private List<Object> values = new ArrayList<>();

  public DdsqlTabularQueryColumn() {}

  @JsonCreator
  public DdsqlTabularQueryColumn(
      @JsonProperty(required = true, value = JSON_PROPERTY_NAME) String name,
      @JsonProperty(required = true, value = JSON_PROPERTY_TYPE) String type,
      @JsonProperty(required = true, value = JSON_PROPERTY_VALUES) List<Object> values) {
    this.name = name;
    this.type = type;
    this.values = values;
  }

  public DdsqlTabularQueryColumn name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Name of the column as projected by the SQL statement.
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

  public DdsqlTabularQueryColumn type(String type) {
    this.type = type;
    return this;
  }

  /**
   * DDSQL data type of the column's values, for example <code>VARCHAR</code>, <code>BIGINT</code>,
   * <code>DECIMAL</code>, <code>BOOLEAN</code>, <code>TIMESTAMP</code>, <code>JSON</code>, or an
   * array variant such as <code>VARCHAR[]</code>. See the <a
   * href="https://docs.datadoghq.com/ddsql_reference/#data-types">DDSQL data-types reference</a>
   * for the full, up-to-date list.
   *
   * @return type
   */
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public DdsqlTabularQueryColumn values(List<Object> values) {
    this.values = values;
    return this;
  }

  public DdsqlTabularQueryColumn addValuesItem(Object valuesItem) {
    this.values.add(valuesItem);
    return this;
  }

  /**
   * Column values in row order. The element type matches the column's <code>type</code>; for
   * example a <code>VARCHAR</code> column carries strings, a <code>TIMESTAMP</code> column carries
   * Unix-millisecond integers. <code>null</code> is allowed for missing values.
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
   * @return DdsqlTabularQueryColumn
   */
  @JsonAnySetter
  public DdsqlTabularQueryColumn putAdditionalProperty(String key, Object value) {
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

  /** Return true if this DdsqlTabularQueryColumn object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DdsqlTabularQueryColumn ddsqlTabularQueryColumn = (DdsqlTabularQueryColumn) o;
    return Objects.equals(this.name, ddsqlTabularQueryColumn.name)
        && Objects.equals(this.type, ddsqlTabularQueryColumn.type)
        && Objects.equals(this.values, ddsqlTabularQueryColumn.values)
        && Objects.equals(this.additionalProperties, ddsqlTabularQueryColumn.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, type, values, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DdsqlTabularQueryColumn {\n");
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
