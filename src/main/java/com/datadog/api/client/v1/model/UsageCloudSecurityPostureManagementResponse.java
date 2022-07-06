/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v1.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * The response containing the Cloud Security Posture Management usage for each hour for a given
 * organization.
 */
@JsonPropertyOrder({UsageCloudSecurityPostureManagementResponse.JSON_PROPERTY_USAGE})
@javax.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class UsageCloudSecurityPostureManagementResponse {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_USAGE = "usage";
  private List<UsageCloudSecurityPostureManagementHour> usage = null;

  public UsageCloudSecurityPostureManagementResponse usage(
      List<UsageCloudSecurityPostureManagementHour> usage) {
    this.usage = usage;
    for (UsageCloudSecurityPostureManagementHour item : usage) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }

  public UsageCloudSecurityPostureManagementResponse addUsageItem(
      UsageCloudSecurityPostureManagementHour usageItem) {
    if (this.usage == null) {
      this.usage = new ArrayList<>();
    }
    this.usage.add(usageItem);
    this.unparsed |= usageItem.unparsed;
    return this;
  }

  /**
   * Get hourly usage for Cloud Security Posture Management.
   *
   * @return usage
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_USAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<UsageCloudSecurityPostureManagementHour> getUsage() {
    return usage;
  }

  public void setUsage(List<UsageCloudSecurityPostureManagementHour> usage) {
    this.usage = usage;
  }

  /** Return true if this UsageCloudSecurityPostureManagementResponse object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UsageCloudSecurityPostureManagementResponse usageCloudSecurityPostureManagementResponse =
        (UsageCloudSecurityPostureManagementResponse) o;
    return Objects.equals(this.usage, usageCloudSecurityPostureManagementResponse.usage);
  }

  @Override
  public int hashCode() {
    return Objects.hash(usage);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UsageCloudSecurityPostureManagementResponse {\n");
    sb.append("    usage: ").append(toIndentedString(usage)).append("\n");
    sb.append("}");
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
