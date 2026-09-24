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

/** Settings configured on the Databricks integration account. */
@JsonPropertyOrder({
  DatabricksIntegrationAccountSettingsResponse.JSON_PROPERTY_SYSTEM_TABLES_SQL_WAREHOUSE_ID,
  DatabricksIntegrationAccountSettingsResponse.JSON_PROPERTY_WORKSPACE_URL
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class DatabricksIntegrationAccountSettingsResponse {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_SYSTEM_TABLES_SQL_WAREHOUSE_ID =
      "system_tables_sql_warehouse_id";
  private String systemTablesSqlWarehouseId;

  public static final String JSON_PROPERTY_WORKSPACE_URL = "workspace_url";
  private String workspaceUrl;

  public DatabricksIntegrationAccountSettingsResponse() {}

  @JsonCreator
  public DatabricksIntegrationAccountSettingsResponse(
      @JsonProperty(required = true, value = JSON_PROPERTY_WORKSPACE_URL) String workspaceUrl) {
    this.workspaceUrl = workspaceUrl;
  }

  public DatabricksIntegrationAccountSettingsResponse systemTablesSqlWarehouseId(
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

  public DatabricksIntegrationAccountSettingsResponse workspaceUrl(String workspaceUrl) {
    this.workspaceUrl = workspaceUrl;
    return this;
  }

  /**
   * URL of the Databricks workspace.
   *
   * @return workspaceUrl
   */
  @JsonProperty(JSON_PROPERTY_WORKSPACE_URL)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getWorkspaceUrl() {
    return workspaceUrl;
  }

  public void setWorkspaceUrl(String workspaceUrl) {
    this.workspaceUrl = workspaceUrl;
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
   * @return DatabricksIntegrationAccountSettingsResponse
   */
  @JsonAnySetter
  public DatabricksIntegrationAccountSettingsResponse putAdditionalProperty(
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

  /** Return true if this DatabricksIntegrationAccountSettingsResponse object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DatabricksIntegrationAccountSettingsResponse databricksIntegrationAccountSettingsResponse =
        (DatabricksIntegrationAccountSettingsResponse) o;
    return Objects.equals(
            this.systemTablesSqlWarehouseId,
            databricksIntegrationAccountSettingsResponse.systemTablesSqlWarehouseId)
        && Objects.equals(
            this.workspaceUrl, databricksIntegrationAccountSettingsResponse.workspaceUrl)
        && Objects.equals(
            this.additionalProperties,
            databricksIntegrationAccountSettingsResponse.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(systemTablesSqlWarehouseId, workspaceUrl, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DatabricksIntegrationAccountSettingsResponse {\n");
    sb.append("    systemTablesSqlWarehouseId: ")
        .append(toIndentedString(systemTablesSqlWarehouseId))
        .append("\n");
    sb.append("    workspaceUrl: ").append(toIndentedString(workspaceUrl)).append("\n");
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
