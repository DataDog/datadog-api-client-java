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

/**
 * An image or package to upgrade, for a group of host and container vulnerabilities (<code>
 * cloudvm.image_update</code>). The group gathers the open vulnerabilities of running production
 * images that have a fix available, and groups them by <code>grouping_location</code>, <code>
 * remediation_kind</code>, and <code>action</code>.
 */
@JsonPropertyOrder({
  RemediationGroupImageUpdate.JSON_PROPERTY_ACTION,
  RemediationGroupImageUpdate.JSON_PROPERTY_ADVISORY_COUNT,
  RemediationGroupImageUpdate.JSON_PROPERTY_EXPLOITABLE_CVE_COUNT,
  RemediationGroupImageUpdate.JSON_PROPERTY_FILE_COUNT,
  RemediationGroupImageUpdate.JSON_PROPERTY_GROUPING_LOCATION,
  RemediationGroupImageUpdate.JSON_PROPERTY_LOCATION_IS_FILENAME,
  RemediationGroupImageUpdate.JSON_PROPERTY_REMEDIATION_KIND,
  RemediationGroupImageUpdate.JSON_PROPERTY_TARGET_VERSION
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class RemediationGroupImageUpdate {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_ACTION = "action";
  private String action;

  public static final String JSON_PROPERTY_ADVISORY_COUNT = "advisory_count";
  private Long advisoryCount;

  public static final String JSON_PROPERTY_EXPLOITABLE_CVE_COUNT = "exploitable_cve_count";
  private Long exploitableCveCount;

  public static final String JSON_PROPERTY_FILE_COUNT = "file_count";
  private Long fileCount;

  public static final String JSON_PROPERTY_GROUPING_LOCATION = "grouping_location";
  private String groupingLocation;

  public static final String JSON_PROPERTY_LOCATION_IS_FILENAME = "location_is_filename";
  private Boolean locationIsFilename;

  public static final String JSON_PROPERTY_REMEDIATION_KIND = "remediation_kind";
  private String remediationKind;

  public static final String JSON_PROPERTY_TARGET_VERSION = "target_version";
  private String targetVersion;

  public RemediationGroupImageUpdate() {}

  @JsonCreator
  public RemediationGroupImageUpdate(
      @JsonProperty(required = true, value = JSON_PROPERTY_ACTION) String action,
      @JsonProperty(required = true, value = JSON_PROPERTY_ADVISORY_COUNT) Long advisoryCount,
      @JsonProperty(required = true, value = JSON_PROPERTY_EXPLOITABLE_CVE_COUNT)
          Long exploitableCveCount,
      @JsonProperty(required = true, value = JSON_PROPERTY_FILE_COUNT) Long fileCount,
      @JsonProperty(required = true, value = JSON_PROPERTY_GROUPING_LOCATION)
          String groupingLocation,
      @JsonProperty(required = true, value = JSON_PROPERTY_LOCATION_IS_FILENAME)
          Boolean locationIsFilename,
      @JsonProperty(required = true, value = JSON_PROPERTY_REMEDIATION_KIND)
          String remediationKind) {
    this.action = action;
    this.advisoryCount = advisoryCount;
    this.exploitableCveCount = exploitableCveCount;
    this.fileCount = fileCount;
    this.groupingLocation = groupingLocation;
    this.locationIsFilename = locationIsFilename;
    this.remediationKind = remediationKind;
  }

  public RemediationGroupImageUpdate action(String action) {
    this.action = action;
    return this;
  }

  /**
   * Name of the container image, base image, or package to upgrade. The value comes from the first
   * of these attributes that the findings have: <code>
   * @remediation.container_image.latest_major.name</code>, <code>
   * @remediation.base_image.latest_major.name</code>, or <code>@remediation.recommended.name</code>
   * .
   *
   * @return action
   */
  @JsonProperty(JSON_PROPERTY_ACTION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getAction() {
    return action;
  }

  public void setAction(String action) {
    this.action = action;
  }

  public RemediationGroupImageUpdate advisoryCount(Long advisoryCount) {
    this.advisoryCount = advisoryCount;
    return this;
  }

  /**
   * Number of distinct values of <code>@advisory.id</code> across the group's findings.
   *
   * @return advisoryCount
   */
  @JsonProperty(JSON_PROPERTY_ADVISORY_COUNT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Long getAdvisoryCount() {
    return advisoryCount;
  }

  public void setAdvisoryCount(Long advisoryCount) {
    this.advisoryCount = advisoryCount;
  }

  public RemediationGroupImageUpdate exploitableCveCount(Long exploitableCveCount) {
    this.exploitableCveCount = exploitableCveCount;
    return this;
  }

  /**
   * Number of distinct values of <code>@advisory.id</code> across the group's findings that have
   * <code>@risk.has_exploit_available</code> set to <code>true</code>.
   *
   * @return exploitableCveCount
   */
  @JsonProperty(JSON_PROPERTY_EXPLOITABLE_CVE_COUNT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Long getExploitableCveCount() {
    return exploitableCveCount;
  }

  public void setExploitableCveCount(Long exploitableCveCount) {
    this.exploitableCveCount = exploitableCveCount;
  }

  public RemediationGroupImageUpdate fileCount(Long fileCount) {
    this.fileCount = fileCount;
    return this;
  }

  /**
   * Number of distinct values of <code>@code_location.filename</code> across the group's findings.
   *
   * @return fileCount
   */
  @JsonProperty(JSON_PROPERTY_FILE_COUNT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Long getFileCount() {
    return fileCount;
  }

  public void setFileCount(Long fileCount) {
    this.fileCount = fileCount;
  }

  public RemediationGroupImageUpdate groupingLocation(String groupingLocation) {
    this.groupingLocation = groupingLocation;
    return this;
  }

  /**
   * File that contains the findings, from their <code>@code_location.filename</code> attribute.
   * When no file is known, the value is the findings' <code>@container_image.name</code>.
   *
   * @return groupingLocation
   */
  @JsonProperty(JSON_PROPERTY_GROUPING_LOCATION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getGroupingLocation() {
    return groupingLocation;
  }

  public void setGroupingLocation(String groupingLocation) {
    this.groupingLocation = groupingLocation;
  }

  public RemediationGroupImageUpdate locationIsFilename(Boolean locationIsFilename) {
    this.locationIsFilename = locationIsFilename;
    return this;
  }

  /**
   * Whether <code>grouping_location</code> is a <code>@code_location.filename</code> rather than a
   * <code>@container_image.name</code>.
   *
   * @return locationIsFilename
   */
  @JsonProperty(JSON_PROPERTY_LOCATION_IS_FILENAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Boolean getLocationIsFilename() {
    return locationIsFilename;
  }

  public void setLocationIsFilename(Boolean locationIsFilename) {
    this.locationIsFilename = locationIsFilename;
  }

  public RemediationGroupImageUpdate remediationKind(String remediationKind) {
    this.remediationKind = remediationKind;
    return this;
  }

  /**
   * Kind of upgrade: <code>image_update</code> when the findings have a <code>
   * @remediation.container_image.latest_major.name</code>, <code>base_image_bump</code> when they
   * have <code>@vulnerability.is_inherited_from_base_image</code> set to <code>true</code>, and
   * <code>package_update</code> otherwise.
   *
   * @return remediationKind
   */
  @JsonProperty(JSON_PROPERTY_REMEDIATION_KIND)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getRemediationKind() {
    return remediationKind;
  }

  public void setRemediationKind(String remediationKind) {
    this.remediationKind = remediationKind;
  }

  public RemediationGroupImageUpdate targetVersion(String targetVersion) {
    this.targetVersion = targetVersion;
    return this;
  }

  /**
   * Version to upgrade to: the <code>@remediation.container_image.latest_major.tag</code> or <code>
   * @remediation.base_image.latest_major.tag</code> of the image in <code>action</code>, or else
   * the highest <code>@remediation.recommended.version</code> across the group's findings. Omitted
   * when no version is recommended or when the recommended versions can't be ordered.
   *
   * @return targetVersion
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TARGET_VERSION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getTargetVersion() {
    return targetVersion;
  }

  public void setTargetVersion(String targetVersion) {
    this.targetVersion = targetVersion;
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
   * @return RemediationGroupImageUpdate
   */
  @JsonAnySetter
  public RemediationGroupImageUpdate putAdditionalProperty(String key, Object value) {
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

  /** Return true if this RemediationGroupImageUpdate object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RemediationGroupImageUpdate remediationGroupImageUpdate = (RemediationGroupImageUpdate) o;
    return Objects.equals(this.action, remediationGroupImageUpdate.action)
        && Objects.equals(this.advisoryCount, remediationGroupImageUpdate.advisoryCount)
        && Objects.equals(this.exploitableCveCount, remediationGroupImageUpdate.exploitableCveCount)
        && Objects.equals(this.fileCount, remediationGroupImageUpdate.fileCount)
        && Objects.equals(this.groupingLocation, remediationGroupImageUpdate.groupingLocation)
        && Objects.equals(this.locationIsFilename, remediationGroupImageUpdate.locationIsFilename)
        && Objects.equals(this.remediationKind, remediationGroupImageUpdate.remediationKind)
        && Objects.equals(this.targetVersion, remediationGroupImageUpdate.targetVersion)
        && Objects.equals(
            this.additionalProperties, remediationGroupImageUpdate.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        action,
        advisoryCount,
        exploitableCveCount,
        fileCount,
        groupingLocation,
        locationIsFilename,
        remediationKind,
        targetVersion,
        additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RemediationGroupImageUpdate {\n");
    sb.append("    action: ").append(toIndentedString(action)).append("\n");
    sb.append("    advisoryCount: ").append(toIndentedString(advisoryCount)).append("\n");
    sb.append("    exploitableCveCount: ")
        .append(toIndentedString(exploitableCveCount))
        .append("\n");
    sb.append("    fileCount: ").append(toIndentedString(fileCount)).append("\n");
    sb.append("    groupingLocation: ").append(toIndentedString(groupingLocation)).append("\n");
    sb.append("    locationIsFilename: ").append(toIndentedString(locationIsFilename)).append("\n");
    sb.append("    remediationKind: ").append(toIndentedString(remediationKind)).append("\n");
    sb.append("    targetVersion: ").append(toIndentedString(targetVersion)).append("\n");
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
