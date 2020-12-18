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
import com.datadog.api.v2.client.model.APIKeyRelationships;
import com.datadog.api.v2.client.model.APIKeysType;
import com.datadog.api.v2.client.model.PartialAPIKeyAttributes;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.datadog.api.v2.client.JSON;


/**
 * Partial Datadog API key.
 */
@ApiModel(description = "Partial Datadog API key.")
@JsonPropertyOrder({
  PartialAPIKey.JSON_PROPERTY_ATTRIBUTES,
  PartialAPIKey.JSON_PROPERTY_ID,
  PartialAPIKey.JSON_PROPERTY_RELATIONSHIPS,
  PartialAPIKey.JSON_PROPERTY_TYPE
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class PartialAPIKey {
  public static final String JSON_PROPERTY_ATTRIBUTES = "attributes";
  private PartialAPIKeyAttributes attributes;

  public static final String JSON_PROPERTY_ID = "id";
  private String id;

  public static final String JSON_PROPERTY_RELATIONSHIPS = "relationships";
  private APIKeyRelationships relationships;

  public static final String JSON_PROPERTY_TYPE = "type";
  private APIKeysType type = APIKeysType.API_KEYS;


  public PartialAPIKey attributes(PartialAPIKeyAttributes attributes) {
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

  public PartialAPIKeyAttributes getAttributes() {
    return attributes;
  }


  public void setAttributes(PartialAPIKeyAttributes attributes) {
    this.attributes = attributes;
  }


  public PartialAPIKey id(String id) {
    this.id = id;
    return this;
  }

   /**
   * ID of the API key.
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "ID of the API key.")
  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getId() {
    return id;
  }


  public void setId(String id) {
    this.id = id;
  }


  public PartialAPIKey relationships(APIKeyRelationships relationships) {
    this.relationships = relationships;
    return this;
  }

   /**
   * Get relationships
   * @return relationships
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_RELATIONSHIPS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public APIKeyRelationships getRelationships() {
    return relationships;
  }


  public void setRelationships(APIKeyRelationships relationships) {
    this.relationships = relationships;
  }


  public PartialAPIKey type(APIKeysType type) {
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public APIKeysType getType() {
    return type;
  }


  public void setType(APIKeysType type) {
    this.type = type;
  }


  /**
   * Return true if this PartialAPIKey object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PartialAPIKey partialAPIKey = (PartialAPIKey) o;
    return Objects.equals(this.attributes, partialAPIKey.attributes) &&
        Objects.equals(this.id, partialAPIKey.id) &&
        Objects.equals(this.relationships, partialAPIKey.relationships) &&
        Objects.equals(this.type, partialAPIKey.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(attributes, id, relationships, type);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PartialAPIKey {\n");
    sb.append("    attributes: ").append(toIndentedString(attributes)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    relationships: ").append(toIndentedString(relationships)).append("\n");
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

