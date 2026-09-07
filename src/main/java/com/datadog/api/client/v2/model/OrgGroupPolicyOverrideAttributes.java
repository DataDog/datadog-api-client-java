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
import java.util.UUID;

/** Attributes of an org group policy override. */
@JsonPropertyOrder({
  OrgGroupPolicyOverrideAttributes.JSON_PROPERTY_CONTENT,
  OrgGroupPolicyOverrideAttributes.JSON_PROPERTY_CREATED_AT,
  OrgGroupPolicyOverrideAttributes.JSON_PROPERTY_MODIFIED_AT,
  OrgGroupPolicyOverrideAttributes.JSON_PROPERTY_ORG_SITE,
  OrgGroupPolicyOverrideAttributes.JSON_PROPERTY_ORG_UUID
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class OrgGroupPolicyOverrideAttributes {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_CONTENT = "content";
  private Map<String, Object> content = null;

  public static final String JSON_PROPERTY_CREATED_AT = "created_at";
  private OffsetDateTime createdAt;

  public static final String JSON_PROPERTY_MODIFIED_AT = "modified_at";
  private OffsetDateTime modifiedAt;

  public static final String JSON_PROPERTY_ORG_SITE = "org_site";
  private String orgSite;

  public static final String JSON_PROPERTY_ORG_UUID = "org_uuid";
  private UUID orgUuid;

  public OrgGroupPolicyOverrideAttributes() {}

  @JsonCreator
  public OrgGroupPolicyOverrideAttributes(
      @JsonProperty(required = true, value = JSON_PROPERTY_CREATED_AT) OffsetDateTime createdAt,
      @JsonProperty(required = true, value = JSON_PROPERTY_MODIFIED_AT) OffsetDateTime modifiedAt,
      @JsonProperty(required = true, value = JSON_PROPERTY_ORG_SITE) String orgSite,
      @JsonProperty(required = true, value = JSON_PROPERTY_ORG_UUID) UUID orgUuid) {
    this.createdAt = createdAt;
    this.modifiedAt = modifiedAt;
    this.orgSite = orgSite;
    this.orgUuid = orgUuid;
  }

  public OrgGroupPolicyOverrideAttributes content(Map<String, Object> content) {
    this.content = content;
    return this;
  }

  public OrgGroupPolicyOverrideAttributes putContentItem(String key, Object contentItem) {
    if (this.content == null) {
      this.content = new HashMap<>();
    }
    this.content.put(key, contentItem);
    return this;
  }

  /**
   * The override content as key-value pairs.
   *
   * @return content
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CONTENT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Map<String, Object> getContent() {
    return content;
  }

  public void setContent(Map<String, Object> content) {
    this.content = content;
  }

  public OrgGroupPolicyOverrideAttributes createdAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
    return this;
  }

  /**
   * Timestamp when the override was created.
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

  public OrgGroupPolicyOverrideAttributes modifiedAt(OffsetDateTime modifiedAt) {
    this.modifiedAt = modifiedAt;
    return this;
  }

  /**
   * Timestamp when the override was last modified.
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

  public OrgGroupPolicyOverrideAttributes orgSite(String orgSite) {
    this.orgSite = orgSite;
    return this;
  }

  /**
   * The site of the organization that has the override.
   *
   * @return orgSite
   */
  @JsonProperty(JSON_PROPERTY_ORG_SITE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getOrgSite() {
    return orgSite;
  }

  public void setOrgSite(String orgSite) {
    this.orgSite = orgSite;
  }

  public OrgGroupPolicyOverrideAttributes orgUuid(UUID orgUuid) {
    this.orgUuid = orgUuid;
    return this;
  }

  /**
   * The UUID of the organization that has the override.
   *
   * @return orgUuid
   */
  @JsonProperty(JSON_PROPERTY_ORG_UUID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public UUID getOrgUuid() {
    return orgUuid;
  }

  public void setOrgUuid(UUID orgUuid) {
    this.orgUuid = orgUuid;
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
   * @return OrgGroupPolicyOverrideAttributes
   */
  @JsonAnySetter
  public OrgGroupPolicyOverrideAttributes putAdditionalProperty(String key, Object value) {
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

  /** Return true if this OrgGroupPolicyOverrideAttributes object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrgGroupPolicyOverrideAttributes orgGroupPolicyOverrideAttributes =
        (OrgGroupPolicyOverrideAttributes) o;
    return Objects.equals(this.content, orgGroupPolicyOverrideAttributes.content)
        && Objects.equals(this.createdAt, orgGroupPolicyOverrideAttributes.createdAt)
        && Objects.equals(this.modifiedAt, orgGroupPolicyOverrideAttributes.modifiedAt)
        && Objects.equals(this.orgSite, orgGroupPolicyOverrideAttributes.orgSite)
        && Objects.equals(this.orgUuid, orgGroupPolicyOverrideAttributes.orgUuid)
        && Objects.equals(
            this.additionalProperties, orgGroupPolicyOverrideAttributes.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(content, createdAt, modifiedAt, orgSite, orgUuid, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrgGroupPolicyOverrideAttributes {\n");
    sb.append("    content: ").append(toIndentedString(content)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    modifiedAt: ").append(toIndentedString(modifiedAt)).append("\n");
    sb.append("    orgSite: ").append(toIndentedString(orgSite)).append("\n");
    sb.append("    orgUuid: ").append(toIndentedString(orgUuid)).append("\n");
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
