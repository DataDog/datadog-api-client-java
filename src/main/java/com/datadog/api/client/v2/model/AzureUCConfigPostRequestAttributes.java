/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v2.model;

import java.io.File;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;
import java.util.HashMap;
import java.util.Map;
import java.util.List;
import java.util.ArrayList;
import java.util.UUID;
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
   * <p>Attributes for Azure config Post Request.</p>
 */
@JsonPropertyOrder({
  AzureUCConfigPostRequestAttributes.JSON_PROPERTY_ACCOUNT_ID,
  AzureUCConfigPostRequestAttributes.JSON_PROPERTY_ACTUAL_BILL_CONFIG,
  AzureUCConfigPostRequestAttributes.JSON_PROPERTY_AMORTIZED_BILL_CONFIG,
  AzureUCConfigPostRequestAttributes.JSON_PROPERTY_CLIENT_ID,
  AzureUCConfigPostRequestAttributes.JSON_PROPERTY_SCOPE
})
@jakarta.annotation.Generated(value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class AzureUCConfigPostRequestAttributes {
  @JsonIgnore
  public boolean unparsed = false;
  public static final String JSON_PROPERTY_ACCOUNT_ID = "account_id";
  private String accountId;

  public static final String JSON_PROPERTY_ACTUAL_BILL_CONFIG = "actual_bill_config";
  private BillConfig actualBillConfig;

  public static final String JSON_PROPERTY_AMORTIZED_BILL_CONFIG = "amortized_bill_config";
  private BillConfig amortizedBillConfig;

  public static final String JSON_PROPERTY_CLIENT_ID = "client_id";
  private String clientId;

  public static final String JSON_PROPERTY_SCOPE = "scope";
  private String scope;

  public AzureUCConfigPostRequestAttributes() {}

  @JsonCreator
  public AzureUCConfigPostRequestAttributes(
            @JsonProperty(required=true, value=JSON_PROPERTY_ACCOUNT_ID)String accountId,
            @JsonProperty(required=true, value=JSON_PROPERTY_ACTUAL_BILL_CONFIG)BillConfig actualBillConfig,
            @JsonProperty(required=true, value=JSON_PROPERTY_AMORTIZED_BILL_CONFIG)BillConfig amortizedBillConfig,
            @JsonProperty(required=true, value=JSON_PROPERTY_CLIENT_ID)String clientId,
            @JsonProperty(required=true, value=JSON_PROPERTY_SCOPE)String scope) {
        this.accountId = accountId;
        this.actualBillConfig = actualBillConfig;
        this.unparsed |= actualBillConfig.unparsed;
        this.amortizedBillConfig = amortizedBillConfig;
        this.unparsed |= amortizedBillConfig.unparsed;
        this.clientId = clientId;
        this.scope = scope;
  }
  public AzureUCConfigPostRequestAttributes accountId(String accountId) {
    this.accountId = accountId;
    return this;
  }

  /**
   * <p>The tenant ID of the Azure account.</p>
   * @return accountId
  **/
      @JsonProperty(JSON_PROPERTY_ACCOUNT_ID)
      @JsonInclude(
        value = JsonInclude.Include.ALWAYS)
      public String getAccountId() {
        return accountId;
      }
  public void setAccountId(String accountId) {
    this.accountId = accountId;
  }
  public AzureUCConfigPostRequestAttributes actualBillConfig(BillConfig actualBillConfig) {
    this.actualBillConfig = actualBillConfig;
    this.unparsed |= actualBillConfig.unparsed;
    return this;
  }

  /**
   * <p>Bill config.</p>
   * @return actualBillConfig
  **/
      @JsonProperty(JSON_PROPERTY_ACTUAL_BILL_CONFIG)
      @JsonInclude(
        value = JsonInclude.Include.ALWAYS)
      public BillConfig getActualBillConfig() {
        return actualBillConfig;
      }
  public void setActualBillConfig(BillConfig actualBillConfig) {
    this.actualBillConfig = actualBillConfig;
  }
  public AzureUCConfigPostRequestAttributes amortizedBillConfig(BillConfig amortizedBillConfig) {
    this.amortizedBillConfig = amortizedBillConfig;
    this.unparsed |= amortizedBillConfig.unparsed;
    return this;
  }

  /**
   * <p>Bill config.</p>
   * @return amortizedBillConfig
  **/
      @JsonProperty(JSON_PROPERTY_AMORTIZED_BILL_CONFIG)
      @JsonInclude(
        value = JsonInclude.Include.ALWAYS)
      public BillConfig getAmortizedBillConfig() {
        return amortizedBillConfig;
      }
  public void setAmortizedBillConfig(BillConfig amortizedBillConfig) {
    this.amortizedBillConfig = amortizedBillConfig;
  }
  public AzureUCConfigPostRequestAttributes clientId(String clientId) {
    this.clientId = clientId;
    return this;
  }

  /**
   * <p>The client ID of the Azure account.</p>
   * @return clientId
  **/
      @JsonProperty(JSON_PROPERTY_CLIENT_ID)
      @JsonInclude(
        value = JsonInclude.Include.ALWAYS)
      public String getClientId() {
        return clientId;
      }
  public void setClientId(String clientId) {
    this.clientId = clientId;
  }
  public AzureUCConfigPostRequestAttributes scope(String scope) {
    this.scope = scope;
    return this;
  }

  /**
   * <p>The scope of your observed subscription.</p>
   * @return scope
  **/
      @JsonProperty(JSON_PROPERTY_SCOPE)
      @JsonInclude(
        value = JsonInclude.Include.ALWAYS)
      public String getScope() {
        return scope;
      }
  public void setScope(String scope) {
    this.scope = scope;
  }

  /**
   * A container for additional, undeclared properties.
   * This is a holder for any undeclared properties as specified with
   * the 'additionalProperties' keyword in the OAS document.
   */
  private Map<String, Object> additionalProperties;

  /**
   * Set the additional (undeclared) property with the specified name and value.
   * If the property does not already exist, create it otherwise replace it.
   *
   * @param key The arbitrary key to set
   * @param value The associated value
   * @return AzureUCConfigPostRequestAttributes
   */
  @JsonAnySetter
  public AzureUCConfigPostRequestAttributes putAdditionalProperty(String key, Object value) {
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
   * Return true if this AzureUCConfigPostRequestAttributes object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AzureUCConfigPostRequestAttributes azureUcConfigPostRequestAttributes = (AzureUCConfigPostRequestAttributes) o;
    return Objects.equals(this.accountId, azureUcConfigPostRequestAttributes.accountId) && Objects.equals(this.actualBillConfig, azureUcConfigPostRequestAttributes.actualBillConfig) && Objects.equals(this.amortizedBillConfig, azureUcConfigPostRequestAttributes.amortizedBillConfig) && Objects.equals(this.clientId, azureUcConfigPostRequestAttributes.clientId) && Objects.equals(this.scope, azureUcConfigPostRequestAttributes.scope) && Objects.equals(this.additionalProperties, azureUcConfigPostRequestAttributes.additionalProperties);
  }


  @Override
  public int hashCode() {
    return Objects.hash(accountId,actualBillConfig,amortizedBillConfig,clientId,scope, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AzureUCConfigPostRequestAttributes {\n");
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    actualBillConfig: ").append(toIndentedString(actualBillConfig)).append("\n");
    sb.append("    amortizedBillConfig: ").append(toIndentedString(amortizedBillConfig)).append("\n");
    sb.append("    clientId: ").append(toIndentedString(clientId)).append("\n");
    sb.append("    scope: ").append(toIndentedString(scope)).append("\n");
    sb.append("    additionalProperties: ")
        .append(toIndentedString(additionalProperties))
        .append("\n");
    sb.append('}');
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
