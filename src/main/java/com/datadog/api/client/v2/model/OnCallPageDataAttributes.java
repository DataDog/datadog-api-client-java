/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v2.model;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.UUID;

/** The attributes of an On-Call Page. */
@JsonPropertyOrder({
  OnCallPageDataAttributes.JSON_PROPERTY_ACKNOWLEDGED_AT,
  OnCallPageDataAttributes.JSON_PROPERTY_CLOSED_AT,
  OnCallPageDataAttributes.JSON_PROPERTY_COMMENT_COUNT,
  OnCallPageDataAttributes.JSON_PROPERTY_CREATED_AT,
  OnCallPageDataAttributes.JSON_PROPERTY_DESCRIPTION,
  OnCallPageDataAttributes.JSON_PROPERTY_ESCALATION_POLICY_UUID,
  OnCallPageDataAttributes.JSON_PROPERTY_KEY,
  OnCallPageDataAttributes.JSON_PROPERTY_LIVE_CALL,
  OnCallPageDataAttributes.JSON_PROPERTY_MODIFIED_AT,
  OnCallPageDataAttributes.JSON_PROPERTY_RELEASE_AT,
  OnCallPageDataAttributes.JSON_PROPERTY_RELEASE_ORIGIN,
  OnCallPageDataAttributes.JSON_PROPERTY_RESPONDERS_ADDED_AT,
  OnCallPageDataAttributes.JSON_PROPERTY_SERVICES,
  OnCallPageDataAttributes.JSON_PROPERTY_STATUS,
  OnCallPageDataAttributes.JSON_PROPERTY_TAGS,
  OnCallPageDataAttributes.JSON_PROPERTY_TITLE,
  OnCallPageDataAttributes.JSON_PROPERTY_URGENCY
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class OnCallPageDataAttributes {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_ACKNOWLEDGED_AT = "acknowledged_at";
  private OffsetDateTime acknowledgedAt;

  public static final String JSON_PROPERTY_CLOSED_AT = "closed_at";
  private OffsetDateTime closedAt;

  public static final String JSON_PROPERTY_COMMENT_COUNT = "comment_count";
  private Long commentCount;

  public static final String JSON_PROPERTY_CREATED_AT = "created_at";
  private OffsetDateTime createdAt;

  public static final String JSON_PROPERTY_DESCRIPTION = "description";
  private String description;

  public static final String JSON_PROPERTY_ESCALATION_POLICY_UUID = "escalation_policy_uuid";
  private UUID escalationPolicyUuid;

  public static final String JSON_PROPERTY_KEY = "key";
  private String key;

  public static final String JSON_PROPERTY_LIVE_CALL = "live_call";
  private OnCallPageLiveCall liveCall;

  public static final String JSON_PROPERTY_MODIFIED_AT = "modified_at";
  private OffsetDateTime modifiedAt;

  public static final String JSON_PROPERTY_RELEASE_AT = "release_at";
  private OffsetDateTime releaseAt;

  public static final String JSON_PROPERTY_RELEASE_ORIGIN = "release_origin";
  private OnCallPageReleaseOrigin releaseOrigin;

  public static final String JSON_PROPERTY_RESPONDERS_ADDED_AT = "responders_added_at";
  private OffsetDateTime respondersAddedAt;

  public static final String JSON_PROPERTY_SERVICES = "services";
  private List<String> services = null;

  public static final String JSON_PROPERTY_STATUS = "status";
  private OnCallPageStatus status;

  public static final String JSON_PROPERTY_TAGS = "tags";
  private List<String> tags = new ArrayList<>();

  public static final String JSON_PROPERTY_TITLE = "title";
  private String title;

  public static final String JSON_PROPERTY_URGENCY = "urgency";
  private PageUrgency urgency = PageUrgency.HIGH;

  public OnCallPageDataAttributes() {}

  @JsonCreator
  public OnCallPageDataAttributes(
      @JsonProperty(required = true, value = JSON_PROPERTY_CREATED_AT) OffsetDateTime createdAt,
      @JsonProperty(required = true, value = JSON_PROPERTY_DESCRIPTION) String description,
      @JsonProperty(required = true, value = JSON_PROPERTY_KEY) String key,
      @JsonProperty(required = true, value = JSON_PROPERTY_STATUS) OnCallPageStatus status,
      @JsonProperty(required = true, value = JSON_PROPERTY_TAGS) List<String> tags,
      @JsonProperty(required = true, value = JSON_PROPERTY_TITLE) String title,
      @JsonProperty(required = true, value = JSON_PROPERTY_URGENCY) PageUrgency urgency) {
    this.createdAt = createdAt;
    this.description = description;
    this.key = key;
    this.status = status;
    this.unparsed |= !status.isValid();
    this.tags = tags;
    this.title = title;
    this.urgency = urgency;
    this.unparsed |= !urgency.isValid();
  }

  public OnCallPageDataAttributes acknowledgedAt(OffsetDateTime acknowledgedAt) {
    this.acknowledgedAt = acknowledgedAt;
    return this;
  }

  /**
   * The time when the page was first acknowledged.
   *
   * @return acknowledgedAt
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ACKNOWLEDGED_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public OffsetDateTime getAcknowledgedAt() {
    return acknowledgedAt;
  }

  public void setAcknowledgedAt(OffsetDateTime acknowledgedAt) {
    this.acknowledgedAt = acknowledgedAt;
  }

  public OnCallPageDataAttributes closedAt(OffsetDateTime closedAt) {
    this.closedAt = closedAt;
    return this;
  }

  /**
   * The time when the page was resolved.
   *
   * @return closedAt
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CLOSED_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public OffsetDateTime getClosedAt() {
    return closedAt;
  }

  public void setClosedAt(OffsetDateTime closedAt) {
    this.closedAt = closedAt;
  }

  public OnCallPageDataAttributes commentCount(Long commentCount) {
    this.commentCount = commentCount;
    return this;
  }

  /**
   * The number of comments on the page.
   *
   * @return commentCount
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_COMMENT_COUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getCommentCount() {
    return commentCount;
  }

  public void setCommentCount(Long commentCount) {
    this.commentCount = commentCount;
  }

  public OnCallPageDataAttributes createdAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
    return this;
  }

  /**
   * The time when the page was created.
   *
   * @return createdAt
   */
  @JsonProperty(JSON_PROPERTY_CREATED_AT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
  }

  public OnCallPageDataAttributes description(String description) {
    this.description = description;
    return this;
  }

  /**
   * A short summary of the issue or context.
   *
   * @return description
   */
  @JsonProperty(JSON_PROPERTY_DESCRIPTION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public OnCallPageDataAttributes escalationPolicyUuid(UUID escalationPolicyUuid) {
    this.escalationPolicyUuid = escalationPolicyUuid;
    return this;
  }

  /**
   * The ID of the escalation policy used to route the page.
   *
   * @return escalationPolicyUuid
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ESCALATION_POLICY_UUID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public UUID getEscalationPolicyUuid() {
    return escalationPolicyUuid;
  }

  public void setEscalationPolicyUuid(UUID escalationPolicyUuid) {
    this.escalationPolicyUuid = escalationPolicyUuid;
  }

  public OnCallPageDataAttributes key(String key) {
    this.key = key;
    return this;
  }

  /**
   * An alternative numeric identifier of the page, as displayed in the Datadog UI.
   *
   * @return key
   */
  @JsonProperty(JSON_PROPERTY_KEY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getKey() {
    return key;
  }

  public void setKey(String key) {
    this.key = key;
  }

  public OnCallPageDataAttributes liveCall(OnCallPageLiveCall liveCall) {
    this.liveCall = liveCall;
    this.unparsed |= liveCall.unparsed;
    return this;
  }

  /**
   * Live call information for a page triggered by a live call route.
   *
   * @return liveCall
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LIVE_CALL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public OnCallPageLiveCall getLiveCall() {
    return liveCall;
  }

  public void setLiveCall(OnCallPageLiveCall liveCall) {
    this.liveCall = liveCall;
    if (liveCall != null) {
      this.unparsed |= liveCall.unparsed;
    }
  }

  public OnCallPageDataAttributes modifiedAt(OffsetDateTime modifiedAt) {
    this.modifiedAt = modifiedAt;
    return this;
  }

  /**
   * The time when the page was last modified.
   *
   * @return modifiedAt
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_MODIFIED_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public OffsetDateTime getModifiedAt() {
    return modifiedAt;
  }

  public void setModifiedAt(OffsetDateTime modifiedAt) {
    this.modifiedAt = modifiedAt;
  }

  public OnCallPageDataAttributes releaseAt(OffsetDateTime releaseAt) {
    this.releaseAt = releaseAt;
    return this;
  }

  /**
   * The time when the snooze ends. Only set while the page is snoozed, together with <code>
   * release_origin</code>.
   *
   * @return releaseAt
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_RELEASE_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public OffsetDateTime getReleaseAt() {
    return releaseAt;
  }

  public void setReleaseAt(OffsetDateTime releaseAt) {
    this.releaseAt = releaseAt;
  }

  public OnCallPageDataAttributes releaseOrigin(OnCallPageReleaseOrigin releaseOrigin) {
    this.releaseOrigin = releaseOrigin;
    this.unparsed |= !releaseOrigin.isValid();
    return this;
  }

  /**
   * What snoozed the page. Only set while the page is snoozed, together with <code>release_at
   * </code>. <code>ack_timeout</code>: the acknowledgment timeout. <code>team_rules_active_hours
   * </code>: the page was triggered outside of the active hours of the team's routing rules. <code>
   * manual_snooze</code>: a user snoozed the page.
   *
   * @return releaseOrigin
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_RELEASE_ORIGIN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public OnCallPageReleaseOrigin getReleaseOrigin() {
    return releaseOrigin;
  }

  public void setReleaseOrigin(OnCallPageReleaseOrigin releaseOrigin) {
    if (!releaseOrigin.isValid()) {
      this.unparsed = true;
    }
    this.releaseOrigin = releaseOrigin;
  }

  public OnCallPageDataAttributes respondersAddedAt(OffsetDateTime respondersAddedAt) {
    this.respondersAddedAt = respondersAddedAt;
    return this;
  }

  /**
   * The time when responders were first added to the page.
   *
   * @return respondersAddedAt
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_RESPONDERS_ADDED_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public OffsetDateTime getRespondersAddedAt() {
    return respondersAddedAt;
  }

  public void setRespondersAddedAt(OffsetDateTime respondersAddedAt) {
    this.respondersAddedAt = respondersAddedAt;
  }

  public OnCallPageDataAttributes services(List<String> services) {
    this.services = services;
    return this;
  }

  public OnCallPageDataAttributes addServicesItem(String servicesItem) {
    if (this.services == null) {
      this.services = new ArrayList<>();
    }
    this.services.add(servicesItem);
    return this;
  }

  /**
   * The services associated with the page.
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

  public OnCallPageDataAttributes status(OnCallPageStatus status) {
    this.status = status;
    this.unparsed |= !status.isValid();
    return this;
  }

  /**
   * The current status of the On-Call Page.
   *
   * @return status
   */
  @JsonProperty(JSON_PROPERTY_STATUS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public OnCallPageStatus getStatus() {
    return status;
  }

  public void setStatus(OnCallPageStatus status) {
    if (!status.isValid()) {
      this.unparsed = true;
    }
    this.status = status;
  }

  public OnCallPageDataAttributes tags(List<String> tags) {
    this.tags = tags;
    return this;
  }

  public OnCallPageDataAttributes addTagsItem(String tagsItem) {
    this.tags.add(tagsItem);
    return this;
  }

  /**
   * Tags associated with the page.
   *
   * @return tags
   */
  @JsonProperty(JSON_PROPERTY_TAGS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public List<String> getTags() {
    return tags;
  }

  public void setTags(List<String> tags) {
    this.tags = tags;
  }

  public OnCallPageDataAttributes title(String title) {
    this.title = title;
    return this;
  }

  /**
   * The title of the page.
   *
   * @return title
   */
  @JsonProperty(JSON_PROPERTY_TITLE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public OnCallPageDataAttributes urgency(PageUrgency urgency) {
    this.urgency = urgency;
    this.unparsed |= !urgency.isValid();
    return this;
  }

  /**
   * On-Call Page urgency level.
   *
   * @return urgency
   */
  @JsonProperty(JSON_PROPERTY_URGENCY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public PageUrgency getUrgency() {
    return urgency;
  }

  public void setUrgency(PageUrgency urgency) {
    if (!urgency.isValid()) {
      this.unparsed = true;
    }
    this.urgency = urgency;
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
   * @return OnCallPageDataAttributes
   */
  @JsonAnySetter
  public OnCallPageDataAttributes putAdditionalProperty(String key, Object value) {
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

  /** Return true if this OnCallPageDataAttributes object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OnCallPageDataAttributes onCallPageDataAttributes = (OnCallPageDataAttributes) o;
    return Objects.equals(this.acknowledgedAt, onCallPageDataAttributes.acknowledgedAt)
        && Objects.equals(this.closedAt, onCallPageDataAttributes.closedAt)
        && Objects.equals(this.commentCount, onCallPageDataAttributes.commentCount)
        && Objects.equals(this.createdAt, onCallPageDataAttributes.createdAt)
        && Objects.equals(this.description, onCallPageDataAttributes.description)
        && Objects.equals(this.escalationPolicyUuid, onCallPageDataAttributes.escalationPolicyUuid)
        && Objects.equals(this.key, onCallPageDataAttributes.key)
        && Objects.equals(this.liveCall, onCallPageDataAttributes.liveCall)
        && Objects.equals(this.modifiedAt, onCallPageDataAttributes.modifiedAt)
        && Objects.equals(this.releaseAt, onCallPageDataAttributes.releaseAt)
        && Objects.equals(this.releaseOrigin, onCallPageDataAttributes.releaseOrigin)
        && Objects.equals(this.respondersAddedAt, onCallPageDataAttributes.respondersAddedAt)
        && Objects.equals(this.services, onCallPageDataAttributes.services)
        && Objects.equals(this.status, onCallPageDataAttributes.status)
        && Objects.equals(this.tags, onCallPageDataAttributes.tags)
        && Objects.equals(this.title, onCallPageDataAttributes.title)
        && Objects.equals(this.urgency, onCallPageDataAttributes.urgency)
        && Objects.equals(this.additionalProperties, onCallPageDataAttributes.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        acknowledgedAt,
        closedAt,
        commentCount,
        createdAt,
        description,
        escalationPolicyUuid,
        key,
        liveCall,
        modifiedAt,
        releaseAt,
        releaseOrigin,
        respondersAddedAt,
        services,
        status,
        tags,
        title,
        urgency,
        additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OnCallPageDataAttributes {\n");
    sb.append("    acknowledgedAt: ").append(toIndentedString(acknowledgedAt)).append("\n");
    sb.append("    closedAt: ").append(toIndentedString(closedAt)).append("\n");
    sb.append("    commentCount: ").append(toIndentedString(commentCount)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    escalationPolicyUuid: ")
        .append(toIndentedString(escalationPolicyUuid))
        .append("\n");
    sb.append("    key: ").append(toIndentedString(key)).append("\n");
    sb.append("    liveCall: ").append(toIndentedString(liveCall)).append("\n");
    sb.append("    modifiedAt: ").append(toIndentedString(modifiedAt)).append("\n");
    sb.append("    releaseAt: ").append(toIndentedString(releaseAt)).append("\n");
    sb.append("    releaseOrigin: ").append(toIndentedString(releaseOrigin)).append("\n");
    sb.append("    respondersAddedAt: ").append(toIndentedString(respondersAddedAt)).append("\n");
    sb.append("    services: ").append(toIndentedString(services)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    urgency: ").append(toIndentedString(urgency)).append("\n");
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
