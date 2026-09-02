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
   * <p>The device attributes</p>
 */
@JsonPropertyOrder({
  GetDeviceAttributes.JSON_PROPERTY_DESCRIPTION,
  GetDeviceAttributes.JSON_PROPERTY_DEVICE_TYPE,
  GetDeviceAttributes.JSON_PROPERTY_INTEGRATION,
  GetDeviceAttributes.JSON_PROPERTY_IP_ADDRESS,
  GetDeviceAttributes.JSON_PROPERTY_LOCATION,
  GetDeviceAttributes.JSON_PROPERTY_MODEL,
  GetDeviceAttributes.JSON_PROPERTY_NAME,
  GetDeviceAttributes.JSON_PROPERTY_OS_HOSTNAME,
  GetDeviceAttributes.JSON_PROPERTY_OS_NAME,
  GetDeviceAttributes.JSON_PROPERTY_OS_VERSION,
  GetDeviceAttributes.JSON_PROPERTY_PING_STATUS,
  GetDeviceAttributes.JSON_PROPERTY_PRODUCT_NAME,
  GetDeviceAttributes.JSON_PROPERTY_SERIAL_NUMBER,
  GetDeviceAttributes.JSON_PROPERTY_STATUS,
  GetDeviceAttributes.JSON_PROPERTY_SUBNET,
  GetDeviceAttributes.JSON_PROPERTY_SYS_OBJECT_ID,
  GetDeviceAttributes.JSON_PROPERTY_TAGS,
  GetDeviceAttributes.JSON_PROPERTY_VENDOR,
  GetDeviceAttributes.JSON_PROPERTY_VERSION
})
@jakarta.annotation.Generated(value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class GetDeviceAttributes {
  @JsonIgnore
  public boolean unparsed = false;
  public static final String JSON_PROPERTY_DESCRIPTION = "description";
  private String description;

  public static final String JSON_PROPERTY_DEVICE_TYPE = "device_type";
  private String deviceType;

  public static final String JSON_PROPERTY_INTEGRATION = "integration";
  private String integration;

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

  public GetDeviceAttributes description(String description) {
    this.description = description;
    return this;
  }

  /**
   * <p>A description of the device.</p>
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
  public GetDeviceAttributes deviceType(String deviceType) {
    this.deviceType = deviceType;
    return this;
  }

  /**
   * <p>The type of the device.</p>
   * @return deviceType
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_DEVICE_TYPE)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public String getDeviceType() {
        return deviceType;
      }
  public void setDeviceType(String deviceType) {
    this.deviceType = deviceType;
  }
  public GetDeviceAttributes integration(String integration) {
    this.integration = integration;
    return this;
  }

  /**
   * <p>The integration of the device.</p>
   * @return integration
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_INTEGRATION)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public String getIntegration() {
        return integration;
      }
  public void setIntegration(String integration) {
    this.integration = integration;
  }
  public GetDeviceAttributes ipAddress(String ipAddress) {
    this.ipAddress = ipAddress;
    return this;
  }

  /**
   * <p>The IP address of the device.</p>
   * @return ipAddress
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_IP_ADDRESS)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public String getIpAddress() {
        return ipAddress;
      }
  public void setIpAddress(String ipAddress) {
    this.ipAddress = ipAddress;
  }
  public GetDeviceAttributes location(String location) {
    this.location = location;
    return this;
  }

  /**
   * <p>The location of the device.</p>
   * @return location
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_LOCATION)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public String getLocation() {
        return location;
      }
  public void setLocation(String location) {
    this.location = location;
  }
  public GetDeviceAttributes model(String model) {
    this.model = model;
    return this;
  }

  /**
   * <p>The model of the device.</p>
   * @return model
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_MODEL)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public String getModel() {
        return model;
      }
  public void setModel(String model) {
    this.model = model;
  }
  public GetDeviceAttributes name(String name) {
    this.name = name;
    return this;
  }

  /**
   * <p>The name of the device.</p>
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
  public GetDeviceAttributes osHostname(String osHostname) {
    this.osHostname = osHostname;
    return this;
  }

  /**
   * <p>The operating system hostname of the device.</p>
   * @return osHostname
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_OS_HOSTNAME)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public String getOsHostname() {
        return osHostname;
      }
  public void setOsHostname(String osHostname) {
    this.osHostname = osHostname;
  }
  public GetDeviceAttributes osName(String osName) {
    this.osName = osName;
    return this;
  }

  /**
   * <p>The operating system name of the device.</p>
   * @return osName
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_OS_NAME)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public String getOsName() {
        return osName;
      }
  public void setOsName(String osName) {
    this.osName = osName;
  }
  public GetDeviceAttributes osVersion(String osVersion) {
    this.osVersion = osVersion;
    return this;
  }

  /**
   * <p>The operating system version of the device.</p>
   * @return osVersion
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_OS_VERSION)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public String getOsVersion() {
        return osVersion;
      }
  public void setOsVersion(String osVersion) {
    this.osVersion = osVersion;
  }
  public GetDeviceAttributes pingStatus(String pingStatus) {
    this.pingStatus = pingStatus;
    return this;
  }

  /**
   * <p>The ping status of the device.</p>
   * @return pingStatus
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_PING_STATUS)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public String getPingStatus() {
        return pingStatus;
      }
  public void setPingStatus(String pingStatus) {
    this.pingStatus = pingStatus;
  }
  public GetDeviceAttributes productName(String productName) {
    this.productName = productName;
    return this;
  }

  /**
   * <p>The product name of the device.</p>
   * @return productName
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_PRODUCT_NAME)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public String getProductName() {
        return productName;
      }
  public void setProductName(String productName) {
    this.productName = productName;
  }
  public GetDeviceAttributes serialNumber(String serialNumber) {
    this.serialNumber = serialNumber;
    return this;
  }

  /**
   * <p>The serial number of the device.</p>
   * @return serialNumber
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_SERIAL_NUMBER)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public String getSerialNumber() {
        return serialNumber;
      }
  public void setSerialNumber(String serialNumber) {
    this.serialNumber = serialNumber;
  }
  public GetDeviceAttributes status(String status) {
    this.status = status;
    return this;
  }

  /**
   * <p>The status of the device.</p>
   * @return status
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_STATUS)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public String getStatus() {
        return status;
      }
  public void setStatus(String status) {
    this.status = status;
  }
  public GetDeviceAttributes subnet(String subnet) {
    this.subnet = subnet;
    return this;
  }

  /**
   * <p>The subnet of the device.</p>
   * @return subnet
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_SUBNET)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public String getSubnet() {
        return subnet;
      }
  public void setSubnet(String subnet) {
    this.subnet = subnet;
  }
  public GetDeviceAttributes sysObjectId(String sysObjectId) {
    this.sysObjectId = sysObjectId;
    return this;
  }

  /**
   * <p>The device <code>sys_object_id</code>.</p>
   * @return sysObjectId
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_SYS_OBJECT_ID)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public String getSysObjectId() {
        return sysObjectId;
      }
  public void setSysObjectId(String sysObjectId) {
    this.sysObjectId = sysObjectId;
  }
  public GetDeviceAttributes tags(List<String> tags) {
    this.tags = tags;
    return this;
  }
  public GetDeviceAttributes addTagsItem(String tagsItem) {
    if (this.tags == null) {
      this.tags = new ArrayList<>();
    }
    this.tags.add(tagsItem);
    return this;
  }

  /**
   * <p>A list of tags associated with the device.</p>
   * @return tags
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_TAGS)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public List<String> getTags() {
        return tags;
      }
  public void setTags(List<String> tags) {
    this.tags = tags;
  }
  public GetDeviceAttributes vendor(String vendor) {
    this.vendor = vendor;
    return this;
  }

  /**
   * <p>The vendor of the device.</p>
   * @return vendor
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_VENDOR)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public String getVendor() {
        return vendor;
      }
  public void setVendor(String vendor) {
    this.vendor = vendor;
  }
  public GetDeviceAttributes version(String version) {
    this.version = version;
    return this;
  }

  /**
   * <p>The version of the device.</p>
   * @return version
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_VERSION)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public String getVersion() {
        return version;
      }
  public void setVersion(String version) {
    this.version = version;
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
   * @return GetDeviceAttributes
   */
  @JsonAnySetter
  public GetDeviceAttributes putAdditionalProperty(String key, Object value) {
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
   * Return true if this GetDeviceAttributes object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetDeviceAttributes getDeviceAttributes = (GetDeviceAttributes) o;
    return Objects.equals(this.description, getDeviceAttributes.description) && Objects.equals(this.deviceType, getDeviceAttributes.deviceType) && Objects.equals(this.integration, getDeviceAttributes.integration) && Objects.equals(this.ipAddress, getDeviceAttributes.ipAddress) && Objects.equals(this.location, getDeviceAttributes.location) && Objects.equals(this.model, getDeviceAttributes.model) && Objects.equals(this.name, getDeviceAttributes.name) && Objects.equals(this.osHostname, getDeviceAttributes.osHostname) && Objects.equals(this.osName, getDeviceAttributes.osName) && Objects.equals(this.osVersion, getDeviceAttributes.osVersion) && Objects.equals(this.pingStatus, getDeviceAttributes.pingStatus) && Objects.equals(this.productName, getDeviceAttributes.productName) && Objects.equals(this.serialNumber, getDeviceAttributes.serialNumber) && Objects.equals(this.status, getDeviceAttributes.status) && Objects.equals(this.subnet, getDeviceAttributes.subnet) && Objects.equals(this.sysObjectId, getDeviceAttributes.sysObjectId) && Objects.equals(this.tags, getDeviceAttributes.tags) && Objects.equals(this.vendor, getDeviceAttributes.vendor) && Objects.equals(this.version, getDeviceAttributes.version) && Objects.equals(this.additionalProperties, getDeviceAttributes.additionalProperties);
  }


  @Override
  public int hashCode() {
    return Objects.hash(description,deviceType,integration,ipAddress,location,model,name,osHostname,osName,osVersion,pingStatus,productName,serialNumber,status,subnet,sysObjectId,tags,vendor,version, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetDeviceAttributes {\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    deviceType: ").append(toIndentedString(deviceType)).append("\n");
    sb.append("    integration: ").append(toIndentedString(integration)).append("\n");
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
