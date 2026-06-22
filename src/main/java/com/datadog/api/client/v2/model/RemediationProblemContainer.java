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
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/** A container within a problematic task that is exhibiting issues. */
@JsonPropertyOrder({
  RemediationProblemContainer.JSON_PROPERTY_CPU_LIMIT,
  RemediationProblemContainer.JSON_PROPERTY_EXIT_CODE,
  RemediationProblemContainer.JSON_PROPERTY_HEALTH_STATUS,
  RemediationProblemContainer.JSON_PROPERTY_IMAGE,
  RemediationProblemContainer.JSON_PROPERTY_LAST_STATUS,
  RemediationProblemContainer.JSON_PROPERTY_MEMORY_LIMIT_MIB,
  RemediationProblemContainer.JSON_PROPERTY_NAME,
  RemediationProblemContainer.JSON_PROPERTY_REASON
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class RemediationProblemContainer {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_CPU_LIMIT = "cpu_limit";
  private Long cpuLimit;

  public static final String JSON_PROPERTY_EXIT_CODE = "exit_code";
  private Integer exitCode;

  public static final String JSON_PROPERTY_HEALTH_STATUS = "health_status";
  private String healthStatus;

  public static final String JSON_PROPERTY_IMAGE = "image";
  private String image;

  public static final String JSON_PROPERTY_LAST_STATUS = "last_status";
  private String lastStatus;

  public static final String JSON_PROPERTY_MEMORY_LIMIT_MIB = "memory_limit_mib";
  private Long memoryLimitMib;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_REASON = "reason";
  private String reason;

  public RemediationProblemContainer cpuLimit(Long cpuLimit) {
    this.cpuLimit = cpuLimit;
    return this;
  }

  /**
   * CPU limit.
   *
   * @return cpuLimit
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CPU_LIMIT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getCpuLimit() {
    return cpuLimit;
  }

  public void setCpuLimit(Long cpuLimit) {
    this.cpuLimit = cpuLimit;
  }

  public RemediationProblemContainer exitCode(Integer exitCode) {
    this.exitCode = exitCode;
    return this;
  }

  /**
   * Exit code if the container stopped. maximum: 255
   *
   * @return exitCode
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_EXIT_CODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Integer getExitCode() {
    return exitCode;
  }

  public void setExitCode(Integer exitCode) {
    this.exitCode = exitCode;
  }

  public RemediationProblemContainer healthStatus(String healthStatus) {
    this.healthStatus = healthStatus;
    return this;
  }

  /**
   * Container health status.
   *
   * @return healthStatus
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_HEALTH_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getHealthStatus() {
    return healthStatus;
  }

  public void setHealthStatus(String healthStatus) {
    this.healthStatus = healthStatus;
  }

  public RemediationProblemContainer image(String image) {
    this.image = image;
    return this;
  }

  /**
   * Docker image URI.
   *
   * @return image
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_IMAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getImage() {
    return image;
  }

  public void setImage(String image) {
    this.image = image;
  }

  public RemediationProblemContainer lastStatus(String lastStatus) {
    this.lastStatus = lastStatus;
    return this;
  }

  /**
   * Container status.
   *
   * @return lastStatus
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LAST_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getLastStatus() {
    return lastStatus;
  }

  public void setLastStatus(String lastStatus) {
    this.lastStatus = lastStatus;
  }

  public RemediationProblemContainer memoryLimitMib(Long memoryLimitMib) {
    this.memoryLimitMib = memoryLimitMib;
    return this;
  }

  /**
   * Memory limit in MiB.
   *
   * @return memoryLimitMib
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_MEMORY_LIMIT_MIB)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getMemoryLimitMib() {
    return memoryLimitMib;
  }

  public void setMemoryLimitMib(Long memoryLimitMib) {
    this.memoryLimitMib = memoryLimitMib;
  }

  public RemediationProblemContainer name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Container name from the task definition.
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

  public RemediationProblemContainer reason(String reason) {
    this.reason = reason;
    return this;
  }

  /**
   * Stop reason.
   *
   * @return reason
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_REASON)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getReason() {
    return reason;
  }

  public void setReason(String reason) {
    this.reason = reason;
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
   * @return RemediationProblemContainer
   */
  @JsonAnySetter
  public RemediationProblemContainer putAdditionalProperty(String key, Object value) {
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

  /** Return true if this RemediationProblemContainer object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RemediationProblemContainer remediationProblemContainer = (RemediationProblemContainer) o;
    return Objects.equals(this.cpuLimit, remediationProblemContainer.cpuLimit)
        && Objects.equals(this.exitCode, remediationProblemContainer.exitCode)
        && Objects.equals(this.healthStatus, remediationProblemContainer.healthStatus)
        && Objects.equals(this.image, remediationProblemContainer.image)
        && Objects.equals(this.lastStatus, remediationProblemContainer.lastStatus)
        && Objects.equals(this.memoryLimitMib, remediationProblemContainer.memoryLimitMib)
        && Objects.equals(this.name, remediationProblemContainer.name)
        && Objects.equals(this.reason, remediationProblemContainer.reason)
        && Objects.equals(
            this.additionalProperties, remediationProblemContainer.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        cpuLimit,
        exitCode,
        healthStatus,
        image,
        lastStatus,
        memoryLimitMib,
        name,
        reason,
        additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RemediationProblemContainer {\n");
    sb.append("    cpuLimit: ").append(toIndentedString(cpuLimit)).append("\n");
    sb.append("    exitCode: ").append(toIndentedString(exitCode)).append("\n");
    sb.append("    healthStatus: ").append(toIndentedString(healthStatus)).append("\n");
    sb.append("    image: ").append(toIndentedString(image)).append("\n");
    sb.append("    lastStatus: ").append(toIndentedString(lastStatus)).append("\n");
    sb.append("    memoryLimitMib: ").append(toIndentedString(memoryLimitMib)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    reason: ").append(toIndentedString(reason)).append("\n");
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
