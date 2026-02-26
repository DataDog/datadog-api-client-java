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
import java.util.UUID;
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
   * <p>AWS account ID and Lambda ARN.</p>
 */
@JsonPropertyOrder({
  AWSAccountAndLambdaRequest.JSON_PROPERTY_ACCOUNT_ID,
  AWSAccountAndLambdaRequest.JSON_PROPERTY_LAMBDA_ARN
})
@jakarta.annotation.Generated(value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class AWSAccountAndLambdaRequest {
  @JsonIgnore
  public boolean unparsed = false;
  public static final String JSON_PROPERTY_ACCOUNT_ID = "account_id";
  private String accountId;

  public static final String JSON_PROPERTY_LAMBDA_ARN = "lambda_arn";
  private String lambdaArn;

  public AWSAccountAndLambdaRequest() {}

  @JsonCreator
  public AWSAccountAndLambdaRequest(
            @JsonProperty(required=true, value=JSON_PROPERTY_ACCOUNT_ID)String accountId,
            @JsonProperty(required=true, value=JSON_PROPERTY_LAMBDA_ARN)String lambdaArn) {
        this.accountId = accountId;
        this.lambdaArn = lambdaArn;
  }
  public AWSAccountAndLambdaRequest accountId(String accountId) {
    this.accountId = accountId;
    return this;
  }

  /**
   * <p>Your AWS Account ID without dashes.</p>
   * @return accountId
  **/
      @JsonProperty(JSON_PROPERTY_ACCOUNT_ID)
      @JsonInclude(
        value = JsonInclude.Include.ALWAYS)
      public String getAccountId() {
        return accountId;
      }
  public void setAccountId(String accountId) {
    this.accountId = accountId;
  }
  public AWSAccountAndLambdaRequest lambdaArn(String lambdaArn) {
    this.lambdaArn = lambdaArn;
    return this;
  }

  /**
   * <p>ARN of the Datadog Lambda created during the Datadog-Amazon Web services Log collection setup.</p>
   * @return lambdaArn
  **/
      @JsonProperty(JSON_PROPERTY_LAMBDA_ARN)
      @JsonInclude(
        value = JsonInclude.Include.ALWAYS)
      public String getLambdaArn() {
        return lambdaArn;
      }
  public void setLambdaArn(String lambdaArn) {
    this.lambdaArn = lambdaArn;
  }

  /**
   * A container for additional, undeclared properties.
   * This is a holder for any undeclared properties as specified with
   * the 'additionalProperties' keyword in the OAS document.
   */
  private Map<String, Object> additionalProperties;

  /**
   * Set the additional (undeclared) property with the specified name and value.
   * If the property does not already exist, create it otherwise replace it.
   *
   * @param key The arbitrary key to set
   * @param value The associated value
   * @return AWSAccountAndLambdaRequest
   */
  @JsonAnySetter
  public AWSAccountAndLambdaRequest putAdditionalProperty(String key, Object value) {
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

  /**
   * Return true if this AWSAccountAndLambdaRequest object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AWSAccountAndLambdaRequest awsAccountAndLambdaRequest = (AWSAccountAndLambdaRequest) o;
    return Objects.equals(this.accountId, awsAccountAndLambdaRequest.accountId) && Objects.equals(this.lambdaArn, awsAccountAndLambdaRequest.lambdaArn) && Objects.equals(this.additionalProperties, awsAccountAndLambdaRequest.additionalProperties);
  }


  @Override
  public int hashCode() {
    return Objects.hash(accountId,lambdaArn, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AWSAccountAndLambdaRequest {\n");
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    lambdaArn: ").append(toIndentedString(lambdaArn)).append("\n");
    sb.append("    additionalProperties: ")
        .append(toIndentedString(additionalProperties))
        .append("\n");
    sb.append('}');
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
