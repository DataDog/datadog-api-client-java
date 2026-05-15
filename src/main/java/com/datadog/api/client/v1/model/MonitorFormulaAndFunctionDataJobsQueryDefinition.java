/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v1.model;

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

/** A formula and functions data jobs query. */
@JsonPropertyOrder({
  MonitorFormulaAndFunctionDataJobsQueryDefinition.JSON_PROPERTY_JOB_TYPE,
  MonitorFormulaAndFunctionDataJobsQueryDefinition.JSON_PROPERTY_JOBS_QUERY,
  MonitorFormulaAndFunctionDataJobsQueryDefinition.JSON_PROPERTY_NAME,
  MonitorFormulaAndFunctionDataJobsQueryDefinition.JSON_PROPERTY_QUERY_DIALECT
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class MonitorFormulaAndFunctionDataJobsQueryDefinition {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_JOB_TYPE = "job_type";
  private String jobType;

  public static final String JSON_PROPERTY_JOBS_QUERY = "jobs_query";
  private String jobsQuery;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_QUERY_DIALECT = "query_dialect";
  private String queryDialect;

  public MonitorFormulaAndFunctionDataJobsQueryDefinition() {}

  @JsonCreator
  public MonitorFormulaAndFunctionDataJobsQueryDefinition(
      @JsonProperty(required = true, value = JSON_PROPERTY_JOB_TYPE) String jobType,
      @JsonProperty(required = true, value = JSON_PROPERTY_JOBS_QUERY) String jobsQuery,
      @JsonProperty(required = true, value = JSON_PROPERTY_NAME) String name,
      @JsonProperty(required = true, value = JSON_PROPERTY_QUERY_DIALECT) String queryDialect) {
    this.jobType = jobType;
    this.jobsQuery = jobsQuery;
    this.name = name;
    this.queryDialect = queryDialect;
  }

  public MonitorFormulaAndFunctionDataJobsQueryDefinition jobType(String jobType) {
    this.jobType = jobType;
    return this;
  }

  /**
   * The type of job being monitored. Valid values include: <code>databricks.job</code>, <code>
   * spark.application</code>, <code>airflow.dag</code>, <code>dbt.job</code>, <code>dbt.model
   * </code>, <code>dbt.test</code>, <code>glue.job</code>. Custom job types are supported with the
   * <code>custom.ol.</code> prefix.
   *
   * @return jobType
   */
  @JsonProperty(JSON_PROPERTY_JOB_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getJobType() {
    return jobType;
  }

  public void setJobType(String jobType) {
    this.jobType = jobType;
  }

  public MonitorFormulaAndFunctionDataJobsQueryDefinition jobsQuery(String jobsQuery) {
    this.jobsQuery = jobsQuery;
    return this;
  }

  /**
   * Filter expression used to select the jobs to monitor.
   *
   * @return jobsQuery
   */
  @JsonProperty(JSON_PROPERTY_JOBS_QUERY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getJobsQuery() {
    return jobsQuery;
  }

  public void setJobsQuery(String jobsQuery) {
    this.jobsQuery = jobsQuery;
  }

  public MonitorFormulaAndFunctionDataJobsQueryDefinition name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Name of the query for use in formulas. Must be <code>run_query</code>.
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

  public MonitorFormulaAndFunctionDataJobsQueryDefinition queryDialect(String queryDialect) {
    this.queryDialect = queryDialect;
    return this;
  }

  /**
   * Query dialect for data jobs queries. Currently only <code>metric</code> is supported.
   *
   * @return queryDialect
   */
  @JsonProperty(JSON_PROPERTY_QUERY_DIALECT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getQueryDialect() {
    return queryDialect;
  }

  public void setQueryDialect(String queryDialect) {
    this.queryDialect = queryDialect;
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
   * @return MonitorFormulaAndFunctionDataJobsQueryDefinition
   */
  @JsonAnySetter
  public MonitorFormulaAndFunctionDataJobsQueryDefinition putAdditionalProperty(
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

  /** Return true if this MonitorFormulaAndFunctionDataJobsQueryDefinition object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MonitorFormulaAndFunctionDataJobsQueryDefinition
        monitorFormulaAndFunctionDataJobsQueryDefinition =
            (MonitorFormulaAndFunctionDataJobsQueryDefinition) o;
    return Objects.equals(this.jobType, monitorFormulaAndFunctionDataJobsQueryDefinition.jobType)
        && Objects.equals(
            this.jobsQuery, monitorFormulaAndFunctionDataJobsQueryDefinition.jobsQuery)
        && Objects.equals(this.name, monitorFormulaAndFunctionDataJobsQueryDefinition.name)
        && Objects.equals(
            this.queryDialect, monitorFormulaAndFunctionDataJobsQueryDefinition.queryDialect)
        && Objects.equals(
            this.additionalProperties,
            monitorFormulaAndFunctionDataJobsQueryDefinition.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(jobType, jobsQuery, name, queryDialect, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MonitorFormulaAndFunctionDataJobsQueryDefinition {\n");
    sb.append("    jobType: ").append(toIndentedString(jobType)).append("\n");
    sb.append("    jobsQuery: ").append(toIndentedString(jobsQuery)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    queryDialect: ").append(toIndentedString(queryDialect)).append("\n");
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
