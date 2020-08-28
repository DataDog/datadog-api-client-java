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
import com.datadog.api.v1.client.model.SyntheticsGlobalVariableValue;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.datadog.api.v1.client.JSON;


/**
 * Synthetics global variable.
 */
@ApiModel(description = "Synthetics global variable.")
@JsonPropertyOrder({
  SyntheticsGlobalVariable.JSON_PROPERTY_DESCRIPTION,
  SyntheticsGlobalVariable.JSON_PROPERTY_ID,
  SyntheticsGlobalVariable.JSON_PROPERTY_NAME,
  SyntheticsGlobalVariable.JSON_PROPERTY_TAGS,
  SyntheticsGlobalVariable.JSON_PROPERTY_VALUE
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class SyntheticsGlobalVariable {
  public static final String JSON_PROPERTY_DESCRIPTION = "description";
  private String description;

  public static final String JSON_PROPERTY_ID = "id";
  private String id;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_TAGS = "tags";
  private List<String> tags = new ArrayList<>();

  public static final String JSON_PROPERTY_VALUE = "value";
  private SyntheticsGlobalVariableValue value;


  public SyntheticsGlobalVariable description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Description of the global variable.
   * @return description
  **/
  @ApiModelProperty(required = true, value = "Description of the global variable.")
  @JsonProperty(JSON_PROPERTY_DESCRIPTION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    this.description = description;
  }


   /**
   * Unique identifier of the global variable.
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Unique identifier of the global variable.")
  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getId() {
    return id;
  }




  public SyntheticsGlobalVariable name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Name of the global variable.
   * @return name
  **/
  @ApiModelProperty(required = true, value = "Name of the global variable.")
  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public SyntheticsGlobalVariable tags(List<String> tags) {
    this.tags = tags;
    return this;
  }

  public SyntheticsGlobalVariable addTagsItem(String tagsItem) {
    this.tags.add(tagsItem);
    return this;
  }

   /**
   * Tags of the global variable.
   * @return tags
  **/
  @ApiModelProperty(required = true, value = "Tags of the global variable.")
  @JsonProperty(JSON_PROPERTY_TAGS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public List<String> getTags() {
    return tags;
  }


  public void setTags(List<String> tags) {
    this.tags = tags;
  }


  public SyntheticsGlobalVariable value(SyntheticsGlobalVariableValue value) {
    this.value = value;
    return this;
  }

   /**
   * Get value
   * @return value
  **/
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_VALUE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public SyntheticsGlobalVariableValue getValue() {
    return value;
  }


  public void setValue(SyntheticsGlobalVariableValue value) {
    this.value = value;
  }


  /**
   * Return true if this SyntheticsGlobalVariable object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SyntheticsGlobalVariable syntheticsGlobalVariable = (SyntheticsGlobalVariable) o;
    return Objects.equals(this.description, syntheticsGlobalVariable.description) &&
        Objects.equals(this.id, syntheticsGlobalVariable.id) &&
        Objects.equals(this.name, syntheticsGlobalVariable.name) &&
        Objects.equals(this.tags, syntheticsGlobalVariable.tags) &&
        Objects.equals(this.value, syntheticsGlobalVariable.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, id, name, tags, value);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SyntheticsGlobalVariable {\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
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

