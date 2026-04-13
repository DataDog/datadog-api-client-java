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

/** Relationships for bulk updating memberships. */
@JsonPropertyOrder({
  OrgGroupMembershipBulkUpdateRelationships.JSON_PROPERTY_SOURCE_ORG_GROUP,
  OrgGroupMembershipBulkUpdateRelationships.JSON_PROPERTY_TARGET_ORG_GROUP
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class OrgGroupMembershipBulkUpdateRelationships {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_SOURCE_ORG_GROUP = "source_org_group";
  private OrgGroupRelationshipToOne sourceOrgGroup;

  public static final String JSON_PROPERTY_TARGET_ORG_GROUP = "target_org_group";
  private OrgGroupRelationshipToOne targetOrgGroup;

  public OrgGroupMembershipBulkUpdateRelationships() {}

  @JsonCreator
  public OrgGroupMembershipBulkUpdateRelationships(
      @JsonProperty(required = true, value = JSON_PROPERTY_SOURCE_ORG_GROUP)
          OrgGroupRelationshipToOne sourceOrgGroup,
      @JsonProperty(required = true, value = JSON_PROPERTY_TARGET_ORG_GROUP)
          OrgGroupRelationshipToOne targetOrgGroup) {
    this.sourceOrgGroup = sourceOrgGroup;
    this.unparsed |= sourceOrgGroup.unparsed;
    this.targetOrgGroup = targetOrgGroup;
    this.unparsed |= targetOrgGroup.unparsed;
  }

  public OrgGroupMembershipBulkUpdateRelationships sourceOrgGroup(
      OrgGroupRelationshipToOne sourceOrgGroup) {
    this.sourceOrgGroup = sourceOrgGroup;
    this.unparsed |= sourceOrgGroup.unparsed;
    return this;
  }

  /**
   * Relationship to a single org group.
   *
   * @return sourceOrgGroup
   */
  @JsonProperty(JSON_PROPERTY_SOURCE_ORG_GROUP)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public OrgGroupRelationshipToOne getSourceOrgGroup() {
    return sourceOrgGroup;
  }

  public void setSourceOrgGroup(OrgGroupRelationshipToOne sourceOrgGroup) {
    this.sourceOrgGroup = sourceOrgGroup;
  }

  public OrgGroupMembershipBulkUpdateRelationships targetOrgGroup(
      OrgGroupRelationshipToOne targetOrgGroup) {
    this.targetOrgGroup = targetOrgGroup;
    this.unparsed |= targetOrgGroup.unparsed;
    return this;
  }

  /**
   * Relationship to a single org group.
   *
   * @return targetOrgGroup
   */
  @JsonProperty(JSON_PROPERTY_TARGET_ORG_GROUP)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public OrgGroupRelationshipToOne getTargetOrgGroup() {
    return targetOrgGroup;
  }

  public void setTargetOrgGroup(OrgGroupRelationshipToOne targetOrgGroup) {
    this.targetOrgGroup = targetOrgGroup;
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
   * @return OrgGroupMembershipBulkUpdateRelationships
   */
  @JsonAnySetter
  public OrgGroupMembershipBulkUpdateRelationships putAdditionalProperty(String key, Object value) {
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

  /** Return true if this OrgGroupMembershipBulkUpdateRelationships object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrgGroupMembershipBulkUpdateRelationships orgGroupMembershipBulkUpdateRelationships =
        (OrgGroupMembershipBulkUpdateRelationships) o;
    return Objects.equals(
            this.sourceOrgGroup, orgGroupMembershipBulkUpdateRelationships.sourceOrgGroup)
        && Objects.equals(
            this.targetOrgGroup, orgGroupMembershipBulkUpdateRelationships.targetOrgGroup)
        && Objects.equals(
            this.additionalProperties,
            orgGroupMembershipBulkUpdateRelationships.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(sourceOrgGroup, targetOrgGroup, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrgGroupMembershipBulkUpdateRelationships {\n");
    sb.append("    sourceOrgGroup: ").append(toIndentedString(sourceOrgGroup)).append("\n");
    sb.append("    targetOrgGroup: ").append(toIndentedString(targetOrgGroup)).append("\n");
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
