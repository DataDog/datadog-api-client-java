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
   * <p>The attributes to update on a notification template.</p>
 */
@JsonPropertyOrder({
  IncidentNotificationTemplateUpdateAttributes.JSON_PROPERTY_CATEGORY,
  IncidentNotificationTemplateUpdateAttributes.JSON_PROPERTY_CONTENT,
  IncidentNotificationTemplateUpdateAttributes.JSON_PROPERTY_NAME,
  IncidentNotificationTemplateUpdateAttributes.JSON_PROPERTY_SUBJECT
})
@jakarta.annotation.Generated(value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class IncidentNotificationTemplateUpdateAttributes {
  @JsonIgnore
  public boolean unparsed = false;
  public static final String JSON_PROPERTY_CATEGORY = "category";
  private String category;

  public static final String JSON_PROPERTY_CONTENT = "content";
  private String content;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_SUBJECT = "subject";
  private String subject;

  public IncidentNotificationTemplateUpdateAttributes category(String category) {
    this.category = category;
    return this;
  }

  /**
   * <p>The category of the notification template.</p>
   * @return category
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_CATEGORY)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public String getCategory() {
        return category;
      }
  public void setCategory(String category) {
    this.category = category;
  }
  public IncidentNotificationTemplateUpdateAttributes content(String content) {
    this.content = content;
    return this;
  }

  /**
   * <p>The content body of the notification template.</p>
   * @return content
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_CONTENT)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public String getContent() {
        return content;
      }
  public void setContent(String content) {
    this.content = content;
  }
  public IncidentNotificationTemplateUpdateAttributes name(String name) {
    this.name = name;
    return this;
  }

  /**
   * <p>The name of the notification template.</p>
   * @return name
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_NAME)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public String getName() {
        return name;
      }
  public void setName(String name) {
    this.name = name;
  }
  public IncidentNotificationTemplateUpdateAttributes subject(String subject) {
    this.subject = subject;
    return this;
  }

  /**
   * <p>The subject line of the notification template.</p>
   * @return subject
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_SUBJECT)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public String getSubject() {
        return subject;
      }
  public void setSubject(String subject) {
    this.subject = subject;
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
   * @return IncidentNotificationTemplateUpdateAttributes
   */
  @JsonAnySetter
  public IncidentNotificationTemplateUpdateAttributes putAdditionalProperty(String key, Object value) {
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
   * Return true if this IncidentNotificationTemplateUpdateAttributes object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IncidentNotificationTemplateUpdateAttributes incidentNotificationTemplateUpdateAttributes = (IncidentNotificationTemplateUpdateAttributes) o;
    return Objects.equals(this.category, incidentNotificationTemplateUpdateAttributes.category) && Objects.equals(this.content, incidentNotificationTemplateUpdateAttributes.content) && Objects.equals(this.name, incidentNotificationTemplateUpdateAttributes.name) && Objects.equals(this.subject, incidentNotificationTemplateUpdateAttributes.subject) && Objects.equals(this.additionalProperties, incidentNotificationTemplateUpdateAttributes.additionalProperties);
  }


  @Override
  public int hashCode() {
    return Objects.hash(category,content,name,subject, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IncidentNotificationTemplateUpdateAttributes {\n");
    sb.append("    category: ").append(toIndentedString(category)).append("\n");
    sb.append("    content: ").append(toIndentedString(content)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    subject: ").append(toIndentedString(subject)).append("\n");
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
