/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v1.model;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/** Monitor configuration options for data quality queries. */
@JsonPropertyOrder({
  MonitorFormulaAndFunctionDataQualityMonitorOptions.JSON_PROPERTY_CRONTAB_OVERRIDE,
  MonitorFormulaAndFunctionDataQualityMonitorOptions.JSON_PROPERTY_CUSTOM_SQL,
  MonitorFormulaAndFunctionDataQualityMonitorOptions.JSON_PROPERTY_CUSTOM_WHERE,
  MonitorFormulaAndFunctionDataQualityMonitorOptions.JSON_PROPERTY_GROUP_BY_COLUMNS,
  MonitorFormulaAndFunctionDataQualityMonitorOptions.JSON_PROPERTY_MODEL_TYPE_OVERRIDE
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class MonitorFormulaAndFunctionDataQualityMonitorOptions {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_CRONTAB_OVERRIDE = "crontab_override";
  private String crontabOverride;

  public static final String JSON_PROPERTY_CUSTOM_SQL = "custom_sql";
  private String customSql;

  public static final String JSON_PROPERTY_CUSTOM_WHERE = "custom_where";
  private String customWhere;

  public static final String JSON_PROPERTY_GROUP_BY_COLUMNS = "group_by_columns";
  private List<String> groupByColumns = null;

  public static final String JSON_PROPERTY_MODEL_TYPE_OVERRIDE = "model_type_override";
  private MonitorFormulaAndFunctionDataQualityModelTypeOverride modelTypeOverride;

  public MonitorFormulaAndFunctionDataQualityMonitorOptions crontabOverride(
      String crontabOverride) {
    this.crontabOverride = crontabOverride;
    return this;
  }

  /**
   * Crontab expression to override the default schedule.
   *
   * @return crontabOverride
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CRONTAB_OVERRIDE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getCrontabOverride() {
    return crontabOverride;
  }

  public void setCrontabOverride(String crontabOverride) {
    this.crontabOverride = crontabOverride;
  }

  public MonitorFormulaAndFunctionDataQualityMonitorOptions customSql(String customSql) {
    this.customSql = customSql;
    return this;
  }

  /**
   * Custom SQL query for the monitor.
   *
   * @return customSql
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CUSTOM_SQL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getCustomSql() {
    return customSql;
  }

  public void setCustomSql(String customSql) {
    this.customSql = customSql;
  }

  public MonitorFormulaAndFunctionDataQualityMonitorOptions customWhere(String customWhere) {
    this.customWhere = customWhere;
    return this;
  }

  /**
   * Custom WHERE clause for the query.
   *
   * @return customWhere
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CUSTOM_WHERE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getCustomWhere() {
    return customWhere;
  }

  public void setCustomWhere(String customWhere) {
    this.customWhere = customWhere;
  }

  public MonitorFormulaAndFunctionDataQualityMonitorOptions groupByColumns(
      List<String> groupByColumns) {
    this.groupByColumns = groupByColumns;
    return this;
  }

  public MonitorFormulaAndFunctionDataQualityMonitorOptions addGroupByColumnsItem(
      String groupByColumnsItem) {
    if (this.groupByColumns == null) {
      this.groupByColumns = new ArrayList<>();
    }
    this.groupByColumns.add(groupByColumnsItem);
    return this;
  }

  /**
   * Columns to group results by.
   *
   * @return groupByColumns
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_GROUP_BY_COLUMNS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<String> getGroupByColumns() {
    return groupByColumns;
  }

  public void setGroupByColumns(List<String> groupByColumns) {
    this.groupByColumns = groupByColumns;
  }

  public MonitorFormulaAndFunctionDataQualityMonitorOptions modelTypeOverride(
      MonitorFormulaAndFunctionDataQualityModelTypeOverride modelTypeOverride) {
    this.modelTypeOverride = modelTypeOverride;
    this.unparsed |= !modelTypeOverride.isValid();
    return this;
  }

  /**
   * Override for the model type used in anomaly detection.
   *
   * @return modelTypeOverride
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_MODEL_TYPE_OVERRIDE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public MonitorFormulaAndFunctionDataQualityModelTypeOverride getModelTypeOverride() {
    return modelTypeOverride;
  }

  public void setModelTypeOverride(
      MonitorFormulaAndFunctionDataQualityModelTypeOverride modelTypeOverride) {
    if (!modelTypeOverride.isValid()) {
      this.unparsed = true;
    }
    this.modelTypeOverride = modelTypeOverride;
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
   * @return MonitorFormulaAndFunctionDataQualityMonitorOptions
   */
  @JsonAnySetter
  public MonitorFormulaAndFunctionDataQualityMonitorOptions putAdditionalProperty(
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

  /**
   * Return true if this MonitorFormulaAndFunctionDataQualityMonitorOptions object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MonitorFormulaAndFunctionDataQualityMonitorOptions
        monitorFormulaAndFunctionDataQualityMonitorOptions =
            (MonitorFormulaAndFunctionDataQualityMonitorOptions) o;
    return Objects.equals(
            this.crontabOverride,
            monitorFormulaAndFunctionDataQualityMonitorOptions.crontabOverride)
        && Objects.equals(
            this.customSql, monitorFormulaAndFunctionDataQualityMonitorOptions.customSql)
        && Objects.equals(
            this.customWhere, monitorFormulaAndFunctionDataQualityMonitorOptions.customWhere)
        && Objects.equals(
            this.groupByColumns, monitorFormulaAndFunctionDataQualityMonitorOptions.groupByColumns)
        && Objects.equals(
            this.modelTypeOverride,
            monitorFormulaAndFunctionDataQualityMonitorOptions.modelTypeOverride)
        && Objects.equals(
            this.additionalProperties,
            monitorFormulaAndFunctionDataQualityMonitorOptions.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        crontabOverride,
        customSql,
        customWhere,
        groupByColumns,
        modelTypeOverride,
        additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MonitorFormulaAndFunctionDataQualityMonitorOptions {\n");
    sb.append("    crontabOverride: ").append(toIndentedString(crontabOverride)).append("\n");
    sb.append("    customSql: ").append(toIndentedString(customSql)).append("\n");
    sb.append("    customWhere: ").append(toIndentedString(customWhere)).append("\n");
    sb.append("    groupByColumns: ").append(toIndentedString(groupByColumns)).append("\n");
    sb.append("    modelTypeOverride: ").append(toIndentedString(modelTypeOverride)).append("\n");
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
