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

 */
@JsonPropertyOrder({
  PlaylistDataAttributes.JSON_PROPERTY_CREATED_AT,
  PlaylistDataAttributes.JSON_PROPERTY_CREATED_BY,
  PlaylistDataAttributes.JSON_PROPERTY_DESCRIPTION,
  PlaylistDataAttributes.JSON_PROPERTY_NAME,
  PlaylistDataAttributes.JSON_PROPERTY_SESSION_COUNT,
  PlaylistDataAttributes.JSON_PROPERTY_UPDATED_AT
})
@jakarta.annotation.Generated(value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class PlaylistDataAttributes {
  @JsonIgnore
  public boolean unparsed = false;
  public static final String JSON_PROPERTY_CREATED_AT = "created_at";
  private OffsetDateTime createdAt;

  public static final String JSON_PROPERTY_CREATED_BY = "created_by";
  private PlaylistDataAttributesCreatedBy createdBy;

  public static final String JSON_PROPERTY_DESCRIPTION = "description";
  private String description;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_SESSION_COUNT = "session_count";
  private Long sessionCount;

  public static final String JSON_PROPERTY_UPDATED_AT = "updated_at";
  private OffsetDateTime updatedAt;

  public PlaylistDataAttributes() {}

  @JsonCreator
  public PlaylistDataAttributes(
            @JsonProperty(required=true, value=JSON_PROPERTY_NAME)String name) {
        this.name = name;
  }
  public PlaylistDataAttributes createdAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
    return this;
  }

  /**
   * <p>GetcreatedAt</p>
   * @return createdAt
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_CREATED_AT)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public OffsetDateTime getCreatedAt() {
        return createdAt;
      }
  public void setCreatedAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
  }
  public PlaylistDataAttributes createdBy(PlaylistDataAttributesCreatedBy createdBy) {
    this.createdBy = createdBy;
    this.unparsed |= createdBy.unparsed;
    return this;
  }

  /**
   * <p>GetcreatedBy</p>
   * @return createdBy
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_CREATED_BY)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public PlaylistDataAttributesCreatedBy getCreatedBy() {
        return createdBy;
      }
  public void setCreatedBy(PlaylistDataAttributesCreatedBy createdBy) {
    this.createdBy = createdBy;
  }
  public PlaylistDataAttributes description(String description) {
    this.description = description;
    return this;
  }

  /**
   * <p>Getdescription</p>
   * @return description
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_DESCRIPTION)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public String getDescription() {
        return description;
      }
  public void setDescription(String description) {
    this.description = description;
  }
  public PlaylistDataAttributes name(String name) {
    this.name = name;
    return this;
  }

  /**
   * <p>Getname</p>
   * @return name
  **/
      @JsonProperty(JSON_PROPERTY_NAME)
      @JsonInclude(
        value = JsonInclude.Include.ALWAYS)
      public String getName() {
        return name;
      }
  public void setName(String name) {
    this.name = name;
  }
  public PlaylistDataAttributes sessionCount(Long sessionCount) {
    this.sessionCount = sessionCount;
    return this;
  }

  /**
   * <p>GetsessionCount</p>
   * @return sessionCount
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_SESSION_COUNT)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public Long getSessionCount() {
        return sessionCount;
      }
  public void setSessionCount(Long sessionCount) {
    this.sessionCount = sessionCount;
  }
  public PlaylistDataAttributes updatedAt(OffsetDateTime updatedAt) {
    this.updatedAt = updatedAt;
    return this;
  }

  /**
   * <p>GetupdatedAt</p>
   * @return updatedAt
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_UPDATED_AT)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public OffsetDateTime getUpdatedAt() {
        return updatedAt;
      }
  public void setUpdatedAt(OffsetDateTime updatedAt) {
    this.updatedAt = updatedAt;
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
   * @return PlaylistDataAttributes
   */
  @JsonAnySetter
  public PlaylistDataAttributes putAdditionalProperty(String key, Object value) {
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
   * Return true if this PlaylistDataAttributes object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PlaylistDataAttributes playlistDataAttributes = (PlaylistDataAttributes) o;
    return Objects.equals(this.createdAt, playlistDataAttributes.createdAt) && Objects.equals(this.createdBy, playlistDataAttributes.createdBy) && Objects.equals(this.description, playlistDataAttributes.description) && Objects.equals(this.name, playlistDataAttributes.name) && Objects.equals(this.sessionCount, playlistDataAttributes.sessionCount) && Objects.equals(this.updatedAt, playlistDataAttributes.updatedAt) && Objects.equals(this.additionalProperties, playlistDataAttributes.additionalProperties);
  }


  @Override
  public int hashCode() {
    return Objects.hash(createdAt,createdBy,description,name,sessionCount,updatedAt, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PlaylistDataAttributes {\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    createdBy: ").append(toIndentedString(createdBy)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    sessionCount: ").append(toIndentedString(sessionCount)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
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
