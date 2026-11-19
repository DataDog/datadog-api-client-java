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

/** Stored HCP Terraform persona mapping attributes. */
@JsonPropertyOrder({
  TerraformCloudAuthPersonaMappingAttributesResponse.JSON_PROPERTY_ACCOUNT_IDENTIFIER,
  TerraformCloudAuthPersonaMappingAttributesResponse.JSON_PROPERTY_ACCOUNT_UUID,
  TerraformCloudAuthPersonaMappingAttributesResponse.JSON_PROPERTY_AUDIENCE,
  TerraformCloudAuthPersonaMappingAttributesResponse.JSON_PROPERTY_ISSUER_URL,
  TerraformCloudAuthPersonaMappingAttributesResponse.JSON_PROPERTY_SUB_PATTERN
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class TerraformCloudAuthPersonaMappingAttributesResponse {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_ACCOUNT_IDENTIFIER = "account_identifier";
  private String accountIdentifier;

  public static final String JSON_PROPERTY_ACCOUNT_UUID = "account_uuid";
  private String accountUuid;

  public static final String JSON_PROPERTY_AUDIENCE = "audience";
  private String audience;

  public static final String JSON_PROPERTY_ISSUER_URL = "issuer_url";
  private String issuerUrl;

  public static final String JSON_PROPERTY_SUB_PATTERN = "sub_pattern";
  private String subPattern;

  public TerraformCloudAuthPersonaMappingAttributesResponse() {}

  @JsonCreator
  public TerraformCloudAuthPersonaMappingAttributesResponse(
      @JsonProperty(required = true, value = JSON_PROPERTY_ACCOUNT_IDENTIFIER)
          String accountIdentifier,
      @JsonProperty(required = true, value = JSON_PROPERTY_ACCOUNT_UUID) String accountUuid,
      @JsonProperty(required = true, value = JSON_PROPERTY_SUB_PATTERN) String subPattern) {
    this.accountIdentifier = accountIdentifier;
    this.accountUuid = accountUuid;
    this.subPattern = subPattern;
  }

  public TerraformCloudAuthPersonaMappingAttributesResponse accountIdentifier(
      String accountIdentifier) {
    this.accountIdentifier = accountIdentifier;
    return this;
  }

  /**
   * Handle of the mapped Datadog account, resolved when the mapping was created.
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

  public TerraformCloudAuthPersonaMappingAttributesResponse accountUuid(String accountUuid) {
    this.accountUuid = accountUuid;
    return this;
  }

  /**
   * UUID of the mapped Datadog user or service account.
   *
   * @return accountUuid
   */
  @JsonProperty(JSON_PROPERTY_ACCOUNT_UUID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getAccountUuid() {
    return accountUuid;
  }

  public void setAccountUuid(String accountUuid) {
    this.accountUuid = accountUuid;
  }

  /**
   * Audience to set as the <code>TFC_WORKLOAD_IDENTITY_AUDIENCE_DATADOG</code> environment variable
   * in HCP Terraform. Datadog computes this value as <code>datadog/&lt;organization UUID&gt;</code>
   * .
   *
   * @return audience
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_AUDIENCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getAudience() {
    return audience;
  }

  public TerraformCloudAuthPersonaMappingAttributesResponse issuerUrl(String issuerUrl) {
    this.issuerUrl = issuerUrl;
    return this;
  }

  /**
   * HCP Terraform workload identity token issuer. Empty for mappings created before the issuer was
   * required.
   *
   * @return issuerUrl
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ISSUER_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getIssuerUrl() {
    return issuerUrl;
  }

  public void setIssuerUrl(String issuerUrl) {
    this.issuerUrl = issuerUrl;
  }

  public TerraformCloudAuthPersonaMappingAttributesResponse subPattern(String subPattern) {
    this.subPattern = subPattern;
    return this;
  }

  /**
   * Pattern matched against the <code>sub</code> claim of HCP Terraform workload identity tokens.
   *
   * @return subPattern
   */
  @JsonProperty(JSON_PROPERTY_SUB_PATTERN)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getSubPattern() {
    return subPattern;
  }

  public void setSubPattern(String subPattern) {
    this.subPattern = subPattern;
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
   * @return TerraformCloudAuthPersonaMappingAttributesResponse
   */
  @JsonAnySetter
  public TerraformCloudAuthPersonaMappingAttributesResponse putAdditionalProperty(
      String key, Object value) {
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
   * Return true if this TerraformCloudAuthPersonaMappingAttributesResponse object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TerraformCloudAuthPersonaMappingAttributesResponse
        terraformCloudAuthPersonaMappingAttributesResponse =
            (TerraformCloudAuthPersonaMappingAttributesResponse) o;
    return Objects.equals(
            this.accountIdentifier,
            terraformCloudAuthPersonaMappingAttributesResponse.accountIdentifier)
        && Objects.equals(
            this.accountUuid, terraformCloudAuthPersonaMappingAttributesResponse.accountUuid)
        && Objects.equals(
            this.audience, terraformCloudAuthPersonaMappingAttributesResponse.audience)
        && Objects.equals(
            this.issuerUrl, terraformCloudAuthPersonaMappingAttributesResponse.issuerUrl)
        && Objects.equals(
            this.subPattern, terraformCloudAuthPersonaMappingAttributesResponse.subPattern)
        && Objects.equals(
            this.additionalProperties,
            terraformCloudAuthPersonaMappingAttributesResponse.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        accountIdentifier, accountUuid, audience, issuerUrl, subPattern, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TerraformCloudAuthPersonaMappingAttributesResponse {\n");
    sb.append("    accountIdentifier: ").append(toIndentedString(accountIdentifier)).append("\n");
    sb.append("    accountUuid: ").append(toIndentedString(accountUuid)).append("\n");
    sb.append("    audience: ").append(toIndentedString(audience)).append("\n");
    sb.append("    issuerUrl: ").append(toIndentedString(issuerUrl)).append("\n");
    sb.append("    subPattern: ").append(toIndentedString(subPattern)).append("\n");
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
