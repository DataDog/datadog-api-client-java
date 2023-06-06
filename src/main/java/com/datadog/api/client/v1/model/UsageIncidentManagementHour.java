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
import java.time.OffsetDateTime;
import java.util.Objects;
import org.openapitools.jackson.nullable.JsonNullable;

/** Incident management usage for a given organization for a given hour. */
@JsonPropertyOrder({
  UsageIncidentManagementHour.JSON_PROPERTY_HOUR,
  UsageIncidentManagementHour.JSON_PROPERTY_MONTHLY_ACTIVE_USERS,
  UsageIncidentManagementHour.JSON_PROPERTY_ORG_NAME,
  UsageIncidentManagementHour.JSON_PROPERTY_PUBLIC_ID
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class UsageIncidentManagementHour {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_HOUR = "hour";
  private OffsetDateTime hour;

  public static final String JSON_PROPERTY_MONTHLY_ACTIVE_USERS = "monthly_active_users";
  private JsonNullable<Long> monthlyActiveUsers = JsonNullable.<Long>undefined();

  public static final String JSON_PROPERTY_ORG_NAME = "org_name";
  private String orgName;

  public static final String JSON_PROPERTY_PUBLIC_ID = "public_id";
  private String publicId;

  public UsageIncidentManagementHour hour(OffsetDateTime hour) {
    this.hour = hour;
    return this;
  }

  /**
   * The hour for the usage.
   *
   * @return hour
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_HOUR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public OffsetDateTime getHour() {
    return hour;
  }

  public void setHour(OffsetDateTime hour) {
    this.hour = hour;
  }

  public UsageIncidentManagementHour monthlyActiveUsers(Long monthlyActiveUsers) {
    this.monthlyActiveUsers = JsonNullable.<Long>of(monthlyActiveUsers);
    return this;
  }

  /**
   * Contains the total number monthly active users from the start of the given hour's month until
   * the given hour.
   *
   * @return monthlyActiveUsers
   */
  @jakarta.annotation.Nullable
  @JsonIgnore
  public Long getMonthlyActiveUsers() {
    return monthlyActiveUsers.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_MONTHLY_ACTIVE_USERS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<Long> getMonthlyActiveUsers_JsonNullable() {
    return monthlyActiveUsers;
  }

  @JsonProperty(JSON_PROPERTY_MONTHLY_ACTIVE_USERS)
  public void setMonthlyActiveUsers_JsonNullable(JsonNullable<Long> monthlyActiveUsers) {
    this.monthlyActiveUsers = monthlyActiveUsers;
  }

  public void setMonthlyActiveUsers(Long monthlyActiveUsers) {
    this.monthlyActiveUsers = JsonNullable.<Long>of(monthlyActiveUsers);
  }

  public UsageIncidentManagementHour orgName(String orgName) {
    this.orgName = orgName;
    return this;
  }

  /**
   * The organization name.
   *
   * @return orgName
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ORG_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getOrgName() {
    return orgName;
  }

  public void setOrgName(String orgName) {
    this.orgName = orgName;
  }

  public UsageIncidentManagementHour publicId(String publicId) {
    this.publicId = publicId;
    return this;
  }

  /**
   * The organization public ID.
   *
   * @return publicId
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PUBLIC_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getPublicId() {
    return publicId;
  }

  public void setPublicId(String publicId) {
    this.publicId = publicId;
  }

  /** Return true if this UsageIncidentManagementHour object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UsageIncidentManagementHour usageIncidentManagementHour = (UsageIncidentManagementHour) o;
    return Objects.equals(this.hour, usageIncidentManagementHour.hour)
        && Objects.equals(this.monthlyActiveUsers, usageIncidentManagementHour.monthlyActiveUsers)
        && Objects.equals(this.orgName, usageIncidentManagementHour.orgName)
        && Objects.equals(this.publicId, usageIncidentManagementHour.publicId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(hour, monthlyActiveUsers, orgName, publicId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UsageIncidentManagementHour {\n");
    sb.append("    hour: ").append(toIndentedString(hour)).append("\n");
    sb.append("    monthlyActiveUsers: ").append(toIndentedString(monthlyActiveUsers)).append("\n");
    sb.append("    orgName: ").append(toIndentedString(orgName)).append("\n");
    sb.append("    publicId: ").append(toIndentedString(publicId)).append("\n");
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
