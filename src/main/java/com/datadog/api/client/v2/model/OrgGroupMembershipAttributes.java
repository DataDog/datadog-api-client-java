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

/** Attributes of an org group membership. */
@JsonPropertyOrder({
  OrgGroupMembershipAttributes.JSON_PROPERTY_CREATED_AT,
  OrgGroupMembershipAttributes.JSON_PROPERTY_MODIFIED_AT,
  OrgGroupMembershipAttributes.JSON_PROPERTY_ORG_NAME,
  OrgGroupMembershipAttributes.JSON_PROPERTY_ORG_SITE,
  OrgGroupMembershipAttributes.JSON_PROPERTY_ORG_UUID
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class OrgGroupMembershipAttributes {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_CREATED_AT = "created_at";
  private OffsetDateTime createdAt;

  public static final String JSON_PROPERTY_MODIFIED_AT = "modified_at";
  private OffsetDateTime modifiedAt;

  public static final String JSON_PROPERTY_ORG_NAME = "org_name";
  private String orgName;

  public static final String JSON_PROPERTY_ORG_SITE = "org_site";
  private String orgSite;

  public static final String JSON_PROPERTY_ORG_UUID = "org_uuid";
  private UUID orgUuid;

  public OrgGroupMembershipAttributes() {}

  @JsonCreator
  public OrgGroupMembershipAttributes(
      @JsonProperty(required = true, value = JSON_PROPERTY_CREATED_AT) OffsetDateTime createdAt,
      @JsonProperty(required = true, value = JSON_PROPERTY_MODIFIED_AT) OffsetDateTime modifiedAt,
      @JsonProperty(required = true, value = JSON_PROPERTY_ORG_NAME) String orgName,
      @JsonProperty(required = true, value = JSON_PROPERTY_ORG_SITE) String orgSite,
      @JsonProperty(required = true, value = JSON_PROPERTY_ORG_UUID) UUID orgUuid) {
    this.createdAt = createdAt;
    this.modifiedAt = modifiedAt;
    this.orgName = orgName;
    this.orgSite = orgSite;
    this.orgUuid = orgUuid;
  }

  public OrgGroupMembershipAttributes createdAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
    return this;
  }

  /**
   * Timestamp when the membership was created.
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

  public OrgGroupMembershipAttributes modifiedAt(OffsetDateTime modifiedAt) {
    this.modifiedAt = modifiedAt;
    return this;
  }

  /**
   * Timestamp when the membership was last modified.
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

  public OrgGroupMembershipAttributes orgName(String orgName) {
    this.orgName = orgName;
    return this;
  }

  /**
   * The name of the member organization.
   *
   * @return orgName
   */
  @JsonProperty(JSON_PROPERTY_ORG_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getOrgName() {
    return orgName;
  }

  public void setOrgName(String orgName) {
    this.orgName = orgName;
  }

  public OrgGroupMembershipAttributes orgSite(String orgSite) {
    this.orgSite = orgSite;
    return this;
  }

  /**
   * The site of the member organization.
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

  public OrgGroupMembershipAttributes orgUuid(UUID orgUuid) {
    this.orgUuid = orgUuid;
    return this;
  }

  /**
   * The UUID of the member organization.
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
   * @return OrgGroupMembershipAttributes
   */
  @JsonAnySetter
  public OrgGroupMembershipAttributes putAdditionalProperty(String key, Object value) {
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

  /** Return true if this OrgGroupMembershipAttributes object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrgGroupMembershipAttributes orgGroupMembershipAttributes = (OrgGroupMembershipAttributes) o;
    return Objects.equals(this.createdAt, orgGroupMembershipAttributes.createdAt)
        && Objects.equals(this.modifiedAt, orgGroupMembershipAttributes.modifiedAt)
        && Objects.equals(this.orgName, orgGroupMembershipAttributes.orgName)
        && Objects.equals(this.orgSite, orgGroupMembershipAttributes.orgSite)
        && Objects.equals(this.orgUuid, orgGroupMembershipAttributes.orgUuid)
        && Objects.equals(
            this.additionalProperties, orgGroupMembershipAttributes.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(createdAt, modifiedAt, orgName, orgSite, orgUuid, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrgGroupMembershipAttributes {\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    modifiedAt: ").append(toIndentedString(modifiedAt)).append("\n");
    sb.append("    orgName: ").append(toIndentedString(orgName)).append("\n");
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
