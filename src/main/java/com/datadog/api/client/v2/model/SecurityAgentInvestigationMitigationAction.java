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
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/** An action that applies a mitigation. */
@JsonPropertyOrder({
  SecurityAgentInvestigationMitigationAction.JSON_PROPERTY_APPLIED,
  SecurityAgentInvestigationMitigationAction.JSON_PROPERTY_APPLIED_AT,
  SecurityAgentInvestigationMitigationAction.JSON_PROPERTY_APPLIED_BY,
  SecurityAgentInvestigationMitigationAction.JSON_PROPERTY_FQN,
  SecurityAgentInvestigationMitigationAction.JSON_PROPERTY_ID,
  SecurityAgentInvestigationMitigationAction.JSON_PROPERTY_NAME,
  SecurityAgentInvestigationMitigationAction.JSON_PROPERTY_RESOURCE,
  SecurityAgentInvestigationMitigationAction.JSON_PROPERTY_SOURCE,
  SecurityAgentInvestigationMitigationAction.JSON_PROPERTY_SOURCE_CONNECTED,
  SecurityAgentInvestigationMitigationAction.JSON_PROPERTY_TARGET
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class SecurityAgentInvestigationMitigationAction {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_APPLIED = "applied";
  private Boolean applied;

  public static final String JSON_PROPERTY_APPLIED_AT = "applied_at";
  private OffsetDateTime appliedAt;

  public static final String JSON_PROPERTY_APPLIED_BY = "applied_by";
  private String appliedBy;

  public static final String JSON_PROPERTY_FQN = "fqn";
  private String fqn;

  public static final String JSON_PROPERTY_ID = "id";
  private String id;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_RESOURCE = "resource";
  private String resource;

  public static final String JSON_PROPERTY_SOURCE = "source";
  private String source;

  public static final String JSON_PROPERTY_SOURCE_CONNECTED = "source_connected";
  private Boolean sourceConnected;

  public static final String JSON_PROPERTY_TARGET = "target";
  private String target;

  public SecurityAgentInvestigationMitigationAction() {}

  @JsonCreator
  public SecurityAgentInvestigationMitigationAction(
      @JsonProperty(required = true, value = JSON_PROPERTY_APPLIED) Boolean applied,
      @JsonProperty(required = true, value = JSON_PROPERTY_ID) String id,
      @JsonProperty(required = true, value = JSON_PROPERTY_SOURCE) String source,
      @JsonProperty(required = true, value = JSON_PROPERTY_SOURCE_CONNECTED)
          Boolean sourceConnected) {
    this.applied = applied;
    this.id = id;
    this.source = source;
    this.sourceConnected = sourceConnected;
  }

  public SecurityAgentInvestigationMitigationAction applied(Boolean applied) {
    this.applied = applied;
    return this;
  }

  /**
   * Whether the action has run.
   *
   * @return applied
   */
  @JsonProperty(JSON_PROPERTY_APPLIED)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Boolean getApplied() {
    return applied;
  }

  public void setApplied(Boolean applied) {
    this.applied = applied;
  }

  public SecurityAgentInvestigationMitigationAction appliedAt(OffsetDateTime appliedAt) {
    this.appliedAt = appliedAt;
    return this;
  }

  /**
   * When the action ran.
   *
   * @return appliedAt
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_APPLIED_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public OffsetDateTime getAppliedAt() {
    return appliedAt;
  }

  public void setAppliedAt(OffsetDateTime appliedAt) {
    this.appliedAt = appliedAt;
  }

  public SecurityAgentInvestigationMitigationAction appliedBy(String appliedBy) {
    this.appliedBy = appliedBy;
    return this;
  }

  /**
   * Who ran the action.
   *
   * @return appliedBy
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_APPLIED_BY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getAppliedBy() {
    return appliedBy;
  }

  public void setAppliedBy(String appliedBy) {
    this.appliedBy = appliedBy;
  }

  public SecurityAgentInvestigationMitigationAction fqn(String fqn) {
    this.fqn = fqn;
    return this;
  }

  /**
   * ID of the action in the Action Catalog.
   *
   * @return fqn
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_FQN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getFqn() {
    return fqn;
  }

  public void setFqn(String fqn) {
    this.fqn = fqn;
  }

  public SecurityAgentInvestigationMitigationAction id(String id) {
    this.id = id;
    return this;
  }

  /**
   * ID of the action.
   *
   * @return id
   */
  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public SecurityAgentInvestigationMitigationAction name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Name of the action in the Action Catalog.
   *
   * @return name
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public SecurityAgentInvestigationMitigationAction resource(String resource) {
    this.resource = resource;
    return this;
  }

  /**
   * The resource the action changes.
   *
   * @return resource
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_RESOURCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getResource() {
    return resource;
  }

  public void setResource(String resource) {
    this.resource = resource;
  }

  public SecurityAgentInvestigationMitigationAction source(String source) {
    this.source = source;
    return this;
  }

  /**
   * Integration that runs the action, such as <code>dd</code>, <code>aws</code>, or <code>okta
   * </code>.
   *
   * @return source
   */
  @JsonProperty(JSON_PROPERTY_SOURCE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getSource() {
    return source;
  }

  public void setSource(String source) {
    this.source = source;
  }

  public SecurityAgentInvestigationMitigationAction sourceConnected(Boolean sourceConnected) {
    this.sourceConnected = sourceConnected;
    return this;
  }

  /**
   * Whether the organization has a connection that can run the action.
   *
   * @return sourceConnected
   */
  @JsonProperty(JSON_PROPERTY_SOURCE_CONNECTED)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Boolean getSourceConnected() {
    return sourceConnected;
  }

  public void setSourceConnected(Boolean sourceConnected) {
    this.sourceConnected = sourceConnected;
  }

  public SecurityAgentInvestigationMitigationAction target(String target) {
    this.target = target;
    return this;
  }

  /**
   * What the action targets.
   *
   * @return target
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TARGET)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getTarget() {
    return target;
  }

  public void setTarget(String target) {
    this.target = target;
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
   * @return SecurityAgentInvestigationMitigationAction
   */
  @JsonAnySetter
  public SecurityAgentInvestigationMitigationAction putAdditionalProperty(
      String key, Object value) {
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

  /** Return true if this SecurityAgentInvestigationMitigationAction object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SecurityAgentInvestigationMitigationAction securityAgentInvestigationMitigationAction =
        (SecurityAgentInvestigationMitigationAction) o;
    return Objects.equals(this.applied, securityAgentInvestigationMitigationAction.applied)
        && Objects.equals(this.appliedAt, securityAgentInvestigationMitigationAction.appliedAt)
        && Objects.equals(this.appliedBy, securityAgentInvestigationMitigationAction.appliedBy)
        && Objects.equals(this.fqn, securityAgentInvestigationMitigationAction.fqn)
        && Objects.equals(this.id, securityAgentInvestigationMitigationAction.id)
        && Objects.equals(this.name, securityAgentInvestigationMitigationAction.name)
        && Objects.equals(this.resource, securityAgentInvestigationMitigationAction.resource)
        && Objects.equals(this.source, securityAgentInvestigationMitigationAction.source)
        && Objects.equals(
            this.sourceConnected, securityAgentInvestigationMitigationAction.sourceConnected)
        && Objects.equals(this.target, securityAgentInvestigationMitigationAction.target)
        && Objects.equals(
            this.additionalProperties,
            securityAgentInvestigationMitigationAction.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        applied,
        appliedAt,
        appliedBy,
        fqn,
        id,
        name,
        resource,
        source,
        sourceConnected,
        target,
        additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SecurityAgentInvestigationMitigationAction {\n");
    sb.append("    applied: ").append(toIndentedString(applied)).append("\n");
    sb.append("    appliedAt: ").append(toIndentedString(appliedAt)).append("\n");
    sb.append("    appliedBy: ").append(toIndentedString(appliedBy)).append("\n");
    sb.append("    fqn: ").append(toIndentedString(fqn)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    resource: ").append(toIndentedString(resource)).append("\n");
    sb.append("    source: ").append(toIndentedString(source)).append("\n");
    sb.append("    sourceConnected: ").append(toIndentedString(sourceConnected)).append("\n");
    sb.append("    target: ").append(toIndentedString(target)).append("\n");
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
