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

/** Number of Synthetics API tests run for each hour for a given organization. */
@JsonPropertyOrder({
  UsageSyntheticsAPIHour.JSON_PROPERTY_CHECK_CALLS_COUNT,
  UsageSyntheticsAPIHour.JSON_PROPERTY_HOUR,
  UsageSyntheticsAPIHour.JSON_PROPERTY_ORG_NAME,
  UsageSyntheticsAPIHour.JSON_PROPERTY_PUBLIC_ID
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class UsageSyntheticsAPIHour {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_CHECK_CALLS_COUNT = "check_calls_count";
  private JsonNullable<Long> checkCallsCount = JsonNullable.<Long>undefined();

  public static final String JSON_PROPERTY_HOUR = "hour";
  private OffsetDateTime hour;

  public static final String JSON_PROPERTY_ORG_NAME = "org_name";
  private String orgName;

  public static final String JSON_PROPERTY_PUBLIC_ID = "public_id";
  private String publicId;

  public UsageSyntheticsAPIHour checkCallsCount(Long checkCallsCount) {
    this.checkCallsCount = JsonNullable.<Long>of(checkCallsCount);
    return this;
  }

  /**
   * Contains the number of Synthetics API tests run.
   *
   * @return checkCallsCount
   */
  @jakarta.annotation.Nullable
  @JsonIgnore
  public Long getCheckCallsCount() {
    return checkCallsCount.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_CHECK_CALLS_COUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<Long> getCheckCallsCount_JsonNullable() {
    return checkCallsCount;
  }

  @JsonProperty(JSON_PROPERTY_CHECK_CALLS_COUNT)
  public void setCheckCallsCount_JsonNullable(JsonNullable<Long> checkCallsCount) {
    this.checkCallsCount = checkCallsCount;
  }

  public void setCheckCallsCount(Long checkCallsCount) {
    this.checkCallsCount = JsonNullable.<Long>of(checkCallsCount);
  }

  public UsageSyntheticsAPIHour hour(OffsetDateTime hour) {
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

  public UsageSyntheticsAPIHour orgName(String orgName) {
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

  public UsageSyntheticsAPIHour publicId(String publicId) {
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
   * @return UsageSyntheticsAPIHour
   */
  @JsonAnySetter
  public UsageSyntheticsAPIHour putAdditionalProperty(String key, Object value) {
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

  /** Return true if this UsageSyntheticsAPIHour object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UsageSyntheticsAPIHour usageSyntheticsApiHour = (UsageSyntheticsAPIHour) o;
    return Objects.equals(this.checkCallsCount, usageSyntheticsApiHour.checkCallsCount)
        && Objects.equals(this.hour, usageSyntheticsApiHour.hour)
        && Objects.equals(this.orgName, usageSyntheticsApiHour.orgName)
        && Objects.equals(this.publicId, usageSyntheticsApiHour.publicId)
        && Objects.equals(this.additionalProperties, usageSyntheticsApiHour.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(checkCallsCount, hour, orgName, publicId, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UsageSyntheticsAPIHour {\n");
    sb.append("    checkCallsCount: ").append(toIndentedString(checkCallsCount)).append("\n");
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
