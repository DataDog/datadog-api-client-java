/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v2.model;

import java.io.File;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;
import java.util.HashMap;
import java.util.Map;
import java.util.List;
import java.util.ArrayList;
import java.util.UUID;
import java.time.OffsetDateTime;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import org.openapitools.jackson.nullable.JsonNullable;

import com.datadog.api.client.JsonTimeSerializer;


/**

 */
@JsonPropertyOrder({
  HamrOrgConnectionAttributesRequest.JSON_PROPERTY_HAMR_STATUS,
  HamrOrgConnectionAttributesRequest.JSON_PROPERTY_IS_PRIMARY,
  HamrOrgConnectionAttributesRequest.JSON_PROPERTY_MODIFIED_BY,
  HamrOrgConnectionAttributesRequest.JSON_PROPERTY_TARGET_ORG_DATACENTER,
  HamrOrgConnectionAttributesRequest.JSON_PROPERTY_TARGET_ORG_NAME,
  HamrOrgConnectionAttributesRequest.JSON_PROPERTY_TARGET_ORG_UUID
})
@jakarta.annotation.Generated(value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class HamrOrgConnectionAttributesRequest {
  @JsonIgnore
  public boolean unparsed = false;
  public static final String JSON_PROPERTY_HAMR_STATUS = "hamr_status";
  private HamrOrgConnectionStatus hamrStatus;

  public static final String JSON_PROPERTY_IS_PRIMARY = "is_primary";
  private Boolean isPrimary;

  public static final String JSON_PROPERTY_MODIFIED_BY = "modified_by";
  private String modifiedBy;

  public static final String JSON_PROPERTY_TARGET_ORG_DATACENTER = "target_org_datacenter";
  private String targetOrgDatacenter;

  public static final String JSON_PROPERTY_TARGET_ORG_NAME = "target_org_name";
  private String targetOrgName;

  public static final String JSON_PROPERTY_TARGET_ORG_UUID = "target_org_uuid";
  private String targetOrgUuid;

  public HamrOrgConnectionAttributesRequest() {}

  @JsonCreator
  public HamrOrgConnectionAttributesRequest(
            @JsonProperty(required=true, value=JSON_PROPERTY_HAMR_STATUS)HamrOrgConnectionStatus hamrStatus,
            @JsonProperty(required=true, value=JSON_PROPERTY_IS_PRIMARY)Boolean isPrimary,
            @JsonProperty(required=true, value=JSON_PROPERTY_MODIFIED_BY)String modifiedBy,
            @JsonProperty(required=true, value=JSON_PROPERTY_TARGET_ORG_DATACENTER)String targetOrgDatacenter,
            @JsonProperty(required=true, value=JSON_PROPERTY_TARGET_ORG_NAME)String targetOrgName,
            @JsonProperty(required=true, value=JSON_PROPERTY_TARGET_ORG_UUID)String targetOrgUuid) {
        this.hamrStatus = hamrStatus;
        this.unparsed |= !hamrStatus.isValid();
        this.isPrimary = isPrimary;
        this.modifiedBy = modifiedBy;
        this.targetOrgDatacenter = targetOrgDatacenter;
        this.targetOrgName = targetOrgName;
        this.targetOrgUuid = targetOrgUuid;
  }
  public HamrOrgConnectionAttributesRequest hamrStatus(HamrOrgConnectionStatus hamrStatus) {
    this.hamrStatus = hamrStatus;
    this.unparsed |= !hamrStatus.isValid();
    return this;
  }

  /**
   * <p>Status of the HAMR connection:
   * - 0: UNSPECIFIED - Connection status not specified
   * - 1: ONBOARDING - Initial setup of HAMR connection
   * - 2: PASSIVE - Secondary organization in passive standby mode
   * - 3: FAILOVER - Liminal status between PASSIVE and ACTIVE
   * - 4: ACTIVE - Organization is an active failover
   * - 5: RECOVERY - Recovery operation in progress</p>
   * @return hamrStatus
  **/
      @JsonProperty(JSON_PROPERTY_HAMR_STATUS)
      @JsonInclude(
        value = JsonInclude.Include.ALWAYS)
      public HamrOrgConnectionStatus getHamrStatus() {
        return hamrStatus;
      }
  public void setHamrStatus(HamrOrgConnectionStatus hamrStatus) {
    if (!hamrStatus.isValid()) {
        this.unparsed = true;
    }
    this.hamrStatus = hamrStatus;
  }
  public HamrOrgConnectionAttributesRequest isPrimary(Boolean isPrimary) {
    this.isPrimary = isPrimary;
    return this;
  }

  /**
   * <p>Indicates whether this organization is the primary organization in the HAMR relationship.
   * If true, this is the primary organization. If false, this is the secondary/backup organization.</p>
   * @return isPrimary
  **/
      @JsonProperty(JSON_PROPERTY_IS_PRIMARY)
      @JsonInclude(
        value = JsonInclude.Include.ALWAYS)
      public Boolean getIsPrimary() {
        return isPrimary;
      }
  public void setIsPrimary(Boolean isPrimary) {
    this.isPrimary = isPrimary;
  }
  public HamrOrgConnectionAttributesRequest modifiedBy(String modifiedBy) {
    this.modifiedBy = modifiedBy;
    return this;
  }

  /**
   * <p>Username or identifier of the user who last modified this HAMR connection.</p>
   * @return modifiedBy
  **/
      @JsonProperty(JSON_PROPERTY_MODIFIED_BY)
      @JsonInclude(
        value = JsonInclude.Include.ALWAYS)
      public String getModifiedBy() {
        return modifiedBy;
      }
  public void setModifiedBy(String modifiedBy) {
    this.modifiedBy = modifiedBy;
  }
  public HamrOrgConnectionAttributesRequest targetOrgDatacenter(String targetOrgDatacenter) {
    this.targetOrgDatacenter = targetOrgDatacenter;
    return this;
  }

  /**
   * <p>Datacenter location of the target organization (e.g., us1, eu1, us5).</p>
   * @return targetOrgDatacenter
  **/
      @JsonProperty(JSON_PROPERTY_TARGET_ORG_DATACENTER)
      @JsonInclude(
        value = JsonInclude.Include.ALWAYS)
      public String getTargetOrgDatacenter() {
        return targetOrgDatacenter;
      }
  public void setTargetOrgDatacenter(String targetOrgDatacenter) {
    this.targetOrgDatacenter = targetOrgDatacenter;
  }
  public HamrOrgConnectionAttributesRequest targetOrgName(String targetOrgName) {
    this.targetOrgName = targetOrgName;
    return this;
  }

  /**
   * <p>Name of the target organization in the HAMR relationship.</p>
   * @return targetOrgName
  **/
      @JsonProperty(JSON_PROPERTY_TARGET_ORG_NAME)
      @JsonInclude(
        value = JsonInclude.Include.ALWAYS)
      public String getTargetOrgName() {
        return targetOrgName;
      }
  public void setTargetOrgName(String targetOrgName) {
    this.targetOrgName = targetOrgName;
  }
  public HamrOrgConnectionAttributesRequest targetOrgUuid(String targetOrgUuid) {
    this.targetOrgUuid = targetOrgUuid;
    return this;
  }

  /**
   * <p>UUID of the target organization in the HAMR relationship.</p>
   * @return targetOrgUuid
  **/
      @JsonProperty(JSON_PROPERTY_TARGET_ORG_UUID)
      @JsonInclude(
        value = JsonInclude.Include.ALWAYS)
      public String getTargetOrgUuid() {
        return targetOrgUuid;
      }
  public void setTargetOrgUuid(String targetOrgUuid) {
    this.targetOrgUuid = targetOrgUuid;
  }

  /**
   * A container for additional, undeclared properties.
   * This is a holder for any undeclared properties as specified with
   * the 'additionalProperties' keyword in the OAS document.
   */
  private Map<String, Object> additionalProperties;

  /**
   * Set the additional (undeclared) property with the specified name and value.
   * If the property does not already exist, create it otherwise replace it.
   *
   * @param key The arbitrary key to set
   * @param value The associated value
   * @return HamrOrgConnectionAttributesRequest
   */
  @JsonAnySetter
  public HamrOrgConnectionAttributesRequest putAdditionalProperty(String key, Object value) {
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
   * Return true if this HamrOrgConnectionAttributesRequest object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    HamrOrgConnectionAttributesRequest hamrOrgConnectionAttributesRequest = (HamrOrgConnectionAttributesRequest) o;
    return Objects.equals(this.hamrStatus, hamrOrgConnectionAttributesRequest.hamrStatus) && Objects.equals(this.isPrimary, hamrOrgConnectionAttributesRequest.isPrimary) && Objects.equals(this.modifiedBy, hamrOrgConnectionAttributesRequest.modifiedBy) && Objects.equals(this.targetOrgDatacenter, hamrOrgConnectionAttributesRequest.targetOrgDatacenter) && Objects.equals(this.targetOrgName, hamrOrgConnectionAttributesRequest.targetOrgName) && Objects.equals(this.targetOrgUuid, hamrOrgConnectionAttributesRequest.targetOrgUuid) && Objects.equals(this.additionalProperties, hamrOrgConnectionAttributesRequest.additionalProperties);
  }


  @Override
  public int hashCode() {
    return Objects.hash(hamrStatus,isPrimary,modifiedBy,targetOrgDatacenter,targetOrgName,targetOrgUuid, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HamrOrgConnectionAttributesRequest {\n");
    sb.append("    hamrStatus: ").append(toIndentedString(hamrStatus)).append("\n");
    sb.append("    isPrimary: ").append(toIndentedString(isPrimary)).append("\n");
    sb.append("    modifiedBy: ").append(toIndentedString(modifiedBy)).append("\n");
    sb.append("    targetOrgDatacenter: ").append(toIndentedString(targetOrgDatacenter)).append("\n");
    sb.append("    targetOrgName: ").append(toIndentedString(targetOrgName)).append("\n");
    sb.append("    targetOrgUuid: ").append(toIndentedString(targetOrgUuid)).append("\n");
    sb.append("    additionalProperties: ")
        .append(toIndentedString(additionalProperties))
        .append("\n");
    sb.append('}');
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
