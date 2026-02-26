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

/** Anonymous assignee entity. */
@JsonPropertyOrder({
  IncidentTodoAnonymousAssignee.JSON_PROPERTY_ICON,
  IncidentTodoAnonymousAssignee.JSON_PROPERTY_ID,
  IncidentTodoAnonymousAssignee.JSON_PROPERTY_NAME,
  IncidentTodoAnonymousAssignee.JSON_PROPERTY_SOURCE
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class IncidentTodoAnonymousAssignee {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_ICON = "icon";
  private String icon;

  public static final String JSON_PROPERTY_ID = "id";
  private String id;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_SOURCE = "source";
  private IncidentTodoAnonymousAssigneeSource source = IncidentTodoAnonymousAssigneeSource.SLACK;

  public IncidentTodoAnonymousAssignee() {}

  @JsonCreator
  public IncidentTodoAnonymousAssignee(
      @JsonProperty(required = true, value = JSON_PROPERTY_ICON) String icon,
      @JsonProperty(required = true, value = JSON_PROPERTY_ID) String id,
      @JsonProperty(required = true, value = JSON_PROPERTY_NAME) String name,
      @JsonProperty(required = true, value = JSON_PROPERTY_SOURCE)
          IncidentTodoAnonymousAssigneeSource source) {
    this.icon = icon;
    this.id = id;
    this.name = name;
    this.source = source;
    this.unparsed |= !source.isValid();
  }

  public IncidentTodoAnonymousAssignee icon(String icon) {
    this.icon = icon;
    return this;
  }

  /**
   * URL for assignee's icon.
   *
   * @return icon
   */
  @JsonProperty(JSON_PROPERTY_ICON)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getIcon() {
    return icon;
  }

  public void setIcon(String icon) {
    this.icon = icon;
  }

  public IncidentTodoAnonymousAssignee id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Anonymous assignee's ID.
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

  public IncidentTodoAnonymousAssignee name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Assignee's name.
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

  public IncidentTodoAnonymousAssignee source(IncidentTodoAnonymousAssigneeSource source) {
    this.source = source;
    this.unparsed |= !source.isValid();
    return this;
  }

  /**
   * The source of the anonymous assignee.
   *
   * @return source
   */
  @JsonProperty(JSON_PROPERTY_SOURCE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public IncidentTodoAnonymousAssigneeSource getSource() {
    return source;
  }

  public void setSource(IncidentTodoAnonymousAssigneeSource source) {
    if (!source.isValid()) {
      this.unparsed = true;
    }
    this.source = source;
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
   * @return IncidentTodoAnonymousAssignee
   */
  @JsonAnySetter
  public IncidentTodoAnonymousAssignee putAdditionalProperty(String key, Object value) {
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

  /** Return true if this IncidentTodoAnonymousAssignee object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IncidentTodoAnonymousAssignee incidentTodoAnonymousAssignee = (IncidentTodoAnonymousAssignee) o;
    return Objects.equals(this.icon, incidentTodoAnonymousAssignee.icon)
        && Objects.equals(this.id, incidentTodoAnonymousAssignee.id)
        && Objects.equals(this.name, incidentTodoAnonymousAssignee.name)
        && Objects.equals(this.source, incidentTodoAnonymousAssignee.source)
        && Objects.equals(
            this.additionalProperties, incidentTodoAnonymousAssignee.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(icon, id, name, source, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IncidentTodoAnonymousAssignee {\n");
    sb.append("    icon: ").append(toIndentedString(icon)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    source: ").append(toIndentedString(source)).append("\n");
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
