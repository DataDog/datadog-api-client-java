/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import java.util.Objects;

/** Attributes for creating an HCP Terraform persona mapping. */
@JsonPropertyOrder({
  TerraformCloudAuthPersonaMappingCreateAttributes.JSON_PROPERTY_ACCOUNT_IDENTIFIER,
  TerraformCloudAuthPersonaMappingCreateAttributes.JSON_PROPERTY_ISSUER_URL,
  TerraformCloudAuthPersonaMappingCreateAttributes.JSON_PROPERTY_SUB_PATTERN
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class TerraformCloudAuthPersonaMappingCreateAttributes {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_ACCOUNT_IDENTIFIER = "account_identifier";
  private String accountIdentifier;

  public static final String JSON_PROPERTY_ISSUER_URL = "issuer_url";
  private TerraformCloudAuthIssuerURL issuerUrl;

  public static final String JSON_PROPERTY_SUB_PATTERN = "sub_pattern";
  private String subPattern;

  public TerraformCloudAuthPersonaMappingCreateAttributes() {}

  @JsonCreator
  public TerraformCloudAuthPersonaMappingCreateAttributes(
      @JsonProperty(required = true, value = JSON_PROPERTY_ACCOUNT_IDENTIFIER)
          String accountIdentifier,
      @JsonProperty(required = true, value = JSON_PROPERTY_ISSUER_URL)
          TerraformCloudAuthIssuerURL issuerUrl,
      @JsonProperty(required = true, value = JSON_PROPERTY_SUB_PATTERN) String subPattern) {
    this.accountIdentifier = accountIdentifier;
    this.issuerUrl = issuerUrl;
    this.unparsed |= !issuerUrl.isValid();
    this.subPattern = subPattern;
  }

  public TerraformCloudAuthPersonaMappingCreateAttributes accountIdentifier(
      String accountIdentifier) {
    this.accountIdentifier = accountIdentifier;
    return this;
  }

  /**
   * Handle or email address of the Datadog user or service account that matching tokens
   * authenticate as. Its permissions must not exceed the caller's.
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

  public TerraformCloudAuthPersonaMappingCreateAttributes issuerUrl(
      TerraformCloudAuthIssuerURL issuerUrl) {
    this.issuerUrl = issuerUrl;
    this.unparsed |= !issuerUrl.isValid();
    return this;
  }

  /**
   * HCP Terraform workload identity token issuer. Use <code>https://app.terraform.io</code> for HCP
   * Terraform in the US or <code>https://app.eu.terraform.io</code> for HCP Terraform in Europe.
   *
   * @return issuerUrl
   */
  @JsonProperty(JSON_PROPERTY_ISSUER_URL)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public TerraformCloudAuthIssuerURL getIssuerUrl() {
    return issuerUrl;
  }

  public void setIssuerUrl(TerraformCloudAuthIssuerURL issuerUrl) {
    if (!issuerUrl.isValid()) {
      this.unparsed = true;
    }
    this.issuerUrl = issuerUrl;
  }

  public TerraformCloudAuthPersonaMappingCreateAttributes subPattern(String subPattern) {
    this.subPattern = subPattern;
    return this;
  }

  /**
   * Pattern matched against the <code>sub</code> claim of HCP Terraform workload identity tokens.
   * Use <code>
   * organization:&lt;org&gt;:project:&lt;project&gt;:workspace:&lt;workspace&gt;:run_phase:&lt;plan|apply&gt;
   * </code> for workspace runs, or <code>
   * organization:&lt;org&gt;:module:&lt;module&gt;:operation:test_run</code> for module test runs.
   * Segments are HCP Terraform names, not IDs. Any segment except the organization can be <code>*
   * </code> to match any value.
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

  /** Return true if this TerraformCloudAuthPersonaMappingCreateAttributes object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TerraformCloudAuthPersonaMappingCreateAttributes
        terraformCloudAuthPersonaMappingCreateAttributes =
            (TerraformCloudAuthPersonaMappingCreateAttributes) o;
    return Objects.equals(
            this.accountIdentifier,
            terraformCloudAuthPersonaMappingCreateAttributes.accountIdentifier)
        && Objects.equals(
            this.issuerUrl, terraformCloudAuthPersonaMappingCreateAttributes.issuerUrl)
        && Objects.equals(
            this.subPattern, terraformCloudAuthPersonaMappingCreateAttributes.subPattern);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountIdentifier, issuerUrl, subPattern);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TerraformCloudAuthPersonaMappingCreateAttributes {\n");
    sb.append("    accountIdentifier: ").append(toIndentedString(accountIdentifier)).append("\n");
    sb.append("    issuerUrl: ").append(toIndentedString(issuerUrl)).append("\n");
    sb.append("    subPattern: ").append(toIndentedString(subPattern)).append("\n");
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
