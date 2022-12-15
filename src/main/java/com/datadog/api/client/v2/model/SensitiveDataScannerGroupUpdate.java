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

/** Data related to the update of a group. */
@JsonPropertyOrder({
  SensitiveDataScannerGroupUpdate.JSON_PROPERTY_ATTRIBUTES,
  SensitiveDataScannerGroupUpdate.JSON_PROPERTY_ID,
  SensitiveDataScannerGroupUpdate.JSON_PROPERTY_RELATIONSHIPS,
  SensitiveDataScannerGroupUpdate.JSON_PROPERTY_TYPE
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class SensitiveDataScannerGroupUpdate {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_ATTRIBUTES = "attributes";
  private SensitiveDataScannerGroupAttributes attributes;

  public static final String JSON_PROPERTY_ID = "id";
  private String id;

  public static final String JSON_PROPERTY_RELATIONSHIPS = "relationships";
  private SensitiveDataScannerGroupRelationships relationships;

  public static final String JSON_PROPERTY_TYPE = "type";
  private SensitiveDataScannerGroupType type =
      SensitiveDataScannerGroupType.SENSITIVE_DATA_SCANNER_GROUP;

  public SensitiveDataScannerGroupUpdate attributes(
      SensitiveDataScannerGroupAttributes attributes) {
    this.attributes = attributes;
    this.unparsed |= attributes.unparsed;
    return this;
  }

  /**
   * Attributes of the Sensitive Data Scanner group.
   *
   * @return attributes
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ATTRIBUTES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public SensitiveDataScannerGroupAttributes getAttributes() {
    return attributes;
  }

  public void setAttributes(SensitiveDataScannerGroupAttributes attributes) {
    this.attributes = attributes;
  }

  public SensitiveDataScannerGroupUpdate id(String id) {
    this.id = id;
    return this;
  }

  /**
   * ID of the group.
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

  public SensitiveDataScannerGroupUpdate relationships(
      SensitiveDataScannerGroupRelationships relationships) {
    this.relationships = relationships;
    this.unparsed |= relationships.unparsed;
    return this;
  }

  /**
   * Relationships of the group.
   *
   * @return relationships
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_RELATIONSHIPS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public SensitiveDataScannerGroupRelationships getRelationships() {
    return relationships;
  }

  public void setRelationships(SensitiveDataScannerGroupRelationships relationships) {
    this.relationships = relationships;
  }

  public SensitiveDataScannerGroupUpdate type(SensitiveDataScannerGroupType type) {
    this.type = type;
    this.unparsed |= !type.isValid();
    return this;
  }

  /**
   * Sensitive Data Scanner group type.
   *
   * @return type
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public SensitiveDataScannerGroupType getType() {
    return type;
  }

  public void setType(SensitiveDataScannerGroupType type) {
    if (!type.isValid()) {
      this.unparsed = true;
    }
    this.type = type;
  }

  /** Return true if this SensitiveDataScannerGroupUpdate object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SensitiveDataScannerGroupUpdate sensitiveDataScannerGroupUpdate =
        (SensitiveDataScannerGroupUpdate) o;
    return Objects.equals(this.attributes, sensitiveDataScannerGroupUpdate.attributes)
        && Objects.equals(this.id, sensitiveDataScannerGroupUpdate.id)
        && Objects.equals(this.relationships, sensitiveDataScannerGroupUpdate.relationships)
        && Objects.equals(this.type, sensitiveDataScannerGroupUpdate.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(attributes, id, relationships, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SensitiveDataScannerGroupUpdate {\n");
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
