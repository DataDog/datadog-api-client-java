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

/** Relationships of the managed organizations resource. */
@JsonPropertyOrder({
  ManagedOrgsRelationships.JSON_PROPERTY_CURRENT_ORG,
  ManagedOrgsRelationships.JSON_PROPERTY_MANAGED_ORGS
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class ManagedOrgsRelationships {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_CURRENT_ORG = "current_org";
  private ManagedOrgsRelationshipToOrg currentOrg;

  public static final String JSON_PROPERTY_MANAGED_ORGS = "managed_orgs";
  private ManagedOrgsRelationshipToOrgs managedOrgs;

  public ManagedOrgsRelationships() {}

  @JsonCreator
  public ManagedOrgsRelationships(
      @JsonProperty(required = true, value = JSON_PROPERTY_CURRENT_ORG)
          ManagedOrgsRelationshipToOrg currentOrg,
      @JsonProperty(required = true, value = JSON_PROPERTY_MANAGED_ORGS)
          ManagedOrgsRelationshipToOrgs managedOrgs) {
    this.currentOrg = currentOrg;
    this.unparsed |= currentOrg.unparsed;
    this.managedOrgs = managedOrgs;
    this.unparsed |= managedOrgs.unparsed;
  }

  public ManagedOrgsRelationships currentOrg(ManagedOrgsRelationshipToOrg currentOrg) {
    this.currentOrg = currentOrg;
    this.unparsed |= currentOrg.unparsed;
    return this;
  }

  /**
   * Relationship to the current organization.
   *
   * @return currentOrg
   */
  @JsonProperty(JSON_PROPERTY_CURRENT_ORG)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public ManagedOrgsRelationshipToOrg getCurrentOrg() {
    return currentOrg;
  }

  public void setCurrentOrg(ManagedOrgsRelationshipToOrg currentOrg) {
    this.currentOrg = currentOrg;
  }

  public ManagedOrgsRelationships managedOrgs(ManagedOrgsRelationshipToOrgs managedOrgs) {
    this.managedOrgs = managedOrgs;
    this.unparsed |= managedOrgs.unparsed;
    return this;
  }

  /**
   * Relationship to the managed organizations.
   *
   * @return managedOrgs
   */
  @JsonProperty(JSON_PROPERTY_MANAGED_ORGS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public ManagedOrgsRelationshipToOrgs getManagedOrgs() {
    return managedOrgs;
  }

  public void setManagedOrgs(ManagedOrgsRelationshipToOrgs managedOrgs) {
    this.managedOrgs = managedOrgs;
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
   * @return ManagedOrgsRelationships
   */
  @JsonAnySetter
  public ManagedOrgsRelationships putAdditionalProperty(String key, Object value) {
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

  /** Return true if this ManagedOrgsRelationships object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ManagedOrgsRelationships managedOrgsRelationships = (ManagedOrgsRelationships) o;
    return Objects.equals(this.currentOrg, managedOrgsRelationships.currentOrg)
        && Objects.equals(this.managedOrgs, managedOrgsRelationships.managedOrgs)
        && Objects.equals(this.additionalProperties, managedOrgsRelationships.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(currentOrg, managedOrgs, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ManagedOrgsRelationships {\n");
    sb.append("    currentOrg: ").append(toIndentedString(currentOrg)).append("\n");
    sb.append("    managedOrgs: ").append(toIndentedString(managedOrgs)).append("\n");
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
