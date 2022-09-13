/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v1.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import org.openapitools.jackson.nullable.JsonNullable;

/**
 * A service level objective object includes a service level indicator, thresholds for one or more
 * timeframes, and metadata (<code>name</code>, <code>description</code>, <code>tags</code>, etc.).
 */
@JsonPropertyOrder({
  SearchServiceLevelObjective.JSON_PROPERTY_ALL_TAGS,
  SearchServiceLevelObjective.JSON_PROPERTY_CREATED_AT,
  SearchServiceLevelObjective.JSON_PROPERTY_CREATOR,
  SearchServiceLevelObjective.JSON_PROPERTY_DESCRIPTION,
  SearchServiceLevelObjective.JSON_PROPERTY_GROUPS,
  SearchServiceLevelObjective.JSON_PROPERTY_ID,
  SearchServiceLevelObjective.JSON_PROPERTY_MODIFIED_AT,
  SearchServiceLevelObjective.JSON_PROPERTY_MONITOR_IDS,
  SearchServiceLevelObjective.JSON_PROPERTY_NAME,
  SearchServiceLevelObjective.JSON_PROPERTY_OVERALL_STATUS,
  SearchServiceLevelObjective.JSON_PROPERTY_QUERY,
  SearchServiceLevelObjective.JSON_PROPERTY_THRESHOLDS,
  SearchServiceLevelObjective.JSON_PROPERTY_TYPE
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class SearchServiceLevelObjective {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_ALL_TAGS = "all_tags";
  private List<String> allTags = null;

  public static final String JSON_PROPERTY_CREATED_AT = "created_at";
  private Long createdAt;

  public static final String JSON_PROPERTY_CREATOR = "creator";
  private JsonNullable<SLOCreator> creator = JsonNullable.<SLOCreator>undefined();

  public static final String JSON_PROPERTY_DESCRIPTION = "description";
  private JsonNullable<String> description = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_GROUPS = "groups";
  private JsonNullable<List<String>> groups = JsonNullable.<List<String>>undefined();

  public static final String JSON_PROPERTY_ID = "id";
  private String id;

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

  public static final String JSON_PROPERTY_THRESHOLDS = "thresholds";
  private List<SearchSLOThreshold> thresholds = null;

  public static final String JSON_PROPERTY_TYPE = "type";
  private SLOType type;

  public SearchServiceLevelObjective allTags(List<String> allTags) {
    this.allTags = allTags;
    return this;
  }

  public SearchServiceLevelObjective addAllTagsItem(String allTagsItem) {
    if (this.allTags == null) {
      this.allTags = new ArrayList<>();
    }
    this.allTags.add(allTagsItem);
    return this;
  }

  /**
   * A list of tags associated with this service level objective. Always included in service level
   * objective responses (but may be empty). Optional in create/update requests.
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

  public SearchServiceLevelObjective creator(SLOCreator creator) {
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

  public SearchServiceLevelObjective description(String description) {
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

  public SearchServiceLevelObjective groups(List<String> groups) {
    this.groups = JsonNullable.<List<String>>of(groups);
    return this;
  }

  public SearchServiceLevelObjective addGroupsItem(String groupsItem) {
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
   * objective.
   *
   * <p>Included in service level objective responses if it is not empty. Optional in create/update
   * requests for monitor service level objectives, but may only be used when then length of the
   * <code>monitor_ids</code> field is one.
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
   * A unique identifier for the service level objective object.
   *
   * <p>Always included in service level objective responses.
   *
   * @return id
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getId() {
    return id;
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

  public SearchServiceLevelObjective monitorIds(List<Long> monitorIds) {
    this.monitorIds = JsonNullable.<List<Long>>of(monitorIds);
    return this;
  }

  public SearchServiceLevelObjective addMonitorIdsItem(Long monitorIdsItem) {
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
   * <strong>Required if type is <code>monitor</code></strong>.
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

  public SearchServiceLevelObjective name(String name) {
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

  public SearchServiceLevelObjective overallStatus(List<SLOOverallStatuses> overallStatus) {
    this.overallStatus = overallStatus;
    for (SLOOverallStatuses item : overallStatus) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }

  public SearchServiceLevelObjective addOverallStatusItem(SLOOverallStatuses overallStatusItem) {
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

  public SearchServiceLevelObjective query(SearchSLOQuery query) {
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

  public SearchServiceLevelObjective thresholds(List<SearchSLOThreshold> thresholds) {
    this.thresholds = thresholds;
    for (SearchSLOThreshold item : thresholds) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }

  public SearchServiceLevelObjective addThresholdsItem(SearchSLOThreshold thresholdsItem) {
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

  public SearchServiceLevelObjective type(SLOType type) {
    this.type = type;
    this.unparsed |= !type.isValid();
    return this;
  }

  /**
   * The type of the service level objective.
   *
   * @return type
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public SLOType getType() {
    return type;
  }

  public void setType(SLOType type) {
    if (!type.isValid()) {
      this.unparsed = true;
    }
    this.type = type;
  }

  /** Return true if this SearchServiceLevelObjective object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SearchServiceLevelObjective searchServiceLevelObjective = (SearchServiceLevelObjective) o;
    return Objects.equals(this.allTags, searchServiceLevelObjective.allTags)
        && Objects.equals(this.createdAt, searchServiceLevelObjective.createdAt)
        && Objects.equals(this.creator, searchServiceLevelObjective.creator)
        && Objects.equals(this.description, searchServiceLevelObjective.description)
        && Objects.equals(this.groups, searchServiceLevelObjective.groups)
        && Objects.equals(this.id, searchServiceLevelObjective.id)
        && Objects.equals(this.modifiedAt, searchServiceLevelObjective.modifiedAt)
        && Objects.equals(this.monitorIds, searchServiceLevelObjective.monitorIds)
        && Objects.equals(this.name, searchServiceLevelObjective.name)
        && Objects.equals(this.overallStatus, searchServiceLevelObjective.overallStatus)
        && Objects.equals(this.query, searchServiceLevelObjective.query)
        && Objects.equals(this.thresholds, searchServiceLevelObjective.thresholds)
        && Objects.equals(this.type, searchServiceLevelObjective.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        allTags,
        createdAt,
        creator,
        description,
        groups,
        id,
        modifiedAt,
        monitorIds,
        name,
        overallStatus,
        query,
        thresholds,
        type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SearchServiceLevelObjective {\n");
    sb.append("    allTags: ").append(toIndentedString(allTags)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    creator: ").append(toIndentedString(creator)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    groups: ").append(toIndentedString(groups)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    modifiedAt: ").append(toIndentedString(modifiedAt)).append("\n");
    sb.append("    monitorIds: ").append(toIndentedString(monitorIds)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    overallStatus: ").append(toIndentedString(overallStatus)).append("\n");
    sb.append("    query: ").append(toIndentedString(query)).append("\n");
    sb.append("    thresholds: ").append(toIndentedString(thresholds)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("}");
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
