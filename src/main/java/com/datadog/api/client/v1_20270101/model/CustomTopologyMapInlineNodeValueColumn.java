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
  CustomTopologyMapInlineNodeValueColumn.JSON_PROPERTY_ID,
  CustomTopologyMapInlineNodeValueColumn.JSON_PROPERTY_KIND,
  CustomTopologyMapInlineNodeValueColumn.JSON_PROPERTY_META,
  CustomTopologyMapInlineNodeValueColumn.JSON_PROPERTY_VALUES
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class CustomTopologyMapInlineNodeValueColumn {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_ID = "id";
  private String id;

  public static final String JSON_PROPERTY_KIND = "kind";
  private CustomTopologyMapInlineNodeValueColumnKind kind;

  public static final String JSON_PROPERTY_META = "meta";
  private CustomTopologyMapInlineNodeValueColumnMeta meta;

  public static final String JSON_PROPERTY_VALUES = "values";
  private List<Double> values = new ArrayList<>();

  public CustomTopologyMapInlineNodeValueColumn() {}

  @JsonCreator
  public CustomTopologyMapInlineNodeValueColumn(
      @JsonProperty(required = true, value = JSON_PROPERTY_ID) String id,
      @JsonProperty(required = true, value = JSON_PROPERTY_KIND)
          CustomTopologyMapInlineNodeValueColumnKind kind,
      @JsonProperty(required = true, value = JSON_PROPERTY_VALUES) List<Double> values) {
    this.id = id;
    this.kind = kind;
    this.unparsed |= !kind.isValid();
    this.values = values;
  }

  public CustomTopologyMapInlineNodeValueColumn id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Test-only generated schema for the dashboard versioning proof of concept.
   *
   * @return id
   */
  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public CustomTopologyMapInlineNodeValueColumn kind(
      CustomTopologyMapInlineNodeValueColumnKind kind) {
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
  public CustomTopologyMapInlineNodeValueColumnKind getKind() {
    return kind;
  }

  public void setKind(CustomTopologyMapInlineNodeValueColumnKind kind) {
    if (!kind.isValid()) {
      this.unparsed = true;
    }
    this.kind = kind;
  }

  public CustomTopologyMapInlineNodeValueColumn meta(
      CustomTopologyMapInlineNodeValueColumnMeta meta) {
    this.meta = meta;
    this.unparsed |= meta.unparsed;
    return this;
  }

  /**
   * Test-only generated schema for the dashboard versioning proof of concept.
   *
   * @return meta
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_META)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public CustomTopologyMapInlineNodeValueColumnMeta getMeta() {
    return meta;
  }

  public void setMeta(CustomTopologyMapInlineNodeValueColumnMeta meta) {
    this.meta = meta;
    if (meta != null) {
      this.unparsed |= meta.unparsed;
    }
  }

  public CustomTopologyMapInlineNodeValueColumn values(List<Double> values) {
    this.values = values;
    return this;
  }

  public CustomTopologyMapInlineNodeValueColumn addValuesItem(Double valuesItem) {
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
  public List<Double> getValues() {
    return values;
  }

  public void setValues(List<Double> values) {
    this.values = values;
  }

  /** Return true if this CustomTopologyMapInlineNodeValueColumn object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CustomTopologyMapInlineNodeValueColumn customTopologyMapInlineNodeValueColumn =
        (CustomTopologyMapInlineNodeValueColumn) o;
    return Objects.equals(this.id, customTopologyMapInlineNodeValueColumn.id)
        && Objects.equals(this.kind, customTopologyMapInlineNodeValueColumn.kind)
        && Objects.equals(this.meta, customTopologyMapInlineNodeValueColumn.meta)
        && Objects.equals(this.values, customTopologyMapInlineNodeValueColumn.values);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, kind, meta, values);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CustomTopologyMapInlineNodeValueColumn {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    kind: ").append(toIndentedString(kind)).append("\n");
    sb.append("    meta: ").append(toIndentedString(meta)).append("\n");
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
