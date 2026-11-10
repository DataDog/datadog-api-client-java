/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v2.model;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/** Object containing the information of a pull request linked to an issue. */
@JsonPropertyOrder({
  IssuePullRequestAttributes.JSON_PROPERTY_CLOSED_AT,
  IssuePullRequestAttributes.JSON_PROPERTY_LINKED_AT,
  IssuePullRequestAttributes.JSON_PROPERTY_MERGED_AT,
  IssuePullRequestAttributes.JSON_PROPERTY_REASON,
  IssuePullRequestAttributes.JSON_PROPERTY_URL
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class IssuePullRequestAttributes {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_CLOSED_AT = "closed_at";
  private OffsetDateTime closedAt;

  public static final String JSON_PROPERTY_LINKED_AT = "linked_at";
  private OffsetDateTime linkedAt;

  public static final String JSON_PROPERTY_MERGED_AT = "merged_at";
  private OffsetDateTime mergedAt;

  public static final String JSON_PROPERTY_REASON = "reason";
  private IssuePullRequestReason reason;

  public static final String JSON_PROPERTY_URL = "url";
  private String url;

  public IssuePullRequestAttributes closedAt(OffsetDateTime closedAt) {
    this.closedAt = closedAt;
    return this;
  }

  /**
   * Timestamp of when the pull request was closed. Omitted if the pull request is not closed.
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

  public IssuePullRequestAttributes linkedAt(OffsetDateTime linkedAt) {
    this.linkedAt = linkedAt;
    return this;
  }

  /**
   * Timestamp of when the pull request was linked to the issue.
   *
   * @return linkedAt
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LINKED_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public OffsetDateTime getLinkedAt() {
    return linkedAt;
  }

  public void setLinkedAt(OffsetDateTime linkedAt) {
    this.linkedAt = linkedAt;
  }

  public IssuePullRequestAttributes mergedAt(OffsetDateTime mergedAt) {
    this.mergedAt = mergedAt;
    return this;
  }

  /**
   * Timestamp of when the pull request was merged. Omitted if the pull request is not merged.
   *
   * @return mergedAt
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_MERGED_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public OffsetDateTime getMergedAt() {
    return mergedAt;
  }

  public void setMergedAt(OffsetDateTime mergedAt) {
    this.mergedAt = mergedAt;
  }

  public IssuePullRequestAttributes reason(IssuePullRequestReason reason) {
    this.reason = reason;
    this.unparsed |= !reason.isValid();
    return this;
  }

  /**
   * Why the pull request is linked to the issue. <code>fix</code> means the pull request fixes the
   * issue, and <code>trigger</code> means the pull request introduced the issue.
   *
   * @return reason
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_REASON)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public IssuePullRequestReason getReason() {
    return reason;
  }

  public void setReason(IssuePullRequestReason reason) {
    if (!reason.isValid()) {
      this.unparsed = true;
    }
    this.reason = reason;
  }

  public IssuePullRequestAttributes url(String url) {
    this.url = url;
    return this;
  }

  /**
   * URL of the pull request.
   *
   * @return url
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
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
   * @return IssuePullRequestAttributes
   */
  @JsonAnySetter
  public IssuePullRequestAttributes putAdditionalProperty(String key, Object value) {
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

  /** Return true if this IssuePullRequestAttributes object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IssuePullRequestAttributes issuePullRequestAttributes = (IssuePullRequestAttributes) o;
    return Objects.equals(this.closedAt, issuePullRequestAttributes.closedAt)
        && Objects.equals(this.linkedAt, issuePullRequestAttributes.linkedAt)
        && Objects.equals(this.mergedAt, issuePullRequestAttributes.mergedAt)
        && Objects.equals(this.reason, issuePullRequestAttributes.reason)
        && Objects.equals(this.url, issuePullRequestAttributes.url)
        && Objects.equals(
            this.additionalProperties, issuePullRequestAttributes.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(closedAt, linkedAt, mergedAt, reason, url, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IssuePullRequestAttributes {\n");
    sb.append("    closedAt: ").append(toIndentedString(closedAt)).append("\n");
    sb.append("    linkedAt: ").append(toIndentedString(linkedAt)).append("\n");
    sb.append("    mergedAt: ").append(toIndentedString(mergedAt)).append("\n");
    sb.append("    reason: ").append(toIndentedString(reason)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
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
