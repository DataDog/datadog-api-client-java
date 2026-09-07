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

/** Attributes of the ServiceNow ticket to create. */
@JsonPropertyOrder({
  CreateServiceNowTicketRequestDataAttributes.JSON_PROPERTY_ASSIGNEE_ID,
  CreateServiceNowTicketRequestDataAttributes.JSON_PROPERTY_DESCRIPTION,
  CreateServiceNowTicketRequestDataAttributes.JSON_PROPERTY_PRIORITY,
  CreateServiceNowTicketRequestDataAttributes.JSON_PROPERTY_TITLE
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class CreateServiceNowTicketRequestDataAttributes {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_ASSIGNEE_ID = "assignee_id";
  private String assigneeId;

  public static final String JSON_PROPERTY_DESCRIPTION = "description";
  private String description;

  public static final String JSON_PROPERTY_PRIORITY = "priority";
  private CasePriority priority = CasePriority.NOT_DEFINED;

  public static final String JSON_PROPERTY_TITLE = "title";
  private String title;

  public CreateServiceNowTicketRequestDataAttributes assigneeId(String assigneeId) {
    this.assigneeId = assigneeId;
    return this;
  }

  /**
   * Unique identifier of the Datadog user assigned to the case backing the ServiceNow ticket.
   *
   * @return assigneeId
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ASSIGNEE_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getAssigneeId() {
    return assigneeId;
  }

  public void setAssigneeId(String assigneeId) {
    this.assigneeId = assigneeId;
  }

  public CreateServiceNowTicketRequestDataAttributes description(String description) {
    this.description = description;
    return this;
  }

  /**
   * Description of the ServiceNow ticket. If not provided, the description will be automatically
   * generated.
   *
   * @return description
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DESCRIPTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public CreateServiceNowTicketRequestDataAttributes priority(CasePriority priority) {
    this.priority = priority;
    this.unparsed |= !priority.isValid();
    return this;
  }

  /**
   * Case priority
   *
   * @return priority
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PRIORITY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public CasePriority getPriority() {
    return priority;
  }

  public void setPriority(CasePriority priority) {
    if (!priority.isValid()) {
      this.unparsed = true;
    }
    this.priority = priority;
  }

  public CreateServiceNowTicketRequestDataAttributes title(String title) {
    this.title = title;
    return this;
  }

  /**
   * Title of the ServiceNow ticket. If not provided, the title will be automatically generated.
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
   * @return CreateServiceNowTicketRequestDataAttributes
   */
  @JsonAnySetter
  public CreateServiceNowTicketRequestDataAttributes putAdditionalProperty(
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

  /** Return true if this CreateServiceNowTicketRequestDataAttributes object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateServiceNowTicketRequestDataAttributes createServiceNowTicketRequestDataAttributes =
        (CreateServiceNowTicketRequestDataAttributes) o;
    return Objects.equals(this.assigneeId, createServiceNowTicketRequestDataAttributes.assigneeId)
        && Objects.equals(this.description, createServiceNowTicketRequestDataAttributes.description)
        && Objects.equals(this.priority, createServiceNowTicketRequestDataAttributes.priority)
        && Objects.equals(this.title, createServiceNowTicketRequestDataAttributes.title)
        && Objects.equals(
            this.additionalProperties,
            createServiceNowTicketRequestDataAttributes.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(assigneeId, description, priority, title, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateServiceNowTicketRequestDataAttributes {\n");
    sb.append("    assigneeId: ").append(toIndentedString(assigneeId)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    priority: ").append(toIndentedString(priority)).append("\n");
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
