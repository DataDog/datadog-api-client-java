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

/**
 * Represents a user who is subscribed to notifications for a case. Watchers receive updates when
 * the case's status, priority, assignee, or comments change.
 */
@JsonPropertyOrder({
  CaseWatcher.JSON_PROPERTY_ID,
  CaseWatcher.JSON_PROPERTY_RELATIONSHIPS,
  CaseWatcher.JSON_PROPERTY_TYPE
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class CaseWatcher {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_ID = "id";
  private String id;

  public static final String JSON_PROPERTY_RELATIONSHIPS = "relationships";
  private CaseWatcherRelationships relationships;

  public static final String JSON_PROPERTY_TYPE = "type";
  private CaseWatcherResourceType type = CaseWatcherResourceType.WATCHER;

  public CaseWatcher() {}

  @JsonCreator
  public CaseWatcher(
      @JsonProperty(required = true, value = JSON_PROPERTY_ID) String id,
      @JsonProperty(required = true, value = JSON_PROPERTY_RELATIONSHIPS)
          CaseWatcherRelationships relationships,
      @JsonProperty(required = true, value = JSON_PROPERTY_TYPE) CaseWatcherResourceType type) {
    this.id = id;
    this.relationships = relationships;
    this.unparsed |= relationships.unparsed;
    this.type = type;
    this.unparsed |= !type.isValid();
  }

  public CaseWatcher id(String id) {
    this.id = id;
    return this;
  }

  /**
   * The primary identifier of the case watcher.
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

  public CaseWatcher relationships(CaseWatcherRelationships relationships) {
    this.relationships = relationships;
    this.unparsed |= relationships.unparsed;
    return this;
  }

  /**
   * Relationships for a case watcher, linking to the underlying user resource.
   *
   * @return relationships
   */
  @JsonProperty(JSON_PROPERTY_RELATIONSHIPS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public CaseWatcherRelationships getRelationships() {
    return relationships;
  }

  public void setRelationships(CaseWatcherRelationships relationships) {
    this.relationships = relationships;
    if (relationships != null) {
      this.unparsed |= relationships.unparsed;
    }
  }

  public CaseWatcher type(CaseWatcherResourceType type) {
    this.type = type;
    this.unparsed |= !type.isValid();
    return this;
  }

  /**
   * JSON:API resource type for case watchers.
   *
   * @return type
   */
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public CaseWatcherResourceType getType() {
    return type;
  }

  public void setType(CaseWatcherResourceType type) {
    if (!type.isValid()) {
      this.unparsed = true;
    }
    this.type = type;
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
   * @return CaseWatcher
   */
  @JsonAnySetter
  public CaseWatcher putAdditionalProperty(String key, Object value) {
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

  /** Return true if this CaseWatcher object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CaseWatcher caseWatcher = (CaseWatcher) o;
    return Objects.equals(this.id, caseWatcher.id)
        && Objects.equals(this.relationships, caseWatcher.relationships)
        && Objects.equals(this.type, caseWatcher.type)
        && Objects.equals(this.additionalProperties, caseWatcher.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, relationships, type, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CaseWatcher {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    relationships: ").append(toIndentedString(relationships)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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
