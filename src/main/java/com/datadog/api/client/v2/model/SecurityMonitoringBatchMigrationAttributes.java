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

/** Attributes of a batch migration. */
@JsonPropertyOrder({
  SecurityMonitoringBatchMigrationAttributes.JSON_PROPERTY_CREATED_AT,
  SecurityMonitoringBatchMigrationAttributes.JSON_PROPERTY_CREATED_BY,
  SecurityMonitoringBatchMigrationAttributes.JSON_PROPERTY_DESCRIPTION,
  SecurityMonitoringBatchMigrationAttributes.JSON_PROPERTY_INPUT_SOURCE,
  SecurityMonitoringBatchMigrationAttributes.JSON_PROPERTY_LAST_UPDATED_AT,
  SecurityMonitoringBatchMigrationAttributes.JSON_PROPERTY_LAST_UPDATED_BY,
  SecurityMonitoringBatchMigrationAttributes.JSON_PROPERTY_NAME,
  SecurityMonitoringBatchMigrationAttributes.JSON_PROPERTY_ORG_ID,
  SecurityMonitoringBatchMigrationAttributes.JSON_PROPERTY_RESOURCE_STATUS_COUNTS,
  SecurityMonitoringBatchMigrationAttributes.JSON_PROPERTY_STATUS,
  SecurityMonitoringBatchMigrationAttributes.JSON_PROPERTY_TAGS
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class SecurityMonitoringBatchMigrationAttributes {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_CREATED_AT = "createdAt";
  private OffsetDateTime createdAt;

  public static final String JSON_PROPERTY_CREATED_BY = "createdBy";
  private String createdBy;

  public static final String JSON_PROPERTY_DESCRIPTION = "description";
  private String description;

  public static final String JSON_PROPERTY_INPUT_SOURCE = "inputSource";
  private SecurityMonitoringBatchMigrationInputSource inputSource;

  public static final String JSON_PROPERTY_LAST_UPDATED_AT = "lastUpdatedAt";
  private OffsetDateTime lastUpdatedAt;

  public static final String JSON_PROPERTY_LAST_UPDATED_BY = "lastUpdatedBy";
  private String lastUpdatedBy;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_ORG_ID = "orgId";
  private Long orgId;

  public static final String JSON_PROPERTY_RESOURCE_STATUS_COUNTS = "resourceStatusCounts";
  private SecurityMonitoringBatchMigrationResourceStatusCounts resourceStatusCounts;

  public static final String JSON_PROPERTY_STATUS = "status";
  private SecurityMonitoringBatchMigrationStatus status;

  public static final String JSON_PROPERTY_TAGS = "tags";
  private List<String> tags = new ArrayList<>();

  public SecurityMonitoringBatchMigrationAttributes() {}

  @JsonCreator
  public SecurityMonitoringBatchMigrationAttributes(
      @JsonProperty(required = true, value = JSON_PROPERTY_CREATED_AT) OffsetDateTime createdAt,
      @JsonProperty(required = true, value = JSON_PROPERTY_INPUT_SOURCE)
          SecurityMonitoringBatchMigrationInputSource inputSource,
      @JsonProperty(required = true, value = JSON_PROPERTY_LAST_UPDATED_AT)
          OffsetDateTime lastUpdatedAt,
      @JsonProperty(required = true, value = JSON_PROPERTY_NAME) String name,
      @JsonProperty(required = true, value = JSON_PROPERTY_ORG_ID) Long orgId,
      @JsonProperty(required = true, value = JSON_PROPERTY_RESOURCE_STATUS_COUNTS)
          SecurityMonitoringBatchMigrationResourceStatusCounts resourceStatusCounts,
      @JsonProperty(required = true, value = JSON_PROPERTY_STATUS)
          SecurityMonitoringBatchMigrationStatus status,
      @JsonProperty(required = true, value = JSON_PROPERTY_TAGS) List<String> tags) {
    this.createdAt = createdAt;
    this.inputSource = inputSource;
    this.unparsed |= !inputSource.isValid();
    this.lastUpdatedAt = lastUpdatedAt;
    this.name = name;
    this.orgId = orgId;
    this.resourceStatusCounts = resourceStatusCounts;
    this.unparsed |= resourceStatusCounts.unparsed;
    this.status = status;
    this.unparsed |= !status.isValid();
    this.tags = tags;
  }

  public SecurityMonitoringBatchMigrationAttributes createdAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
    return this;
  }

  /**
   * The creation date of the batch migration, in RFC 3339 format.
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

  public SecurityMonitoringBatchMigrationAttributes createdBy(String createdBy) {
    this.createdBy = createdBy;
    return this;
  }

  /**
   * The UUID of the user or service account who created the batch migration.
   *
   * @return createdBy
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CREATED_BY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getCreatedBy() {
    return createdBy;
  }

  public void setCreatedBy(String createdBy) {
    this.createdBy = createdBy;
  }

  public SecurityMonitoringBatchMigrationAttributes description(String description) {
    this.description = description;
    return this;
  }

  /**
   * The description of the batch migration.
   *
   * @return description
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DESCRIPTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public SecurityMonitoringBatchMigrationAttributes inputSource(
      SecurityMonitoringBatchMigrationInputSource inputSource) {
    this.inputSource = inputSource;
    this.unparsed |= !inputSource.isValid();
    return this;
  }

  /**
   * The origin of a batch migration. Always <code>batch_migration</code> for batch migrations
   * created through this API.
   *
   * @return inputSource
   */
  @JsonProperty(JSON_PROPERTY_INPUT_SOURCE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public SecurityMonitoringBatchMigrationInputSource getInputSource() {
    return inputSource;
  }

  public void setInputSource(SecurityMonitoringBatchMigrationInputSource inputSource) {
    if (!inputSource.isValid()) {
      this.unparsed = true;
    }
    this.inputSource = inputSource;
  }

  public SecurityMonitoringBatchMigrationAttributes lastUpdatedAt(OffsetDateTime lastUpdatedAt) {
    this.lastUpdatedAt = lastUpdatedAt;
    return this;
  }

  /**
   * The last update date of the batch migration, in RFC 3339 format.
   *
   * @return lastUpdatedAt
   */
  @JsonProperty(JSON_PROPERTY_LAST_UPDATED_AT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public OffsetDateTime getLastUpdatedAt() {
    return lastUpdatedAt;
  }

  public void setLastUpdatedAt(OffsetDateTime lastUpdatedAt) {
    this.lastUpdatedAt = lastUpdatedAt;
  }

  public SecurityMonitoringBatchMigrationAttributes lastUpdatedBy(String lastUpdatedBy) {
    this.lastUpdatedBy = lastUpdatedBy;
    return this;
  }

  /**
   * The UUID of the user or service account who last updated the batch migration, or the name of a
   * system actor.
   *
   * @return lastUpdatedBy
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LAST_UPDATED_BY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getLastUpdatedBy() {
    return lastUpdatedBy;
  }

  public void setLastUpdatedBy(String lastUpdatedBy) {
    this.lastUpdatedBy = lastUpdatedBy;
  }

  public SecurityMonitoringBatchMigrationAttributes name(String name) {
    this.name = name;
    return this;
  }

  /**
   * The name of the batch migration.
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

  public SecurityMonitoringBatchMigrationAttributes orgId(Long orgId) {
    this.orgId = orgId;
    return this;
  }

  /**
   * The ID of the organization that owns the batch migration.
   *
   * @return orgId
   */
  @JsonProperty(JSON_PROPERTY_ORG_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Long getOrgId() {
    return orgId;
  }

  public void setOrgId(Long orgId) {
    this.orgId = orgId;
  }

  public SecurityMonitoringBatchMigrationAttributes resourceStatusCounts(
      SecurityMonitoringBatchMigrationResourceStatusCounts resourceStatusCounts) {
    this.resourceStatusCounts = resourceStatusCounts;
    this.unparsed |= resourceStatusCounts.unparsed;
    return this;
  }

  /**
   * The number of resources of a batch migration in each status.
   *
   * @return resourceStatusCounts
   */
  @JsonProperty(JSON_PROPERTY_RESOURCE_STATUS_COUNTS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public SecurityMonitoringBatchMigrationResourceStatusCounts getResourceStatusCounts() {
    return resourceStatusCounts;
  }

  public void setResourceStatusCounts(
      SecurityMonitoringBatchMigrationResourceStatusCounts resourceStatusCounts) {
    this.resourceStatusCounts = resourceStatusCounts;
    if (resourceStatusCounts != null) {
      this.unparsed |= resourceStatusCounts.unparsed;
    }
  }

  public SecurityMonitoringBatchMigrationAttributes status(
      SecurityMonitoringBatchMigrationStatus status) {
    this.status = status;
    this.unparsed |= !status.isValid();
    return this;
  }

  /**
   * The status of a batch migration. A batch migration is created as <code>draft</code> and moves
   * to <code>in_progress</code> when started. It moves to <code>completed</code> once no resource
   * is <code>pending</code> or <code>in_progress</code>, or to <code>canceled</code> when canceled.
   *
   * @return status
   */
  @JsonProperty(JSON_PROPERTY_STATUS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public SecurityMonitoringBatchMigrationStatus getStatus() {
    return status;
  }

  public void setStatus(SecurityMonitoringBatchMigrationStatus status) {
    if (!status.isValid()) {
      this.unparsed = true;
    }
    this.status = status;
  }

  public SecurityMonitoringBatchMigrationAttributes tags(List<String> tags) {
    this.tags = tags;
    return this;
  }

  public SecurityMonitoringBatchMigrationAttributes addTagsItem(String tagsItem) {
    this.tags.add(tagsItem);
    return this;
  }

  /**
   * Tags of the batch migration. Up to 50 tags, each up to 256 characters.
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
   * @return SecurityMonitoringBatchMigrationAttributes
   */
  @JsonAnySetter
  public SecurityMonitoringBatchMigrationAttributes putAdditionalProperty(
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

  /** Return true if this SecurityMonitoringBatchMigrationAttributes object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SecurityMonitoringBatchMigrationAttributes securityMonitoringBatchMigrationAttributes =
        (SecurityMonitoringBatchMigrationAttributes) o;
    return Objects.equals(this.createdAt, securityMonitoringBatchMigrationAttributes.createdAt)
        && Objects.equals(this.createdBy, securityMonitoringBatchMigrationAttributes.createdBy)
        && Objects.equals(this.description, securityMonitoringBatchMigrationAttributes.description)
        && Objects.equals(this.inputSource, securityMonitoringBatchMigrationAttributes.inputSource)
        && Objects.equals(
            this.lastUpdatedAt, securityMonitoringBatchMigrationAttributes.lastUpdatedAt)
        && Objects.equals(
            this.lastUpdatedBy, securityMonitoringBatchMigrationAttributes.lastUpdatedBy)
        && Objects.equals(this.name, securityMonitoringBatchMigrationAttributes.name)
        && Objects.equals(this.orgId, securityMonitoringBatchMigrationAttributes.orgId)
        && Objects.equals(
            this.resourceStatusCounts,
            securityMonitoringBatchMigrationAttributes.resourceStatusCounts)
        && Objects.equals(this.status, securityMonitoringBatchMigrationAttributes.status)
        && Objects.equals(this.tags, securityMonitoringBatchMigrationAttributes.tags)
        && Objects.equals(
            this.additionalProperties,
            securityMonitoringBatchMigrationAttributes.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        createdAt,
        createdBy,
        description,
        inputSource,
        lastUpdatedAt,
        lastUpdatedBy,
        name,
        orgId,
        resourceStatusCounts,
        status,
        tags,
        additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SecurityMonitoringBatchMigrationAttributes {\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    createdBy: ").append(toIndentedString(createdBy)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    inputSource: ").append(toIndentedString(inputSource)).append("\n");
    sb.append("    lastUpdatedAt: ").append(toIndentedString(lastUpdatedAt)).append("\n");
    sb.append("    lastUpdatedBy: ").append(toIndentedString(lastUpdatedBy)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    orgId: ").append(toIndentedString(orgId)).append("\n");
    sb.append("    resourceStatusCounts: ")
        .append(toIndentedString(resourceStatusCounts))
        .append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
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
