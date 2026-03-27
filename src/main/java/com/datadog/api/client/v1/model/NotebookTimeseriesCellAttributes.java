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
   * <p>The attributes of a notebook <code>timeseries</code> cell.</p>
 */
@JsonPropertyOrder({
  NotebookTimeseriesCellAttributes.JSON_PROPERTY_DEFINITION,
  NotebookTimeseriesCellAttributes.JSON_PROPERTY_GRAPH_SIZE,
  NotebookTimeseriesCellAttributes.JSON_PROPERTY_SPLIT_BY,
  NotebookTimeseriesCellAttributes.JSON_PROPERTY_TIME
})
@jakarta.annotation.Generated(value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class NotebookTimeseriesCellAttributes {
  @JsonIgnore
  public boolean unparsed = false;
  public static final String JSON_PROPERTY_DEFINITION = "definition";
  private TimeseriesWidgetDefinition definition;

  public static final String JSON_PROPERTY_GRAPH_SIZE = "graph_size";
  private NotebookGraphSize graphSize;

  public static final String JSON_PROPERTY_SPLIT_BY = "split_by";
  private NotebookSplitBy splitBy;

  public static final String JSON_PROPERTY_TIME = "time";
  private JsonNullable<NotebookCellTime> time = JsonNullable.<NotebookCellTime>undefined();

  public NotebookTimeseriesCellAttributes() {}

  @JsonCreator
  public NotebookTimeseriesCellAttributes(
            @JsonProperty(required=true, value=JSON_PROPERTY_DEFINITION)TimeseriesWidgetDefinition definition) {
        this.definition = definition;
        this.unparsed |= definition.unparsed;
  }
  public NotebookTimeseriesCellAttributes definition(TimeseriesWidgetDefinition definition) {
    this.definition = definition;
    this.unparsed |= definition.unparsed;
    return this;
  }

  /**
   * <p>The timeseries visualization allows you to display the evolution of one or more metrics, log events, or Indexed Spans over time.</p>
   * @return definition
  **/
      @JsonProperty(JSON_PROPERTY_DEFINITION)
      @JsonInclude(
        value = JsonInclude.Include.ALWAYS)
      public TimeseriesWidgetDefinition getDefinition() {
        return definition;
      }
  public void setDefinition(TimeseriesWidgetDefinition definition) {
    this.definition = definition;
  }
  public NotebookTimeseriesCellAttributes graphSize(NotebookGraphSize graphSize) {
    this.graphSize = graphSize;
    this.unparsed |= !graphSize.isValid();
    return this;
  }

  /**
   * <p>The size of the graph.</p>
   * @return graphSize
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_GRAPH_SIZE)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public NotebookGraphSize getGraphSize() {
        return graphSize;
      }
  public void setGraphSize(NotebookGraphSize graphSize) {
    if (!graphSize.isValid()) {
        this.unparsed = true;
    }
    this.graphSize = graphSize;
  }
  public NotebookTimeseriesCellAttributes splitBy(NotebookSplitBy splitBy) {
    this.splitBy = splitBy;
    this.unparsed |= splitBy.unparsed;
    return this;
  }

  /**
   * <p>Object describing how to split the graph to display multiple visualizations per request.</p>
   * @return splitBy
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_SPLIT_BY)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public NotebookSplitBy getSplitBy() {
        return splitBy;
      }
  public void setSplitBy(NotebookSplitBy splitBy) {
    this.splitBy = splitBy;
  }
  public NotebookTimeseriesCellAttributes time(NotebookCellTime time) {
    this.time = JsonNullable.<NotebookCellTime>of(time);
    return this;
  }

  /**
   * <p>Timeframe for the notebook cell. When 'null', the notebook global time is used.</p>
   * @return time
  **/
      @jakarta.annotation.Nullable
      @JsonIgnore
      public NotebookCellTime getTime() {
        return time.orElse(null);
      }
  @JsonProperty(JSON_PROPERTY_TIME)
  @JsonInclude(
    value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<NotebookCellTime> getTime_JsonNullable() {
    return time;
  }
  @JsonProperty(JSON_PROPERTY_TIME)public void setTime_JsonNullable(JsonNullable<NotebookCellTime> time) {
    this.time = time;
  }
  public void setTime(NotebookCellTime time) {
    this.time = JsonNullable.<NotebookCellTime>of(time);
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
   * @return NotebookTimeseriesCellAttributes
   */
  @JsonAnySetter
  public NotebookTimeseriesCellAttributes putAdditionalProperty(String key, Object value) {
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
   * Return true if this NotebookTimeseriesCellAttributes object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NotebookTimeseriesCellAttributes notebookTimeseriesCellAttributes = (NotebookTimeseriesCellAttributes) o;
    return Objects.equals(this.definition, notebookTimeseriesCellAttributes.definition) && Objects.equals(this.graphSize, notebookTimeseriesCellAttributes.graphSize) && Objects.equals(this.splitBy, notebookTimeseriesCellAttributes.splitBy) && Objects.equals(this.time, notebookTimeseriesCellAttributes.time) && Objects.equals(this.additionalProperties, notebookTimeseriesCellAttributes.additionalProperties);
  }


  @Override
  public int hashCode() {
    return Objects.hash(definition,graphSize,splitBy,time, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NotebookTimeseriesCellAttributes {\n");
    sb.append("    definition: ").append(toIndentedString(definition)).append("\n");
    sb.append("    graphSize: ").append(toIndentedString(graphSize)).append("\n");
    sb.append("    splitBy: ").append(toIndentedString(splitBy)).append("\n");
    sb.append("    time: ").append(toIndentedString(time)).append("\n");
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
