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

/**
 * Has two properties, <code>enabled</code> (boolean) and <code>domains</code>, which is a list of
 * domains without the @ symbol.
 */
@JsonPropertyOrder({
  OrganizationSettingsSamlAutocreateUsersDomains.JSON_PROPERTY_DOMAINS,
  OrganizationSettingsSamlAutocreateUsersDomains.JSON_PROPERTY_ENABLED
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class OrganizationSettingsSamlAutocreateUsersDomains {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_DOMAINS = "domains";
  private List<String> domains = null;

  public static final String JSON_PROPERTY_ENABLED = "enabled";
  private Boolean enabled;

  public OrganizationSettingsSamlAutocreateUsersDomains domains(List<String> domains) {
    this.domains = domains;
    return this;
  }

  public OrganizationSettingsSamlAutocreateUsersDomains addDomainsItem(String domainsItem) {
    if (this.domains == null) {
      this.domains = new ArrayList<>();
    }
    this.domains.add(domainsItem);
    return this;
  }

  /**
   * List of domains where the SAML automated user creation is enabled.
   *
   * @return domains
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DOMAINS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<String> getDomains() {
    return domains;
  }

  public void setDomains(List<String> domains) {
    this.domains = domains;
  }

  public OrganizationSettingsSamlAutocreateUsersDomains enabled(Boolean enabled) {
    this.enabled = enabled;
    return this;
  }

  /**
   * Whether or not the automated user creation based on SAML domain is enabled.
   *
   * @return enabled
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ENABLED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getEnabled() {
    return enabled;
  }

  public void setEnabled(Boolean enabled) {
    this.enabled = enabled;
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
   * @return OrganizationSettingsSamlAutocreateUsersDomains
   */
  @JsonAnySetter
  public OrganizationSettingsSamlAutocreateUsersDomains putAdditionalProperty(
      String key, Object value) {
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

  /** Return true if this OrganizationSettingsSamlAutocreateUsersDomains object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrganizationSettingsSamlAutocreateUsersDomains organizationSettingsSamlAutocreateUsersDomains =
        (OrganizationSettingsSamlAutocreateUsersDomains) o;
    return Objects.equals(this.domains, organizationSettingsSamlAutocreateUsersDomains.domains)
        && Objects.equals(this.enabled, organizationSettingsSamlAutocreateUsersDomains.enabled)
        && Objects.equals(
            this.additionalProperties,
            organizationSettingsSamlAutocreateUsersDomains.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(domains, enabled, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrganizationSettingsSamlAutocreateUsersDomains {\n");
    sb.append("    domains: ").append(toIndentedString(domains)).append("\n");
    sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
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
