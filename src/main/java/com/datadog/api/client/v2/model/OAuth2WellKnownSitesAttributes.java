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

/** Attributes containing the list of public OAuth2 sites. */
@JsonPropertyOrder({OAuth2WellKnownSitesAttributes.JSON_PROPERTY_SITES})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class OAuth2WellKnownSitesAttributes {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_SITES = "sites";
  private List<String> sites = new ArrayList<>();

  public OAuth2WellKnownSitesAttributes() {}

  @JsonCreator
  public OAuth2WellKnownSitesAttributes(
      @JsonProperty(required = true, value = JSON_PROPERTY_SITES) List<String> sites) {
    this.sites = sites;
  }

  public OAuth2WellKnownSitesAttributes sites(List<String> sites) {
    this.sites = sites;
    return this;
  }

  public OAuth2WellKnownSitesAttributes addSitesItem(String sitesItem) {
    this.sites.add(sitesItem);
    return this;
  }

  /**
   * Array of public OAuth2 site URLs for the environment.
   *
   * @return sites
   */
  @JsonProperty(JSON_PROPERTY_SITES)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public List<String> getSites() {
    return sites;
  }

  public void setSites(List<String> sites) {
    this.sites = sites;
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
   * @return OAuth2WellKnownSitesAttributes
   */
  @JsonAnySetter
  public OAuth2WellKnownSitesAttributes putAdditionalProperty(String key, Object value) {
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

  /** Return true if this OAuth2WellKnownSitesAttributes object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OAuth2WellKnownSitesAttributes oAuth2WellKnownSitesAttributes =
        (OAuth2WellKnownSitesAttributes) o;
    return Objects.equals(this.sites, oAuth2WellKnownSitesAttributes.sites)
        && Objects.equals(
            this.additionalProperties, oAuth2WellKnownSitesAttributes.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(sites, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OAuth2WellKnownSitesAttributes {\n");
    sb.append("    sites: ").append(toIndentedString(sites)).append("\n");
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
