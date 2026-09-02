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

/** Attributes of a fleet tracer representing a service instance reporting telemetry. */
@JsonPropertyOrder({
  FleetTracerAttributes.JSON_PROPERTY_ENV,
  FleetTracerAttributes.JSON_PROPERTY_HOSTNAME,
  FleetTracerAttributes.JSON_PROPERTY_LANGUAGE,
  FleetTracerAttributes.JSON_PROPERTY_LANGUAGE_VERSION,
  FleetTracerAttributes.JSON_PROPERTY_REMOTE_CONFIG_STATUS,
  FleetTracerAttributes.JSON_PROPERTY_RUNTIME_IDS,
  FleetTracerAttributes.JSON_PROPERTY_SERVICE,
  FleetTracerAttributes.JSON_PROPERTY_SERVICE_HOSTNAME,
  FleetTracerAttributes.JSON_PROPERTY_SERVICE_VERSION,
  FleetTracerAttributes.JSON_PROPERTY_TRACER_VERSION
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class FleetTracerAttributes {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_ENV = "env";
  private String env;

  public static final String JSON_PROPERTY_HOSTNAME = "hostname";
  private String hostname;

  public static final String JSON_PROPERTY_LANGUAGE = "language";
  private String language;

  public static final String JSON_PROPERTY_LANGUAGE_VERSION = "language_version";
  private String languageVersion;

  public static final String JSON_PROPERTY_REMOTE_CONFIG_STATUS = "remote_config_status";
  private String remoteConfigStatus;

  public static final String JSON_PROPERTY_RUNTIME_IDS = "runtime_ids";
  private List<String> runtimeIds = null;

  public static final String JSON_PROPERTY_SERVICE = "service";
  private String service;

  public static final String JSON_PROPERTY_SERVICE_HOSTNAME = "service_hostname";
  private String serviceHostname;

  public static final String JSON_PROPERTY_SERVICE_VERSION = "service_version";
  private String serviceVersion;

  public static final String JSON_PROPERTY_TRACER_VERSION = "tracer_version";
  private String tracerVersion;

  public FleetTracerAttributes env(String env) {
    this.env = env;
    return this;
  }

  /**
   * The environment the tracer is reporting from.
   *
   * @return env
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ENV)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getEnv() {
    return env;
  }

  public void setEnv(String env) {
    this.env = env;
  }

  public FleetTracerAttributes hostname(String hostname) {
    this.hostname = hostname;
    return this;
  }

  /**
   * The hostname where the tracer is running.
   *
   * @return hostname
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_HOSTNAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getHostname() {
    return hostname;
  }

  public void setHostname(String hostname) {
    this.hostname = hostname;
  }

  public FleetTracerAttributes language(String language) {
    this.language = language;
    return this;
  }

  /**
   * The programming language of the traced application.
   *
   * @return language
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LANGUAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getLanguage() {
    return language;
  }

  public void setLanguage(String language) {
    this.language = language;
  }

  public FleetTracerAttributes languageVersion(String languageVersion) {
    this.languageVersion = languageVersion;
    return this;
  }

  /**
   * The version of the programming language runtime.
   *
   * @return languageVersion
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LANGUAGE_VERSION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getLanguageVersion() {
    return languageVersion;
  }

  public void setLanguageVersion(String languageVersion) {
    this.languageVersion = languageVersion;
  }

  public FleetTracerAttributes remoteConfigStatus(String remoteConfigStatus) {
    this.remoteConfigStatus = remoteConfigStatus;
    return this;
  }

  /**
   * The remote configuration status of the tracer.
   *
   * @return remoteConfigStatus
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_REMOTE_CONFIG_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getRemoteConfigStatus() {
    return remoteConfigStatus;
  }

  public void setRemoteConfigStatus(String remoteConfigStatus) {
    this.remoteConfigStatus = remoteConfigStatus;
  }

  public FleetTracerAttributes runtimeIds(List<String> runtimeIds) {
    this.runtimeIds = runtimeIds;
    return this;
  }

  public FleetTracerAttributes addRuntimeIdsItem(String runtimeIdsItem) {
    if (this.runtimeIds == null) {
      this.runtimeIds = new ArrayList<>();
    }
    this.runtimeIds.add(runtimeIdsItem);
    return this;
  }

  /**
   * Runtime identifiers for the tracer instances.
   *
   * @return runtimeIds
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_RUNTIME_IDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<String> getRuntimeIds() {
    return runtimeIds;
  }

  public void setRuntimeIds(List<String> runtimeIds) {
    this.runtimeIds = runtimeIds;
  }

  public FleetTracerAttributes service(String service) {
    this.service = service;
    return this;
  }

  /**
   * The telemetry-derived service name reported by the tracer.
   *
   * @return service
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SERVICE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getService() {
    return service;
  }

  public void setService(String service) {
    this.service = service;
  }

  public FleetTracerAttributes serviceHostname(String serviceHostname) {
    this.serviceHostname = serviceHostname;
    return this;
  }

  /**
   * The service hostname reported by the tracer.
   *
   * @return serviceHostname
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SERVICE_HOSTNAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getServiceHostname() {
    return serviceHostname;
  }

  public void setServiceHostname(String serviceHostname) {
    this.serviceHostname = serviceHostname;
  }

  public FleetTracerAttributes serviceVersion(String serviceVersion) {
    this.serviceVersion = serviceVersion;
    return this;
  }

  /**
   * The version of the traced service.
   *
   * @return serviceVersion
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SERVICE_VERSION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getServiceVersion() {
    return serviceVersion;
  }

  public void setServiceVersion(String serviceVersion) {
    this.serviceVersion = serviceVersion;
  }

  public FleetTracerAttributes tracerVersion(String tracerVersion) {
    this.tracerVersion = tracerVersion;
    return this;
  }

  /**
   * The version of the Datadog tracer library.
   *
   * @return tracerVersion
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TRACER_VERSION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getTracerVersion() {
    return tracerVersion;
  }

  public void setTracerVersion(String tracerVersion) {
    this.tracerVersion = tracerVersion;
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
   * @return FleetTracerAttributes
   */
  @JsonAnySetter
  public FleetTracerAttributes putAdditionalProperty(String key, Object value) {
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

  /** Return true if this FleetTracerAttributes object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FleetTracerAttributes fleetTracerAttributes = (FleetTracerAttributes) o;
    return Objects.equals(this.env, fleetTracerAttributes.env)
        && Objects.equals(this.hostname, fleetTracerAttributes.hostname)
        && Objects.equals(this.language, fleetTracerAttributes.language)
        && Objects.equals(this.languageVersion, fleetTracerAttributes.languageVersion)
        && Objects.equals(this.remoteConfigStatus, fleetTracerAttributes.remoteConfigStatus)
        && Objects.equals(this.runtimeIds, fleetTracerAttributes.runtimeIds)
        && Objects.equals(this.service, fleetTracerAttributes.service)
        && Objects.equals(this.serviceHostname, fleetTracerAttributes.serviceHostname)
        && Objects.equals(this.serviceVersion, fleetTracerAttributes.serviceVersion)
        && Objects.equals(this.tracerVersion, fleetTracerAttributes.tracerVersion)
        && Objects.equals(this.additionalProperties, fleetTracerAttributes.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        env,
        hostname,
        language,
        languageVersion,
        remoteConfigStatus,
        runtimeIds,
        service,
        serviceHostname,
        serviceVersion,
        tracerVersion,
        additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FleetTracerAttributes {\n");
    sb.append("    env: ").append(toIndentedString(env)).append("\n");
    sb.append("    hostname: ").append(toIndentedString(hostname)).append("\n");
    sb.append("    language: ").append(toIndentedString(language)).append("\n");
    sb.append("    languageVersion: ").append(toIndentedString(languageVersion)).append("\n");
    sb.append("    remoteConfigStatus: ").append(toIndentedString(remoteConfigStatus)).append("\n");
    sb.append("    runtimeIds: ").append(toIndentedString(runtimeIds)).append("\n");
    sb.append("    service: ").append(toIndentedString(service)).append("\n");
    sb.append("    serviceHostname: ").append(toIndentedString(serviceHostname)).append("\n");
    sb.append("    serviceVersion: ").append(toIndentedString(serviceVersion)).append("\n");
    sb.append("    tracerVersion: ").append(toIndentedString(tracerVersion)).append("\n");
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
