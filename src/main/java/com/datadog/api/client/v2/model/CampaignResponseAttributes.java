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
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/** Campaign attributes. */
@JsonPropertyOrder({
  CampaignResponseAttributes.JSON_PROPERTY_CREATED_AT,
  CampaignResponseAttributes.JSON_PROPERTY_DESCRIPTION,
  CampaignResponseAttributes.JSON_PROPERTY_DUE_DATE,
  CampaignResponseAttributes.JSON_PROPERTY_ENTITY_SCOPE,
  CampaignResponseAttributes.JSON_PROPERTY_GUIDANCE,
  CampaignResponseAttributes.JSON_PROPERTY_KEY,
  CampaignResponseAttributes.JSON_PROPERTY_MODIFIED_AT,
  CampaignResponseAttributes.JSON_PROPERTY_NAME,
  CampaignResponseAttributes.JSON_PROPERTY_OWNER,
  CampaignResponseAttributes.JSON_PROPERTY_START_DATE,
  CampaignResponseAttributes.JSON_PROPERTY_STATUS
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class CampaignResponseAttributes {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_CREATED_AT = "created_at";
  private OffsetDateTime createdAt;

  public static final String JSON_PROPERTY_DESCRIPTION = "description";
  private String description;

  public static final String JSON_PROPERTY_DUE_DATE = "due_date";
  private OffsetDateTime dueDate;

  public static final String JSON_PROPERTY_ENTITY_SCOPE = "entity_scope";
  private String entityScope;

  public static final String JSON_PROPERTY_GUIDANCE = "guidance";
  private String guidance;

  public static final String JSON_PROPERTY_KEY = "key";
  private String key;

  public static final String JSON_PROPERTY_MODIFIED_AT = "modified_at";
  private OffsetDateTime modifiedAt;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_OWNER = "owner";
  private String owner;

  public static final String JSON_PROPERTY_START_DATE = "start_date";
  private OffsetDateTime startDate;

  public static final String JSON_PROPERTY_STATUS = "status";
  private String status;

  public CampaignResponseAttributes() {}

  @JsonCreator
  public CampaignResponseAttributes(
      @JsonProperty(required = true, value = JSON_PROPERTY_CREATED_AT) OffsetDateTime createdAt,
      @JsonProperty(required = true, value = JSON_PROPERTY_KEY) String key,
      @JsonProperty(required = true, value = JSON_PROPERTY_MODIFIED_AT) OffsetDateTime modifiedAt,
      @JsonProperty(required = true, value = JSON_PROPERTY_NAME) String name,
      @JsonProperty(required = true, value = JSON_PROPERTY_OWNER) String owner,
      @JsonProperty(required = true, value = JSON_PROPERTY_START_DATE) OffsetDateTime startDate,
      @JsonProperty(required = true, value = JSON_PROPERTY_STATUS) String status) {
    this.createdAt = createdAt;
    this.key = key;
    this.modifiedAt = modifiedAt;
    this.name = name;
    this.owner = owner;
    this.startDate = startDate;
    this.status = status;
  }

  public CampaignResponseAttributes createdAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
    return this;
  }

  /**
   * Creation time of the campaign.
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

  public CampaignResponseAttributes description(String description) {
    this.description = description;
    return this;
  }

  /**
   * The description of the campaign.
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

  public CampaignResponseAttributes dueDate(OffsetDateTime dueDate) {
    this.dueDate = dueDate;
    return this;
  }

  /**
   * The due date of the campaign.
   *
   * @return dueDate
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DUE_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public OffsetDateTime getDueDate() {
    return dueDate;
  }

  public void setDueDate(OffsetDateTime dueDate) {
    this.dueDate = dueDate;
  }

  public CampaignResponseAttributes entityScope(String entityScope) {
    this.entityScope = entityScope;
    return this;
  }

  /**
   * Entity scope query to filter entities for this campaign.
   *
   * @return entityScope
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ENTITY_SCOPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getEntityScope() {
    return entityScope;
  }

  public void setEntityScope(String entityScope) {
    this.entityScope = entityScope;
  }

  public CampaignResponseAttributes guidance(String guidance) {
    this.guidance = guidance;
    return this;
  }

  /**
   * Guidance for the campaign.
   *
   * @return guidance
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_GUIDANCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getGuidance() {
    return guidance;
  }

  public void setGuidance(String guidance) {
    this.guidance = guidance;
  }

  public CampaignResponseAttributes key(String key) {
    this.key = key;
    return this;
  }

  /**
   * The unique key for the campaign.
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

  public CampaignResponseAttributes modifiedAt(OffsetDateTime modifiedAt) {
    this.modifiedAt = modifiedAt;
    return this;
  }

  /**
   * Time of last campaign modification.
   *
   * @return modifiedAt
   */
  @JsonProperty(JSON_PROPERTY_MODIFIED_AT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public OffsetDateTime getModifiedAt() {
    return modifiedAt;
  }

  public void setModifiedAt(OffsetDateTime modifiedAt) {
    this.modifiedAt = modifiedAt;
  }

  public CampaignResponseAttributes name(String name) {
    this.name = name;
    return this;
  }

  /**
   * The name of the campaign.
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

  public CampaignResponseAttributes owner(String owner) {
    this.owner = owner;
    return this;
  }

  /**
   * The UUID of the campaign owner.
   *
   * @return owner
   */
  @JsonProperty(JSON_PROPERTY_OWNER)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getOwner() {
    return owner;
  }

  public void setOwner(String owner) {
    this.owner = owner;
  }

  public CampaignResponseAttributes startDate(OffsetDateTime startDate) {
    this.startDate = startDate;
    return this;
  }

  /**
   * The start date of the campaign.
   *
   * @return startDate
   */
  @JsonProperty(JSON_PROPERTY_START_DATE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public OffsetDateTime getStartDate() {
    return startDate;
  }

  public void setStartDate(OffsetDateTime startDate) {
    this.startDate = startDate;
  }

  public CampaignResponseAttributes status(String status) {
    this.status = status;
    return this;
  }

  /**
   * The status of the campaign.
   *
   * @return status
   */
  @JsonProperty(JSON_PROPERTY_STATUS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
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
   * @return CampaignResponseAttributes
   */
  @JsonAnySetter
  public CampaignResponseAttributes putAdditionalProperty(String key, Object value) {
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

  /** Return true if this CampaignResponseAttributes object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CampaignResponseAttributes campaignResponseAttributes = (CampaignResponseAttributes) o;
    return Objects.equals(this.createdAt, campaignResponseAttributes.createdAt)
        && Objects.equals(this.description, campaignResponseAttributes.description)
        && Objects.equals(this.dueDate, campaignResponseAttributes.dueDate)
        && Objects.equals(this.entityScope, campaignResponseAttributes.entityScope)
        && Objects.equals(this.guidance, campaignResponseAttributes.guidance)
        && Objects.equals(this.key, campaignResponseAttributes.key)
        && Objects.equals(this.modifiedAt, campaignResponseAttributes.modifiedAt)
        && Objects.equals(this.name, campaignResponseAttributes.name)
        && Objects.equals(this.owner, campaignResponseAttributes.owner)
        && Objects.equals(this.startDate, campaignResponseAttributes.startDate)
        && Objects.equals(this.status, campaignResponseAttributes.status)
        && Objects.equals(
            this.additionalProperties, campaignResponseAttributes.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        createdAt,
        description,
        dueDate,
        entityScope,
        guidance,
        key,
        modifiedAt,
        name,
        owner,
        startDate,
        status,
        additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CampaignResponseAttributes {\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    dueDate: ").append(toIndentedString(dueDate)).append("\n");
    sb.append("    entityScope: ").append(toIndentedString(entityScope)).append("\n");
    sb.append("    guidance: ").append(toIndentedString(guidance)).append("\n");
    sb.append("    key: ").append(toIndentedString(key)).append("\n");
    sb.append("    modifiedAt: ").append(toIndentedString(modifiedAt)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    owner: ").append(toIndentedString(owner)).append("\n");
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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
