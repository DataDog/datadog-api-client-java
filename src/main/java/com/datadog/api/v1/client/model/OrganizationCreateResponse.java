/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.v1.client.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import java.util.Objects;

/** Response object for an organization creation. */
@JsonPropertyOrder({
  OrganizationCreateResponse.JSON_PROPERTY_API_KEY,
  OrganizationCreateResponse.JSON_PROPERTY_APPLICATION_KEY,
  OrganizationCreateResponse.JSON_PROPERTY_ORG,
  OrganizationCreateResponse.JSON_PROPERTY_USER
})
@javax.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class OrganizationCreateResponse {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_API_KEY = "api_key";
  private ApiKey apiKey;

  public static final String JSON_PROPERTY_APPLICATION_KEY = "application_key";
  private ApplicationKey applicationKey;

  public static final String JSON_PROPERTY_ORG = "org";
  private Organization org;

  public static final String JSON_PROPERTY_USER = "user";
  private User user;

  public OrganizationCreateResponse apiKey(ApiKey apiKey) {
    this.apiKey = apiKey;
    this.unparsed |= apiKey.unparsed;
    return this;
  }

  /**
   * Datadog API key.
   *
   * @return apiKey
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_API_KEY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public ApiKey getApiKey() {
    return apiKey;
  }

  public void setApiKey(ApiKey apiKey) {
    this.apiKey = apiKey;
  }

  public OrganizationCreateResponse applicationKey(ApplicationKey applicationKey) {
    this.applicationKey = applicationKey;
    this.unparsed |= applicationKey.unparsed;
    return this;
  }

  /**
   * An application key with its associated metadata.
   *
   * @return applicationKey
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_APPLICATION_KEY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public ApplicationKey getApplicationKey() {
    return applicationKey;
  }

  public void setApplicationKey(ApplicationKey applicationKey) {
    this.applicationKey = applicationKey;
  }

  public OrganizationCreateResponse org(Organization org) {
    this.org = org;
    this.unparsed |= org.unparsed;
    return this;
  }

  /**
   * Create, edit, and manage organizations.
   *
   * @return org
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ORG)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Organization getOrg() {
    return org;
  }

  public void setOrg(Organization org) {
    this.org = org;
  }

  public OrganizationCreateResponse user(User user) {
    this.user = user;
    this.unparsed |= user.unparsed;
    return this;
  }

  /**
   * Create, edit, and disable users.
   *
   * @return user
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_USER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public User getUser() {
    return user;
  }

  public void setUser(User user) {
    this.user = user;
  }

  /** Return true if this OrganizationCreateResponse object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrganizationCreateResponse organizationCreateResponse = (OrganizationCreateResponse) o;
    return Objects.equals(this.apiKey, organizationCreateResponse.apiKey)
        && Objects.equals(this.applicationKey, organizationCreateResponse.applicationKey)
        && Objects.equals(this.org, organizationCreateResponse.org)
        && Objects.equals(this.user, organizationCreateResponse.user);
  }

  @Override
  public int hashCode() {
    return Objects.hash(apiKey, applicationKey, org, user);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrganizationCreateResponse {\n");
    sb.append("    apiKey: ").append(toIndentedString(apiKey)).append("\n");
    sb.append("    applicationKey: ").append(toIndentedString(applicationKey)).append("\n");
    sb.append("    org: ").append(toIndentedString(org)).append("\n");
    sb.append("    user: ").append(toIndentedString(user)).append("\n");
    sb.append("}");
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
