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
import java.util.UUID;
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
   * <p>Entity metadata.</p>
 */
@JsonPropertyOrder({
  EntityMeta.JSON_PROPERTY_CREATED_AT,
  EntityMeta.JSON_PROPERTY_INGESTION_SOURCE,
  EntityMeta.JSON_PROPERTY_MODIFIED_AT,
  EntityMeta.JSON_PROPERTY_ORIGIN
})
@jakarta.annotation.Generated(value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class EntityMeta {
  @JsonIgnore
  public boolean unparsed = false;
  public static final String JSON_PROPERTY_CREATED_AT = "createdAt";
  private String createdAt;

  public static final String JSON_PROPERTY_INGESTION_SOURCE = "ingestionSource";
  private String ingestionSource;

  public static final String JSON_PROPERTY_MODIFIED_AT = "modifiedAt";
  private String modifiedAt;

  public static final String JSON_PROPERTY_ORIGIN = "origin";
  private String origin;

  public EntityMeta createdAt(String createdAt) {
    this.createdAt = createdAt;
    return this;
  }

  /**
   * <p>The creation time.</p>
   * @return createdAt
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_CREATED_AT)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public String getCreatedAt() {
        return createdAt;
      }
  public void setCreatedAt(String createdAt) {
    this.createdAt = createdAt;
  }
  public EntityMeta ingestionSource(String ingestionSource) {
    this.ingestionSource = ingestionSource;
    return this;
  }

  /**
   * <p>The ingestion source.</p>
   * @return ingestionSource
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_INGESTION_SOURCE)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public String getIngestionSource() {
        return ingestionSource;
      }
  public void setIngestionSource(String ingestionSource) {
    this.ingestionSource = ingestionSource;
  }
  public EntityMeta modifiedAt(String modifiedAt) {
    this.modifiedAt = modifiedAt;
    return this;
  }

  /**
   * <p>The modification time.</p>
   * @return modifiedAt
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_MODIFIED_AT)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public String getModifiedAt() {
        return modifiedAt;
      }
  public void setModifiedAt(String modifiedAt) {
    this.modifiedAt = modifiedAt;
  }
  public EntityMeta origin(String origin) {
    this.origin = origin;
    return this;
  }

  /**
   * <p>The origin.</p>
   * @return origin
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_ORIGIN)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public String getOrigin() {
        return origin;
      }
  public void setOrigin(String origin) {
    this.origin = origin;
  }

  /**
   * A container for additional, undeclared properties.
   * This is a holder for any undeclared properties as specified with
   * the 'additionalProperties' keyword in the OAS document.
   */
  private Map<String, Object> additionalProperties;

  /**
   * Set the additional (undeclared) property with the specified name and value.
   * If the property does not already exist, create it otherwise replace it.
   *
   * @param key The arbitrary key to set
   * @param value The associated value
   * @return EntityMeta
   */
  @JsonAnySetter
  public EntityMeta putAdditionalProperty(String key, Object value) {
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

  /**
   * Return true if this EntityMeta object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EntityMeta entityMeta = (EntityMeta) o;
    return Objects.equals(this.createdAt, entityMeta.createdAt) && Objects.equals(this.ingestionSource, entityMeta.ingestionSource) && Objects.equals(this.modifiedAt, entityMeta.modifiedAt) && Objects.equals(this.origin, entityMeta.origin) && Objects.equals(this.additionalProperties, entityMeta.additionalProperties);
  }


  @Override
  public int hashCode() {
    return Objects.hash(createdAt,ingestionSource,modifiedAt,origin, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EntityMeta {\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    ingestionSource: ").append(toIndentedString(ingestionSource)).append("\n");
    sb.append("    modifiedAt: ").append(toIndentedString(modifiedAt)).append("\n");
    sb.append("    origin: ").append(toIndentedString(origin)).append("\n");
    sb.append("    additionalProperties: ")
        .append(toIndentedString(additionalProperties))
        .append("\n");
    sb.append('}');
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
