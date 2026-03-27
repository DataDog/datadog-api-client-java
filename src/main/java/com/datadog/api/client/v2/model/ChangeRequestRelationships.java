/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v2.model;

import java.io.File;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;
import java.util.HashMap;
import java.util.Map;
import java.util.List;
import java.util.ArrayList;
import java.util.UUID;
import java.time.OffsetDateTime;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import org.openapitools.jackson.nullable.JsonNullable;

import com.datadog.api.client.JsonTimeSerializer;


/**
   * <p>Relationships of a change request.</p>
 */
@JsonPropertyOrder({
  ChangeRequestRelationships.JSON_PROPERTY_CHANGE_REQUEST_DECISIONS,
  ChangeRequestRelationships.JSON_PROPERTY_CREATED_BY,
  ChangeRequestRelationships.JSON_PROPERTY_MODIFIED_BY
})
@jakarta.annotation.Generated(value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class ChangeRequestRelationships {
  @JsonIgnore
  public boolean unparsed = false;
  public static final String JSON_PROPERTY_CHANGE_REQUEST_DECISIONS = "change_request_decisions";
  private ChangeRequestDecisionsRelationship changeRequestDecisions;

  public static final String JSON_PROPERTY_CREATED_BY = "created_by";
  private ChangeRequestUserRelationship createdBy;

  public static final String JSON_PROPERTY_MODIFIED_BY = "modified_by";
  private ChangeRequestUserRelationship modifiedBy;

  public ChangeRequestRelationships() {}

  @JsonCreator
  public ChangeRequestRelationships(
            @JsonProperty(required=true, value=JSON_PROPERTY_CHANGE_REQUEST_DECISIONS)ChangeRequestDecisionsRelationship changeRequestDecisions,
            @JsonProperty(required=true, value=JSON_PROPERTY_CREATED_BY)ChangeRequestUserRelationship createdBy,
            @JsonProperty(required=true, value=JSON_PROPERTY_MODIFIED_BY)ChangeRequestUserRelationship modifiedBy) {
        this.changeRequestDecisions = changeRequestDecisions;
        this.unparsed |= changeRequestDecisions.unparsed;
        this.createdBy = createdBy;
        this.unparsed |= createdBy.unparsed;
        this.modifiedBy = modifiedBy;
        this.unparsed |= modifiedBy.unparsed;
  }
  public ChangeRequestRelationships changeRequestDecisions(ChangeRequestDecisionsRelationship changeRequestDecisions) {
    this.changeRequestDecisions = changeRequestDecisions;
    this.unparsed |= changeRequestDecisions.unparsed;
    return this;
  }

  /**
   * <p>Relationship to change request decisions.</p>
   * @return changeRequestDecisions
  **/
      @JsonProperty(JSON_PROPERTY_CHANGE_REQUEST_DECISIONS)
      @JsonInclude(
        value = JsonInclude.Include.ALWAYS)
      public ChangeRequestDecisionsRelationship getChangeRequestDecisions() {
        return changeRequestDecisions;
      }
  public void setChangeRequestDecisions(ChangeRequestDecisionsRelationship changeRequestDecisions) {
    this.changeRequestDecisions = changeRequestDecisions;
  }
  public ChangeRequestRelationships createdBy(ChangeRequestUserRelationship createdBy) {
    this.createdBy = createdBy;
    this.unparsed |= createdBy.unparsed;
    return this;
  }

  /**
   * <p>Relationship to a user.</p>
   * @return createdBy
  **/
      @JsonProperty(JSON_PROPERTY_CREATED_BY)
      @JsonInclude(
        value = JsonInclude.Include.ALWAYS)
      public ChangeRequestUserRelationship getCreatedBy() {
        return createdBy;
      }
  public void setCreatedBy(ChangeRequestUserRelationship createdBy) {
    this.createdBy = createdBy;
  }
  public ChangeRequestRelationships modifiedBy(ChangeRequestUserRelationship modifiedBy) {
    this.modifiedBy = modifiedBy;
    this.unparsed |= modifiedBy.unparsed;
    return this;
  }

  /**
   * <p>Relationship to a user.</p>
   * @return modifiedBy
  **/
      @JsonProperty(JSON_PROPERTY_MODIFIED_BY)
      @JsonInclude(
        value = JsonInclude.Include.ALWAYS)
      public ChangeRequestUserRelationship getModifiedBy() {
        return modifiedBy;
      }
  public void setModifiedBy(ChangeRequestUserRelationship modifiedBy) {
    this.modifiedBy = modifiedBy;
  }

  /**
   * A container for additional, undeclared properties.
   * This is a holder for any undeclared properties as specified with
   * the 'additionalProperties' keyword in the OAS document.
   */
  private Map<String, Object> additionalProperties;

  /**
   * Set the additional (undeclared) property with the specified name and value.
   * If the property does not already exist, create it otherwise replace it.
   *
   * @param key The arbitrary key to set
   * @param value The associated value
   * @return ChangeRequestRelationships
   */
  @JsonAnySetter
  public ChangeRequestRelationships putAdditionalProperty(String key, Object value) {
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

  /**
   * Return true if this ChangeRequestRelationships object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ChangeRequestRelationships changeRequestRelationships = (ChangeRequestRelationships) o;
    return Objects.equals(this.changeRequestDecisions, changeRequestRelationships.changeRequestDecisions) && Objects.equals(this.createdBy, changeRequestRelationships.createdBy) && Objects.equals(this.modifiedBy, changeRequestRelationships.modifiedBy) && Objects.equals(this.additionalProperties, changeRequestRelationships.additionalProperties);
  }


  @Override
  public int hashCode() {
    return Objects.hash(changeRequestDecisions,createdBy,modifiedBy, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ChangeRequestRelationships {\n");
    sb.append("    changeRequestDecisions: ").append(toIndentedString(changeRequestDecisions)).append("\n");
    sb.append("    createdBy: ").append(toIndentedString(createdBy)).append("\n");
    sb.append("    modifiedBy: ").append(toIndentedString(modifiedBy)).append("\n");
    sb.append("    additionalProperties: ")
        .append(toIndentedString(additionalProperties))
        .append("\n");
    sb.append('}');
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
