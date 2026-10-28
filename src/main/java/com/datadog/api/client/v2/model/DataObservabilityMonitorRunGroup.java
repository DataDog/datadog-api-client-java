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

/** A monitor group that is not ok after a run. */
@JsonPropertyOrder({
  DataObservabilityMonitorRunGroup.JSON_PROPERTY_ACCOUNT,
  DataObservabilityMonitorRunGroup.JSON_PROPERTY_COLUMN,
  DataObservabilityMonitorRunGroup.JSON_PROPERTY_DATABASE,
  DataObservabilityMonitorRunGroup.JSON_PROPERTY_ENTITY_ID,
  DataObservabilityMonitorRunGroup.JSON_PROPERTY_ENTITY_TYPE,
  DataObservabilityMonitorRunGroup.JSON_PROPERTY_GROUP,
  DataObservabilityMonitorRunGroup.JSON_PROPERTY_GROUP_BY_VALUES,
  DataObservabilityMonitorRunGroup.JSON_PROPERTY_PLATFORM,
  DataObservabilityMonitorRunGroup.JSON_PROPERTY_SCHEMA,
  DataObservabilityMonitorRunGroup.JSON_PROPERTY_STATUS,
  DataObservabilityMonitorRunGroup.JSON_PROPERTY_TABLE
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class DataObservabilityMonitorRunGroup {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_ACCOUNT = "account";
  private String account;

  public static final String JSON_PROPERTY_COLUMN = "column";
  private String column;

  public static final String JSON_PROPERTY_DATABASE = "database";
  private String database;

  public static final String JSON_PROPERTY_ENTITY_ID = "entity_id";
  private String entityId;

  public static final String JSON_PROPERTY_ENTITY_TYPE = "entity_type";
  private String entityType;

  public static final String JSON_PROPERTY_GROUP = "group";
  private String group;

  public static final String JSON_PROPERTY_GROUP_BY_VALUES = "group_by_values";
  private Map<String, String> groupByValues = null;

  public static final String JSON_PROPERTY_PLATFORM = "platform";
  private String platform;

  public static final String JSON_PROPERTY_SCHEMA = "schema";
  private String schema;

  public static final String JSON_PROPERTY_STATUS = "status";
  private DataObservabilityMonitorGroupStatus status;

  public static final String JSON_PROPERTY_TABLE = "table";
  private String table;

  public DataObservabilityMonitorRunGroup() {}

  @JsonCreator
  public DataObservabilityMonitorRunGroup(
      @JsonProperty(required = true, value = JSON_PROPERTY_DATABASE) String database,
      @JsonProperty(required = true, value = JSON_PROPERTY_ENTITY_ID) String entityId,
      @JsonProperty(required = true, value = JSON_PROPERTY_ENTITY_TYPE) String entityType,
      @JsonProperty(required = true, value = JSON_PROPERTY_GROUP) String group,
      @JsonProperty(required = true, value = JSON_PROPERTY_PLATFORM) String platform,
      @JsonProperty(required = true, value = JSON_PROPERTY_STATUS)
          DataObservabilityMonitorGroupStatus status) {
    this.database = database;
    this.entityId = entityId;
    this.entityType = entityType;
    this.group = group;
    this.platform = platform;
    this.status = status;
    this.unparsed |= !status.isValid();
  }

  public DataObservabilityMonitorRunGroup account(String account) {
    this.account = account;
    return this;
  }

  /**
   * The account of the entity, when the platform has one.
   *
   * @return account
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ACCOUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getAccount() {
    return account;
  }

  public void setAccount(String account) {
    this.account = account;
  }

  public DataObservabilityMonitorRunGroup column(String column) {
    this.column = column;
    return this;
  }

  /**
   * The column of the entity, when it is a column.
   *
   * @return column
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_COLUMN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getColumn() {
    return column;
  }

  public void setColumn(String column) {
    this.column = column;
  }

  public DataObservabilityMonitorRunGroup database(String database) {
    this.database = database;
    return this;
  }

  /**
   * The database of the entity.
   *
   * @return database
   */
  @JsonProperty(JSON_PROPERTY_DATABASE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getDatabase() {
    return database;
  }

  public void setDatabase(String database) {
    this.database = database;
  }

  public DataObservabilityMonitorRunGroup entityId(String entityId) {
    this.entityId = entityId;
    return this;
  }

  /**
   * The ID of the table or column the group checks.
   *
   * @return entityId
   */
  @JsonProperty(JSON_PROPERTY_ENTITY_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getEntityId() {
    return entityId;
  }

  public void setEntityId(String entityId) {
    this.entityId = entityId;
  }

  public DataObservabilityMonitorRunGroup entityType(String entityType) {
    this.entityType = entityType;
    return this;
  }

  /**
   * The type of the entity, such as table or column.
   *
   * @return entityType
   */
  @JsonProperty(JSON_PROPERTY_ENTITY_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getEntityType() {
    return entityType;
  }

  public void setEntityType(String entityType) {
    this.entityType = entityType;
  }

  public DataObservabilityMonitorRunGroup group(String group) {
    this.group = group;
    return this;
  }

  /**
   * The group's name in Datadog monitors, as the monitor API and UI show it. Pass it as <code>
   * filter[group]</code> to list the group's evaluations.
   *
   * @return group
   */
  @JsonProperty(JSON_PROPERTY_GROUP)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getGroup() {
    return group;
  }

  public void setGroup(String group) {
    this.group = group;
  }

  public DataObservabilityMonitorRunGroup groupByValues(Map<String, String> groupByValues) {
    this.groupByValues = groupByValues;
    return this;
  }

  public DataObservabilityMonitorRunGroup putGroupByValuesItem(
      String key, String groupByValuesItem) {
    if (this.groupByValues == null) {
      this.groupByValues = new HashMap<>();
    }
    this.groupByValues.put(key, groupByValuesItem);
    return this;
  }

  /**
   * The values of the monitor's group-by columns for this group. <code>N/A</code> means the column
   * had no value.
   *
   * @return groupByValues
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_GROUP_BY_VALUES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Map<String, String> getGroupByValues() {
    return groupByValues;
  }

  public void setGroupByValues(Map<String, String> groupByValues) {
    this.groupByValues = groupByValues;
  }

  public DataObservabilityMonitorRunGroup platform(String platform) {
    this.platform = platform;
    return this;
  }

  /**
   * The data platform of the entity.
   *
   * @return platform
   */
  @JsonProperty(JSON_PROPERTY_PLATFORM)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getPlatform() {
    return platform;
  }

  public void setPlatform(String platform) {
    this.platform = platform;
  }

  public DataObservabilityMonitorRunGroup schema(String schema) {
    this.schema = schema;
    return this;
  }

  /**
   * The schema of the entity, when it has one.
   *
   * @return schema
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SCHEMA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getSchema() {
    return schema;
  }

  public void setSchema(String schema) {
    this.schema = schema;
  }

  public DataObservabilityMonitorRunGroup status(DataObservabilityMonitorGroupStatus status) {
    this.status = status;
    this.unparsed |= !status.isValid();
    return this;
  }

  /**
   * The state of a monitor group, from the alerting engine.
   *
   * @return status
   */
  @JsonProperty(JSON_PROPERTY_STATUS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public DataObservabilityMonitorGroupStatus getStatus() {
    return status;
  }

  public void setStatus(DataObservabilityMonitorGroupStatus status) {
    if (!status.isValid()) {
      this.unparsed = true;
    }
    this.status = status;
  }

  public DataObservabilityMonitorRunGroup table(String table) {
    this.table = table;
    return this;
  }

  /**
   * The table of the entity, when it is a table or column.
   *
   * @return table
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TABLE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getTable() {
    return table;
  }

  public void setTable(String table) {
    this.table = table;
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
   * @return DataObservabilityMonitorRunGroup
   */
  @JsonAnySetter
  public DataObservabilityMonitorRunGroup putAdditionalProperty(String key, Object value) {
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

  /** Return true if this DataObservabilityMonitorRunGroup object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DataObservabilityMonitorRunGroup dataObservabilityMonitorRunGroup =
        (DataObservabilityMonitorRunGroup) o;
    return Objects.equals(this.account, dataObservabilityMonitorRunGroup.account)
        && Objects.equals(this.column, dataObservabilityMonitorRunGroup.column)
        && Objects.equals(this.database, dataObservabilityMonitorRunGroup.database)
        && Objects.equals(this.entityId, dataObservabilityMonitorRunGroup.entityId)
        && Objects.equals(this.entityType, dataObservabilityMonitorRunGroup.entityType)
        && Objects.equals(this.group, dataObservabilityMonitorRunGroup.group)
        && Objects.equals(this.groupByValues, dataObservabilityMonitorRunGroup.groupByValues)
        && Objects.equals(this.platform, dataObservabilityMonitorRunGroup.platform)
        && Objects.equals(this.schema, dataObservabilityMonitorRunGroup.schema)
        && Objects.equals(this.status, dataObservabilityMonitorRunGroup.status)
        && Objects.equals(this.table, dataObservabilityMonitorRunGroup.table)
        && Objects.equals(
            this.additionalProperties, dataObservabilityMonitorRunGroup.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        account,
        column,
        database,
        entityId,
        entityType,
        group,
        groupByValues,
        platform,
        schema,
        status,
        table,
        additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DataObservabilityMonitorRunGroup {\n");
    sb.append("    account: ").append(toIndentedString(account)).append("\n");
    sb.append("    column: ").append(toIndentedString(column)).append("\n");
    sb.append("    database: ").append(toIndentedString(database)).append("\n");
    sb.append("    entityId: ").append(toIndentedString(entityId)).append("\n");
    sb.append("    entityType: ").append(toIndentedString(entityType)).append("\n");
    sb.append("    group: ").append(toIndentedString(group)).append("\n");
    sb.append("    groupByValues: ").append(toIndentedString(groupByValues)).append("\n");
    sb.append("    platform: ").append(toIndentedString(platform)).append("\n");
    sb.append("    schema: ").append(toIndentedString(schema)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    table: ").append(toIndentedString(table)).append("\n");
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
