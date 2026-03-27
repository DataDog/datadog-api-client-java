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
   * <p>Service owner's Microsoft Teams.</p>
 */
@JsonPropertyOrder({
  ServiceDefinitionV2MSTeams.JSON_PROPERTY_CONTACT,
  ServiceDefinitionV2MSTeams.JSON_PROPERTY_NAME,
  ServiceDefinitionV2MSTeams.JSON_PROPERTY_TYPE
})
@jakarta.annotation.Generated(value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class ServiceDefinitionV2MSTeams {
  @JsonIgnore
  public boolean unparsed = false;
  public static final String JSON_PROPERTY_CONTACT = "contact";
  private String contact;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_TYPE = "type";
  private ServiceDefinitionV2MSTeamsType type;

  public ServiceDefinitionV2MSTeams() {}

  @JsonCreator
  public ServiceDefinitionV2MSTeams(
            @JsonProperty(required=true, value=JSON_PROPERTY_CONTACT)String contact,
            @JsonProperty(required=true, value=JSON_PROPERTY_TYPE)ServiceDefinitionV2MSTeamsType type) {
        this.contact = contact;
        this.type = type;
        this.unparsed |= !type.isValid();
  }
  public ServiceDefinitionV2MSTeams contact(String contact) {
    this.contact = contact;
    return this;
  }

  /**
   * <p>Contact value.</p>
   * @return contact
  **/
      @JsonProperty(JSON_PROPERTY_CONTACT)
      @JsonInclude(
        value = JsonInclude.Include.ALWAYS)
      public String getContact() {
        return contact;
      }
  public void setContact(String contact) {
    this.contact = contact;
  }
  public ServiceDefinitionV2MSTeams name(String name) {
    this.name = name;
    return this;
  }

  /**
   * <p>Contact Microsoft Teams.</p>
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
  public ServiceDefinitionV2MSTeams type(ServiceDefinitionV2MSTeamsType type) {
    this.type = type;
    this.unparsed |= !type.isValid();
    return this;
  }

  /**
   * <p>Contact type.</p>
   * @return type
  **/
      @JsonProperty(JSON_PROPERTY_TYPE)
      @JsonInclude(
        value = JsonInclude.Include.ALWAYS)
      public ServiceDefinitionV2MSTeamsType getType() {
        return type;
      }
  public void setType(ServiceDefinitionV2MSTeamsType type) {
    if (!type.isValid()) {
        this.unparsed = true;
    }
    this.type = type;
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
   * @return ServiceDefinitionV2MSTeams
   */
  @JsonAnySetter
  public ServiceDefinitionV2MSTeams putAdditionalProperty(String key, Object value) {
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
   * Return true if this ServiceDefinitionV2MSTeams object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ServiceDefinitionV2MSTeams serviceDefinitionV2MsTeams = (ServiceDefinitionV2MSTeams) o;
    return Objects.equals(this.contact, serviceDefinitionV2MsTeams.contact) && Objects.equals(this.name, serviceDefinitionV2MsTeams.name) && Objects.equals(this.type, serviceDefinitionV2MsTeams.type) && Objects.equals(this.additionalProperties, serviceDefinitionV2MsTeams.additionalProperties);
  }


  @Override
  public int hashCode() {
    return Objects.hash(contact,name,type, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ServiceDefinitionV2MSTeams {\n");
    sb.append("    contact: ").append(toIndentedString(contact)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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
