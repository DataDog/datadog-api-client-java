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
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import org.openapitools.jackson.nullable.JsonNullable;

/**
 * A service level objective object includes a service level indicator, thresholds for one or more
 * timeframes, and metadata (<code>name</code>, <code>description</code>, <code>tags</code>, etc.).
 */
@JsonPropertyOrder({
  ServiceLevelObjectiveRequest.JSON_PROPERTY_DESCRIPTION,
  ServiceLevelObjectiveRequest.JSON_PROPERTY_GROUPS,
  ServiceLevelObjectiveRequest.JSON_PROPERTY_MONITOR_IDS,
  ServiceLevelObjectiveRequest.JSON_PROPERTY_NAME,
  ServiceLevelObjectiveRequest.JSON_PROPERTY_QUERY,
  ServiceLevelObjectiveRequest.JSON_PROPERTY_SLI_SPECIFICATION,
  ServiceLevelObjectiveRequest.JSON_PROPERTY_TAGS,
  ServiceLevelObjectiveRequest.JSON_PROPERTY_TARGET_THRESHOLD,
  ServiceLevelObjectiveRequest.JSON_PROPERTY_THRESHOLDS,
  ServiceLevelObjectiveRequest.JSON_PROPERTY_TIMEFRAME,
  ServiceLevelObjectiveRequest.JSON_PROPERTY_TYPE,
  ServiceLevelObjectiveRequest.JSON_PROPERTY_WARNING_THRESHOLD
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class ServiceLevelObjectiveRequest {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_DESCRIPTION = "description";
  private JsonNullable<String> description = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_GROUPS = "groups";
  private List<String> groups = null;

  public static final String JSON_PROPERTY_MONITOR_IDS = "monitor_ids";
  private List<Long> monitorIds = null;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_QUERY = "query";
  private ServiceLevelObjectiveQuery query;

  public static final String JSON_PROPERTY_SLI_SPECIFICATION = "sli_specification";
  private SLOSliSpec sliSpecification;

  public static final String JSON_PROPERTY_TAGS = "tags";
  private List<String> tags = null;

  public static final String JSON_PROPERTY_TARGET_THRESHOLD = "target_threshold";
  private Double targetThreshold;

  public static final String JSON_PROPERTY_THRESHOLDS = "thresholds";
  private List<SLOThreshold> thresholds = new ArrayList<>();

  public static final String JSON_PROPERTY_TIMEFRAME = "timeframe";
  private SLOTimeframe timeframe;

  public static final String JSON_PROPERTY_TYPE = "type";
  private SLOType type;

  public static final String JSON_PROPERTY_WARNING_THRESHOLD = "warning_threshold";
  private Double warningThreshold;

  public ServiceLevelObjectiveRequest() {}

  @JsonCreator
  public ServiceLevelObjectiveRequest(
      @JsonProperty(required = true, value = JSON_PROPERTY_NAME) String name,
      @JsonProperty(required = true, value = JSON_PROPERTY_THRESHOLDS)
          List<SLOThreshold> thresholds,
      @JsonProperty(required = true, value = JSON_PROPERTY_TYPE) SLOType type) {
    this.name = name;
    this.thresholds = thresholds;
    this.type = type;
    this.unparsed |= !type.isValid();
  }

  public ServiceLevelObjectiveRequest description(String description) {
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

  public ServiceLevelObjectiveRequest groups(List<String> groups) {
    this.groups = groups;
    return this;
  }

  public ServiceLevelObjectiveRequest addGroupsItem(String groupsItem) {
    if (this.groups == null) {
      this.groups = new ArrayList<>();
    }
    this.groups.add(groupsItem);
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
  @JsonProperty(JSON_PROPERTY_GROUPS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<String> getGroups() {
    return groups;
  }

  public void setGroups(List<String> groups) {
    this.groups = groups;
  }

  public ServiceLevelObjectiveRequest monitorIds(List<Long> monitorIds) {
    this.monitorIds = monitorIds;
    return this;
  }

  public ServiceLevelObjectiveRequest addMonitorIdsItem(Long monitorIdsItem) {
    if (this.monitorIds == null) {
      this.monitorIds = new ArrayList<>();
    }
    this.monitorIds.add(monitorIdsItem);
    return this;
  }

  /**
   * A list of monitor IDs that defines the scope of a monitor service level objective.
   * <strong>Required if type is <code>monitor</code></strong>.
   *
   * @return monitorIds
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_MONITOR_IDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<Long> getMonitorIds() {
    return monitorIds;
  }

  public void setMonitorIds(List<Long> monitorIds) {
    this.monitorIds = monitorIds;
  }

  public ServiceLevelObjectiveRequest name(String name) {
    this.name = name;
    return this;
  }

  /**
   * The name of the service level objective object.
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

  public ServiceLevelObjectiveRequest query(ServiceLevelObjectiveQuery query) {
    this.query = query;
    this.unparsed |= query.unparsed;
    return this;
  }

  /**
   * A count-based (metric) SLO query. This field is superseded by <code>sli_specification</code>
   * but is retained for backwards compatibility. Note that Datadog only allows the sum by
   * aggregator to be used because this will sum up all request counts instead of averaging them, or
   * taking the max or min of all of those requests.
   *
   * @return query
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_QUERY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public ServiceLevelObjectiveQuery getQuery() {
    return query;
  }

  public void setQuery(ServiceLevelObjectiveQuery query) {
    this.query = query;
  }

  public ServiceLevelObjectiveRequest sliSpecification(SLOSliSpec sliSpecification) {
    this.sliSpecification = sliSpecification;
    this.unparsed |= sliSpecification.unparsed;
    return this;
  }

  /**
   * A generic SLI specification. This is used for time-slice and count-based (metric) SLOs only.
   *
   * @return sliSpecification
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SLI_SPECIFICATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public SLOSliSpec getSliSpecification() {
    return sliSpecification;
  }

  public void setSliSpecification(SLOSliSpec sliSpecification) {
    this.sliSpecification = sliSpecification;
  }

  public ServiceLevelObjectiveRequest tags(List<String> tags) {
    this.tags = tags;
    return this;
  }

  public ServiceLevelObjectiveRequest addTagsItem(String tagsItem) {
    if (this.tags == null) {
      this.tags = new ArrayList<>();
    }
    this.tags.add(tagsItem);
    return this;
  }

  /**
   * A list of tags associated with this service level objective. Always included in service level
   * objective responses (but may be empty). Optional in create/update requests.
   *
   * @return tags
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TAGS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<String> getTags() {
    return tags;
  }

  public void setTags(List<String> tags) {
    this.tags = tags;
  }

  public ServiceLevelObjectiveRequest targetThreshold(Double targetThreshold) {
    this.targetThreshold = targetThreshold;
    return this;
  }

  /**
   * The target threshold such that when the service level indicator is above this threshold over
   * the given timeframe, the objective is being met.
   *
   * @return targetThreshold
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TARGET_THRESHOLD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getTargetThreshold() {
    return targetThreshold;
  }

  public void setTargetThreshold(Double targetThreshold) {
    this.targetThreshold = targetThreshold;
  }

  public ServiceLevelObjectiveRequest thresholds(List<SLOThreshold> thresholds) {
    this.thresholds = thresholds;
    for (SLOThreshold item : thresholds) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }

  public ServiceLevelObjectiveRequest addThresholdsItem(SLOThreshold thresholdsItem) {
    this.thresholds.add(thresholdsItem);
    this.unparsed |= thresholdsItem.unparsed;
    return this;
  }

  /**
   * The thresholds (timeframes and associated targets) for this service level objective object.
   *
   * @return thresholds
   */
  @JsonProperty(JSON_PROPERTY_THRESHOLDS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public List<SLOThreshold> getThresholds() {
    return thresholds;
  }

  public void setThresholds(List<SLOThreshold> thresholds) {
    this.thresholds = thresholds;
  }

  public ServiceLevelObjectiveRequest timeframe(SLOTimeframe timeframe) {
    this.timeframe = timeframe;
    this.unparsed |= !timeframe.isValid();
    return this;
  }

  /**
   * The SLO time window options. Note that "custom" is not a valid option for creating or updating
   * SLOs. It is only used when querying SLO history over custom timeframes.
   *
   * @return timeframe
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TIMEFRAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public SLOTimeframe getTimeframe() {
    return timeframe;
  }

  public void setTimeframe(SLOTimeframe timeframe) {
    if (!timeframe.isValid()) {
      this.unparsed = true;
    }
    this.timeframe = timeframe;
  }

  public ServiceLevelObjectiveRequest type(SLOType type) {
    this.type = type;
    this.unparsed |= !type.isValid();
    return this;
  }

  /**
   * The type of the service level objective.
   *
   * @return type
   */
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public SLOType getType() {
    return type;
  }

  public void setType(SLOType type) {
    if (!type.isValid()) {
      this.unparsed = true;
    }
    this.type = type;
  }

  public ServiceLevelObjectiveRequest warningThreshold(Double warningThreshold) {
    this.warningThreshold = warningThreshold;
    return this;
  }

  /**
   * The optional warning threshold such that when the service level indicator is below this value
   * for the given threshold, but above the target threshold, the objective appears in a "warning"
   * state. This value must be greater than the target threshold.
   *
   * @return warningThreshold
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_WARNING_THRESHOLD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getWarningThreshold() {
    return warningThreshold;
  }

  public void setWarningThreshold(Double warningThreshold) {
    this.warningThreshold = warningThreshold;
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
   * @return ServiceLevelObjectiveRequest
   */
  @JsonAnySetter
  public ServiceLevelObjectiveRequest putAdditionalProperty(String key, Object value) {
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

  /** Return true if this ServiceLevelObjectiveRequest object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ServiceLevelObjectiveRequest serviceLevelObjectiveRequest = (ServiceLevelObjectiveRequest) o;
    return Objects.equals(this.description, serviceLevelObjectiveRequest.description)
        && Objects.equals(this.groups, serviceLevelObjectiveRequest.groups)
        && Objects.equals(this.monitorIds, serviceLevelObjectiveRequest.monitorIds)
        && Objects.equals(this.name, serviceLevelObjectiveRequest.name)
        && Objects.equals(this.query, serviceLevelObjectiveRequest.query)
        && Objects.equals(this.sliSpecification, serviceLevelObjectiveRequest.sliSpecification)
        && Objects.equals(this.tags, serviceLevelObjectiveRequest.tags)
        && Objects.equals(this.targetThreshold, serviceLevelObjectiveRequest.targetThreshold)
        && Objects.equals(this.thresholds, serviceLevelObjectiveRequest.thresholds)
        && Objects.equals(this.timeframe, serviceLevelObjectiveRequest.timeframe)
        && Objects.equals(this.type, serviceLevelObjectiveRequest.type)
        && Objects.equals(this.warningThreshold, serviceLevelObjectiveRequest.warningThreshold)
        && Objects.equals(
            this.additionalProperties, serviceLevelObjectiveRequest.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        description,
        groups,
        monitorIds,
        name,
        query,
        sliSpecification,
        tags,
        targetThreshold,
        thresholds,
        timeframe,
        type,
        warningThreshold,
        additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ServiceLevelObjectiveRequest {\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    groups: ").append(toIndentedString(groups)).append("\n");
    sb.append("    monitorIds: ").append(toIndentedString(monitorIds)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    query: ").append(toIndentedString(query)).append("\n");
    sb.append("    sliSpecification: ").append(toIndentedString(sliSpecification)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("    targetThreshold: ").append(toIndentedString(targetThreshold)).append("\n");
    sb.append("    thresholds: ").append(toIndentedString(thresholds)).append("\n");
    sb.append("    timeframe: ").append(toIndentedString(timeframe)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    warningThreshold: ").append(toIndentedString(warningThreshold)).append("\n");
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
