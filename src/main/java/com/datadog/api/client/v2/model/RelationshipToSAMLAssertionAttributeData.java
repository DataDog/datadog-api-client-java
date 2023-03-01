/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v2.model;

import java.io.File;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;
import java.util.HashMap;
import java.util.Map;
import java.util.List;
import java.util.ArrayList;
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
   * <p>Data of AuthN Mapping relationship to SAML Assertion Attribute.</p>
 */
@JsonPropertyOrder({
  RelationshipToSAMLAssertionAttributeData.JSON_PROPERTY_ID,
  RelationshipToSAMLAssertionAttributeData.JSON_PROPERTY_TYPE
})
@jakarta.annotation.Generated(value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class RelationshipToSAMLAssertionAttributeData {
  @JsonIgnore
  public boolean unparsed = false;
  public static final String JSON_PROPERTY_ID = "id";
  private String id;

  public static final String JSON_PROPERTY_TYPE = "type";
  private SAMLAssertionAttributesType type = SAMLAssertionAttributesType.SAML_ASSERTION_ATTRIBUTES;

  public RelationshipToSAMLAssertionAttributeData() {}

  @JsonCreator
  public RelationshipToSAMLAssertionAttributeData(
            @JsonProperty(required=true, value=JSON_PROPERTY_ID)String id,
            @JsonProperty(required=true, value=JSON_PROPERTY_TYPE)SAMLAssertionAttributesType type) {
        this.id = id;
        this.type = type;
        this.unparsed |= !type.isValid();
  }
  public RelationshipToSAMLAssertionAttributeData id(String id) {
    this.id = id;
    return this;
  }

  /**
   * <p>The ID of the SAML assertion attribute.</p>
   * @return id
  **/
      @JsonProperty(JSON_PROPERTY_ID)
      @JsonInclude(
        value = JsonInclude.Include.ALWAYS)
      public String getId() {
        return id;
      }
  public void setId(String id) {
    this.id = id;
  }
  public RelationshipToSAMLAssertionAttributeData type(SAMLAssertionAttributesType type) {
    this.type = type;
    this.unparsed |= !type.isValid();
    return this;
  }

  /**
   * <p>SAML assertion attributes resource type.</p>
   * @return type
  **/
      @JsonProperty(JSON_PROPERTY_TYPE)
      @JsonInclude(
        value = JsonInclude.Include.ALWAYS)
      public SAMLAssertionAttributesType getType() {
        return type;
      }
  public void setType(SAMLAssertionAttributesType type) {
    if (!type.isValid()) {
        this.unparsed = true;
    }
    this.type = type;
  }

  /**
   * Return true if this RelationshipToSAMLAssertionAttributeData object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RelationshipToSAMLAssertionAttributeData relationshipToSamlAssertionAttributeData = (RelationshipToSAMLAssertionAttributeData) o;
    return Objects.equals(this.id, relationshipToSamlAssertionAttributeData.id) && Objects.equals(this.type, relationshipToSamlAssertionAttributeData.type);
  }


  @Override
  public int hashCode() {
    return Objects.hash(id,type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RelationshipToSAMLAssertionAttributeData {\n");
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
