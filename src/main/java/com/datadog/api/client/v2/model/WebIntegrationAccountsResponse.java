/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v2.model;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/** Response containing a list of web integration accounts. */
@JsonPropertyOrder({
  WebIntegrationAccountsResponse.JSON_PROPERTY_DATA,
  WebIntegrationAccountsResponse.JSON_PROPERTY_INTEGRATION_NAME
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class WebIntegrationAccountsResponse {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_DATA = "data";
  private List<WebIntegrationAccountResponseData> data = null;

  public static final String JSON_PROPERTY_INTEGRATION_NAME = "integration_name";
  private String integrationName;

  public WebIntegrationAccountsResponse data(List<WebIntegrationAccountResponseData> data) {
    this.data = data;
    for (WebIntegrationAccountResponseData item : data) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }

  public WebIntegrationAccountsResponse addDataItem(WebIntegrationAccountResponseData dataItem) {
    if (this.data == null) {
      this.data = new ArrayList<>();
    }
    this.data.add(dataItem);
    this.unparsed |= dataItem.unparsed;
    return this;
  }

  /**
   * Getdata
   *
   * @return data
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DATA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<WebIntegrationAccountResponseData> getData() {
    return data;
  }

  public void setData(List<WebIntegrationAccountResponseData> data) {
    this.data = data;
  }

  public WebIntegrationAccountsResponse integrationName(String integrationName) {
    this.integrationName = integrationName;
    return this;
  }

  /**
   * The name of the integration.
   *
   * @return integrationName
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_INTEGRATION_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getIntegrationName() {
    return integrationName;
  }

  public void setIntegrationName(String integrationName) {
    this.integrationName = integrationName;
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
   * @return WebIntegrationAccountsResponse
   */
  @JsonAnySetter
  public WebIntegrationAccountsResponse putAdditionalProperty(String key, Object value) {
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

  /** Return true if this WebIntegrationAccountsResponse object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WebIntegrationAccountsResponse webIntegrationAccountsResponse =
        (WebIntegrationAccountsResponse) o;
    return Objects.equals(this.data, webIntegrationAccountsResponse.data)
        && Objects.equals(this.integrationName, webIntegrationAccountsResponse.integrationName)
        && Objects.equals(
            this.additionalProperties, webIntegrationAccountsResponse.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(data, integrationName, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WebIntegrationAccountsResponse {\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
    sb.append("    integrationName: ").append(toIndentedString(integrationName)).append("\n");
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
