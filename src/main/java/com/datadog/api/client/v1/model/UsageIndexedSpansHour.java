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

/** The hours of indexed spans usage. */
@JsonPropertyOrder({
  UsageIndexedSpansHour.JSON_PROPERTY_HOUR,
  UsageIndexedSpansHour.JSON_PROPERTY_INDEXED_EVENTS_COUNT,
  UsageIndexedSpansHour.JSON_PROPERTY_ORG_NAME,
  UsageIndexedSpansHour.JSON_PROPERTY_PUBLIC_ID
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class UsageIndexedSpansHour {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_HOUR = "hour";

  @JsonSerialize(using = JsonTimeSerializer.class)
  private OffsetDateTime hour;

  public static final String JSON_PROPERTY_INDEXED_EVENTS_COUNT = "indexed_events_count";
  private Long indexedEventsCount;

  public static final String JSON_PROPERTY_ORG_NAME = "org_name";
  private String orgName;

  public static final String JSON_PROPERTY_PUBLIC_ID = "public_id";
  private String publicId;

  public UsageIndexedSpansHour hour(OffsetDateTime hour) {
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

  public UsageIndexedSpansHour indexedEventsCount(Long indexedEventsCount) {
    this.indexedEventsCount = indexedEventsCount;
    return this;
  }

  /**
   * Contains the number of spans indexed.
   *
   * @return indexedEventsCount
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_INDEXED_EVENTS_COUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getIndexedEventsCount() {
    return indexedEventsCount;
  }

  public void setIndexedEventsCount(Long indexedEventsCount) {
    this.indexedEventsCount = indexedEventsCount;
  }

  public UsageIndexedSpansHour orgName(String orgName) {
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

  public UsageIndexedSpansHour publicId(String publicId) {
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

  /** Return true if this UsageIndexedSpansHour object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UsageIndexedSpansHour usageIndexedSpansHour = (UsageIndexedSpansHour) o;
    return Objects.equals(this.hour, usageIndexedSpansHour.hour)
        && Objects.equals(this.indexedEventsCount, usageIndexedSpansHour.indexedEventsCount)
        && Objects.equals(this.orgName, usageIndexedSpansHour.orgName)
        && Objects.equals(this.publicId, usageIndexedSpansHour.publicId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(hour, indexedEventsCount, orgName, publicId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UsageIndexedSpansHour {\n");
    sb.append("    hour: ").append(toIndentedString(hour)).append("\n");
    sb.append("    indexedEventsCount: ").append(toIndentedString(indexedEventsCount)).append("\n");
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
