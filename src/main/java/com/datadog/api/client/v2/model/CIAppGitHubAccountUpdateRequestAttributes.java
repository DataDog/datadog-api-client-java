/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v2.model;

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
   * <p>Attributes for updating a GitHub account's CI Visibility opt-in status.
   * At least one of <code>enabled</code> or <code>repository.enabled</code> must be provided.</p>
 */
@JsonPropertyOrder({
  CIAppGitHubAccountUpdateRequestAttributes.JSON_PROPERTY_ACCOUNT,
  CIAppGitHubAccountUpdateRequestAttributes.JSON_PROPERTY_ENABLED,
  CIAppGitHubAccountUpdateRequestAttributes.JSON_PROPERTY_HOST,
  CIAppGitHubAccountUpdateRequestAttributes.JSON_PROPERTY_REPOSITORY
})
@jakarta.annotation.Generated(value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class CIAppGitHubAccountUpdateRequestAttributes {
  @JsonIgnore
  public boolean unparsed = false;
  public static final String JSON_PROPERTY_ACCOUNT = "account";
  private String account;

  public static final String JSON_PROPERTY_ENABLED = "enabled";
  private Boolean enabled;

  public static final String JSON_PROPERTY_HOST = "host";
  private String host;

  public static final String JSON_PROPERTY_REPOSITORY = "repository";
  private CIAppGitHubAccountUpdateRequestRepository repository;

  public CIAppGitHubAccountUpdateRequestAttributes() {}

  @JsonCreator
  public CIAppGitHubAccountUpdateRequestAttributes(
            @JsonProperty(required=true, value=JSON_PROPERTY_ACCOUNT)String account) {
        this.account = account;
  }
  public CIAppGitHubAccountUpdateRequestAttributes account(String account) {
    this.account = account;
    return this;
  }

  /**
   * <p>The GitHub account (organization or user) name to update, identified by name.</p>
   * @return account
  **/
      @JsonProperty(JSON_PROPERTY_ACCOUNT)
      @JsonInclude(
        value = JsonInclude.Include.ALWAYS)
      public String getAccount() {
        return account;
      }
  public void setAccount(String account) {
    this.account = account;
  }
  public CIAppGitHubAccountUpdateRequestAttributes enabled(Boolean enabled) {
    this.enabled = enabled;
    return this;
  }

  /**
   * <p>Whether to enable or disable CI Visibility at the account level.</p>
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
  public CIAppGitHubAccountUpdateRequestAttributes host(String host) {
    this.host = host;
    return this;
  }

  /**
   * <p>The GitHub host (<code>github.com</code> or a GHES hostname) the account belongs to. Required to disambiguate
   * when the same account name exists on more than one host.</p>
   * @return host
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_HOST)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public String getHost() {
        return host;
      }
  public void setHost(String host) {
    this.host = host;
  }
  public CIAppGitHubAccountUpdateRequestAttributes repository(CIAppGitHubAccountUpdateRequestRepository repository) {
    this.repository = repository;
    this.unparsed |= repository.unparsed;
    return this;
  }

  /**
   * <p>Repository-level opt-in change to apply, identified by name.</p>
   * @return repository
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_REPOSITORY)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public CIAppGitHubAccountUpdateRequestRepository getRepository() {
        return repository;
      }
  public void setRepository(CIAppGitHubAccountUpdateRequestRepository repository) {
    this.repository = repository;
    if (repository != null) {
      this.unparsed |= repository.unparsed;
    }
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
   * @return CIAppGitHubAccountUpdateRequestAttributes
   */
  @JsonAnySetter
  public CIAppGitHubAccountUpdateRequestAttributes putAdditionalProperty(String key, Object value) {
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
   * Return true if this CIAppGitHubAccountUpdateRequestAttributes object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CIAppGitHubAccountUpdateRequestAttributes ciAppGitHubAccountUpdateRequestAttributes = (CIAppGitHubAccountUpdateRequestAttributes) o;
    return Objects.equals(this.account, ciAppGitHubAccountUpdateRequestAttributes.account) && Objects.equals(this.enabled, ciAppGitHubAccountUpdateRequestAttributes.enabled) && Objects.equals(this.host, ciAppGitHubAccountUpdateRequestAttributes.host) && Objects.equals(this.repository, ciAppGitHubAccountUpdateRequestAttributes.repository) && Objects.equals(this.additionalProperties, ciAppGitHubAccountUpdateRequestAttributes.additionalProperties);
  }


  @Override
  public int hashCode() {
    return Objects.hash(account,enabled,host,repository, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CIAppGitHubAccountUpdateRequestAttributes {\n");
    sb.append("    account: ").append(toIndentedString(account)).append("\n");
    sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
    sb.append("    host: ").append(toIndentedString(host)).append("\n");
    sb.append("    repository: ").append(toIndentedString(repository)).append("\n");
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
