/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v1.model;

import com.datadog.api.client.JsonTimeSerializer;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import java.time.OffsetDateTime;
import java.util.Objects;

/** The number of analyzed logs for each hour for a given organization. */
@JsonPropertyOrder({
  UsageAnalyzedLogsHour.JSON_PROPERTY_ANALYZED_LOGS,
  UsageAnalyzedLogsHour.JSON_PROPERTY_HOUR,
  UsageAnalyzedLogsHour.JSON_PROPERTY_ORG_NAME,
  UsageAnalyzedLogsHour.JSON_PROPERTY_PUBLIC_ID
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class UsageAnalyzedLogsHour {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_ANALYZED_LOGS = "analyzed_logs";
  private Long analyzedLogs;

  public static final String JSON_PROPERTY_HOUR = "hour";

  @JsonSerialize(using = JsonTimeSerializer.class)
  private OffsetDateTime hour;

  public static final String JSON_PROPERTY_ORG_NAME = "org_name";
  private String orgName;

  public static final String JSON_PROPERTY_PUBLIC_ID = "public_id";
  private String publicId;

  public UsageAnalyzedLogsHour analyzedLogs(Long analyzedLogs) {
    this.analyzedLogs = analyzedLogs;
    return this;
  }

  /**
   * Contains the number of analyzed logs.
   *
   * @return analyzedLogs
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ANALYZED_LOGS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getAnalyzedLogs() {
    return analyzedLogs;
  }

  public void setAnalyzedLogs(Long analyzedLogs) {
    this.analyzedLogs = analyzedLogs;
  }

  public UsageAnalyzedLogsHour hour(OffsetDateTime hour) {
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

  public UsageAnalyzedLogsHour orgName(String orgName) {
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

  public UsageAnalyzedLogsHour publicId(String publicId) {
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

  /** Return true if this UsageAnalyzedLogsHour object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UsageAnalyzedLogsHour usageAnalyzedLogsHour = (UsageAnalyzedLogsHour) o;
    return Objects.equals(this.analyzedLogs, usageAnalyzedLogsHour.analyzedLogs)
        && Objects.equals(this.hour, usageAnalyzedLogsHour.hour)
        && Objects.equals(this.orgName, usageAnalyzedLogsHour.orgName)
        && Objects.equals(this.publicId, usageAnalyzedLogsHour.publicId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(analyzedLogs, hour, orgName, publicId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UsageAnalyzedLogsHour {\n");
    sb.append("    analyzedLogs: ").append(toIndentedString(analyzedLogs)).append("\n");
    sb.append("    hour: ").append(toIndentedString(hour)).append("\n");
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
