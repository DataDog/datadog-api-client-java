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

/** Metadata about the entity from cloud providers */
@JsonPropertyOrder({
  SecurityEntityMetadata.JSON_PROPERTY_ACCOUNT_ID,
  SecurityEntityMetadata.JSON_PROPERTY_ENVIRONMENTS,
  SecurityEntityMetadata.JSON_PROPERTY_MITRE_TACTICS,
  SecurityEntityMetadata.JSON_PROPERTY_MITRE_TECHNIQUES,
  SecurityEntityMetadata.JSON_PROPERTY_PROJECT_ID,
  SecurityEntityMetadata.JSON_PROPERTY_SERVICES,
  SecurityEntityMetadata.JSON_PROPERTY_SOURCES,
  SecurityEntityMetadata.JSON_PROPERTY_SUBSCRIPTION_ID
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class SecurityEntityMetadata {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_ACCOUNT_ID = "accountID";
  private String accountId;

  public static final String JSON_PROPERTY_ENVIRONMENTS = "environments";
  private List<String> environments = new ArrayList<>();

  public static final String JSON_PROPERTY_MITRE_TACTICS = "mitreTactics";
  private List<String> mitreTactics = new ArrayList<>();

  public static final String JSON_PROPERTY_MITRE_TECHNIQUES = "mitreTechniques";
  private List<String> mitreTechniques = new ArrayList<>();

  public static final String JSON_PROPERTY_PROJECT_ID = "projectID";
  private String projectId;

  public static final String JSON_PROPERTY_SERVICES = "services";
  private List<String> services = new ArrayList<>();

  public static final String JSON_PROPERTY_SOURCES = "sources";
  private List<String> sources = new ArrayList<>();

  public static final String JSON_PROPERTY_SUBSCRIPTION_ID = "subscriptionID";
  private String subscriptionId;

  public SecurityEntityMetadata() {}

  @JsonCreator
  public SecurityEntityMetadata(
      @JsonProperty(required = true, value = JSON_PROPERTY_ENVIRONMENTS) List<String> environments,
      @JsonProperty(required = true, value = JSON_PROPERTY_MITRE_TACTICS) List<String> mitreTactics,
      @JsonProperty(required = true, value = JSON_PROPERTY_MITRE_TECHNIQUES)
          List<String> mitreTechniques,
      @JsonProperty(required = true, value = JSON_PROPERTY_SERVICES) List<String> services,
      @JsonProperty(required = true, value = JSON_PROPERTY_SOURCES) List<String> sources) {
    this.environments = environments;
    this.mitreTactics = mitreTactics;
    this.mitreTechniques = mitreTechniques;
    this.services = services;
    this.sources = sources;
  }

  public SecurityEntityMetadata accountId(String accountId) {
    this.accountId = accountId;
    return this;
  }

  /**
   * Cloud account ID (AWS)
   *
   * @return accountId
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ACCOUNT_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getAccountId() {
    return accountId;
  }

  public void setAccountId(String accountId) {
    this.accountId = accountId;
  }

  public SecurityEntityMetadata environments(List<String> environments) {
    this.environments = environments;
    return this;
  }

  public SecurityEntityMetadata addEnvironmentsItem(String environmentsItem) {
    this.environments.add(environmentsItem);
    return this;
  }

  /**
   * Environment tags associated with the entity
   *
   * @return environments
   */
  @JsonProperty(JSON_PROPERTY_ENVIRONMENTS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public List<String> getEnvironments() {
    return environments;
  }

  public void setEnvironments(List<String> environments) {
    this.environments = environments;
  }

  public SecurityEntityMetadata mitreTactics(List<String> mitreTactics) {
    this.mitreTactics = mitreTactics;
    return this;
  }

  public SecurityEntityMetadata addMitreTacticsItem(String mitreTacticsItem) {
    this.mitreTactics.add(mitreTacticsItem);
    return this;
  }

  /**
   * MITRE ATT&amp;CK tactics detected
   *
   * @return mitreTactics
   */
  @JsonProperty(JSON_PROPERTY_MITRE_TACTICS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public List<String> getMitreTactics() {
    return mitreTactics;
  }

  public void setMitreTactics(List<String> mitreTactics) {
    this.mitreTactics = mitreTactics;
  }

  public SecurityEntityMetadata mitreTechniques(List<String> mitreTechniques) {
    this.mitreTechniques = mitreTechniques;
    return this;
  }

  public SecurityEntityMetadata addMitreTechniquesItem(String mitreTechniquesItem) {
    this.mitreTechniques.add(mitreTechniquesItem);
    return this;
  }

  /**
   * MITRE ATT&amp;CK techniques detected
   *
   * @return mitreTechniques
   */
  @JsonProperty(JSON_PROPERTY_MITRE_TECHNIQUES)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public List<String> getMitreTechniques() {
    return mitreTechniques;
  }

  public void setMitreTechniques(List<String> mitreTechniques) {
    this.mitreTechniques = mitreTechniques;
  }

  public SecurityEntityMetadata projectId(String projectId) {
    this.projectId = projectId;
    return this;
  }

  /**
   * Cloud project ID (GCP)
   *
   * @return projectId
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PROJECT_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getProjectId() {
    return projectId;
  }

  public void setProjectId(String projectId) {
    this.projectId = projectId;
  }

  public SecurityEntityMetadata services(List<String> services) {
    this.services = services;
    return this;
  }

  public SecurityEntityMetadata addServicesItem(String servicesItem) {
    this.services.add(servicesItem);
    return this;
  }

  /**
   * Services associated with the entity
   *
   * @return services
   */
  @JsonProperty(JSON_PROPERTY_SERVICES)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public List<String> getServices() {
    return services;
  }

  public void setServices(List<String> services) {
    this.services = services;
  }

  public SecurityEntityMetadata sources(List<String> sources) {
    this.sources = sources;
    return this;
  }

  public SecurityEntityMetadata addSourcesItem(String sourcesItem) {
    this.sources.add(sourcesItem);
    return this;
  }

  /**
   * Data sources that detected this entity
   *
   * @return sources
   */
  @JsonProperty(JSON_PROPERTY_SOURCES)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public List<String> getSources() {
    return sources;
  }

  public void setSources(List<String> sources) {
    this.sources = sources;
  }

  public SecurityEntityMetadata subscriptionId(String subscriptionId) {
    this.subscriptionId = subscriptionId;
    return this;
  }

  /**
   * Cloud subscription ID (Azure)
   *
   * @return subscriptionId
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SUBSCRIPTION_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getSubscriptionId() {
    return subscriptionId;
  }

  public void setSubscriptionId(String subscriptionId) {
    this.subscriptionId = subscriptionId;
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
   * @return SecurityEntityMetadata
   */
  @JsonAnySetter
  public SecurityEntityMetadata putAdditionalProperty(String key, Object value) {
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

  /** Return true if this SecurityEntityMetadata object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SecurityEntityMetadata securityEntityMetadata = (SecurityEntityMetadata) o;
    return Objects.equals(this.accountId, securityEntityMetadata.accountId)
        && Objects.equals(this.environments, securityEntityMetadata.environments)
        && Objects.equals(this.mitreTactics, securityEntityMetadata.mitreTactics)
        && Objects.equals(this.mitreTechniques, securityEntityMetadata.mitreTechniques)
        && Objects.equals(this.projectId, securityEntityMetadata.projectId)
        && Objects.equals(this.services, securityEntityMetadata.services)
        && Objects.equals(this.sources, securityEntityMetadata.sources)
        && Objects.equals(this.subscriptionId, securityEntityMetadata.subscriptionId)
        && Objects.equals(this.additionalProperties, securityEntityMetadata.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        accountId,
        environments,
        mitreTactics,
        mitreTechniques,
        projectId,
        services,
        sources,
        subscriptionId,
        additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SecurityEntityMetadata {\n");
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    environments: ").append(toIndentedString(environments)).append("\n");
    sb.append("    mitreTactics: ").append(toIndentedString(mitreTactics)).append("\n");
    sb.append("    mitreTechniques: ").append(toIndentedString(mitreTechniques)).append("\n");
    sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
    sb.append("    services: ").append(toIndentedString(services)).append("\n");
    sb.append("    sources: ").append(toIndentedString(sources)).append("\n");
    sb.append("    subscriptionId: ").append(toIndentedString(subscriptionId)).append("\n");
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
