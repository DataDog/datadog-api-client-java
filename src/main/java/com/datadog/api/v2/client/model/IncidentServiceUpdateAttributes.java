/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.datadog.api.v2.client.model;

import java.util.Objects;
import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;
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
import com.datadog.api.v2.client.JSON;


/**
 * The incident service&#39;s attributes for an update request.
 */
@ApiModel(description = "The incident service's attributes for an update request.")
@JsonPropertyOrder({
  IncidentServiceUpdateAttributes.JSON_PROPERTY_NAME
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")

public class IncidentServiceUpdateAttributes {
  @JsonIgnore
  public boolean unparsed = false;
  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public IncidentServiceUpdateAttributes() {}

  @JsonCreator
  public IncidentServiceUpdateAttributes(
            @JsonProperty(required=true, value=JSON_PROPERTY_NAME) String name
            ) {
        this.name = name;
  }

  public IncidentServiceUpdateAttributes name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Name of the incident service.
   * @return name
  **/
  @ApiModelProperty(example = "an example service name", required = true, value = "Name of the incident service.")
  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  /**
   * Return true if this IncidentServiceUpdateAttributes object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IncidentServiceUpdateAttributes incidentServiceUpdateAttributes = (IncidentServiceUpdateAttributes) o;
    return Objects.equals(this.name, incidentServiceUpdateAttributes.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IncidentServiceUpdateAttributes {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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

