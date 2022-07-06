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

/**
 * Number of lambda functions and sum of the invocations of all lambda functions for each hour for a
 * given organization.
 */
@JsonPropertyOrder({
  UsageLambdaHour.JSON_PROPERTY_FUNC_COUNT,
  UsageLambdaHour.JSON_PROPERTY_HOUR,
  UsageLambdaHour.JSON_PROPERTY_INVOCATIONS_SUM,
  UsageLambdaHour.JSON_PROPERTY_ORG_NAME,
  UsageLambdaHour.JSON_PROPERTY_PUBLIC_ID
})
@javax.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class UsageLambdaHour {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_FUNC_COUNT = "func_count";
  private Long funcCount;

  public static final String JSON_PROPERTY_HOUR = "hour";

  @JsonSerialize(using = JsonTimeSerializer.class)
  private OffsetDateTime hour;

  public static final String JSON_PROPERTY_INVOCATIONS_SUM = "invocations_sum";
  private Long invocationsSum;

  public static final String JSON_PROPERTY_ORG_NAME = "org_name";
  private String orgName;

  public static final String JSON_PROPERTY_PUBLIC_ID = "public_id";
  private String publicId;

  public UsageLambdaHour funcCount(Long funcCount) {
    this.funcCount = funcCount;
    return this;
  }

  /**
   * Contains the number of different functions for each region and AWS account.
   *
   * @return funcCount
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_FUNC_COUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getFuncCount() {
    return funcCount;
  }

  public void setFuncCount(Long funcCount) {
    this.funcCount = funcCount;
  }

  public UsageLambdaHour hour(OffsetDateTime hour) {
    this.hour = hour;
    return this;
  }

  /**
   * The hour for the usage.
   *
   * @return hour
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_HOUR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public OffsetDateTime getHour() {
    return hour;
  }

  public void setHour(OffsetDateTime hour) {
    this.hour = hour;
  }

  public UsageLambdaHour invocationsSum(Long invocationsSum) {
    this.invocationsSum = invocationsSum;
    return this;
  }

  /**
   * Contains the sum of invocations of all functions.
   *
   * @return invocationsSum
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_INVOCATIONS_SUM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getInvocationsSum() {
    return invocationsSum;
  }

  public void setInvocationsSum(Long invocationsSum) {
    this.invocationsSum = invocationsSum;
  }

  public UsageLambdaHour orgName(String orgName) {
    this.orgName = orgName;
    return this;
  }

  /**
   * The organization name.
   *
   * @return orgName
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ORG_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getOrgName() {
    return orgName;
  }

  public void setOrgName(String orgName) {
    this.orgName = orgName;
  }

  public UsageLambdaHour publicId(String publicId) {
    this.publicId = publicId;
    return this;
  }

  /**
   * The organization public ID.
   *
   * @return publicId
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PUBLIC_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getPublicId() {
    return publicId;
  }

  public void setPublicId(String publicId) {
    this.publicId = publicId;
  }

  /** Return true if this UsageLambdaHour object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UsageLambdaHour usageLambdaHour = (UsageLambdaHour) o;
    return Objects.equals(this.funcCount, usageLambdaHour.funcCount)
        && Objects.equals(this.hour, usageLambdaHour.hour)
        && Objects.equals(this.invocationsSum, usageLambdaHour.invocationsSum)
        && Objects.equals(this.orgName, usageLambdaHour.orgName)
        && Objects.equals(this.publicId, usageLambdaHour.publicId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(funcCount, hour, invocationsSum, orgName, publicId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UsageLambdaHour {\n");
    sb.append("    funcCount: ").append(toIndentedString(funcCount)).append("\n");
    sb.append("    hour: ").append(toIndentedString(hour)).append("\n");
    sb.append("    invocationsSum: ").append(toIndentedString(invocationsSum)).append("\n");
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
