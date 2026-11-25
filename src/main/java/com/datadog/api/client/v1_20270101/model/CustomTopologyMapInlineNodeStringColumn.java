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
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/** Test-only generated schema for the dashboard versioning proof of concept. */
@JsonPropertyOrder({
  CustomTopologyMapInlineNodeStringColumn.JSON_PROPERTY_ID,
  CustomTopologyMapInlineNodeStringColumn.JSON_PROPERTY_KIND,
  CustomTopologyMapInlineNodeStringColumn.JSON_PROPERTY_VALUES
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class CustomTopologyMapInlineNodeStringColumn {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_ID = "id";
  private CustomTopologyMapInlineNodeStringColumnId id;

  public static final String JSON_PROPERTY_KIND = "kind";
  private CustomTopologyMapInlineNodeStringColumnKind kind;

  public static final String JSON_PROPERTY_VALUES = "values";
  private List<String> values = new ArrayList<>();

  public CustomTopologyMapInlineNodeStringColumn() {}

  @JsonCreator
  public CustomTopologyMapInlineNodeStringColumn(
      @JsonProperty(required = true, value = JSON_PROPERTY_ID)
          CustomTopologyMapInlineNodeStringColumnId id,
      @JsonProperty(required = true, value = JSON_PROPERTY_KIND)
          CustomTopologyMapInlineNodeStringColumnKind kind,
      @JsonProperty(required = true, value = JSON_PROPERTY_VALUES) List<String> values) {
    this.id = id;
    this.unparsed |= !id.isValid();
    this.kind = kind;
    this.unparsed |= !kind.isValid();
    this.values = values;
  }

  public CustomTopologyMapInlineNodeStringColumn id(CustomTopologyMapInlineNodeStringColumnId id) {
    this.id = id;
    this.unparsed |= !id.isValid();
    return this;
  }

  /**
   * Test-only generated schema for the dashboard versioning proof of concept.
   *
   * @return id
   */
  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public CustomTopologyMapInlineNodeStringColumnId getId() {
    return id;
  }

  public void setId(CustomTopologyMapInlineNodeStringColumnId id) {
    if (!id.isValid()) {
      this.unparsed = true;
    }
    this.id = id;
  }

  public CustomTopologyMapInlineNodeStringColumn kind(
      CustomTopologyMapInlineNodeStringColumnKind kind) {
    this.kind = kind;
    this.unparsed |= !kind.isValid();
    return this;
  }

  /**
   * Test-only generated schema for the dashboard versioning proof of concept.
   *
   * @return kind
   */
  @JsonProperty(JSON_PROPERTY_KIND)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public CustomTopologyMapInlineNodeStringColumnKind getKind() {
    return kind;
  }

  public void setKind(CustomTopologyMapInlineNodeStringColumnKind kind) {
    if (!kind.isValid()) {
      this.unparsed = true;
    }
    this.kind = kind;
  }

  public CustomTopologyMapInlineNodeStringColumn values(List<String> values) {
    this.values = values;
    return this;
  }

  public CustomTopologyMapInlineNodeStringColumn addValuesItem(String valuesItem) {
    this.values.add(valuesItem);
    return this;
  }

  /**
   * Test-only generated schema for the dashboard versioning proof of concept.
   *
   * @return values
   */
  @JsonProperty(JSON_PROPERTY_VALUES)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public List<String> getValues() {
    return values;
  }

  public void setValues(List<String> values) {
    this.values = values;
  }

  /** Return true if this CustomTopologyMapInlineNodeStringColumn object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CustomTopologyMapInlineNodeStringColumn customTopologyMapInlineNodeStringColumn =
        (CustomTopologyMapInlineNodeStringColumn) o;
    return Objects.equals(this.id, customTopologyMapInlineNodeStringColumn.id)
        && Objects.equals(this.kind, customTopologyMapInlineNodeStringColumn.kind)
        && Objects.equals(this.values, customTopologyMapInlineNodeStringColumn.values);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, kind, values);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CustomTopologyMapInlineNodeStringColumn {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    kind: ").append(toIndentedString(kind)).append("\n");
    sb.append("    values: ").append(toIndentedString(values)).append("\n");
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
