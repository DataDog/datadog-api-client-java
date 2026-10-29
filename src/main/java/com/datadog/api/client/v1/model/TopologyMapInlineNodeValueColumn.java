/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * Column of numeric node values. Nodes display non-null values in order of column <code>id</code>.
 */
@JsonPropertyOrder({
  TopologyMapInlineNodeValueColumn.JSON_PROPERTY_ID,
  TopologyMapInlineNodeValueColumn.JSON_PROPERTY_KIND,
  TopologyMapInlineNodeValueColumn.JSON_PROPERTY_META,
  TopologyMapInlineNodeValueColumn.JSON_PROPERTY_VALUES
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class TopologyMapInlineNodeValueColumn {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_ID = "id";
  private String id;

  public static final String JSON_PROPERTY_KIND = "kind";
  private TopologyMapInlineColumnKindScalar kind = TopologyMapInlineColumnKindScalar.SCALAR;

  public static final String JSON_PROPERTY_META = "meta";
  private TopologyMapInlineNodeValueColumnMeta meta;

  public static final String JSON_PROPERTY_VALUES = "values";
  private List<Double> values = new ArrayList<>();

  public TopologyMapInlineNodeValueColumn() {}

  @JsonCreator
  public TopologyMapInlineNodeValueColumn(
      @JsonProperty(required = true, value = JSON_PROPERTY_ID) String id,
      @JsonProperty(required = true, value = JSON_PROPERTY_KIND)
          TopologyMapInlineColumnKindScalar kind,
      @JsonProperty(required = true, value = JSON_PROPERTY_VALUES) List<Double> values) {
    this.id = id;
    this.kind = kind;
    this.unparsed |= !kind.isValid();
    this.values = values;
  }

  public TopologyMapInlineNodeValueColumn id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Position of the value in the node, as <code>values[N]</code>. The smallest N appears first.
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

  public TopologyMapInlineNodeValueColumn kind(TopologyMapInlineColumnKindScalar kind) {
    this.kind = kind;
    this.unparsed |= !kind.isValid();
    return this;
  }

  /**
   * Column of numbers.
   *
   * @return kind
   */
  @JsonProperty(JSON_PROPERTY_KIND)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public TopologyMapInlineColumnKindScalar getKind() {
    return kind;
  }

  public void setKind(TopologyMapInlineColumnKindScalar kind) {
    if (!kind.isValid()) {
      this.unparsed = true;
    }
    this.kind = kind;
  }

  public TopologyMapInlineNodeValueColumn meta(TopologyMapInlineNodeValueColumnMeta meta) {
    this.meta = meta;
    this.unparsed |= meta.unparsed;
    return this;
  }

  /**
   * Display options for a value column.
   *
   * @return meta
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_META)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public TopologyMapInlineNodeValueColumnMeta getMeta() {
    return meta;
  }

  public void setMeta(TopologyMapInlineNodeValueColumnMeta meta) {
    this.meta = meta;
    if (meta != null) {
      this.unparsed |= meta.unparsed;
    }
  }

  public TopologyMapInlineNodeValueColumn values(List<Double> values) {
    this.values = values;
    return this;
  }

  public TopologyMapInlineNodeValueColumn addValuesItem(Double valuesItem) {
    this.values.add(valuesItem);
    return this;
  }

  /**
   * Value for each node. Null values are not displayed.
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

  /** Return true if this TopologyMapInlineNodeValueColumn object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TopologyMapInlineNodeValueColumn topologyMapInlineNodeValueColumn =
        (TopologyMapInlineNodeValueColumn) o;
    return Objects.equals(this.id, topologyMapInlineNodeValueColumn.id)
        && Objects.equals(this.kind, topologyMapInlineNodeValueColumn.kind)
        && Objects.equals(this.meta, topologyMapInlineNodeValueColumn.meta)
        && Objects.equals(this.values, topologyMapInlineNodeValueColumn.values);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, kind, meta, values);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TopologyMapInlineNodeValueColumn {\n");
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
