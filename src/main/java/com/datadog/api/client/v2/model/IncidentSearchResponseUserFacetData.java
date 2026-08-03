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
   * <p>Facet data for user attributes of an incident.</p>
 */
@JsonPropertyOrder({
  IncidentSearchResponseUserFacetData.JSON_PROPERTY_COUNT,
  IncidentSearchResponseUserFacetData.JSON_PROPERTY_EMAIL,
  IncidentSearchResponseUserFacetData.JSON_PROPERTY_HANDLE,
  IncidentSearchResponseUserFacetData.JSON_PROPERTY_NAME,
  IncidentSearchResponseUserFacetData.JSON_PROPERTY_UUID
})
@jakarta.annotation.Generated(value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class IncidentSearchResponseUserFacetData {
  @JsonIgnore
  public boolean unparsed = false;
  public static final String JSON_PROPERTY_COUNT = "count";
  private Integer count;

  public static final String JSON_PROPERTY_EMAIL = "email";
  private String email;

  public static final String JSON_PROPERTY_HANDLE = "handle";
  private String handle;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_UUID = "uuid";
  private String uuid;

  public IncidentSearchResponseUserFacetData count(Integer count) {
    this.count = count;
    return this;
  }

  /**
   * <p>Count of the facet value appearing in search results.</p>
   * maximum: 2147483647
   * @return count
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_COUNT)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public Integer getCount() {
        return count;
      }
  public void setCount(Integer count) {
    this.count = count;
  }
  public IncidentSearchResponseUserFacetData email(String email) {
    this.email = email;
    return this;
  }

  /**
   * <p>Email of the user.</p>
   * @return email
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_EMAIL)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public String getEmail() {
        return email;
      }
  public void setEmail(String email) {
    this.email = email;
  }
  public IncidentSearchResponseUserFacetData handle(String handle) {
    this.handle = handle;
    return this;
  }

  /**
   * <p>Handle of the user.</p>
   * @return handle
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_HANDLE)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public String getHandle() {
        return handle;
      }
  public void setHandle(String handle) {
    this.handle = handle;
  }
  public IncidentSearchResponseUserFacetData name(String name) {
    this.name = name;
    return this;
  }

  /**
   * <p>Name of the user.</p>
   * @return name
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_NAME)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public String getName() {
        return name;
      }
  public void setName(String name) {
    this.name = name;
  }
  public IncidentSearchResponseUserFacetData uuid(String uuid) {
    this.uuid = uuid;
    return this;
  }

  /**
   * <p>ID of the user.</p>
   * @return uuid
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_UUID)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public String getUuid() {
        return uuid;
      }
  public void setUuid(String uuid) {
    this.uuid = uuid;
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
   * @return IncidentSearchResponseUserFacetData
   */
  @JsonAnySetter
  public IncidentSearchResponseUserFacetData putAdditionalProperty(String key, Object value) {
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
   * Return true if this IncidentSearchResponseUserFacetData object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IncidentSearchResponseUserFacetData incidentSearchResponseUserFacetData = (IncidentSearchResponseUserFacetData) o;
    return Objects.equals(this.count, incidentSearchResponseUserFacetData.count) && Objects.equals(this.email, incidentSearchResponseUserFacetData.email) && Objects.equals(this.handle, incidentSearchResponseUserFacetData.handle) && Objects.equals(this.name, incidentSearchResponseUserFacetData.name) && Objects.equals(this.uuid, incidentSearchResponseUserFacetData.uuid) && Objects.equals(this.additionalProperties, incidentSearchResponseUserFacetData.additionalProperties);
  }


  @Override
  public int hashCode() {
    return Objects.hash(count,email,handle,name,uuid, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IncidentSearchResponseUserFacetData {\n");
    sb.append("    count: ").append(toIndentedString(count)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    handle: ").append(toIndentedString(handle)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    uuid: ").append(toIndentedString(uuid)).append("\n");
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
