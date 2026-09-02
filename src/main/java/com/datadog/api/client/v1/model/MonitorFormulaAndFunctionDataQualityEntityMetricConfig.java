/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v1.model;

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
   * <p>Measure configuration for one side of a source to target comparison.</p>
 */
@JsonPropertyOrder({
  MonitorFormulaAndFunctionDataQualityEntityMetricConfig.JSON_PROPERTY_CUSTOM_SQL,
  MonitorFormulaAndFunctionDataQualityEntityMetricConfig.JSON_PROPERTY_CUSTOM_WHERE,
  MonitorFormulaAndFunctionDataQualityEntityMetricConfig.JSON_PROPERTY_ENTITY_ID,
  MonitorFormulaAndFunctionDataQualityEntityMetricConfig.JSON_PROPERTY_ENTITY_TYPE,
  MonitorFormulaAndFunctionDataQualityEntityMetricConfig.JSON_PROPERTY_GROUP_BY_COLUMNS
})
@jakarta.annotation.Generated(value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class MonitorFormulaAndFunctionDataQualityEntityMetricConfig {
  @JsonIgnore
  public boolean unparsed = false;
  public static final String JSON_PROPERTY_CUSTOM_SQL = "custom_sql";
  private String customSql;

  public static final String JSON_PROPERTY_CUSTOM_WHERE = "custom_where";
  private String customWhere;

  public static final String JSON_PROPERTY_ENTITY_ID = "entity_id";
  private String entityId;

  public static final String JSON_PROPERTY_ENTITY_TYPE = "entity_type";
  private String entityType;

  public static final String JSON_PROPERTY_GROUP_BY_COLUMNS = "group_by_columns";
  private List<String> groupByColumns = null;

  public MonitorFormulaAndFunctionDataQualityEntityMetricConfig() {}

  @JsonCreator
  public MonitorFormulaAndFunctionDataQualityEntityMetricConfig(
            @JsonProperty(required=true, value=JSON_PROPERTY_ENTITY_ID)String entityId,
            @JsonProperty(required=true, value=JSON_PROPERTY_ENTITY_TYPE)String entityType) {
        this.entityId = entityId;
        this.entityType = entityType;
  }
  public MonitorFormulaAndFunctionDataQualityEntityMetricConfig customSql(String customSql) {
    this.customSql = customSql;
    return this;
  }

  /**
   * <p>Custom SQL query used to compute the measure for this entity.</p>
   * @return customSql
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_CUSTOM_SQL)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public String getCustomSql() {
        return customSql;
      }
  public void setCustomSql(String customSql) {
    this.customSql = customSql;
  }
  public MonitorFormulaAndFunctionDataQualityEntityMetricConfig customWhere(String customWhere) {
    this.customWhere = customWhere;
    return this;
  }

  /**
   * <p>Custom WHERE clause applied when computing the measure for this entity.</p>
   * @return customWhere
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_CUSTOM_WHERE)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public String getCustomWhere() {
        return customWhere;
      }
  public void setCustomWhere(String customWhere) {
    this.customWhere = customWhere;
  }
  public MonitorFormulaAndFunctionDataQualityEntityMetricConfig entityId(String entityId) {
    this.entityId = entityId;
    return this;
  }

  /**
   * <p>Identifier of the data entity to measure.</p>
   * @return entityId
  **/
      @JsonProperty(JSON_PROPERTY_ENTITY_ID)
      @JsonInclude(
        value = JsonInclude.Include.ALWAYS)
      public String getEntityId() {
        return entityId;
      }
  public void setEntityId(String entityId) {
    this.entityId = entityId;
  }
  public MonitorFormulaAndFunctionDataQualityEntityMetricConfig entityType(String entityType) {
    this.entityType = entityType;
    return this;
  }

  /**
   * <p>Type of the data entity to measure.</p>
   * @return entityType
  **/
      @JsonProperty(JSON_PROPERTY_ENTITY_TYPE)
      @JsonInclude(
        value = JsonInclude.Include.ALWAYS)
      public String getEntityType() {
        return entityType;
      }
  public void setEntityType(String entityType) {
    this.entityType = entityType;
  }
  public MonitorFormulaAndFunctionDataQualityEntityMetricConfig groupByColumns(List<String> groupByColumns) {
    this.groupByColumns = groupByColumns;
    return this;
  }
  public MonitorFormulaAndFunctionDataQualityEntityMetricConfig addGroupByColumnsItem(String groupByColumnsItem) {
    if (this.groupByColumns == null) {
      this.groupByColumns = new ArrayList<>();
    }
    this.groupByColumns.add(groupByColumnsItem);
    return this;
  }

  /**
   * <p>Columns to group results by when computing the measure for this entity.</p>
   * @return groupByColumns
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_GROUP_BY_COLUMNS)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public List<String> getGroupByColumns() {
        return groupByColumns;
      }
  public void setGroupByColumns(List<String> groupByColumns) {
    this.groupByColumns = groupByColumns;
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
   * @return MonitorFormulaAndFunctionDataQualityEntityMetricConfig
   */
  @JsonAnySetter
  public MonitorFormulaAndFunctionDataQualityEntityMetricConfig putAdditionalProperty(String key, Object value) {
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
   * Return true if this MonitorFormulaAndFunctionDataQualityEntityMetricConfig object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MonitorFormulaAndFunctionDataQualityEntityMetricConfig monitorFormulaAndFunctionDataQualityEntityMetricConfig = (MonitorFormulaAndFunctionDataQualityEntityMetricConfig) o;
    return Objects.equals(this.customSql, monitorFormulaAndFunctionDataQualityEntityMetricConfig.customSql) && Objects.equals(this.customWhere, monitorFormulaAndFunctionDataQualityEntityMetricConfig.customWhere) && Objects.equals(this.entityId, monitorFormulaAndFunctionDataQualityEntityMetricConfig.entityId) && Objects.equals(this.entityType, monitorFormulaAndFunctionDataQualityEntityMetricConfig.entityType) && Objects.equals(this.groupByColumns, monitorFormulaAndFunctionDataQualityEntityMetricConfig.groupByColumns) && Objects.equals(this.additionalProperties, monitorFormulaAndFunctionDataQualityEntityMetricConfig.additionalProperties);
  }


  @Override
  public int hashCode() {
    return Objects.hash(customSql,customWhere,entityId,entityType,groupByColumns, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MonitorFormulaAndFunctionDataQualityEntityMetricConfig {\n");
    sb.append("    customSql: ").append(toIndentedString(customSql)).append("\n");
    sb.append("    customWhere: ").append(toIndentedString(customWhere)).append("\n");
    sb.append("    entityId: ").append(toIndentedString(entityId)).append("\n");
    sb.append("    entityType: ").append(toIndentedString(entityType)).append("\n");
    sb.append("    groupByColumns: ").append(toIndentedString(groupByColumns)).append("\n");
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
