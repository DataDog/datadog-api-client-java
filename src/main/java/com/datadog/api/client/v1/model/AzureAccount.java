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
   * <p>Datadog-Azure integrations configured for your organization.</p>
 */
@JsonPropertyOrder({
  AzureAccount.JSON_PROPERTY_AUTOMUTE,
  AzureAccount.JSON_PROPERTY_CLIENT_ID,
  AzureAccount.JSON_PROPERTY_CLIENT_SECRET,
  AzureAccount.JSON_PROPERTY_ERRORS,
  AzureAccount.JSON_PROPERTY_HOST_FILTERS,
  AzureAccount.JSON_PROPERTY_NEW_CLIENT_ID,
  AzureAccount.JSON_PROPERTY_NEW_TENANT_NAME,
  AzureAccount.JSON_PROPERTY_TENANT_NAME
})
@jakarta.annotation.Generated(value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class AzureAccount {
  @JsonIgnore
  public boolean unparsed = false;
  public static final String JSON_PROPERTY_AUTOMUTE = "automute";
  private Boolean automute;

  public static final String JSON_PROPERTY_CLIENT_ID = "client_id";
  private String clientId;

  public static final String JSON_PROPERTY_CLIENT_SECRET = "client_secret";
  private String clientSecret;

  public static final String JSON_PROPERTY_ERRORS = "errors";
  private List<String> errors = null;

  public static final String JSON_PROPERTY_HOST_FILTERS = "host_filters";
  private String hostFilters;

  public static final String JSON_PROPERTY_NEW_CLIENT_ID = "new_client_id";
  private String newClientId;

  public static final String JSON_PROPERTY_NEW_TENANT_NAME = "new_tenant_name";
  private String newTenantName;

  public static final String JSON_PROPERTY_TENANT_NAME = "tenant_name";
  private String tenantName;

  public AzureAccount automute(Boolean automute) {
    this.automute = automute;
    return this;
  }

  /**
   * <p>Silence monitors for expected Azure VM shutdowns.</p>
   * @return automute
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_AUTOMUTE)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public Boolean getAutomute() {
        return automute;
      }
  public void setAutomute(Boolean automute) {
    this.automute = automute;
  }
  public AzureAccount clientId(String clientId) {
    this.clientId = clientId;
    return this;
  }

  /**
   * <p>Your Azure web application ID.</p>
   * @return clientId
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_CLIENT_ID)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public String getClientId() {
        return clientId;
      }
  public void setClientId(String clientId) {
    this.clientId = clientId;
  }
  public AzureAccount clientSecret(String clientSecret) {
    this.clientSecret = clientSecret;
    return this;
  }

  /**
   * <p>Your Azure web application secret key.</p>
   * @return clientSecret
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_CLIENT_SECRET)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public String getClientSecret() {
        return clientSecret;
      }
  public void setClientSecret(String clientSecret) {
    this.clientSecret = clientSecret;
  }
  public AzureAccount errors(List<String> errors) {
    this.errors = errors;
    return this;
  }
  public AzureAccount addErrorsItem(String errorsItem) {
    if (this.errors == null) {
      this.errors = new ArrayList<>();
    }
    this.errors.add(errorsItem);
    return this;
  }

  /**
   * <p>Errors in your configuration.</p>
   * @return errors
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_ERRORS)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public List<String> getErrors() {
        return errors;
      }
  public void setErrors(List<String> errors) {
    this.errors = errors;
  }
  public AzureAccount hostFilters(String hostFilters) {
    this.hostFilters = hostFilters;
    return this;
  }

  /**
   * <p>Limit the Azure instances that are pulled into Datadog by using tags.
   * Only hosts that match one of the defined tags are imported into Datadog.</p>
   * @return hostFilters
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_HOST_FILTERS)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public String getHostFilters() {
        return hostFilters;
      }
  public void setHostFilters(String hostFilters) {
    this.hostFilters = hostFilters;
  }
  public AzureAccount newClientId(String newClientId) {
    this.newClientId = newClientId;
    return this;
  }

  /**
   * <p>Your New Azure web application ID.</p>
   * @return newClientId
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_NEW_CLIENT_ID)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public String getNewClientId() {
        return newClientId;
      }
  public void setNewClientId(String newClientId) {
    this.newClientId = newClientId;
  }
  public AzureAccount newTenantName(String newTenantName) {
    this.newTenantName = newTenantName;
    return this;
  }

  /**
   * <p>Your New Azure Active Directory ID.</p>
   * @return newTenantName
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_NEW_TENANT_NAME)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public String getNewTenantName() {
        return newTenantName;
      }
  public void setNewTenantName(String newTenantName) {
    this.newTenantName = newTenantName;
  }
  public AzureAccount tenantName(String tenantName) {
    this.tenantName = tenantName;
    return this;
  }

  /**
   * <p>Your Azure Active Directory ID.</p>
   * @return tenantName
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_TENANT_NAME)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public String getTenantName() {
        return tenantName;
      }
  public void setTenantName(String tenantName) {
    this.tenantName = tenantName;
  }

  /**
   * Return true if this AzureAccount object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AzureAccount azureAccount = (AzureAccount) o;
    return Objects.equals(this.automute, azureAccount.automute) && Objects.equals(this.clientId, azureAccount.clientId) && Objects.equals(this.clientSecret, azureAccount.clientSecret) && Objects.equals(this.errors, azureAccount.errors) && Objects.equals(this.hostFilters, azureAccount.hostFilters) && Objects.equals(this.newClientId, azureAccount.newClientId) && Objects.equals(this.newTenantName, azureAccount.newTenantName) && Objects.equals(this.tenantName, azureAccount.tenantName);
  }


  @Override
  public int hashCode() {
    return Objects.hash(automute,clientId,clientSecret,errors,hostFilters,newClientId,newTenantName,tenantName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AzureAccount {\n");
    sb.append("    automute: ").append(toIndentedString(automute)).append("\n");
    sb.append("    clientId: ").append(toIndentedString(clientId)).append("\n");
    sb.append("    clientSecret: ").append(toIndentedString(clientSecret)).append("\n");
    sb.append("    errors: ").append(toIndentedString(errors)).append("\n");
    sb.append("    hostFilters: ").append(toIndentedString(hostFilters)).append("\n");
    sb.append("    newClientId: ").append(toIndentedString(newClientId)).append("\n");
    sb.append("    newTenantName: ").append(toIndentedString(newTenantName)).append("\n");
    sb.append("    tenantName: ").append(toIndentedString(tenantName)).append("\n");
    sb.append("}");
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
