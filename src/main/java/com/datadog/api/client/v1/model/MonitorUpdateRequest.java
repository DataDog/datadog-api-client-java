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
   * <p>Object describing a monitor update request.</p>
 */
@JsonPropertyOrder({
  MonitorUpdateRequest.JSON_PROPERTY_ASSETS,
  MonitorUpdateRequest.JSON_PROPERTY_CREATED,
  MonitorUpdateRequest.JSON_PROPERTY_CREATOR,
  MonitorUpdateRequest.JSON_PROPERTY_DELETED,
  MonitorUpdateRequest.JSON_PROPERTY_DRAFT_STATUS,
  MonitorUpdateRequest.JSON_PROPERTY_ID,
  MonitorUpdateRequest.JSON_PROPERTY_MESSAGE,
  MonitorUpdateRequest.JSON_PROPERTY_MODIFIED,
  MonitorUpdateRequest.JSON_PROPERTY_MULTI,
  MonitorUpdateRequest.JSON_PROPERTY_NAME,
  MonitorUpdateRequest.JSON_PROPERTY_OPTIONS,
  MonitorUpdateRequest.JSON_PROPERTY_OVERALL_STATE,
  MonitorUpdateRequest.JSON_PROPERTY_PRIORITY,
  MonitorUpdateRequest.JSON_PROPERTY_QUERY,
  MonitorUpdateRequest.JSON_PROPERTY_RESTRICTED_ROLES,
  MonitorUpdateRequest.JSON_PROPERTY_STATE,
  MonitorUpdateRequest.JSON_PROPERTY_TAGS,
  MonitorUpdateRequest.JSON_PROPERTY_TYPE
})
@jakarta.annotation.Generated(value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class MonitorUpdateRequest {
  @JsonIgnore
  public boolean unparsed = false;
  public static final String JSON_PROPERTY_ASSETS = "assets";
  private JsonNullable<List<MonitorAsset>> assets = JsonNullable.<List<MonitorAsset>>undefined();

  public static final String JSON_PROPERTY_CREATED = "created";
  private OffsetDateTime created;

  public static final String JSON_PROPERTY_CREATOR = "creator";
  private Creator creator;

  public static final String JSON_PROPERTY_DELETED = "deleted";
  private JsonNullable<OffsetDateTime> deleted = JsonNullable.<OffsetDateTime>undefined();

  public static final String JSON_PROPERTY_DRAFT_STATUS = "draft_status";
  private MonitorDraftStatus draftStatus = MonitorDraftStatus.PUBLISHED;

  public static final String JSON_PROPERTY_ID = "id";
  private Long id;

  public static final String JSON_PROPERTY_MESSAGE = "message";
  private String message;

  public static final String JSON_PROPERTY_MODIFIED = "modified";
  private OffsetDateTime modified;

  public static final String JSON_PROPERTY_MULTI = "multi";
  private Boolean multi;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_OPTIONS = "options";
  private MonitorOptions options;

  public static final String JSON_PROPERTY_OVERALL_STATE = "overall_state";
  private MonitorOverallStates overallState;

  public static final String JSON_PROPERTY_PRIORITY = "priority";
  private JsonNullable<Long> priority = JsonNullable.<Long>undefined();

  public static final String JSON_PROPERTY_QUERY = "query";
  private String query;

  public static final String JSON_PROPERTY_RESTRICTED_ROLES = "restricted_roles";
  private JsonNullable<List<String>> restrictedRoles = JsonNullable.<List<String>>undefined();

  public static final String JSON_PROPERTY_STATE = "state";
  private MonitorState state;

  public static final String JSON_PROPERTY_TAGS = "tags";
  private List<String> tags = null;

  public static final String JSON_PROPERTY_TYPE = "type";
  private MonitorType type;

  public MonitorUpdateRequest assets(List<MonitorAsset> assets) {
    this.assets = JsonNullable.<List<MonitorAsset>>of(assets);
    return this;
  }
  public MonitorUpdateRequest addAssetsItem(MonitorAsset assetsItem) {
    if (this.assets == null || !this.assets.isPresent()) {
      this.assets = JsonNullable.<List<MonitorAsset>>of(new ArrayList<>());
    }
    try {
      this.assets.get().add(assetsItem);
    } catch (java.util.NoSuchElementException e) {
      // this can never happen, as we make sure above that the value is present
    }
    return this;
  }

  /**
   * <p>The list of monitor assets tied to a monitor, which represents key links for users to take action on monitor alerts (for example, runbooks).</p>
   * @return assets
  **/
      @jakarta.annotation.Nullable
      @JsonIgnore
      public List<MonitorAsset> getAssets() {
        return assets.orElse(null);
      }
  @JsonProperty(JSON_PROPERTY_ASSETS)
  @JsonInclude(
    value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<List<MonitorAsset>> getAssets_JsonNullable() {
    return assets;
  }
  @JsonProperty(JSON_PROPERTY_ASSETS)public void setAssets_JsonNullable(JsonNullable<List<MonitorAsset>> assets) {
    this.assets = assets;
  }
  public void setAssets(List<MonitorAsset> assets) {
    this.assets = JsonNullable.<List<MonitorAsset>>of(assets);
  }

  /**
   * <p>Timestamp of the monitor creation.</p>
   * @return created
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_CREATED)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public OffsetDateTime getCreated() {
        return created;
      }

  /**
   * <p>Object describing the creator of the shared element.</p>
   * @return creator
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_CREATOR)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public Creator getCreator() {
        return creator;
      }

  /**
   * <p>Whether or not the monitor is deleted. (Always <code>null</code>)</p>
   * @return deleted
  **/
      @jakarta.annotation.Nullable
      @JsonIgnore
      public OffsetDateTime getDeleted() {

        if (deleted == null) {
          deleted = JsonNullable.<OffsetDateTime>undefined();
        }
        return deleted.orElse(null);
      }
  @JsonProperty(JSON_PROPERTY_DELETED)
  @JsonInclude(
    value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<OffsetDateTime> getDeleted_JsonNullable() {
    return deleted;
  }
  @JsonProperty(JSON_PROPERTY_DELETED)private void setDeleted_JsonNullable(JsonNullable<OffsetDateTime> deleted) {
    this.deleted = deleted;
  }
  public MonitorUpdateRequest draftStatus(MonitorDraftStatus draftStatus) {
    this.draftStatus = draftStatus;
    this.unparsed |= !draftStatus.isValid();
    return this;
  }

  /**
   * <p>Indicates whether the monitor is in a draft or published state.</p>
   * <p><code>draft</code>: The monitor appears as Draft and does not send notifications.
   * <code>published</code>: The monitor is active and evaluates conditions and notify as configured.</p>
   * <p>This field is in preview. The draft value is only available to customers with the feature enabled.</p>
   * @return draftStatus
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_DRAFT_STATUS)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public MonitorDraftStatus getDraftStatus() {
        return draftStatus;
      }
  public void setDraftStatus(MonitorDraftStatus draftStatus) {
    if (!draftStatus.isValid()) {
        this.unparsed = true;
    }
    this.draftStatus = draftStatus;
  }

  /**
   * <p>ID of this monitor.</p>
   * @return id
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_ID)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public Long getId() {
        return id;
      }
  public MonitorUpdateRequest message(String message) {
    this.message = message;
    return this;
  }

  /**
   * <p>A message to include with notifications for this monitor.</p>
   * @return message
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_MESSAGE)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public String getMessage() {
        return message;
      }
  public void setMessage(String message) {
    this.message = message;
  }

  /**
   * <p>Last timestamp when the monitor was edited.</p>
   * @return modified
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_MODIFIED)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public OffsetDateTime getModified() {
        return modified;
      }

  /**
   * <p>Whether or not the monitor is broken down on different groups.</p>
   * @return multi
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_MULTI)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public Boolean getMulti() {
        return multi;
      }
  public MonitorUpdateRequest name(String name) {
    this.name = name;
    return this;
  }

  /**
   * <p>The monitor name.</p>
   * @return name
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_NAME)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public String getName() {
        return name;
      }
  public void setName(String name) {
    this.name = name;
  }
  public MonitorUpdateRequest options(MonitorOptions options) {
    this.options = options;
    this.unparsed |= options.unparsed;
    return this;
  }

  /**
   * <p>List of options associated with your monitor.</p>
   * @return options
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_OPTIONS)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public MonitorOptions getOptions() {
        return options;
      }
  public void setOptions(MonitorOptions options) {
    this.options = options;
  }

  /**
   * <p>The different states your monitor can be in.</p>
   * @return overallState
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_OVERALL_STATE)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public MonitorOverallStates getOverallState() {
        return overallState;
      }
  public MonitorUpdateRequest priority(Long priority) {
    this.priority = JsonNullable.<Long>of(priority);
    return this;
  }

  /**
   * <p>Integer from 1 (high) to 5 (low) indicating alert severity.</p>
   * @return priority
  **/
      @jakarta.annotation.Nullable
      @JsonIgnore
      public Long getPriority() {
        return priority.orElse(null);
      }
  @JsonProperty(JSON_PROPERTY_PRIORITY)
  @JsonInclude(
    value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<Long> getPriority_JsonNullable() {
    return priority;
  }
  @JsonProperty(JSON_PROPERTY_PRIORITY)public void setPriority_JsonNullable(JsonNullable<Long> priority) {
    this.priority = priority;
  }
  public void setPriority(Long priority) {
    this.priority = JsonNullable.<Long>of(priority);
  }
  public MonitorUpdateRequest query(String query) {
    this.query = query;
    return this;
  }

  /**
   * <p>The monitor query.</p>
   * @return query
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_QUERY)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public String getQuery() {
        return query;
      }
  public void setQuery(String query) {
    this.query = query;
  }
  public MonitorUpdateRequest restrictedRoles(List<String> restrictedRoles) {
    this.restrictedRoles = JsonNullable.<List<String>>of(restrictedRoles);
    return this;
  }
  public MonitorUpdateRequest addRestrictedRolesItem(String restrictedRolesItem) {
    if (this.restrictedRoles == null || !this.restrictedRoles.isPresent()) {
      this.restrictedRoles = JsonNullable.<List<String>>of(new ArrayList<>());
    }
    try {
      this.restrictedRoles.get().add(restrictedRolesItem);
    } catch (java.util.NoSuchElementException e) {
      // this can never happen, as we make sure above that the value is present
    }
    return this;
  }

  /**
   * <p>A list of unique role identifiers to define which roles are allowed to edit the monitor. The unique identifiers for all roles can be pulled from the <a href="https://docs.datadoghq.com/api/latest/roles/#list-roles">Roles API</a> and are located in the <code>data.id</code> field. Editing a monitor includes any updates to the monitor configuration, monitor deletion, and muting of the monitor for any amount of time. You can use the <a href="https://docs.datadoghq.com/api/latest/restriction-policies/">Restriction Policies API</a> to manage write authorization for individual monitors by teams and users, in addition to roles.</p>
   * @return restrictedRoles
  **/
      @jakarta.annotation.Nullable
      @JsonIgnore
      public List<String> getRestrictedRoles() {
        return restrictedRoles.orElse(null);
      }
  @JsonProperty(JSON_PROPERTY_RESTRICTED_ROLES)
  @JsonInclude(
    value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<List<String>> getRestrictedRoles_JsonNullable() {
    return restrictedRoles;
  }
  @JsonProperty(JSON_PROPERTY_RESTRICTED_ROLES)public void setRestrictedRoles_JsonNullable(JsonNullable<List<String>> restrictedRoles) {
    this.restrictedRoles = restrictedRoles;
  }
  public void setRestrictedRoles(List<String> restrictedRoles) {
    this.restrictedRoles = JsonNullable.<List<String>>of(restrictedRoles);
  }

  /**
   * <p>Wrapper object with the different monitor states.</p>
   * @return state
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_STATE)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public MonitorState getState() {
        return state;
      }
  public MonitorUpdateRequest tags(List<String> tags) {
    this.tags = tags;
    return this;
  }
  public MonitorUpdateRequest addTagsItem(String tagsItem) {
    if (this.tags == null) {
      this.tags = new ArrayList<>();
    }
    this.tags.add(tagsItem);
    return this;
  }

  /**
   * <p>Tags associated to your monitor.</p>
   * @return tags
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_TAGS)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public List<String> getTags() {
        return tags;
      }
  public void setTags(List<String> tags) {
    this.tags = tags;
  }
  public MonitorUpdateRequest type(MonitorType type) {
    this.type = type;
    this.unparsed |= !type.isValid();
    return this;
  }

  /**
   * <p>The type of the monitor. For more information about <code>type</code>, see the <a href="https://docs.datadoghq.com/monitors/guide/monitor_api_options/">monitor options</a> docs.</p>
   * @return type
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_TYPE)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public MonitorType getType() {
        return type;
      }
  public void setType(MonitorType type) {
    if (!type.isValid()) {
        this.unparsed = true;
    }
    this.type = type;
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
   * @return MonitorUpdateRequest
   */
  @JsonAnySetter
  public MonitorUpdateRequest putAdditionalProperty(String key, Object value) {
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
   * Return true if this MonitorUpdateRequest object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MonitorUpdateRequest monitorUpdateRequest = (MonitorUpdateRequest) o;
    return Objects.equals(this.assets, monitorUpdateRequest.assets) && Objects.equals(this.created, monitorUpdateRequest.created) && Objects.equals(this.creator, monitorUpdateRequest.creator) && Objects.equals(this.deleted, monitorUpdateRequest.deleted) && Objects.equals(this.draftStatus, monitorUpdateRequest.draftStatus) && Objects.equals(this.id, monitorUpdateRequest.id) && Objects.equals(this.message, monitorUpdateRequest.message) && Objects.equals(this.modified, monitorUpdateRequest.modified) && Objects.equals(this.multi, monitorUpdateRequest.multi) && Objects.equals(this.name, monitorUpdateRequest.name) && Objects.equals(this.options, monitorUpdateRequest.options) && Objects.equals(this.overallState, monitorUpdateRequest.overallState) && Objects.equals(this.priority, monitorUpdateRequest.priority) && Objects.equals(this.query, monitorUpdateRequest.query) && Objects.equals(this.restrictedRoles, monitorUpdateRequest.restrictedRoles) && Objects.equals(this.state, monitorUpdateRequest.state) && Objects.equals(this.tags, monitorUpdateRequest.tags) && Objects.equals(this.type, monitorUpdateRequest.type) && Objects.equals(this.additionalProperties, monitorUpdateRequest.additionalProperties);
  }


  @Override
  public int hashCode() {
    return Objects.hash(assets,created,creator,deleted,draftStatus,id,message,modified,multi,name,options,overallState,priority,query,restrictedRoles,state,tags,type, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MonitorUpdateRequest {\n");
    sb.append("    assets: ").append(toIndentedString(assets)).append("\n");
    sb.append("    created: ").append(toIndentedString(created)).append("\n");
    sb.append("    creator: ").append(toIndentedString(creator)).append("\n");
    sb.append("    deleted: ").append(toIndentedString(deleted)).append("\n");
    sb.append("    draftStatus: ").append(toIndentedString(draftStatus)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    modified: ").append(toIndentedString(modified)).append("\n");
    sb.append("    multi: ").append(toIndentedString(multi)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    options: ").append(toIndentedString(options)).append("\n");
    sb.append("    overallState: ").append(toIndentedString(overallState)).append("\n");
    sb.append("    priority: ").append(toIndentedString(priority)).append("\n");
    sb.append("    query: ").append(toIndentedString(query)).append("\n");
    sb.append("    restrictedRoles: ").append(toIndentedString(restrictedRoles)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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
