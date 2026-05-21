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

/** Attributes for publishing a status page notice. */
@JsonPropertyOrder({
  IncidentStatusPageNoticeCreateDataAttributes.JSON_PROPERTY_COMPONENTS,
  IncidentStatusPageNoticeCreateDataAttributes.JSON_PROPERTY_MESSAGE,
  IncidentStatusPageNoticeCreateDataAttributes.JSON_PROPERTY_STATUS,
  IncidentStatusPageNoticeCreateDataAttributes.JSON_PROPERTY_TITLE
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class IncidentStatusPageNoticeCreateDataAttributes {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_COMPONENTS = "components";
  private Map<String, String> components = null;

  public static final String JSON_PROPERTY_MESSAGE = "message";
  private String message;

  public static final String JSON_PROPERTY_STATUS = "status";
  private String status;

  public static final String JSON_PROPERTY_TITLE = "title";
  private String title;

  public IncidentStatusPageNoticeCreateDataAttributes components(Map<String, String> components) {
    this.components = components;
    return this;
  }

  public IncidentStatusPageNoticeCreateDataAttributes putComponentsItem(
      String key, String componentsItem) {
    if (this.components == null) {
      this.components = new HashMap<>();
    }
    this.components.put(key, componentsItem);
    return this;
  }

  /**
   * Map of component identifiers to their status.
   *
   * @return components
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_COMPONENTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Map<String, String> getComponents() {
    return components;
  }

  public void setComponents(Map<String, String> components) {
    this.components = components;
  }

  public IncidentStatusPageNoticeCreateDataAttributes message(String message) {
    this.message = message;
    return this;
  }

  /**
   * The message body of the notice.
   *
   * @return message
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_MESSAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  public IncidentStatusPageNoticeCreateDataAttributes status(String status) {
    this.status = status;
    return this;
  }

  /**
   * The status of the notice.
   *
   * @return status
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public IncidentStatusPageNoticeCreateDataAttributes title(String title) {
    this.title = title;
    return this;
  }

  /**
   * The title of the notice.
   *
   * @return title
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TITLE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
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
   * @return IncidentStatusPageNoticeCreateDataAttributes
   */
  @JsonAnySetter
  public IncidentStatusPageNoticeCreateDataAttributes putAdditionalProperty(
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

  /** Return true if this IncidentStatusPageNoticeCreateDataAttributes object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IncidentStatusPageNoticeCreateDataAttributes incidentStatusPageNoticeCreateDataAttributes =
        (IncidentStatusPageNoticeCreateDataAttributes) o;
    return Objects.equals(this.components, incidentStatusPageNoticeCreateDataAttributes.components)
        && Objects.equals(this.message, incidentStatusPageNoticeCreateDataAttributes.message)
        && Objects.equals(this.status, incidentStatusPageNoticeCreateDataAttributes.status)
        && Objects.equals(this.title, incidentStatusPageNoticeCreateDataAttributes.title)
        && Objects.equals(
            this.additionalProperties,
            incidentStatusPageNoticeCreateDataAttributes.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(components, message, status, title, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IncidentStatusPageNoticeCreateDataAttributes {\n");
    sb.append("    components: ").append(toIndentedString(components)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
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
