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
import org.openapitools.jackson.nullable.JsonNullable;

/** Attributes of an incident user-defined role. */
@JsonPropertyOrder({
  IncidentUserDefinedRoleDataAttributesResponse.JSON_PROPERTY_CREATED,
  IncidentUserDefinedRoleDataAttributesResponse.JSON_PROPERTY_DESCRIPTION,
  IncidentUserDefinedRoleDataAttributesResponse.JSON_PROPERTY_MODIFIED,
  IncidentUserDefinedRoleDataAttributesResponse.JSON_PROPERTY_NAME,
  IncidentUserDefinedRoleDataAttributesResponse.JSON_PROPERTY_POLICY
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class IncidentUserDefinedRoleDataAttributesResponse {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_CREATED = "created";
  private OffsetDateTime created;

  public static final String JSON_PROPERTY_DESCRIPTION = "description";
  private JsonNullable<String> description = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_MODIFIED = "modified";
  private OffsetDateTime modified;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_POLICY = "policy";
  private IncidentUserDefinedRolePolicy policy;

  public IncidentUserDefinedRoleDataAttributesResponse() {}

  @JsonCreator
  public IncidentUserDefinedRoleDataAttributesResponse(
      @JsonProperty(required = true, value = JSON_PROPERTY_CREATED) OffsetDateTime created,
      @JsonProperty(required = true, value = JSON_PROPERTY_MODIFIED) OffsetDateTime modified,
      @JsonProperty(required = true, value = JSON_PROPERTY_NAME) String name,
      @JsonProperty(required = true, value = JSON_PROPERTY_POLICY)
          IncidentUserDefinedRolePolicy policy) {
    this.created = created;
    this.modified = modified;
    this.name = name;
    this.policy = policy;
    this.unparsed |= policy.unparsed;
  }

  public IncidentUserDefinedRoleDataAttributesResponse created(OffsetDateTime created) {
    this.created = created;
    return this;
  }

  /**
   * Timestamp when the role was created.
   *
   * @return created
   */
  @JsonProperty(JSON_PROPERTY_CREATED)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public OffsetDateTime getCreated() {
    return created;
  }

  public void setCreated(OffsetDateTime created) {
    this.created = created;
  }

  public IncidentUserDefinedRoleDataAttributesResponse description(String description) {
    this.description = JsonNullable.<String>of(description);
    return this;
  }

  /**
   * A description of the user-defined role.
   *
   * @return description
   */
  @jakarta.annotation.Nullable
  @JsonIgnore
  public String getDescription() {
    return description.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_DESCRIPTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<String> getDescription_JsonNullable() {
    return description;
  }

  @JsonProperty(JSON_PROPERTY_DESCRIPTION)
  public void setDescription_JsonNullable(JsonNullable<String> description) {
    this.description = description;
  }

  public void setDescription(String description) {
    this.description = JsonNullable.<String>of(description);
  }

  public IncidentUserDefinedRoleDataAttributesResponse modified(OffsetDateTime modified) {
    this.modified = modified;
    return this;
  }

  /**
   * Timestamp when the role was last modified.
   *
   * @return modified
   */
  @JsonProperty(JSON_PROPERTY_MODIFIED)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public OffsetDateTime getModified() {
    return modified;
  }

  public void setModified(OffsetDateTime modified) {
    this.modified = modified;
  }

  public IncidentUserDefinedRoleDataAttributesResponse name(String name) {
    this.name = name;
    return this;
  }

  /**
   * The name of the user-defined role.
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

  public IncidentUserDefinedRoleDataAttributesResponse policy(
      IncidentUserDefinedRolePolicy policy) {
    this.policy = policy;
    this.unparsed |= policy.unparsed;
    return this;
  }

  /**
   * Policy configuration for a user-defined role.
   *
   * @return policy
   */
  @JsonProperty(JSON_PROPERTY_POLICY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public IncidentUserDefinedRolePolicy getPolicy() {
    return policy;
  }

  public void setPolicy(IncidentUserDefinedRolePolicy policy) {
    this.policy = policy;
    if (policy != null) {
      this.unparsed |= policy.unparsed;
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
   * @return IncidentUserDefinedRoleDataAttributesResponse
   */
  @JsonAnySetter
  public IncidentUserDefinedRoleDataAttributesResponse putAdditionalProperty(
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

  /** Return true if this IncidentUserDefinedRoleDataAttributesResponse object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IncidentUserDefinedRoleDataAttributesResponse incidentUserDefinedRoleDataAttributesResponse =
        (IncidentUserDefinedRoleDataAttributesResponse) o;
    return Objects.equals(this.created, incidentUserDefinedRoleDataAttributesResponse.created)
        && Objects.equals(
            this.description, incidentUserDefinedRoleDataAttributesResponse.description)
        && Objects.equals(this.modified, incidentUserDefinedRoleDataAttributesResponse.modified)
        && Objects.equals(this.name, incidentUserDefinedRoleDataAttributesResponse.name)
        && Objects.equals(this.policy, incidentUserDefinedRoleDataAttributesResponse.policy)
        && Objects.equals(
            this.additionalProperties,
            incidentUserDefinedRoleDataAttributesResponse.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(created, description, modified, name, policy, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IncidentUserDefinedRoleDataAttributesResponse {\n");
    sb.append("    created: ").append(toIndentedString(created)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    modified: ").append(toIndentedString(modified)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    policy: ").append(toIndentedString(policy)).append("\n");
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
