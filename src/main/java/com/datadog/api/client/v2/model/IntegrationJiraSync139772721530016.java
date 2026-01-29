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

/** */
@JsonPropertyOrder({
  IntegrationJiraSync139772721530016.JSON_PROPERTY_ASSIGNEE,
  IntegrationJiraSync139772721530016.JSON_PROPERTY_COMMENTS,
  IntegrationJiraSync139772721530016.JSON_PROPERTY_CUSTOM_FIELDS,
  IntegrationJiraSync139772721530016.JSON_PROPERTY_DESCRIPTION,
  IntegrationJiraSync139772721530016.JSON_PROPERTY_DUE_DATE,
  IntegrationJiraSync139772721530016.JSON_PROPERTY_PRIORITY,
  IntegrationJiraSync139772721530016.JSON_PROPERTY_STATUS,
  IntegrationJiraSync139772721530016.JSON_PROPERTY_TITLE
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class IntegrationJiraSync139772721530016 {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_ASSIGNEE = "assignee";
  private SyncProperty assignee;

  public static final String JSON_PROPERTY_COMMENTS = "comments";
  private SyncProperty comments;

  public static final String JSON_PROPERTY_CUSTOM_FIELDS = "custom_fields";
  private Map<String, Object> customFields = null;

  public static final String JSON_PROPERTY_DESCRIPTION = "description";
  private SyncProperty description;

  public static final String JSON_PROPERTY_DUE_DATE = "due_date";
  private IntegrationJiraSyncDueDate dueDate;

  public static final String JSON_PROPERTY_PRIORITY = "priority";
  private SyncPropertyWithMapping priority;

  public static final String JSON_PROPERTY_STATUS = "status";
  private SyncPropertyWithMapping status;

  public static final String JSON_PROPERTY_TITLE = "title";
  private SyncProperty title;

  public IntegrationJiraSync139772721530016 assignee(SyncProperty assignee) {
    this.assignee = assignee;
    this.unparsed |= assignee.unparsed;
    return this;
  }

  /**
   * Sync property configuration
   *
   * @return assignee
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ASSIGNEE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public SyncProperty getAssignee() {
    return assignee;
  }

  public void setAssignee(SyncProperty assignee) {
    this.assignee = assignee;
  }

  public IntegrationJiraSync139772721530016 comments(SyncProperty comments) {
    this.comments = comments;
    this.unparsed |= comments.unparsed;
    return this;
  }

  /**
   * Sync property configuration
   *
   * @return comments
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_COMMENTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public SyncProperty getComments() {
    return comments;
  }

  public void setComments(SyncProperty comments) {
    this.comments = comments;
  }

  public IntegrationJiraSync139772721530016 customFields(Map<String, Object> customFields) {
    this.customFields = customFields;
    return this;
  }

  public IntegrationJiraSync139772721530016 putCustomFieldsItem(
      String key, Object customFieldsItem) {
    if (this.customFields == null) {
      this.customFields = new HashMap<>();
    }
    this.customFields.put(key, customFieldsItem);
    return this;
  }

  /**
   * GetcustomFields
   *
   * @return customFields
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CUSTOM_FIELDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Map<String, Object> getCustomFields() {
    return customFields;
  }

  public void setCustomFields(Map<String, Object> customFields) {
    this.customFields = customFields;
  }

  public IntegrationJiraSync139772721530016 description(SyncProperty description) {
    this.description = description;
    this.unparsed |= description.unparsed;
    return this;
  }

  /**
   * Sync property configuration
   *
   * @return description
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DESCRIPTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public SyncProperty getDescription() {
    return description;
  }

  public void setDescription(SyncProperty description) {
    this.description = description;
  }

  public IntegrationJiraSync139772721530016 dueDate(IntegrationJiraSyncDueDate dueDate) {
    this.dueDate = dueDate;
    this.unparsed |= dueDate.unparsed;
    return this;
  }

  /**
   * GetdueDate
   *
   * @return dueDate
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DUE_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public IntegrationJiraSyncDueDate getDueDate() {
    return dueDate;
  }

  public void setDueDate(IntegrationJiraSyncDueDate dueDate) {
    this.dueDate = dueDate;
  }

  public IntegrationJiraSync139772721530016 priority(SyncPropertyWithMapping priority) {
    this.priority = priority;
    this.unparsed |= priority.unparsed;
    return this;
  }

  /**
   * Sync property with mapping configuration
   *
   * @return priority
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PRIORITY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public SyncPropertyWithMapping getPriority() {
    return priority;
  }

  public void setPriority(SyncPropertyWithMapping priority) {
    this.priority = priority;
  }

  public IntegrationJiraSync139772721530016 status(SyncPropertyWithMapping status) {
    this.status = status;
    this.unparsed |= status.unparsed;
    return this;
  }

  /**
   * Sync property with mapping configuration
   *
   * @return status
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public SyncPropertyWithMapping getStatus() {
    return status;
  }

  public void setStatus(SyncPropertyWithMapping status) {
    this.status = status;
  }

  public IntegrationJiraSync139772721530016 title(SyncProperty title) {
    this.title = title;
    this.unparsed |= title.unparsed;
    return this;
  }

  /**
   * Sync property configuration
   *
   * @return title
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TITLE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public SyncProperty getTitle() {
    return title;
  }

  public void setTitle(SyncProperty title) {
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
   * @return IntegrationJiraSync139772721530016
   */
  @JsonAnySetter
  public IntegrationJiraSync139772721530016 putAdditionalProperty(String key, Object value) {
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

  /** Return true if this IntegrationJiraSync139772721530016 object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IntegrationJiraSync139772721530016 integrationJiraSync139772721530016 =
        (IntegrationJiraSync139772721530016) o;
    return Objects.equals(this.assignee, integrationJiraSync139772721530016.assignee)
        && Objects.equals(this.comments, integrationJiraSync139772721530016.comments)
        && Objects.equals(this.customFields, integrationJiraSync139772721530016.customFields)
        && Objects.equals(this.description, integrationJiraSync139772721530016.description)
        && Objects.equals(this.dueDate, integrationJiraSync139772721530016.dueDate)
        && Objects.equals(this.priority, integrationJiraSync139772721530016.priority)
        && Objects.equals(this.status, integrationJiraSync139772721530016.status)
        && Objects.equals(this.title, integrationJiraSync139772721530016.title)
        && Objects.equals(
            this.additionalProperties, integrationJiraSync139772721530016.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        assignee,
        comments,
        customFields,
        description,
        dueDate,
        priority,
        status,
        title,
        additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IntegrationJiraSync139772721530016 {\n");
    sb.append("    assignee: ").append(toIndentedString(assignee)).append("\n");
    sb.append("    comments: ").append(toIndentedString(comments)).append("\n");
    sb.append("    customFields: ").append(toIndentedString(customFields)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    dueDate: ").append(toIndentedString(dueDate)).append("\n");
    sb.append("    priority: ").append(toIndentedString(priority)).append("\n");
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
