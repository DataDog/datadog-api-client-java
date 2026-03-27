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
import java.util.UUID;
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
   * <p>Widget definition.</p>
 */
@JsonPropertyOrder({
  ScatterPlotWidgetDefinitionRequests.JSON_PROPERTY_TABLE,
  ScatterPlotWidgetDefinitionRequests.JSON_PROPERTY_X,
  ScatterPlotWidgetDefinitionRequests.JSON_PROPERTY_Y
})
@jakarta.annotation.Generated(value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class ScatterPlotWidgetDefinitionRequests {
  @JsonIgnore
  public boolean unparsed = false;
  public static final String JSON_PROPERTY_TABLE = "table";
  private ScatterplotTableRequest table;

  public static final String JSON_PROPERTY_X = "x";
  private ScatterPlotRequest x;

  public static final String JSON_PROPERTY_Y = "y";
  private ScatterPlotRequest y;

  public ScatterPlotWidgetDefinitionRequests table(ScatterplotTableRequest table) {
    this.table = table;
    this.unparsed |= table.unparsed;
    return this;
  }

  /**
   * <p>Scatterplot request containing formulas and functions.</p>
   * @return table
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_TABLE)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public ScatterplotTableRequest getTable() {
        return table;
      }
  public void setTable(ScatterplotTableRequest table) {
    this.table = table;
  }
  public ScatterPlotWidgetDefinitionRequests x(ScatterPlotRequest x) {
    this.x = x;
    this.unparsed |= x.unparsed;
    return this;
  }

  /**
   * <p>Updated scatter plot.</p>
   * @return x
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_X)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public ScatterPlotRequest getX() {
        return x;
      }
  public void setX(ScatterPlotRequest x) {
    this.x = x;
  }
  public ScatterPlotWidgetDefinitionRequests y(ScatterPlotRequest y) {
    this.y = y;
    this.unparsed |= y.unparsed;
    return this;
  }

  /**
   * <p>Updated scatter plot.</p>
   * @return y
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_Y)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public ScatterPlotRequest getY() {
        return y;
      }
  public void setY(ScatterPlotRequest y) {
    this.y = y;
  }

  /**
   * A container for additional, undeclared properties.
   * This is a holder for any undeclared properties as specified with
   * the 'additionalProperties' keyword in the OAS document.
   */
  private Map<String, Object> additionalProperties;

  /**
   * Set the additional (undeclared) property with the specified name and value.
   * If the property does not already exist, create it otherwise replace it.
   *
   * @param key The arbitrary key to set
   * @param value The associated value
   * @return ScatterPlotWidgetDefinitionRequests
   */
  @JsonAnySetter
  public ScatterPlotWidgetDefinitionRequests putAdditionalProperty(String key, Object value) {
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

  /**
   * Return true if this ScatterPlotWidgetDefinitionRequests object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ScatterPlotWidgetDefinitionRequests scatterPlotWidgetDefinitionRequests = (ScatterPlotWidgetDefinitionRequests) o;
    return Objects.equals(this.table, scatterPlotWidgetDefinitionRequests.table) && Objects.equals(this.x, scatterPlotWidgetDefinitionRequests.x) && Objects.equals(this.y, scatterPlotWidgetDefinitionRequests.y) && Objects.equals(this.additionalProperties, scatterPlotWidgetDefinitionRequests.additionalProperties);
  }


  @Override
  public int hashCode() {
    return Objects.hash(table,x,y, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ScatterPlotWidgetDefinitionRequests {\n");
    sb.append("    table: ").append(toIndentedString(table)).append("\n");
    sb.append("    x: ").append(toIndentedString(x)).append("\n");
    sb.append("    y: ").append(toIndentedString(y)).append("\n");
    sb.append("    additionalProperties: ")
        .append(toIndentedString(additionalProperties))
        .append("\n");
    sb.append('}');
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
