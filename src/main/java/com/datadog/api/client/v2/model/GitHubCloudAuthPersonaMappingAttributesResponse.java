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

/** Attributes for GitHub cloud authentication persona mapping response. */
@JsonPropertyOrder({
  GitHubCloudAuthPersonaMappingAttributesResponse.JSON_PROPERTY_ACCOUNT_IDENTIFIER,
  GitHubCloudAuthPersonaMappingAttributesResponse.JSON_PROPERTY_ACCOUNT_UUID,
  GitHubCloudAuthPersonaMappingAttributesResponse.JSON_PROPERTY_CLAIM_MATCHERS
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class GitHubCloudAuthPersonaMappingAttributesResponse {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_ACCOUNT_IDENTIFIER = "account_identifier";
  private String accountIdentifier;

  public static final String JSON_PROPERTY_ACCOUNT_UUID = "account_uuid";
  private String accountUuid;

  public static final String JSON_PROPERTY_CLAIM_MATCHERS = "claim_matchers";
  private GitHubOIDCClaimPatterns claimMatchers;

  public GitHubCloudAuthPersonaMappingAttributesResponse() {}

  @JsonCreator
  public GitHubCloudAuthPersonaMappingAttributesResponse(
      @JsonProperty(required = true, value = JSON_PROPERTY_ACCOUNT_IDENTIFIER)
          String accountIdentifier,
      @JsonProperty(required = true, value = JSON_PROPERTY_ACCOUNT_UUID) String accountUuid,
      @JsonProperty(required = true, value = JSON_PROPERTY_CLAIM_MATCHERS)
          GitHubOIDCClaimPatterns claimMatchers) {
    this.accountIdentifier = accountIdentifier;
    this.accountUuid = accountUuid;
    this.claimMatchers = claimMatchers;
    this.unparsed |= claimMatchers.unparsed;
  }

  public GitHubCloudAuthPersonaMappingAttributesResponse accountIdentifier(
      String accountIdentifier) {
    this.accountIdentifier = accountIdentifier;
    return this;
  }

  /**
   * Datadog account identifier (email or handle) mapped to the GitHub principal.
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

  public GitHubCloudAuthPersonaMappingAttributesResponse accountUuid(String accountUuid) {
    this.accountUuid = accountUuid;
    return this;
  }

  /**
   * Datadog account UUID.
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

  public GitHubCloudAuthPersonaMappingAttributesResponse claimMatchers(
      GitHubOIDCClaimPatterns claimMatchers) {
    this.claimMatchers = claimMatchers;
    this.unparsed |= claimMatchers.unparsed;
    return this;
  }

  /**
   * GitHub Actions OIDC claims to match against. Each field is a regular expression. The <code>sub
   * </code> claim is required; all other claims are optional. A token matches only when all
   * provided patterns match simultaneously (AND semantics).
   *
   * @return claimMatchers
   */
  @JsonProperty(JSON_PROPERTY_CLAIM_MATCHERS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public GitHubOIDCClaimPatterns getClaimMatchers() {
    return claimMatchers;
  }

  public void setClaimMatchers(GitHubOIDCClaimPatterns claimMatchers) {
    this.claimMatchers = claimMatchers;
    if (claimMatchers != null) {
      this.unparsed |= claimMatchers.unparsed;
    }
  }

  /** Return true if this GitHubCloudAuthPersonaMappingAttributesResponse object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GitHubCloudAuthPersonaMappingAttributesResponse
        gitHubCloudAuthPersonaMappingAttributesResponse =
            (GitHubCloudAuthPersonaMappingAttributesResponse) o;
    return Objects.equals(
            this.accountIdentifier,
            gitHubCloudAuthPersonaMappingAttributesResponse.accountIdentifier)
        && Objects.equals(
            this.accountUuid, gitHubCloudAuthPersonaMappingAttributesResponse.accountUuid)
        && Objects.equals(
            this.claimMatchers, gitHubCloudAuthPersonaMappingAttributesResponse.claimMatchers);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountIdentifier, accountUuid, claimMatchers);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GitHubCloudAuthPersonaMappingAttributesResponse {\n");
    sb.append("    accountIdentifier: ").append(toIndentedString(accountIdentifier)).append("\n");
    sb.append("    accountUuid: ").append(toIndentedString(accountUuid)).append("\n");
    sb.append("    claimMatchers: ").append(toIndentedString(claimMatchers)).append("\n");
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
