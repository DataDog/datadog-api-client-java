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
   * <p>Service definition V2 for providing service metadata and integrations.</p>
 */
@JsonPropertyOrder({
  ServiceDefinitionV2.JSON_PROPERTY_CONTACTS,
  ServiceDefinitionV2.JSON_PROPERTY_DD_SERVICE,
  ServiceDefinitionV2.JSON_PROPERTY_DD_TEAM,
  ServiceDefinitionV2.JSON_PROPERTY_DOCS,
  ServiceDefinitionV2.JSON_PROPERTY_EXTENSIONS,
  ServiceDefinitionV2.JSON_PROPERTY_INTEGRATIONS,
  ServiceDefinitionV2.JSON_PROPERTY_LINKS,
  ServiceDefinitionV2.JSON_PROPERTY_REPOS,
  ServiceDefinitionV2.JSON_PROPERTY_SCHEMA_VERSION,
  ServiceDefinitionV2.JSON_PROPERTY_TAGS,
  ServiceDefinitionV2.JSON_PROPERTY_TEAM
})
@jakarta.annotation.Generated(value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class ServiceDefinitionV2 {
  @JsonIgnore
  public boolean unparsed = false;
  public static final String JSON_PROPERTY_CONTACTS = "contacts";
  private List<ServiceDefinitionV2Contact> contacts = null;

  public static final String JSON_PROPERTY_DD_SERVICE = "dd-service";
  private String ddService;

  public static final String JSON_PROPERTY_DD_TEAM = "dd-team";
  private String ddTeam;

  public static final String JSON_PROPERTY_DOCS = "docs";
  private List<ServiceDefinitionV2Doc> docs = null;

  public static final String JSON_PROPERTY_EXTENSIONS = "extensions";
  private Map<String, Object> extensions = null;

  public static final String JSON_PROPERTY_INTEGRATIONS = "integrations";
  private ServiceDefinitionV2Integrations integrations;

  public static final String JSON_PROPERTY_LINKS = "links";
  private List<ServiceDefinitionV2Link> links = null;

  public static final String JSON_PROPERTY_REPOS = "repos";
  private List<ServiceDefinitionV2Repo> repos = null;

  public static final String JSON_PROPERTY_SCHEMA_VERSION = "schema-version";
  private ServiceDefinitionV2Version schemaVersion = ServiceDefinitionV2Version.V2;

  public static final String JSON_PROPERTY_TAGS = "tags";
  private List<String> tags = null;

  public static final String JSON_PROPERTY_TEAM = "team";
  private String team;

  public ServiceDefinitionV2() {}

  @JsonCreator
  public ServiceDefinitionV2(
            @JsonProperty(required=true, value=JSON_PROPERTY_DD_SERVICE)String ddService,
            @JsonProperty(required=true, value=JSON_PROPERTY_SCHEMA_VERSION)ServiceDefinitionV2Version schemaVersion) {
        this.ddService = ddService;
        this.schemaVersion = schemaVersion;
        this.unparsed |= !schemaVersion.isValid();
  }
  public ServiceDefinitionV2 contacts(List<ServiceDefinitionV2Contact> contacts) {
    this.contacts = contacts;
    for (ServiceDefinitionV2Contact item : contacts) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }
  public ServiceDefinitionV2 addContactsItem(ServiceDefinitionV2Contact contactsItem) {
    if (this.contacts == null) {
      this.contacts = new ArrayList<>();
    }
    this.contacts.add(contactsItem);
    this.unparsed |= contactsItem.unparsed;
    return this;
  }

  /**
   * <p>A list of contacts related to the services.</p>
   * @return contacts
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_CONTACTS)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public List<ServiceDefinitionV2Contact> getContacts() {
        return contacts;
      }
  public void setContacts(List<ServiceDefinitionV2Contact> contacts) {
    this.contacts = contacts;
  }
  public ServiceDefinitionV2 ddService(String ddService) {
    this.ddService = ddService;
    return this;
  }

  /**
   * <p>Unique identifier of the service. Must be unique across all services and is used to match with a service in Datadog.</p>
   * @return ddService
  **/
      @JsonProperty(JSON_PROPERTY_DD_SERVICE)
      @JsonInclude(
        value = JsonInclude.Include.ALWAYS)
      public String getDdService() {
        return ddService;
      }
  public void setDdService(String ddService) {
    this.ddService = ddService;
  }
  public ServiceDefinitionV2 ddTeam(String ddTeam) {
    this.ddTeam = ddTeam;
    return this;
  }

  /**
   * <p>Experimental feature. A Team handle that matches a Team in the Datadog Teams product.</p>
   * @return ddTeam
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_DD_TEAM)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public String getDdTeam() {
        return ddTeam;
      }
  public void setDdTeam(String ddTeam) {
    this.ddTeam = ddTeam;
  }
  public ServiceDefinitionV2 docs(List<ServiceDefinitionV2Doc> docs) {
    this.docs = docs;
    for (ServiceDefinitionV2Doc item : docs) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }
  public ServiceDefinitionV2 addDocsItem(ServiceDefinitionV2Doc docsItem) {
    if (this.docs == null) {
      this.docs = new ArrayList<>();
    }
    this.docs.add(docsItem);
    this.unparsed |= docsItem.unparsed;
    return this;
  }

  /**
   * <p>A list of documentation related to the services.</p>
   * @return docs
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_DOCS)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public List<ServiceDefinitionV2Doc> getDocs() {
        return docs;
      }
  public void setDocs(List<ServiceDefinitionV2Doc> docs) {
    this.docs = docs;
  }
  public ServiceDefinitionV2 extensions(Map<String, Object> extensions) {
    this.extensions = extensions;
    return this;
  }
  public ServiceDefinitionV2 putExtensionsItem(String key, Object extensionsItem) {
    if (this.extensions == null) {
      this.extensions = new HashMap<>();
    }
    this.extensions.put(key, extensionsItem);
    return this;
  }

  /**
   * <p>Extensions to V2 schema.</p>
   * @return extensions
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_EXTENSIONS)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public Map<String, Object> getExtensions() {
        return extensions;
      }
  public void setExtensions(Map<String, Object> extensions) {
    this.extensions = extensions;
  }
  public ServiceDefinitionV2 integrations(ServiceDefinitionV2Integrations integrations) {
    this.integrations = integrations;
    this.unparsed |= integrations.unparsed;
    return this;
  }

  /**
   * <p>Third party integrations that Datadog supports.</p>
   * @return integrations
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_INTEGRATIONS)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public ServiceDefinitionV2Integrations getIntegrations() {
        return integrations;
      }
  public void setIntegrations(ServiceDefinitionV2Integrations integrations) {
    this.integrations = integrations;
  }
  public ServiceDefinitionV2 links(List<ServiceDefinitionV2Link> links) {
    this.links = links;
    for (ServiceDefinitionV2Link item : links) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }
  public ServiceDefinitionV2 addLinksItem(ServiceDefinitionV2Link linksItem) {
    if (this.links == null) {
      this.links = new ArrayList<>();
    }
    this.links.add(linksItem);
    this.unparsed |= linksItem.unparsed;
    return this;
  }

  /**
   * <p>A list of links related to the services.</p>
   * @return links
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_LINKS)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public List<ServiceDefinitionV2Link> getLinks() {
        return links;
      }
  public void setLinks(List<ServiceDefinitionV2Link> links) {
    this.links = links;
  }
  public ServiceDefinitionV2 repos(List<ServiceDefinitionV2Repo> repos) {
    this.repos = repos;
    for (ServiceDefinitionV2Repo item : repos) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }
  public ServiceDefinitionV2 addReposItem(ServiceDefinitionV2Repo reposItem) {
    if (this.repos == null) {
      this.repos = new ArrayList<>();
    }
    this.repos.add(reposItem);
    this.unparsed |= reposItem.unparsed;
    return this;
  }

  /**
   * <p>A list of code repositories related to the services.</p>
   * @return repos
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_REPOS)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public List<ServiceDefinitionV2Repo> getRepos() {
        return repos;
      }
  public void setRepos(List<ServiceDefinitionV2Repo> repos) {
    this.repos = repos;
  }
  public ServiceDefinitionV2 schemaVersion(ServiceDefinitionV2Version schemaVersion) {
    this.schemaVersion = schemaVersion;
    this.unparsed |= !schemaVersion.isValid();
    return this;
  }

  /**
   * <p>Schema version being used.</p>
   * @return schemaVersion
  **/
      @JsonProperty(JSON_PROPERTY_SCHEMA_VERSION)
      @JsonInclude(
        value = JsonInclude.Include.ALWAYS)
      public ServiceDefinitionV2Version getSchemaVersion() {
        return schemaVersion;
      }
  public void setSchemaVersion(ServiceDefinitionV2Version schemaVersion) {
    if (!schemaVersion.isValid()) {
        this.unparsed = true;
    }
    this.schemaVersion = schemaVersion;
  }
  public ServiceDefinitionV2 tags(List<String> tags) {
    this.tags = tags;
    return this;
  }
  public ServiceDefinitionV2 addTagsItem(String tagsItem) {
    if (this.tags == null) {
      this.tags = new ArrayList<>();
    }
    this.tags.add(tagsItem);
    return this;
  }

  /**
   * <p>A set of custom tags.</p>
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
  public ServiceDefinitionV2 team(String team) {
    this.team = team;
    return this;
  }

  /**
   * <p>Team that owns the service.</p>
   * @return team
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_TEAM)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public String getTeam() {
        return team;
      }
  public void setTeam(String team) {
    this.team = team;
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
   * @return ServiceDefinitionV2
   */
  @JsonAnySetter
  public ServiceDefinitionV2 putAdditionalProperty(String key, Object value) {
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
   * Return true if this ServiceDefinitionV2 object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ServiceDefinitionV2 serviceDefinitionV2 = (ServiceDefinitionV2) o;
    return Objects.equals(this.contacts, serviceDefinitionV2.contacts) && Objects.equals(this.ddService, serviceDefinitionV2.ddService) && Objects.equals(this.ddTeam, serviceDefinitionV2.ddTeam) && Objects.equals(this.docs, serviceDefinitionV2.docs) && Objects.equals(this.extensions, serviceDefinitionV2.extensions) && Objects.equals(this.integrations, serviceDefinitionV2.integrations) && Objects.equals(this.links, serviceDefinitionV2.links) && Objects.equals(this.repos, serviceDefinitionV2.repos) && Objects.equals(this.schemaVersion, serviceDefinitionV2.schemaVersion) && Objects.equals(this.tags, serviceDefinitionV2.tags) && Objects.equals(this.team, serviceDefinitionV2.team) && Objects.equals(this.additionalProperties, serviceDefinitionV2.additionalProperties);
  }


  @Override
  public int hashCode() {
    return Objects.hash(contacts,ddService,ddTeam,docs,extensions,integrations,links,repos,schemaVersion,tags,team, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ServiceDefinitionV2 {\n");
    sb.append("    contacts: ").append(toIndentedString(contacts)).append("\n");
    sb.append("    ddService: ").append(toIndentedString(ddService)).append("\n");
    sb.append("    ddTeam: ").append(toIndentedString(ddTeam)).append("\n");
    sb.append("    docs: ").append(toIndentedString(docs)).append("\n");
    sb.append("    extensions: ").append(toIndentedString(extensions)).append("\n");
    sb.append("    integrations: ").append(toIndentedString(integrations)).append("\n");
    sb.append("    links: ").append(toIndentedString(links)).append("\n");
    sb.append("    repos: ").append(toIndentedString(repos)).append("\n");
    sb.append("    schemaVersion: ").append(toIndentedString(schemaVersion)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("    team: ").append(toIndentedString(team)).append("\n");
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
