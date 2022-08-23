/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v2.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import java.util.Objects;

/** All relationships associated with AuthN Mapping. */
@JsonPropertyOrder({
  AuthNMappingRelationships.JSON_PROPERTY_ROLE,
  AuthNMappingRelationships.JSON_PROPERTY_SAML_ASSERTION_ATTRIBUTE
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class AuthNMappingRelationships {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_ROLE = "role";
  private RelationshipToRole role;

  public static final String JSON_PROPERTY_SAML_ASSERTION_ATTRIBUTE = "saml_assertion_attribute";
  private RelationshipToSAMLAssertionAttribute samlAssertionAttribute;

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
            this.samlAssertionAttribute, authNMappingRelationships.samlAssertionAttribute);
  }

  @Override
  public int hashCode() {
    return Objects.hash(role, samlAssertionAttribute);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AuthNMappingRelationships {\n");
    sb.append("    role: ").append(toIndentedString(role)).append("\n");
    sb.append("    samlAssertionAttribute: ")
        .append(toIndentedString(samlAssertionAttribute))
        .append("\n");
    sb.append("}");
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
