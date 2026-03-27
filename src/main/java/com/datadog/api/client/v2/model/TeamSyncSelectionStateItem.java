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

/** Identifies a team or organization hierarchy to include in synchronization. */
@JsonPropertyOrder({
  TeamSyncSelectionStateItem.JSON_PROPERTY_EXTERNAL_ID,
  TeamSyncSelectionStateItem.JSON_PROPERTY_OPERATION,
  TeamSyncSelectionStateItem.JSON_PROPERTY_SCOPE
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class TeamSyncSelectionStateItem {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_EXTERNAL_ID = "external_id";
  private TeamSyncSelectionStateExternalId externalId;

  public static final String JSON_PROPERTY_OPERATION = "operation";
  private TeamSyncSelectionStateOperation operation;

  public static final String JSON_PROPERTY_SCOPE = "scope";
  private TeamSyncSelectionStateScope scope;

  public TeamSyncSelectionStateItem() {}

  @JsonCreator
  public TeamSyncSelectionStateItem(
      @JsonProperty(required = true, value = JSON_PROPERTY_EXTERNAL_ID)
          TeamSyncSelectionStateExternalId externalId) {
    this.externalId = externalId;
    this.unparsed |= externalId.unparsed;
  }

  public TeamSyncSelectionStateItem externalId(TeamSyncSelectionStateExternalId externalId) {
    this.externalId = externalId;
    this.unparsed |= externalId.unparsed;
    return this;
  }

  /**
   * The external identifier for a team or organization in the source platform.
   *
   * @return externalId
   */
  @JsonProperty(JSON_PROPERTY_EXTERNAL_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public TeamSyncSelectionStateExternalId getExternalId() {
    return externalId;
  }

  public void setExternalId(TeamSyncSelectionStateExternalId externalId) {
    this.externalId = externalId;
  }

  public TeamSyncSelectionStateItem operation(TeamSyncSelectionStateOperation operation) {
    this.operation = operation;
    this.unparsed |= !operation.isValid();
    return this;
  }

  /**
   * The operation to perform on the selected hierarchy. When set to <code>include</code>,
   * synchronization covers the referenced teams or organizations.
   *
   * @return operation
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_OPERATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public TeamSyncSelectionStateOperation getOperation() {
    return operation;
  }

  public void setOperation(TeamSyncSelectionStateOperation operation) {
    if (!operation.isValid()) {
      this.unparsed = true;
    }
    this.operation = operation;
  }

  public TeamSyncSelectionStateItem scope(TeamSyncSelectionStateScope scope) {
    this.scope = scope;
    this.unparsed |= !scope.isValid();
    return this;
  }

  /**
   * The scope of the selection. When set to <code>subtree</code>, synchronization includes the
   * referenced team or organization and everything nested under it.
   *
   * @return scope
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SCOPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public TeamSyncSelectionStateScope getScope() {
    return scope;
  }

  public void setScope(TeamSyncSelectionStateScope scope) {
    if (!scope.isValid()) {
      this.unparsed = true;
    }
    this.scope = scope;
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
   * @return TeamSyncSelectionStateItem
   */
  @JsonAnySetter
  public TeamSyncSelectionStateItem putAdditionalProperty(String key, Object value) {
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

  /** Return true if this TeamSyncSelectionStateItem object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TeamSyncSelectionStateItem teamSyncSelectionStateItem = (TeamSyncSelectionStateItem) o;
    return Objects.equals(this.externalId, teamSyncSelectionStateItem.externalId)
        && Objects.equals(this.operation, teamSyncSelectionStateItem.operation)
        && Objects.equals(this.scope, teamSyncSelectionStateItem.scope)
        && Objects.equals(
            this.additionalProperties, teamSyncSelectionStateItem.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(externalId, operation, scope, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TeamSyncSelectionStateItem {\n");
    sb.append("    externalId: ").append(toIndentedString(externalId)).append("\n");
    sb.append("    operation: ").append(toIndentedString(operation)).append("\n");
    sb.append("    scope: ").append(toIndentedString(scope)).append("\n");
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
