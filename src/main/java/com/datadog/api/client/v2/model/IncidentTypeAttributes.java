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
   * <p>Incident type's attributes.</p>
 */
@JsonPropertyOrder({
  IncidentTypeAttributes.JSON_PROPERTY_CREATED_AT,
  IncidentTypeAttributes.JSON_PROPERTY_CREATED_BY,
  IncidentTypeAttributes.JSON_PROPERTY_DESCRIPTION,
  IncidentTypeAttributes.JSON_PROPERTY_IS_DEFAULT,
  IncidentTypeAttributes.JSON_PROPERTY_LAST_MODIFIED_BY,
  IncidentTypeAttributes.JSON_PROPERTY_MODIFIED_AT,
  IncidentTypeAttributes.JSON_PROPERTY_NAME,
  IncidentTypeAttributes.JSON_PROPERTY_PREFIX
})
@jakarta.annotation.Generated(value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class IncidentTypeAttributes {
  @JsonIgnore
  public boolean unparsed = false;
  public static final String JSON_PROPERTY_CREATED_AT = "createdAt";
  private OffsetDateTime createdAt;

  public static final String JSON_PROPERTY_CREATED_BY = "createdBy";
  private String createdBy;

  public static final String JSON_PROPERTY_DESCRIPTION = "description";
  private String description;

  public static final String JSON_PROPERTY_IS_DEFAULT = "is_default";
  private Boolean isDefault = false;

  public static final String JSON_PROPERTY_LAST_MODIFIED_BY = "lastModifiedBy";
  private String lastModifiedBy;

  public static final String JSON_PROPERTY_MODIFIED_AT = "modifiedAt";
  private OffsetDateTime modifiedAt;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_PREFIX = "prefix";
  private String prefix;

  public IncidentTypeAttributes() {}

  @JsonCreator
  public IncidentTypeAttributes(
            @JsonProperty(required=true, value=JSON_PROPERTY_NAME)String name) {
        this.name = name;
  }

  /**
   * <p>Timestamp when the incident type was created.</p>
   * @return createdAt
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_CREATED_AT)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public OffsetDateTime getCreatedAt() {
        return createdAt;
      }

  /**
   * <p>A unique identifier that represents the user that created the incident type.</p>
   * @return createdBy
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_CREATED_BY)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public String getCreatedBy() {
        return createdBy;
      }
  public IncidentTypeAttributes description(String description) {
    this.description = description;
    return this;
  }

  /**
   * <p>Text that describes the incident type.</p>
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
  public IncidentTypeAttributes isDefault(Boolean isDefault) {
    this.isDefault = isDefault;
    return this;
  }

  /**
   * <p>If true, this incident type will be used as the default incident type if a type is not specified during the creation of incident resources.</p>
   * @return isDefault
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_IS_DEFAULT)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public Boolean getIsDefault() {
        return isDefault;
      }
  public void setIsDefault(Boolean isDefault) {
    this.isDefault = isDefault;
  }

  /**
   * <p>A unique identifier that represents the user that last modified the incident type.</p>
   * @return lastModifiedBy
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_LAST_MODIFIED_BY)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public String getLastModifiedBy() {
        return lastModifiedBy;
      }

  /**
   * <p>Timestamp when the incident type was last modified.</p>
   * @return modifiedAt
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_MODIFIED_AT)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public OffsetDateTime getModifiedAt() {
        return modifiedAt;
      }
  public IncidentTypeAttributes name(String name) {
    this.name = name;
    return this;
  }

  /**
   * <p>The name of the incident type.</p>
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

  /**
   * <p>The string that will be prepended to the incident title across the Datadog app.</p>
   * @return prefix
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_PREFIX)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public String getPrefix() {
        return prefix;
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
   * @return IncidentTypeAttributes
   */
  @JsonAnySetter
  public IncidentTypeAttributes putAdditionalProperty(String key, Object value) {
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
   * Return true if this IncidentTypeAttributes object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IncidentTypeAttributes incidentTypeAttributes = (IncidentTypeAttributes) o;
    return Objects.equals(this.createdAt, incidentTypeAttributes.createdAt) && Objects.equals(this.createdBy, incidentTypeAttributes.createdBy) && Objects.equals(this.description, incidentTypeAttributes.description) && Objects.equals(this.isDefault, incidentTypeAttributes.isDefault) && Objects.equals(this.lastModifiedBy, incidentTypeAttributes.lastModifiedBy) && Objects.equals(this.modifiedAt, incidentTypeAttributes.modifiedAt) && Objects.equals(this.name, incidentTypeAttributes.name) && Objects.equals(this.prefix, incidentTypeAttributes.prefix) && Objects.equals(this.additionalProperties, incidentTypeAttributes.additionalProperties);
  }


  @Override
  public int hashCode() {
    return Objects.hash(createdAt,createdBy,description,isDefault,lastModifiedBy,modifiedAt,name,prefix, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IncidentTypeAttributes {\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    createdBy: ").append(toIndentedString(createdBy)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    isDefault: ").append(toIndentedString(isDefault)).append("\n");
    sb.append("    lastModifiedBy: ").append(toIndentedString(lastModifiedBy)).append("\n");
    sb.append("    modifiedAt: ").append(toIndentedString(modifiedAt)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    prefix: ").append(toIndentedString(prefix)).append("\n");
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
