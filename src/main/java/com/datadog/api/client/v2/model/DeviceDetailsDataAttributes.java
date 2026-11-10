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
 * Extended set of attributes for a single End User Device Monitoring device, including Cloud
 * Network Monitoring and battery metrics.
 */
@JsonPropertyOrder({
  DeviceDetailsDataAttributes.JSON_PROPERTY_AGENT_KEY,
  DeviceDetailsDataAttributes.JSON_PROPERTY_AGENT_VERSION,
  DeviceDetailsDataAttributes.JSON_PROPERTY_BATTERY_CHARGE_PCT,
  DeviceDetailsDataAttributes.JSON_PROPERTY_BATTERY_CHARGE_RATE,
  DeviceDetailsDataAttributes.JSON_PROPERTY_BATTERY_CRITICAL,
  DeviceDetailsDataAttributes.JSON_PROPERTY_BATTERY_CYCLE_COUNT,
  DeviceDetailsDataAttributes.JSON_PROPERTY_BATTERY_MAX_CAPACITY_PCT,
  DeviceDetailsDataAttributes.JSON_PROPERTY_CNM_ENABLED,
  DeviceDetailsDataAttributes.JSON_PROPERTY_CPU_CORES,
  DeviceDetailsDataAttributes.JSON_PROPERTY_CPU_LOGICAL_PROCESSORS,
  DeviceDetailsDataAttributes.JSON_PROPERTY_CPU_MODEL,
  DeviceDetailsDataAttributes.JSON_PROPERTY_CPU_USAGE,
  DeviceDetailsDataAttributes.JSON_PROPERTY_DISK_USAGE,
  DeviceDetailsDataAttributes.JSON_PROPERTY_EMPLOYEE,
  DeviceDetailsDataAttributes.JSON_PROPERTY_GEO_IP,
  DeviceDetailsDataAttributes.JSON_PROPERTY_IP_ADDRESS,
  DeviceDetailsDataAttributes.JSON_PROPERTY_ISSUES,
  DeviceDetailsDataAttributes.JSON_PROPERTY_KERNEL_NAME,
  DeviceDetailsDataAttributes.JSON_PROPERTY_LAST_REBOOT,
  DeviceDetailsDataAttributes.JSON_PROPERTY_LAST_SEEN,
  DeviceDetailsDataAttributes.JSON_PROPERTY_MANUFACTURER,
  DeviceDetailsDataAttributes.JSON_PROPERTY_MEM_USAGE,
  DeviceDetailsDataAttributes.JSON_PROPERTY_MEMORY_TOTAL_KB,
  DeviceDetailsDataAttributes.JSON_PROPERTY_MODEL_NAME,
  DeviceDetailsDataAttributes.JSON_PROPERTY_MODEL_NUMBER,
  DeviceDetailsDataAttributes.JSON_PROPERTY_OS,
  DeviceDetailsDataAttributes.JSON_PROPERTY_OS_VERSION,
  DeviceDetailsDataAttributes.JSON_PROPERTY_PACKET_SENT,
  DeviceDetailsDataAttributes.JSON_PROPERTY_RESOURCE_ID,
  DeviceDetailsDataAttributes.JSON_PROPERTY_RETRANSMIT,
  DeviceDetailsDataAttributes.JSON_PROPERTY_RETRANSMIT_PCT,
  DeviceDetailsDataAttributes.JSON_PROPERTY_SERIAL_NUMBER,
  DeviceDetailsDataAttributes.JSON_PROPERTY_STATUS,
  DeviceDetailsDataAttributes.JSON_PROPERTY_TCP_CANCELED,
  DeviceDetailsDataAttributes.JSON_PROPERTY_TCP_ESTABLISHED,
  DeviceDetailsDataAttributes.JSON_PROPERTY_TCP_ESTABLISHMENT_FAILURE_PCT,
  DeviceDetailsDataAttributes.JSON_PROPERTY_TCP_ESTABLISHMENT_FAILURES,
  DeviceDetailsDataAttributes.JSON_PROPERTY_TCP_HOST_UNREACHABLE,
  DeviceDetailsDataAttributes.JSON_PROPERTY_TCP_NETWORK_UNREACHABLE,
  DeviceDetailsDataAttributes.JSON_PROPERTY_TCP_REFUSALS,
  DeviceDetailsDataAttributes.JSON_PROPERTY_TCP_TIMEOUTS,
  DeviceDetailsDataAttributes.JSON_PROPERTY_TYPE,
  DeviceDetailsDataAttributes.JSON_PROPERTY_UPTIME,
  DeviceDetailsDataAttributes.JSON_PROPERTY_WLAN_BSSID,
  DeviceDetailsDataAttributes.JSON_PROPERTY_WLAN_RSSI,
  DeviceDetailsDataAttributes.JSON_PROPERTY_WLAN_SSID
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class DeviceDetailsDataAttributes {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_AGENT_KEY = "agent_key";
  private String agentKey;

  public static final String JSON_PROPERTY_AGENT_VERSION = "agent_version";
  private String agentVersion;

  public static final String JSON_PROPERTY_BATTERY_CHARGE_PCT = "battery_charge_pct";
  private Long batteryChargePct;

  public static final String JSON_PROPERTY_BATTERY_CHARGE_RATE = "battery_charge_rate";
  private Long batteryChargeRate;

  public static final String JSON_PROPERTY_BATTERY_CRITICAL = "battery_critical";
  private Boolean batteryCritical;

  public static final String JSON_PROPERTY_BATTERY_CYCLE_COUNT = "battery_cycle_count";
  private Long batteryCycleCount;

  public static final String JSON_PROPERTY_BATTERY_MAX_CAPACITY_PCT = "battery_max_capacity_pct";
  private Long batteryMaxCapacityPct;

  public static final String JSON_PROPERTY_CNM_ENABLED = "cnm_enabled";
  private Boolean cnmEnabled;

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

  public static final String JSON_PROPERTY_EMPLOYEE = "employee";
  private DeviceEmployee employee;

  public static final String JSON_PROPERTY_GEO_IP = "geo_ip";
  private DeviceGeoIP geoIp;

  public static final String JSON_PROPERTY_IP_ADDRESS = "ip_address";
  private String ipAddress;

  public static final String JSON_PROPERTY_ISSUES = "issues";
  private List<String> issues = null;

  public static final String JSON_PROPERTY_KERNEL_NAME = "kernel_name";
  private String kernelName;

  public static final String JSON_PROPERTY_LAST_REBOOT = "last_reboot";
  private String lastReboot;

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

  public static final String JSON_PROPERTY_PACKET_SENT = "packet_sent";
  private Double packetSent;

  public static final String JSON_PROPERTY_RESOURCE_ID = "resource_id";
  private String resourceId;

  public static final String JSON_PROPERTY_RETRANSMIT = "retransmit";
  private Double retransmit;

  public static final String JSON_PROPERTY_RETRANSMIT_PCT = "retransmit_pct";
  private Double retransmitPct;

  public static final String JSON_PROPERTY_SERIAL_NUMBER = "serial_number";
  private String serialNumber;

  public static final String JSON_PROPERTY_STATUS = "status";
  private DeviceStatus status;

  public static final String JSON_PROPERTY_TCP_CANCELED = "tcp_canceled";
  private Double tcpCanceled;

  public static final String JSON_PROPERTY_TCP_ESTABLISHED = "tcp_established";
  private Double tcpEstablished;

  public static final String JSON_PROPERTY_TCP_ESTABLISHMENT_FAILURE_PCT =
      "tcp_establishment_failure_pct";
  private Double tcpEstablishmentFailurePct;

  public static final String JSON_PROPERTY_TCP_ESTABLISHMENT_FAILURES =
      "tcp_establishment_failures";
  private Double tcpEstablishmentFailures;

  public static final String JSON_PROPERTY_TCP_HOST_UNREACHABLE = "tcp_host_unreachable";
  private Double tcpHostUnreachable;

  public static final String JSON_PROPERTY_TCP_NETWORK_UNREACHABLE = "tcp_network_unreachable";
  private Double tcpNetworkUnreachable;

  public static final String JSON_PROPERTY_TCP_REFUSALS = "tcp_refusals";
  private Double tcpRefusals;

  public static final String JSON_PROPERTY_TCP_TIMEOUTS = "tcp_timeouts";
  private Double tcpTimeouts;

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

  public DeviceDetailsDataAttributes agentKey(String agentKey) {
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

  public DeviceDetailsDataAttributes agentVersion(String agentVersion) {
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

  public DeviceDetailsDataAttributes batteryChargePct(Long batteryChargePct) {
    this.batteryChargePct = batteryChargePct;
    return this;
  }

  /**
   * Current battery charge level as a percentage between 0 and 100.
   *
   * @return batteryChargePct
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_BATTERY_CHARGE_PCT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getBatteryChargePct() {
    return batteryChargePct;
  }

  public void setBatteryChargePct(Long batteryChargePct) {
    this.batteryChargePct = batteryChargePct;
  }

  public DeviceDetailsDataAttributes batteryChargeRate(Long batteryChargeRate) {
    this.batteryChargeRate = batteryChargeRate;
    return this;
  }

  /**
   * Rate at which the battery is charging or discharging, in milliamperes. Negative values indicate
   * discharge.
   *
   * @return batteryChargeRate
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_BATTERY_CHARGE_RATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getBatteryChargeRate() {
    return batteryChargeRate;
  }

  public void setBatteryChargeRate(Long batteryChargeRate) {
    this.batteryChargeRate = batteryChargeRate;
  }

  public DeviceDetailsDataAttributes batteryCritical(Boolean batteryCritical) {
    this.batteryCritical = batteryCritical;
    return this;
  }

  /**
   * Whether the device's battery health has degraded to a critical level.
   *
   * @return batteryCritical
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_BATTERY_CRITICAL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getBatteryCritical() {
    return batteryCritical;
  }

  public void setBatteryCritical(Boolean batteryCritical) {
    this.batteryCritical = batteryCritical;
  }

  public DeviceDetailsDataAttributes batteryCycleCount(Long batteryCycleCount) {
    this.batteryCycleCount = batteryCycleCount;
    return this;
  }

  /**
   * Number of full charge cycles the battery has gone through.
   *
   * @return batteryCycleCount
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_BATTERY_CYCLE_COUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getBatteryCycleCount() {
    return batteryCycleCount;
  }

  public void setBatteryCycleCount(Long batteryCycleCount) {
    this.batteryCycleCount = batteryCycleCount;
  }

  public DeviceDetailsDataAttributes batteryMaxCapacityPct(Long batteryMaxCapacityPct) {
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

  public DeviceDetailsDataAttributes cnmEnabled(Boolean cnmEnabled) {
    this.cnmEnabled = cnmEnabled;
    return this;
  }

  /**
   * Whether Cloud Network Monitoring is enabled on the device.
   *
   * @return cnmEnabled
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CNM_ENABLED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getCnmEnabled() {
    return cnmEnabled;
  }

  public void setCnmEnabled(Boolean cnmEnabled) {
    this.cnmEnabled = cnmEnabled;
  }

  public DeviceDetailsDataAttributes cpuCores(Long cpuCores) {
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

  public DeviceDetailsDataAttributes cpuLogicalProcessors(Long cpuLogicalProcessors) {
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

  public DeviceDetailsDataAttributes cpuModel(String cpuModel) {
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

  public DeviceDetailsDataAttributes cpuUsage(Double cpuUsage) {
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

  public DeviceDetailsDataAttributes diskUsage(Double diskUsage) {
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

  public DeviceDetailsDataAttributes employee(DeviceEmployee employee) {
    this.employee = employee;
    this.unparsed |= employee.unparsed;
    return this;
  }

  /**
   * Directory information about the employee associated with the device, sourced from a customer
   * reference table. Absent when no reference table is configured or the device has no match.
   *
   * @return employee
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_EMPLOYEE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public DeviceEmployee getEmployee() {
    return employee;
  }

  public void setEmployee(DeviceEmployee employee) {
    this.employee = employee;
    if (employee != null) {
      this.unparsed |= employee.unparsed;
    }
  }

  public DeviceDetailsDataAttributes geoIp(DeviceGeoIP geoIp) {
    this.geoIp = geoIp;
    this.unparsed |= geoIp.unparsed;
    return this;
  }

  /**
   * Location derived from the device's public IP address. Absent when no location data is
   * available.
   *
   * @return geoIp
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_GEO_IP)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public DeviceGeoIP getGeoIp() {
    return geoIp;
  }

  public void setGeoIp(DeviceGeoIP geoIp) {
    this.geoIp = geoIp;
    if (geoIp != null) {
      this.unparsed |= geoIp.unparsed;
    }
  }

  public DeviceDetailsDataAttributes ipAddress(String ipAddress) {
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

  public DeviceDetailsDataAttributes issues(List<String> issues) {
    this.issues = issues;
    return this;
  }

  public DeviceDetailsDataAttributes addIssuesItem(String issuesItem) {
    if (this.issues == null) {
      this.issues = new ArrayList<>();
    }
    this.issues.add(issuesItem);
    return this;
  }

  /**
   * List of issue identifiers currently affecting the device.
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

  public DeviceDetailsDataAttributes kernelName(String kernelName) {
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

  public DeviceDetailsDataAttributes lastReboot(String lastReboot) {
    this.lastReboot = lastReboot;
    return this;
  }

  /**
   * Timestamp of the most recent device reboot, in RFC 3339 format.
   *
   * @return lastReboot
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LAST_REBOOT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getLastReboot() {
    return lastReboot;
  }

  public void setLastReboot(String lastReboot) {
    this.lastReboot = lastReboot;
  }

  public DeviceDetailsDataAttributes lastSeen(String lastSeen) {
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

  public DeviceDetailsDataAttributes manufacturer(String manufacturer) {
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

  public DeviceDetailsDataAttributes memUsage(Double memUsage) {
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

  public DeviceDetailsDataAttributes memoryTotalKb(Long memoryTotalKb) {
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

  public DeviceDetailsDataAttributes modelName(String modelName) {
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

  public DeviceDetailsDataAttributes modelNumber(String modelNumber) {
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

  public DeviceDetailsDataAttributes os(String os) {
    this.os = os;
    return this;
  }

  /**
   * Operating system family running on the device, as reported by the Datadog Agent (for example,
   * <code>macOS</code>, <code>Windows</code>, or <code>linux</code>). Empty when unknown.
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

  public DeviceDetailsDataAttributes osVersion(String osVersion) {
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

  public DeviceDetailsDataAttributes packetSent(Double packetSent) {
    this.packetSent = packetSent;
    return this;
  }

  /**
   * Number of TCP packets sent by the device over the query window, as reported by Cloud Network
   * Monitoring.
   *
   * @return packetSent
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PACKET_SENT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getPacketSent() {
    return packetSent;
  }

  public void setPacketSent(Double packetSent) {
    this.packetSent = packetSent;
  }

  public DeviceDetailsDataAttributes resourceId(String resourceId) {
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

  public DeviceDetailsDataAttributes retransmit(Double retransmit) {
    this.retransmit = retransmit;
    return this;
  }

  /**
   * Number of TCP packets retransmitted by the device over the query window.
   *
   * @return retransmit
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_RETRANSMIT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getRetransmit() {
    return retransmit;
  }

  public void setRetransmit(Double retransmit) {
    this.retransmit = retransmit;
  }

  public DeviceDetailsDataAttributes retransmitPct(Double retransmitPct) {
    this.retransmitPct = retransmitPct;
    return this;
  }

  /**
   * Percentage of sent TCP packets that were retransmitted, between 0 and 100.
   *
   * @return retransmitPct
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_RETRANSMIT_PCT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getRetransmitPct() {
    return retransmitPct;
  }

  public void setRetransmitPct(Double retransmitPct) {
    this.retransmitPct = retransmitPct;
  }

  public DeviceDetailsDataAttributes serialNumber(String serialNumber) {
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

  public DeviceDetailsDataAttributes status(DeviceStatus status) {
    this.status = status;
    this.unparsed |= !status.isValid();
    return this;
  }

  /**
   * Health status of the device, computed from its issues and recent telemetry. <code>inactive
   * </code> means the device stopped reporting. <code>unknown</code> means no telemetry is
   * available yet.
   *
   * @return status
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public DeviceStatus getStatus() {
    return status;
  }

  public void setStatus(DeviceStatus status) {
    if (!status.isValid()) {
      this.unparsed = true;
    }
    this.status = status;
  }

  public DeviceDetailsDataAttributes tcpCanceled(Double tcpCanceled) {
    this.tcpCanceled = tcpCanceled;
    return this;
  }

  /**
   * Number of TCP connection attempts canceled by the device over the query window.
   *
   * @return tcpCanceled
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TCP_CANCELED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getTcpCanceled() {
    return tcpCanceled;
  }

  public void setTcpCanceled(Double tcpCanceled) {
    this.tcpCanceled = tcpCanceled;
  }

  public DeviceDetailsDataAttributes tcpEstablished(Double tcpEstablished) {
    this.tcpEstablished = tcpEstablished;
    return this;
  }

  /**
   * Number of TCP connections established by the device over the query window.
   *
   * @return tcpEstablished
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TCP_ESTABLISHED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getTcpEstablished() {
    return tcpEstablished;
  }

  public void setTcpEstablished(Double tcpEstablished) {
    this.tcpEstablished = tcpEstablished;
  }

  public DeviceDetailsDataAttributes tcpEstablishmentFailurePct(Double tcpEstablishmentFailurePct) {
    this.tcpEstablishmentFailurePct = tcpEstablishmentFailurePct;
    return this;
  }

  /**
   * Percentage of TCP connection attempts that failed, between 0 and 100.
   *
   * @return tcpEstablishmentFailurePct
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TCP_ESTABLISHMENT_FAILURE_PCT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getTcpEstablishmentFailurePct() {
    return tcpEstablishmentFailurePct;
  }

  public void setTcpEstablishmentFailurePct(Double tcpEstablishmentFailurePct) {
    this.tcpEstablishmentFailurePct = tcpEstablishmentFailurePct;
  }

  public DeviceDetailsDataAttributes tcpEstablishmentFailures(Double tcpEstablishmentFailures) {
    this.tcpEstablishmentFailures = tcpEstablishmentFailures;
    return this;
  }

  /**
   * Number of TCP connection attempts that failed over the query window.
   *
   * @return tcpEstablishmentFailures
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TCP_ESTABLISHMENT_FAILURES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getTcpEstablishmentFailures() {
    return tcpEstablishmentFailures;
  }

  public void setTcpEstablishmentFailures(Double tcpEstablishmentFailures) {
    this.tcpEstablishmentFailures = tcpEstablishmentFailures;
  }

  public DeviceDetailsDataAttributes tcpHostUnreachable(Double tcpHostUnreachable) {
    this.tcpHostUnreachable = tcpHostUnreachable;
    return this;
  }

  /**
   * Number of TCP connection attempts that failed because the host was unreachable.
   *
   * @return tcpHostUnreachable
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TCP_HOST_UNREACHABLE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getTcpHostUnreachable() {
    return tcpHostUnreachable;
  }

  public void setTcpHostUnreachable(Double tcpHostUnreachable) {
    this.tcpHostUnreachable = tcpHostUnreachable;
  }

  public DeviceDetailsDataAttributes tcpNetworkUnreachable(Double tcpNetworkUnreachable) {
    this.tcpNetworkUnreachable = tcpNetworkUnreachable;
    return this;
  }

  /**
   * Number of TCP connection attempts that failed because the network was unreachable.
   *
   * @return tcpNetworkUnreachable
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TCP_NETWORK_UNREACHABLE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getTcpNetworkUnreachable() {
    return tcpNetworkUnreachable;
  }

  public void setTcpNetworkUnreachable(Double tcpNetworkUnreachable) {
    this.tcpNetworkUnreachable = tcpNetworkUnreachable;
  }

  public DeviceDetailsDataAttributes tcpRefusals(Double tcpRefusals) {
    this.tcpRefusals = tcpRefusals;
    return this;
  }

  /**
   * Number of TCP connection attempts refused by the remote host over the query window.
   *
   * @return tcpRefusals
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TCP_REFUSALS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getTcpRefusals() {
    return tcpRefusals;
  }

  public void setTcpRefusals(Double tcpRefusals) {
    this.tcpRefusals = tcpRefusals;
  }

  public DeviceDetailsDataAttributes tcpTimeouts(Double tcpTimeouts) {
    this.tcpTimeouts = tcpTimeouts;
    return this;
  }

  /**
   * Number of TCP connection attempts that timed out over the query window.
   *
   * @return tcpTimeouts
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TCP_TIMEOUTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getTcpTimeouts() {
    return tcpTimeouts;
  }

  public void setTcpTimeouts(Double tcpTimeouts) {
    this.tcpTimeouts = tcpTimeouts;
  }

  public DeviceDetailsDataAttributes type(String type) {
    this.type = type;
    return this;
  }

  /**
   * Hardware type of the device (for example, <code>laptop</code> or <code>desktop</code>). <code>
   * unknown</code> when the type cannot be determined.
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

  public DeviceDetailsDataAttributes uptime(Double uptime) {
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

  public DeviceDetailsDataAttributes wlanBssid(String wlanBssid) {
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

  public DeviceDetailsDataAttributes wlanRssi(Double wlanRssi) {
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

  public DeviceDetailsDataAttributes wlanSsid(String wlanSsid) {
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
   * @return DeviceDetailsDataAttributes
   */
  @JsonAnySetter
  public DeviceDetailsDataAttributes putAdditionalProperty(String key, Object value) {
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

  /** Return true if this DeviceDetailsDataAttributes object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DeviceDetailsDataAttributes deviceDetailsDataAttributes = (DeviceDetailsDataAttributes) o;
    return Objects.equals(this.agentKey, deviceDetailsDataAttributes.agentKey)
        && Objects.equals(this.agentVersion, deviceDetailsDataAttributes.agentVersion)
        && Objects.equals(this.batteryChargePct, deviceDetailsDataAttributes.batteryChargePct)
        && Objects.equals(this.batteryChargeRate, deviceDetailsDataAttributes.batteryChargeRate)
        && Objects.equals(this.batteryCritical, deviceDetailsDataAttributes.batteryCritical)
        && Objects.equals(this.batteryCycleCount, deviceDetailsDataAttributes.batteryCycleCount)
        && Objects.equals(
            this.batteryMaxCapacityPct, deviceDetailsDataAttributes.batteryMaxCapacityPct)
        && Objects.equals(this.cnmEnabled, deviceDetailsDataAttributes.cnmEnabled)
        && Objects.equals(this.cpuCores, deviceDetailsDataAttributes.cpuCores)
        && Objects.equals(
            this.cpuLogicalProcessors, deviceDetailsDataAttributes.cpuLogicalProcessors)
        && Objects.equals(this.cpuModel, deviceDetailsDataAttributes.cpuModel)
        && Objects.equals(this.cpuUsage, deviceDetailsDataAttributes.cpuUsage)
        && Objects.equals(this.diskUsage, deviceDetailsDataAttributes.diskUsage)
        && Objects.equals(this.employee, deviceDetailsDataAttributes.employee)
        && Objects.equals(this.geoIp, deviceDetailsDataAttributes.geoIp)
        && Objects.equals(this.ipAddress, deviceDetailsDataAttributes.ipAddress)
        && Objects.equals(this.issues, deviceDetailsDataAttributes.issues)
        && Objects.equals(this.kernelName, deviceDetailsDataAttributes.kernelName)
        && Objects.equals(this.lastReboot, deviceDetailsDataAttributes.lastReboot)
        && Objects.equals(this.lastSeen, deviceDetailsDataAttributes.lastSeen)
        && Objects.equals(this.manufacturer, deviceDetailsDataAttributes.manufacturer)
        && Objects.equals(this.memUsage, deviceDetailsDataAttributes.memUsage)
        && Objects.equals(this.memoryTotalKb, deviceDetailsDataAttributes.memoryTotalKb)
        && Objects.equals(this.modelName, deviceDetailsDataAttributes.modelName)
        && Objects.equals(this.modelNumber, deviceDetailsDataAttributes.modelNumber)
        && Objects.equals(this.os, deviceDetailsDataAttributes.os)
        && Objects.equals(this.osVersion, deviceDetailsDataAttributes.osVersion)
        && Objects.equals(this.packetSent, deviceDetailsDataAttributes.packetSent)
        && Objects.equals(this.resourceId, deviceDetailsDataAttributes.resourceId)
        && Objects.equals(this.retransmit, deviceDetailsDataAttributes.retransmit)
        && Objects.equals(this.retransmitPct, deviceDetailsDataAttributes.retransmitPct)
        && Objects.equals(this.serialNumber, deviceDetailsDataAttributes.serialNumber)
        && Objects.equals(this.status, deviceDetailsDataAttributes.status)
        && Objects.equals(this.tcpCanceled, deviceDetailsDataAttributes.tcpCanceled)
        && Objects.equals(this.tcpEstablished, deviceDetailsDataAttributes.tcpEstablished)
        && Objects.equals(
            this.tcpEstablishmentFailurePct, deviceDetailsDataAttributes.tcpEstablishmentFailurePct)
        && Objects.equals(
            this.tcpEstablishmentFailures, deviceDetailsDataAttributes.tcpEstablishmentFailures)
        && Objects.equals(this.tcpHostUnreachable, deviceDetailsDataAttributes.tcpHostUnreachable)
        && Objects.equals(
            this.tcpNetworkUnreachable, deviceDetailsDataAttributes.tcpNetworkUnreachable)
        && Objects.equals(this.tcpRefusals, deviceDetailsDataAttributes.tcpRefusals)
        && Objects.equals(this.tcpTimeouts, deviceDetailsDataAttributes.tcpTimeouts)
        && Objects.equals(this.type, deviceDetailsDataAttributes.type)
        && Objects.equals(this.uptime, deviceDetailsDataAttributes.uptime)
        && Objects.equals(this.wlanBssid, deviceDetailsDataAttributes.wlanBssid)
        && Objects.equals(this.wlanRssi, deviceDetailsDataAttributes.wlanRssi)
        && Objects.equals(this.wlanSsid, deviceDetailsDataAttributes.wlanSsid)
        && Objects.equals(
            this.additionalProperties, deviceDetailsDataAttributes.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        agentKey,
        agentVersion,
        batteryChargePct,
        batteryChargeRate,
        batteryCritical,
        batteryCycleCount,
        batteryMaxCapacityPct,
        cnmEnabled,
        cpuCores,
        cpuLogicalProcessors,
        cpuModel,
        cpuUsage,
        diskUsage,
        employee,
        geoIp,
        ipAddress,
        issues,
        kernelName,
        lastReboot,
        lastSeen,
        manufacturer,
        memUsage,
        memoryTotalKb,
        modelName,
        modelNumber,
        os,
        osVersion,
        packetSent,
        resourceId,
        retransmit,
        retransmitPct,
        serialNumber,
        status,
        tcpCanceled,
        tcpEstablished,
        tcpEstablishmentFailurePct,
        tcpEstablishmentFailures,
        tcpHostUnreachable,
        tcpNetworkUnreachable,
        tcpRefusals,
        tcpTimeouts,
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
    sb.append("class DeviceDetailsDataAttributes {\n");
    sb.append("    agentKey: ").append(toIndentedString(agentKey)).append("\n");
    sb.append("    agentVersion: ").append(toIndentedString(agentVersion)).append("\n");
    sb.append("    batteryChargePct: ").append(toIndentedString(batteryChargePct)).append("\n");
    sb.append("    batteryChargeRate: ").append(toIndentedString(batteryChargeRate)).append("\n");
    sb.append("    batteryCritical: ").append(toIndentedString(batteryCritical)).append("\n");
    sb.append("    batteryCycleCount: ").append(toIndentedString(batteryCycleCount)).append("\n");
    sb.append("    batteryMaxCapacityPct: ")
        .append(toIndentedString(batteryMaxCapacityPct))
        .append("\n");
    sb.append("    cnmEnabled: ").append(toIndentedString(cnmEnabled)).append("\n");
    sb.append("    cpuCores: ").append(toIndentedString(cpuCores)).append("\n");
    sb.append("    cpuLogicalProcessors: ")
        .append(toIndentedString(cpuLogicalProcessors))
        .append("\n");
    sb.append("    cpuModel: ").append(toIndentedString(cpuModel)).append("\n");
    sb.append("    cpuUsage: ").append(toIndentedString(cpuUsage)).append("\n");
    sb.append("    diskUsage: ").append(toIndentedString(diskUsage)).append("\n");
    sb.append("    employee: ").append(toIndentedString(employee)).append("\n");
    sb.append("    geoIp: ").append(toIndentedString(geoIp)).append("\n");
    sb.append("    ipAddress: ").append(toIndentedString(ipAddress)).append("\n");
    sb.append("    issues: ").append(toIndentedString(issues)).append("\n");
    sb.append("    kernelName: ").append(toIndentedString(kernelName)).append("\n");
    sb.append("    lastReboot: ").append(toIndentedString(lastReboot)).append("\n");
    sb.append("    lastSeen: ").append(toIndentedString(lastSeen)).append("\n");
    sb.append("    manufacturer: ").append(toIndentedString(manufacturer)).append("\n");
    sb.append("    memUsage: ").append(toIndentedString(memUsage)).append("\n");
    sb.append("    memoryTotalKb: ").append(toIndentedString(memoryTotalKb)).append("\n");
    sb.append("    modelName: ").append(toIndentedString(modelName)).append("\n");
    sb.append("    modelNumber: ").append(toIndentedString(modelNumber)).append("\n");
    sb.append("    os: ").append(toIndentedString(os)).append("\n");
    sb.append("    osVersion: ").append(toIndentedString(osVersion)).append("\n");
    sb.append("    packetSent: ").append(toIndentedString(packetSent)).append("\n");
    sb.append("    resourceId: ").append(toIndentedString(resourceId)).append("\n");
    sb.append("    retransmit: ").append(toIndentedString(retransmit)).append("\n");
    sb.append("    retransmitPct: ").append(toIndentedString(retransmitPct)).append("\n");
    sb.append("    serialNumber: ").append(toIndentedString(serialNumber)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    tcpCanceled: ").append(toIndentedString(tcpCanceled)).append("\n");
    sb.append("    tcpEstablished: ").append(toIndentedString(tcpEstablished)).append("\n");
    sb.append("    tcpEstablishmentFailurePct: ")
        .append(toIndentedString(tcpEstablishmentFailurePct))
        .append("\n");
    sb.append("    tcpEstablishmentFailures: ")
        .append(toIndentedString(tcpEstablishmentFailures))
        .append("\n");
    sb.append("    tcpHostUnreachable: ").append(toIndentedString(tcpHostUnreachable)).append("\n");
    sb.append("    tcpNetworkUnreachable: ")
        .append(toIndentedString(tcpNetworkUnreachable))
        .append("\n");
    sb.append("    tcpRefusals: ").append(toIndentedString(tcpRefusals)).append("\n");
    sb.append("    tcpTimeouts: ").append(toIndentedString(tcpTimeouts)).append("\n");
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
