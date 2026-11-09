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

/** Update to GitHub App credentials. */
@JsonPropertyOrder({
  GithubAppUpdate.JSON_PROPERTY_GITHUB_APP_ID,
  GithubAppUpdate.JSON_PROPERTY_GITHUB_INSTALLATION_ID,
  GithubAppUpdate.JSON_PROPERTY_HOSTNAME,
  GithubAppUpdate.JSON_PROPERTY_PRIVATE_KEY,
  GithubAppUpdate.JSON_PROPERTY_TYPE
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class GithubAppUpdate {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_GITHUB_APP_ID = "github_app_id";
  private GithubAppUpdateGithubAppId githubAppId;

  public static final String JSON_PROPERTY_GITHUB_INSTALLATION_ID = "github_installation_id";
  private GithubAppUpdateGithubInstallationId githubInstallationId;

  public static final String JSON_PROPERTY_HOSTNAME = "hostname";
  private GithubAppUpdateHostname hostname;

  public static final String JSON_PROPERTY_PRIVATE_KEY = "private_key";
  private GithubAppUpdatePrivateKey privateKey;

  public static final String JSON_PROPERTY_TYPE = "type";
  private GithubAppType type;

  public GithubAppUpdate() {}

  @JsonCreator
  public GithubAppUpdate(
      @JsonProperty(required = true, value = JSON_PROPERTY_TYPE) GithubAppType type) {
    this.type = type;
    this.unparsed |= !type.isValid();
  }

  public GithubAppUpdate githubAppId(GithubAppUpdateGithubAppId githubAppId) {
    this.githubAppId = githubAppId;
    this.unparsed |= githubAppId.unparsed;
    return this;
  }

  /**
   * The numeric ID of the GitHub App.
   *
   * @return githubAppId
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_GITHUB_APP_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public GithubAppUpdateGithubAppId getGithubAppId() {
    return githubAppId;
  }

  public void setGithubAppId(GithubAppUpdateGithubAppId githubAppId) {
    this.githubAppId = githubAppId;
    if (githubAppId != null) {
      this.unparsed |= githubAppId.unparsed;
    }
  }

  public GithubAppUpdate githubInstallationId(
      GithubAppUpdateGithubInstallationId githubInstallationId) {
    this.githubInstallationId = githubInstallationId;
    this.unparsed |= githubInstallationId.unparsed;
    return this;
  }

  /**
   * The installation ID of the GitHub App.
   *
   * @return githubInstallationId
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_GITHUB_INSTALLATION_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public GithubAppUpdateGithubInstallationId getGithubInstallationId() {
    return githubInstallationId;
  }

  public void setGithubInstallationId(GithubAppUpdateGithubInstallationId githubInstallationId) {
    this.githubInstallationId = githubInstallationId;
    if (githubInstallationId != null) {
      this.unparsed |= githubInstallationId.unparsed;
    }
  }

  public GithubAppUpdate hostname(GithubAppUpdateHostname hostname) {
    this.hostname = hostname;
    this.unparsed |= hostname.unparsed;
    return this;
  }

  /**
   * Hostname of the GitHub Enterprise Server. Omit this field for github.com.
   *
   * @return hostname
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_HOSTNAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public GithubAppUpdateHostname getHostname() {
    return hostname;
  }

  public void setHostname(GithubAppUpdateHostname hostname) {
    this.hostname = hostname;
    if (hostname != null) {
      this.unparsed |= hostname.unparsed;
    }
  }

  public GithubAppUpdate privateKey(GithubAppUpdatePrivateKey privateKey) {
    this.privateKey = privateKey;
    this.unparsed |= privateKey.unparsed;
    return this;
  }

  /**
   * PEM-encoded RSA private key for the GitHub App.
   *
   * @return privateKey
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PRIVATE_KEY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public GithubAppUpdatePrivateKey getPrivateKey() {
    return privateKey;
  }

  public void setPrivateKey(GithubAppUpdatePrivateKey privateKey) {
    this.privateKey = privateKey;
    if (privateKey != null) {
      this.unparsed |= privateKey.unparsed;
    }
  }

  public GithubAppUpdate type(GithubAppType type) {
    this.type = type;
    this.unparsed |= !type.isValid();
    return this;
  }

  /**
   * The credential type for <code>GithubApp</code>.
   *
   * @return type
   */
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public GithubAppType getType() {
    return type;
  }

  public void setType(GithubAppType type) {
    if (!type.isValid()) {
      this.unparsed = true;
    }
    this.type = type;
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
   * @return GithubAppUpdate
   */
  @JsonAnySetter
  public GithubAppUpdate putAdditionalProperty(String key, Object value) {
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

  /** Return true if this GithubAppUpdate object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GithubAppUpdate githubAppUpdate = (GithubAppUpdate) o;
    return Objects.equals(this.githubAppId, githubAppUpdate.githubAppId)
        && Objects.equals(this.githubInstallationId, githubAppUpdate.githubInstallationId)
        && Objects.equals(this.hostname, githubAppUpdate.hostname)
        && Objects.equals(this.privateKey, githubAppUpdate.privateKey)
        && Objects.equals(this.type, githubAppUpdate.type)
        && Objects.equals(this.additionalProperties, githubAppUpdate.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        githubAppId, githubInstallationId, hostname, privateKey, type, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GithubAppUpdate {\n");
    sb.append("    githubAppId: ").append(toIndentedString(githubAppId)).append("\n");
    sb.append("    githubInstallationId: ")
        .append(toIndentedString(githubInstallationId))
        .append("\n");
    sb.append("    hostname: ").append(toIndentedString(hostname)).append("\n");
    sb.append("    privateKey: ").append(toIndentedString(privateKey)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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
