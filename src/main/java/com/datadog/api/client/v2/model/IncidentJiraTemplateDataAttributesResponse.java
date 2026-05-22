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
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.UUID;

/** Attributes of an incident Jira template. */
@JsonPropertyOrder({
  IncidentJiraTemplateDataAttributesResponse.JSON_PROPERTY_ACCOUNT_ID,
  IncidentJiraTemplateDataAttributesResponse.JSON_PROPERTY_CREATED,
  IncidentJiraTemplateDataAttributesResponse.JSON_PROPERTY_CREATED_BY_UUID,
  IncidentJiraTemplateDataAttributesResponse.JSON_PROPERTY_FIELD_CONFIGURATIONS,
  IncidentJiraTemplateDataAttributesResponse.JSON_PROPERTY_FIELDS,
  IncidentJiraTemplateDataAttributesResponse.JSON_PROPERTY_IS_DEFAULT,
  IncidentJiraTemplateDataAttributesResponse.JSON_PROPERTY_ISSUE_ID,
  IncidentJiraTemplateDataAttributesResponse.JSON_PROPERTY_LAST_MODIFIED_BY_UUID,
  IncidentJiraTemplateDataAttributesResponse.JSON_PROPERTY_MAPPINGS,
  IncidentJiraTemplateDataAttributesResponse.JSON_PROPERTY_META,
  IncidentJiraTemplateDataAttributesResponse.JSON_PROPERTY_MODIFIED,
  IncidentJiraTemplateDataAttributesResponse.JSON_PROPERTY_NAME,
  IncidentJiraTemplateDataAttributesResponse.JSON_PROPERTY_PROJECT_ID,
  IncidentJiraTemplateDataAttributesResponse.JSON_PROPERTY_PROJECT_KEY,
  IncidentJiraTemplateDataAttributesResponse.JSON_PROPERTY_SYNC_ENABLED,
  IncidentJiraTemplateDataAttributesResponse.JSON_PROPERTY_TYPE
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class IncidentJiraTemplateDataAttributesResponse {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_ACCOUNT_ID = "account_id";
  private String accountId;

  public static final String JSON_PROPERTY_CREATED = "created";
  private OffsetDateTime created;

  public static final String JSON_PROPERTY_CREATED_BY_UUID = "created_by_uuid";
  private UUID createdByUuid;

  public static final String JSON_PROPERTY_FIELD_CONFIGURATIONS = "field_configurations";
  private List<IncidentJiraTemplateFieldConfiguration> fieldConfigurations = null;

  public static final String JSON_PROPERTY_FIELDS = "fields";
  private Map<String, Object> fields = null;

  public static final String JSON_PROPERTY_IS_DEFAULT = "is_default";
  private Boolean isDefault;

  public static final String JSON_PROPERTY_ISSUE_ID = "issue_id";
  private String issueId;

  public static final String JSON_PROPERTY_LAST_MODIFIED_BY_UUID = "last_modified_by_uuid";
  private UUID lastModifiedByUuid;

  public static final String JSON_PROPERTY_MAPPINGS = "mappings";
  private Map<String, Object> mappings = null;

  public static final String JSON_PROPERTY_META = "meta";
  private Map<String, Object> meta = null;

  public static final String JSON_PROPERTY_MODIFIED = "modified";
  private OffsetDateTime modified;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_PROJECT_ID = "project_id";
  private String projectId;

  public static final String JSON_PROPERTY_PROJECT_KEY = "project_key";
  private String projectKey;

  public static final String JSON_PROPERTY_SYNC_ENABLED = "sync_enabled";
  private Boolean syncEnabled;

  public static final String JSON_PROPERTY_TYPE = "type";
  private String type;

  public IncidentJiraTemplateDataAttributesResponse() {}

  @JsonCreator
  public IncidentJiraTemplateDataAttributesResponse(
      @JsonProperty(required = true, value = JSON_PROPERTY_ACCOUNT_ID) String accountId,
      @JsonProperty(required = true, value = JSON_PROPERTY_CREATED) OffsetDateTime created,
      @JsonProperty(required = true, value = JSON_PROPERTY_CREATED_BY_UUID) UUID createdByUuid,
      @JsonProperty(required = true, value = JSON_PROPERTY_IS_DEFAULT) Boolean isDefault,
      @JsonProperty(required = true, value = JSON_PROPERTY_ISSUE_ID) String issueId,
      @JsonProperty(required = true, value = JSON_PROPERTY_LAST_MODIFIED_BY_UUID)
          UUID lastModifiedByUuid,
      @JsonProperty(required = true, value = JSON_PROPERTY_MODIFIED) OffsetDateTime modified,
      @JsonProperty(required = true, value = JSON_PROPERTY_NAME) String name,
      @JsonProperty(required = true, value = JSON_PROPERTY_PROJECT_ID) String projectId,
      @JsonProperty(required = true, value = JSON_PROPERTY_PROJECT_KEY) String projectKey,
      @JsonProperty(required = true, value = JSON_PROPERTY_SYNC_ENABLED) Boolean syncEnabled,
      @JsonProperty(required = true, value = JSON_PROPERTY_TYPE) String type) {
    this.accountId = accountId;
    this.created = created;
    this.createdByUuid = createdByUuid;
    this.isDefault = isDefault;
    this.issueId = issueId;
    this.lastModifiedByUuid = lastModifiedByUuid;
    this.modified = modified;
    this.name = name;
    this.projectId = projectId;
    this.projectKey = projectKey;
    this.syncEnabled = syncEnabled;
    this.type = type;
  }

  public IncidentJiraTemplateDataAttributesResponse accountId(String accountId) {
    this.accountId = accountId;
    return this;
  }

  /**
   * The Jira account identifier.
   *
   * @return accountId
   */
  @JsonProperty(JSON_PROPERTY_ACCOUNT_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getAccountId() {
    return accountId;
  }

  public void setAccountId(String accountId) {
    this.accountId = accountId;
  }

  public IncidentJiraTemplateDataAttributesResponse created(OffsetDateTime created) {
    this.created = created;
    return this;
  }

  /**
   * Timestamp when the template was created.
   *
   * @return created
   */
  @JsonProperty(JSON_PROPERTY_CREATED)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public OffsetDateTime getCreated() {
    return created;
  }

  public void setCreated(OffsetDateTime created) {
    this.created = created;
  }

  public IncidentJiraTemplateDataAttributesResponse createdByUuid(UUID createdByUuid) {
    this.createdByUuid = createdByUuid;
    return this;
  }

  /**
   * UUID of the user who created the template.
   *
   * @return createdByUuid
   */
  @JsonProperty(JSON_PROPERTY_CREATED_BY_UUID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public UUID getCreatedByUuid() {
    return createdByUuid;
  }

  public void setCreatedByUuid(UUID createdByUuid) {
    this.createdByUuid = createdByUuid;
  }

  public IncidentJiraTemplateDataAttributesResponse fieldConfigurations(
      List<IncidentJiraTemplateFieldConfiguration> fieldConfigurations) {
    this.fieldConfigurations = fieldConfigurations;
    for (IncidentJiraTemplateFieldConfiguration item : fieldConfigurations) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }

  public IncidentJiraTemplateDataAttributesResponse addFieldConfigurationsItem(
      IncidentJiraTemplateFieldConfiguration fieldConfigurationsItem) {
    if (this.fieldConfigurations == null) {
      this.fieldConfigurations = new ArrayList<>();
    }
    this.fieldConfigurations.add(fieldConfigurationsItem);
    this.unparsed |= fieldConfigurationsItem.unparsed;
    return this;
  }

  /**
   * Field configuration mappings.
   *
   * @return fieldConfigurations
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_FIELD_CONFIGURATIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<IncidentJiraTemplateFieldConfiguration> getFieldConfigurations() {
    return fieldConfigurations;
  }

  public void setFieldConfigurations(
      List<IncidentJiraTemplateFieldConfiguration> fieldConfigurations) {
    this.fieldConfigurations = fieldConfigurations;
  }

  public IncidentJiraTemplateDataAttributesResponse fields(Map<String, Object> fields) {
    this.fields = fields;
    return this;
  }

  public IncidentJiraTemplateDataAttributesResponse putFieldsItem(String key, Object fieldsItem) {
    if (this.fields == null) {
      this.fields = new HashMap<>();
    }
    this.fields.put(key, fieldsItem);
    return this;
  }

  /**
   * The Jira fields configuration.
   *
   * @return fields
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_FIELDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Map<String, Object> getFields() {
    return fields;
  }

  public void setFields(Map<String, Object> fields) {
    this.fields = fields;
  }

  public IncidentJiraTemplateDataAttributesResponse isDefault(Boolean isDefault) {
    this.isDefault = isDefault;
    return this;
  }

  /**
   * Whether this is the default template.
   *
   * @return isDefault
   */
  @JsonProperty(JSON_PROPERTY_IS_DEFAULT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Boolean getIsDefault() {
    return isDefault;
  }

  public void setIsDefault(Boolean isDefault) {
    this.isDefault = isDefault;
  }

  public IncidentJiraTemplateDataAttributesResponse issueId(String issueId) {
    this.issueId = issueId;
    return this;
  }

  /**
   * The Jira issue type identifier.
   *
   * @return issueId
   */
  @JsonProperty(JSON_PROPERTY_ISSUE_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getIssueId() {
    return issueId;
  }

  public void setIssueId(String issueId) {
    this.issueId = issueId;
  }

  public IncidentJiraTemplateDataAttributesResponse lastModifiedByUuid(UUID lastModifiedByUuid) {
    this.lastModifiedByUuid = lastModifiedByUuid;
    return this;
  }

  /**
   * UUID of the user who last modified the template.
   *
   * @return lastModifiedByUuid
   */
  @JsonProperty(JSON_PROPERTY_LAST_MODIFIED_BY_UUID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public UUID getLastModifiedByUuid() {
    return lastModifiedByUuid;
  }

  public void setLastModifiedByUuid(UUID lastModifiedByUuid) {
    this.lastModifiedByUuid = lastModifiedByUuid;
  }

  public IncidentJiraTemplateDataAttributesResponse mappings(Map<String, Object> mappings) {
    this.mappings = mappings;
    return this;
  }

  public IncidentJiraTemplateDataAttributesResponse putMappingsItem(
      String key, Object mappingsItem) {
    if (this.mappings == null) {
      this.mappings = new HashMap<>();
    }
    this.mappings.put(key, mappingsItem);
    return this;
  }

  /**
   * The field mappings configuration.
   *
   * @return mappings
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_MAPPINGS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Map<String, Object> getMappings() {
    return mappings;
  }

  public void setMappings(Map<String, Object> mappings) {
    this.mappings = mappings;
  }

  public IncidentJiraTemplateDataAttributesResponse meta(Map<String, Object> meta) {
    this.meta = meta;
    return this;
  }

  public IncidentJiraTemplateDataAttributesResponse putMetaItem(String key, Object metaItem) {
    if (this.meta == null) {
      this.meta = new HashMap<>();
    }
    this.meta.put(key, metaItem);
    return this;
  }

  /**
   * Additional metadata for the template.
   *
   * @return meta
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_META)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Map<String, Object> getMeta() {
    return meta;
  }

  public void setMeta(Map<String, Object> meta) {
    this.meta = meta;
  }

  public IncidentJiraTemplateDataAttributesResponse modified(OffsetDateTime modified) {
    this.modified = modified;
    return this;
  }

  /**
   * Timestamp when the template was last modified.
   *
   * @return modified
   */
  @JsonProperty(JSON_PROPERTY_MODIFIED)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public OffsetDateTime getModified() {
    return modified;
  }

  public void setModified(OffsetDateTime modified) {
    this.modified = modified;
  }

  public IncidentJiraTemplateDataAttributesResponse name(String name) {
    this.name = name;
    return this;
  }

  /**
   * The name of the template.
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

  public IncidentJiraTemplateDataAttributesResponse projectId(String projectId) {
    this.projectId = projectId;
    return this;
  }

  /**
   * The Jira project identifier.
   *
   * @return projectId
   */
  @JsonProperty(JSON_PROPERTY_PROJECT_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getProjectId() {
    return projectId;
  }

  public void setProjectId(String projectId) {
    this.projectId = projectId;
  }

  public IncidentJiraTemplateDataAttributesResponse projectKey(String projectKey) {
    this.projectKey = projectKey;
    return this;
  }

  /**
   * The Jira project key.
   *
   * @return projectKey
   */
  @JsonProperty(JSON_PROPERTY_PROJECT_KEY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getProjectKey() {
    return projectKey;
  }

  public void setProjectKey(String projectKey) {
    this.projectKey = projectKey;
  }

  public IncidentJiraTemplateDataAttributesResponse syncEnabled(Boolean syncEnabled) {
    this.syncEnabled = syncEnabled;
    return this;
  }

  /**
   * Whether synchronization is enabled.
   *
   * @return syncEnabled
   */
  @JsonProperty(JSON_PROPERTY_SYNC_ENABLED)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Boolean getSyncEnabled() {
    return syncEnabled;
  }

  public void setSyncEnabled(Boolean syncEnabled) {
    this.syncEnabled = syncEnabled;
  }

  public IncidentJiraTemplateDataAttributesResponse type(String type) {
    this.type = type;
    return this;
  }

  /**
   * The type of the template.
   *
   * @return type
   */
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getType() {
    return type;
  }

  public void setType(String type) {
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
   * @return IncidentJiraTemplateDataAttributesResponse
   */
  @JsonAnySetter
  public IncidentJiraTemplateDataAttributesResponse putAdditionalProperty(
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

  /** Return true if this IncidentJiraTemplateDataAttributesResponse object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IncidentJiraTemplateDataAttributesResponse incidentJiraTemplateDataAttributesResponse =
        (IncidentJiraTemplateDataAttributesResponse) o;
    return Objects.equals(this.accountId, incidentJiraTemplateDataAttributesResponse.accountId)
        && Objects.equals(this.created, incidentJiraTemplateDataAttributesResponse.created)
        && Objects.equals(
            this.createdByUuid, incidentJiraTemplateDataAttributesResponse.createdByUuid)
        && Objects.equals(
            this.fieldConfigurations,
            incidentJiraTemplateDataAttributesResponse.fieldConfigurations)
        && Objects.equals(this.fields, incidentJiraTemplateDataAttributesResponse.fields)
        && Objects.equals(this.isDefault, incidentJiraTemplateDataAttributesResponse.isDefault)
        && Objects.equals(this.issueId, incidentJiraTemplateDataAttributesResponse.issueId)
        && Objects.equals(
            this.lastModifiedByUuid, incidentJiraTemplateDataAttributesResponse.lastModifiedByUuid)
        && Objects.equals(this.mappings, incidentJiraTemplateDataAttributesResponse.mappings)
        && Objects.equals(this.meta, incidentJiraTemplateDataAttributesResponse.meta)
        && Objects.equals(this.modified, incidentJiraTemplateDataAttributesResponse.modified)
        && Objects.equals(this.name, incidentJiraTemplateDataAttributesResponse.name)
        && Objects.equals(this.projectId, incidentJiraTemplateDataAttributesResponse.projectId)
        && Objects.equals(this.projectKey, incidentJiraTemplateDataAttributesResponse.projectKey)
        && Objects.equals(this.syncEnabled, incidentJiraTemplateDataAttributesResponse.syncEnabled)
        && Objects.equals(this.type, incidentJiraTemplateDataAttributesResponse.type)
        && Objects.equals(
            this.additionalProperties,
            incidentJiraTemplateDataAttributesResponse.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        accountId,
        created,
        createdByUuid,
        fieldConfigurations,
        fields,
        isDefault,
        issueId,
        lastModifiedByUuid,
        mappings,
        meta,
        modified,
        name,
        projectId,
        projectKey,
        syncEnabled,
        type,
        additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IncidentJiraTemplateDataAttributesResponse {\n");
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    created: ").append(toIndentedString(created)).append("\n");
    sb.append("    createdByUuid: ").append(toIndentedString(createdByUuid)).append("\n");
    sb.append("    fieldConfigurations: ")
        .append(toIndentedString(fieldConfigurations))
        .append("\n");
    sb.append("    fields: ").append(toIndentedString(fields)).append("\n");
    sb.append("    isDefault: ").append(toIndentedString(isDefault)).append("\n");
    sb.append("    issueId: ").append(toIndentedString(issueId)).append("\n");
    sb.append("    lastModifiedByUuid: ").append(toIndentedString(lastModifiedByUuid)).append("\n");
    sb.append("    mappings: ").append(toIndentedString(mappings)).append("\n");
    sb.append("    meta: ").append(toIndentedString(meta)).append("\n");
    sb.append("    modified: ").append(toIndentedString(modified)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
    sb.append("    projectKey: ").append(toIndentedString(projectKey)).append("\n");
    sb.append("    syncEnabled: ").append(toIndentedString(syncEnabled)).append("\n");
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
