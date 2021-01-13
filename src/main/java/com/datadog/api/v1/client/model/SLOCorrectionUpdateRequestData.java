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
import com.datadog.api.v1.client.model.SLOCorrectionUpdateRequestAttributes;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.datadog.api.v1.client.JSON;


/**
 * The data object associated with the SLO correction to be updated
 */
@ApiModel(description = "The data object associated with the SLO correction to be updated")
@JsonPropertyOrder({
  SLOCorrectionUpdateRequestData.JSON_PROPERTY_ATTRIBUTES,
  SLOCorrectionUpdateRequestData.JSON_PROPERTY_TYPE
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class SLOCorrectionUpdateRequestData {
  public static final String JSON_PROPERTY_ATTRIBUTES = "attributes";
  private SLOCorrectionUpdateRequestAttributes attributes;

  public static final String JSON_PROPERTY_TYPE = "type";
  private String type = "correction";


  public SLOCorrectionUpdateRequestData attributes(SLOCorrectionUpdateRequestAttributes attributes) {
    this.attributes = attributes;
    return this;
  }

   /**
   * Get attributes
   * @return attributes
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_ATTRIBUTES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public SLOCorrectionUpdateRequestAttributes getAttributes() {
    return attributes;
  }


  public void setAttributes(SLOCorrectionUpdateRequestAttributes attributes) {
    this.attributes = attributes;
  }


  public SLOCorrectionUpdateRequestData type(String type) {
    this.type = type;
    return this;
  }

   /**
   * Should always be set to \&quot;correction\&quot;
   * @return type
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Should always be set to \"correction\"")
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getType() {
    return type;
  }


  public void setType(String type) {
    this.type = type;
  }


  /**
   * Return true if this SLOCorrectionUpdateRequest_data object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SLOCorrectionUpdateRequestData slOCorrectionUpdateRequestData = (SLOCorrectionUpdateRequestData) o;
    return Objects.equals(this.attributes, slOCorrectionUpdateRequestData.attributes) &&
        Objects.equals(this.type, slOCorrectionUpdateRequestData.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(attributes, type);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SLOCorrectionUpdateRequestData {\n");
    sb.append("    attributes: ").append(toIndentedString(attributes)).append("\n");
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

