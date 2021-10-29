/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.datadog.api.v1.client.model;

import java.util.Objects;
import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;
import com.datadog.api.v1.client.model.NotebookCellTime;
import com.datadog.api.v1.client.model.NotebookGraphSize;
import com.datadog.api.v1.client.model.NotebookSplitBy;
import com.datadog.api.v1.client.model.ToplistWidgetDefinition;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import com.fasterxml.jackson.annotation.JsonIgnore;
import org.openapitools.jackson.nullable.JsonNullable;
import java.util.NoSuchElementException;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.datadog.api.v1.client.JSON;


/**
 * The attributes of a notebook &#x60;toplist&#x60; cell.
 */
@ApiModel(description = "The attributes of a notebook `toplist` cell.")
@JsonPropertyOrder({
  NotebookToplistCellAttributes.JSON_PROPERTY_DEFINITION,
  NotebookToplistCellAttributes.JSON_PROPERTY_GRAPH_SIZE,
  NotebookToplistCellAttributes.JSON_PROPERTY_SPLIT_BY,
  NotebookToplistCellAttributes.JSON_PROPERTY_TIME
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")

public class NotebookToplistCellAttributes {
  @JsonIgnore
  public boolean unparsed = false;
  public static final String JSON_PROPERTY_DEFINITION = "definition";
  private ToplistWidgetDefinition definition;

  public static final String JSON_PROPERTY_GRAPH_SIZE = "graph_size";
  private NotebookGraphSize graphSize;

  public static final String JSON_PROPERTY_SPLIT_BY = "split_by";
  private NotebookSplitBy splitBy;

  public static final String JSON_PROPERTY_TIME = "time";
  private JsonNullable<NotebookCellTime> time = JsonNullable.<NotebookCellTime>undefined();

  public NotebookToplistCellAttributes() {}

  @JsonCreator
  public NotebookToplistCellAttributes(
            @JsonProperty(required=true, value=JSON_PROPERTY_DEFINITION) ToplistWidgetDefinition definition
            ) {
        this.definition = definition;
        this.unparsed |= definition.unparsed;
  }

  public NotebookToplistCellAttributes definition(ToplistWidgetDefinition definition) {
    this.definition = definition;
    this.unparsed |= definition.unparsed;
    return this;
  }

   /**
   * Get definition
   * @return definition
  **/
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_DEFINITION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public ToplistWidgetDefinition getDefinition() {
    return definition;
  }


  public void setDefinition(ToplistWidgetDefinition definition) {
    this.definition = definition;
  }


  public NotebookToplistCellAttributes graphSize(NotebookGraphSize graphSize) {
    this.graphSize = graphSize;
    this.unparsed |= !graphSize.isValid();
    return this;
  }

   /**
   * Get graphSize
   * @return graphSize
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
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


  public NotebookToplistCellAttributes splitBy(NotebookSplitBy splitBy) {
    this.splitBy = splitBy;
    this.unparsed |= splitBy.unparsed;
    return this;
  }

   /**
   * Get splitBy
   * @return splitBy
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_SPLIT_BY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public NotebookSplitBy getSplitBy() {
    return splitBy;
  }


  public void setSplitBy(NotebookSplitBy splitBy) {
    this.splitBy = splitBy;
  }


  public NotebookToplistCellAttributes time(NotebookCellTime time) {
    this.time = JsonNullable.<NotebookCellTime>of(time);
    return this;
  }

   /**
   * Get time
   * @return time
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
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
   * Return true if this NotebookToplistCellAttributes object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NotebookToplistCellAttributes notebookToplistCellAttributes = (NotebookToplistCellAttributes) o;
    return Objects.equals(this.definition, notebookToplistCellAttributes.definition) &&
        Objects.equals(this.graphSize, notebookToplistCellAttributes.graphSize) &&
        Objects.equals(this.splitBy, notebookToplistCellAttributes.splitBy) &&
        Objects.equals(this.time, notebookToplistCellAttributes.time);
  }

  @Override
  public int hashCode() {
    return Objects.hash(definition, graphSize, splitBy, time);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NotebookToplistCellAttributes {\n");
    sb.append("    definition: ").append(toIndentedString(definition)).append("\n");
    sb.append("    graphSize: ").append(toIndentedString(graphSize)).append("\n");
    sb.append("    splitBy: ").append(toIndentedString(splitBy)).append("\n");
    sb.append("    time: ").append(toIndentedString(time)).append("\n");
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

