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
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/** Settings for creating the Nebius Cloud integration account. */
@JsonPropertyOrder({
  NebiusCloudIntegrationAccountSettingsRequest.JSON_PROPERTY_ACCOUNT_TAGS,
  NebiusCloudIntegrationAccountSettingsRequest.JSON_PROPERTY_TENANT_ID
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class NebiusCloudIntegrationAccountSettingsRequest {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_ACCOUNT_TAGS = "account_tags";
  private List<String> accountTags = null;

  public static final String JSON_PROPERTY_TENANT_ID = "tenant_id";
  private String tenantId;

  public NebiusCloudIntegrationAccountSettingsRequest() {}

  @JsonCreator
  public NebiusCloudIntegrationAccountSettingsRequest(
      @JsonProperty(required = true, value = JSON_PROPERTY_TENANT_ID) String tenantId) {
    this.tenantId = tenantId;
  }

  public NebiusCloudIntegrationAccountSettingsRequest accountTags(List<String> accountTags) {
    this.accountTags = accountTags;
    return this;
  }

  public NebiusCloudIntegrationAccountSettingsRequest addAccountTagsItem(String accountTagsItem) {
    if (this.accountTags == null) {
      this.accountTags = new ArrayList<>();
    }
    this.accountTags.add(accountTagsItem);
    return this;
  }

  /**
   * Tags applied to all metrics, logs, and resources collected from this Nebius Cloud account.
   * Defaults to no tags.
   *
   * @return accountTags
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ACCOUNT_TAGS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<String> getAccountTags() {
    return accountTags;
  }

  public void setAccountTags(List<String> accountTags) {
    this.accountTags = accountTags;
  }

  public NebiusCloudIntegrationAccountSettingsRequest tenantId(String tenantId) {
    this.tenantId = tenantId;
    return this;
  }

  /**
   * ID of the Nebius tenant to monitor, the organizational workspace identifier. Found in the
   * Nebius console under Administration &gt; Organization.
   *
   * @return tenantId
   */
  @JsonProperty(JSON_PROPERTY_TENANT_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getTenantId() {
    return tenantId;
  }

  public void setTenantId(String tenantId) {
    this.tenantId = tenantId;
  }

  /** Return true if this NebiusCloudIntegrationAccountSettingsRequest object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NebiusCloudIntegrationAccountSettingsRequest nebiusCloudIntegrationAccountSettingsRequest =
        (NebiusCloudIntegrationAccountSettingsRequest) o;
    return Objects.equals(
            this.accountTags, nebiusCloudIntegrationAccountSettingsRequest.accountTags)
        && Objects.equals(this.tenantId, nebiusCloudIntegrationAccountSettingsRequest.tenantId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountTags, tenantId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NebiusCloudIntegrationAccountSettingsRequest {\n");
    sb.append("    accountTags: ").append(toIndentedString(accountTags)).append("\n");
    sb.append("    tenantId: ").append(toIndentedString(tenantId)).append("\n");
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
