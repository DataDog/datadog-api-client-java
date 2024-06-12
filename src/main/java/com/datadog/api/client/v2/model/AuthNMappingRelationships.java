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

/** All relationships associated with AuthN Mapping. */
@JsonPropertyOrder({
  AuthNMappingRelationships.JSON_PROPERTY_ROLE,
  AuthNMappingRelationships.JSON_PROPERTY_SAML_ASSERTION_ATTRIBUTE,
  AuthNMappingRelationships.JSON_PROPERTY_TEAM
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class AuthNMappingRelationships {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_ROLE = "role";
  private RelationshipToRole role;

  public static final String JSON_PROPERTY_SAML_ASSERTION_ATTRIBUTE = "saml_assertion_attribute";
  private RelationshipToSAMLAssertionAttribute samlAssertionAttribute;

  public static final String JSON_PROPERTY_TEAM = "team";
  private RelationshipToTeam team;

  public AuthNMappingRelationships role(RelationshipToRole role) {
    this.role = role;
    this.unparsed |= role.unparsed;
    return this;
  }

  /**
   * Relationship to role.
   *
   * @return role
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ROLE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public RelationshipToRole getRole() {
    return role;
  }

  public void setRole(RelationshipToRole role) {
    this.role = role;
  }

  public AuthNMappingRelationships samlAssertionAttribute(
      RelationshipToSAMLAssertionAttribute samlAssertionAttribute) {
    this.samlAssertionAttribute = samlAssertionAttribute;
    this.unparsed |= samlAssertionAttribute.unparsed;
    return this;
  }

  /**
   * AuthN Mapping relationship to SAML Assertion Attribute.
   *
   * @return samlAssertionAttribute
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SAML_ASSERTION_ATTRIBUTE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public RelationshipToSAMLAssertionAttribute getSamlAssertionAttribute() {
    return samlAssertionAttribute;
  }

  public void setSamlAssertionAttribute(
      RelationshipToSAMLAssertionAttribute samlAssertionAttribute) {
    this.samlAssertionAttribute = samlAssertionAttribute;
  }

  public AuthNMappingRelationships team(RelationshipToTeam team) {
    this.team = team;
    this.unparsed |= team.unparsed;
    return this;
  }

  /**
   * Relationship to team.
   *
   * @return team
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TEAM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public RelationshipToTeam getTeam() {
    return team;
  }

  public void setTeam(RelationshipToTeam team) {
    this.team = team;
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
   * @return AuthNMappingRelationships
   */
  @JsonAnySetter
  public AuthNMappingRelationships putAdditionalProperty(String key, Object value) {
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

  /** Return true if this AuthNMappingRelationships object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AuthNMappingRelationships authNMappingRelationships = (AuthNMappingRelationships) o;
    return Objects.equals(this.role, authNMappingRelationships.role)
        && Objects.equals(
            this.samlAssertionAttribute, authNMappingRelationships.samlAssertionAttribute)
        && Objects.equals(this.team, authNMappingRelationships.team)
        && Objects.equals(
            this.additionalProperties, authNMappingRelationships.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(role, samlAssertionAttribute, team, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AuthNMappingRelationships {\n");
    sb.append("    role: ").append(toIndentedString(role)).append("\n");
    sb.append("    samlAssertionAttribute: ")
        .append(toIndentedString(samlAssertionAttribute))
        .append("\n");
    sb.append("    team: ").append(toIndentedString(team)).append("\n");
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
