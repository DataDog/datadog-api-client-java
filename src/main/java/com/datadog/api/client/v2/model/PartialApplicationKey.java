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

/** Partial Datadog application key. */
@JsonPropertyOrder({
  PartialApplicationKey.JSON_PROPERTY_ATTRIBUTES,
  PartialApplicationKey.JSON_PROPERTY_ID,
  PartialApplicationKey.JSON_PROPERTY_RELATIONSHIPS,
  PartialApplicationKey.JSON_PROPERTY_TYPE
})
@javax.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class PartialApplicationKey {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_ATTRIBUTES = "attributes";
  private PartialApplicationKeyAttributes attributes;

  public static final String JSON_PROPERTY_ID = "id";
  private String id;

  public static final String JSON_PROPERTY_RELATIONSHIPS = "relationships";
  private ApplicationKeyRelationships relationships;

  public static final String JSON_PROPERTY_TYPE = "type";
  private ApplicationKeysType type = ApplicationKeysType.APPLICATION_KEYS;

  public PartialApplicationKey attributes(PartialApplicationKeyAttributes attributes) {
    this.attributes = attributes;
    this.unparsed |= attributes.unparsed;
    return this;
  }

  /**
   * Attributes of a partial application key.
   *
   * @return attributes
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ATTRIBUTES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public PartialApplicationKeyAttributes getAttributes() {
    return attributes;
  }

  public void setAttributes(PartialApplicationKeyAttributes attributes) {
    this.attributes = attributes;
  }

  public PartialApplicationKey id(String id) {
    this.id = id;
    return this;
  }

  /**
   * ID of the application key.
   *
   * @return id
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public PartialApplicationKey relationships(ApplicationKeyRelationships relationships) {
    this.relationships = relationships;
    this.unparsed |= relationships.unparsed;
    return this;
  }

  /**
   * Resources related to the application key.
   *
   * @return relationships
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_RELATIONSHIPS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public ApplicationKeyRelationships getRelationships() {
    return relationships;
  }

  public void setRelationships(ApplicationKeyRelationships relationships) {
    this.relationships = relationships;
  }

  public PartialApplicationKey type(ApplicationKeysType type) {
    this.type = type;
    this.unparsed |= !type.isValid();
    return this;
  }

  /**
   * Application Keys resource type.
   *
   * @return type
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public ApplicationKeysType getType() {
    return type;
  }

  public void setType(ApplicationKeysType type) {
    if (!type.isValid()) {
      this.unparsed = true;
    }
    this.type = type;
  }

  /** Return true if this PartialApplicationKey object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PartialApplicationKey partialApplicationKey = (PartialApplicationKey) o;
    return Objects.equals(this.attributes, partialApplicationKey.attributes)
        && Objects.equals(this.id, partialApplicationKey.id)
        && Objects.equals(this.relationships, partialApplicationKey.relationships)
        && Objects.equals(this.type, partialApplicationKey.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(attributes, id, relationships, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PartialApplicationKey {\n");
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
