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

/** The incident service's relationships. */
@JsonPropertyOrder({
  IncidentServiceRelationships.JSON_PROPERTY_CREATED_BY,
  IncidentServiceRelationships.JSON_PROPERTY_LAST_MODIFIED_BY
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class IncidentServiceRelationships {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_CREATED_BY = "created_by";
  private RelationshipToUser createdBy;

  public static final String JSON_PROPERTY_LAST_MODIFIED_BY = "last_modified_by";
  private RelationshipToUser lastModifiedBy;

  public IncidentServiceRelationships createdBy(RelationshipToUser createdBy) {
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

  public IncidentServiceRelationships lastModifiedBy(RelationshipToUser lastModifiedBy) {
    this.lastModifiedBy = lastModifiedBy;
    this.unparsed |= lastModifiedBy.unparsed;
    return this;
  }

  /**
   * Relationship to user.
   *
   * @return lastModifiedBy
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LAST_MODIFIED_BY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public RelationshipToUser getLastModifiedBy() {
    return lastModifiedBy;
  }

  public void setLastModifiedBy(RelationshipToUser lastModifiedBy) {
    this.lastModifiedBy = lastModifiedBy;
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
   * @return IncidentServiceRelationships
   */
  @JsonAnySetter
  public IncidentServiceRelationships putAdditionalProperty(String key, Object value) {
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

  /** Return true if this IncidentServiceRelationships object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IncidentServiceRelationships incidentServiceRelationships = (IncidentServiceRelationships) o;
    return Objects.equals(this.createdBy, incidentServiceRelationships.createdBy)
        && Objects.equals(this.lastModifiedBy, incidentServiceRelationships.lastModifiedBy)
        && Objects.equals(
            this.additionalProperties, incidentServiceRelationships.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(createdBy, lastModifiedBy, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IncidentServiceRelationships {\n");
    sb.append("    createdBy: ").append(toIndentedString(createdBy)).append("\n");
    sb.append("    lastModifiedBy: ").append(toIndentedString(lastModifiedBy)).append("\n");
    sb.append("    additionalProperties: ")
        .append(toIndentedString(additionalProperties))
        .append("\n");
    sb.append("}");
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
