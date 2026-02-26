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
import java.util.UUID;
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
   * <p>Response object for an organization creation.</p>
 */
@JsonPropertyOrder({
  OrganizationCreateResponse.JSON_PROPERTY_API_KEY,
  OrganizationCreateResponse.JSON_PROPERTY_APPLICATION_KEY,
  OrganizationCreateResponse.JSON_PROPERTY_ORG,
  OrganizationCreateResponse.JSON_PROPERTY_USER
})
@jakarta.annotation.Generated(value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class OrganizationCreateResponse {
  @JsonIgnore
  public boolean unparsed = false;
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
   * <p>Datadog API key.</p>
   * @return apiKey
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_API_KEY)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
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
   * <p>An application key with its associated metadata.</p>
   * @return applicationKey
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_APPLICATION_KEY)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
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
   * <p>Create, edit, and manage organizations.</p>
   * @return org
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_ORG)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
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
   * <p>Create, edit, and disable users.</p>
   * @return user
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_USER)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public User getUser() {
        return user;
      }
  public void setUser(User user) {
    this.user = user;
  }

  /**
   * A container for additional, undeclared properties.
   * This is a holder for any undeclared properties as specified with
   * the 'additionalProperties' keyword in the OAS document.
   */
  private Map<String, Object> additionalProperties;

  /**
   * Set the additional (undeclared) property with the specified name and value.
   * If the property does not already exist, create it otherwise replace it.
   *
   * @param key The arbitrary key to set
   * @param value The associated value
   * @return OrganizationCreateResponse
   */
  @JsonAnySetter
  public OrganizationCreateResponse putAdditionalProperty(String key, Object value) {
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

  /**
   * Return true if this OrganizationCreateResponse object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrganizationCreateResponse organizationCreateResponse = (OrganizationCreateResponse) o;
    return Objects.equals(this.apiKey, organizationCreateResponse.apiKey) && Objects.equals(this.applicationKey, organizationCreateResponse.applicationKey) && Objects.equals(this.org, organizationCreateResponse.org) && Objects.equals(this.user, organizationCreateResponse.user) && Objects.equals(this.additionalProperties, organizationCreateResponse.additionalProperties);
  }


  @Override
  public int hashCode() {
    return Objects.hash(apiKey,applicationKey,org,user, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrganizationCreateResponse {\n");
    sb.append("    apiKey: ").append(toIndentedString(apiKey)).append("\n");
    sb.append("    applicationKey: ").append(toIndentedString(applicationKey)).append("\n");
    sb.append("    org: ").append(toIndentedString(org)).append("\n");
    sb.append("    user: ").append(toIndentedString(user)).append("\n");
    sb.append("    additionalProperties: ")
        .append(toIndentedString(additionalProperties))
        .append("\n");
    sb.append('}');
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
