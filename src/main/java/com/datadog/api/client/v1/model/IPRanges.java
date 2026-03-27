/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v1.model;

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
   * <p>IP ranges.</p>
 */
@JsonPropertyOrder({
  IPRanges.JSON_PROPERTY_AGENTS,
  IPRanges.JSON_PROPERTY_API,
  IPRanges.JSON_PROPERTY_APM,
  IPRanges.JSON_PROPERTY_GLOBAL,
  IPRanges.JSON_PROPERTY_LOGS,
  IPRanges.JSON_PROPERTY_MODIFIED,
  IPRanges.JSON_PROPERTY_ORCHESTRATOR,
  IPRanges.JSON_PROPERTY_PROCESS,
  IPRanges.JSON_PROPERTY_REMOTE_CONFIGURATION,
  IPRanges.JSON_PROPERTY_SYNTHETICS,
  IPRanges.JSON_PROPERTY_SYNTHETICS_PRIVATE_LOCATIONS,
  IPRanges.JSON_PROPERTY_VERSION,
  IPRanges.JSON_PROPERTY_WEBHOOKS
})
@jakarta.annotation.Generated(value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class IPRanges {
  @JsonIgnore
  public boolean unparsed = false;
  public static final String JSON_PROPERTY_AGENTS = "agents";
  private IPPrefixesAgents agents;

  public static final String JSON_PROPERTY_API = "api";
  private IPPrefixesAPI api;

  public static final String JSON_PROPERTY_APM = "apm";
  private IPPrefixesAPM apm;

  public static final String JSON_PROPERTY_GLOBAL = "global";
  private IPPrefixesGlobal global;

  public static final String JSON_PROPERTY_LOGS = "logs";
  private IPPrefixesLogs logs;

  public static final String JSON_PROPERTY_MODIFIED = "modified";
  private String modified;

  public static final String JSON_PROPERTY_ORCHESTRATOR = "orchestrator";
  private IPPrefixesOrchestrator orchestrator;

  public static final String JSON_PROPERTY_PROCESS = "process";
  private IPPrefixesProcess process;

  public static final String JSON_PROPERTY_REMOTE_CONFIGURATION = "remote-configuration";
  private IPPrefixesRemoteConfiguration remoteConfiguration;

  public static final String JSON_PROPERTY_SYNTHETICS = "synthetics";
  private IPPrefixesSynthetics synthetics;

  public static final String JSON_PROPERTY_SYNTHETICS_PRIVATE_LOCATIONS = "synthetics-private-locations";
  private IPPrefixesSyntheticsPrivateLocations syntheticsPrivateLocations;

  public static final String JSON_PROPERTY_VERSION = "version";
  private Long version;

  public static final String JSON_PROPERTY_WEBHOOKS = "webhooks";
  private IPPrefixesWebhooks webhooks;

  public IPRanges agents(IPPrefixesAgents agents) {
    this.agents = agents;
    this.unparsed |= agents.unparsed;
    return this;
  }

  /**
   * <p>Available prefix information for the Agent endpoints.</p>
   * @return agents
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_AGENTS)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public IPPrefixesAgents getAgents() {
        return agents;
      }
  public void setAgents(IPPrefixesAgents agents) {
    this.agents = agents;
  }
  public IPRanges api(IPPrefixesAPI api) {
    this.api = api;
    this.unparsed |= api.unparsed;
    return this;
  }

  /**
   * <p>Available prefix information for the API endpoints.</p>
   * @return api
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_API)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public IPPrefixesAPI getApi() {
        return api;
      }
  public void setApi(IPPrefixesAPI api) {
    this.api = api;
  }
  public IPRanges apm(IPPrefixesAPM apm) {
    this.apm = apm;
    this.unparsed |= apm.unparsed;
    return this;
  }

  /**
   * <p>Available prefix information for the APM endpoints.</p>
   * @return apm
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_APM)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public IPPrefixesAPM getApm() {
        return apm;
      }
  public void setApm(IPPrefixesAPM apm) {
    this.apm = apm;
  }
  public IPRanges global(IPPrefixesGlobal global) {
    this.global = global;
    this.unparsed |= global.unparsed;
    return this;
  }

  /**
   * <p>Available prefix information for all Datadog endpoints.</p>
   * @return global
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_GLOBAL)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public IPPrefixesGlobal getGlobal() {
        return global;
      }
  public void setGlobal(IPPrefixesGlobal global) {
    this.global = global;
  }
  public IPRanges logs(IPPrefixesLogs logs) {
    this.logs = logs;
    this.unparsed |= logs.unparsed;
    return this;
  }

  /**
   * <p>Available prefix information for the Logs endpoints.</p>
   * @return logs
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_LOGS)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public IPPrefixesLogs getLogs() {
        return logs;
      }
  public void setLogs(IPPrefixesLogs logs) {
    this.logs = logs;
  }
  public IPRanges modified(String modified) {
    this.modified = modified;
    return this;
  }

  /**
   * <p>Date when last updated, in the form <code>YYYY-MM-DD-hh-mm-ss</code>.</p>
   * @return modified
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_MODIFIED)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public String getModified() {
        return modified;
      }
  public void setModified(String modified) {
    this.modified = modified;
  }
  public IPRanges orchestrator(IPPrefixesOrchestrator orchestrator) {
    this.orchestrator = orchestrator;
    this.unparsed |= orchestrator.unparsed;
    return this;
  }

  /**
   * <p>Available prefix information for the Orchestrator endpoints.</p>
   * @return orchestrator
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_ORCHESTRATOR)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public IPPrefixesOrchestrator getOrchestrator() {
        return orchestrator;
      }
  public void setOrchestrator(IPPrefixesOrchestrator orchestrator) {
    this.orchestrator = orchestrator;
  }
  public IPRanges process(IPPrefixesProcess process) {
    this.process = process;
    this.unparsed |= process.unparsed;
    return this;
  }

  /**
   * <p>Available prefix information for the Process endpoints.</p>
   * @return process
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_PROCESS)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public IPPrefixesProcess getProcess() {
        return process;
      }
  public void setProcess(IPPrefixesProcess process) {
    this.process = process;
  }
  public IPRanges remoteConfiguration(IPPrefixesRemoteConfiguration remoteConfiguration) {
    this.remoteConfiguration = remoteConfiguration;
    this.unparsed |= remoteConfiguration.unparsed;
    return this;
  }

  /**
   * <p>Available prefix information for the Remote Configuration endpoints.</p>
   * @return remoteConfiguration
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_REMOTE_CONFIGURATION)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public IPPrefixesRemoteConfiguration getRemoteConfiguration() {
        return remoteConfiguration;
      }
  public void setRemoteConfiguration(IPPrefixesRemoteConfiguration remoteConfiguration) {
    this.remoteConfiguration = remoteConfiguration;
  }
  public IPRanges synthetics(IPPrefixesSynthetics synthetics) {
    this.synthetics = synthetics;
    this.unparsed |= synthetics.unparsed;
    return this;
  }

  /**
   * <p>Available prefix information for the Synthetics endpoints.</p>
   * @return synthetics
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_SYNTHETICS)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public IPPrefixesSynthetics getSynthetics() {
        return synthetics;
      }
  public void setSynthetics(IPPrefixesSynthetics synthetics) {
    this.synthetics = synthetics;
  }
  public IPRanges syntheticsPrivateLocations(IPPrefixesSyntheticsPrivateLocations syntheticsPrivateLocations) {
    this.syntheticsPrivateLocations = syntheticsPrivateLocations;
    this.unparsed |= syntheticsPrivateLocations.unparsed;
    return this;
  }

  /**
   * <p>Available prefix information for the Synthetics Private Locations endpoints.</p>
   * @return syntheticsPrivateLocations
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_SYNTHETICS_PRIVATE_LOCATIONS)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public IPPrefixesSyntheticsPrivateLocations getSyntheticsPrivateLocations() {
        return syntheticsPrivateLocations;
      }
  public void setSyntheticsPrivateLocations(IPPrefixesSyntheticsPrivateLocations syntheticsPrivateLocations) {
    this.syntheticsPrivateLocations = syntheticsPrivateLocations;
  }
  public IPRanges version(Long version) {
    this.version = version;
    return this;
  }

  /**
   * <p>Version of the IP list.</p>
   * @return version
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_VERSION)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public Long getVersion() {
        return version;
      }
  public void setVersion(Long version) {
    this.version = version;
  }
  public IPRanges webhooks(IPPrefixesWebhooks webhooks) {
    this.webhooks = webhooks;
    this.unparsed |= webhooks.unparsed;
    return this;
  }

  /**
   * <p>Available prefix information for the Webhook endpoints.</p>
   * @return webhooks
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_WEBHOOKS)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public IPPrefixesWebhooks getWebhooks() {
        return webhooks;
      }
  public void setWebhooks(IPPrefixesWebhooks webhooks) {
    this.webhooks = webhooks;
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
   * @return IPRanges
   */
  @JsonAnySetter
  public IPRanges putAdditionalProperty(String key, Object value) {
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
   * Return true if this IPRanges object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IPRanges ipRanges = (IPRanges) o;
    return Objects.equals(this.agents, ipRanges.agents) && Objects.equals(this.api, ipRanges.api) && Objects.equals(this.apm, ipRanges.apm) && Objects.equals(this.global, ipRanges.global) && Objects.equals(this.logs, ipRanges.logs) && Objects.equals(this.modified, ipRanges.modified) && Objects.equals(this.orchestrator, ipRanges.orchestrator) && Objects.equals(this.process, ipRanges.process) && Objects.equals(this.remoteConfiguration, ipRanges.remoteConfiguration) && Objects.equals(this.synthetics, ipRanges.synthetics) && Objects.equals(this.syntheticsPrivateLocations, ipRanges.syntheticsPrivateLocations) && Objects.equals(this.version, ipRanges.version) && Objects.equals(this.webhooks, ipRanges.webhooks) && Objects.equals(this.additionalProperties, ipRanges.additionalProperties);
  }


  @Override
  public int hashCode() {
    return Objects.hash(agents,api,apm,global,logs,modified,orchestrator,process,remoteConfiguration,synthetics,syntheticsPrivateLocations,version,webhooks, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IPRanges {\n");
    sb.append("    agents: ").append(toIndentedString(agents)).append("\n");
    sb.append("    api: ").append(toIndentedString(api)).append("\n");
    sb.append("    apm: ").append(toIndentedString(apm)).append("\n");
    sb.append("    global: ").append(toIndentedString(global)).append("\n");
    sb.append("    logs: ").append(toIndentedString(logs)).append("\n");
    sb.append("    modified: ").append(toIndentedString(modified)).append("\n");
    sb.append("    orchestrator: ").append(toIndentedString(orchestrator)).append("\n");
    sb.append("    process: ").append(toIndentedString(process)).append("\n");
    sb.append("    remoteConfiguration: ").append(toIndentedString(remoteConfiguration)).append("\n");
    sb.append("    synthetics: ").append(toIndentedString(synthetics)).append("\n");
    sb.append("    syntheticsPrivateLocations: ").append(toIndentedString(syntheticsPrivateLocations)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    webhooks: ").append(toIndentedString(webhooks)).append("\n");
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
