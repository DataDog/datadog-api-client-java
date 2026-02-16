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
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/** Attributes of an action connection. */
@JsonPropertyOrder({
  ConnectionDataAttributesResponse.JSON_PROPERTY_ACTING_USER_CAN_RESOLVE,
  ConnectionDataAttributesResponse.JSON_PROPERTY_CREATED_AT,
  ConnectionDataAttributesResponse.JSON_PROPERTY_CREATED_BY,
  ConnectionDataAttributesResponse.JSON_PROPERTY_DESCRIPTION,
  ConnectionDataAttributesResponse.JSON_PROPERTY_EXTERNAL_SECRETS_MANAGER,
  ConnectionDataAttributesResponse.JSON_PROPERTY_INTEGRATION,
  ConnectionDataAttributesResponse.JSON_PROPERTY_IS_FAVORITE,
  ConnectionDataAttributesResponse.JSON_PROPERTY_LAST_UPDATED,
  ConnectionDataAttributesResponse.JSON_PROPERTY_NAME,
  ConnectionDataAttributesResponse.JSON_PROPERTY_PRIVATE_ACTIONS_RUNNER,
  ConnectionDataAttributesResponse.JSON_PROPERTY_RUNNER_ID,
  ConnectionDataAttributesResponse.JSON_PROPERTY_TAGS
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class ConnectionDataAttributesResponse {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_ACTING_USER_CAN_RESOLVE = "acting_user_can_resolve";
  private Boolean actingUserCanResolve;

  public static final String JSON_PROPERTY_CREATED_AT = "created_at";
  private OffsetDateTime createdAt;

  public static final String JSON_PROPERTY_CREATED_BY = "created_by";
  private CreatedBy createdBy;

  public static final String JSON_PROPERTY_DESCRIPTION = "description";
  private String description;

  public static final String JSON_PROPERTY_EXTERNAL_SECRETS_MANAGER = "external_secrets_manager";
  private ExternalSecretsManager externalSecretsManager;

  public static final String JSON_PROPERTY_INTEGRATION = "integration";
  private Object integration;

  public static final String JSON_PROPERTY_IS_FAVORITE = "is_favorite";
  private Boolean isFavorite;

  public static final String JSON_PROPERTY_LAST_UPDATED = "last_updated";
  private OffsetDateTime lastUpdated;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_PRIVATE_ACTIONS_RUNNER = "private_actions_runner";
  private PrivateActionsRunner privateActionsRunner;

  public static final String JSON_PROPERTY_RUNNER_ID = "runner_id";
  private String runnerId;

  public static final String JSON_PROPERTY_TAGS = "tags";
  private List<String> tags = null;

  public ConnectionDataAttributesResponse() {}

  @JsonCreator
  public ConnectionDataAttributesResponse(
      @JsonProperty(required = true, value = JSON_PROPERTY_ACTING_USER_CAN_RESOLVE)
          Boolean actingUserCanResolve,
      @JsonProperty(required = true, value = JSON_PROPERTY_EXTERNAL_SECRETS_MANAGER)
          ExternalSecretsManager externalSecretsManager,
      @JsonProperty(required = true, value = JSON_PROPERTY_INTEGRATION) Object integration,
      @JsonProperty(required = true, value = JSON_PROPERTY_IS_FAVORITE) Boolean isFavorite,
      @JsonProperty(required = true, value = JSON_PROPERTY_NAME) String name) {
    this.actingUserCanResolve = actingUserCanResolve;
    this.externalSecretsManager = externalSecretsManager;
    this.unparsed |= externalSecretsManager.unparsed;
    this.integration = integration;
    this.isFavorite = isFavorite;
    this.name = name;
  }

  public ConnectionDataAttributesResponse actingUserCanResolve(Boolean actingUserCanResolve) {
    this.actingUserCanResolve = actingUserCanResolve;
    return this;
  }

  /**
   * Indicates if the acting user can resolve the connection.
   *
   * @return actingUserCanResolve
   */
  @JsonProperty(JSON_PROPERTY_ACTING_USER_CAN_RESOLVE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Boolean getActingUserCanResolve() {
    return actingUserCanResolve;
  }

  public void setActingUserCanResolve(Boolean actingUserCanResolve) {
    this.actingUserCanResolve = actingUserCanResolve;
  }

  public ConnectionDataAttributesResponse createdAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
    return this;
  }

  /**
   * The creation timestamp of the connection.
   *
   * @return createdAt
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CREATED_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
  }

  public ConnectionDataAttributesResponse createdBy(CreatedBy createdBy) {
    this.createdBy = createdBy;
    this.unparsed |= createdBy.unparsed;
    return this;
  }

  /**
   * Information about the user who created the resource.
   *
   * @return createdBy
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CREATED_BY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public CreatedBy getCreatedBy() {
    return createdBy;
  }

  public void setCreatedBy(CreatedBy createdBy) {
    this.createdBy = createdBy;
  }

  public ConnectionDataAttributesResponse description(String description) {
    this.description = description;
    return this;
  }

  /**
   * The description of the connection.
   *
   * @return description
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DESCRIPTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public ConnectionDataAttributesResponse externalSecretsManager(
      ExternalSecretsManager externalSecretsManager) {
    this.externalSecretsManager = externalSecretsManager;
    this.unparsed |= externalSecretsManager.unparsed;
    return this;
  }

  /**
   * External secrets manager configuration.
   *
   * @return externalSecretsManager
   */
  @JsonProperty(JSON_PROPERTY_EXTERNAL_SECRETS_MANAGER)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public ExternalSecretsManager getExternalSecretsManager() {
    return externalSecretsManager;
  }

  public void setExternalSecretsManager(ExternalSecretsManager externalSecretsManager) {
    this.externalSecretsManager = externalSecretsManager;
  }

  public ConnectionDataAttributesResponse integration(Object integration) {
    this.integration = integration;
    return this;
  }

  /**
   * Integration configuration details.
   *
   * @return integration
   */
  @JsonProperty(JSON_PROPERTY_INTEGRATION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Object getIntegration() {
    return integration;
  }

  public void setIntegration(Object integration) {
    this.integration = integration;
  }

  public ConnectionDataAttributesResponse isFavorite(Boolean isFavorite) {
    this.isFavorite = isFavorite;
    return this;
  }

  /**
   * Indicates if the connection is marked as favorite.
   *
   * @return isFavorite
   */
  @JsonProperty(JSON_PROPERTY_IS_FAVORITE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Boolean getIsFavorite() {
    return isFavorite;
  }

  public void setIsFavorite(Boolean isFavorite) {
    this.isFavorite = isFavorite;
  }

  public ConnectionDataAttributesResponse lastUpdated(OffsetDateTime lastUpdated) {
    this.lastUpdated = lastUpdated;
    return this;
  }

  /**
   * The last updated timestamp of the connection.
   *
   * @return lastUpdated
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LAST_UPDATED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public OffsetDateTime getLastUpdated() {
    return lastUpdated;
  }

  public void setLastUpdated(OffsetDateTime lastUpdated) {
    this.lastUpdated = lastUpdated;
  }

  public ConnectionDataAttributesResponse name(String name) {
    this.name = name;
    return this;
  }

  /**
   * The name of the connection.
   *
   * @return name
   */
  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public ConnectionDataAttributesResponse privateActionsRunner(
      PrivateActionsRunner privateActionsRunner) {
    this.privateActionsRunner = privateActionsRunner;
    this.unparsed |= privateActionsRunner.unparsed;
    return this;
  }

  /**
   * Information about the private actions runner.
   *
   * @return privateActionsRunner
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PRIVATE_ACTIONS_RUNNER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public PrivateActionsRunner getPrivateActionsRunner() {
    return privateActionsRunner;
  }

  public void setPrivateActionsRunner(PrivateActionsRunner privateActionsRunner) {
    this.privateActionsRunner = privateActionsRunner;
  }

  public ConnectionDataAttributesResponse runnerId(String runnerId) {
    this.runnerId = runnerId;
    return this;
  }

  /**
   * The ID of the runner associated with the connection.
   *
   * @return runnerId
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_RUNNER_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getRunnerId() {
    return runnerId;
  }

  public void setRunnerId(String runnerId) {
    this.runnerId = runnerId;
  }

  public ConnectionDataAttributesResponse tags(List<String> tags) {
    this.tags = tags;
    return this;
  }

  public ConnectionDataAttributesResponse addTagsItem(String tagsItem) {
    if (this.tags == null) {
      this.tags = new ArrayList<>();
    }
    this.tags.add(tagsItem);
    return this;
  }

  /**
   * Tags associated with the connection.
   *
   * @return tags
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TAGS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<String> getTags() {
    return tags;
  }

  public void setTags(List<String> tags) {
    this.tags = tags;
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
   * @return ConnectionDataAttributesResponse
   */
  @JsonAnySetter
  public ConnectionDataAttributesResponse putAdditionalProperty(String key, Object value) {
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

  /** Return true if this ConnectionDataAttributesResponse object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConnectionDataAttributesResponse connectionDataAttributesResponse =
        (ConnectionDataAttributesResponse) o;
    return Objects.equals(
            this.actingUserCanResolve, connectionDataAttributesResponse.actingUserCanResolve)
        && Objects.equals(this.createdAt, connectionDataAttributesResponse.createdAt)
        && Objects.equals(this.createdBy, connectionDataAttributesResponse.createdBy)
        && Objects.equals(this.description, connectionDataAttributesResponse.description)
        && Objects.equals(
            this.externalSecretsManager, connectionDataAttributesResponse.externalSecretsManager)
        && Objects.equals(this.integration, connectionDataAttributesResponse.integration)
        && Objects.equals(this.isFavorite, connectionDataAttributesResponse.isFavorite)
        && Objects.equals(this.lastUpdated, connectionDataAttributesResponse.lastUpdated)
        && Objects.equals(this.name, connectionDataAttributesResponse.name)
        && Objects.equals(
            this.privateActionsRunner, connectionDataAttributesResponse.privateActionsRunner)
        && Objects.equals(this.runnerId, connectionDataAttributesResponse.runnerId)
        && Objects.equals(this.tags, connectionDataAttributesResponse.tags)
        && Objects.equals(
            this.additionalProperties, connectionDataAttributesResponse.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        actingUserCanResolve,
        createdAt,
        createdBy,
        description,
        externalSecretsManager,
        integration,
        isFavorite,
        lastUpdated,
        name,
        privateActionsRunner,
        runnerId,
        tags,
        additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConnectionDataAttributesResponse {\n");
    sb.append("    actingUserCanResolve: ")
        .append(toIndentedString(actingUserCanResolve))
        .append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    createdBy: ").append(toIndentedString(createdBy)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    externalSecretsManager: ")
        .append(toIndentedString(externalSecretsManager))
        .append("\n");
    sb.append("    integration: ").append(toIndentedString(integration)).append("\n");
    sb.append("    isFavorite: ").append(toIndentedString(isFavorite)).append("\n");
    sb.append("    lastUpdated: ").append(toIndentedString(lastUpdated)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    privateActionsRunner: ")
        .append(toIndentedString(privateActionsRunner))
        .append("\n");
    sb.append("    runnerId: ").append(toIndentedString(runnerId)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
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
