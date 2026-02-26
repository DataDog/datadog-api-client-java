/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v2.model;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import org.openapitools.jackson.nullable.JsonNullable;

/** Resources related to a case */
@JsonPropertyOrder({
  CaseRelationships.JSON_PROPERTY_ASSIGNEE,
  CaseRelationships.JSON_PROPERTY_CREATED_BY,
  CaseRelationships.JSON_PROPERTY_MODIFIED_BY,
  CaseRelationships.JSON_PROPERTY_PROJECT
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class CaseRelationships {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_ASSIGNEE = "assignee";
  private JsonNullable<NullableUserRelationship> assignee =
      JsonNullable.<NullableUserRelationship>undefined();

  public static final String JSON_PROPERTY_CREATED_BY = "created_by";
  private JsonNullable<NullableUserRelationship> createdBy =
      JsonNullable.<NullableUserRelationship>undefined();

  public static final String JSON_PROPERTY_MODIFIED_BY = "modified_by";
  private JsonNullable<NullableUserRelationship> modifiedBy =
      JsonNullable.<NullableUserRelationship>undefined();

  public static final String JSON_PROPERTY_PROJECT = "project";
  private ProjectRelationship project;

  public CaseRelationships assignee(NullableUserRelationship assignee) {
    this.assignee = JsonNullable.<NullableUserRelationship>of(assignee);
    return this;
  }

  /**
   * Relationship to user.
   *
   * @return assignee
   */
  @jakarta.annotation.Nullable
  @JsonIgnore
  public NullableUserRelationship getAssignee() {
    return assignee.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_ASSIGNEE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<NullableUserRelationship> getAssignee_JsonNullable() {
    return assignee;
  }

  @JsonProperty(JSON_PROPERTY_ASSIGNEE)
  public void setAssignee_JsonNullable(JsonNullable<NullableUserRelationship> assignee) {
    this.assignee = assignee;
  }

  public void setAssignee(NullableUserRelationship assignee) {
    this.assignee = JsonNullable.<NullableUserRelationship>of(assignee);
  }

  public CaseRelationships createdBy(NullableUserRelationship createdBy) {
    this.createdBy = JsonNullable.<NullableUserRelationship>of(createdBy);
    return this;
  }

  /**
   * Relationship to user.
   *
   * @return createdBy
   */
  @jakarta.annotation.Nullable
  @JsonIgnore
  public NullableUserRelationship getCreatedBy() {
    return createdBy.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_CREATED_BY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<NullableUserRelationship> getCreatedBy_JsonNullable() {
    return createdBy;
  }

  @JsonProperty(JSON_PROPERTY_CREATED_BY)
  public void setCreatedBy_JsonNullable(JsonNullable<NullableUserRelationship> createdBy) {
    this.createdBy = createdBy;
  }

  public void setCreatedBy(NullableUserRelationship createdBy) {
    this.createdBy = JsonNullable.<NullableUserRelationship>of(createdBy);
  }

  public CaseRelationships modifiedBy(NullableUserRelationship modifiedBy) {
    this.modifiedBy = JsonNullable.<NullableUserRelationship>of(modifiedBy);
    return this;
  }

  /**
   * Relationship to user.
   *
   * @return modifiedBy
   */
  @jakarta.annotation.Nullable
  @JsonIgnore
  public NullableUserRelationship getModifiedBy() {
    return modifiedBy.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_MODIFIED_BY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<NullableUserRelationship> getModifiedBy_JsonNullable() {
    return modifiedBy;
  }

  @JsonProperty(JSON_PROPERTY_MODIFIED_BY)
  public void setModifiedBy_JsonNullable(JsonNullable<NullableUserRelationship> modifiedBy) {
    this.modifiedBy = modifiedBy;
  }

  public void setModifiedBy(NullableUserRelationship modifiedBy) {
    this.modifiedBy = JsonNullable.<NullableUserRelationship>of(modifiedBy);
  }

  public CaseRelationships project(ProjectRelationship project) {
    this.project = project;
    this.unparsed |= project.unparsed;
    return this;
  }

  /**
   * Relationship to project
   *
   * @return project
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PROJECT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public ProjectRelationship getProject() {
    return project;
  }

  public void setProject(ProjectRelationship project) {
    this.project = project;
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
   * @return CaseRelationships
   */
  @JsonAnySetter
  public CaseRelationships putAdditionalProperty(String key, Object value) {
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

  /** Return true if this CaseRelationships object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CaseRelationships caseRelationships = (CaseRelationships) o;
    return Objects.equals(this.assignee, caseRelationships.assignee)
        && Objects.equals(this.createdBy, caseRelationships.createdBy)
        && Objects.equals(this.modifiedBy, caseRelationships.modifiedBy)
        && Objects.equals(this.project, caseRelationships.project)
        && Objects.equals(this.additionalProperties, caseRelationships.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(assignee, createdBy, modifiedBy, project, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CaseRelationships {\n");
    sb.append("    assignee: ").append(toIndentedString(assignee)).append("\n");
    sb.append("    createdBy: ").append(toIndentedString(createdBy)).append("\n");
    sb.append("    modifiedBy: ").append(toIndentedString(modifiedBy)).append("\n");
    sb.append("    project: ").append(toIndentedString(project)).append("\n");
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
