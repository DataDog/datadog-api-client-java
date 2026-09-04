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
import java.util.Objects;

/**
 * Settings for updating the Databricks integration account. Only the fields provided are changed.
 */
@JsonPropertyOrder({
  DatabricksIntegrationAccountSettingsUpdate.JSON_PROPERTY_SYSTEM_TABLES_SQL_WAREHOUSE_ID,
  DatabricksIntegrationAccountSettingsUpdate.JSON_PROPERTY_WORKSPACE_URL
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class DatabricksIntegrationAccountSettingsUpdate {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_SYSTEM_TABLES_SQL_WAREHOUSE_ID =
      "system_tables_sql_warehouse_id";
  private String systemTablesSqlWarehouseId;

  public static final String JSON_PROPERTY_WORKSPACE_URL = "workspace_url";
  private String workspaceUrl;

  public DatabricksIntegrationAccountSettingsUpdate systemTablesSqlWarehouseId(
      String systemTablesSqlWarehouseId) {
    this.systemTablesSqlWarehouseId = systemTablesSqlWarehouseId;
    return this;
  }

  /**
   * ID of the SQL warehouse used to query the Databricks system tables.
   *
   * @return systemTablesSqlWarehouseId
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SYSTEM_TABLES_SQL_WAREHOUSE_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getSystemTablesSqlWarehouseId() {
    return systemTablesSqlWarehouseId;
  }

  public void setSystemTablesSqlWarehouseId(String systemTablesSqlWarehouseId) {
    this.systemTablesSqlWarehouseId = systemTablesSqlWarehouseId;
  }

  public DatabricksIntegrationAccountSettingsUpdate workspaceUrl(String workspaceUrl) {
    this.workspaceUrl = workspaceUrl;
    return this;
  }

  /**
   * URL of the Databricks workspace.
   *
   * @return workspaceUrl
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_WORKSPACE_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getWorkspaceUrl() {
    return workspaceUrl;
  }

  public void setWorkspaceUrl(String workspaceUrl) {
    this.workspaceUrl = workspaceUrl;
  }

  /** Return true if this DatabricksIntegrationAccountSettingsUpdate object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DatabricksIntegrationAccountSettingsUpdate databricksIntegrationAccountSettingsUpdate =
        (DatabricksIntegrationAccountSettingsUpdate) o;
    return Objects.equals(
            this.systemTablesSqlWarehouseId,
            databricksIntegrationAccountSettingsUpdate.systemTablesSqlWarehouseId)
        && Objects.equals(
            this.workspaceUrl, databricksIntegrationAccountSettingsUpdate.workspaceUrl);
  }

  @Override
  public int hashCode() {
    return Objects.hash(systemTablesSqlWarehouseId, workspaceUrl);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DatabricksIntegrationAccountSettingsUpdate {\n");
    sb.append("    systemTablesSqlWarehouseId: ")
        .append(toIndentedString(systemTablesSqlWarehouseId))
        .append("\n");
    sb.append("    workspaceUrl: ").append(toIndentedString(workspaceUrl)).append("\n");
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
