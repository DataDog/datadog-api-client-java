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

/** Column of node text. */
@JsonPropertyOrder({
  TopologyMapInlineNodeStringColumn.JSON_PROPERTY_ID,
  TopologyMapInlineNodeStringColumn.JSON_PROPERTY_KIND,
  TopologyMapInlineNodeStringColumn.JSON_PROPERTY_VALUES
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class TopologyMapInlineNodeStringColumn {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_ID = "id";
  private TopologyMapInlineNodeStringColumnId id;

  public static final String JSON_PROPERTY_KIND = "kind";
  private TopologyMapInlineColumnKindString kind = TopologyMapInlineColumnKindString.STRING;

  public static final String JSON_PROPERTY_VALUES = "values";
  private List<String> values = new ArrayList<>();

  public TopologyMapInlineNodeStringColumn() {}

  @JsonCreator
  public TopologyMapInlineNodeStringColumn(
      @JsonProperty(required = true, value = JSON_PROPERTY_ID)
          TopologyMapInlineNodeStringColumnId id,
      @JsonProperty(required = true, value = JSON_PROPERTY_KIND)
          TopologyMapInlineColumnKindString kind,
      @JsonProperty(required = true, value = JSON_PROPERTY_VALUES) List<String> values) {
    this.id = id;
    this.unparsed |= !id.isValid();
    this.kind = kind;
    this.unparsed |= !kind.isValid();
    this.values = values;
  }

  public TopologyMapInlineNodeStringColumn id(TopologyMapInlineNodeStringColumnId id) {
    this.id = id;
    this.unparsed |= !id.isValid();
    return this;
  }

  /**
   * Node field the column fills. <code>title</code> is bold text at the top of the node; <code>
   * subtitle</code> is smaller text below it.
   *
   * @return id
   */
  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public TopologyMapInlineNodeStringColumnId getId() {
    return id;
  }

  public void setId(TopologyMapInlineNodeStringColumnId id) {
    if (!id.isValid()) {
      this.unparsed = true;
    }
    this.id = id;
  }

  public TopologyMapInlineNodeStringColumn kind(TopologyMapInlineColumnKindString kind) {
    this.kind = kind;
    this.unparsed |= !kind.isValid();
    return this;
  }

  /**
   * Column of strings.
   *
   * @return kind
   */
  @JsonProperty(JSON_PROPERTY_KIND)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public TopologyMapInlineColumnKindString getKind() {
    return kind;
  }

  public void setKind(TopologyMapInlineColumnKindString kind) {
    if (!kind.isValid()) {
      this.unparsed = true;
    }
    this.kind = kind;
  }

  public TopologyMapInlineNodeStringColumn values(List<String> values) {
    this.values = values;
    return this;
  }

  public TopologyMapInlineNodeStringColumn addValuesItem(String valuesItem) {
    this.values.add(valuesItem);
    return this;
  }

  /**
   * Text for each node. A null <code>title</code> shows the node's ID; a null <code>subtitle</code>
   * shows no subtitle.
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

  /** Return true if this TopologyMapInlineNodeStringColumn object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TopologyMapInlineNodeStringColumn topologyMapInlineNodeStringColumn =
        (TopologyMapInlineNodeStringColumn) o;
    return Objects.equals(this.id, topologyMapInlineNodeStringColumn.id)
        && Objects.equals(this.kind, topologyMapInlineNodeStringColumn.kind)
        && Objects.equals(this.values, topologyMapInlineNodeStringColumn.values);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, kind, values);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TopologyMapInlineNodeStringColumn {\n");
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
