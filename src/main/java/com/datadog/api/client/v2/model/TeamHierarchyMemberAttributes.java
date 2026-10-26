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
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/** Membership attributes relative to the requested team. */
@JsonPropertyOrder({
  TeamHierarchyMemberAttributes.JSON_PROPERTY_DIRECT_ROLE,
  TeamHierarchyMemberAttributes.JSON_PROPERTY_IS_DIRECT,
  TeamHierarchyMemberAttributes.JSON_PROPERTY_PROVISIONED_BY,
  TeamHierarchyMemberAttributes.JSON_PROPERTY_PROVISIONED_BY_ID
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class TeamHierarchyMemberAttributes {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_DIRECT_ROLE = "direct_role";
  private String directRole;

  public static final String JSON_PROPERTY_IS_DIRECT = "is_direct";
  private Boolean isDirect;

  public static final String JSON_PROPERTY_PROVISIONED_BY = "provisioned_by";
  private String provisionedBy;

  public static final String JSON_PROPERTY_PROVISIONED_BY_ID = "provisioned_by_id";
  private String provisionedById;

  public TeamHierarchyMemberAttributes() {}

  @JsonCreator
  public TeamHierarchyMemberAttributes(
      @JsonProperty(required = true, value = JSON_PROPERTY_DIRECT_ROLE) String directRole,
      @JsonProperty(required = true, value = JSON_PROPERTY_IS_DIRECT) Boolean isDirect,
      @JsonProperty(required = true, value = JSON_PROPERTY_PROVISIONED_BY) String provisionedBy,
      @JsonProperty(required = true, value = JSON_PROPERTY_PROVISIONED_BY_ID)
          String provisionedById) {
    this.directRole = directRole;
    if (directRole != null) {}
    this.isDirect = isDirect;
    this.provisionedBy = provisionedBy;
    if (provisionedBy != null) {}
    this.provisionedById = provisionedById;
    if (provisionedById != null) {}
  }

  public TeamHierarchyMemberAttributes directRole(String directRole) {
    this.directRole = directRole;
    if (directRole != null) {}
    return this;
  }

  /**
   * Role on the requested team: admin or member. Null for inherited members.
   *
   * @return directRole
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DIRECT_ROLE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getDirectRole() {
    return directRole;
  }

  public void setDirectRole(String directRole) {
    this.directRole = directRole;
  }

  public TeamHierarchyMemberAttributes isDirect(Boolean isDirect) {
    this.isDirect = isDirect;
    return this;
  }

  /**
   * Whether the user belongs directly to the requested team.
   *
   * @return isDirect
   */
  @JsonProperty(JSON_PROPERTY_IS_DIRECT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Boolean getIsDirect() {
    return isDirect;
  }

  public void setIsDirect(Boolean isDirect) {
    this.isDirect = isDirect;
  }

  public TeamHierarchyMemberAttributes provisionedBy(String provisionedBy) {
    this.provisionedBy = provisionedBy;
    if (provisionedBy != null) {}
    return this;
  }

  /**
   * Membership provisioner. Null for inherited members.
   *
   * @return provisionedBy
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PROVISIONED_BY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getProvisionedBy() {
    return provisionedBy;
  }

  public void setProvisionedBy(String provisionedBy) {
    this.provisionedBy = provisionedBy;
  }

  public TeamHierarchyMemberAttributes provisionedById(String provisionedById) {
    this.provisionedById = provisionedById;
    if (provisionedById != null) {}
    return this;
  }

  /**
   * Identifier supplied by the membership provisioner. Null when unavailable or for inherited
   * members.
   *
   * @return provisionedById
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PROVISIONED_BY_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getProvisionedById() {
    return provisionedById;
  }

  public void setProvisionedById(String provisionedById) {
    this.provisionedById = provisionedById;
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
   * @return TeamHierarchyMemberAttributes
   */
  @JsonAnySetter
  public TeamHierarchyMemberAttributes putAdditionalProperty(String key, Object value) {
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

  /** Return true if this TeamHierarchyMemberAttributes object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TeamHierarchyMemberAttributes teamHierarchyMemberAttributes = (TeamHierarchyMemberAttributes) o;
    return Objects.equals(this.directRole, teamHierarchyMemberAttributes.directRole)
        && Objects.equals(this.isDirect, teamHierarchyMemberAttributes.isDirect)
        && Objects.equals(this.provisionedBy, teamHierarchyMemberAttributes.provisionedBy)
        && Objects.equals(this.provisionedById, teamHierarchyMemberAttributes.provisionedById)
        && Objects.equals(
            this.additionalProperties, teamHierarchyMemberAttributes.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(directRole, isDirect, provisionedBy, provisionedById, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TeamHierarchyMemberAttributes {\n");
    sb.append("    directRole: ").append(toIndentedString(directRole)).append("\n");
    sb.append("    isDirect: ").append(toIndentedString(isDirect)).append("\n");
    sb.append("    provisionedBy: ").append(toIndentedString(provisionedBy)).append("\n");
    sb.append("    provisionedById: ").append(toIndentedString(provisionedById)).append("\n");
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
