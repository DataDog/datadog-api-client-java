/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v1_20270101.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/** Test-only generated schema for the dashboard versioning proof of concept. */
@JsonPropertyOrder({
  ApmRecommendationsStreamQuery.JSON_PROPERTY_CROSS_ORG_UUIDS,
  ApmRecommendationsStreamQuery.JSON_PROPERTY_CUSTOM_SERVICE_TAGS,
  ApmRecommendationsStreamQuery.JSON_PROPERTY_DATA_SOURCE,
  ApmRecommendationsStreamQuery.JSON_PROPERTY_ENV,
  ApmRecommendationsStreamQuery.JSON_PROPERTY_GROUP_BY,
  ApmRecommendationsStreamQuery.JSON_PROPERTY_INDEXES,
  ApmRecommendationsStreamQuery.JSON_PROPERTY_PRIORITIES,
  ApmRecommendationsStreamQuery.JSON_PROPERTY_QUERY_STRING,
  ApmRecommendationsStreamQuery.JSON_PROPERTY_RECOMMENDATION_TYPES,
  ApmRecommendationsStreamQuery.JSON_PROPERTY_SERVICES,
  ApmRecommendationsStreamQuery.JSON_PROPERTY_SORT,
  ApmRecommendationsStreamQuery.JSON_PROPERTY_STATUSES,
  ApmRecommendationsStreamQuery.JSON_PROPERTY_TEAMS
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class ApmRecommendationsStreamQuery {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_CROSS_ORG_UUIDS = "cross_org_uuids";
  private List<String> crossOrgUuids = null;

  public static final String JSON_PROPERTY_CUSTOM_SERVICE_TAGS = "custom_service_tags";
  private List<String> customServiceTags = null;

  public static final String JSON_PROPERTY_DATA_SOURCE = "data_source";
  private ApmRecommendationsStreamQueryDataSource dataSource;

  public static final String JSON_PROPERTY_ENV = "env";
  private String env;

  public static final String JSON_PROPERTY_GROUP_BY = "group_by";
  private com.datadog.api.client.v1.model.ApmRecommendationsStreamQuery20270101GroupBy groupBy;

  public static final String JSON_PROPERTY_INDEXES = "indexes";
  private List<String> indexes = null;

  public static final String JSON_PROPERTY_PRIORITIES = "priorities";
  private List<String> priorities = null;

  public static final String JSON_PROPERTY_QUERY_STRING = "query_string";
  private String queryString;

  public static final String JSON_PROPERTY_RECOMMENDATION_TYPES = "recommendation_types";
  private List<String> recommendationTypes = null;

  public static final String JSON_PROPERTY_SERVICES = "services";
  private List<String> services = null;

  public static final String JSON_PROPERTY_SORT = "sort";
  private ApmRecommendationsStreamQuery20270101Sort sort;

  public static final String JSON_PROPERTY_STATUSES = "statuses";
  private List<String> statuses = null;

  public static final String JSON_PROPERTY_TEAMS = "teams";
  private List<String> teams = null;

  public ApmRecommendationsStreamQuery() {}

  @JsonCreator
  public ApmRecommendationsStreamQuery(
      @JsonProperty(required = true, value = JSON_PROPERTY_DATA_SOURCE)
          ApmRecommendationsStreamQueryDataSource dataSource,
      @JsonProperty(required = true, value = JSON_PROPERTY_QUERY_STRING) String queryString) {
    this.dataSource = dataSource;
    this.unparsed |= !dataSource.isValid();
    this.queryString = queryString;
  }

  public ApmRecommendationsStreamQuery crossOrgUuids(List<String> crossOrgUuids) {
    this.crossOrgUuids = crossOrgUuids;
    return this;
  }

  public ApmRecommendationsStreamQuery addCrossOrgUuidsItem(String crossOrgUuidsItem) {
    if (this.crossOrgUuids == null) {
      this.crossOrgUuids = new ArrayList<>();
    }
    this.crossOrgUuids.add(crossOrgUuidsItem);
    return this;
  }

  /**
   * Test-only generated schema for the dashboard versioning proof of concept.
   *
   * @return crossOrgUuids
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CROSS_ORG_UUIDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<String> getCrossOrgUuids() {
    return crossOrgUuids;
  }

  public void setCrossOrgUuids(List<String> crossOrgUuids) {
    this.crossOrgUuids = crossOrgUuids;
  }

  public ApmRecommendationsStreamQuery customServiceTags(List<String> customServiceTags) {
    this.customServiceTags = customServiceTags;
    return this;
  }

  public ApmRecommendationsStreamQuery addCustomServiceTagsItem(String customServiceTagsItem) {
    if (this.customServiceTags == null) {
      this.customServiceTags = new ArrayList<>();
    }
    this.customServiceTags.add(customServiceTagsItem);
    return this;
  }

  /**
   * Test-only generated schema for the dashboard versioning proof of concept.
   *
   * @return customServiceTags
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CUSTOM_SERVICE_TAGS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<String> getCustomServiceTags() {
    return customServiceTags;
  }

  public void setCustomServiceTags(List<String> customServiceTags) {
    this.customServiceTags = customServiceTags;
  }

  public ApmRecommendationsStreamQuery dataSource(
      ApmRecommendationsStreamQueryDataSource dataSource) {
    this.dataSource = dataSource;
    this.unparsed |= !dataSource.isValid();
    return this;
  }

  /**
   * Test-only generated schema for the dashboard versioning proof of concept.
   *
   * @return dataSource
   */
  @JsonProperty(JSON_PROPERTY_DATA_SOURCE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public ApmRecommendationsStreamQueryDataSource getDataSource() {
    return dataSource;
  }

  public void setDataSource(ApmRecommendationsStreamQueryDataSource dataSource) {
    if (!dataSource.isValid()) {
      this.unparsed = true;
    }
    this.dataSource = dataSource;
  }

  public ApmRecommendationsStreamQuery env(String env) {
    this.env = env;
    return this;
  }

  /**
   * Test-only generated schema for the dashboard versioning proof of concept.
   *
   * @return env
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ENV)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getEnv() {
    return env;
  }

  public void setEnv(String env) {
    this.env = env;
  }

  public ApmRecommendationsStreamQuery groupBy(
      com.datadog.api.client.v1.model.ApmRecommendationsStreamQuery20270101GroupBy groupBy) {
    this.groupBy = groupBy;
    this.unparsed |= groupBy.unparsed;
    return this;
  }

  /**
   * Test-only generated schema for the dashboard versioning proof of concept.
   *
   * @return groupBy
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_GROUP_BY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public com.datadog.api.client.v1.model.ApmRecommendationsStreamQuery20270101GroupBy getGroupBy() {
    return groupBy;
  }

  public void setGroupBy(
      com.datadog.api.client.v1.model.ApmRecommendationsStreamQuery20270101GroupBy groupBy) {
    this.groupBy = groupBy;
    if (groupBy != null) {
      this.unparsed |= groupBy.unparsed;
    }
  }

  public ApmRecommendationsStreamQuery indexes(List<String> indexes) {
    this.indexes = indexes;
    return this;
  }

  public ApmRecommendationsStreamQuery addIndexesItem(String indexesItem) {
    if (this.indexes == null) {
      this.indexes = new ArrayList<>();
    }
    this.indexes.add(indexesItem);
    return this;
  }

  /**
   * Test-only generated schema for the dashboard versioning proof of concept.
   *
   * @return indexes
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_INDEXES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<String> getIndexes() {
    return indexes;
  }

  public void setIndexes(List<String> indexes) {
    this.indexes = indexes;
  }

  public ApmRecommendationsStreamQuery priorities(List<String> priorities) {
    this.priorities = priorities;
    return this;
  }

  public ApmRecommendationsStreamQuery addPrioritiesItem(String prioritiesItem) {
    if (this.priorities == null) {
      this.priorities = new ArrayList<>();
    }
    this.priorities.add(prioritiesItem);
    return this;
  }

  /**
   * Test-only generated schema for the dashboard versioning proof of concept.
   *
   * @return priorities
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PRIORITIES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<String> getPriorities() {
    return priorities;
  }

  public void setPriorities(List<String> priorities) {
    this.priorities = priorities;
  }

  public ApmRecommendationsStreamQuery queryString(String queryString) {
    this.queryString = queryString;
    return this;
  }

  /**
   * Test-only generated schema for the dashboard versioning proof of concept.
   *
   * @return queryString
   */
  @JsonProperty(JSON_PROPERTY_QUERY_STRING)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getQueryString() {
    return queryString;
  }

  public void setQueryString(String queryString) {
    this.queryString = queryString;
  }

  public ApmRecommendationsStreamQuery recommendationTypes(List<String> recommendationTypes) {
    this.recommendationTypes = recommendationTypes;
    return this;
  }

  public ApmRecommendationsStreamQuery addRecommendationTypesItem(String recommendationTypesItem) {
    if (this.recommendationTypes == null) {
      this.recommendationTypes = new ArrayList<>();
    }
    this.recommendationTypes.add(recommendationTypesItem);
    return this;
  }

  /**
   * Test-only generated schema for the dashboard versioning proof of concept.
   *
   * @return recommendationTypes
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_RECOMMENDATION_TYPES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<String> getRecommendationTypes() {
    return recommendationTypes;
  }

  public void setRecommendationTypes(List<String> recommendationTypes) {
    this.recommendationTypes = recommendationTypes;
  }

  public ApmRecommendationsStreamQuery services(List<String> services) {
    this.services = services;
    return this;
  }

  public ApmRecommendationsStreamQuery addServicesItem(String servicesItem) {
    if (this.services == null) {
      this.services = new ArrayList<>();
    }
    this.services.add(servicesItem);
    return this;
  }

  /**
   * Test-only generated schema for the dashboard versioning proof of concept.
   *
   * @return services
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SERVICES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<String> getServices() {
    return services;
  }

  public void setServices(List<String> services) {
    this.services = services;
  }

  public ApmRecommendationsStreamQuery sort(ApmRecommendationsStreamQuery20270101Sort sort) {
    this.sort = sort;
    this.unparsed |= sort.unparsed;
    return this;
  }

  /**
   * Test-only generated schema for the dashboard versioning proof of concept.
   *
   * @return sort
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SORT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public ApmRecommendationsStreamQuery20270101Sort getSort() {
    return sort;
  }

  public void setSort(ApmRecommendationsStreamQuery20270101Sort sort) {
    this.sort = sort;
    if (sort != null) {
      this.unparsed |= sort.unparsed;
    }
  }

  public ApmRecommendationsStreamQuery statuses(List<String> statuses) {
    this.statuses = statuses;
    return this;
  }

  public ApmRecommendationsStreamQuery addStatusesItem(String statusesItem) {
    if (this.statuses == null) {
      this.statuses = new ArrayList<>();
    }
    this.statuses.add(statusesItem);
    return this;
  }

  /**
   * Test-only generated schema for the dashboard versioning proof of concept.
   *
   * @return statuses
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_STATUSES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<String> getStatuses() {
    return statuses;
  }

  public void setStatuses(List<String> statuses) {
    this.statuses = statuses;
  }

  public ApmRecommendationsStreamQuery teams(List<String> teams) {
    this.teams = teams;
    return this;
  }

  public ApmRecommendationsStreamQuery addTeamsItem(String teamsItem) {
    if (this.teams == null) {
      this.teams = new ArrayList<>();
    }
    this.teams.add(teamsItem);
    return this;
  }

  /**
   * Test-only generated schema for the dashboard versioning proof of concept.
   *
   * @return teams
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TEAMS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<String> getTeams() {
    return teams;
  }

  public void setTeams(List<String> teams) {
    this.teams = teams;
  }

  /** Return true if this ApmRecommendationsStreamQuery object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ApmRecommendationsStreamQuery apmRecommendationsStreamQuery = (ApmRecommendationsStreamQuery) o;
    return Objects.equals(this.crossOrgUuids, apmRecommendationsStreamQuery.crossOrgUuids)
        && Objects.equals(this.customServiceTags, apmRecommendationsStreamQuery.customServiceTags)
        && Objects.equals(this.dataSource, apmRecommendationsStreamQuery.dataSource)
        && Objects.equals(this.env, apmRecommendationsStreamQuery.env)
        && Objects.equals(this.groupBy, apmRecommendationsStreamQuery.groupBy)
        && Objects.equals(this.indexes, apmRecommendationsStreamQuery.indexes)
        && Objects.equals(this.priorities, apmRecommendationsStreamQuery.priorities)
        && Objects.equals(this.queryString, apmRecommendationsStreamQuery.queryString)
        && Objects.equals(
            this.recommendationTypes, apmRecommendationsStreamQuery.recommendationTypes)
        && Objects.equals(this.services, apmRecommendationsStreamQuery.services)
        && Objects.equals(this.sort, apmRecommendationsStreamQuery.sort)
        && Objects.equals(this.statuses, apmRecommendationsStreamQuery.statuses)
        && Objects.equals(this.teams, apmRecommendationsStreamQuery.teams);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        crossOrgUuids,
        customServiceTags,
        dataSource,
        env,
        groupBy,
        indexes,
        priorities,
        queryString,
        recommendationTypes,
        services,
        sort,
        statuses,
        teams);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApmRecommendationsStreamQuery {\n");
    sb.append("    crossOrgUuids: ").append(toIndentedString(crossOrgUuids)).append("\n");
    sb.append("    customServiceTags: ").append(toIndentedString(customServiceTags)).append("\n");
    sb.append("    dataSource: ").append(toIndentedString(dataSource)).append("\n");
    sb.append("    env: ").append(toIndentedString(env)).append("\n");
    sb.append("    groupBy: ").append(toIndentedString(groupBy)).append("\n");
    sb.append("    indexes: ").append(toIndentedString(indexes)).append("\n");
    sb.append("    priorities: ").append(toIndentedString(priorities)).append("\n");
    sb.append("    queryString: ").append(toIndentedString(queryString)).append("\n");
    sb.append("    recommendationTypes: ")
        .append(toIndentedString(recommendationTypes))
        .append("\n");
    sb.append("    services: ").append(toIndentedString(services)).append("\n");
    sb.append("    sort: ").append(toIndentedString(sort)).append("\n");
    sb.append("    statuses: ").append(toIndentedString(statuses)).append("\n");
    sb.append("    teams: ").append(toIndentedString(teams)).append("\n");
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
