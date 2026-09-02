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
   * <p>Reference tables used in the queries.</p>
 */
@JsonPropertyOrder({
  SecurityMonitoringReferenceTable.JSON_PROPERTY_CHECK_PRESENCE,
  SecurityMonitoringReferenceTable.JSON_PROPERTY_COLUMN_NAME,
  SecurityMonitoringReferenceTable.JSON_PROPERTY_LOG_FIELD_PATH,
  SecurityMonitoringReferenceTable.JSON_PROPERTY_RULE_QUERY_NAME,
  SecurityMonitoringReferenceTable.JSON_PROPERTY_TABLE_NAME
})
@jakarta.annotation.Generated(value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class SecurityMonitoringReferenceTable {
  @JsonIgnore
  public boolean unparsed = false;
  public static final String JSON_PROPERTY_CHECK_PRESENCE = "checkPresence";
  private Boolean checkPresence;

  public static final String JSON_PROPERTY_COLUMN_NAME = "columnName";
  private String columnName;

  public static final String JSON_PROPERTY_LOG_FIELD_PATH = "logFieldPath";
  private String logFieldPath;

  public static final String JSON_PROPERTY_RULE_QUERY_NAME = "ruleQueryName";
  private String ruleQueryName;

  public static final String JSON_PROPERTY_TABLE_NAME = "tableName";
  private String tableName;

  public SecurityMonitoringReferenceTable checkPresence(Boolean checkPresence) {
    this.checkPresence = checkPresence;
    return this;
  }

  /**
   * <p>Whether to include or exclude the matched values.</p>
   * @return checkPresence
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_CHECK_PRESENCE)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public Boolean getCheckPresence() {
        return checkPresence;
      }
  public void setCheckPresence(Boolean checkPresence) {
    this.checkPresence = checkPresence;
  }
  public SecurityMonitoringReferenceTable columnName(String columnName) {
    this.columnName = columnName;
    return this;
  }

  /**
   * <p>The name of the column in the reference table.</p>
   * @return columnName
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_COLUMN_NAME)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public String getColumnName() {
        return columnName;
      }
  public void setColumnName(String columnName) {
    this.columnName = columnName;
  }
  public SecurityMonitoringReferenceTable logFieldPath(String logFieldPath) {
    this.logFieldPath = logFieldPath;
    return this;
  }

  /**
   * <p>The field in the log to match against the reference table.</p>
   * @return logFieldPath
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_LOG_FIELD_PATH)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public String getLogFieldPath() {
        return logFieldPath;
      }
  public void setLogFieldPath(String logFieldPath) {
    this.logFieldPath = logFieldPath;
  }
  public SecurityMonitoringReferenceTable ruleQueryName(String ruleQueryName) {
    this.ruleQueryName = ruleQueryName;
    return this;
  }

  /**
   * <p>The name of the query to apply the reference table to.</p>
   * @return ruleQueryName
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_RULE_QUERY_NAME)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public String getRuleQueryName() {
        return ruleQueryName;
      }
  public void setRuleQueryName(String ruleQueryName) {
    this.ruleQueryName = ruleQueryName;
  }
  public SecurityMonitoringReferenceTable tableName(String tableName) {
    this.tableName = tableName;
    return this;
  }

  /**
   * <p>The name of the reference table.</p>
   * @return tableName
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_TABLE_NAME)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public String getTableName() {
        return tableName;
      }
  public void setTableName(String tableName) {
    this.tableName = tableName;
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
   * @return SecurityMonitoringReferenceTable
   */
  @JsonAnySetter
  public SecurityMonitoringReferenceTable putAdditionalProperty(String key, Object value) {
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
   * Return true if this SecurityMonitoringReferenceTable object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SecurityMonitoringReferenceTable securityMonitoringReferenceTable = (SecurityMonitoringReferenceTable) o;
    return Objects.equals(this.checkPresence, securityMonitoringReferenceTable.checkPresence) && Objects.equals(this.columnName, securityMonitoringReferenceTable.columnName) && Objects.equals(this.logFieldPath, securityMonitoringReferenceTable.logFieldPath) && Objects.equals(this.ruleQueryName, securityMonitoringReferenceTable.ruleQueryName) && Objects.equals(this.tableName, securityMonitoringReferenceTable.tableName) && Objects.equals(this.additionalProperties, securityMonitoringReferenceTable.additionalProperties);
  }


  @Override
  public int hashCode() {
    return Objects.hash(checkPresence,columnName,logFieldPath,ruleQueryName,tableName, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SecurityMonitoringReferenceTable {\n");
    sb.append("    checkPresence: ").append(toIndentedString(checkPresence)).append("\n");
    sb.append("    columnName: ").append(toIndentedString(columnName)).append("\n");
    sb.append("    logFieldPath: ").append(toIndentedString(logFieldPath)).append("\n");
    sb.append("    ruleQueryName: ").append(toIndentedString(ruleQueryName)).append("\n");
    sb.append("    tableName: ").append(toIndentedString(tableName)).append("\n");
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
