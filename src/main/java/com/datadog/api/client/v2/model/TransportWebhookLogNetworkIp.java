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

/** The IP address information. */
@JsonPropertyOrder({
  TransportWebhookLogNetworkIp.JSON_PROPERTY_ATTRIBUTES,
  TransportWebhookLogNetworkIp.JSON_PROPERTY_LIST
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class TransportWebhookLogNetworkIp {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_ATTRIBUTES = "attributes";
  private List<TransportWebhookLogIpAttribute> attributes = null;

  public static final String JSON_PROPERTY_LIST = "list";
  private List<String> list = null;

  public TransportWebhookLogNetworkIp attributes(List<TransportWebhookLogIpAttribute> attributes) {
    this.attributes = attributes;
    for (TransportWebhookLogIpAttribute item : attributes) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }

  public TransportWebhookLogNetworkIp addAttributesItem(
      TransportWebhookLogIpAttribute attributesItem) {
    if (this.attributes == null) {
      this.attributes = new ArrayList<>();
    }
    this.attributes.add(attributesItem);
    this.unparsed |= attributesItem.unparsed;
    return this;
  }

  /**
   * Per-IP attribute records, each pairing an IP address with the providers that observed it.
   *
   * @return attributes
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ATTRIBUTES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<TransportWebhookLogIpAttribute> getAttributes() {
    return attributes;
  }

  public void setAttributes(List<TransportWebhookLogIpAttribute> attributes) {
    this.attributes = attributes;
  }

  public TransportWebhookLogNetworkIp list(List<String> list) {
    this.list = list;
    return this;
  }

  public TransportWebhookLogNetworkIp addListItem(String listItem) {
    if (this.list == null) {
      this.list = new ArrayList<>();
    }
    this.list.add(listItem);
    return this;
  }

  /**
   * The list of IP addresses.
   *
   * @return list
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LIST)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<String> getList() {
    return list;
  }

  public void setList(List<String> list) {
    this.list = list;
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
   * @return TransportWebhookLogNetworkIp
   */
  @JsonAnySetter
  public TransportWebhookLogNetworkIp putAdditionalProperty(String key, Object value) {
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

  /** Return true if this TransportWebhookLogNetworkIp object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TransportWebhookLogNetworkIp transportWebhookLogNetworkIp = (TransportWebhookLogNetworkIp) o;
    return Objects.equals(this.attributes, transportWebhookLogNetworkIp.attributes)
        && Objects.equals(this.list, transportWebhookLogNetworkIp.list)
        && Objects.equals(
            this.additionalProperties, transportWebhookLogNetworkIp.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(attributes, list, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TransportWebhookLogNetworkIp {\n");
    sb.append("    attributes: ").append(toIndentedString(attributes)).append("\n");
    sb.append("    list: ").append(toIndentedString(list)).append("\n");
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
