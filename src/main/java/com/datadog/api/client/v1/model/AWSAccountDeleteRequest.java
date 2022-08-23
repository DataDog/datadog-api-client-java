/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v1.model;

import java.io.File;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;
import java.util.HashMap;
import java.util.Map;
import java.util.List;
import java.util.ArrayList;
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
   * <p>List of AWS accounts to delete.</p>
 */
@JsonPropertyOrder({
  AWSAccountDeleteRequest.JSON_PROPERTY_ACCESS_KEY_ID,
  AWSAccountDeleteRequest.JSON_PROPERTY_ACCOUNT_ID,
  AWSAccountDeleteRequest.JSON_PROPERTY_ROLE_NAME
})
@jakarta.annotation.Generated(value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class AWSAccountDeleteRequest {
  @JsonIgnore
  public boolean unparsed = false;
  public static final String JSON_PROPERTY_ACCESS_KEY_ID = "access_key_id";
  private String accessKeyId;

  public static final String JSON_PROPERTY_ACCOUNT_ID = "account_id";
  private String accountId;

  public static final String JSON_PROPERTY_ROLE_NAME = "role_name";
  private String roleName;

  public AWSAccountDeleteRequest accessKeyId(String accessKeyId) {
    this.accessKeyId = accessKeyId;
    return this;
  }

  /**
   * <p>Your AWS access key ID. Only required if your AWS account is a GovCloud or China account.</p>
   * @return accessKeyId
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_ACCESS_KEY_ID)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public String getAccessKeyId() {
        return accessKeyId;
      }
  public void setAccessKeyId(String accessKeyId) {
    this.accessKeyId = accessKeyId;
  }
  public AWSAccountDeleteRequest accountId(String accountId) {
    this.accountId = accountId;
    return this;
  }

  /**
   * <p>Your AWS Account ID without dashes.</p>
   * @return accountId
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_ACCOUNT_ID)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public String getAccountId() {
        return accountId;
      }
  public void setAccountId(String accountId) {
    this.accountId = accountId;
  }
  public AWSAccountDeleteRequest roleName(String roleName) {
    this.roleName = roleName;
    return this;
  }

  /**
   * <p>Your Datadog role delegation name.</p>
   * @return roleName
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_ROLE_NAME)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public String getRoleName() {
        return roleName;
      }
  public void setRoleName(String roleName) {
    this.roleName = roleName;
  }

  /**
   * Return true if this AWSAccountDeleteRequest object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AWSAccountDeleteRequest awsAccountDeleteRequest = (AWSAccountDeleteRequest) o;
    return Objects.equals(this.accessKeyId, awsAccountDeleteRequest.accessKeyId) && Objects.equals(this.accountId, awsAccountDeleteRequest.accountId) && Objects.equals(this.roleName, awsAccountDeleteRequest.roleName);
  }


  @Override
  public int hashCode() {
    return Objects.hash(accessKeyId,accountId,roleName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AWSAccountDeleteRequest {\n");
    sb.append("    accessKeyId: ").append(toIndentedString(accessKeyId)).append("\n");
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    roleName: ").append(toIndentedString(roleName)).append("\n");
    sb.append("}");
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
