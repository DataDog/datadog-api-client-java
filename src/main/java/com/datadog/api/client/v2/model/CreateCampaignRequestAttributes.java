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

/** Attributes for creating a new campaign. */
@JsonPropertyOrder({
  CreateCampaignRequestAttributes.JSON_PROPERTY_DESCRIPTION,
  CreateCampaignRequestAttributes.JSON_PROPERTY_DUE_DATE,
  CreateCampaignRequestAttributes.JSON_PROPERTY_ENTITY_SCOPE,
  CreateCampaignRequestAttributes.JSON_PROPERTY_GUIDANCE,
  CreateCampaignRequestAttributes.JSON_PROPERTY_KEY,
  CreateCampaignRequestAttributes.JSON_PROPERTY_NAME,
  CreateCampaignRequestAttributes.JSON_PROPERTY_OWNER_ID,
  CreateCampaignRequestAttributes.JSON_PROPERTY_RULE_IDS,
  CreateCampaignRequestAttributes.JSON_PROPERTY_START_DATE,
  CreateCampaignRequestAttributes.JSON_PROPERTY_STATUS
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class CreateCampaignRequestAttributes {
  @JsonIgnore public boolean unparsed = false;
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

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_OWNER_ID = "owner_id";
  private String ownerId;

  public static final String JSON_PROPERTY_RULE_IDS = "rule_ids";
  private List<String> ruleIds = new ArrayList<>();

  public static final String JSON_PROPERTY_START_DATE = "start_date";
  private OffsetDateTime startDate;

  public static final String JSON_PROPERTY_STATUS = "status";
  private CampaignStatus status;

  public CreateCampaignRequestAttributes() {}

  @JsonCreator
  public CreateCampaignRequestAttributes(
      @JsonProperty(required = true, value = JSON_PROPERTY_KEY) String key,
      @JsonProperty(required = true, value = JSON_PROPERTY_NAME) String name,
      @JsonProperty(required = true, value = JSON_PROPERTY_OWNER_ID) String ownerId,
      @JsonProperty(required = true, value = JSON_PROPERTY_RULE_IDS) List<String> ruleIds,
      @JsonProperty(required = true, value = JSON_PROPERTY_START_DATE) OffsetDateTime startDate) {
    this.key = key;
    this.name = name;
    this.ownerId = ownerId;
    this.ruleIds = ruleIds;
    this.startDate = startDate;
  }

  public CreateCampaignRequestAttributes description(String description) {
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

  public CreateCampaignRequestAttributes dueDate(OffsetDateTime dueDate) {
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

  public CreateCampaignRequestAttributes entityScope(String entityScope) {
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

  public CreateCampaignRequestAttributes guidance(String guidance) {
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

  public CreateCampaignRequestAttributes key(String key) {
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

  public CreateCampaignRequestAttributes name(String name) {
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

  public CreateCampaignRequestAttributes ownerId(String ownerId) {
    this.ownerId = ownerId;
    return this;
  }

  /**
   * The UUID of the campaign owner.
   *
   * @return ownerId
   */
  @JsonProperty(JSON_PROPERTY_OWNER_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getOwnerId() {
    return ownerId;
  }

  public void setOwnerId(String ownerId) {
    this.ownerId = ownerId;
  }

  public CreateCampaignRequestAttributes ruleIds(List<String> ruleIds) {
    this.ruleIds = ruleIds;
    return this;
  }

  public CreateCampaignRequestAttributes addRuleIdsItem(String ruleIdsItem) {
    this.ruleIds.add(ruleIdsItem);
    return this;
  }

  /**
   * Array of rule IDs associated with this campaign.
   *
   * @return ruleIds
   */
  @JsonProperty(JSON_PROPERTY_RULE_IDS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public List<String> getRuleIds() {
    return ruleIds;
  }

  public void setRuleIds(List<String> ruleIds) {
    this.ruleIds = ruleIds;
  }

  public CreateCampaignRequestAttributes startDate(OffsetDateTime startDate) {
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

  public CreateCampaignRequestAttributes status(CampaignStatus status) {
    this.status = status;
    this.unparsed |= !status.isValid();
    return this;
  }

  /**
   * The status of the campaign.
   *
   * @return status
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public CampaignStatus getStatus() {
    return status;
  }

  public void setStatus(CampaignStatus status) {
    if (!status.isValid()) {
      this.unparsed = true;
    }
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
   * @return CreateCampaignRequestAttributes
   */
  @JsonAnySetter
  public CreateCampaignRequestAttributes putAdditionalProperty(String key, Object value) {
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

  /** Return true if this CreateCampaignRequestAttributes object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateCampaignRequestAttributes createCampaignRequestAttributes =
        (CreateCampaignRequestAttributes) o;
    return Objects.equals(this.description, createCampaignRequestAttributes.description)
        && Objects.equals(this.dueDate, createCampaignRequestAttributes.dueDate)
        && Objects.equals(this.entityScope, createCampaignRequestAttributes.entityScope)
        && Objects.equals(this.guidance, createCampaignRequestAttributes.guidance)
        && Objects.equals(this.key, createCampaignRequestAttributes.key)
        && Objects.equals(this.name, createCampaignRequestAttributes.name)
        && Objects.equals(this.ownerId, createCampaignRequestAttributes.ownerId)
        && Objects.equals(this.ruleIds, createCampaignRequestAttributes.ruleIds)
        && Objects.equals(this.startDate, createCampaignRequestAttributes.startDate)
        && Objects.equals(this.status, createCampaignRequestAttributes.status)
        && Objects.equals(
            this.additionalProperties, createCampaignRequestAttributes.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        description,
        dueDate,
        entityScope,
        guidance,
        key,
        name,
        ownerId,
        ruleIds,
        startDate,
        status,
        additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateCampaignRequestAttributes {\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    dueDate: ").append(toIndentedString(dueDate)).append("\n");
    sb.append("    entityScope: ").append(toIndentedString(entityScope)).append("\n");
    sb.append("    guidance: ").append(toIndentedString(guidance)).append("\n");
    sb.append("    key: ").append(toIndentedString(key)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    ownerId: ").append(toIndentedString(ownerId)).append("\n");
    sb.append("    ruleIds: ").append(toIndentedString(ruleIds)).append("\n");
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
