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

/** Database Monitoring usage for a given organization for a given hour. */
@JsonPropertyOrder({
  UsageDBMHour.JSON_PROPERTY_DBM_HOST_COUNT,
  UsageDBMHour.JSON_PROPERTY_DBM_QUERIES_COUNT,
  UsageDBMHour.JSON_PROPERTY_HOUR,
  UsageDBMHour.JSON_PROPERTY_ORG_NAME,
  UsageDBMHour.JSON_PROPERTY_PUBLIC_ID
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class UsageDBMHour {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_DBM_HOST_COUNT = "dbm_host_count";
  private Long dbmHostCount;

  public static final String JSON_PROPERTY_DBM_QUERIES_COUNT = "dbm_queries_count";
  private Long dbmQueriesCount;

  public static final String JSON_PROPERTY_HOUR = "hour";

  @JsonSerialize(using = JsonTimeSerializer.class)
  private OffsetDateTime hour;

  public static final String JSON_PROPERTY_ORG_NAME = "org_name";
  private String orgName;

  public static final String JSON_PROPERTY_PUBLIC_ID = "public_id";
  private String publicId;

  public UsageDBMHour dbmHostCount(Long dbmHostCount) {
    this.dbmHostCount = dbmHostCount;
    return this;
  }

  /**
   * The total number of Database Monitoring host hours from the start of the given hour’s month
   * until the given hour.
   *
   * @return dbmHostCount
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DBM_HOST_COUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getDbmHostCount() {
    return dbmHostCount;
  }

  public void setDbmHostCount(Long dbmHostCount) {
    this.dbmHostCount = dbmHostCount;
  }

  public UsageDBMHour dbmQueriesCount(Long dbmQueriesCount) {
    this.dbmQueriesCount = dbmQueriesCount;
    return this;
  }

  /**
   * The total number of normalized Database Monitoring queries from the start of the given hour’s
   * month until the given hour.
   *
   * @return dbmQueriesCount
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DBM_QUERIES_COUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getDbmQueriesCount() {
    return dbmQueriesCount;
  }

  public void setDbmQueriesCount(Long dbmQueriesCount) {
    this.dbmQueriesCount = dbmQueriesCount;
  }

  public UsageDBMHour hour(OffsetDateTime hour) {
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

  public UsageDBMHour orgName(String orgName) {
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

  public UsageDBMHour publicId(String publicId) {
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

  /** Return true if this UsageDBMHour object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UsageDBMHour usageDbmHour = (UsageDBMHour) o;
    return Objects.equals(this.dbmHostCount, usageDbmHour.dbmHostCount)
        && Objects.equals(this.dbmQueriesCount, usageDbmHour.dbmQueriesCount)
        && Objects.equals(this.hour, usageDbmHour.hour)
        && Objects.equals(this.orgName, usageDbmHour.orgName)
        && Objects.equals(this.publicId, usageDbmHour.publicId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dbmHostCount, dbmQueriesCount, hour, orgName, publicId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UsageDBMHour {\n");
    sb.append("    dbmHostCount: ").append(toIndentedString(dbmHostCount)).append("\n");
    sb.append("    dbmQueriesCount: ").append(toIndentedString(dbmQueriesCount)).append("\n");
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
