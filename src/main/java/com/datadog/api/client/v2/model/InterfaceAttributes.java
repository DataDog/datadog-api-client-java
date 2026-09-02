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
   * <p>The interface attributes</p>
 */
@JsonPropertyOrder({
  InterfaceAttributes.JSON_PROPERTY_ALIAS,
  InterfaceAttributes.JSON_PROPERTY_DESCRIPTION,
  InterfaceAttributes.JSON_PROPERTY_INDEX,
  InterfaceAttributes.JSON_PROPERTY_IP_ADDRESSES,
  InterfaceAttributes.JSON_PROPERTY_MAC_ADDRESS,
  InterfaceAttributes.JSON_PROPERTY_NAME,
  InterfaceAttributes.JSON_PROPERTY_STATUS
})
@jakarta.annotation.Generated(value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class InterfaceAttributes {
  @JsonIgnore
  public boolean unparsed = false;
  public static final String JSON_PROPERTY_ALIAS = "alias";
  private String alias;

  public static final String JSON_PROPERTY_DESCRIPTION = "description";
  private String description;

  public static final String JSON_PROPERTY_INDEX = "index";
  private Long index;

  public static final String JSON_PROPERTY_IP_ADDRESSES = "ip_addresses";
  private List<String> ipAddresses = null;

  public static final String JSON_PROPERTY_MAC_ADDRESS = "mac_address";
  private String macAddress;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_STATUS = "status";
  private InterfaceAttributesStatus status;

  public InterfaceAttributes alias(String alias) {
    this.alias = alias;
    return this;
  }

  /**
   * <p>The interface alias</p>
   * @return alias
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_ALIAS)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public String getAlias() {
        return alias;
      }
  public void setAlias(String alias) {
    this.alias = alias;
  }
  public InterfaceAttributes description(String description) {
    this.description = description;
    return this;
  }

  /**
   * <p>The interface description</p>
   * @return description
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_DESCRIPTION)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public String getDescription() {
        return description;
      }
  public void setDescription(String description) {
    this.description = description;
  }
  public InterfaceAttributes index(Long index) {
    this.index = index;
    return this;
  }

  /**
   * <p>The interface index</p>
   * @return index
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_INDEX)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public Long getIndex() {
        return index;
      }
  public void setIndex(Long index) {
    this.index = index;
  }
  public InterfaceAttributes ipAddresses(List<String> ipAddresses) {
    this.ipAddresses = ipAddresses;
    return this;
  }
  public InterfaceAttributes addIpAddressesItem(String ipAddressesItem) {
    if (this.ipAddresses == null) {
      this.ipAddresses = new ArrayList<>();
    }
    this.ipAddresses.add(ipAddressesItem);
    return this;
  }

  /**
   * <p>The interface IP addresses</p>
   * @return ipAddresses
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_IP_ADDRESSES)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public List<String> getIpAddresses() {
        return ipAddresses;
      }
  public void setIpAddresses(List<String> ipAddresses) {
    this.ipAddresses = ipAddresses;
  }
  public InterfaceAttributes macAddress(String macAddress) {
    this.macAddress = macAddress;
    return this;
  }

  /**
   * <p>The interface MAC address</p>
   * @return macAddress
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_MAC_ADDRESS)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public String getMacAddress() {
        return macAddress;
      }
  public void setMacAddress(String macAddress) {
    this.macAddress = macAddress;
  }
  public InterfaceAttributes name(String name) {
    this.name = name;
    return this;
  }

  /**
   * <p>The interface name</p>
   * @return name
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_NAME)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public String getName() {
        return name;
      }
  public void setName(String name) {
    this.name = name;
  }
  public InterfaceAttributes status(InterfaceAttributesStatus status) {
    this.status = status;
    this.unparsed |= !status.isValid();
    return this;
  }

  /**
   * <p>The interface status</p>
   * @return status
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_STATUS)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public InterfaceAttributesStatus getStatus() {
        return status;
      }
  public void setStatus(InterfaceAttributesStatus status) {
    if (!status.isValid()) {
        this.unparsed = true;
    }
    this.status = status;
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
   * @return InterfaceAttributes
   */
  @JsonAnySetter
  public InterfaceAttributes putAdditionalProperty(String key, Object value) {
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
   * Return true if this InterfaceAttributes object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InterfaceAttributes interfaceAttributes = (InterfaceAttributes) o;
    return Objects.equals(this.alias, interfaceAttributes.alias) && Objects.equals(this.description, interfaceAttributes.description) && Objects.equals(this.index, interfaceAttributes.index) && Objects.equals(this.ipAddresses, interfaceAttributes.ipAddresses) && Objects.equals(this.macAddress, interfaceAttributes.macAddress) && Objects.equals(this.name, interfaceAttributes.name) && Objects.equals(this.status, interfaceAttributes.status) && Objects.equals(this.additionalProperties, interfaceAttributes.additionalProperties);
  }


  @Override
  public int hashCode() {
    return Objects.hash(alias,description,index,ipAddresses,macAddress,name,status, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InterfaceAttributes {\n");
    sb.append("    alias: ").append(toIndentedString(alias)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    index: ").append(toIndentedString(index)).append("\n");
    sb.append("    ipAddresses: ").append(toIndentedString(ipAddresses)).append("\n");
    sb.append("    macAddress: ").append(toIndentedString(macAddress)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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
