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
   * <p>Monitor configuration options for data quality queries.</p>
 */
@JsonPropertyOrder({
  MonitorFormulaAndFunctionDataQualityMonitorOptions.JSON_PROPERTY_CRONTAB_OVERRIDE,
  MonitorFormulaAndFunctionDataQualityMonitorOptions.JSON_PROPERTY_CUSTOM_SQL,
  MonitorFormulaAndFunctionDataQualityMonitorOptions.JSON_PROPERTY_CUSTOM_WHERE,
  MonitorFormulaAndFunctionDataQualityMonitorOptions.JSON_PROPERTY_GROUP_BY_COLUMNS,
  MonitorFormulaAndFunctionDataQualityMonitorOptions.JSON_PROPERTY_MODEL_CONFIGURATION,
  MonitorFormulaAndFunctionDataQualityMonitorOptions.JSON_PROPERTY_MODEL_TYPE_OVERRIDE,
  MonitorFormulaAndFunctionDataQualityMonitorOptions.JSON_PROPERTY_SENSITIVITY,
  MonitorFormulaAndFunctionDataQualityMonitorOptions.JSON_PROPERTY_SOURCE_TO_TARGET_CONFIG
})
@jakarta.annotation.Generated(value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class MonitorFormulaAndFunctionDataQualityMonitorOptions {
  @JsonIgnore
  public boolean unparsed = false;
  public static final String JSON_PROPERTY_CRONTAB_OVERRIDE = "crontab_override";
  private String crontabOverride;

  public static final String JSON_PROPERTY_CUSTOM_SQL = "custom_sql";
  private String customSql;

  public static final String JSON_PROPERTY_CUSTOM_WHERE = "custom_where";
  private String customWhere;

  public static final String JSON_PROPERTY_GROUP_BY_COLUMNS = "group_by_columns";
  private List<String> groupByColumns = null;

  public static final String JSON_PROPERTY_MODEL_CONFIGURATION = "model_configuration";
  private MonitorFormulaAndFunctionDataQualityModelConfiguration modelConfiguration;

  public static final String JSON_PROPERTY_MODEL_TYPE_OVERRIDE = "model_type_override";
  private MonitorFormulaAndFunctionDataQualityModelTypeOverride modelTypeOverride;

  public static final String JSON_PROPERTY_SENSITIVITY = "sensitivity";
  private Double sensitivity;

  public static final String JSON_PROPERTY_SOURCE_TO_TARGET_CONFIG = "source_to_target_config";
  private MonitorFormulaAndFunctionDataQualitySourceToTargetConfig sourceToTargetConfig;

  public MonitorFormulaAndFunctionDataQualityMonitorOptions crontabOverride(String crontabOverride) {
    this.crontabOverride = crontabOverride;
    return this;
  }

  /**
   * <p>Crontab expression to override the default schedule.</p>
   * @return crontabOverride
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_CRONTAB_OVERRIDE)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
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
   * <p>Custom SQL query for the monitor.</p>
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
  public MonitorFormulaAndFunctionDataQualityMonitorOptions customWhere(String customWhere) {
    this.customWhere = customWhere;
    return this;
  }

  /**
   * <p>Custom WHERE clause for the query.</p>
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
  public MonitorFormulaAndFunctionDataQualityMonitorOptions groupByColumns(List<String> groupByColumns) {
    this.groupByColumns = groupByColumns;
    return this;
  }
  public MonitorFormulaAndFunctionDataQualityMonitorOptions addGroupByColumnsItem(String groupByColumnsItem) {
    if (this.groupByColumns == null) {
      this.groupByColumns = new ArrayList<>();
    }
    this.groupByColumns.add(groupByColumnsItem);
    return this;
  }

  /**
   * <p>Columns to group results by.</p>
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
  public MonitorFormulaAndFunctionDataQualityMonitorOptions modelConfiguration(MonitorFormulaAndFunctionDataQualityModelConfiguration modelConfiguration) {
    this.modelConfiguration = modelConfiguration;
    this.unparsed |= modelConfiguration.unparsed;
    return this;
  }

  /**
   * <p>Tuning options for the anomaly detection model used by the monitor.</p>
   * @return modelConfiguration
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_MODEL_CONFIGURATION)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public MonitorFormulaAndFunctionDataQualityModelConfiguration getModelConfiguration() {
        return modelConfiguration;
      }
  public void setModelConfiguration(MonitorFormulaAndFunctionDataQualityModelConfiguration modelConfiguration) {
    this.modelConfiguration = modelConfiguration;
    if (modelConfiguration != null) {
      this.unparsed |= modelConfiguration.unparsed;
    }
  }
  public MonitorFormulaAndFunctionDataQualityMonitorOptions modelTypeOverride(MonitorFormulaAndFunctionDataQualityModelTypeOverride modelTypeOverride) {
    this.modelTypeOverride = modelTypeOverride;
    this.unparsed |= !modelTypeOverride.isValid();
    return this;
  }

  /**
   * <p>Override for the model type used in anomaly detection.</p>
   * @return modelTypeOverride
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_MODEL_TYPE_OVERRIDE)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public MonitorFormulaAndFunctionDataQualityModelTypeOverride getModelTypeOverride() {
        return modelTypeOverride;
      }
  public void setModelTypeOverride(MonitorFormulaAndFunctionDataQualityModelTypeOverride modelTypeOverride) {
    if (!modelTypeOverride.isValid()) {
        this.unparsed = true;
    }
    this.modelTypeOverride = modelTypeOverride;
  }
  public MonitorFormulaAndFunctionDataQualityMonitorOptions sensitivity(Double sensitivity) {
    this.sensitivity = sensitivity;
    return this;
  }

  /**
   * <p>Sensitivity of the anomaly detection model, expressed as a multiplier on the width
   * of the predicted bounds. Higher values widen the bounds and produce fewer alerts;
   * lower values tighten them and produce more alerts. Defaults to <code>3.0</code>.</p>
   * @return sensitivity
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_SENSITIVITY)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public Double getSensitivity() {
        return sensitivity;
      }
  public void setSensitivity(Double sensitivity) {
    this.sensitivity = sensitivity;
  }
  public MonitorFormulaAndFunctionDataQualityMonitorOptions sourceToTargetConfig(MonitorFormulaAndFunctionDataQualitySourceToTargetConfig sourceToTargetConfig) {
    this.sourceToTargetConfig = sourceToTargetConfig;
    this.unparsed |= sourceToTargetConfig.unparsed;
    return this;
  }

  /**
   * <p>Configuration for a source to target monitor, which compares the same measure
   * across two data entities and alerts on the difference between them.</p>
   * @return sourceToTargetConfig
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_SOURCE_TO_TARGET_CONFIG)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public MonitorFormulaAndFunctionDataQualitySourceToTargetConfig getSourceToTargetConfig() {
        return sourceToTargetConfig;
      }
  public void setSourceToTargetConfig(MonitorFormulaAndFunctionDataQualitySourceToTargetConfig sourceToTargetConfig) {
    this.sourceToTargetConfig = sourceToTargetConfig;
    if (sourceToTargetConfig != null) {
      this.unparsed |= sourceToTargetConfig.unparsed;
    }
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
   * @return MonitorFormulaAndFunctionDataQualityMonitorOptions
   */
  @JsonAnySetter
  public MonitorFormulaAndFunctionDataQualityMonitorOptions putAdditionalProperty(String key, Object value) {
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
    MonitorFormulaAndFunctionDataQualityMonitorOptions monitorFormulaAndFunctionDataQualityMonitorOptions = (MonitorFormulaAndFunctionDataQualityMonitorOptions) o;
    return Objects.equals(this.crontabOverride, monitorFormulaAndFunctionDataQualityMonitorOptions.crontabOverride) && Objects.equals(this.customSql, monitorFormulaAndFunctionDataQualityMonitorOptions.customSql) && Objects.equals(this.customWhere, monitorFormulaAndFunctionDataQualityMonitorOptions.customWhere) && Objects.equals(this.groupByColumns, monitorFormulaAndFunctionDataQualityMonitorOptions.groupByColumns) && Objects.equals(this.modelConfiguration, monitorFormulaAndFunctionDataQualityMonitorOptions.modelConfiguration) && Objects.equals(this.modelTypeOverride, monitorFormulaAndFunctionDataQualityMonitorOptions.modelTypeOverride) && Objects.equals(this.sensitivity, monitorFormulaAndFunctionDataQualityMonitorOptions.sensitivity) && Objects.equals(this.sourceToTargetConfig, monitorFormulaAndFunctionDataQualityMonitorOptions.sourceToTargetConfig) && Objects.equals(this.additionalProperties, monitorFormulaAndFunctionDataQualityMonitorOptions.additionalProperties);
  }


  @Override
  public int hashCode() {
    return Objects.hash(crontabOverride,customSql,customWhere,groupByColumns,modelConfiguration,modelTypeOverride,sensitivity,sourceToTargetConfig, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MonitorFormulaAndFunctionDataQualityMonitorOptions {\n");
    sb.append("    crontabOverride: ").append(toIndentedString(crontabOverride)).append("\n");
    sb.append("    customSql: ").append(toIndentedString(customSql)).append("\n");
    sb.append("    customWhere: ").append(toIndentedString(customWhere)).append("\n");
    sb.append("    groupByColumns: ").append(toIndentedString(groupByColumns)).append("\n");
    sb.append("    modelConfiguration: ").append(toIndentedString(modelConfiguration)).append("\n");
    sb.append("    modelTypeOverride: ").append(toIndentedString(modelTypeOverride)).append("\n");
    sb.append("    sensitivity: ").append(toIndentedString(sensitivity)).append("\n");
    sb.append("    sourceToTargetConfig: ").append(toIndentedString(sourceToTargetConfig)).append("\n");
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
