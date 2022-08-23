/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v1.model;

import java.io.File;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;
import java.util.HashMap;
import java.util.Map;
import java.util.List;
import java.util.ArrayList;
import java.time.OffsetDateTime;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import org.openapitools.jackson.nullable.JsonNullable;

import com.datadog.api.client.JsonTimeSerializer;


/**
   * <p>Has two properties, <code>enabled</code> (boolean) and <code>domains</code>, which is a list of domains without the @ symbol.</p>
 */
@JsonPropertyOrder({
  OrganizationSettingsSamlAutocreateUsersDomains.JSON_PROPERTY_DOMAINS,
  OrganizationSettingsSamlAutocreateUsersDomains.JSON_PROPERTY_ENABLED
})
@jakarta.annotation.Generated(value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class OrganizationSettingsSamlAutocreateUsersDomains {
  @JsonIgnore
  public boolean unparsed = false;
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
   * <p>List of domains where the SAML automated user creation is enabled.</p>
   * @return domains
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_DOMAINS)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
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
   * <p>Whether or not the automated user creation based on SAML domain is enabled.</p>
   * @return enabled
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_ENABLED)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public Boolean getEnabled() {
        return enabled;
      }
  public void setEnabled(Boolean enabled) {
    this.enabled = enabled;
  }

  /**
   * Return true if this OrganizationSettingsSamlAutocreateUsersDomains object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrganizationSettingsSamlAutocreateUsersDomains organizationSettingsSamlAutocreateUsersDomains = (OrganizationSettingsSamlAutocreateUsersDomains) o;
    return Objects.equals(this.domains, organizationSettingsSamlAutocreateUsersDomains.domains) && Objects.equals(this.enabled, organizationSettingsSamlAutocreateUsersDomains.enabled);
  }


  @Override
  public int hashCode() {
    return Objects.hash(domains,enabled);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrganizationSettingsSamlAutocreateUsersDomains {\n");
    sb.append("    domains: ").append(toIndentedString(domains)).append("\n");
    sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
