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

/** Relationships for an org authorized client. */
@JsonPropertyOrder({
  OrgAuthorizedClientRelationships.JSON_PROPERTY_OAUTH2_CLIENT,
  OrgAuthorizedClientRelationships.JSON_PROPERTY_USER_AUTHORIZED_CLIENTS
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class OrgAuthorizedClientRelationships {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_OAUTH2_CLIENT = "oauth2_client";
  private OrgAuthorizedClientRelationshipOAuth2Client oauth2Client;

  public static final String JSON_PROPERTY_USER_AUTHORIZED_CLIENTS = "user_authorized_clients";
  private OrgAuthorizedClientRelationshipUserAuthorizedClients userAuthorizedClients;

  public OrgAuthorizedClientRelationships() {}

  @JsonCreator
  public OrgAuthorizedClientRelationships(
      @JsonProperty(required = true, value = JSON_PROPERTY_OAUTH2_CLIENT)
          OrgAuthorizedClientRelationshipOAuth2Client oauth2Client,
      @JsonProperty(required = true, value = JSON_PROPERTY_USER_AUTHORIZED_CLIENTS)
          OrgAuthorizedClientRelationshipUserAuthorizedClients userAuthorizedClients) {
    this.oauth2Client = oauth2Client;
    this.unparsed |= oauth2Client.unparsed;
    this.userAuthorizedClients = userAuthorizedClients;
    this.unparsed |= userAuthorizedClients.unparsed;
  }

  public OrgAuthorizedClientRelationships oauth2Client(
      OrgAuthorizedClientRelationshipOAuth2Client oauth2Client) {
    this.oauth2Client = oauth2Client;
    this.unparsed |= oauth2Client.unparsed;
    return this;
  }

  /**
   * Relationship to the OAuth2 client for this org authorized client.
   *
   * @return oauth2Client
   */
  @JsonProperty(JSON_PROPERTY_OAUTH2_CLIENT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public OrgAuthorizedClientRelationshipOAuth2Client getOauth2Client() {
    return oauth2Client;
  }

  public void setOauth2Client(OrgAuthorizedClientRelationshipOAuth2Client oauth2Client) {
    this.oauth2Client = oauth2Client;
    if (oauth2Client != null) {
      this.unparsed |= oauth2Client.unparsed;
    }
  }

  public OrgAuthorizedClientRelationships userAuthorizedClients(
      OrgAuthorizedClientRelationshipUserAuthorizedClients userAuthorizedClients) {
    this.userAuthorizedClients = userAuthorizedClients;
    this.unparsed |= userAuthorizedClients.unparsed;
    return this;
  }

  /**
   * Relationship to the user authorized clients for this org authorized client.
   *
   * @return userAuthorizedClients
   */
  @JsonProperty(JSON_PROPERTY_USER_AUTHORIZED_CLIENTS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public OrgAuthorizedClientRelationshipUserAuthorizedClients getUserAuthorizedClients() {
    return userAuthorizedClients;
  }

  public void setUserAuthorizedClients(
      OrgAuthorizedClientRelationshipUserAuthorizedClients userAuthorizedClients) {
    this.userAuthorizedClients = userAuthorizedClients;
    if (userAuthorizedClients != null) {
      this.unparsed |= userAuthorizedClients.unparsed;
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
   * @return OrgAuthorizedClientRelationships
   */
  @JsonAnySetter
  public OrgAuthorizedClientRelationships putAdditionalProperty(String key, Object value) {
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

  /** Return true if this OrgAuthorizedClientRelationships object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrgAuthorizedClientRelationships orgAuthorizedClientRelationships =
        (OrgAuthorizedClientRelationships) o;
    return Objects.equals(this.oauth2Client, orgAuthorizedClientRelationships.oauth2Client)
        && Objects.equals(
            this.userAuthorizedClients, orgAuthorizedClientRelationships.userAuthorizedClients)
        && Objects.equals(
            this.additionalProperties, orgAuthorizedClientRelationships.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(oauth2Client, userAuthorizedClients, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrgAuthorizedClientRelationships {\n");
    sb.append("    oauth2Client: ").append(toIndentedString(oauth2Client)).append("\n");
    sb.append("    userAuthorizedClients: ")
        .append(toIndentedString(userAuthorizedClients))
        .append("\n");
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
