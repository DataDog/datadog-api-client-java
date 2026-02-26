/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v1.model;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import org.openapitools.jackson.nullable.JsonNullable;

/** The attributes of a notebook <code>log_stream</code> cell. */
@JsonPropertyOrder({
  NotebookLogStreamCellAttributes.JSON_PROPERTY_DEFINITION,
  NotebookLogStreamCellAttributes.JSON_PROPERTY_GRAPH_SIZE,
  NotebookLogStreamCellAttributes.JSON_PROPERTY_TIME
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class NotebookLogStreamCellAttributes {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_DEFINITION = "definition";
  private LogStreamWidgetDefinition definition;

  public static final String JSON_PROPERTY_GRAPH_SIZE = "graph_size";
  private NotebookGraphSize graphSize;

  public static final String JSON_PROPERTY_TIME = "time";
  private JsonNullable<NotebookCellTime> time = JsonNullable.<NotebookCellTime>undefined();

  public NotebookLogStreamCellAttributes() {}

  @JsonCreator
  public NotebookLogStreamCellAttributes(
      @JsonProperty(required = true, value = JSON_PROPERTY_DEFINITION)
          LogStreamWidgetDefinition definition) {
    this.definition = definition;
    this.unparsed |= definition.unparsed;
  }

  public NotebookLogStreamCellAttributes definition(LogStreamWidgetDefinition definition) {
    this.definition = definition;
    this.unparsed |= definition.unparsed;
    return this;
  }

  /**
   * The Log Stream displays a log flow matching the defined query. Only available on FREE layout
   * dashboards.
   *
   * @return definition
   */
  @JsonProperty(JSON_PROPERTY_DEFINITION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public LogStreamWidgetDefinition getDefinition() {
    return definition;
  }

  public void setDefinition(LogStreamWidgetDefinition definition) {
    this.definition = definition;
  }

  public NotebookLogStreamCellAttributes graphSize(NotebookGraphSize graphSize) {
    this.graphSize = graphSize;
    this.unparsed |= !graphSize.isValid();
    return this;
  }

  /**
   * The size of the graph.
   *
   * @return graphSize
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_GRAPH_SIZE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public NotebookGraphSize getGraphSize() {
    return graphSize;
  }

  public void setGraphSize(NotebookGraphSize graphSize) {
    if (!graphSize.isValid()) {
      this.unparsed = true;
    }
    this.graphSize = graphSize;
  }

  public NotebookLogStreamCellAttributes time(NotebookCellTime time) {
    this.time = JsonNullable.<NotebookCellTime>of(time);
    return this;
  }

  /**
   * Timeframe for the notebook cell. When 'null', the notebook global time is used.
   *
   * @return time
   */
  @jakarta.annotation.Nullable
  @JsonIgnore
  public NotebookCellTime getTime() {
    return time.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_TIME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<NotebookCellTime> getTime_JsonNullable() {
    return time;
  }

  @JsonProperty(JSON_PROPERTY_TIME)
  public void setTime_JsonNullable(JsonNullable<NotebookCellTime> time) {
    this.time = time;
  }

  public void setTime(NotebookCellTime time) {
    this.time = JsonNullable.<NotebookCellTime>of(time);
  }

  /**
   * A container for additional, undeclared properties. This is a holder for any undeclared
   * properties as specified with the 'additionalProperties' keyword in the OAS document.
   */
  private Map<String, Object> additionalProperties;

  /**
   * Set the additional (undeclared) property with the specified name and value. If the property
   * does not already exist, create it otherwise replace it.
   *
   * @param key The arbitrary key to set
   * @param value The associated value
   * @return NotebookLogStreamCellAttributes
   */
  @JsonAnySetter
  public NotebookLogStreamCellAttributes putAdditionalProperty(String key, Object value) {
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

  /** Return true if this NotebookLogStreamCellAttributes object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NotebookLogStreamCellAttributes notebookLogStreamCellAttributes =
        (NotebookLogStreamCellAttributes) o;
    return Objects.equals(this.definition, notebookLogStreamCellAttributes.definition)
        && Objects.equals(this.graphSize, notebookLogStreamCellAttributes.graphSize)
        && Objects.equals(this.time, notebookLogStreamCellAttributes.time)
        && Objects.equals(
            this.additionalProperties, notebookLogStreamCellAttributes.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(definition, graphSize, time, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NotebookLogStreamCellAttributes {\n");
    sb.append("    definition: ").append(toIndentedString(definition)).append("\n");
    sb.append("    graphSize: ").append(toIndentedString(graphSize)).append("\n");
    sb.append("    time: ").append(toIndentedString(time)).append("\n");
    sb.append("    additionalProperties: ")
        .append(toIndentedString(additionalProperties))
        .append("\n");
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
