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
import org.openapitools.jackson.nullable.JsonNullable;

/** Attributes of an organization associated with the authenticated user. */
@JsonPropertyOrder({
  GlobalOrgAttributes.JSON_PROPERTY_ORG,
  GlobalOrgAttributes.JSON_PROPERTY_REDIRECT_URL,
  GlobalOrgAttributes.JSON_PROPERTY_SOURCE_REGION,
  GlobalOrgAttributes.JSON_PROPERTY_USER
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class GlobalOrgAttributes {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_ORG = "org";
  private GlobalOrg org;

  public static final String JSON_PROPERTY_REDIRECT_URL = "redirect_url";
  private JsonNullable<String> redirectUrl = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_SOURCE_REGION = "source_region";
  private String sourceRegion;

  public static final String JSON_PROPERTY_USER = "user";
  private GlobalOrgUser user;

  public GlobalOrgAttributes() {}

  @JsonCreator
  public GlobalOrgAttributes(
      @JsonProperty(required = true, value = JSON_PROPERTY_ORG) GlobalOrg org,
      @JsonProperty(required = true, value = JSON_PROPERTY_SOURCE_REGION) String sourceRegion,
      @JsonProperty(required = true, value = JSON_PROPERTY_USER) GlobalOrgUser user) {
    this.org = org;
    this.unparsed |= org.unparsed;
    this.sourceRegion = sourceRegion;
    this.user = user;
    this.unparsed |= user.unparsed;
  }

  public GlobalOrgAttributes org(GlobalOrg org) {
    this.org = org;
    this.unparsed |= org.unparsed;
    return this;
  }

  /**
   * Organization information for a global organization association.
   *
   * @return org
   */
  @JsonProperty(JSON_PROPERTY_ORG)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public GlobalOrg getOrg() {
    return org;
  }

  public void setOrg(GlobalOrg org) {
    this.org = org;
    if (org != null) {
      this.unparsed |= org.unparsed;
    }
  }

  public GlobalOrgAttributes redirectUrl(String redirectUrl) {
    this.redirectUrl = JsonNullable.<String>of(redirectUrl);
    return this;
  }

  /**
   * The login URL used to switch into the organization, if available.
   *
   * @return redirectUrl
   */
  @jakarta.annotation.Nullable
  @JsonIgnore
  public String getRedirectUrl() {
    return redirectUrl.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_REDIRECT_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<String> getRedirectUrl_JsonNullable() {
    return redirectUrl;
  }

  @JsonProperty(JSON_PROPERTY_REDIRECT_URL)
  public void setRedirectUrl_JsonNullable(JsonNullable<String> redirectUrl) {
    this.redirectUrl = redirectUrl;
  }

  public void setRedirectUrl(String redirectUrl) {
    this.redirectUrl = JsonNullable.<String>of(redirectUrl);
  }

  public GlobalOrgAttributes sourceRegion(String sourceRegion) {
    this.sourceRegion = sourceRegion;
    return this;
  }

  /**
   * The source region of the organization.
   *
   * @return sourceRegion
   */
  @JsonProperty(JSON_PROPERTY_SOURCE_REGION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getSourceRegion() {
    return sourceRegion;
  }

  public void setSourceRegion(String sourceRegion) {
    this.sourceRegion = sourceRegion;
  }

  public GlobalOrgAttributes user(GlobalOrgUser user) {
    this.user = user;
    this.unparsed |= user.unparsed;
    return this;
  }

  /**
   * User information for a global organization association.
   *
   * @return user
   */
  @JsonProperty(JSON_PROPERTY_USER)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public GlobalOrgUser getUser() {
    return user;
  }

  public void setUser(GlobalOrgUser user) {
    this.user = user;
    if (user != null) {
      this.unparsed |= user.unparsed;
    }
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
   * @return GlobalOrgAttributes
   */
  @JsonAnySetter
  public GlobalOrgAttributes putAdditionalProperty(String key, Object value) {
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

  /** Return true if this GlobalOrgAttributes object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GlobalOrgAttributes globalOrgAttributes = (GlobalOrgAttributes) o;
    return Objects.equals(this.org, globalOrgAttributes.org)
        && Objects.equals(this.redirectUrl, globalOrgAttributes.redirectUrl)
        && Objects.equals(this.sourceRegion, globalOrgAttributes.sourceRegion)
        && Objects.equals(this.user, globalOrgAttributes.user)
        && Objects.equals(this.additionalProperties, globalOrgAttributes.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(org, redirectUrl, sourceRegion, user, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GlobalOrgAttributes {\n");
    sb.append("    org: ").append(toIndentedString(org)).append("\n");
    sb.append("    redirectUrl: ").append(toIndentedString(redirectUrl)).append("\n");
    sb.append("    sourceRegion: ").append(toIndentedString(sourceRegion)).append("\n");
    sb.append("    user: ").append(toIndentedString(user)).append("\n");
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
