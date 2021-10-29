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
import com.datadog.api.v1.client.model.NotebookCellResourceType;
import com.datadog.api.v1.client.model.NotebookCellUpdateRequestAttributes;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.datadog.api.v1.client.JSON;


/**
 * The description of a notebook cell update request.
 */
@ApiModel(description = "The description of a notebook cell update request.")
@JsonPropertyOrder({
  NotebookCellUpdateRequest.JSON_PROPERTY_ATTRIBUTES,
  NotebookCellUpdateRequest.JSON_PROPERTY_ID,
  NotebookCellUpdateRequest.JSON_PROPERTY_TYPE
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")

public class NotebookCellUpdateRequest {
  @JsonIgnore
  public boolean unparsed = false;
  public static final String JSON_PROPERTY_ATTRIBUTES = "attributes";
  private NotebookCellUpdateRequestAttributes attributes;

  public static final String JSON_PROPERTY_ID = "id";
  private String id;

  public static final String JSON_PROPERTY_TYPE = "type";
  private NotebookCellResourceType type = NotebookCellResourceType.NOTEBOOK_CELLS;

  public NotebookCellUpdateRequest() {}

  @JsonCreator
  public NotebookCellUpdateRequest(
            @JsonProperty(required=true, value=JSON_PROPERTY_ATTRIBUTES) NotebookCellUpdateRequestAttributes attributes,
            @JsonProperty(required=true, value=JSON_PROPERTY_ID) String id,
            @JsonProperty(required=true, value=JSON_PROPERTY_TYPE) NotebookCellResourceType type
            ) {
        this.attributes = attributes;
        this.unparsed |= attributes.unparsed;
        this.id = id;
        this.type = type;
        this.unparsed |= !type.isValid();
  }

  public NotebookCellUpdateRequest attributes(NotebookCellUpdateRequestAttributes attributes) {
    this.attributes = attributes;
    this.unparsed |= attributes.unparsed;
    return this;
  }

   /**
   * Get attributes
   * @return attributes
  **/
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_ATTRIBUTES)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public NotebookCellUpdateRequestAttributes getAttributes() {
    return attributes;
  }


  public void setAttributes(NotebookCellUpdateRequestAttributes attributes) {
    this.attributes = attributes;
  }


  public NotebookCellUpdateRequest id(String id) {
    this.id = id;
    return this;
  }

   /**
   * Notebook cell ID.
   * @return id
  **/
  @ApiModelProperty(example = "abcd1234", required = true, value = "Notebook cell ID.")
  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getId() {
    return id;
  }


  public void setId(String id) {
    this.id = id;
  }


  public NotebookCellUpdateRequest type(NotebookCellResourceType type) {
    this.type = type;
    this.unparsed |= !type.isValid();
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public NotebookCellResourceType getType() {
    return type;
  }


  public void setType(NotebookCellResourceType type) {
    if (!type.isValid()) {
        this.unparsed = true;
    }
    this.type = type;
  }


  /**
   * Return true if this NotebookCellUpdateRequest object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NotebookCellUpdateRequest notebookCellUpdateRequest = (NotebookCellUpdateRequest) o;
    return Objects.equals(this.attributes, notebookCellUpdateRequest.attributes) &&
        Objects.equals(this.id, notebookCellUpdateRequest.id) &&
        Objects.equals(this.type, notebookCellUpdateRequest.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(attributes, id, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NotebookCellUpdateRequest {\n");
    sb.append("    attributes: ").append(toIndentedString(attributes)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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

