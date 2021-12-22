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
import com.datadog.api.v1.client.model.NotebookResourceType;
import com.datadog.api.v1.client.model.NotebookResponseDataAttributes;
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
 * The data for a notebook.
 */
@ApiModel(description = "The data for a notebook.")
@JsonPropertyOrder({
  NotebookResponseData.JSON_PROPERTY_ATTRIBUTES,
  NotebookResponseData.JSON_PROPERTY_ID,
  NotebookResponseData.JSON_PROPERTY_TYPE
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")

public class NotebookResponseData {
  @JsonIgnore
  public boolean unparsed = false;
  public static final String JSON_PROPERTY_ATTRIBUTES = "attributes";
  private NotebookResponseDataAttributes attributes;

  public static final String JSON_PROPERTY_ID = "id";
  private Long id;

  public static final String JSON_PROPERTY_TYPE = "type";
  private NotebookResourceType type = NotebookResourceType.NOTEBOOKS;

  public NotebookResponseData() {}

  @JsonCreator
  public NotebookResponseData(
            @JsonProperty(required=true, value=JSON_PROPERTY_ATTRIBUTES) NotebookResponseDataAttributes attributes,
            @JsonProperty(required=true, value=JSON_PROPERTY_ID) Long id,
            @JsonProperty(required=true, value=JSON_PROPERTY_TYPE) NotebookResourceType type
            ) {
        this.attributes = attributes;
        this.unparsed |= attributes.unparsed;
        this.id = id;
        this.type = type;
        this.unparsed |= !type.isValid();
  }

  public NotebookResponseData attributes(NotebookResponseDataAttributes attributes) {
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

  public NotebookResponseDataAttributes getAttributes() {
    return attributes;
  }


  public void setAttributes(NotebookResponseDataAttributes attributes) {
    this.attributes = attributes;
  }


   /**
   * Unique notebook ID, assigned when you create the notebook.
   * @return id
  **/
  @ApiModelProperty(example = "123456", required = true, value = "Unique notebook ID, assigned when you create the notebook.")
  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Long getId() {
    return id;
  }




  public NotebookResponseData type(NotebookResourceType type) {
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

  public NotebookResourceType getType() {
    return type;
  }


  public void setType(NotebookResourceType type) {
    if (!type.isValid()) {
        this.unparsed = true;
    }
    this.type = type;
  }


  /**
   * Return true if this NotebookResponseData object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NotebookResponseData notebookResponseData = (NotebookResponseData) o;
    return Objects.equals(this.attributes, notebookResponseData.attributes) &&
        Objects.equals(this.id, notebookResponseData.id) &&
        Objects.equals(this.type, notebookResponseData.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(attributes, id, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NotebookResponseData {\n");
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

