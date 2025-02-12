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

/** The definition of <code>WorkflowDataRelationships</code> object. */
@JsonPropertyOrder({
  WorkflowDataRelationships.JSON_PROPERTY_CREATOR,
  WorkflowDataRelationships.JSON_PROPERTY_OWNER
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class WorkflowDataRelationships {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_CREATOR = "creator";
  private WorkflowUserRelationship creator;

  public static final String JSON_PROPERTY_OWNER = "owner";
  private WorkflowUserRelationship owner;

  public WorkflowDataRelationships creator(WorkflowUserRelationship creator) {
    this.creator = creator;
    this.unparsed |= creator.unparsed;
    return this;
  }

  /**
   * The definition of <code>WorkflowUserRelationship</code> object.
   *
   * @return creator
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CREATOR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public WorkflowUserRelationship getCreator() {
    return creator;
  }

  public void setCreator(WorkflowUserRelationship creator) {
    this.creator = creator;
  }

  public WorkflowDataRelationships owner(WorkflowUserRelationship owner) {
    this.owner = owner;
    this.unparsed |= owner.unparsed;
    return this;
  }

  /**
   * The definition of <code>WorkflowUserRelationship</code> object.
   *
   * @return owner
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_OWNER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public WorkflowUserRelationship getOwner() {
    return owner;
  }

  public void setOwner(WorkflowUserRelationship owner) {
    this.owner = owner;
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
   * @return WorkflowDataRelationships
   */
  @JsonAnySetter
  public WorkflowDataRelationships putAdditionalProperty(String key, Object value) {
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

  /** Return true if this WorkflowDataRelationships object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WorkflowDataRelationships workflowDataRelationships = (WorkflowDataRelationships) o;
    return Objects.equals(this.creator, workflowDataRelationships.creator)
        && Objects.equals(this.owner, workflowDataRelationships.owner)
        && Objects.equals(
            this.additionalProperties, workflowDataRelationships.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(creator, owner, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WorkflowDataRelationships {\n");
    sb.append("    creator: ").append(toIndentedString(creator)).append("\n");
    sb.append("    owner: ").append(toIndentedString(owner)).append("\n");
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
