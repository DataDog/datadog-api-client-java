/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import java.util.Objects;

/** The data object containing the row column names and values. */
@JsonPropertyOrder({
  TableRowResourceData.JSON_PROPERTY_ATTRIBUTES,
  TableRowResourceData.JSON_PROPERTY_ID,
  TableRowResourceData.JSON_PROPERTY_TYPE
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class TableRowResourceData {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_ATTRIBUTES = "attributes";
  private TableRowResourceDataAttributes attributes;

  public static final String JSON_PROPERTY_ID = "id";
  private String id;

  public static final String JSON_PROPERTY_TYPE = "type";
  private TableRowResourceDataType type = TableRowResourceDataType.ROW;

  public TableRowResourceData() {}

  @JsonCreator
  public TableRowResourceData(
      @JsonProperty(required = true, value = JSON_PROPERTY_TYPE) TableRowResourceDataType type) {
    this.type = type;
    this.unparsed |= !type.isValid();
  }

  public TableRowResourceData attributes(TableRowResourceDataAttributes attributes) {
    this.attributes = attributes;
    this.unparsed |= attributes.unparsed;
    return this;
  }

  /**
   * Column values for this row in the reference table.
   *
   * @return attributes
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ATTRIBUTES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public TableRowResourceDataAttributes getAttributes() {
    return attributes;
  }

  public void setAttributes(TableRowResourceDataAttributes attributes) {
    this.attributes = attributes;
  }

  public TableRowResourceData id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Row identifier, corresponding to the primary key value.
   *
   * @return id
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public TableRowResourceData type(TableRowResourceDataType type) {
    this.type = type;
    this.unparsed |= !type.isValid();
    return this;
  }

  /**
   * Row resource type.
   *
   * @return type
   */
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public TableRowResourceDataType getType() {
    return type;
  }

  public void setType(TableRowResourceDataType type) {
    if (!type.isValid()) {
      this.unparsed = true;
    }
    this.type = type;
  }

  /** Return true if this TableRowResourceData object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TableRowResourceData tableRowResourceData = (TableRowResourceData) o;
    return Objects.equals(this.attributes, tableRowResourceData.attributes)
        && Objects.equals(this.id, tableRowResourceData.id)
        && Objects.equals(this.type, tableRowResourceData.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(attributes, id, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TableRowResourceData {\n");
    sb.append("    attributes: ").append(toIndentedString(attributes)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
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
