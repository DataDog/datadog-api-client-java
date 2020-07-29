/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.datadog.api.v1.client.model;

import java.util.Objects;
import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;
import com.datadog.api.v1.client.model.Creator;
import com.datadog.api.v1.client.model.SLOThreshold;
import com.datadog.api.v1.client.model.SLOType;
import com.datadog.api.v1.client.model.ServiceLevelObjectiveQuery;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonIgnore;
import org.openapitools.jackson.nullable.JsonNullable;
import java.util.NoSuchElementException;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.datadog.api.v1.client.JSON;


/**
 * A service level objective object includes a service level indicator, thresholds for one or more timeframes, and metadata (&#x60;name&#x60;, &#x60;description&#x60;, &#x60;tags&#x60;, etc.).
 */
@ApiModel(description = "A service level objective object includes a service level indicator, thresholds for one or more timeframes, and metadata (`name`, `description`, `tags`, etc.).")
@JsonPropertyOrder({
  ServiceLevelObjective.JSON_PROPERTY_CREATED_AT,
  ServiceLevelObjective.JSON_PROPERTY_CREATOR,
  ServiceLevelObjective.JSON_PROPERTY_DESCRIPTION,
  ServiceLevelObjective.JSON_PROPERTY_GROUPS,
  ServiceLevelObjective.JSON_PROPERTY_ID,
  ServiceLevelObjective.JSON_PROPERTY_MODIFIED_AT,
  ServiceLevelObjective.JSON_PROPERTY_MONITOR_IDS,
  ServiceLevelObjective.JSON_PROPERTY_MONITOR_TAGS,
  ServiceLevelObjective.JSON_PROPERTY_NAME,
  ServiceLevelObjective.JSON_PROPERTY_QUERY,
  ServiceLevelObjective.JSON_PROPERTY_TAGS,
  ServiceLevelObjective.JSON_PROPERTY_THRESHOLDS,
  ServiceLevelObjective.JSON_PROPERTY_TYPE
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class ServiceLevelObjective {
  public static final String JSON_PROPERTY_CREATED_AT = "created_at";
  private Long createdAt;

  public static final String JSON_PROPERTY_CREATOR = "creator";
  private Creator creator;

  public static final String JSON_PROPERTY_DESCRIPTION = "description";
  private JsonNullable<String> description = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_GROUPS = "groups";
  private List<String> groups = null;

  public static final String JSON_PROPERTY_ID = "id";
  private String id;

  public static final String JSON_PROPERTY_MODIFIED_AT = "modified_at";
  private Long modifiedAt;

  public static final String JSON_PROPERTY_MONITOR_IDS = "monitor_ids";
  private List<Long> monitorIds = null;

  public static final String JSON_PROPERTY_MONITOR_TAGS = "monitor_tags";
  private List<String> monitorTags = null;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_QUERY = "query";
  private ServiceLevelObjectiveQuery query;

  public static final String JSON_PROPERTY_TAGS = "tags";
  private List<String> tags = null;

  public static final String JSON_PROPERTY_THRESHOLDS = "thresholds";
  private List<SLOThreshold> thresholds = new ArrayList<>();

  public static final String JSON_PROPERTY_TYPE = "type";
  private SLOType type;


   /**
   * Creation timestamp (UNIX time in seconds)  Always included in service level objective responses.
   * @return createdAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Creation timestamp (UNIX time in seconds)  Always included in service level objective responses.")
  @JsonProperty(JSON_PROPERTY_CREATED_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getCreatedAt() {
    return createdAt;
  }




  public ServiceLevelObjective creator(Creator creator) {
    this.creator = creator;
    return this;
  }

   /**
   * Get creator
   * @return creator
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_CREATOR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Creator getCreator() {
    return creator;
  }


  public void setCreator(Creator creator) {
    this.creator = creator;
  }


  public ServiceLevelObjective description(String description) {
    this.description = JsonNullable.<String>of(description);
    return this;
  }

   /**
   * A user-defined description of the service level objective.  Always included in service level objective responses (but may be &#x60;null&#x60;). Optional in create/update requests.
   * @return description
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A user-defined description of the service level objective.  Always included in service level objective responses (but may be `null`). Optional in create/update requests.")
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


  public ServiceLevelObjective groups(List<String> groups) {
    this.groups = groups;
    return this;
  }

  public ServiceLevelObjective addGroupsItem(String groupsItem) {
    if (this.groups == null) {
      this.groups = new ArrayList<>();
    }
    this.groups.add(groupsItem);
    return this;
  }

   /**
   * A list of (up to 20) monitor groups that narrow the scope of a monitor service level objective.  Included in service level objective responses if it is not empty. Optional in create/update requests for monitor service level objectives, but may only be used when then length of the &#x60;monitor_ids&#x60; field is one.
   * @return groups
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "[\"env:prod\",\"role:mysql\"]", value = "A list of (up to 20) monitor groups that narrow the scope of a monitor service level objective.  Included in service level objective responses if it is not empty. Optional in create/update requests for monitor service level objectives, but may only be used when then length of the `monitor_ids` field is one.")
  @JsonProperty(JSON_PROPERTY_GROUPS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<String> getGroups() {
    return groups;
  }


  public void setGroups(List<String> groups) {
    this.groups = groups;
  }


   /**
   * A unique identifier for the service level objective object.  Always included in service level objective responses.
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A unique identifier for the service level objective object.  Always included in service level objective responses.")
  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getId() {
    return id;
  }




   /**
   * Modification timestamp (UNIX time in seconds)  Always included in service level objective responses.
   * @return modifiedAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Modification timestamp (UNIX time in seconds)  Always included in service level objective responses.")
  @JsonProperty(JSON_PROPERTY_MODIFIED_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getModifiedAt() {
    return modifiedAt;
  }




  public ServiceLevelObjective monitorIds(List<Long> monitorIds) {
    this.monitorIds = monitorIds;
    return this;
  }

  public ServiceLevelObjective addMonitorIdsItem(Long monitorIdsItem) {
    if (this.monitorIds == null) {
      this.monitorIds = new ArrayList<>();
    }
    this.monitorIds.add(monitorIdsItem);
    return this;
  }

   /**
   * A list of monitor ids that defines the scope of a monitor service level objective. **Required if type is &#x60;monitor&#x60;**.
   * @return monitorIds
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A list of monitor ids that defines the scope of a monitor service level objective. **Required if type is `monitor`**.")
  @JsonProperty(JSON_PROPERTY_MONITOR_IDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<Long> getMonitorIds() {
    return monitorIds;
  }


  public void setMonitorIds(List<Long> monitorIds) {
    this.monitorIds = monitorIds;
  }


  public ServiceLevelObjective monitorTags(List<String> monitorTags) {
    this.monitorTags = monitorTags;
    return this;
  }

  public ServiceLevelObjective addMonitorTagsItem(String monitorTagsItem) {
    if (this.monitorTags == null) {
      this.monitorTags = new ArrayList<>();
    }
    this.monitorTags.add(monitorTagsItem);
    return this;
  }

   /**
   * The union of monitor tags for all monitors referenced by the &#x60;monitor_ids&#x60; field. Always included in service level objective responses for monitor service level objectives (but may be empty). Ignored in create/update requests. Does not affect which monitors are included in the service level objective (that is determined entirely by the &#x60;monitor_ids&#x60; field).
   * @return monitorTags
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The union of monitor tags for all monitors referenced by the `monitor_ids` field. Always included in service level objective responses for monitor service level objectives (but may be empty). Ignored in create/update requests. Does not affect which monitors are included in the service level objective (that is determined entirely by the `monitor_ids` field).")
  @JsonProperty(JSON_PROPERTY_MONITOR_TAGS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<String> getMonitorTags() {
    return monitorTags;
  }


  public void setMonitorTags(List<String> monitorTags) {
    this.monitorTags = monitorTags;
  }


  public ServiceLevelObjective name(String name) {
    this.name = name;
    return this;
  }

   /**
   * The name of the service level objective object.
   * @return name
  **/
  @ApiModelProperty(required = true, value = "The name of the service level objective object.")
  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public ServiceLevelObjective query(ServiceLevelObjectiveQuery query) {
    this.query = query;
    return this;
  }

   /**
   * Get query
   * @return query
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_QUERY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public ServiceLevelObjectiveQuery getQuery() {
    return query;
  }


  public void setQuery(ServiceLevelObjectiveQuery query) {
    this.query = query;
  }


  public ServiceLevelObjective tags(List<String> tags) {
    this.tags = tags;
    return this;
  }

  public ServiceLevelObjective addTagsItem(String tagsItem) {
    if (this.tags == null) {
      this.tags = new ArrayList<>();
    }
    this.tags.add(tagsItem);
    return this;
  }

   /**
   * A list of tags associated with this service level objective. Always included in service level objective responses (but may be empty). Optional in create/update requests.
   * @return tags
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "[\"env:prod\",\"app:core\"]", value = "A list of tags associated with this service level objective. Always included in service level objective responses (but may be empty). Optional in create/update requests.")
  @JsonProperty(JSON_PROPERTY_TAGS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<String> getTags() {
    return tags;
  }


  public void setTags(List<String> tags) {
    this.tags = tags;
  }


  public ServiceLevelObjective thresholds(List<SLOThreshold> thresholds) {
    this.thresholds = thresholds;
    return this;
  }

  public ServiceLevelObjective addThresholdsItem(SLOThreshold thresholdsItem) {
    this.thresholds.add(thresholdsItem);
    return this;
  }

   /**
   * The thresholds (timeframes and associated targets) for this service level objective object.
   * @return thresholds
  **/
  @ApiModelProperty(example = "[]", required = true, value = "The thresholds (timeframes and associated targets) for this service level objective object.")
  @JsonProperty(JSON_PROPERTY_THRESHOLDS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public List<SLOThreshold> getThresholds() {
    return thresholds;
  }


  public void setThresholds(List<SLOThreshold> thresholds) {
    this.thresholds = thresholds;
  }


  public ServiceLevelObjective type(SLOType type) {
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public SLOType getType() {
    return type;
  }


  public void setType(SLOType type) {
    this.type = type;
  }


  /**
   * Return true if this ServiceLevelObjective object is equal to o.
   */
  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ServiceLevelObjective serviceLevelObjective = (ServiceLevelObjective) o;
    return Objects.equals(this.createdAt, serviceLevelObjective.createdAt) &&
        Objects.equals(this.creator, serviceLevelObjective.creator) &&
        Objects.equals(this.description, serviceLevelObjective.description) &&
        Objects.equals(this.groups, serviceLevelObjective.groups) &&
        Objects.equals(this.id, serviceLevelObjective.id) &&
        Objects.equals(this.modifiedAt, serviceLevelObjective.modifiedAt) &&
        Objects.equals(this.monitorIds, serviceLevelObjective.monitorIds) &&
        Objects.equals(this.monitorTags, serviceLevelObjective.monitorTags) &&
        Objects.equals(this.name, serviceLevelObjective.name) &&
        Objects.equals(this.query, serviceLevelObjective.query) &&
        Objects.equals(this.tags, serviceLevelObjective.tags) &&
        Objects.equals(this.thresholds, serviceLevelObjective.thresholds) &&
        Objects.equals(this.type, serviceLevelObjective.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(createdAt, creator, description, groups, id, modifiedAt, monitorIds, monitorTags, name, query, tags, thresholds, type);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ServiceLevelObjective {\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    creator: ").append(toIndentedString(creator)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    groups: ").append(toIndentedString(groups)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    modifiedAt: ").append(toIndentedString(modifiedAt)).append("\n");
    sb.append("    monitorIds: ").append(toIndentedString(monitorIds)).append("\n");
    sb.append("    monitorTags: ").append(toIndentedString(monitorTags)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    query: ").append(toIndentedString(query)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("    thresholds: ").append(toIndentedString(thresholds)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

