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
   * <p>Attributes describing a GitHub account's CI Visibility opt-in status.</p>
 */
@JsonPropertyOrder({
  CIAppGitHubAccountAttributes.JSON_PROPERTY_ACCOUNT,
  CIAppGitHubAccountAttributes.JSON_PROPERTY_ENABLED,
  CIAppGitHubAccountAttributes.JSON_PROPERTY_HOST,
  CIAppGitHubAccountAttributes.JSON_PROPERTY_REPO_COUNT,
  CIAppGitHubAccountAttributes.JSON_PROPERTY_REPOSITORIES
})
@jakarta.annotation.Generated(value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class CIAppGitHubAccountAttributes {
  @JsonIgnore
  public boolean unparsed = false;
  public static final String JSON_PROPERTY_ACCOUNT = "account";
  private String account;

  public static final String JSON_PROPERTY_ENABLED = "enabled";
  private Boolean enabled;

  public static final String JSON_PROPERTY_HOST = "host";
  private String host;

  public static final String JSON_PROPERTY_REPO_COUNT = "repo_count";
  private Long repoCount;

  public static final String JSON_PROPERTY_REPOSITORIES = "repositories";
  private List<CIAppGitHubAccountRepository> repositories = null;

  public CIAppGitHubAccountAttributes account(String account) {
    this.account = account;
    return this;
  }

  /**
   * <p>The GitHub account (organization or user) name.</p>
   * @return account
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_ACCOUNT)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public String getAccount() {
        return account;
      }
  public void setAccount(String account) {
    this.account = account;
  }
  public CIAppGitHubAccountAttributes enabled(Boolean enabled) {
    this.enabled = enabled;
    return this;
  }

  /**
   * <p>Whether CI Visibility is enabled at the account level.</p>
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
  public CIAppGitHubAccountAttributes host(String host) {
    this.host = host;
    return this;
  }

  /**
   * <p>The GitHub host (<code>github.com</code> or a GitHub Enterprise Server (GHES) hostname) this account belongs to.</p>
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
  public CIAppGitHubAccountAttributes repoCount(Long repoCount) {
    this.repoCount = repoCount;
    return this;
  }

  /**
   * <p>The number of repositories known for this account.</p>
   * @return repoCount
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_REPO_COUNT)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public Long getRepoCount() {
        return repoCount;
      }
  public void setRepoCount(Long repoCount) {
    this.repoCount = repoCount;
  }
  public CIAppGitHubAccountAttributes repositories(List<CIAppGitHubAccountRepository> repositories) {
    this.repositories = repositories;
    if (repositories != null) {
    for (CIAppGitHubAccountRepository item : repositories) {
      this.unparsed |= item.unparsed;
    }
    }
    return this;
  }
  public CIAppGitHubAccountAttributes addRepositoriesItem(CIAppGitHubAccountRepository repositoriesItem) {
    if (this.repositories == null) {
      this.repositories = new ArrayList<>();
    }
    this.repositories.add(repositoriesItem);
    this.unparsed |= repositoriesItem.unparsed;
    return this;
  }

  /**
   * <p>The repositories belonging to this account, with their individual opt-in status.</p>
   * @return repositories
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_REPOSITORIES)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public List<CIAppGitHubAccountRepository> getRepositories() {
        return repositories;
      }
  public void setRepositories(List<CIAppGitHubAccountRepository> repositories) {
    this.repositories = repositories;
    if (repositories != null) {
      for (CIAppGitHubAccountRepository item : repositories) {
        this.unparsed |= item.unparsed;
      }
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
   * @return CIAppGitHubAccountAttributes
   */
  @JsonAnySetter
  public CIAppGitHubAccountAttributes putAdditionalProperty(String key, Object value) {
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
   * Return true if this CIAppGitHubAccountAttributes object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CIAppGitHubAccountAttributes ciAppGitHubAccountAttributes = (CIAppGitHubAccountAttributes) o;
    return Objects.equals(this.account, ciAppGitHubAccountAttributes.account) && Objects.equals(this.enabled, ciAppGitHubAccountAttributes.enabled) && Objects.equals(this.host, ciAppGitHubAccountAttributes.host) && Objects.equals(this.repoCount, ciAppGitHubAccountAttributes.repoCount) && Objects.equals(this.repositories, ciAppGitHubAccountAttributes.repositories) && Objects.equals(this.additionalProperties, ciAppGitHubAccountAttributes.additionalProperties);
  }


  @Override
  public int hashCode() {
    return Objects.hash(account,enabled,host,repoCount,repositories, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CIAppGitHubAccountAttributes {\n");
    sb.append("    account: ").append(toIndentedString(account)).append("\n");
    sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
    sb.append("    host: ").append(toIndentedString(host)).append("\n");
    sb.append("    repoCount: ").append(toIndentedString(repoCount)).append("\n");
    sb.append("    repositories: ").append(toIndentedString(repositories)).append("\n");
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
