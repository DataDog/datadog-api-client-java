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

/** Rule failure details. */
@JsonPropertyOrder({
  DeploymentGateRuleFailures.JSON_PROPERTY_FAULTY_APM_RESOURCES,
  DeploymentGateRuleFailures.JSON_PROPERTY_MONITORS,
  DeploymentGateRuleFailures.JSON_PROPERTY_NARRATIVES
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class DeploymentGateRuleFailures {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_FAULTY_APM_RESOURCES = "faulty_apm_resources";
  private List<String> faultyApmResources = new ArrayList<>();

  public static final String JSON_PROPERTY_MONITORS = "monitors";
  private List<DeploymentGateRuleFailureMonitor> monitors = new ArrayList<>();

  public static final String JSON_PROPERTY_NARRATIVES = "narratives";
  private List<DeploymentGateRuleFailureNarrative> narratives = new ArrayList<>();

  public DeploymentGateRuleFailures() {}

  @JsonCreator
  public DeploymentGateRuleFailures(
      @JsonProperty(required = true, value = JSON_PROPERTY_FAULTY_APM_RESOURCES)
          List<String> faultyApmResources,
      @JsonProperty(required = true, value = JSON_PROPERTY_MONITORS)
          List<DeploymentGateRuleFailureMonitor> monitors,
      @JsonProperty(required = true, value = JSON_PROPERTY_NARRATIVES)
          List<DeploymentGateRuleFailureNarrative> narratives) {
    this.faultyApmResources = faultyApmResources;
    this.monitors = monitors;
    for (DeploymentGateRuleFailureMonitor item : monitors) {
      this.unparsed |= item.unparsed;
    }
    this.narratives = narratives;
    for (DeploymentGateRuleFailureNarrative item : narratives) {
      this.unparsed |= item.unparsed;
    }
  }

  public DeploymentGateRuleFailures faultyApmResources(List<String> faultyApmResources) {
    this.faultyApmResources = faultyApmResources;
    return this;
  }

  public DeploymentGateRuleFailures addFaultyApmResourcesItem(String faultyApmResourcesItem) {
    this.faultyApmResources.add(faultyApmResourcesItem);
    return this;
  }

  /**
   * Names of faulty APM resources.
   *
   * @return faultyApmResources
   */
  @JsonProperty(JSON_PROPERTY_FAULTY_APM_RESOURCES)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public List<String> getFaultyApmResources() {
    return faultyApmResources;
  }

  public void setFaultyApmResources(List<String> faultyApmResources) {
    this.faultyApmResources = faultyApmResources;
  }

  public DeploymentGateRuleFailures monitors(List<DeploymentGateRuleFailureMonitor> monitors) {
    this.monitors = monitors;
    for (DeploymentGateRuleFailureMonitor item : monitors) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }

  public DeploymentGateRuleFailures addMonitorsItem(DeploymentGateRuleFailureMonitor monitorsItem) {
    this.monitors.add(monitorsItem);
    this.unparsed |= monitorsItem.unparsed;
    return this;
  }

  /**
   * Getmonitors
   *
   * @return monitors
   */
  @JsonProperty(JSON_PROPERTY_MONITORS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public List<DeploymentGateRuleFailureMonitor> getMonitors() {
    return monitors;
  }

  public void setMonitors(List<DeploymentGateRuleFailureMonitor> monitors) {
    this.monitors = monitors;
    if (monitors != null) {
      for (DeploymentGateRuleFailureMonitor item : monitors) {
        this.unparsed |= item.unparsed;
      }
    }
  }

  public DeploymentGateRuleFailures narratives(
      List<DeploymentGateRuleFailureNarrative> narratives) {
    this.narratives = narratives;
    for (DeploymentGateRuleFailureNarrative item : narratives) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }

  public DeploymentGateRuleFailures addNarrativesItem(
      DeploymentGateRuleFailureNarrative narrativesItem) {
    this.narratives.add(narrativesItem);
    this.unparsed |= narrativesItem.unparsed;
    return this;
  }

  /**
   * Getnarratives
   *
   * @return narratives
   */
  @JsonProperty(JSON_PROPERTY_NARRATIVES)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public List<DeploymentGateRuleFailureNarrative> getNarratives() {
    return narratives;
  }

  public void setNarratives(List<DeploymentGateRuleFailureNarrative> narratives) {
    this.narratives = narratives;
    if (narratives != null) {
      for (DeploymentGateRuleFailureNarrative item : narratives) {
        this.unparsed |= item.unparsed;
      }
    }
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
   * @return DeploymentGateRuleFailures
   */
  @JsonAnySetter
  public DeploymentGateRuleFailures putAdditionalProperty(String key, Object value) {
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

  /** Return true if this DeploymentGateRuleFailures object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DeploymentGateRuleFailures deploymentGateRuleFailures = (DeploymentGateRuleFailures) o;
    return Objects.equals(this.faultyApmResources, deploymentGateRuleFailures.faultyApmResources)
        && Objects.equals(this.monitors, deploymentGateRuleFailures.monitors)
        && Objects.equals(this.narratives, deploymentGateRuleFailures.narratives)
        && Objects.equals(
            this.additionalProperties, deploymentGateRuleFailures.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(faultyApmResources, monitors, narratives, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DeploymentGateRuleFailures {\n");
    sb.append("    faultyApmResources: ").append(toIndentedString(faultyApmResources)).append("\n");
    sb.append("    monitors: ").append(toIndentedString(monitors)).append("\n");
    sb.append("    narratives: ").append(toIndentedString(narratives)).append("\n");
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
