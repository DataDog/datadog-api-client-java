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

/** Attributes for bulk updating org group memberships. */
@JsonPropertyOrder({OrgGroupMembershipBulkUpdateAttributes.JSON_PROPERTY_ORGS})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class OrgGroupMembershipBulkUpdateAttributes {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_ORGS = "orgs";
  private List<GlobalOrgIdentifier> orgs = new ArrayList<>();

  public OrgGroupMembershipBulkUpdateAttributes() {}

  @JsonCreator
  public OrgGroupMembershipBulkUpdateAttributes(
      @JsonProperty(required = true, value = JSON_PROPERTY_ORGS) List<GlobalOrgIdentifier> orgs) {
    this.orgs = orgs;
  }

  public OrgGroupMembershipBulkUpdateAttributes orgs(List<GlobalOrgIdentifier> orgs) {
    this.orgs = orgs;
    for (GlobalOrgIdentifier item : orgs) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }

  public OrgGroupMembershipBulkUpdateAttributes addOrgsItem(GlobalOrgIdentifier orgsItem) {
    this.orgs.add(orgsItem);
    this.unparsed |= orgsItem.unparsed;
    return this;
  }

  /**
   * List of organizations to move. Maximum 100 per request.
   *
   * @return orgs
   */
  @JsonProperty(JSON_PROPERTY_ORGS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public List<GlobalOrgIdentifier> getOrgs() {
    return orgs;
  }

  public void setOrgs(List<GlobalOrgIdentifier> orgs) {
    this.orgs = orgs;
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
   * @return OrgGroupMembershipBulkUpdateAttributes
   */
  @JsonAnySetter
  public OrgGroupMembershipBulkUpdateAttributes putAdditionalProperty(String key, Object value) {
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

  /** Return true if this OrgGroupMembershipBulkUpdateAttributes object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrgGroupMembershipBulkUpdateAttributes orgGroupMembershipBulkUpdateAttributes =
        (OrgGroupMembershipBulkUpdateAttributes) o;
    return Objects.equals(this.orgs, orgGroupMembershipBulkUpdateAttributes.orgs)
        && Objects.equals(
            this.additionalProperties, orgGroupMembershipBulkUpdateAttributes.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(orgs, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrgGroupMembershipBulkUpdateAttributes {\n");
    sb.append("    orgs: ").append(toIndentedString(orgs)).append("\n");
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
