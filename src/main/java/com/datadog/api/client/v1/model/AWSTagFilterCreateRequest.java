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
   * <p>The objects used to set an AWS tag filter.</p>
 */
@JsonPropertyOrder({
  AWSTagFilterCreateRequest.JSON_PROPERTY_ACCOUNT_ID,
  AWSTagFilterCreateRequest.JSON_PROPERTY_NAMESPACE,
  AWSTagFilterCreateRequest.JSON_PROPERTY_TAG_FILTER_STR
})
@jakarta.annotation.Generated(value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class AWSTagFilterCreateRequest {
  @JsonIgnore
  public boolean unparsed = false;
  public static final String JSON_PROPERTY_ACCOUNT_ID = "account_id";
  private String accountId;

  public static final String JSON_PROPERTY_NAMESPACE = "namespace";
  private AWSNamespace namespace;

  public static final String JSON_PROPERTY_TAG_FILTER_STR = "tag_filter_str";
  private String tagFilterStr;

  public AWSTagFilterCreateRequest accountId(String accountId) {
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
  public AWSTagFilterCreateRequest namespace(AWSNamespace namespace) {
    this.namespace = namespace;
    this.unparsed |= !namespace.isValid();
    return this;
  }

  /**
   * <p>The namespace associated with the tag filter entry.</p>
   * @return namespace
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_NAMESPACE)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public AWSNamespace getNamespace() {
        return namespace;
      }
  public void setNamespace(AWSNamespace namespace) {
    if (!namespace.isValid()) {
        this.unparsed = true;
    }
    this.namespace = namespace;
  }
  public AWSTagFilterCreateRequest tagFilterStr(String tagFilterStr) {
    this.tagFilterStr = tagFilterStr;
    return this;
  }

  /**
   * <p>The tag filter string.</p>
   * @return tagFilterStr
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_TAG_FILTER_STR)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public String getTagFilterStr() {
        return tagFilterStr;
      }
  public void setTagFilterStr(String tagFilterStr) {
    this.tagFilterStr = tagFilterStr;
  }

  /**
   * Return true if this AWSTagFilterCreateRequest object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AWSTagFilterCreateRequest awsTagFilterCreateRequest = (AWSTagFilterCreateRequest) o;
    return Objects.equals(this.accountId, awsTagFilterCreateRequest.accountId) && Objects.equals(this.namespace, awsTagFilterCreateRequest.namespace) && Objects.equals(this.tagFilterStr, awsTagFilterCreateRequest.tagFilterStr);
  }


  @Override
  public int hashCode() {
    return Objects.hash(accountId,namespace,tagFilterStr);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AWSTagFilterCreateRequest {\n");
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    namespace: ").append(toIndentedString(namespace)).append("\n");
    sb.append("    tagFilterStr: ").append(toIndentedString(tagFilterStr)).append("\n");
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
