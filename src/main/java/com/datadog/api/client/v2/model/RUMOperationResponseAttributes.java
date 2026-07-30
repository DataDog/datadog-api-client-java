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
import org.openapitools.jackson.nullable.JsonNullable;

/** Attributes of a RUM operation response. */
@JsonPropertyOrder({
  RUMOperationResponseAttributes.JSON_PROPERTY_APPLICATION_ID,
  RUMOperationResponseAttributes.JSON_PROPERTY_CATEGORY,
  RUMOperationResponseAttributes.JSON_PROPERTY_CREATED_AT,
  RUMOperationResponseAttributes.JSON_PROPERTY_CREATED_BY,
  RUMOperationResponseAttributes.JSON_PROPERTY_DESCRIPTION,
  RUMOperationResponseAttributes.JSON_PROPERTY_DISPLAY_NAME,
  RUMOperationResponseAttributes.JSON_PROPERTY_FEATURE_IDS,
  RUMOperationResponseAttributes.JSON_PROPERTY_JOURNEY_RUM,
  RUMOperationResponseAttributes.JSON_PROPERTY_NAME,
  RUMOperationResponseAttributes.JSON_PROPERTY_ORG_ID,
  RUMOperationResponseAttributes.JSON_PROPERTY_TAGS,
  RUMOperationResponseAttributes.JSON_PROPERTY_UPDATED_AT,
  RUMOperationResponseAttributes.JSON_PROPERTY_UPDATED_BY
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class RUMOperationResponseAttributes {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_APPLICATION_ID = "application_id";
  private JsonNullable<UUID> applicationId = JsonNullable.<UUID>undefined();

  public static final String JSON_PROPERTY_CATEGORY = "category";
  private JsonNullable<String> category = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_CREATED_AT = "created_at";
  private OffsetDateTime createdAt;

  public static final String JSON_PROPERTY_CREATED_BY = "created_by";
  private RUMOperationUser createdBy;

  public static final String JSON_PROPERTY_DESCRIPTION = "description";
  private JsonNullable<String> description = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_DISPLAY_NAME = "display_name";
  private String displayName;

  public static final String JSON_PROPERTY_FEATURE_IDS = "feature_ids";
  private List<String> featureIds = null;

  public static final String JSON_PROPERTY_JOURNEY_RUM = "journey_rum";
  private RUMOperationJourneyRum journeyRum;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_ORG_ID = "org_id";
  private Long orgId;

  public static final String JSON_PROPERTY_TAGS = "tags";
  private List<String> tags = new ArrayList<>();

  public static final String JSON_PROPERTY_UPDATED_AT = "updated_at";
  private JsonNullable<OffsetDateTime> updatedAt = JsonNullable.<OffsetDateTime>undefined();

  public static final String JSON_PROPERTY_UPDATED_BY = "updated_by";
  private RUMOperationUser updatedBy;

  public RUMOperationResponseAttributes() {}

  @JsonCreator
  public RUMOperationResponseAttributes(
      @JsonProperty(required = true, value = JSON_PROPERTY_JOURNEY_RUM)
          RUMOperationJourneyRum journeyRum,
      @JsonProperty(required = true, value = JSON_PROPERTY_NAME) String name,
      @JsonProperty(required = true, value = JSON_PROPERTY_TAGS) List<String> tags) {
    this.journeyRum = journeyRum;
    this.unparsed |= journeyRum.unparsed;
    this.name = name;
    this.tags = tags;
  }

  public RUMOperationResponseAttributes applicationId(UUID applicationId) {
    this.applicationId = JsonNullable.<UUID>of(applicationId);
    return this;
  }

  /**
   * The RUM application ID the operation belongs to.
   *
   * @return applicationId
   */
  @jakarta.annotation.Nullable
  @JsonIgnore
  public UUID getApplicationId() {
    return applicationId.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_APPLICATION_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<UUID> getApplicationId_JsonNullable() {
    return applicationId;
  }

  @JsonProperty(JSON_PROPERTY_APPLICATION_ID)
  public void setApplicationId_JsonNullable(JsonNullable<UUID> applicationId) {
    this.applicationId = applicationId;
  }

  public void setApplicationId(UUID applicationId) {
    this.applicationId = JsonNullable.<UUID>of(applicationId);
  }

  public RUMOperationResponseAttributes category(String category) {
    this.category = JsonNullable.<String>of(category);
    return this;
  }

  /**
   * The category of the RUM operation.
   *
   * @return category
   */
  @jakarta.annotation.Nullable
  @JsonIgnore
  public String getCategory() {
    return category.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_CATEGORY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<String> getCategory_JsonNullable() {
    return category;
  }

  @JsonProperty(JSON_PROPERTY_CATEGORY)
  public void setCategory_JsonNullable(JsonNullable<String> category) {
    this.category = category;
  }

  public void setCategory(String category) {
    this.category = JsonNullable.<String>of(category);
  }

  /**
   * The timestamp when the RUM operation was created.
   *
   * @return createdAt
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CREATED_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }

  public RUMOperationResponseAttributes createdBy(RUMOperationUser createdBy) {
    this.createdBy = createdBy;
    this.unparsed |= createdBy.unparsed;
    return this;
  }

  /**
   * A Datadog user referenced by a RUM operation.
   *
   * @return createdBy
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CREATED_BY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public RUMOperationUser getCreatedBy() {
    return createdBy;
  }

  public void setCreatedBy(RUMOperationUser createdBy) {
    this.createdBy = createdBy;
    if (createdBy != null) {
      this.unparsed |= createdBy.unparsed;
    }
  }

  public RUMOperationResponseAttributes description(String description) {
    this.description = JsonNullable.<String>of(description);
    return this;
  }

  /**
   * A description of the RUM operation.
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

  public RUMOperationResponseAttributes displayName(String displayName) {
    this.displayName = displayName;
    return this;
  }

  /**
   * A human-readable display name for the RUM operation.
   *
   * @return displayName
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DISPLAY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getDisplayName() {
    return displayName;
  }

  public void setDisplayName(String displayName) {
    this.displayName = displayName;
  }

  public RUMOperationResponseAttributes featureIds(List<String> featureIds) {
    this.featureIds = featureIds;
    return this;
  }

  public RUMOperationResponseAttributes addFeatureIdsItem(String featureIdsItem) {
    if (this.featureIds == null) {
      this.featureIds = new ArrayList<>();
    }
    this.featureIds.add(featureIdsItem);
    return this;
  }

  /**
   * The list of feature IDs associated with the RUM operation.
   *
   * @return featureIds
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_FEATURE_IDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<String> getFeatureIds() {
    return featureIds;
  }

  public void setFeatureIds(List<String> featureIds) {
    this.featureIds = featureIds;
  }

  public RUMOperationResponseAttributes journeyRum(RUMOperationJourneyRum journeyRum) {
    this.journeyRum = journeyRum;
    this.unparsed |= journeyRum.unparsed;
    return this;
  }

  /**
   * The definition of a RUM operation's journey, used to detect it from RUM events.
   *
   * @return journeyRum
   */
  @JsonProperty(JSON_PROPERTY_JOURNEY_RUM)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public RUMOperationJourneyRum getJourneyRum() {
    return journeyRum;
  }

  public void setJourneyRum(RUMOperationJourneyRum journeyRum) {
    this.journeyRum = journeyRum;
    if (journeyRum != null) {
      this.unparsed |= journeyRum.unparsed;
    }
  }

  public RUMOperationResponseAttributes name(String name) {
    this.name = name;
    return this;
  }

  /**
   * The unique name of the RUM operation. Must not contain spaces.
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

  /**
   * The ID of the organization the RUM operation belongs to.
   *
   * @return orgId
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ORG_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getOrgId() {
    return orgId;
  }

  public RUMOperationResponseAttributes tags(List<String> tags) {
    this.tags = tags;
    return this;
  }

  public RUMOperationResponseAttributes addTagsItem(String tagsItem) {
    this.tags.add(tagsItem);
    return this;
  }

  /**
   * A list of tags associated with the RUM operation.
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
   * The timestamp when the RUM operation was last updated.
   *
   * @return updatedAt
   */
  @jakarta.annotation.Nullable
  @JsonIgnore
  public OffsetDateTime getUpdatedAt() {

    if (updatedAt == null) {
      updatedAt = JsonNullable.<OffsetDateTime>undefined();
    }
    return updatedAt.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_UPDATED_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<OffsetDateTime> getUpdatedAt_JsonNullable() {
    return updatedAt;
  }

  @JsonProperty(JSON_PROPERTY_UPDATED_AT)
  private void setUpdatedAt_JsonNullable(JsonNullable<OffsetDateTime> updatedAt) {
    this.updatedAt = updatedAt;
  }

  public RUMOperationResponseAttributes updatedBy(RUMOperationUser updatedBy) {
    this.updatedBy = updatedBy;
    this.unparsed |= updatedBy.unparsed;
    return this;
  }

  /**
   * A Datadog user referenced by a RUM operation.
   *
   * @return updatedBy
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_UPDATED_BY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public RUMOperationUser getUpdatedBy() {
    return updatedBy;
  }

  public void setUpdatedBy(RUMOperationUser updatedBy) {
    this.updatedBy = updatedBy;
    if (updatedBy != null) {
      this.unparsed |= updatedBy.unparsed;
    }
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
   * @return RUMOperationResponseAttributes
   */
  @JsonAnySetter
  public RUMOperationResponseAttributes putAdditionalProperty(String key, Object value) {
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

  /** Return true if this RUMOperationResponseAttributes object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RUMOperationResponseAttributes rumOperationResponseAttributes =
        (RUMOperationResponseAttributes) o;
    return Objects.equals(this.applicationId, rumOperationResponseAttributes.applicationId)
        && Objects.equals(this.category, rumOperationResponseAttributes.category)
        && Objects.equals(this.createdAt, rumOperationResponseAttributes.createdAt)
        && Objects.equals(this.createdBy, rumOperationResponseAttributes.createdBy)
        && Objects.equals(this.description, rumOperationResponseAttributes.description)
        && Objects.equals(this.displayName, rumOperationResponseAttributes.displayName)
        && Objects.equals(this.featureIds, rumOperationResponseAttributes.featureIds)
        && Objects.equals(this.journeyRum, rumOperationResponseAttributes.journeyRum)
        && Objects.equals(this.name, rumOperationResponseAttributes.name)
        && Objects.equals(this.orgId, rumOperationResponseAttributes.orgId)
        && Objects.equals(this.tags, rumOperationResponseAttributes.tags)
        && Objects.equals(this.updatedAt, rumOperationResponseAttributes.updatedAt)
        && Objects.equals(this.updatedBy, rumOperationResponseAttributes.updatedBy)
        && Objects.equals(
            this.additionalProperties, rumOperationResponseAttributes.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        applicationId,
        category,
        createdAt,
        createdBy,
        description,
        displayName,
        featureIds,
        journeyRum,
        name,
        orgId,
        tags,
        updatedAt,
        updatedBy,
        additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RUMOperationResponseAttributes {\n");
    sb.append("    applicationId: ").append(toIndentedString(applicationId)).append("\n");
    sb.append("    category: ").append(toIndentedString(category)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    createdBy: ").append(toIndentedString(createdBy)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
    sb.append("    featureIds: ").append(toIndentedString(featureIds)).append("\n");
    sb.append("    journeyRum: ").append(toIndentedString(journeyRum)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    orgId: ").append(toIndentedString(orgId)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
    sb.append("    updatedBy: ").append(toIndentedString(updatedBy)).append("\n");
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
