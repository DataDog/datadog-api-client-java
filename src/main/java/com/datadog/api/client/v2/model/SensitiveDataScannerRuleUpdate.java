/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v2.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import java.util.Objects;

/** Data related to the update of a rule. */
@JsonPropertyOrder({
  SensitiveDataScannerRuleUpdate.JSON_PROPERTY_ATTRIBUTES,
  SensitiveDataScannerRuleUpdate.JSON_PROPERTY_ID,
  SensitiveDataScannerRuleUpdate.JSON_PROPERTY_RELATIONSHIPS,
  SensitiveDataScannerRuleUpdate.JSON_PROPERTY_TYPE
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class SensitiveDataScannerRuleUpdate {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_ATTRIBUTES = "attributes";
  private SensitiveDataScannerRuleAttributes attributes;

  public static final String JSON_PROPERTY_ID = "id";
  private String id;

  public static final String JSON_PROPERTY_RELATIONSHIPS = "relationships";
  private SensitiveDataScannerRuleRelationships relationships;

  public static final String JSON_PROPERTY_TYPE = "type";
  private SensitiveDataScannerRuleType type =
      SensitiveDataScannerRuleType.SENSITIVE_DATA_SCANNER_RULE;

  public SensitiveDataScannerRuleUpdate attributes(SensitiveDataScannerRuleAttributes attributes) {
    this.attributes = attributes;
    this.unparsed |= attributes.unparsed;
    return this;
  }

  /**
   * Attributes of the Sensitive Data Scanner rule.
   *
   * @return attributes
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ATTRIBUTES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public SensitiveDataScannerRuleAttributes getAttributes() {
    return attributes;
  }

  public void setAttributes(SensitiveDataScannerRuleAttributes attributes) {
    this.attributes = attributes;
  }

  public SensitiveDataScannerRuleUpdate id(String id) {
    this.id = id;
    return this;
  }

  /**
   * ID of the rule.
   *
   * @return id
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public SensitiveDataScannerRuleUpdate relationships(
      SensitiveDataScannerRuleRelationships relationships) {
    this.relationships = relationships;
    this.unparsed |= relationships.unparsed;
    return this;
  }

  /**
   * Relationships of a scanning rule.
   *
   * @return relationships
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_RELATIONSHIPS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public SensitiveDataScannerRuleRelationships getRelationships() {
    return relationships;
  }

  public void setRelationships(SensitiveDataScannerRuleRelationships relationships) {
    this.relationships = relationships;
  }

  public SensitiveDataScannerRuleUpdate type(SensitiveDataScannerRuleType type) {
    this.type = type;
    this.unparsed |= !type.isValid();
    return this;
  }

  /**
   * Sensitive Data Scanner rule type.
   *
   * @return type
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public SensitiveDataScannerRuleType getType() {
    return type;
  }

  public void setType(SensitiveDataScannerRuleType type) {
    if (!type.isValid()) {
      this.unparsed = true;
    }
    this.type = type;
  }

  /** Return true if this SensitiveDataScannerRuleUpdate object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SensitiveDataScannerRuleUpdate sensitiveDataScannerRuleUpdate =
        (SensitiveDataScannerRuleUpdate) o;
    return Objects.equals(this.attributes, sensitiveDataScannerRuleUpdate.attributes)
        && Objects.equals(this.id, sensitiveDataScannerRuleUpdate.id)
        && Objects.equals(this.relationships, sensitiveDataScannerRuleUpdate.relationships)
        && Objects.equals(this.type, sensitiveDataScannerRuleUpdate.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(attributes, id, relationships, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SensitiveDataScannerRuleUpdate {\n");
    sb.append("    attributes: ").append(toIndentedString(attributes)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    relationships: ").append(toIndentedString(relationships)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
