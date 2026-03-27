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

/** The data object containing the reference table configuration and state. */
@JsonPropertyOrder({
  TableResultV2Data.JSON_PROPERTY_ATTRIBUTES,
  TableResultV2Data.JSON_PROPERTY_ID,
  TableResultV2Data.JSON_PROPERTY_TYPE
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class TableResultV2Data {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_ATTRIBUTES = "attributes";
  private TableResultV2DataAttributes attributes;

  public static final String JSON_PROPERTY_ID = "id";
  private String id;

  public static final String JSON_PROPERTY_TYPE = "type";
  private TableResultV2DataType type = TableResultV2DataType.REFERENCE_TABLE;

  public TableResultV2Data() {}

  @JsonCreator
  public TableResultV2Data(
      @JsonProperty(required = true, value = JSON_PROPERTY_TYPE) TableResultV2DataType type) {
    this.type = type;
    this.unparsed |= !type.isValid();
  }

  public TableResultV2Data attributes(TableResultV2DataAttributes attributes) {
    this.attributes = attributes;
    this.unparsed |= attributes.unparsed;
    return this;
  }

  /**
   * Attributes that define the reference table's configuration and properties.
   *
   * @return attributes
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ATTRIBUTES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public TableResultV2DataAttributes getAttributes() {
    return attributes;
  }

  public void setAttributes(TableResultV2DataAttributes attributes) {
    this.attributes = attributes;
  }

  public TableResultV2Data id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Unique identifier for the reference table.
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

  public TableResultV2Data type(TableResultV2DataType type) {
    this.type = type;
    this.unparsed |= !type.isValid();
    return this;
  }

  /**
   * Reference table resource type.
   *
   * @return type
   */
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public TableResultV2DataType getType() {
    return type;
  }

  public void setType(TableResultV2DataType type) {
    if (!type.isValid()) {
      this.unparsed = true;
    }
    this.type = type;
  }

  /** Return true if this TableResultV2Data object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TableResultV2Data tableResultV2Data = (TableResultV2Data) o;
    return Objects.equals(this.attributes, tableResultV2Data.attributes)
        && Objects.equals(this.id, tableResultV2Data.id)
        && Objects.equals(this.type, tableResultV2Data.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(attributes, id, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TableResultV2Data {\n");
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
