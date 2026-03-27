/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v2.model;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/** Attributes for updating an org connection. */
@JsonPropertyOrder({OrgConnectionUpdateAttributes.JSON_PROPERTY_CONNECTION_TYPES})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class OrgConnectionUpdateAttributes {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_CONNECTION_TYPES = "connection_types";
  private List<OrgConnectionTypeEnum> connectionTypes = new ArrayList<>();

  public OrgConnectionUpdateAttributes() {}

  @JsonCreator
  public OrgConnectionUpdateAttributes(
      @JsonProperty(required = true, value = JSON_PROPERTY_CONNECTION_TYPES)
          List<OrgConnectionTypeEnum> connectionTypes) {
    this.connectionTypes = connectionTypes;
  }

  public OrgConnectionUpdateAttributes connectionTypes(
      List<OrgConnectionTypeEnum> connectionTypes) {
    this.connectionTypes = connectionTypes;
    return this;
  }

  public OrgConnectionUpdateAttributes addConnectionTypesItem(
      OrgConnectionTypeEnum connectionTypesItem) {
    this.connectionTypes.add(connectionTypesItem);
    this.unparsed |= !connectionTypesItem.isValid();
    return this;
  }

  /**
   * Updated list of connection types.
   *
   * @return connectionTypes
   */
  @JsonProperty(JSON_PROPERTY_CONNECTION_TYPES)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public List<OrgConnectionTypeEnum> getConnectionTypes() {
    return connectionTypes;
  }

  public void setConnectionTypes(List<OrgConnectionTypeEnum> connectionTypes) {
    this.connectionTypes = connectionTypes;
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
   * @return OrgConnectionUpdateAttributes
   */
  @JsonAnySetter
  public OrgConnectionUpdateAttributes putAdditionalProperty(String key, Object value) {
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

  /** Return true if this OrgConnectionUpdateAttributes object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrgConnectionUpdateAttributes orgConnectionUpdateAttributes = (OrgConnectionUpdateAttributes) o;
    return Objects.equals(this.connectionTypes, orgConnectionUpdateAttributes.connectionTypes)
        && Objects.equals(
            this.additionalProperties, orgConnectionUpdateAttributes.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(connectionTypes, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrgConnectionUpdateAttributes {\n");
    sb.append("    connectionTypes: ").append(toIndentedString(connectionTypes)).append("\n");
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
