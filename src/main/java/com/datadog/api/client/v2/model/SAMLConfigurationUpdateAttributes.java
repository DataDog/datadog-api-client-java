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
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/** Attributes for updating a SAML configuration. */
@JsonPropertyOrder({
  SAMLConfigurationUpdateAttributes.JSON_PROPERTY_IDP_INITIATED,
  SAMLConfigurationUpdateAttributes.JSON_PROPERTY_JIT_DOMAINS
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class SAMLConfigurationUpdateAttributes {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_IDP_INITIATED = "idp_initiated";
  private Boolean idpInitiated;

  public static final String JSON_PROPERTY_JIT_DOMAINS = "jit_domains";
  private List<String> jitDomains = null;

  public SAMLConfigurationUpdateAttributes idpInitiated(Boolean idpInitiated) {
    this.idpInitiated = idpInitiated;
    return this;
  }

  /**
   * Whether identity-provider-initiated login is enabled for the organization.
   *
   * @return idpInitiated
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_IDP_INITIATED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getIdpInitiated() {
    return idpInitiated;
  }

  public void setIdpInitiated(Boolean idpInitiated) {
    this.idpInitiated = idpInitiated;
  }

  public SAMLConfigurationUpdateAttributes jitDomains(List<String> jitDomains) {
    this.jitDomains = jitDomains;
    return this;
  }

  public SAMLConfigurationUpdateAttributes addJitDomainsItem(String jitDomainsItem) {
    if (this.jitDomains == null) {
      this.jitDomains = new ArrayList<>();
    }
    this.jitDomains.add(jitDomainsItem);
    return this;
  }

  /**
   * Email domains for which users are automatically provisioned on first SAML login (just-in-time
   * provisioning). A default role is required to enable just-in-time provisioning.
   *
   * @return jitDomains
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_JIT_DOMAINS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
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
   * @return SAMLConfigurationUpdateAttributes
   */
  @JsonAnySetter
  public SAMLConfigurationUpdateAttributes putAdditionalProperty(String key, Object value) {
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

  /** Return true if this SAMLConfigurationUpdateAttributes object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SAMLConfigurationUpdateAttributes samlConfigurationUpdateAttributes =
        (SAMLConfigurationUpdateAttributes) o;
    return Objects.equals(this.idpInitiated, samlConfigurationUpdateAttributes.idpInitiated)
        && Objects.equals(this.jitDomains, samlConfigurationUpdateAttributes.jitDomains)
        && Objects.equals(
            this.additionalProperties, samlConfigurationUpdateAttributes.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(idpInitiated, jitDomains, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SAMLConfigurationUpdateAttributes {\n");
    sb.append("    idpInitiated: ").append(toIndentedString(idpInitiated)).append("\n");
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
