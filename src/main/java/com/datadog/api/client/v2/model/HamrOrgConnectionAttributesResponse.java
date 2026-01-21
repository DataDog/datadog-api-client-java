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

/** */
@JsonPropertyOrder({
  HamrOrgConnectionAttributesResponse.JSON_PROPERTY_HAMR_STATUS,
  HamrOrgConnectionAttributesResponse.JSON_PROPERTY_IS_PRIMARY,
  HamrOrgConnectionAttributesResponse.JSON_PROPERTY_MODIFIED_AT,
  HamrOrgConnectionAttributesResponse.JSON_PROPERTY_MODIFIED_BY,
  HamrOrgConnectionAttributesResponse.JSON_PROPERTY_TARGET_ORG_DATACENTER,
  HamrOrgConnectionAttributesResponse.JSON_PROPERTY_TARGET_ORG_NAME,
  HamrOrgConnectionAttributesResponse.JSON_PROPERTY_TARGET_ORG_UUID
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class HamrOrgConnectionAttributesResponse {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_HAMR_STATUS = "hamr_status";
  private HamrOrgConnectionStatus hamrStatus;

  public static final String JSON_PROPERTY_IS_PRIMARY = "is_primary";
  private Boolean isPrimary;

  public static final String JSON_PROPERTY_MODIFIED_AT = "modified_at";
  private String modifiedAt;

  public static final String JSON_PROPERTY_MODIFIED_BY = "modified_by";
  private String modifiedBy;

  public static final String JSON_PROPERTY_TARGET_ORG_DATACENTER = "target_org_datacenter";
  private String targetOrgDatacenter;

  public static final String JSON_PROPERTY_TARGET_ORG_NAME = "target_org_name";
  private String targetOrgName;

  public static final String JSON_PROPERTY_TARGET_ORG_UUID = "target_org_uuid";
  private String targetOrgUuid;

  public HamrOrgConnectionAttributesResponse() {}

  @JsonCreator
  public HamrOrgConnectionAttributesResponse(
      @JsonProperty(required = true, value = JSON_PROPERTY_HAMR_STATUS)
          HamrOrgConnectionStatus hamrStatus,
      @JsonProperty(required = true, value = JSON_PROPERTY_IS_PRIMARY) Boolean isPrimary,
      @JsonProperty(required = true, value = JSON_PROPERTY_MODIFIED_AT) String modifiedAt,
      @JsonProperty(required = true, value = JSON_PROPERTY_MODIFIED_BY) String modifiedBy,
      @JsonProperty(required = true, value = JSON_PROPERTY_TARGET_ORG_DATACENTER)
          String targetOrgDatacenter,
      @JsonProperty(required = true, value = JSON_PROPERTY_TARGET_ORG_NAME) String targetOrgName,
      @JsonProperty(required = true, value = JSON_PROPERTY_TARGET_ORG_UUID) String targetOrgUuid) {
    this.hamrStatus = hamrStatus;
    this.unparsed |= !hamrStatus.isValid();
    this.isPrimary = isPrimary;
    this.modifiedAt = modifiedAt;
    this.modifiedBy = modifiedBy;
    this.targetOrgDatacenter = targetOrgDatacenter;
    this.targetOrgName = targetOrgName;
    this.targetOrgUuid = targetOrgUuid;
  }

  public HamrOrgConnectionAttributesResponse hamrStatus(HamrOrgConnectionStatus hamrStatus) {
    this.hamrStatus = hamrStatus;
    this.unparsed |= !hamrStatus.isValid();
    return this;
  }

  /**
   * Status of the HAMR connection: - 0: UNSPECIFIED - Connection status not specified - 1:
   * ONBOARDING - Initial setup of HAMR connection - 2: PASSIVE - Secondary organization in passive
   * standby mode - 3: FAILOVER - Liminal status between PASSIVE and ACTIVE - 4: ACTIVE -
   * Organization is an active failover - 5: RECOVERY - Recovery operation in progress
   *
   * @return hamrStatus
   */
  @JsonProperty(JSON_PROPERTY_HAMR_STATUS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public HamrOrgConnectionStatus getHamrStatus() {
    return hamrStatus;
  }

  public void setHamrStatus(HamrOrgConnectionStatus hamrStatus) {
    if (!hamrStatus.isValid()) {
      this.unparsed = true;
    }
    this.hamrStatus = hamrStatus;
  }

  public HamrOrgConnectionAttributesResponse isPrimary(Boolean isPrimary) {
    this.isPrimary = isPrimary;
    return this;
  }

  /**
   * Indicates whether this organization is the primary organization in the HAMR relationship. If
   * true, this is the primary organization. If false, this is the secondary/backup organization.
   *
   * @return isPrimary
   */
  @JsonProperty(JSON_PROPERTY_IS_PRIMARY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Boolean getIsPrimary() {
    return isPrimary;
  }

  public void setIsPrimary(Boolean isPrimary) {
    this.isPrimary = isPrimary;
  }

  public HamrOrgConnectionAttributesResponse modifiedAt(String modifiedAt) {
    this.modifiedAt = modifiedAt;
    return this;
  }

  /**
   * Timestamp of when this HAMR connection was last modified (RFC3339 format).
   *
   * @return modifiedAt
   */
  @JsonProperty(JSON_PROPERTY_MODIFIED_AT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getModifiedAt() {
    return modifiedAt;
  }

  public void setModifiedAt(String modifiedAt) {
    this.modifiedAt = modifiedAt;
  }

  public HamrOrgConnectionAttributesResponse modifiedBy(String modifiedBy) {
    this.modifiedBy = modifiedBy;
    return this;
  }

  /**
   * Username or identifier of the user who last modified this HAMR connection.
   *
   * @return modifiedBy
   */
  @JsonProperty(JSON_PROPERTY_MODIFIED_BY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getModifiedBy() {
    return modifiedBy;
  }

  public void setModifiedBy(String modifiedBy) {
    this.modifiedBy = modifiedBy;
  }

  public HamrOrgConnectionAttributesResponse targetOrgDatacenter(String targetOrgDatacenter) {
    this.targetOrgDatacenter = targetOrgDatacenter;
    return this;
  }

  /**
   * Datacenter location of the target organization (e.g., us1, eu1, us5).
   *
   * @return targetOrgDatacenter
   */
  @JsonProperty(JSON_PROPERTY_TARGET_ORG_DATACENTER)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getTargetOrgDatacenter() {
    return targetOrgDatacenter;
  }

  public void setTargetOrgDatacenter(String targetOrgDatacenter) {
    this.targetOrgDatacenter = targetOrgDatacenter;
  }

  public HamrOrgConnectionAttributesResponse targetOrgName(String targetOrgName) {
    this.targetOrgName = targetOrgName;
    return this;
  }

  /**
   * Name of the target organization in the HAMR relationship.
   *
   * @return targetOrgName
   */
  @JsonProperty(JSON_PROPERTY_TARGET_ORG_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getTargetOrgName() {
    return targetOrgName;
  }

  public void setTargetOrgName(String targetOrgName) {
    this.targetOrgName = targetOrgName;
  }

  public HamrOrgConnectionAttributesResponse targetOrgUuid(String targetOrgUuid) {
    this.targetOrgUuid = targetOrgUuid;
    return this;
  }

  /**
   * UUID of the target organization in the HAMR relationship.
   *
   * @return targetOrgUuid
   */
  @JsonProperty(JSON_PROPERTY_TARGET_ORG_UUID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getTargetOrgUuid() {
    return targetOrgUuid;
  }

  public void setTargetOrgUuid(String targetOrgUuid) {
    this.targetOrgUuid = targetOrgUuid;
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
   * @return HamrOrgConnectionAttributesResponse
   */
  @JsonAnySetter
  public HamrOrgConnectionAttributesResponse putAdditionalProperty(String key, Object value) {
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

  /** Return true if this HamrOrgConnectionAttributesResponse object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    HamrOrgConnectionAttributesResponse hamrOrgConnectionAttributesResponse =
        (HamrOrgConnectionAttributesResponse) o;
    return Objects.equals(this.hamrStatus, hamrOrgConnectionAttributesResponse.hamrStatus)
        && Objects.equals(this.isPrimary, hamrOrgConnectionAttributesResponse.isPrimary)
        && Objects.equals(this.modifiedAt, hamrOrgConnectionAttributesResponse.modifiedAt)
        && Objects.equals(this.modifiedBy, hamrOrgConnectionAttributesResponse.modifiedBy)
        && Objects.equals(
            this.targetOrgDatacenter, hamrOrgConnectionAttributesResponse.targetOrgDatacenter)
        && Objects.equals(this.targetOrgName, hamrOrgConnectionAttributesResponse.targetOrgName)
        && Objects.equals(this.targetOrgUuid, hamrOrgConnectionAttributesResponse.targetOrgUuid)
        && Objects.equals(
            this.additionalProperties, hamrOrgConnectionAttributesResponse.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        hamrStatus,
        isPrimary,
        modifiedAt,
        modifiedBy,
        targetOrgDatacenter,
        targetOrgName,
        targetOrgUuid,
        additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HamrOrgConnectionAttributesResponse {\n");
    sb.append("    hamrStatus: ").append(toIndentedString(hamrStatus)).append("\n");
    sb.append("    isPrimary: ").append(toIndentedString(isPrimary)).append("\n");
    sb.append("    modifiedAt: ").append(toIndentedString(modifiedAt)).append("\n");
    sb.append("    modifiedBy: ").append(toIndentedString(modifiedBy)).append("\n");
    sb.append("    targetOrgDatacenter: ")
        .append(toIndentedString(targetOrgDatacenter))
        .append("\n");
    sb.append("    targetOrgName: ").append(toIndentedString(targetOrgName)).append("\n");
    sb.append("    targetOrgUuid: ").append(toIndentedString(targetOrgUuid)).append("\n");
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
