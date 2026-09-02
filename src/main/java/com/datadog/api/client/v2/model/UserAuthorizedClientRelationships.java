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

/** Relationships for a user authorized client. */
@JsonPropertyOrder({
  UserAuthorizedClientRelationships.JSON_PROPERTY_OAUTH2_CLIENT,
  UserAuthorizedClientRelationships.JSON_PROPERTY_SCOPES,
  UserAuthorizedClientRelationships.JSON_PROPERTY_USER
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class UserAuthorizedClientRelationships {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_OAUTH2_CLIENT = "oauth2_client";
  private UserAuthorizedClientRelationshipOAuth2Client oauth2Client;

  public static final String JSON_PROPERTY_SCOPES = "scopes";
  private UserAuthorizedClientRelationshipScopes scopes;

  public static final String JSON_PROPERTY_USER = "user";
  private UserAuthorizedClientRelationshipUser user;

  public UserAuthorizedClientRelationships() {}

  @JsonCreator
  public UserAuthorizedClientRelationships(
      @JsonProperty(required = true, value = JSON_PROPERTY_OAUTH2_CLIENT)
          UserAuthorizedClientRelationshipOAuth2Client oauth2Client,
      @JsonProperty(required = true, value = JSON_PROPERTY_SCOPES)
          UserAuthorizedClientRelationshipScopes scopes,
      @JsonProperty(required = true, value = JSON_PROPERTY_USER)
          UserAuthorizedClientRelationshipUser user) {
    this.oauth2Client = oauth2Client;
    this.unparsed |= oauth2Client.unparsed;
    this.scopes = scopes;
    this.unparsed |= scopes.unparsed;
    this.user = user;
    this.unparsed |= user.unparsed;
  }

  public UserAuthorizedClientRelationships oauth2Client(
      UserAuthorizedClientRelationshipOAuth2Client oauth2Client) {
    this.oauth2Client = oauth2Client;
    this.unparsed |= oauth2Client.unparsed;
    return this;
  }

  /**
   * Relationship to the OAuth2 client that was authorized.
   *
   * @return oauth2Client
   */
  @JsonProperty(JSON_PROPERTY_OAUTH2_CLIENT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public UserAuthorizedClientRelationshipOAuth2Client getOauth2Client() {
    return oauth2Client;
  }

  public void setOauth2Client(UserAuthorizedClientRelationshipOAuth2Client oauth2Client) {
    this.oauth2Client = oauth2Client;
    if (oauth2Client != null) {
      this.unparsed |= oauth2Client.unparsed;
    }
  }

  public UserAuthorizedClientRelationships scopes(UserAuthorizedClientRelationshipScopes scopes) {
    this.scopes = scopes;
    this.unparsed |= scopes.unparsed;
    return this;
  }

  /**
   * Relationship to the scopes granted to the OAuth2 client.
   *
   * @return scopes
   */
  @JsonProperty(JSON_PROPERTY_SCOPES)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public UserAuthorizedClientRelationshipScopes getScopes() {
    return scopes;
  }

  public void setScopes(UserAuthorizedClientRelationshipScopes scopes) {
    this.scopes = scopes;
    if (scopes != null) {
      this.unparsed |= scopes.unparsed;
    }
  }

  public UserAuthorizedClientRelationships user(UserAuthorizedClientRelationshipUser user) {
    this.user = user;
    this.unparsed |= user.unparsed;
    return this;
  }

  /**
   * Relationship to the user who granted this authorization.
   *
   * @return user
   */
  @JsonProperty(JSON_PROPERTY_USER)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public UserAuthorizedClientRelationshipUser getUser() {
    return user;
  }

  public void setUser(UserAuthorizedClientRelationshipUser user) {
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
   * @return UserAuthorizedClientRelationships
   */
  @JsonAnySetter
  public UserAuthorizedClientRelationships putAdditionalProperty(String key, Object value) {
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

  /** Return true if this UserAuthorizedClientRelationships object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UserAuthorizedClientRelationships userAuthorizedClientRelationships =
        (UserAuthorizedClientRelationships) o;
    return Objects.equals(this.oauth2Client, userAuthorizedClientRelationships.oauth2Client)
        && Objects.equals(this.scopes, userAuthorizedClientRelationships.scopes)
        && Objects.equals(this.user, userAuthorizedClientRelationships.user)
        && Objects.equals(
            this.additionalProperties, userAuthorizedClientRelationships.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(oauth2Client, scopes, user, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserAuthorizedClientRelationships {\n");
    sb.append("    oauth2Client: ").append(toIndentedString(oauth2Client)).append("\n");
    sb.append("    scopes: ").append(toIndentedString(scopes)).append("\n");
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
