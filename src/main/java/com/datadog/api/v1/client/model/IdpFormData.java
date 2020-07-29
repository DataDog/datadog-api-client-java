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
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.File;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.datadog.api.v1.client.JSON;


/**
 * Object describing the IdP configuration.
 */
@ApiModel(description = "Object describing the IdP configuration.")
@JsonPropertyOrder({
  IdpFormData.JSON_PROPERTY_IDP_FILE
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class IdpFormData {
  public static final String JSON_PROPERTY_IDP_FILE = "idp_file";
  private File idpFile;


  public IdpFormData idpFile(File idpFile) {
    this.idpFile = idpFile;
    return this;
  }

   /**
   * The path to the XML metadata file you wish to upload.
   * @return idpFile
  **/
  @ApiModelProperty(required = true, value = "The path to the XML metadata file you wish to upload.")
  @JsonProperty(JSON_PROPERTY_IDP_FILE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public File getIdpFile() {
    return idpFile;
  }


  public void setIdpFile(File idpFile) {
    this.idpFile = idpFile;
  }


  /**
   * Return true if this IdpFormData object is equal to o.
   */
  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IdpFormData idpFormData = (IdpFormData) o;
    return Objects.equals(this.idpFile, idpFormData.idpFile);
  }

  @Override
  public int hashCode() {
    return Objects.hash(idpFile);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IdpFormData {\n");
    sb.append("    idpFile: ").append(toIndentedString(idpFile)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

