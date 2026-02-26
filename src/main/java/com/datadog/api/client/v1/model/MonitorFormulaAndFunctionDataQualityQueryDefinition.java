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
   * <p>A formula and functions data quality query.</p>
 */
@JsonPropertyOrder({
  MonitorFormulaAndFunctionDataQualityQueryDefinition.JSON_PROPERTY_DATA_SOURCE,
  MonitorFormulaAndFunctionDataQualityQueryDefinition.JSON_PROPERTY_FILTER,
  MonitorFormulaAndFunctionDataQualityQueryDefinition.JSON_PROPERTY_GROUP_BY,
  MonitorFormulaAndFunctionDataQualityQueryDefinition.JSON_PROPERTY_MEASURE,
  MonitorFormulaAndFunctionDataQualityQueryDefinition.JSON_PROPERTY_MONITOR_OPTIONS,
  MonitorFormulaAndFunctionDataQualityQueryDefinition.JSON_PROPERTY_NAME,
  MonitorFormulaAndFunctionDataQualityQueryDefinition.JSON_PROPERTY_SCHEMA_VERSION,
  MonitorFormulaAndFunctionDataQualityQueryDefinition.JSON_PROPERTY_SCOPE
})
@jakarta.annotation.Generated(value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class MonitorFormulaAndFunctionDataQualityQueryDefinition {
  @JsonIgnore
  public boolean unparsed = false;
  public static final String JSON_PROPERTY_DATA_SOURCE = "data_source";
  private MonitorFormulaAndFunctionDataQualityDataSource dataSource;

  public static final String JSON_PROPERTY_FILTER = "filter";
  private String filter;

  public static final String JSON_PROPERTY_GROUP_BY = "group_by";
  private List<String> groupBy = null;

  public static final String JSON_PROPERTY_MEASURE = "measure";
  private String measure;

  public static final String JSON_PROPERTY_MONITOR_OPTIONS = "monitor_options";
  private MonitorFormulaAndFunctionDataQualityMonitorOptions monitorOptions;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_SCHEMA_VERSION = "schema_version";
  private String schemaVersion;

  public static final String JSON_PROPERTY_SCOPE = "scope";
  private String scope;

  public MonitorFormulaAndFunctionDataQualityQueryDefinition() {}

  @JsonCreator
  public MonitorFormulaAndFunctionDataQualityQueryDefinition(
            @JsonProperty(required=true, value=JSON_PROPERTY_DATA_SOURCE)MonitorFormulaAndFunctionDataQualityDataSource dataSource,
            @JsonProperty(required=true, value=JSON_PROPERTY_FILTER)String filter,
            @JsonProperty(required=true, value=JSON_PROPERTY_MEASURE)String measure,
            @JsonProperty(required=true, value=JSON_PROPERTY_NAME)String name) {
        this.dataSource = dataSource;
        this.unparsed |= !dataSource.isValid();
        this.filter = filter;
        this.measure = measure;
        this.name = name;
  }
  public MonitorFormulaAndFunctionDataQualityQueryDefinition dataSource(MonitorFormulaAndFunctionDataQualityDataSource dataSource) {
    this.dataSource = dataSource;
    this.unparsed |= !dataSource.isValid();
    return this;
  }

  /**
   * <p>Data source for data quality queries.</p>
   * @return dataSource
  **/
      @JsonProperty(JSON_PROPERTY_DATA_SOURCE)
      @JsonInclude(
        value = JsonInclude.Include.ALWAYS)
      public MonitorFormulaAndFunctionDataQualityDataSource getDataSource() {
        return dataSource;
      }
  public void setDataSource(MonitorFormulaAndFunctionDataQualityDataSource dataSource) {
    if (!dataSource.isValid()) {
        this.unparsed = true;
    }
    this.dataSource = dataSource;
  }
  public MonitorFormulaAndFunctionDataQualityQueryDefinition filter(String filter) {
    this.filter = filter;
    return this;
  }

  /**
   * <p>Filter expression used to match on data entities. Uses Aastra query syntax.</p>
   * @return filter
  **/
      @JsonProperty(JSON_PROPERTY_FILTER)
      @JsonInclude(
        value = JsonInclude.Include.ALWAYS)
      public String getFilter() {
        return filter;
      }
  public void setFilter(String filter) {
    this.filter = filter;
  }
  public MonitorFormulaAndFunctionDataQualityQueryDefinition groupBy(List<String> groupBy) {
    this.groupBy = groupBy;
    return this;
  }
  public MonitorFormulaAndFunctionDataQualityQueryDefinition addGroupByItem(String groupByItem) {
    if (this.groupBy == null) {
      this.groupBy = new ArrayList<>();
    }
    this.groupBy.add(groupByItem);
    return this;
  }

  /**
   * <p>Optional grouping fields for aggregation.</p>
   * @return groupBy
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_GROUP_BY)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public List<String> getGroupBy() {
        return groupBy;
      }
  public void setGroupBy(List<String> groupBy) {
    this.groupBy = groupBy;
  }
  public MonitorFormulaAndFunctionDataQualityQueryDefinition measure(String measure) {
    this.measure = measure;
    return this;
  }

  /**
   * <p>The data quality measure to query. Common values include:
   * <code>bytes</code>, <code>cardinality</code>, <code>custom</code>, <code>freshness</code>, <code>max</code>, <code>mean</code>, <code>min</code>,
   * <code>nullness</code>, <code>percent_negative</code>, <code>percent_zero</code>, <code>row_count</code>, <code>stddev</code>,
   * <code>sum</code>, <code>uniqueness</code>. Additional values may be supported.</p>
   * @return measure
  **/
      @JsonProperty(JSON_PROPERTY_MEASURE)
      @JsonInclude(
        value = JsonInclude.Include.ALWAYS)
      public String getMeasure() {
        return measure;
      }
  public void setMeasure(String measure) {
    this.measure = measure;
  }
  public MonitorFormulaAndFunctionDataQualityQueryDefinition monitorOptions(MonitorFormulaAndFunctionDataQualityMonitorOptions monitorOptions) {
    this.monitorOptions = monitorOptions;
    this.unparsed |= monitorOptions.unparsed;
    return this;
  }

  /**
   * <p>Monitor configuration options for data quality queries.</p>
   * @return monitorOptions
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_MONITOR_OPTIONS)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public MonitorFormulaAndFunctionDataQualityMonitorOptions getMonitorOptions() {
        return monitorOptions;
      }
  public void setMonitorOptions(MonitorFormulaAndFunctionDataQualityMonitorOptions monitorOptions) {
    this.monitorOptions = monitorOptions;
  }
  public MonitorFormulaAndFunctionDataQualityQueryDefinition name(String name) {
    this.name = name;
    return this;
  }

  /**
   * <p>Name of the query for use in formulas.</p>
   * @return name
  **/
      @JsonProperty(JSON_PROPERTY_NAME)
      @JsonInclude(
        value = JsonInclude.Include.ALWAYS)
      public String getName() {
        return name;
      }
  public void setName(String name) {
    this.name = name;
  }
  public MonitorFormulaAndFunctionDataQualityQueryDefinition schemaVersion(String schemaVersion) {
    this.schemaVersion = schemaVersion;
    return this;
  }

  /**
   * <p>Schema version for the data quality query.</p>
   * @return schemaVersion
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_SCHEMA_VERSION)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public String getSchemaVersion() {
        return schemaVersion;
      }
  public void setSchemaVersion(String schemaVersion) {
    this.schemaVersion = schemaVersion;
  }
  public MonitorFormulaAndFunctionDataQualityQueryDefinition scope(String scope) {
    this.scope = scope;
    return this;
  }

  /**
   * <p>Optional scoping expression to further filter metrics. Uses metrics filter syntax.
   * This is useful when an entity has been configured to emit metrics with additional tags.</p>
   * @return scope
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_SCOPE)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public String getScope() {
        return scope;
      }
  public void setScope(String scope) {
    this.scope = scope;
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
   * @return MonitorFormulaAndFunctionDataQualityQueryDefinition
   */
  @JsonAnySetter
  public MonitorFormulaAndFunctionDataQualityQueryDefinition putAdditionalProperty(String key, Object value) {
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
   * Return true if this MonitorFormulaAndFunctionDataQualityQueryDefinition object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MonitorFormulaAndFunctionDataQualityQueryDefinition monitorFormulaAndFunctionDataQualityQueryDefinition = (MonitorFormulaAndFunctionDataQualityQueryDefinition) o;
    return Objects.equals(this.dataSource, monitorFormulaAndFunctionDataQualityQueryDefinition.dataSource) && Objects.equals(this.filter, monitorFormulaAndFunctionDataQualityQueryDefinition.filter) && Objects.equals(this.groupBy, monitorFormulaAndFunctionDataQualityQueryDefinition.groupBy) && Objects.equals(this.measure, monitorFormulaAndFunctionDataQualityQueryDefinition.measure) && Objects.equals(this.monitorOptions, monitorFormulaAndFunctionDataQualityQueryDefinition.monitorOptions) && Objects.equals(this.name, monitorFormulaAndFunctionDataQualityQueryDefinition.name) && Objects.equals(this.schemaVersion, monitorFormulaAndFunctionDataQualityQueryDefinition.schemaVersion) && Objects.equals(this.scope, monitorFormulaAndFunctionDataQualityQueryDefinition.scope) && Objects.equals(this.additionalProperties, monitorFormulaAndFunctionDataQualityQueryDefinition.additionalProperties);
  }


  @Override
  public int hashCode() {
    return Objects.hash(dataSource,filter,groupBy,measure,monitorOptions,name,schemaVersion,scope, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MonitorFormulaAndFunctionDataQualityQueryDefinition {\n");
    sb.append("    dataSource: ").append(toIndentedString(dataSource)).append("\n");
    sb.append("    filter: ").append(toIndentedString(filter)).append("\n");
    sb.append("    groupBy: ").append(toIndentedString(groupBy)).append("\n");
    sb.append("    measure: ").append(toIndentedString(measure)).append("\n");
    sb.append("    monitorOptions: ").append(toIndentedString(monitorOptions)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    schemaVersion: ").append(toIndentedString(schemaVersion)).append("\n");
    sb.append("    scope: ").append(toIndentedString(scope)).append("\n");
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
