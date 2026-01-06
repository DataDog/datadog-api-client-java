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
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/** The <code>microsoft_sentinel</code> destination forwards logs to Microsoft Sentinel. */
@JsonPropertyOrder({
  MicrosoftSentinelDestination.JSON_PROPERTY_BUFFER,
  MicrosoftSentinelDestination.JSON_PROPERTY_CLIENT_ID,
  MicrosoftSentinelDestination.JSON_PROPERTY_DCR_IMMUTABLE_ID,
  MicrosoftSentinelDestination.JSON_PROPERTY_ID,
  MicrosoftSentinelDestination.JSON_PROPERTY_INPUTS,
  MicrosoftSentinelDestination.JSON_PROPERTY_TABLE,
  MicrosoftSentinelDestination.JSON_PROPERTY_TENANT_ID,
  MicrosoftSentinelDestination.JSON_PROPERTY_TYPE
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class MicrosoftSentinelDestination {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_BUFFER = "buffer";
  private ObservabilityPipelineBufferOptions buffer;

  public static final String JSON_PROPERTY_CLIENT_ID = "client_id";
  private String clientId;

  public static final String JSON_PROPERTY_DCR_IMMUTABLE_ID = "dcr_immutable_id";
  private String dcrImmutableId;

  public static final String JSON_PROPERTY_ID = "id";
  private String id;

  public static final String JSON_PROPERTY_INPUTS = "inputs";
  private List<String> inputs = new ArrayList<>();

  public static final String JSON_PROPERTY_TABLE = "table";
  private String table;

  public static final String JSON_PROPERTY_TENANT_ID = "tenant_id";
  private String tenantId;

  public static final String JSON_PROPERTY_TYPE = "type";
  private MicrosoftSentinelDestinationType type =
      MicrosoftSentinelDestinationType.MICROSOFT_SENTINEL;

  public MicrosoftSentinelDestination() {}

  @JsonCreator
  public MicrosoftSentinelDestination(
      @JsonProperty(required = true, value = JSON_PROPERTY_CLIENT_ID) String clientId,
      @JsonProperty(required = true, value = JSON_PROPERTY_DCR_IMMUTABLE_ID) String dcrImmutableId,
      @JsonProperty(required = true, value = JSON_PROPERTY_ID) String id,
      @JsonProperty(required = true, value = JSON_PROPERTY_INPUTS) List<String> inputs,
      @JsonProperty(required = true, value = JSON_PROPERTY_TABLE) String table,
      @JsonProperty(required = true, value = JSON_PROPERTY_TENANT_ID) String tenantId,
      @JsonProperty(required = true, value = JSON_PROPERTY_TYPE)
          MicrosoftSentinelDestinationType type) {
    this.clientId = clientId;
    this.dcrImmutableId = dcrImmutableId;
    this.id = id;
    this.inputs = inputs;
    this.table = table;
    this.tenantId = tenantId;
    this.type = type;
    this.unparsed |= !type.isValid();
  }

  public MicrosoftSentinelDestination buffer(ObservabilityPipelineBufferOptions buffer) {
    this.buffer = buffer;
    this.unparsed |= buffer.unparsed;
    return this;
  }

  /**
   * Configuration for buffer settings on destination components.
   *
   * @return buffer
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_BUFFER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public ObservabilityPipelineBufferOptions getBuffer() {
    return buffer;
  }

  public void setBuffer(ObservabilityPipelineBufferOptions buffer) {
    this.buffer = buffer;
  }

  public MicrosoftSentinelDestination clientId(String clientId) {
    this.clientId = clientId;
    return this;
  }

  /**
   * Azure AD client ID used for authentication.
   *
   * @return clientId
   */
  @JsonProperty(JSON_PROPERTY_CLIENT_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getClientId() {
    return clientId;
  }

  public void setClientId(String clientId) {
    this.clientId = clientId;
  }

  public MicrosoftSentinelDestination dcrImmutableId(String dcrImmutableId) {
    this.dcrImmutableId = dcrImmutableId;
    return this;
  }

  /**
   * The immutable ID of the Data Collection Rule (DCR).
   *
   * @return dcrImmutableId
   */
  @JsonProperty(JSON_PROPERTY_DCR_IMMUTABLE_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getDcrImmutableId() {
    return dcrImmutableId;
  }

  public void setDcrImmutableId(String dcrImmutableId) {
    this.dcrImmutableId = dcrImmutableId;
  }

  public MicrosoftSentinelDestination id(String id) {
    this.id = id;
    return this;
  }

  /**
   * The unique identifier for this component.
   *
   * @return id
   */
  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public MicrosoftSentinelDestination inputs(List<String> inputs) {
    this.inputs = inputs;
    return this;
  }

  public MicrosoftSentinelDestination addInputsItem(String inputsItem) {
    this.inputs.add(inputsItem);
    return this;
  }

  /**
   * A list of component IDs whose output is used as the <code>input</code> for this component.
   *
   * @return inputs
   */
  @JsonProperty(JSON_PROPERTY_INPUTS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public List<String> getInputs() {
    return inputs;
  }

  public void setInputs(List<String> inputs) {
    this.inputs = inputs;
  }

  public MicrosoftSentinelDestination table(String table) {
    this.table = table;
    return this;
  }

  /**
   * The name of the Log Analytics table where logs are sent.
   *
   * @return table
   */
  @JsonProperty(JSON_PROPERTY_TABLE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getTable() {
    return table;
  }

  public void setTable(String table) {
    this.table = table;
  }

  public MicrosoftSentinelDestination tenantId(String tenantId) {
    this.tenantId = tenantId;
    return this;
  }

  /**
   * Azure AD tenant ID.
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

  public MicrosoftSentinelDestination type(MicrosoftSentinelDestinationType type) {
    this.type = type;
    this.unparsed |= !type.isValid();
    return this;
  }

  /**
   * The destination type. The value should always be <code>microsoft_sentinel</code>.
   *
   * @return type
   */
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public MicrosoftSentinelDestinationType getType() {
    return type;
  }

  public void setType(MicrosoftSentinelDestinationType type) {
    if (!type.isValid()) {
      this.unparsed = true;
    }
    this.type = type;
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
   * @return MicrosoftSentinelDestination
   */
  @JsonAnySetter
  public MicrosoftSentinelDestination putAdditionalProperty(String key, Object value) {
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

  /** Return true if this MicrosoftSentinelDestination object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MicrosoftSentinelDestination microsoftSentinelDestination = (MicrosoftSentinelDestination) o;
    return Objects.equals(this.buffer, microsoftSentinelDestination.buffer)
        && Objects.equals(this.clientId, microsoftSentinelDestination.clientId)
        && Objects.equals(this.dcrImmutableId, microsoftSentinelDestination.dcrImmutableId)
        && Objects.equals(this.id, microsoftSentinelDestination.id)
        && Objects.equals(this.inputs, microsoftSentinelDestination.inputs)
        && Objects.equals(this.table, microsoftSentinelDestination.table)
        && Objects.equals(this.tenantId, microsoftSentinelDestination.tenantId)
        && Objects.equals(this.type, microsoftSentinelDestination.type)
        && Objects.equals(
            this.additionalProperties, microsoftSentinelDestination.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        buffer, clientId, dcrImmutableId, id, inputs, table, tenantId, type, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MicrosoftSentinelDestination {\n");
    sb.append("    buffer: ").append(toIndentedString(buffer)).append("\n");
    sb.append("    clientId: ").append(toIndentedString(clientId)).append("\n");
    sb.append("    dcrImmutableId: ").append(toIndentedString(dcrImmutableId)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    inputs: ").append(toIndentedString(inputs)).append("\n");
    sb.append("    table: ").append(toIndentedString(table)).append("\n");
    sb.append("    tenantId: ").append(toIndentedString(tenantId)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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
