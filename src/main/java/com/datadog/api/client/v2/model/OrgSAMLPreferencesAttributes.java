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
import java.util.UUID;

/** Attributes for updating an organization's SAML preferences. */
@JsonPropertyOrder({
  OrgSAMLPreferencesAttributes.JSON_PROPERTY_DEFAULT_ROLE_UUIDS,
  OrgSAMLPreferencesAttributes.JSON_PROPERTY_JIT_DOMAINS
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class OrgSAMLPreferencesAttributes {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_DEFAULT_ROLE_UUIDS = "default_role_uuids";
  private List<UUID> defaultRoleUuids = new ArrayList<>();

  public static final String JSON_PROPERTY_JIT_DOMAINS = "jit_domains";
  private List<String> jitDomains = new ArrayList<>();

  public OrgSAMLPreferencesAttributes() {}

  @JsonCreator
  public OrgSAMLPreferencesAttributes(
      @JsonProperty(required = true, value = JSON_PROPERTY_DEFAULT_ROLE_UUIDS)
          List<UUID> defaultRoleUuids,
      @JsonProperty(required = true, value = JSON_PROPERTY_JIT_DOMAINS) List<String> jitDomains) {
    this.defaultRoleUuids = defaultRoleUuids;
    this.jitDomains = jitDomains;
  }

  public OrgSAMLPreferencesAttributes defaultRoleUuids(List<UUID> defaultRoleUuids) {
    this.defaultRoleUuids = defaultRoleUuids;
    return this;
  }

  public OrgSAMLPreferencesAttributes addDefaultRoleUuidsItem(UUID defaultRoleUuidsItem) {
    this.defaultRoleUuids.add(defaultRoleUuidsItem);
    return this;
  }

  /**
   * The UUID of the default role assigned to just-in-time provisioned users. Exactly one role UUID
   * must be provided.
   *
   * @return defaultRoleUuids
   */
  @JsonProperty(JSON_PROPERTY_DEFAULT_ROLE_UUIDS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public List<UUID> getDefaultRoleUuids() {
    return defaultRoleUuids;
  }

  public void setDefaultRoleUuids(List<UUID> defaultRoleUuids) {
    this.defaultRoleUuids = defaultRoleUuids;
  }

  public OrgSAMLPreferencesAttributes jitDomains(List<String> jitDomains) {
    this.jitDomains = jitDomains;
    return this;
  }

  public OrgSAMLPreferencesAttributes addJitDomainsItem(String jitDomainsItem) {
    this.jitDomains.add(jitDomainsItem);
    return this;
  }

  /**
   * Email domains for which users are automatically provisioned on first SAML login (just-in-time
   * provisioning).
   *
   * @return jitDomains
   */
  @JsonProperty(JSON_PROPERTY_JIT_DOMAINS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public List<String> getJitDomains() {
    return jitDomains;
  }

  public void setJitDomains(List<String> jitDomains) {
    this.jitDomains = jitDomains;
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
   * @return OrgSAMLPreferencesAttributes
   */
  @JsonAnySetter
  public OrgSAMLPreferencesAttributes putAdditionalProperty(String key, Object value) {
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

  /** Return true if this OrgSAMLPreferencesAttributes object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrgSAMLPreferencesAttributes orgSamlPreferencesAttributes = (OrgSAMLPreferencesAttributes) o;
    return Objects.equals(this.defaultRoleUuids, orgSamlPreferencesAttributes.defaultRoleUuids)
        && Objects.equals(this.jitDomains, orgSamlPreferencesAttributes.jitDomains)
        && Objects.equals(
            this.additionalProperties, orgSamlPreferencesAttributes.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(defaultRoleUuids, jitDomains, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrgSAMLPreferencesAttributes {\n");
    sb.append("    defaultRoleUuids: ").append(toIndentedString(defaultRoleUuids)).append("\n");
    sb.append("    jitDomains: ").append(toIndentedString(jitDomains)).append("\n");
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
