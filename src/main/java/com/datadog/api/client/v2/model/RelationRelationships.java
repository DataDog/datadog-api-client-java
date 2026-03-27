/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v2.model;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/** Relation relationships. */
@JsonPropertyOrder({
  RelationRelationships.JSON_PROPERTY_FROM_ENTITY,
  RelationRelationships.JSON_PROPERTY_TO_ENTITY
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class RelationRelationships {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_FROM_ENTITY = "fromEntity";
  private RelationToEntity fromEntity;

  public static final String JSON_PROPERTY_TO_ENTITY = "toEntity";
  private RelationToEntity toEntity;

  public RelationRelationships fromEntity(RelationToEntity fromEntity) {
    this.fromEntity = fromEntity;
    this.unparsed |= fromEntity.unparsed;
    return this;
  }

  /**
   * Relation to entity.
   *
   * @return fromEntity
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_FROM_ENTITY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public RelationToEntity getFromEntity() {
    return fromEntity;
  }

  public void setFromEntity(RelationToEntity fromEntity) {
    this.fromEntity = fromEntity;
  }

  public RelationRelationships toEntity(RelationToEntity toEntity) {
    this.toEntity = toEntity;
    this.unparsed |= toEntity.unparsed;
    return this;
  }

  /**
   * Relation to entity.
   *
   * @return toEntity
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TO_ENTITY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public RelationToEntity getToEntity() {
    return toEntity;
  }

  public void setToEntity(RelationToEntity toEntity) {
    this.toEntity = toEntity;
  }

  /**
   * A container for additional, undeclared properties. This is a holder for any undeclared
   * properties as specified with the 'additionalProperties' keyword in the OAS document.
   */
  private Map<String, Object> additionalProperties;

  /**
   * Set the additional (undeclared) property with the specified name and value. If the property
   * does not already exist, create it otherwise replace it.
   *
   * @param key The arbitrary key to set
   * @param value The associated value
   * @return RelationRelationships
   */
  @JsonAnySetter
  public RelationRelationships putAdditionalProperty(String key, Object value) {
    if (this.additionalProperties == null) {
      this.additionalProperties = new HashMap<String, Object>();
    }
    this.additionalProperties.put(key, value);
    return this;
  }

  /**
   * Return the additional (undeclared) property.
   *
   * @return The additional properties
   */
  @JsonAnyGetter
  public Map<String, Object> getAdditionalProperties() {
    return additionalProperties;
  }

  /**
   * Return the additional (undeclared) property with the specified name.
   *
   * @param key The arbitrary key to get
   * @return The specific additional property for the given key
   */
  public Object getAdditionalProperty(String key) {
    if (this.additionalProperties == null) {
      return null;
    }
    return this.additionalProperties.get(key);
  }

  /** Return true if this RelationRelationships object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RelationRelationships relationRelationships = (RelationRelationships) o;
    return Objects.equals(this.fromEntity, relationRelationships.fromEntity)
        && Objects.equals(this.toEntity, relationRelationships.toEntity)
        && Objects.equals(this.additionalProperties, relationRelationships.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fromEntity, toEntity, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RelationRelationships {\n");
    sb.append("    fromEntity: ").append(toIndentedString(fromEntity)).append("\n");
    sb.append("    toEntity: ").append(toIndentedString(toEntity)).append("\n");
    sb.append("    additionalProperties: ")
        .append(toIndentedString(additionalProperties))
        .append("\n");
    sb.append('}');
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
