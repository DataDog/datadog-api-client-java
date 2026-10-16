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
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/** The number of resources of a batch migration in each status. */
@JsonPropertyOrder({
  SecurityMonitoringBatchMigrationResourceStatusCounts.JSON_PROPERTY_CANCELED,
  SecurityMonitoringBatchMigrationResourceStatusCounts.JSON_PROPERTY_COMPLETED,
  SecurityMonitoringBatchMigrationResourceStatusCounts.JSON_PROPERTY_DUPLICATE,
  SecurityMonitoringBatchMigrationResourceStatusCounts.JSON_PROPERTY_FAILED,
  SecurityMonitoringBatchMigrationResourceStatusCounts.JSON_PROPERTY_IN_PROGRESS,
  SecurityMonitoringBatchMigrationResourceStatusCounts.JSON_PROPERTY_PENDING,
  SecurityMonitoringBatchMigrationResourceStatusCounts.JSON_PROPERTY_PUBLISHED,
  SecurityMonitoringBatchMigrationResourceStatusCounts.JSON_PROPERTY_PUBLISHING
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class SecurityMonitoringBatchMigrationResourceStatusCounts {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_CANCELED = "canceled";
  private Long canceled;

  public static final String JSON_PROPERTY_COMPLETED = "completed";
  private Long completed;

  public static final String JSON_PROPERTY_DUPLICATE = "duplicate";
  private Long duplicate;

  public static final String JSON_PROPERTY_FAILED = "failed";
  private Long failed;

  public static final String JSON_PROPERTY_IN_PROGRESS = "inProgress";
  private Long inProgress;

  public static final String JSON_PROPERTY_PENDING = "pending";
  private Long pending;

  public static final String JSON_PROPERTY_PUBLISHED = "published";
  private Long published;

  public static final String JSON_PROPERTY_PUBLISHING = "publishing";
  private Long publishing;

  public SecurityMonitoringBatchMigrationResourceStatusCounts() {}

  @JsonCreator
  public SecurityMonitoringBatchMigrationResourceStatusCounts(
      @JsonProperty(required = true, value = JSON_PROPERTY_CANCELED) Long canceled,
      @JsonProperty(required = true, value = JSON_PROPERTY_COMPLETED) Long completed,
      @JsonProperty(required = true, value = JSON_PROPERTY_DUPLICATE) Long duplicate,
      @JsonProperty(required = true, value = JSON_PROPERTY_FAILED) Long failed,
      @JsonProperty(required = true, value = JSON_PROPERTY_IN_PROGRESS) Long inProgress,
      @JsonProperty(required = true, value = JSON_PROPERTY_PENDING) Long pending,
      @JsonProperty(required = true, value = JSON_PROPERTY_PUBLISHED) Long published,
      @JsonProperty(required = true, value = JSON_PROPERTY_PUBLISHING) Long publishing) {
    this.canceled = canceled;
    this.completed = completed;
    this.duplicate = duplicate;
    this.failed = failed;
    this.inProgress = inProgress;
    this.pending = pending;
    this.published = published;
    this.publishing = publishing;
  }

  public SecurityMonitoringBatchMigrationResourceStatusCounts canceled(Long canceled) {
    this.canceled = canceled;
    return this;
  }

  /**
   * Number of resources whose translation was canceled.
   *
   * @return canceled
   */
  @JsonProperty(JSON_PROPERTY_CANCELED)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Long getCanceled() {
    return canceled;
  }

  public void setCanceled(Long canceled) {
    this.canceled = canceled;
  }

  public SecurityMonitoringBatchMigrationResourceStatusCounts completed(Long completed) {
    this.completed = completed;
    return this;
  }

  /**
   * Number of resources translated and ready to be published.
   *
   * @return completed
   */
  @JsonProperty(JSON_PROPERTY_COMPLETED)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Long getCompleted() {
    return completed;
  }

  public void setCompleted(Long completed) {
    this.completed = completed;
  }

  public SecurityMonitoringBatchMigrationResourceStatusCounts duplicate(Long duplicate) {
    this.duplicate = duplicate;
    return this;
  }

  /**
   * Number of resources identified as duplicates of an existing rule. Reserved for future use.
   *
   * @return duplicate
   */
  @JsonProperty(JSON_PROPERTY_DUPLICATE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Long getDuplicate() {
    return duplicate;
  }

  public void setDuplicate(Long duplicate) {
    this.duplicate = duplicate;
  }

  public SecurityMonitoringBatchMigrationResourceStatusCounts failed(Long failed) {
    this.failed = failed;
    return this;
  }

  /**
   * Number of resources whose translation failed.
   *
   * @return failed
   */
  @JsonProperty(JSON_PROPERTY_FAILED)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Long getFailed() {
    return failed;
  }

  public void setFailed(Long failed) {
    this.failed = failed;
  }

  public SecurityMonitoringBatchMigrationResourceStatusCounts inProgress(Long inProgress) {
    this.inProgress = inProgress;
    return this;
  }

  /**
   * Number of resources being translated.
   *
   * @return inProgress
   */
  @JsonProperty(JSON_PROPERTY_IN_PROGRESS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Long getInProgress() {
    return inProgress;
  }

  public void setInProgress(Long inProgress) {
    this.inProgress = inProgress;
  }

  public SecurityMonitoringBatchMigrationResourceStatusCounts pending(Long pending) {
    this.pending = pending;
    return this;
  }

  /**
   * Number of resources waiting to be translated.
   *
   * @return pending
   */
  @JsonProperty(JSON_PROPERTY_PENDING)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Long getPending() {
    return pending;
  }

  public void setPending(Long pending) {
    this.pending = pending;
  }

  public SecurityMonitoringBatchMigrationResourceStatusCounts published(Long published) {
    this.published = published;
    return this;
  }

  /**
   * Number of resources published as Cloud SIEM detection rules.
   *
   * @return published
   */
  @JsonProperty(JSON_PROPERTY_PUBLISHED)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Long getPublished() {
    return published;
  }

  public void setPublished(Long published) {
    this.published = published;
  }

  public SecurityMonitoringBatchMigrationResourceStatusCounts publishing(Long publishing) {
    this.publishing = publishing;
    return this;
  }

  /**
   * Number of resources being published.
   *
   * @return publishing
   */
  @JsonProperty(JSON_PROPERTY_PUBLISHING)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Long getPublishing() {
    return publishing;
  }

  public void setPublishing(Long publishing) {
    this.publishing = publishing;
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
   * @return SecurityMonitoringBatchMigrationResourceStatusCounts
   */
  @JsonAnySetter
  public SecurityMonitoringBatchMigrationResourceStatusCounts putAdditionalProperty(
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

  /**
   * Return true if this SecurityMonitoringBatchMigrationResourceStatusCounts object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SecurityMonitoringBatchMigrationResourceStatusCounts
        securityMonitoringBatchMigrationResourceStatusCounts =
            (SecurityMonitoringBatchMigrationResourceStatusCounts) o;
    return Objects.equals(
            this.canceled, securityMonitoringBatchMigrationResourceStatusCounts.canceled)
        && Objects.equals(
            this.completed, securityMonitoringBatchMigrationResourceStatusCounts.completed)
        && Objects.equals(
            this.duplicate, securityMonitoringBatchMigrationResourceStatusCounts.duplicate)
        && Objects.equals(this.failed, securityMonitoringBatchMigrationResourceStatusCounts.failed)
        && Objects.equals(
            this.inProgress, securityMonitoringBatchMigrationResourceStatusCounts.inProgress)
        && Objects.equals(
            this.pending, securityMonitoringBatchMigrationResourceStatusCounts.pending)
        && Objects.equals(
            this.published, securityMonitoringBatchMigrationResourceStatusCounts.published)
        && Objects.equals(
            this.publishing, securityMonitoringBatchMigrationResourceStatusCounts.publishing)
        && Objects.equals(
            this.additionalProperties,
            securityMonitoringBatchMigrationResourceStatusCounts.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        canceled,
        completed,
        duplicate,
        failed,
        inProgress,
        pending,
        published,
        publishing,
        additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SecurityMonitoringBatchMigrationResourceStatusCounts {\n");
    sb.append("    canceled: ").append(toIndentedString(canceled)).append("\n");
    sb.append("    completed: ").append(toIndentedString(completed)).append("\n");
    sb.append("    duplicate: ").append(toIndentedString(duplicate)).append("\n");
    sb.append("    failed: ").append(toIndentedString(failed)).append("\n");
    sb.append("    inProgress: ").append(toIndentedString(inProgress)).append("\n");
    sb.append("    pending: ").append(toIndentedString(pending)).append("\n");
    sb.append("    published: ").append(toIndentedString(published)).append("\n");
    sb.append("    publishing: ").append(toIndentedString(publishing)).append("\n");
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
