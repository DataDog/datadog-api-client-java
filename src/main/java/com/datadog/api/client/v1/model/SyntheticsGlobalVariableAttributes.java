/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v1.model;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/** Attributes of the global variable. */
@JsonPropertyOrder({SyntheticsGlobalVariableAttributes.JSON_PROPERTY_RESTRICTED_ROLES})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class SyntheticsGlobalVariableAttributes {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_RESTRICTED_ROLES = "restricted_roles";
  private List<String> restrictedRoles = null;

  public SyntheticsGlobalVariableAttributes restrictedRoles(List<String> restrictedRoles) {
    this.restrictedRoles = restrictedRoles;
    return this;
  }

  public SyntheticsGlobalVariableAttributes addRestrictedRolesItem(String restrictedRolesItem) {
    if (this.restrictedRoles == null) {
      this.restrictedRoles = new ArrayList<>();
    }
    this.restrictedRoles.add(restrictedRolesItem);
    return this;
  }

  /**
   * A list of role identifiers that can be pulled from the Roles API, for restricting read and
   * write access. This field is deprecated. Use the restriction policies API to manage permissions.
   *
   * @return restrictedRoles
   * @deprecated
   */
  @Deprecated
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_RESTRICTED_ROLES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<String> getRestrictedRoles() {
    return restrictedRoles;
  }

  @Deprecated
  public void setRestrictedRoles(List<String> restrictedRoles) {
    this.restrictedRoles = restrictedRoles;
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
   * @return SyntheticsGlobalVariableAttributes
   */
  @JsonAnySetter
  public SyntheticsGlobalVariableAttributes putAdditionalProperty(String key, Object value) {
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

  /** Return true if this SyntheticsGlobalVariableAttributes object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SyntheticsGlobalVariableAttributes syntheticsGlobalVariableAttributes =
        (SyntheticsGlobalVariableAttributes) o;
    return Objects.equals(this.restrictedRoles, syntheticsGlobalVariableAttributes.restrictedRoles)
        && Objects.equals(
            this.additionalProperties, syntheticsGlobalVariableAttributes.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(restrictedRoles, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SyntheticsGlobalVariableAttributes {\n");
    sb.append("    restrictedRoles: ").append(toIndentedString(restrictedRoles)).append("\n");
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
