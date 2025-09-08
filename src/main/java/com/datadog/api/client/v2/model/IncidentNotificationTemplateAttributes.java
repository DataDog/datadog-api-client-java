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

/** The notification template's attributes. */
@JsonPropertyOrder({
  IncidentNotificationTemplateAttributes.JSON_PROPERTY_CATEGORY,
  IncidentNotificationTemplateAttributes.JSON_PROPERTY_CONTENT,
  IncidentNotificationTemplateAttributes.JSON_PROPERTY_CREATED,
  IncidentNotificationTemplateAttributes.JSON_PROPERTY_MODIFIED,
  IncidentNotificationTemplateAttributes.JSON_PROPERTY_NAME,
  IncidentNotificationTemplateAttributes.JSON_PROPERTY_SUBJECT
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class IncidentNotificationTemplateAttributes {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_CATEGORY = "category";
  private String category;

  public static final String JSON_PROPERTY_CONTENT = "content";
  private String content;

  public static final String JSON_PROPERTY_CREATED = "created";
  private OffsetDateTime created;

  public static final String JSON_PROPERTY_MODIFIED = "modified";
  private OffsetDateTime modified;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_SUBJECT = "subject";
  private String subject;

  public IncidentNotificationTemplateAttributes() {}

  @JsonCreator
  public IncidentNotificationTemplateAttributes(
      @JsonProperty(required = true, value = JSON_PROPERTY_CATEGORY) String category,
      @JsonProperty(required = true, value = JSON_PROPERTY_CONTENT) String content,
      @JsonProperty(required = true, value = JSON_PROPERTY_CREATED) OffsetDateTime created,
      @JsonProperty(required = true, value = JSON_PROPERTY_MODIFIED) OffsetDateTime modified,
      @JsonProperty(required = true, value = JSON_PROPERTY_NAME) String name,
      @JsonProperty(required = true, value = JSON_PROPERTY_SUBJECT) String subject) {
    this.category = category;
    this.content = content;
    this.created = created;
    this.modified = modified;
    this.name = name;
    this.subject = subject;
  }

  public IncidentNotificationTemplateAttributes category(String category) {
    this.category = category;
    return this;
  }

  /**
   * The category of the notification template.
   *
   * @return category
   */
  @JsonProperty(JSON_PROPERTY_CATEGORY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getCategory() {
    return category;
  }

  public void setCategory(String category) {
    this.category = category;
  }

  public IncidentNotificationTemplateAttributes content(String content) {
    this.content = content;
    return this;
  }

  /**
   * The content body of the notification template.
   *
   * @return content
   */
  @JsonProperty(JSON_PROPERTY_CONTENT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getContent() {
    return content;
  }

  public void setContent(String content) {
    this.content = content;
  }

  /**
   * Timestamp when the notification template was created.
   *
   * @return created
   */
  @JsonProperty(JSON_PROPERTY_CREATED)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public OffsetDateTime getCreated() {
    return created;
  }

  /**
   * Timestamp when the notification template was last modified.
   *
   * @return modified
   */
  @JsonProperty(JSON_PROPERTY_MODIFIED)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public OffsetDateTime getModified() {
    return modified;
  }

  public IncidentNotificationTemplateAttributes name(String name) {
    this.name = name;
    return this;
  }

  /**
   * The name of the notification template.
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

  public IncidentNotificationTemplateAttributes subject(String subject) {
    this.subject = subject;
    return this;
  }

  /**
   * The subject line of the notification template.
   *
   * @return subject
   */
  @JsonProperty(JSON_PROPERTY_SUBJECT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getSubject() {
    return subject;
  }

  public void setSubject(String subject) {
    this.subject = subject;
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
   * @return IncidentNotificationTemplateAttributes
   */
  @JsonAnySetter
  public IncidentNotificationTemplateAttributes putAdditionalProperty(String key, Object value) {
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

  /** Return true if this IncidentNotificationTemplateAttributes object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IncidentNotificationTemplateAttributes incidentNotificationTemplateAttributes =
        (IncidentNotificationTemplateAttributes) o;
    return Objects.equals(this.category, incidentNotificationTemplateAttributes.category)
        && Objects.equals(this.content, incidentNotificationTemplateAttributes.content)
        && Objects.equals(this.created, incidentNotificationTemplateAttributes.created)
        && Objects.equals(this.modified, incidentNotificationTemplateAttributes.modified)
        && Objects.equals(this.name, incidentNotificationTemplateAttributes.name)
        && Objects.equals(this.subject, incidentNotificationTemplateAttributes.subject)
        && Objects.equals(
            this.additionalProperties, incidentNotificationTemplateAttributes.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(category, content, created, modified, name, subject, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IncidentNotificationTemplateAttributes {\n");
    sb.append("    category: ").append(toIndentedString(category)).append("\n");
    sb.append("    content: ").append(toIndentedString(content)).append("\n");
    sb.append("    created: ").append(toIndentedString(created)).append("\n");
    sb.append("    modified: ").append(toIndentedString(modified)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    subject: ").append(toIndentedString(subject)).append("\n");
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
