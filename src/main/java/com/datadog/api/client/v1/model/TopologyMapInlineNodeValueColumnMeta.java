/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v1.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import java.util.Objects;

/** Display options for a value column. */
@JsonPropertyOrder({TopologyMapInlineNodeValueColumnMeta.JSON_PROPERTY_UNIT})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class TopologyMapInlineNodeValueColumnMeta {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_UNIT = "unit";
  private NumberFormatUnit unit;

  public TopologyMapInlineNodeValueColumnMeta unit(NumberFormatUnit unit) {
    this.unit = unit;
    this.unparsed |= unit.unparsed;
    return this;
  }

  /**
   * Number format unit.
   *
   * @return unit
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_UNIT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public NumberFormatUnit getUnit() {
    return unit;
  }

  public void setUnit(NumberFormatUnit unit) {
    this.unit = unit;
    if (unit != null) {
      this.unparsed |= unit.unparsed;
    }
  }

  /** Return true if this TopologyMapInlineNodeValueColumnMeta object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TopologyMapInlineNodeValueColumnMeta topologyMapInlineNodeValueColumnMeta =
        (TopologyMapInlineNodeValueColumnMeta) o;
    return Objects.equals(this.unit, topologyMapInlineNodeValueColumnMeta.unit);
  }

  @Override
  public int hashCode() {
    return Objects.hash(unit);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TopologyMapInlineNodeValueColumnMeta {\n");
    sb.append("    unit: ").append(toIndentedString(unit)).append("\n");
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
