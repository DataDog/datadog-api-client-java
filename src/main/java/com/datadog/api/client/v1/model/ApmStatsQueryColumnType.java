/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v1.model;

import java.io.File;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;
import java.util.HashMap;
import java.util.Map;
import java.util.List;
import java.util.ArrayList;
import java.time.OffsetDateTime;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import org.openapitools.jackson.nullable.JsonNullable;

import com.datadog.api.client.JsonTimeSerializer;


/**
   * <p>Column properties.</p>
 */
@JsonPropertyOrder({
  ApmStatsQueryColumnType.JSON_PROPERTY_ALIAS,
  ApmStatsQueryColumnType.JSON_PROPERTY_CELL_DISPLAY_MODE,
  ApmStatsQueryColumnType.JSON_PROPERTY_NAME,
  ApmStatsQueryColumnType.JSON_PROPERTY_ORDER
})
@jakarta.annotation.Generated(value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class ApmStatsQueryColumnType {
  @JsonIgnore
  public boolean unparsed = false;
  public static final String JSON_PROPERTY_ALIAS = "alias";
  private String alias;

  public static final String JSON_PROPERTY_CELL_DISPLAY_MODE = "cell_display_mode";
  private TableWidgetCellDisplayMode cellDisplayMode;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_ORDER = "order";
  private WidgetSort order;

  public ApmStatsQueryColumnType() {}

  @JsonCreator
  public ApmStatsQueryColumnType(
            @JsonProperty(required=true, value=JSON_PROPERTY_NAME)String name) {
        this.name = name;
  }
  public ApmStatsQueryColumnType alias(String alias) {
    this.alias = alias;
    return this;
  }

  /**
   * <p>A user-assigned alias for the column.</p>
   * @return alias
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_ALIAS)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public String getAlias() {
        return alias;
      }
  public void setAlias(String alias) {
    this.alias = alias;
  }
  public ApmStatsQueryColumnType cellDisplayMode(TableWidgetCellDisplayMode cellDisplayMode) {
    this.cellDisplayMode = cellDisplayMode;
    this.unparsed |= !cellDisplayMode.isValid();
    return this;
  }

  /**
   * <p>Define a display mode for the table cell.</p>
   * @return cellDisplayMode
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_CELL_DISPLAY_MODE)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public TableWidgetCellDisplayMode getCellDisplayMode() {
        return cellDisplayMode;
      }
  public void setCellDisplayMode(TableWidgetCellDisplayMode cellDisplayMode) {
    if (!cellDisplayMode.isValid()) {
        this.unparsed = true;
    }
    this.cellDisplayMode = cellDisplayMode;
  }
  public ApmStatsQueryColumnType name(String name) {
    this.name = name;
    return this;
  }

  /**
   * <p>Column name.</p>
   * @return name
  **/
      @JsonProperty(JSON_PROPERTY_NAME)
      @JsonInclude(
        value = JsonInclude.Include.ALWAYS)
      public String getName() {
        return name;
      }
  public void setName(String name) {
    this.name = name;
  }
  public ApmStatsQueryColumnType order(WidgetSort order) {
    this.order = order;
    this.unparsed |= !order.isValid();
    return this;
  }

  /**
   * <p>Widget sorting methods.</p>
   * @return order
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_ORDER)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public WidgetSort getOrder() {
        return order;
      }
  public void setOrder(WidgetSort order) {
    if (!order.isValid()) {
        this.unparsed = true;
    }
    this.order = order;
  }

  /**
   * Return true if this ApmStatsQueryColumnType object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ApmStatsQueryColumnType apmStatsQueryColumnType = (ApmStatsQueryColumnType) o;
    return Objects.equals(this.alias, apmStatsQueryColumnType.alias) && Objects.equals(this.cellDisplayMode, apmStatsQueryColumnType.cellDisplayMode) && Objects.equals(this.name, apmStatsQueryColumnType.name) && Objects.equals(this.order, apmStatsQueryColumnType.order);
  }


  @Override
  public int hashCode() {
    return Objects.hash(alias,cellDisplayMode,name,order);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApmStatsQueryColumnType {\n");
    sb.append("    alias: ").append(toIndentedString(alias)).append("\n");
    sb.append("    cellDisplayMode: ").append(toIndentedString(cellDisplayMode)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    order: ").append(toIndentedString(order)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
