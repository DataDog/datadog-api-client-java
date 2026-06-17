/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v2.model;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.UUID;

/** Attributes of an AWS WIF persona mapping. */
@JsonPropertyOrder({
  AwsWifPersonaMappingAttributes.JSON_PROPERTY_ACCOUNT_IDENTIFIER,
  AwsWifPersonaMappingAttributes.JSON_PROPERTY_ACCOUNT_UUID,
  AwsWifPersonaMappingAttributes.JSON_PROPERTY_ARN_PATTERN
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class AwsWifPersonaMappingAttributes {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_ACCOUNT_IDENTIFIER = "account_identifier";
  private String accountIdentifier;

  public static final String JSON_PROPERTY_ACCOUNT_UUID = "account_uuid";
  private UUID accountUuid;

  public static final String JSON_PROPERTY_ARN_PATTERN = "arn_pattern";
  private String arnPattern;

  public AwsWifPersonaMappingAttributes() {}

  @JsonCreator
  public AwsWifPersonaMappingAttributes(
      @JsonProperty(required = true, value = JSON_PROPERTY_ACCOUNT_IDENTIFIER)
          String accountIdentifier,
      @JsonProperty(required = true, value = JSON_PROPERTY_ARN_PATTERN) String arnPattern) {
    this.accountIdentifier = accountIdentifier;
    this.arnPattern = arnPattern;
  }

  public AwsWifPersonaMappingAttributes accountIdentifier(String accountIdentifier) {
    this.accountIdentifier = accountIdentifier;
    return this;
  }

  /**
   * The Datadog user handle (email address) to map the AWS principal to.
   *
   * @return accountIdentifier
   */
  @JsonProperty(JSON_PROPERTY_ACCOUNT_IDENTIFIER)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getAccountIdentifier() {
    return accountIdentifier;
  }

  public void setAccountIdentifier(String accountIdentifier) {
    this.accountIdentifier = accountIdentifier;
  }

  public AwsWifPersonaMappingAttributes accountUuid(UUID accountUuid) {
    this.accountUuid = accountUuid;
    return this;
  }

  /**
   * The Datadog user UUID corresponding to <code>account_identifier</code>. Read-only — set by the
   * server.
   *
   * @return accountUuid
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ACCOUNT_UUID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public UUID getAccountUuid() {
    return accountUuid;
  }

  public void setAccountUuid(UUID accountUuid) {
    this.accountUuid = accountUuid;
  }

  public AwsWifPersonaMappingAttributes arnPattern(String arnPattern) {
    this.arnPattern = arnPattern;
    return this;
  }

  /**
   * The AWS IAM ARN pattern identifying the role or user that will be mapped. Supports wildcards (
   * <code>*</code>) to match multiple principals within an account.
   *
   * @return arnPattern
   */
  @JsonProperty(JSON_PROPERTY_ARN_PATTERN)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getArnPattern() {
    return arnPattern;
  }

  public void setArnPattern(String arnPattern) {
    this.arnPattern = arnPattern;
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
   * @return AwsWifPersonaMappingAttributes
   */
  @JsonAnySetter
  public AwsWifPersonaMappingAttributes putAdditionalProperty(String key, Object value) {
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

  /** Return true if this AwsWifPersonaMappingAttributes object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AwsWifPersonaMappingAttributes awsWifPersonaMappingAttributes =
        (AwsWifPersonaMappingAttributes) o;
    return Objects.equals(this.accountIdentifier, awsWifPersonaMappingAttributes.accountIdentifier)
        && Objects.equals(this.accountUuid, awsWifPersonaMappingAttributes.accountUuid)
        && Objects.equals(this.arnPattern, awsWifPersonaMappingAttributes.arnPattern)
        && Objects.equals(
            this.additionalProperties, awsWifPersonaMappingAttributes.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountIdentifier, accountUuid, arnPattern, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AwsWifPersonaMappingAttributes {\n");
    sb.append("    accountIdentifier: ").append(toIndentedString(accountIdentifier)).append("\n");
    sb.append("    accountUuid: ").append(toIndentedString(accountUuid)).append("\n");
    sb.append("    arnPattern: ").append(toIndentedString(arnPattern)).append("\n");
    sb.append("    additionalProperties: ")
        .append(toIndentedString(additionalProperties))
        .append("\n");
    sb.append('}');
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
