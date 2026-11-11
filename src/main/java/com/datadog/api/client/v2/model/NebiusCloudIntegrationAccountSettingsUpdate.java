/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v2.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * Settings for updating the Nebius Cloud integration account. Only the fields provided are changed.
 */
@JsonPropertyOrder({
  NebiusCloudIntegrationAccountSettingsUpdate.JSON_PROPERTY_ACCOUNT_TAGS,
  NebiusCloudIntegrationAccountSettingsUpdate.JSON_PROPERTY_TENANT_ID
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class NebiusCloudIntegrationAccountSettingsUpdate {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_ACCOUNT_TAGS = "account_tags";
  private List<String> accountTags = null;

  public static final String JSON_PROPERTY_TENANT_ID = "tenant_id";
  private String tenantId;

  public NebiusCloudIntegrationAccountSettingsUpdate accountTags(List<String> accountTags) {
    this.accountTags = accountTags;
    return this;
  }

  public NebiusCloudIntegrationAccountSettingsUpdate addAccountTagsItem(String accountTagsItem) {
    if (this.accountTags == null) {
      this.accountTags = new ArrayList<>();
    }
    this.accountTags.add(accountTagsItem);
    return this;
  }

  /**
   * Tags applied to all metrics, logs, and resources collected from this Nebius Cloud account.
   * Sending it replaces the whole list; send an empty array to remove all tags, or omit it to keep
   * the stored list.
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

  public NebiusCloudIntegrationAccountSettingsUpdate tenantId(String tenantId) {
    this.tenantId = tenantId;
    return this;
  }

  /**
   * ID of the Nebius tenant to monitor. An empty value is ignored and the stored tenant ID is kept.
   *
   * @return tenantId
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TENANT_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getTenantId() {
    return tenantId;
  }

  public void setTenantId(String tenantId) {
    this.tenantId = tenantId;
  }

  /** Return true if this NebiusCloudIntegrationAccountSettingsUpdate object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NebiusCloudIntegrationAccountSettingsUpdate nebiusCloudIntegrationAccountSettingsUpdate =
        (NebiusCloudIntegrationAccountSettingsUpdate) o;
    return Objects.equals(this.accountTags, nebiusCloudIntegrationAccountSettingsUpdate.accountTags)
        && Objects.equals(this.tenantId, nebiusCloudIntegrationAccountSettingsUpdate.tenantId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountTags, tenantId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NebiusCloudIntegrationAccountSettingsUpdate {\n");
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
