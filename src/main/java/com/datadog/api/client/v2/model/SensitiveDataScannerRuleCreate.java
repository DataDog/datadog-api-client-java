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
   * <p>Data related to the creation of a rule.</p>
 */
@JsonPropertyOrder({
  SensitiveDataScannerRuleCreate.JSON_PROPERTY_ATTRIBUTES,
  SensitiveDataScannerRuleCreate.JSON_PROPERTY_RELATIONSHIPS,
  SensitiveDataScannerRuleCreate.JSON_PROPERTY_TYPE
})
@jakarta.annotation.Generated(value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class SensitiveDataScannerRuleCreate {
  @JsonIgnore
  public boolean unparsed = false;
  public static final String JSON_PROPERTY_ATTRIBUTES = "attributes";
  private SensitiveDataScannerRuleAttributes attributes;

  public static final String JSON_PROPERTY_RELATIONSHIPS = "relationships";
  private SensitiveDataScannerRuleRelationships relationships;

  public static final String JSON_PROPERTY_TYPE = "type";
  private SensitiveDataScannerRuleType type = SensitiveDataScannerRuleType.SENSITIVE_DATA_SCANNER_RULE;

  public SensitiveDataScannerRuleCreate() {}

  @JsonCreator
  public SensitiveDataScannerRuleCreate(
            @JsonProperty(required=true, value=JSON_PROPERTY_ATTRIBUTES)SensitiveDataScannerRuleAttributes attributes,
            @JsonProperty(required=true, value=JSON_PROPERTY_RELATIONSHIPS)SensitiveDataScannerRuleRelationships relationships,
            @JsonProperty(required=true, value=JSON_PROPERTY_TYPE)SensitiveDataScannerRuleType type) {
        this.attributes = attributes;
        this.unparsed |= attributes.unparsed;
        this.relationships = relationships;
        this.unparsed |= relationships.unparsed;
        this.type = type;
        this.unparsed |= !type.isValid();
  }
  public SensitiveDataScannerRuleCreate attributes(SensitiveDataScannerRuleAttributes attributes) {
    this.attributes = attributes;
    this.unparsed |= attributes.unparsed;
    return this;
  }

  /**
   * <p>Attributes of the Sensitive Data Scanner rule.</p>
   * @return attributes
  **/
      @JsonProperty(JSON_PROPERTY_ATTRIBUTES)
      @JsonInclude(
        value = JsonInclude.Include.ALWAYS)
      public SensitiveDataScannerRuleAttributes getAttributes() {
        return attributes;
      }
  public void setAttributes(SensitiveDataScannerRuleAttributes attributes) {
    this.attributes = attributes;
  }
  public SensitiveDataScannerRuleCreate relationships(SensitiveDataScannerRuleRelationships relationships) {
    this.relationships = relationships;
    this.unparsed |= relationships.unparsed;
    return this;
  }

  /**
   * <p>Relationships of a scanning rule.</p>
   * @return relationships
  **/
      @JsonProperty(JSON_PROPERTY_RELATIONSHIPS)
      @JsonInclude(
        value = JsonInclude.Include.ALWAYS)
      public SensitiveDataScannerRuleRelationships getRelationships() {
        return relationships;
      }
  public void setRelationships(SensitiveDataScannerRuleRelationships relationships) {
    this.relationships = relationships;
  }
  public SensitiveDataScannerRuleCreate type(SensitiveDataScannerRuleType type) {
    this.type = type;
    this.unparsed |= !type.isValid();
    return this;
  }

  /**
   * <p>Sensitive Data Scanner rule type.</p>
   * @return type
  **/
      @JsonProperty(JSON_PROPERTY_TYPE)
      @JsonInclude(
        value = JsonInclude.Include.ALWAYS)
      public SensitiveDataScannerRuleType getType() {
        return type;
      }
  public void setType(SensitiveDataScannerRuleType type) {
    if (!type.isValid()) {
        this.unparsed = true;
    }
    this.type = type;
  }

  /**
   * Return true if this SensitiveDataScannerRuleCreate object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SensitiveDataScannerRuleCreate sensitiveDataScannerRuleCreate = (SensitiveDataScannerRuleCreate) o;
    return Objects.equals(this.attributes, sensitiveDataScannerRuleCreate.attributes) && Objects.equals(this.relationships, sensitiveDataScannerRuleCreate.relationships) && Objects.equals(this.type, sensitiveDataScannerRuleCreate.type);
  }


  @Override
  public int hashCode() {
    return Objects.hash(attributes,relationships,type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SensitiveDataScannerRuleCreate {\n");
    sb.append("    attributes: ").append(toIndentedString(attributes)).append("\n");
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
