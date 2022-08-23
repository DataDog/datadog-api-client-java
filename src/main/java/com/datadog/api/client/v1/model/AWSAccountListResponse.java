/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v1.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/** List of enabled AWS accounts. */
@JsonPropertyOrder({AWSAccountListResponse.JSON_PROPERTY_ACCOUNTS})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class AWSAccountListResponse {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_ACCOUNTS = "accounts";
  private List<AWSAccount> accounts = null;

  public AWSAccountListResponse accounts(List<AWSAccount> accounts) {
    this.accounts = accounts;
    for (AWSAccount item : accounts) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }

  public AWSAccountListResponse addAccountsItem(AWSAccount accountsItem) {
    if (this.accounts == null) {
      this.accounts = new ArrayList<>();
    }
    this.accounts.add(accountsItem);
    this.unparsed |= accountsItem.unparsed;
    return this;
  }

  /**
   * List of enabled AWS accounts.
   *
   * @return accounts
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ACCOUNTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<AWSAccount> getAccounts() {
    return accounts;
  }

  public void setAccounts(List<AWSAccount> accounts) {
    this.accounts = accounts;
  }

  /** Return true if this AWSAccountListResponse object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AWSAccountListResponse awsAccountListResponse = (AWSAccountListResponse) o;
    return Objects.equals(this.accounts, awsAccountListResponse.accounts);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accounts);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AWSAccountListResponse {\n");
    sb.append("    accounts: ").append(toIndentedString(accounts)).append("\n");
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
