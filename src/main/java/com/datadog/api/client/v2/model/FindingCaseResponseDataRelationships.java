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

/** Relationships of the case. */
@JsonPropertyOrder({
  FindingCaseResponseDataRelationships.JSON_PROPERTY_CREATED_BY,
  FindingCaseResponseDataRelationships.JSON_PROPERTY_MODIFIED_BY,
  FindingCaseResponseDataRelationships.JSON_PROPERTY_PROJECT
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class FindingCaseResponseDataRelationships {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_CREATED_BY = "created_by";
  private RelationshipToUser createdBy;

  public static final String JSON_PROPERTY_MODIFIED_BY = "modified_by";
  private RelationshipToUser modifiedBy;

  public static final String JSON_PROPERTY_PROJECT = "project";
  private CaseManagementProject project;

  public FindingCaseResponseDataRelationships createdBy(RelationshipToUser createdBy) {
    this.createdBy = createdBy;
    this.unparsed |= createdBy.unparsed;
    return this;
  }

  /**
   * Relationship to user.
   *
   * @return createdBy
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CREATED_BY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public RelationshipToUser getCreatedBy() {
    return createdBy;
  }

  public void setCreatedBy(RelationshipToUser createdBy) {
    this.createdBy = createdBy;
  }

  public FindingCaseResponseDataRelationships modifiedBy(RelationshipToUser modifiedBy) {
    this.modifiedBy = modifiedBy;
    this.unparsed |= modifiedBy.unparsed;
    return this;
  }

  /**
   * Relationship to user.
   *
   * @return modifiedBy
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_MODIFIED_BY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public RelationshipToUser getModifiedBy() {
    return modifiedBy;
  }

  public void setModifiedBy(RelationshipToUser modifiedBy) {
    this.modifiedBy = modifiedBy;
  }

  public FindingCaseResponseDataRelationships project(CaseManagementProject project) {
    this.project = project;
    this.unparsed |= project.unparsed;
    return this;
  }

  /**
   * Case management project.
   *
   * @return project
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PROJECT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public CaseManagementProject getProject() {
    return project;
  }

  public void setProject(CaseManagementProject project) {
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
   * @return FindingCaseResponseDataRelationships
   */
  @JsonAnySetter
  public FindingCaseResponseDataRelationships putAdditionalProperty(String key, Object value) {
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

  /** Return true if this FindingCaseResponseDataRelationships object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FindingCaseResponseDataRelationships findingCaseResponseDataRelationships =
        (FindingCaseResponseDataRelationships) o;
    return Objects.equals(this.createdBy, findingCaseResponseDataRelationships.createdBy)
        && Objects.equals(this.modifiedBy, findingCaseResponseDataRelationships.modifiedBy)
        && Objects.equals(this.project, findingCaseResponseDataRelationships.project)
        && Objects.equals(
            this.additionalProperties, findingCaseResponseDataRelationships.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(createdBy, modifiedBy, project, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FindingCaseResponseDataRelationships {\n");
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
