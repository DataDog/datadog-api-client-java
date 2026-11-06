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

/** Update to GitHub personal access token credentials. */
@JsonPropertyOrder({
  GithubPersonalAccessTokenUpdate.JSON_PROPERTY_ACCESS_TOKEN,
  GithubPersonalAccessTokenUpdate.JSON_PROPERTY_HOSTNAME,
  GithubPersonalAccessTokenUpdate.JSON_PROPERTY_TYPE
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class GithubPersonalAccessTokenUpdate {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_ACCESS_TOKEN = "access_token";
  private GithubPersonalAccessTokenUpdateAccessToken accessToken;

  public static final String JSON_PROPERTY_HOSTNAME = "hostname";
  private GithubPersonalAccessTokenUpdateHostname hostname;

  public static final String JSON_PROPERTY_TYPE = "type";
  private GithubPersonalAccessTokenType type;

  public GithubPersonalAccessTokenUpdate() {}

  @JsonCreator
  public GithubPersonalAccessTokenUpdate(
      @JsonProperty(required = true, value = JSON_PROPERTY_TYPE)
          GithubPersonalAccessTokenType type) {
    this.type = type;
    this.unparsed |= !type.isValid();
  }

  public GithubPersonalAccessTokenUpdate accessToken(
      GithubPersonalAccessTokenUpdateAccessToken accessToken) {
    this.accessToken = accessToken;
    this.unparsed |= accessToken.unparsed;
    return this;
  }

  /**
   * GitHub personal access token.
   *
   * @return accessToken
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ACCESS_TOKEN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public GithubPersonalAccessTokenUpdateAccessToken getAccessToken() {
    return accessToken;
  }

  public void setAccessToken(GithubPersonalAccessTokenUpdateAccessToken accessToken) {
    this.accessToken = accessToken;
    if (accessToken != null) {
      this.unparsed |= accessToken.unparsed;
    }
  }

  public GithubPersonalAccessTokenUpdate hostname(
      GithubPersonalAccessTokenUpdateHostname hostname) {
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
  public GithubPersonalAccessTokenUpdateHostname getHostname() {
    return hostname;
  }

  public void setHostname(GithubPersonalAccessTokenUpdateHostname hostname) {
    this.hostname = hostname;
    if (hostname != null) {
      this.unparsed |= hostname.unparsed;
    }
  }

  public GithubPersonalAccessTokenUpdate type(GithubPersonalAccessTokenType type) {
    this.type = type;
    this.unparsed |= !type.isValid();
    return this;
  }

  /**
   * The credential type for <code>GithubPersonalAccessToken</code>.
   *
   * @return type
   */
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public GithubPersonalAccessTokenType getType() {
    return type;
  }

  public void setType(GithubPersonalAccessTokenType type) {
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
   * @return GithubPersonalAccessTokenUpdate
   */
  @JsonAnySetter
  public GithubPersonalAccessTokenUpdate putAdditionalProperty(String key, Object value) {
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

  /** Return true if this GithubPersonalAccessTokenUpdate object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GithubPersonalAccessTokenUpdate githubPersonalAccessTokenUpdate =
        (GithubPersonalAccessTokenUpdate) o;
    return Objects.equals(this.accessToken, githubPersonalAccessTokenUpdate.accessToken)
        && Objects.equals(this.hostname, githubPersonalAccessTokenUpdate.hostname)
        && Objects.equals(this.type, githubPersonalAccessTokenUpdate.type)
        && Objects.equals(
            this.additionalProperties, githubPersonalAccessTokenUpdate.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accessToken, hostname, type, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GithubPersonalAccessTokenUpdate {\n");
    sb.append("    accessToken: ").append(toIndentedString(accessToken)).append("\n");
    sb.append("    hostname: ").append(toIndentedString(hostname)).append("\n");
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
