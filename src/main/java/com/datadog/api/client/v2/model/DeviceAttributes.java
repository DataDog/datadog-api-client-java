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

/** The device attributes */
@JsonPropertyOrder({
  DeviceAttributes.JSON_PROPERTY_DESCRIPTION,
  DeviceAttributes.JSON_PROPERTY_DEVICE_TYPE,
  DeviceAttributes.JSON_PROPERTY_INTEGRATION,
  DeviceAttributes.JSON_PROPERTY_INTERFACE_STATUSES,
  DeviceAttributes.JSON_PROPERTY_IP_ADDRESS,
  DeviceAttributes.JSON_PROPERTY_LOCATION,
  DeviceAttributes.JSON_PROPERTY_MODEL,
  DeviceAttributes.JSON_PROPERTY_NAME,
  DeviceAttributes.JSON_PROPERTY_OS_HOSTNAME,
  DeviceAttributes.JSON_PROPERTY_OS_NAME,
  DeviceAttributes.JSON_PROPERTY_OS_VERSION,
  DeviceAttributes.JSON_PROPERTY_PING_STATUS,
  DeviceAttributes.JSON_PROPERTY_PRODUCT_NAME,
  DeviceAttributes.JSON_PROPERTY_SERIAL_NUMBER,
  DeviceAttributes.JSON_PROPERTY_STATUS,
  DeviceAttributes.JSON_PROPERTY_SUBNET,
  DeviceAttributes.JSON_PROPERTY_SYS_OBJECT_ID,
  DeviceAttributes.JSON_PROPERTY_TAGS,
  DeviceAttributes.JSON_PROPERTY_VENDOR,
  DeviceAttributes.JSON_PROPERTY_VERSION
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class DeviceAttributes {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_DESCRIPTION = "description";
  private String description;

  public static final String JSON_PROPERTY_DEVICE_TYPE = "device_type";
  private String deviceType;

  public static final String JSON_PROPERTY_INTEGRATION = "integration";
  private String integration;

  public static final String JSON_PROPERTY_INTERFACE_STATUSES = "interface_statuses";
  private DeviceAttributesInterfaceStatuses interfaceStatuses;

  public static final String JSON_PROPERTY_IP_ADDRESS = "ip_address";
  private String ipAddress;

  public static final String JSON_PROPERTY_LOCATION = "location";
  private String location;

  public static final String JSON_PROPERTY_MODEL = "model";
  private String model;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_OS_HOSTNAME = "os_hostname";
  private String osHostname;

  public static final String JSON_PROPERTY_OS_NAME = "os_name";
  private String osName;

  public static final String JSON_PROPERTY_OS_VERSION = "os_version";
  private String osVersion;

  public static final String JSON_PROPERTY_PING_STATUS = "ping_status";
  private String pingStatus;

  public static final String JSON_PROPERTY_PRODUCT_NAME = "product_name";
  private String productName;

  public static final String JSON_PROPERTY_SERIAL_NUMBER = "serial_number";
  private String serialNumber;

  public static final String JSON_PROPERTY_STATUS = "status";
  private String status;

  public static final String JSON_PROPERTY_SUBNET = "subnet";
  private String subnet;

  public static final String JSON_PROPERTY_SYS_OBJECT_ID = "sys_object_id";
  private String sysObjectId;

  public static final String JSON_PROPERTY_TAGS = "tags";
  private List<String> tags = null;

  public static final String JSON_PROPERTY_VENDOR = "vendor";
  private String vendor;

  public static final String JSON_PROPERTY_VERSION = "version";
  private String version;

  public DeviceAttributes description(String description) {
    this.description = description;
    return this;
  }

  /**
   * The device description
   *
   * @return description
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DESCRIPTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public DeviceAttributes deviceType(String deviceType) {
    this.deviceType = deviceType;
    return this;
  }

  /**
   * The device type
   *
   * @return deviceType
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DEVICE_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getDeviceType() {
    return deviceType;
  }

  public void setDeviceType(String deviceType) {
    this.deviceType = deviceType;
  }

  public DeviceAttributes integration(String integration) {
    this.integration = integration;
    return this;
  }

  /**
   * The device integration
   *
   * @return integration
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_INTEGRATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getIntegration() {
    return integration;
  }

  public void setIntegration(String integration) {
    this.integration = integration;
  }

  public DeviceAttributes interfaceStatuses(DeviceAttributesInterfaceStatuses interfaceStatuses) {
    this.interfaceStatuses = interfaceStatuses;
    this.unparsed |= interfaceStatuses.unparsed;
    return this;
  }

  /**
   * Count of the device interfaces by status
   *
   * @return interfaceStatuses
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_INTERFACE_STATUSES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public DeviceAttributesInterfaceStatuses getInterfaceStatuses() {
    return interfaceStatuses;
  }

  public void setInterfaceStatuses(DeviceAttributesInterfaceStatuses interfaceStatuses) {
    this.interfaceStatuses = interfaceStatuses;
  }

  public DeviceAttributes ipAddress(String ipAddress) {
    this.ipAddress = ipAddress;
    return this;
  }

  /**
   * The device IP address
   *
   * @return ipAddress
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_IP_ADDRESS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getIpAddress() {
    return ipAddress;
  }

  public void setIpAddress(String ipAddress) {
    this.ipAddress = ipAddress;
  }

  public DeviceAttributes location(String location) {
    this.location = location;
    return this;
  }

  /**
   * The device location
   *
   * @return location
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LOCATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getLocation() {
    return location;
  }

  public void setLocation(String location) {
    this.location = location;
  }

  public DeviceAttributes model(String model) {
    this.model = model;
    return this;
  }

  /**
   * The device model
   *
   * @return model
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_MODEL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getModel() {
    return model;
  }

  public void setModel(String model) {
    this.model = model;
  }

  public DeviceAttributes name(String name) {
    this.name = name;
    return this;
  }

  /**
   * The device name
   *
   * @return name
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public DeviceAttributes osHostname(String osHostname) {
    this.osHostname = osHostname;
    return this;
  }

  /**
   * The device OS hostname
   *
   * @return osHostname
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_OS_HOSTNAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getOsHostname() {
    return osHostname;
  }

  public void setOsHostname(String osHostname) {
    this.osHostname = osHostname;
  }

  public DeviceAttributes osName(String osName) {
    this.osName = osName;
    return this;
  }

  /**
   * The device OS name
   *
   * @return osName
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_OS_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getOsName() {
    return osName;
  }

  public void setOsName(String osName) {
    this.osName = osName;
  }

  public DeviceAttributes osVersion(String osVersion) {
    this.osVersion = osVersion;
    return this;
  }

  /**
   * The device OS version
   *
   * @return osVersion
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_OS_VERSION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getOsVersion() {
    return osVersion;
  }

  public void setOsVersion(String osVersion) {
    this.osVersion = osVersion;
  }

  public DeviceAttributes pingStatus(String pingStatus) {
    this.pingStatus = pingStatus;
    return this;
  }

  /**
   * The device ping status
   *
   * @return pingStatus
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PING_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getPingStatus() {
    return pingStatus;
  }

  public void setPingStatus(String pingStatus) {
    this.pingStatus = pingStatus;
  }

  public DeviceAttributes productName(String productName) {
    this.productName = productName;
    return this;
  }

  /**
   * The device product name
   *
   * @return productName
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PRODUCT_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getProductName() {
    return productName;
  }

  public void setProductName(String productName) {
    this.productName = productName;
  }

  public DeviceAttributes serialNumber(String serialNumber) {
    this.serialNumber = serialNumber;
    return this;
  }

  /**
   * The device serial number
   *
   * @return serialNumber
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SERIAL_NUMBER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getSerialNumber() {
    return serialNumber;
  }

  public void setSerialNumber(String serialNumber) {
    this.serialNumber = serialNumber;
  }

  public DeviceAttributes status(String status) {
    this.status = status;
    return this;
  }

  /**
   * The device SNMP status
   *
   * @return status
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public DeviceAttributes subnet(String subnet) {
    this.subnet = subnet;
    return this;
  }

  /**
   * The device subnet
   *
   * @return subnet
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SUBNET)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getSubnet() {
    return subnet;
  }

  public void setSubnet(String subnet) {
    this.subnet = subnet;
  }

  public DeviceAttributes sysObjectId(String sysObjectId) {
    this.sysObjectId = sysObjectId;
    return this;
  }

  /**
   * The device <code>sys_object_id</code>
   *
   * @return sysObjectId
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SYS_OBJECT_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getSysObjectId() {
    return sysObjectId;
  }

  public void setSysObjectId(String sysObjectId) {
    this.sysObjectId = sysObjectId;
  }

  public DeviceAttributes tags(List<String> tags) {
    this.tags = tags;
    return this;
  }

  public DeviceAttributes addTagsItem(String tagsItem) {
    if (this.tags == null) {
      this.tags = new ArrayList<>();
    }
    this.tags.add(tagsItem);
    return this;
  }

  /**
   * The list of device tags
   *
   * @return tags
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TAGS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<String> getTags() {
    return tags;
  }

  public void setTags(List<String> tags) {
    this.tags = tags;
  }

  public DeviceAttributes vendor(String vendor) {
    this.vendor = vendor;
    return this;
  }

  /**
   * The device vendor
   *
   * @return vendor
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_VENDOR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getVendor() {
    return vendor;
  }

  public void setVendor(String vendor) {
    this.vendor = vendor;
  }

  public DeviceAttributes version(String version) {
    this.version = version;
    return this;
  }

  /**
   * The device version
   *
   * @return version
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_VERSION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getVersion() {
    return version;
  }

  public void setVersion(String version) {
    this.version = version;
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
   * @return DeviceAttributes
   */
  @JsonAnySetter
  public DeviceAttributes putAdditionalProperty(String key, Object value) {
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

  /** Return true if this DeviceAttributes object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DeviceAttributes deviceAttributes = (DeviceAttributes) o;
    return Objects.equals(this.description, deviceAttributes.description)
        && Objects.equals(this.deviceType, deviceAttributes.deviceType)
        && Objects.equals(this.integration, deviceAttributes.integration)
        && Objects.equals(this.interfaceStatuses, deviceAttributes.interfaceStatuses)
        && Objects.equals(this.ipAddress, deviceAttributes.ipAddress)
        && Objects.equals(this.location, deviceAttributes.location)
        && Objects.equals(this.model, deviceAttributes.model)
        && Objects.equals(this.name, deviceAttributes.name)
        && Objects.equals(this.osHostname, deviceAttributes.osHostname)
        && Objects.equals(this.osName, deviceAttributes.osName)
        && Objects.equals(this.osVersion, deviceAttributes.osVersion)
        && Objects.equals(this.pingStatus, deviceAttributes.pingStatus)
        && Objects.equals(this.productName, deviceAttributes.productName)
        && Objects.equals(this.serialNumber, deviceAttributes.serialNumber)
        && Objects.equals(this.status, deviceAttributes.status)
        && Objects.equals(this.subnet, deviceAttributes.subnet)
        && Objects.equals(this.sysObjectId, deviceAttributes.sysObjectId)
        && Objects.equals(this.tags, deviceAttributes.tags)
        && Objects.equals(this.vendor, deviceAttributes.vendor)
        && Objects.equals(this.version, deviceAttributes.version)
        && Objects.equals(this.additionalProperties, deviceAttributes.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        description,
        deviceType,
        integration,
        interfaceStatuses,
        ipAddress,
        location,
        model,
        name,
        osHostname,
        osName,
        osVersion,
        pingStatus,
        productName,
        serialNumber,
        status,
        subnet,
        sysObjectId,
        tags,
        vendor,
        version,
        additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DeviceAttributes {\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    deviceType: ").append(toIndentedString(deviceType)).append("\n");
    sb.append("    integration: ").append(toIndentedString(integration)).append("\n");
    sb.append("    interfaceStatuses: ").append(toIndentedString(interfaceStatuses)).append("\n");
    sb.append("    ipAddress: ").append(toIndentedString(ipAddress)).append("\n");
    sb.append("    location: ").append(toIndentedString(location)).append("\n");
    sb.append("    model: ").append(toIndentedString(model)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    osHostname: ").append(toIndentedString(osHostname)).append("\n");
    sb.append("    osName: ").append(toIndentedString(osName)).append("\n");
    sb.append("    osVersion: ").append(toIndentedString(osVersion)).append("\n");
    sb.append("    pingStatus: ").append(toIndentedString(pingStatus)).append("\n");
    sb.append("    productName: ").append(toIndentedString(productName)).append("\n");
    sb.append("    serialNumber: ").append(toIndentedString(serialNumber)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    subnet: ").append(toIndentedString(subnet)).append("\n");
    sb.append("    sysObjectId: ").append(toIndentedString(sysObjectId)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("    vendor: ").append(toIndentedString(vendor)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
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
