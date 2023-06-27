/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v1.model;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import org.openapitools.jackson.nullable.JsonNullable;

/** Cloud Workload Security usage for a given organization for a given hour. */
@JsonPropertyOrder({
  UsageCWSHour.JSON_PROPERTY_CWS_CONTAINER_COUNT,
  UsageCWSHour.JSON_PROPERTY_CWS_HOST_COUNT,
  UsageCWSHour.JSON_PROPERTY_HOUR,
  UsageCWSHour.JSON_PROPERTY_ORG_NAME,
  UsageCWSHour.JSON_PROPERTY_PUBLIC_ID
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class UsageCWSHour {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_CWS_CONTAINER_COUNT = "cws_container_count";
  private JsonNullable<Long> cwsContainerCount = JsonNullable.<Long>undefined();

  public static final String JSON_PROPERTY_CWS_HOST_COUNT = "cws_host_count";
  private JsonNullable<Long> cwsHostCount = JsonNullable.<Long>undefined();

  public static final String JSON_PROPERTY_HOUR = "hour";
  private OffsetDateTime hour;

  public static final String JSON_PROPERTY_ORG_NAME = "org_name";
  private String orgName;

  public static final String JSON_PROPERTY_PUBLIC_ID = "public_id";
  private String publicId;

  public UsageCWSHour cwsContainerCount(Long cwsContainerCount) {
    this.cwsContainerCount = JsonNullable.<Long>of(cwsContainerCount);
    return this;
  }

  /**
   * The total number of Cloud Workload Security container hours from the start of the given hour’s
   * month until the given hour.
   *
   * @return cwsContainerCount
   */
  @jakarta.annotation.Nullable
  @JsonIgnore
  public Long getCwsContainerCount() {
    return cwsContainerCount.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_CWS_CONTAINER_COUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<Long> getCwsContainerCount_JsonNullable() {
    return cwsContainerCount;
  }

  @JsonProperty(JSON_PROPERTY_CWS_CONTAINER_COUNT)
  public void setCwsContainerCount_JsonNullable(JsonNullable<Long> cwsContainerCount) {
    this.cwsContainerCount = cwsContainerCount;
  }

  public void setCwsContainerCount(Long cwsContainerCount) {
    this.cwsContainerCount = JsonNullable.<Long>of(cwsContainerCount);
  }

  public UsageCWSHour cwsHostCount(Long cwsHostCount) {
    this.cwsHostCount = JsonNullable.<Long>of(cwsHostCount);
    return this;
  }

  /**
   * The total number of Cloud Workload Security host hours from the start of the given hour’s month
   * until the given hour.
   *
   * @return cwsHostCount
   */
  @jakarta.annotation.Nullable
  @JsonIgnore
  public Long getCwsHostCount() {
    return cwsHostCount.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_CWS_HOST_COUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<Long> getCwsHostCount_JsonNullable() {
    return cwsHostCount;
  }

  @JsonProperty(JSON_PROPERTY_CWS_HOST_COUNT)
  public void setCwsHostCount_JsonNullable(JsonNullable<Long> cwsHostCount) {
    this.cwsHostCount = cwsHostCount;
  }

  public void setCwsHostCount(Long cwsHostCount) {
    this.cwsHostCount = JsonNullable.<Long>of(cwsHostCount);
  }

  public UsageCWSHour hour(OffsetDateTime hour) {
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

  public UsageCWSHour orgName(String orgName) {
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

  public UsageCWSHour publicId(String publicId) {
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
   * @return UsageCWSHour
   */
  @JsonAnySetter
  public UsageCWSHour putAdditionalProperty(String key, Object value) {
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

  /** Return true if this UsageCWSHour object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UsageCWSHour usageCwsHour = (UsageCWSHour) o;
    return Objects.equals(this.cwsContainerCount, usageCwsHour.cwsContainerCount)
        && Objects.equals(this.cwsHostCount, usageCwsHour.cwsHostCount)
        && Objects.equals(this.hour, usageCwsHour.hour)
        && Objects.equals(this.orgName, usageCwsHour.orgName)
        && Objects.equals(this.publicId, usageCwsHour.publicId)
        && Objects.equals(this.additionalProperties, usageCwsHour.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        cwsContainerCount, cwsHostCount, hour, orgName, publicId, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UsageCWSHour {\n");
    sb.append("    cwsContainerCount: ").append(toIndentedString(cwsContainerCount)).append("\n");
    sb.append("    cwsHostCount: ").append(toIndentedString(cwsHostCount)).append("\n");
    sb.append("    hour: ").append(toIndentedString(hour)).append("\n");
    sb.append("    orgName: ").append(toIndentedString(orgName)).append("\n");
    sb.append("    publicId: ").append(toIndentedString(publicId)).append("\n");
    sb.append("    additionalProperties: ")
        .append(toIndentedString(additionalProperties))
        .append("\n");
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
