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
   * <p>Incident handle attributes for responses</p>
 */
@JsonPropertyOrder({
  IncidentHandleAttributesResponse.JSON_PROPERTY_CREATED_AT,
  IncidentHandleAttributesResponse.JSON_PROPERTY_FIELDS,
  IncidentHandleAttributesResponse.JSON_PROPERTY_MODIFIED_AT,
  IncidentHandleAttributesResponse.JSON_PROPERTY_NAME
})
@jakarta.annotation.Generated(value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class IncidentHandleAttributesResponse {
  @JsonIgnore
  public boolean unparsed = false;
  public static final String JSON_PROPERTY_CREATED_AT = "created_at";
  private OffsetDateTime createdAt;

  public static final String JSON_PROPERTY_FIELDS = "fields";
  private IncidentHandleAttributesFields fields;

  public static final String JSON_PROPERTY_MODIFIED_AT = "modified_at";
  private OffsetDateTime modifiedAt;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public IncidentHandleAttributesResponse() {}

  @JsonCreator
  public IncidentHandleAttributesResponse(
            @JsonProperty(required=true, value=JSON_PROPERTY_CREATED_AT)OffsetDateTime createdAt,
            @JsonProperty(required=true, value=JSON_PROPERTY_FIELDS)IncidentHandleAttributesFields fields,
            @JsonProperty(required=true, value=JSON_PROPERTY_MODIFIED_AT)OffsetDateTime modifiedAt,
            @JsonProperty(required=true, value=JSON_PROPERTY_NAME)String name) {
        this.createdAt = createdAt;
        this.fields = fields;
        this.unparsed |= fields.unparsed;
        this.modifiedAt = modifiedAt;
        this.name = name;
  }
  public IncidentHandleAttributesResponse createdAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
    return this;
  }

  /**
   * <p>Timestamp when the handle was created</p>
   * @return createdAt
  **/
      @JsonProperty(JSON_PROPERTY_CREATED_AT)
      @JsonInclude(
        value = JsonInclude.Include.ALWAYS)
      public OffsetDateTime getCreatedAt() {
        return createdAt;
      }
  public void setCreatedAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
  }
  public IncidentHandleAttributesResponse fields(IncidentHandleAttributesFields fields) {
    this.fields = fields;
    this.unparsed |= fields.unparsed;
    return this;
  }

  /**
   * <p>Dynamic fields associated with the handle</p>
   * @return fields
  **/
      @JsonProperty(JSON_PROPERTY_FIELDS)
      @JsonInclude(
        value = JsonInclude.Include.ALWAYS)
      public IncidentHandleAttributesFields getFields() {
        return fields;
      }
  public void setFields(IncidentHandleAttributesFields fields) {
    this.fields = fields;
  }
  public IncidentHandleAttributesResponse modifiedAt(OffsetDateTime modifiedAt) {
    this.modifiedAt = modifiedAt;
    return this;
  }

  /**
   * <p>Timestamp when the handle was last modified</p>
   * @return modifiedAt
  **/
      @JsonProperty(JSON_PROPERTY_MODIFIED_AT)
      @JsonInclude(
        value = JsonInclude.Include.ALWAYS)
      public OffsetDateTime getModifiedAt() {
        return modifiedAt;
      }
  public void setModifiedAt(OffsetDateTime modifiedAt) {
    this.modifiedAt = modifiedAt;
  }
  public IncidentHandleAttributesResponse name(String name) {
    this.name = name;
    return this;
  }

  /**
   * <p>The handle name</p>
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
   * @return IncidentHandleAttributesResponse
   */
  @JsonAnySetter
  public IncidentHandleAttributesResponse putAdditionalProperty(String key, Object value) {
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
   * Return true if this IncidentHandleAttributesResponse object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IncidentHandleAttributesResponse incidentHandleAttributesResponse = (IncidentHandleAttributesResponse) o;
    return Objects.equals(this.createdAt, incidentHandleAttributesResponse.createdAt) && Objects.equals(this.fields, incidentHandleAttributesResponse.fields) && Objects.equals(this.modifiedAt, incidentHandleAttributesResponse.modifiedAt) && Objects.equals(this.name, incidentHandleAttributesResponse.name) && Objects.equals(this.additionalProperties, incidentHandleAttributesResponse.additionalProperties);
  }


  @Override
  public int hashCode() {
    return Objects.hash(createdAt,fields,modifiedAt,name, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IncidentHandleAttributesResponse {\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    fields: ").append(toIndentedString(fields)).append("\n");
    sb.append("    modifiedAt: ").append(toIndentedString(modifiedAt)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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
