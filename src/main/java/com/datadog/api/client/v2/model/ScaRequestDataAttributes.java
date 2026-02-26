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

/** */
@JsonPropertyOrder({
  ScaRequestDataAttributes.JSON_PROPERTY_COMMIT,
  ScaRequestDataAttributes.JSON_PROPERTY_DEPENDENCIES,
  ScaRequestDataAttributes.JSON_PROPERTY_ENV,
  ScaRequestDataAttributes.JSON_PROPERTY_FILES,
  ScaRequestDataAttributes.JSON_PROPERTY_RELATIONS,
  ScaRequestDataAttributes.JSON_PROPERTY_REPOSITORY,
  ScaRequestDataAttributes.JSON_PROPERTY_SERVICE,
  ScaRequestDataAttributes.JSON_PROPERTY_TAGS,
  ScaRequestDataAttributes.JSON_PROPERTY_VULNERABILITIES
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class ScaRequestDataAttributes {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_COMMIT = "commit";
  private ScaRequestDataAttributesCommit commit;

  public static final String JSON_PROPERTY_DEPENDENCIES = "dependencies";
  private List<ScaRequestDataAttributesDependenciesItems> dependencies = null;

  public static final String JSON_PROPERTY_ENV = "env";
  private String env;

  public static final String JSON_PROPERTY_FILES = "files";
  private List<ScaRequestDataAttributesFilesItems> files = null;

  public static final String JSON_PROPERTY_RELATIONS = "relations";
  private List<ScaRequestDataAttributesRelationsItems> relations = null;

  public static final String JSON_PROPERTY_REPOSITORY = "repository";
  private ScaRequestDataAttributesRepository repository;

  public static final String JSON_PROPERTY_SERVICE = "service";
  private String service;

  public static final String JSON_PROPERTY_TAGS = "tags";
  private Map<String, String> tags = null;

  public static final String JSON_PROPERTY_VULNERABILITIES = "vulnerabilities";
  private List<ScaRequestDataAttributesVulnerabilitiesItems> vulnerabilities = null;

  public ScaRequestDataAttributes commit(ScaRequestDataAttributesCommit commit) {
    this.commit = commit;
    this.unparsed |= commit.unparsed;
    return this;
  }

  /**
   * Getcommit
   *
   * @return commit
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_COMMIT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public ScaRequestDataAttributesCommit getCommit() {
    return commit;
  }

  public void setCommit(ScaRequestDataAttributesCommit commit) {
    this.commit = commit;
  }

  public ScaRequestDataAttributes dependencies(
      List<ScaRequestDataAttributesDependenciesItems> dependencies) {
    this.dependencies = dependencies;
    for (ScaRequestDataAttributesDependenciesItems item : dependencies) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }

  public ScaRequestDataAttributes addDependenciesItem(
      ScaRequestDataAttributesDependenciesItems dependenciesItem) {
    if (this.dependencies == null) {
      this.dependencies = new ArrayList<>();
    }
    this.dependencies.add(dependenciesItem);
    this.unparsed |= dependenciesItem.unparsed;
    return this;
  }

  /**
   * Getdependencies
   *
   * @return dependencies
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DEPENDENCIES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<ScaRequestDataAttributesDependenciesItems> getDependencies() {
    return dependencies;
  }

  public void setDependencies(List<ScaRequestDataAttributesDependenciesItems> dependencies) {
    this.dependencies = dependencies;
  }

  public ScaRequestDataAttributes env(String env) {
    this.env = env;
    return this;
  }

  /**
   * Getenv
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

  public ScaRequestDataAttributes files(List<ScaRequestDataAttributesFilesItems> files) {
    this.files = files;
    for (ScaRequestDataAttributesFilesItems item : files) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }

  public ScaRequestDataAttributes addFilesItem(ScaRequestDataAttributesFilesItems filesItem) {
    if (this.files == null) {
      this.files = new ArrayList<>();
    }
    this.files.add(filesItem);
    this.unparsed |= filesItem.unparsed;
    return this;
  }

  /**
   * Getfiles
   *
   * @return files
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_FILES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<ScaRequestDataAttributesFilesItems> getFiles() {
    return files;
  }

  public void setFiles(List<ScaRequestDataAttributesFilesItems> files) {
    this.files = files;
  }

  public ScaRequestDataAttributes relations(
      List<ScaRequestDataAttributesRelationsItems> relations) {
    this.relations = relations;
    for (ScaRequestDataAttributesRelationsItems item : relations) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }

  public ScaRequestDataAttributes addRelationsItem(
      ScaRequestDataAttributesRelationsItems relationsItem) {
    if (this.relations == null) {
      this.relations = new ArrayList<>();
    }
    this.relations.add(relationsItem);
    this.unparsed |= relationsItem.unparsed;
    return this;
  }

  /**
   * Getrelations
   *
   * @return relations
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_RELATIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<ScaRequestDataAttributesRelationsItems> getRelations() {
    return relations;
  }

  public void setRelations(List<ScaRequestDataAttributesRelationsItems> relations) {
    this.relations = relations;
  }

  public ScaRequestDataAttributes repository(ScaRequestDataAttributesRepository repository) {
    this.repository = repository;
    this.unparsed |= repository.unparsed;
    return this;
  }

  /**
   * Getrepository
   *
   * @return repository
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_REPOSITORY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public ScaRequestDataAttributesRepository getRepository() {
    return repository;
  }

  public void setRepository(ScaRequestDataAttributesRepository repository) {
    this.repository = repository;
  }

  public ScaRequestDataAttributes service(String service) {
    this.service = service;
    return this;
  }

  /**
   * Getservice
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

  public ScaRequestDataAttributes tags(Map<String, String> tags) {
    this.tags = tags;
    return this;
  }

  public ScaRequestDataAttributes putTagsItem(String key, String tagsItem) {
    if (this.tags == null) {
      this.tags = new HashMap<>();
    }
    this.tags.put(key, tagsItem);
    return this;
  }

  /**
   * Gettags
   *
   * @return tags
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TAGS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Map<String, String> getTags() {
    return tags;
  }

  public void setTags(Map<String, String> tags) {
    this.tags = tags;
  }

  public ScaRequestDataAttributes vulnerabilities(
      List<ScaRequestDataAttributesVulnerabilitiesItems> vulnerabilities) {
    this.vulnerabilities = vulnerabilities;
    for (ScaRequestDataAttributesVulnerabilitiesItems item : vulnerabilities) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }

  public ScaRequestDataAttributes addVulnerabilitiesItem(
      ScaRequestDataAttributesVulnerabilitiesItems vulnerabilitiesItem) {
    if (this.vulnerabilities == null) {
      this.vulnerabilities = new ArrayList<>();
    }
    this.vulnerabilities.add(vulnerabilitiesItem);
    this.unparsed |= vulnerabilitiesItem.unparsed;
    return this;
  }

  /**
   * Getvulnerabilities
   *
   * @return vulnerabilities
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_VULNERABILITIES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<ScaRequestDataAttributesVulnerabilitiesItems> getVulnerabilities() {
    return vulnerabilities;
  }

  public void setVulnerabilities(
      List<ScaRequestDataAttributesVulnerabilitiesItems> vulnerabilities) {
    this.vulnerabilities = vulnerabilities;
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
   * @return ScaRequestDataAttributes
   */
  @JsonAnySetter
  public ScaRequestDataAttributes putAdditionalProperty(String key, Object value) {
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

  /** Return true if this ScaRequestDataAttributes object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ScaRequestDataAttributes scaRequestDataAttributes = (ScaRequestDataAttributes) o;
    return Objects.equals(this.commit, scaRequestDataAttributes.commit)
        && Objects.equals(this.dependencies, scaRequestDataAttributes.dependencies)
        && Objects.equals(this.env, scaRequestDataAttributes.env)
        && Objects.equals(this.files, scaRequestDataAttributes.files)
        && Objects.equals(this.relations, scaRequestDataAttributes.relations)
        && Objects.equals(this.repository, scaRequestDataAttributes.repository)
        && Objects.equals(this.service, scaRequestDataAttributes.service)
        && Objects.equals(this.tags, scaRequestDataAttributes.tags)
        && Objects.equals(this.vulnerabilities, scaRequestDataAttributes.vulnerabilities)
        && Objects.equals(this.additionalProperties, scaRequestDataAttributes.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        commit,
        dependencies,
        env,
        files,
        relations,
        repository,
        service,
        tags,
        vulnerabilities,
        additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ScaRequestDataAttributes {\n");
    sb.append("    commit: ").append(toIndentedString(commit)).append("\n");
    sb.append("    dependencies: ").append(toIndentedString(dependencies)).append("\n");
    sb.append("    env: ").append(toIndentedString(env)).append("\n");
    sb.append("    files: ").append(toIndentedString(files)).append("\n");
    sb.append("    relations: ").append(toIndentedString(relations)).append("\n");
    sb.append("    repository: ").append(toIndentedString(repository)).append("\n");
    sb.append("    service: ").append(toIndentedString(service)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("    vulnerabilities: ").append(toIndentedString(vulnerabilities)).append("\n");
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
