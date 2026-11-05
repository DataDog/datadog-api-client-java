/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v2.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.UUID;

/**
 * All selected filters combine with AND, with one value per filter. The <code>model</code> and
 * <code>provider</code> tags apply to each actual direct or routed attempt, including fallback
 * destinations. Routes are not selectable filters. At least one filter is required. If any matching
 * override uses <code>metadata_only</code>, that mode applies. Otherwise, if any matching override
 * uses <code>full_capture</code>, that mode applies. The organization default applies only when no
 * override matches. Overrides have no priority or specificity ordering.
 */
@JsonPropertyOrder({
  AiGatewayCaptureScope.JSON_PROPERTY_TAGS,
  AiGatewayCaptureScope.JSON_PROPERTY_TEAM_ID,
  AiGatewayCaptureScope.JSON_PROPERTY_USER_ID
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class AiGatewayCaptureScope {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_TAGS = "tags";
  private Map<String, String> tags = null;

  public static final String JSON_PROPERTY_TEAM_ID = "team_id";
  private UUID teamId;

  public static final String JSON_PROPERTY_USER_ID = "user_id";
  private UUID userId;

  public AiGatewayCaptureScope tags(Map<String, String> tags) {
    this.tags = tags;
    return this;
  }

  public AiGatewayCaptureScope putTagsItem(String key, String tagsItem) {
    if (this.tags == null) {
      this.tags = new HashMap<>();
    }
    this.tags.put(key, tagsItem);
    return this;
  }

  /**
   * Exact-match request tags with lowercase keys. The reserved <code>model</code> tag is the
   * canonical model ID, and the reserved <code>provider</code> tag is the configured connection
   * slug. The server sets both. Custom tags come from <code>x-dd-tag</code> headers. Keys and
   * values must not have leading or trailing white space. Values are case-sensitive.
   *
   * @return tags
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TAGS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Map<String, String> getTags() {
    return tags;
  }

  public void setTags(Map<String, String> tags) {
    this.tags = tags;
  }

  public AiGatewayCaptureScope teamId(UUID teamId) {
    this.teamId = teamId;
    return this;
  }

  /**
   * UUID of a Datadog team. Matches the authorized team selected by the <code>x-ai-gateway-team
   * </code> request header. Requests without this header do not match team-scoped overrides.
   * Open-membership teams cannot scope overrides.
   *
   * @return teamId
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TEAM_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public UUID getTeamId() {
    return teamId;
  }

  public void setTeamId(UUID teamId) {
    this.teamId = teamId;
  }

  public AiGatewayCaptureScope userId(UUID userId) {
    this.userId = userId;
    return this;
  }

  /**
   * Authenticated Datadog user UUID in this organization.
   *
   * @return userId
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_USER_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public UUID getUserId() {
    return userId;
  }

  public void setUserId(UUID userId) {
    this.userId = userId;
  }

  /** Return true if this AiGatewayCaptureScope object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AiGatewayCaptureScope aiGatewayCaptureScope = (AiGatewayCaptureScope) o;
    return Objects.equals(this.tags, aiGatewayCaptureScope.tags)
        && Objects.equals(this.teamId, aiGatewayCaptureScope.teamId)
        && Objects.equals(this.userId, aiGatewayCaptureScope.userId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(tags, teamId, userId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AiGatewayCaptureScope {\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("    teamId: ").append(toIndentedString(teamId)).append("\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
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
