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
import org.openapitools.jackson.nullable.JsonNullable;

/**
 * A service level objective object includes a service level indicator, thresholds for one or more
 * timeframes, and metadata (<code>name</code>, <code>description</code>, and <code>tags</code>).
 */
@JsonPropertyOrder({
  SearchServiceLevelObjectiveAttributes.JSON_PROPERTY_ALL_TAGS,
  SearchServiceLevelObjectiveAttributes.JSON_PROPERTY_CREATED_AT,
  SearchServiceLevelObjectiveAttributes.JSON_PROPERTY_CREATOR,
  SearchServiceLevelObjectiveAttributes.JSON_PROPERTY_DESCRIPTION,
  SearchServiceLevelObjectiveAttributes.JSON_PROPERTY_ENV_TAGS,
  SearchServiceLevelObjectiveAttributes.JSON_PROPERTY_GROUPS,
  SearchServiceLevelObjectiveAttributes.JSON_PROPERTY_MODIFIED_AT,
  SearchServiceLevelObjectiveAttributes.JSON_PROPERTY_MONITOR_IDS,
  SearchServiceLevelObjectiveAttributes.JSON_PROPERTY_NAME,
  SearchServiceLevelObjectiveAttributes.JSON_PROPERTY_OVERALL_STATUS,
  SearchServiceLevelObjectiveAttributes.JSON_PROPERTY_QUERY,
  SearchServiceLevelObjectiveAttributes.JSON_PROPERTY_SERVICE_TAGS,
  SearchServiceLevelObjectiveAttributes.JSON_PROPERTY_SLO_TYPE,
  SearchServiceLevelObjectiveAttributes.JSON_PROPERTY_STATUS,
  SearchServiceLevelObjectiveAttributes.JSON_PROPERTY_TEAM_TAGS,
  SearchServiceLevelObjectiveAttributes.JSON_PROPERTY_THRESHOLDS
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class SearchServiceLevelObjectiveAttributes {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_ALL_TAGS = "all_tags";
  private List<String> allTags = null;

  public static final String JSON_PROPERTY_CREATED_AT = "created_at";
  private Long createdAt;

  public static final String JSON_PROPERTY_CREATOR = "creator";
  private JsonNullable<SLOCreator> creator = JsonNullable.<SLOCreator>undefined();

  public static final String JSON_PROPERTY_DESCRIPTION = "description";
  private JsonNullable<String> description = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_ENV_TAGS = "env_tags";
  private List<String> envTags = null;

  public static final String JSON_PROPERTY_GROUPS = "groups";
  private JsonNullable<List<String>> groups = JsonNullable.<List<String>>undefined();

  public static final String JSON_PROPERTY_MODIFIED_AT = "modified_at";
  private Long modifiedAt;

  public static final String JSON_PROPERTY_MONITOR_IDS = "monitor_ids";
  private JsonNullable<List<Long>> monitorIds = JsonNullable.<List<Long>>undefined();

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_OVERALL_STATUS = "overall_status";
  private List<SLOOverallStatuses> overallStatus = null;

  public static final String JSON_PROPERTY_QUERY = "query";
  private JsonNullable<SearchSLOQuery> query = JsonNullable.<SearchSLOQuery>undefined();

  public static final String JSON_PROPERTY_SERVICE_TAGS = "service_tags";
  private List<String> serviceTags = null;

  public static final String JSON_PROPERTY_SLO_TYPE = "slo_type";
  private SLOType sloType;

  public static final String JSON_PROPERTY_STATUS = "status";
  private SLOStatus status;

  public static final String JSON_PROPERTY_TEAM_TAGS = "team_tags";
  private List<String> teamTags = null;

  public static final String JSON_PROPERTY_THRESHOLDS = "thresholds";
  private List<SearchSLOThreshold> thresholds = null;

  public SearchServiceLevelObjectiveAttributes allTags(List<String> allTags) {
    this.allTags = allTags;
    return this;
  }

  public SearchServiceLevelObjectiveAttributes addAllTagsItem(String allTagsItem) {
    if (this.allTags == null) {
      this.allTags = new ArrayList<>();
    }
    this.allTags.add(allTagsItem);
    return this;
  }

  /**
   * A list of tags associated with this service level objective. Always included in service level
   * objective responses (but may be empty).
   *
   * @return allTags
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ALL_TAGS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<String> getAllTags() {
    return allTags;
  }

  public void setAllTags(List<String> allTags) {
    this.allTags = allTags;
  }

  /**
   * Creation timestamp (UNIX time in seconds)
   *
   * <p>Always included in service level objective responses.
   *
   * @return createdAt
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CREATED_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getCreatedAt() {
    return createdAt;
  }

  public SearchServiceLevelObjectiveAttributes creator(SLOCreator creator) {
    this.creator = JsonNullable.<SLOCreator>of(creator);
    return this;
  }

  /**
   * The creator of the SLO
   *
   * @return creator
   */
  @jakarta.annotation.Nullable
  @JsonIgnore
  public SLOCreator getCreator() {
    return creator.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_CREATOR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<SLOCreator> getCreator_JsonNullable() {
    return creator;
  }

  @JsonProperty(JSON_PROPERTY_CREATOR)
  public void setCreator_JsonNullable(JsonNullable<SLOCreator> creator) {
    this.creator = creator;
  }

  public void setCreator(SLOCreator creator) {
    this.creator = JsonNullable.<SLOCreator>of(creator);
  }

  public SearchServiceLevelObjectiveAttributes description(String description) {
    this.description = JsonNullable.<String>of(description);
    return this;
  }

  /**
   * A user-defined description of the service level objective.
   *
   * <p>Always included in service level objective responses (but may be <code>null</code>).
   * Optional in create/update requests.
   *
   * @return description
   */
  @jakarta.annotation.Nullable
  @JsonIgnore
  public String getDescription() {
    return description.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_DESCRIPTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<String> getDescription_JsonNullable() {
    return description;
  }

  @JsonProperty(JSON_PROPERTY_DESCRIPTION)
  public void setDescription_JsonNullable(JsonNullable<String> description) {
    this.description = description;
  }

  public void setDescription(String description) {
    this.description = JsonNullable.<String>of(description);
  }

  public SearchServiceLevelObjectiveAttributes envTags(List<String> envTags) {
    this.envTags = envTags;
    return this;
  }

  public SearchServiceLevelObjectiveAttributes addEnvTagsItem(String envTagsItem) {
    if (this.envTags == null) {
      this.envTags = new ArrayList<>();
    }
    this.envTags.add(envTagsItem);
    return this;
  }

  /**
   * Tags with the <code>env</code> tag key.
   *
   * @return envTags
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ENV_TAGS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<String> getEnvTags() {
    return envTags;
  }

  public void setEnvTags(List<String> envTags) {
    this.envTags = envTags;
  }

  public SearchServiceLevelObjectiveAttributes groups(List<String> groups) {
    this.groups = JsonNullable.<List<String>>of(groups);
    return this;
  }

  public SearchServiceLevelObjectiveAttributes addGroupsItem(String groupsItem) {
    if (this.groups == null || !this.groups.isPresent()) {
      this.groups = JsonNullable.<List<String>>of(new ArrayList<>());
    }
    try {
      this.groups.get().add(groupsItem);
    } catch (java.util.NoSuchElementException e) {
      // this can never happen, as we make sure above that the value is present
    }
    return this;
  }

  /**
   * A list of (up to 100) monitor groups that narrow the scope of a monitor service level
   * objective. Included in service level objective responses if it is not empty.
   *
   * @return groups
   */
  @jakarta.annotation.Nullable
  @JsonIgnore
  public List<String> getGroups() {
    return groups.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_GROUPS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<List<String>> getGroups_JsonNullable() {
    return groups;
  }

  @JsonProperty(JSON_PROPERTY_GROUPS)
  public void setGroups_JsonNullable(JsonNullable<List<String>> groups) {
    this.groups = groups;
  }

  public void setGroups(List<String> groups) {
    this.groups = JsonNullable.<List<String>>of(groups);
  }

  /**
   * Modification timestamp (UNIX time in seconds)
   *
   * <p>Always included in service level objective responses.
   *
   * @return modifiedAt
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_MODIFIED_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getModifiedAt() {
    return modifiedAt;
  }

  public SearchServiceLevelObjectiveAttributes monitorIds(List<Long> monitorIds) {
    this.monitorIds = JsonNullable.<List<Long>>of(monitorIds);
    return this;
  }

  public SearchServiceLevelObjectiveAttributes addMonitorIdsItem(Long monitorIdsItem) {
    if (this.monitorIds == null || !this.monitorIds.isPresent()) {
      this.monitorIds = JsonNullable.<List<Long>>of(new ArrayList<>());
    }
    try {
      this.monitorIds.get().add(monitorIdsItem);
    } catch (java.util.NoSuchElementException e) {
      // this can never happen, as we make sure above that the value is present
    }
    return this;
  }

  /**
   * A list of monitor ids that defines the scope of a monitor service level objective.
   *
   * @return monitorIds
   */
  @jakarta.annotation.Nullable
  @JsonIgnore
  public List<Long> getMonitorIds() {
    return monitorIds.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_MONITOR_IDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<List<Long>> getMonitorIds_JsonNullable() {
    return monitorIds;
  }

  @JsonProperty(JSON_PROPERTY_MONITOR_IDS)
  public void setMonitorIds_JsonNullable(JsonNullable<List<Long>> monitorIds) {
    this.monitorIds = monitorIds;
  }

  public void setMonitorIds(List<Long> monitorIds) {
    this.monitorIds = JsonNullable.<List<Long>>of(monitorIds);
  }

  public SearchServiceLevelObjectiveAttributes name(String name) {
    this.name = name;
    return this;
  }

  /**
   * The name of the service level objective object.
   *
   * @return name
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public SearchServiceLevelObjectiveAttributes overallStatus(
      List<SLOOverallStatuses> overallStatus) {
    this.overallStatus = overallStatus;
    for (SLOOverallStatuses item : overallStatus) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }

  public SearchServiceLevelObjectiveAttributes addOverallStatusItem(
      SLOOverallStatuses overallStatusItem) {
    if (this.overallStatus == null) {
      this.overallStatus = new ArrayList<>();
    }
    this.overallStatus.add(overallStatusItem);
    this.unparsed |= overallStatusItem.unparsed;
    return this;
  }

  /**
   * calculated status and error budget remaining.
   *
   * @return overallStatus
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_OVERALL_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<SLOOverallStatuses> getOverallStatus() {
    return overallStatus;
  }

  public void setOverallStatus(List<SLOOverallStatuses> overallStatus) {
    this.overallStatus = overallStatus;
  }

  public SearchServiceLevelObjectiveAttributes query(SearchSLOQuery query) {
    this.query = JsonNullable.<SearchSLOQuery>of(query);
    return this;
  }

  /**
   * A metric-based SLO. <strong>Required if type is <code>metric</code></strong>. Note that Datadog
   * only allows the sum by aggregator to be used because this will sum up all request counts
   * instead of averaging them, or taking the max or min of all of those requests.
   *
   * @return query
   */
  @jakarta.annotation.Nullable
  @JsonIgnore
  public SearchSLOQuery getQuery() {
    return query.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_QUERY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<SearchSLOQuery> getQuery_JsonNullable() {
    return query;
  }

  @JsonProperty(JSON_PROPERTY_QUERY)
  public void setQuery_JsonNullable(JsonNullable<SearchSLOQuery> query) {
    this.query = query;
  }

  public void setQuery(SearchSLOQuery query) {
    this.query = JsonNullable.<SearchSLOQuery>of(query);
  }

  public SearchServiceLevelObjectiveAttributes serviceTags(List<String> serviceTags) {
    this.serviceTags = serviceTags;
    return this;
  }

  public SearchServiceLevelObjectiveAttributes addServiceTagsItem(String serviceTagsItem) {
    if (this.serviceTags == null) {
      this.serviceTags = new ArrayList<>();
    }
    this.serviceTags.add(serviceTagsItem);
    return this;
  }

  /**
   * Tags with the <code>service</code> tag key.
   *
   * @return serviceTags
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SERVICE_TAGS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<String> getServiceTags() {
    return serviceTags;
  }

  public void setServiceTags(List<String> serviceTags) {
    this.serviceTags = serviceTags;
  }

  public SearchServiceLevelObjectiveAttributes sloType(SLOType sloType) {
    this.sloType = sloType;
    this.unparsed |= !sloType.isValid();
    return this;
  }

  /**
   * The type of the service level objective.
   *
   * @return sloType
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SLO_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public SLOType getSloType() {
    return sloType;
  }

  public void setSloType(SLOType sloType) {
    if (!sloType.isValid()) {
      this.unparsed = true;
    }
    this.sloType = sloType;
  }

  public SearchServiceLevelObjectiveAttributes status(SLOStatus status) {
    this.status = status;
    this.unparsed |= status.unparsed;
    return this;
  }

  /**
   * Status of the SLO's primary timeframe.
   *
   * @return status
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public SLOStatus getStatus() {
    return status;
  }

  public void setStatus(SLOStatus status) {
    this.status = status;
  }

  public SearchServiceLevelObjectiveAttributes teamTags(List<String> teamTags) {
    this.teamTags = teamTags;
    return this;
  }

  public SearchServiceLevelObjectiveAttributes addTeamTagsItem(String teamTagsItem) {
    if (this.teamTags == null) {
      this.teamTags = new ArrayList<>();
    }
    this.teamTags.add(teamTagsItem);
    return this;
  }

  /**
   * Tags with the <code>team</code> tag key.
   *
   * @return teamTags
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TEAM_TAGS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<String> getTeamTags() {
    return teamTags;
  }

  public void setTeamTags(List<String> teamTags) {
    this.teamTags = teamTags;
  }

  public SearchServiceLevelObjectiveAttributes thresholds(List<SearchSLOThreshold> thresholds) {
    this.thresholds = thresholds;
    for (SearchSLOThreshold item : thresholds) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }

  public SearchServiceLevelObjectiveAttributes addThresholdsItem(
      SearchSLOThreshold thresholdsItem) {
    if (this.thresholds == null) {
      this.thresholds = new ArrayList<>();
    }
    this.thresholds.add(thresholdsItem);
    this.unparsed |= thresholdsItem.unparsed;
    return this;
  }

  /**
   * The thresholds (timeframes and associated targets) for this service level objective object.
   *
   * @return thresholds
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_THRESHOLDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<SearchSLOThreshold> getThresholds() {
    return thresholds;
  }

  public void setThresholds(List<SearchSLOThreshold> thresholds) {
    this.thresholds = thresholds;
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
   * @return SearchServiceLevelObjectiveAttributes
   */
  @JsonAnySetter
  public SearchServiceLevelObjectiveAttributes putAdditionalProperty(String key, Object value) {
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

  /** Return true if this SearchServiceLevelObjectiveAttributes object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SearchServiceLevelObjectiveAttributes searchServiceLevelObjectiveAttributes =
        (SearchServiceLevelObjectiveAttributes) o;
    return Objects.equals(this.allTags, searchServiceLevelObjectiveAttributes.allTags)
        && Objects.equals(this.createdAt, searchServiceLevelObjectiveAttributes.createdAt)
        && Objects.equals(this.creator, searchServiceLevelObjectiveAttributes.creator)
        && Objects.equals(this.description, searchServiceLevelObjectiveAttributes.description)
        && Objects.equals(this.envTags, searchServiceLevelObjectiveAttributes.envTags)
        && Objects.equals(this.groups, searchServiceLevelObjectiveAttributes.groups)
        && Objects.equals(this.modifiedAt, searchServiceLevelObjectiveAttributes.modifiedAt)
        && Objects.equals(this.monitorIds, searchServiceLevelObjectiveAttributes.monitorIds)
        && Objects.equals(this.name, searchServiceLevelObjectiveAttributes.name)
        && Objects.equals(this.overallStatus, searchServiceLevelObjectiveAttributes.overallStatus)
        && Objects.equals(this.query, searchServiceLevelObjectiveAttributes.query)
        && Objects.equals(this.serviceTags, searchServiceLevelObjectiveAttributes.serviceTags)
        && Objects.equals(this.sloType, searchServiceLevelObjectiveAttributes.sloType)
        && Objects.equals(this.status, searchServiceLevelObjectiveAttributes.status)
        && Objects.equals(this.teamTags, searchServiceLevelObjectiveAttributes.teamTags)
        && Objects.equals(this.thresholds, searchServiceLevelObjectiveAttributes.thresholds)
        && Objects.equals(
            this.additionalProperties, searchServiceLevelObjectiveAttributes.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        allTags,
        createdAt,
        creator,
        description,
        envTags,
        groups,
        modifiedAt,
        monitorIds,
        name,
        overallStatus,
        query,
        serviceTags,
        sloType,
        status,
        teamTags,
        thresholds,
        additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SearchServiceLevelObjectiveAttributes {\n");
    sb.append("    allTags: ").append(toIndentedString(allTags)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    creator: ").append(toIndentedString(creator)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    envTags: ").append(toIndentedString(envTags)).append("\n");
    sb.append("    groups: ").append(toIndentedString(groups)).append("\n");
    sb.append("    modifiedAt: ").append(toIndentedString(modifiedAt)).append("\n");
    sb.append("    monitorIds: ").append(toIndentedString(monitorIds)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    overallStatus: ").append(toIndentedString(overallStatus)).append("\n");
    sb.append("    query: ").append(toIndentedString(query)).append("\n");
    sb.append("    serviceTags: ").append(toIndentedString(serviceTags)).append("\n");
    sb.append("    sloType: ").append(toIndentedString(sloType)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    teamTags: ").append(toIndentedString(teamTags)).append("\n");
    sb.append("    thresholds: ").append(toIndentedString(thresholds)).append("\n");
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
