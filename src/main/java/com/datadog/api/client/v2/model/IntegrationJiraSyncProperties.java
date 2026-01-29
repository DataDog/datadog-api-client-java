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
  IntegrationJiraSyncProperties.JSON_PROPERTY_ASSIGNEE,
  IntegrationJiraSyncProperties.JSON_PROPERTY_COMMENTS,
  IntegrationJiraSyncProperties.JSON_PROPERTY_CUSTOM_FIELDS,
  IntegrationJiraSyncProperties.JSON_PROPERTY_DESCRIPTION,
  IntegrationJiraSyncProperties.JSON_PROPERTY_DUE_DATE,
  IntegrationJiraSyncProperties.JSON_PROPERTY_PRIORITY,
  IntegrationJiraSyncProperties.JSON_PROPERTY_STATUS,
  IntegrationJiraSyncProperties.JSON_PROPERTY_TITLE
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class IntegrationJiraSyncProperties {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_ASSIGNEE = "assignee";
  private SyncProperty assignee;

  public static final String JSON_PROPERTY_COMMENTS = "comments";
  private SyncProperty comments;

  public static final String JSON_PROPERTY_CUSTOM_FIELDS = "custom_fields";
  private Map<String, IntegrationJiraSyncPropertiesCustomFieldsAdditionalProperties> customFields =
      null;

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

  public IntegrationJiraSyncProperties assignee(SyncProperty assignee) {
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

  public IntegrationJiraSyncProperties comments(SyncProperty comments) {
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

  public IntegrationJiraSyncProperties customFields(
      Map<String, IntegrationJiraSyncPropertiesCustomFieldsAdditionalProperties> customFields) {
    this.customFields = customFields;
    return this;
  }

  public IntegrationJiraSyncProperties putCustomFieldsItem(
      String key, IntegrationJiraSyncPropertiesCustomFieldsAdditionalProperties customFieldsItem) {
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
  public Map<String, IntegrationJiraSyncPropertiesCustomFieldsAdditionalProperties>
      getCustomFields() {
    return customFields;
  }

  public void setCustomFields(
      Map<String, IntegrationJiraSyncPropertiesCustomFieldsAdditionalProperties> customFields) {
    this.customFields = customFields;
  }

  public IntegrationJiraSyncProperties description(SyncProperty description) {
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

  public IntegrationJiraSyncProperties dueDate(IntegrationJiraSyncDueDate dueDate) {
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

  public IntegrationJiraSyncProperties priority(SyncPropertyWithMapping priority) {
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

  public IntegrationJiraSyncProperties status(SyncPropertyWithMapping status) {
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

  public IntegrationJiraSyncProperties title(SyncProperty title) {
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
   * @return IntegrationJiraSyncProperties
   */
  @JsonAnySetter
  public IntegrationJiraSyncProperties putAdditionalProperty(String key, Object value) {
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

  /** Return true if this IntegrationJiraSyncProperties object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IntegrationJiraSyncProperties integrationJiraSyncProperties = (IntegrationJiraSyncProperties) o;
    return Objects.equals(this.assignee, integrationJiraSyncProperties.assignee)
        && Objects.equals(this.comments, integrationJiraSyncProperties.comments)
        && Objects.equals(this.customFields, integrationJiraSyncProperties.customFields)
        && Objects.equals(this.description, integrationJiraSyncProperties.description)
        && Objects.equals(this.dueDate, integrationJiraSyncProperties.dueDate)
        && Objects.equals(this.priority, integrationJiraSyncProperties.priority)
        && Objects.equals(this.status, integrationJiraSyncProperties.status)
        && Objects.equals(this.title, integrationJiraSyncProperties.title)
        && Objects.equals(
            this.additionalProperties, integrationJiraSyncProperties.additionalProperties);
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
    sb.append("class IntegrationJiraSyncProperties {\n");
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
