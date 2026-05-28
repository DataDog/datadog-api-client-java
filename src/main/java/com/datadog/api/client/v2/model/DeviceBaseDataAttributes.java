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

/**
 * Common health and identity attributes shared by every End User Device Monitoring device record.
 */
@JsonPropertyOrder({
  DeviceBaseDataAttributes.JSON_PROPERTY_AGENT_KEY,
  DeviceBaseDataAttributes.JSON_PROPERTY_AGENT_VERSION,
  DeviceBaseDataAttributes.JSON_PROPERTY_BATTERY_MAX_CAPACITY_PCT,
  DeviceBaseDataAttributes.JSON_PROPERTY_CPU_CORES,
  DeviceBaseDataAttributes.JSON_PROPERTY_CPU_LOGICAL_PROCESSORS,
  DeviceBaseDataAttributes.JSON_PROPERTY_CPU_MODEL,
  DeviceBaseDataAttributes.JSON_PROPERTY_CPU_USAGE,
  DeviceBaseDataAttributes.JSON_PROPERTY_DISK_USAGE,
  DeviceBaseDataAttributes.JSON_PROPERTY_IP_ADDRESS,
  DeviceBaseDataAttributes.JSON_PROPERTY_ISSUES,
  DeviceBaseDataAttributes.JSON_PROPERTY_KERNEL_NAME,
  DeviceBaseDataAttributes.JSON_PROPERTY_LAST_SEEN,
  DeviceBaseDataAttributes.JSON_PROPERTY_MANUFACTURER,
  DeviceBaseDataAttributes.JSON_PROPERTY_MEM_USAGE,
  DeviceBaseDataAttributes.JSON_PROPERTY_MEMORY_TOTAL_KB,
  DeviceBaseDataAttributes.JSON_PROPERTY_MODEL_NAME,
  DeviceBaseDataAttributes.JSON_PROPERTY_MODEL_NUMBER,
  DeviceBaseDataAttributes.JSON_PROPERTY_OS,
  DeviceBaseDataAttributes.JSON_PROPERTY_OS_VERSION,
  DeviceBaseDataAttributes.JSON_PROPERTY_RESOURCE_ID,
  DeviceBaseDataAttributes.JSON_PROPERTY_SERIAL_NUMBER,
  DeviceBaseDataAttributes.JSON_PROPERTY_STATUS,
  DeviceBaseDataAttributes.JSON_PROPERTY_TYPE,
  DeviceBaseDataAttributes.JSON_PROPERTY_UPTIME,
  DeviceBaseDataAttributes.JSON_PROPERTY_WLAN_BSSID,
  DeviceBaseDataAttributes.JSON_PROPERTY_WLAN_RSSI,
  DeviceBaseDataAttributes.JSON_PROPERTY_WLAN_SSID
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class DeviceBaseDataAttributes {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_AGENT_KEY = "agent_key";
  private String agentKey;

  public static final String JSON_PROPERTY_AGENT_VERSION = "agent_version";
  private String agentVersion;

  public static final String JSON_PROPERTY_BATTERY_MAX_CAPACITY_PCT = "battery_max_capacity_pct";
  private Long batteryMaxCapacityPct;

  public static final String JSON_PROPERTY_CPU_CORES = "cpu_cores";
  private Long cpuCores;

  public static final String JSON_PROPERTY_CPU_LOGICAL_PROCESSORS = "cpu_logical_processors";
  private Long cpuLogicalProcessors;

  public static final String JSON_PROPERTY_CPU_MODEL = "cpu_model";
  private String cpuModel;

  public static final String JSON_PROPERTY_CPU_USAGE = "cpu_usage";
  private Double cpuUsage;

  public static final String JSON_PROPERTY_DISK_USAGE = "disk_usage";
  private Double diskUsage;

  public static final String JSON_PROPERTY_IP_ADDRESS = "ip_address";
  private String ipAddress;

  public static final String JSON_PROPERTY_ISSUES = "issues";
  private List<String> issues = null;

  public static final String JSON_PROPERTY_KERNEL_NAME = "kernel_name";
  private String kernelName;

  public static final String JSON_PROPERTY_LAST_SEEN = "last_seen";
  private String lastSeen;

  public static final String JSON_PROPERTY_MANUFACTURER = "manufacturer";
  private String manufacturer;

  public static final String JSON_PROPERTY_MEM_USAGE = "mem_usage";
  private Double memUsage;

  public static final String JSON_PROPERTY_MEMORY_TOTAL_KB = "memory_total_kb";
  private Long memoryTotalKb;

  public static final String JSON_PROPERTY_MODEL_NAME = "model_name";
  private String modelName;

  public static final String JSON_PROPERTY_MODEL_NUMBER = "model_number";
  private String modelNumber;

  public static final String JSON_PROPERTY_OS = "os";
  private String os;

  public static final String JSON_PROPERTY_OS_VERSION = "os_version";
  private String osVersion;

  public static final String JSON_PROPERTY_RESOURCE_ID = "resource_id";
  private String resourceId;

  public static final String JSON_PROPERTY_SERIAL_NUMBER = "serial_number";
  private String serialNumber;

  public static final String JSON_PROPERTY_STATUS = "status";
  private String status;

  public static final String JSON_PROPERTY_TYPE = "type";
  private String type;

  public static final String JSON_PROPERTY_UPTIME = "uptime";
  private Double uptime;

  public static final String JSON_PROPERTY_WLAN_BSSID = "wlan_bssid";
  private String wlanBssid;

  public static final String JSON_PROPERTY_WLAN_RSSI = "wlan_rssi";
  private Double wlanRssi;

  public static final String JSON_PROPERTY_WLAN_SSID = "wlan_ssid";
  private String wlanSsid;

  public DeviceBaseDataAttributes agentKey(String agentKey) {
    this.agentKey = agentKey;
    return this;
  }

  /**
   * Public key of the Datadog Agent installed on the device.
   *
   * @return agentKey
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_AGENT_KEY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getAgentKey() {
    return agentKey;
  }

  public void setAgentKey(String agentKey) {
    this.agentKey = agentKey;
  }

  public DeviceBaseDataAttributes agentVersion(String agentVersion) {
    this.agentVersion = agentVersion;
    return this;
  }

  /**
   * Version of the Datadog Agent installed on the device.
   *
   * @return agentVersion
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_AGENT_VERSION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getAgentVersion() {
    return agentVersion;
  }

  public void setAgentVersion(String agentVersion) {
    this.agentVersion = agentVersion;
  }

  public DeviceBaseDataAttributes batteryMaxCapacityPct(Long batteryMaxCapacityPct) {
    this.batteryMaxCapacityPct = batteryMaxCapacityPct;
    return this;
  }

  /**
   * Maximum battery capacity expressed as a percentage of the device's design capacity.
   *
   * @return batteryMaxCapacityPct
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_BATTERY_MAX_CAPACITY_PCT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getBatteryMaxCapacityPct() {
    return batteryMaxCapacityPct;
  }

  public void setBatteryMaxCapacityPct(Long batteryMaxCapacityPct) {
    this.batteryMaxCapacityPct = batteryMaxCapacityPct;
  }

  public DeviceBaseDataAttributes cpuCores(Long cpuCores) {
    this.cpuCores = cpuCores;
    return this;
  }

  /**
   * Number of physical CPU cores on the device.
   *
   * @return cpuCores
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CPU_CORES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getCpuCores() {
    return cpuCores;
  }

  public void setCpuCores(Long cpuCores) {
    this.cpuCores = cpuCores;
  }

  public DeviceBaseDataAttributes cpuLogicalProcessors(Long cpuLogicalProcessors) {
    this.cpuLogicalProcessors = cpuLogicalProcessors;
    return this;
  }

  /**
   * Number of logical CPU processors (hardware threads) on the device.
   *
   * @return cpuLogicalProcessors
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CPU_LOGICAL_PROCESSORS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getCpuLogicalProcessors() {
    return cpuLogicalProcessors;
  }

  public void setCpuLogicalProcessors(Long cpuLogicalProcessors) {
    this.cpuLogicalProcessors = cpuLogicalProcessors;
  }

  public DeviceBaseDataAttributes cpuModel(String cpuModel) {
    this.cpuModel = cpuModel;
    return this;
  }

  /**
   * Human-readable name of the device's CPU model.
   *
   * @return cpuModel
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CPU_MODEL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getCpuModel() {
    return cpuModel;
  }

  public void setCpuModel(String cpuModel) {
    this.cpuModel = cpuModel;
  }

  public DeviceBaseDataAttributes cpuUsage(Double cpuUsage) {
    this.cpuUsage = cpuUsage;
    return this;
  }

  /**
   * Average CPU usage on the device, as a percentage between 0 and 100.
   *
   * @return cpuUsage
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CPU_USAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getCpuUsage() {
    return cpuUsage;
  }

  public void setCpuUsage(Double cpuUsage) {
    this.cpuUsage = cpuUsage;
  }

  public DeviceBaseDataAttributes diskUsage(Double diskUsage) {
    this.diskUsage = diskUsage;
    return this;
  }

  /**
   * Average disk usage on the device, as a percentage between 0 and 100.
   *
   * @return diskUsage
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DISK_USAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getDiskUsage() {
    return diskUsage;
  }

  public void setDiskUsage(Double diskUsage) {
    this.diskUsage = diskUsage;
  }

  public DeviceBaseDataAttributes ipAddress(String ipAddress) {
    this.ipAddress = ipAddress;
    return this;
  }

  /**
   * Last observed IPv4 or IPv6 address of the device.
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

  public DeviceBaseDataAttributes issues(List<String> issues) {
    this.issues = issues;
    return this;
  }

  public DeviceBaseDataAttributes addIssuesItem(String issuesItem) {
    if (this.issues == null) {
      this.issues = new ArrayList<>();
    }
    this.issues.add(issuesItem);
    return this;
  }

  /**
   * List of issue identifiers currently affecting the device. References entries returned by the
   * issues endpoint.
   *
   * @return issues
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ISSUES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<String> getIssues() {
    return issues;
  }

  public void setIssues(List<String> issues) {
    this.issues = issues;
  }

  public DeviceBaseDataAttributes kernelName(String kernelName) {
    this.kernelName = kernelName;
    return this;
  }

  /**
   * Name of the operating system kernel running on the device.
   *
   * @return kernelName
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_KERNEL_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getKernelName() {
    return kernelName;
  }

  public void setKernelName(String kernelName) {
    this.kernelName = kernelName;
  }

  public DeviceBaseDataAttributes lastSeen(String lastSeen) {
    this.lastSeen = lastSeen;
    return this;
  }

  /**
   * Timestamp of the most recent telemetry received from the device, in RFC 3339 format.
   *
   * @return lastSeen
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LAST_SEEN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getLastSeen() {
    return lastSeen;
  }

  public void setLastSeen(String lastSeen) {
    this.lastSeen = lastSeen;
  }

  public DeviceBaseDataAttributes manufacturer(String manufacturer) {
    this.manufacturer = manufacturer;
    return this;
  }

  /**
   * Manufacturer of the device.
   *
   * @return manufacturer
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_MANUFACTURER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getManufacturer() {
    return manufacturer;
  }

  public void setManufacturer(String manufacturer) {
    this.manufacturer = manufacturer;
  }

  public DeviceBaseDataAttributes memUsage(Double memUsage) {
    this.memUsage = memUsage;
    return this;
  }

  /**
   * Average memory usage on the device, as a percentage between 0 and 100.
   *
   * @return memUsage
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_MEM_USAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getMemUsage() {
    return memUsage;
  }

  public void setMemUsage(Double memUsage) {
    this.memUsage = memUsage;
  }

  public DeviceBaseDataAttributes memoryTotalKb(Long memoryTotalKb) {
    this.memoryTotalKb = memoryTotalKb;
    return this;
  }

  /**
   * Total amount of physical memory available on the device, in kilobytes.
   *
   * @return memoryTotalKb
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_MEMORY_TOTAL_KB)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getMemoryTotalKb() {
    return memoryTotalKb;
  }

  public void setMemoryTotalKb(Long memoryTotalKb) {
    this.memoryTotalKb = memoryTotalKb;
  }

  public DeviceBaseDataAttributes modelName(String modelName) {
    this.modelName = modelName;
    return this;
  }

  /**
   * Marketing or product name of the device model.
   *
   * @return modelName
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_MODEL_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getModelName() {
    return modelName;
  }

  public void setModelName(String modelName) {
    this.modelName = modelName;
  }

  public DeviceBaseDataAttributes modelNumber(String modelNumber) {
    this.modelNumber = modelNumber;
    return this;
  }

  /**
   * Manufacturer-assigned model number of the device.
   *
   * @return modelNumber
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_MODEL_NUMBER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getModelNumber() {
    return modelNumber;
  }

  public void setModelNumber(String modelNumber) {
    this.modelNumber = modelNumber;
  }

  public DeviceBaseDataAttributes os(String os) {
    this.os = os;
    return this;
  }

  /**
   * Operating system family running on the device (for example, <code>mac</code>, <code>windows
   * </code>, or <code>linux</code>).
   *
   * @return os
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_OS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getOs() {
    return os;
  }

  public void setOs(String os) {
    this.os = os;
  }

  public DeviceBaseDataAttributes osVersion(String osVersion) {
    this.osVersion = osVersion;
    return this;
  }

  /**
   * Operating system version running on the device.
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

  public DeviceBaseDataAttributes resourceId(String resourceId) {
    this.resourceId = resourceId;
    return this;
  }

  /**
   * Datadog resource identifier for the device.
   *
   * @return resourceId
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_RESOURCE_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getResourceId() {
    return resourceId;
  }

  public void setResourceId(String resourceId) {
    this.resourceId = resourceId;
  }

  public DeviceBaseDataAttributes serialNumber(String serialNumber) {
    this.serialNumber = serialNumber;
    return this;
  }

  /**
   * Serial number assigned to the device by its manufacturer.
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

  public DeviceBaseDataAttributes status(String status) {
    this.status = status;
    return this;
  }

  /**
   * Health status of the device computed from its issues and recent telemetry.
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

  public DeviceBaseDataAttributes type(String type) {
    this.type = type;
    return this;
  }

  /**
   * Hardware type of the device (for example, <code>laptop</code>, <code>desktop</code>, or <code>
   * mobile</code>).
   *
   * @return type
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public DeviceBaseDataAttributes uptime(Double uptime) {
    this.uptime = uptime;
    return this;
  }

  /**
   * Time elapsed since the device last booted, in seconds.
   *
   * @return uptime
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_UPTIME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getUptime() {
    return uptime;
  }

  public void setUptime(Double uptime) {
    this.uptime = uptime;
  }

  public DeviceBaseDataAttributes wlanBssid(String wlanBssid) {
    this.wlanBssid = wlanBssid;
    return this;
  }

  /**
   * BSSID (MAC address of the access point) of the wireless network the device is currently
   * connected to.
   *
   * @return wlanBssid
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_WLAN_BSSID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getWlanBssid() {
    return wlanBssid;
  }

  public void setWlanBssid(String wlanBssid) {
    this.wlanBssid = wlanBssid;
  }

  public DeviceBaseDataAttributes wlanRssi(Double wlanRssi) {
    this.wlanRssi = wlanRssi;
    return this;
  }

  /**
   * Received signal strength indicator of the device's current wireless connection, in dBm.
   *
   * @return wlanRssi
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_WLAN_RSSI)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getWlanRssi() {
    return wlanRssi;
  }

  public void setWlanRssi(Double wlanRssi) {
    this.wlanRssi = wlanRssi;
  }

  public DeviceBaseDataAttributes wlanSsid(String wlanSsid) {
    this.wlanSsid = wlanSsid;
    return this;
  }

  /**
   * SSID of the wireless network the device is currently connected to.
   *
   * @return wlanSsid
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_WLAN_SSID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getWlanSsid() {
    return wlanSsid;
  }

  public void setWlanSsid(String wlanSsid) {
    this.wlanSsid = wlanSsid;
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
   * @return DeviceBaseDataAttributes
   */
  @JsonAnySetter
  public DeviceBaseDataAttributes putAdditionalProperty(String key, Object value) {
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

  /** Return true if this DeviceBaseDataAttributes object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DeviceBaseDataAttributes deviceBaseDataAttributes = (DeviceBaseDataAttributes) o;
    return Objects.equals(this.agentKey, deviceBaseDataAttributes.agentKey)
        && Objects.equals(this.agentVersion, deviceBaseDataAttributes.agentVersion)
        && Objects.equals(
            this.batteryMaxCapacityPct, deviceBaseDataAttributes.batteryMaxCapacityPct)
        && Objects.equals(this.cpuCores, deviceBaseDataAttributes.cpuCores)
        && Objects.equals(this.cpuLogicalProcessors, deviceBaseDataAttributes.cpuLogicalProcessors)
        && Objects.equals(this.cpuModel, deviceBaseDataAttributes.cpuModel)
        && Objects.equals(this.cpuUsage, deviceBaseDataAttributes.cpuUsage)
        && Objects.equals(this.diskUsage, deviceBaseDataAttributes.diskUsage)
        && Objects.equals(this.ipAddress, deviceBaseDataAttributes.ipAddress)
        && Objects.equals(this.issues, deviceBaseDataAttributes.issues)
        && Objects.equals(this.kernelName, deviceBaseDataAttributes.kernelName)
        && Objects.equals(this.lastSeen, deviceBaseDataAttributes.lastSeen)
        && Objects.equals(this.manufacturer, deviceBaseDataAttributes.manufacturer)
        && Objects.equals(this.memUsage, deviceBaseDataAttributes.memUsage)
        && Objects.equals(this.memoryTotalKb, deviceBaseDataAttributes.memoryTotalKb)
        && Objects.equals(this.modelName, deviceBaseDataAttributes.modelName)
        && Objects.equals(this.modelNumber, deviceBaseDataAttributes.modelNumber)
        && Objects.equals(this.os, deviceBaseDataAttributes.os)
        && Objects.equals(this.osVersion, deviceBaseDataAttributes.osVersion)
        && Objects.equals(this.resourceId, deviceBaseDataAttributes.resourceId)
        && Objects.equals(this.serialNumber, deviceBaseDataAttributes.serialNumber)
        && Objects.equals(this.status, deviceBaseDataAttributes.status)
        && Objects.equals(this.type, deviceBaseDataAttributes.type)
        && Objects.equals(this.uptime, deviceBaseDataAttributes.uptime)
        && Objects.equals(this.wlanBssid, deviceBaseDataAttributes.wlanBssid)
        && Objects.equals(this.wlanRssi, deviceBaseDataAttributes.wlanRssi)
        && Objects.equals(this.wlanSsid, deviceBaseDataAttributes.wlanSsid)
        && Objects.equals(this.additionalProperties, deviceBaseDataAttributes.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        agentKey,
        agentVersion,
        batteryMaxCapacityPct,
        cpuCores,
        cpuLogicalProcessors,
        cpuModel,
        cpuUsage,
        diskUsage,
        ipAddress,
        issues,
        kernelName,
        lastSeen,
        manufacturer,
        memUsage,
        memoryTotalKb,
        modelName,
        modelNumber,
        os,
        osVersion,
        resourceId,
        serialNumber,
        status,
        type,
        uptime,
        wlanBssid,
        wlanRssi,
        wlanSsid,
        additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DeviceBaseDataAttributes {\n");
    sb.append("    agentKey: ").append(toIndentedString(agentKey)).append("\n");
    sb.append("    agentVersion: ").append(toIndentedString(agentVersion)).append("\n");
    sb.append("    batteryMaxCapacityPct: ")
        .append(toIndentedString(batteryMaxCapacityPct))
        .append("\n");
    sb.append("    cpuCores: ").append(toIndentedString(cpuCores)).append("\n");
    sb.append("    cpuLogicalProcessors: ")
        .append(toIndentedString(cpuLogicalProcessors))
        .append("\n");
    sb.append("    cpuModel: ").append(toIndentedString(cpuModel)).append("\n");
    sb.append("    cpuUsage: ").append(toIndentedString(cpuUsage)).append("\n");
    sb.append("    diskUsage: ").append(toIndentedString(diskUsage)).append("\n");
    sb.append("    ipAddress: ").append(toIndentedString(ipAddress)).append("\n");
    sb.append("    issues: ").append(toIndentedString(issues)).append("\n");
    sb.append("    kernelName: ").append(toIndentedString(kernelName)).append("\n");
    sb.append("    lastSeen: ").append(toIndentedString(lastSeen)).append("\n");
    sb.append("    manufacturer: ").append(toIndentedString(manufacturer)).append("\n");
    sb.append("    memUsage: ").append(toIndentedString(memUsage)).append("\n");
    sb.append("    memoryTotalKb: ").append(toIndentedString(memoryTotalKb)).append("\n");
    sb.append("    modelName: ").append(toIndentedString(modelName)).append("\n");
    sb.append("    modelNumber: ").append(toIndentedString(modelNumber)).append("\n");
    sb.append("    os: ").append(toIndentedString(os)).append("\n");
    sb.append("    osVersion: ").append(toIndentedString(osVersion)).append("\n");
    sb.append("    resourceId: ").append(toIndentedString(resourceId)).append("\n");
    sb.append("    serialNumber: ").append(toIndentedString(serialNumber)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    uptime: ").append(toIndentedString(uptime)).append("\n");
    sb.append("    wlanBssid: ").append(toIndentedString(wlanBssid)).append("\n");
    sb.append("    wlanRssi: ").append(toIndentedString(wlanRssi)).append("\n");
    sb.append("    wlanSsid: ").append(toIndentedString(wlanSsid)).append("\n");
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
