/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v2.model;

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

/**
 * Deprecated - Service definition V1 for providing additional service metadata and integrations.
 *
 * @deprecated
 */
@Deprecated
@JsonPropertyOrder({
  ServiceDefinitionV1.JSON_PROPERTY_CONTACT,
  ServiceDefinitionV1.JSON_PROPERTY_EXTENSIONS,
  ServiceDefinitionV1.JSON_PROPERTY_EXTERNAL_RESOURCES,
  ServiceDefinitionV1.JSON_PROPERTY_INFO,
  ServiceDefinitionV1.JSON_PROPERTY_INTEGRATIONS,
  ServiceDefinitionV1.JSON_PROPERTY_ORG,
  ServiceDefinitionV1.JSON_PROPERTY_SCHEMA_VERSION,
  ServiceDefinitionV1.JSON_PROPERTY_TAGS
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class ServiceDefinitionV1 {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_CONTACT = "contact";
  private ServiceDefinitionV1Contact contact = null;

  public static final String JSON_PROPERTY_EXTENSIONS = "extensions";
  private Map<String, Object> extensions = null;

  public static final String JSON_PROPERTY_EXTERNAL_RESOURCES = "external-resources";
  private List<ServiceDefinitionV1Resource> externalResources = null;

  public static final String JSON_PROPERTY_INFO = "info";
  private ServiceDefinitionV1Info info;

  public static final String JSON_PROPERTY_INTEGRATIONS = "integrations";
  private ServiceDefinitionV1Integrations integrations;

  public static final String JSON_PROPERTY_ORG = "org";
  private ServiceDefinitionV1Org org;

  public static final String JSON_PROPERTY_SCHEMA_VERSION = "schema-version";
  private ServiceDefinitionV1Version schemaVersion = ServiceDefinitionV1Version.V1;

  public static final String JSON_PROPERTY_TAGS = "tags";
  private List<String> tags = null;

  public ServiceDefinitionV1() {}

  @JsonCreator
  public ServiceDefinitionV1(
      @JsonProperty(required = true, value = JSON_PROPERTY_INFO) ServiceDefinitionV1Info info,
      @JsonProperty(required = true, value = JSON_PROPERTY_SCHEMA_VERSION)
          ServiceDefinitionV1Version schemaVersion) {
    this.info = info;
    this.unparsed |= info.unparsed;
    this.schemaVersion = schemaVersion;
    this.unparsed |= !schemaVersion.isValid();
  }

  public ServiceDefinitionV1 contact(ServiceDefinitionV1Contact contact) {
    this.contact = contact;
    this.unparsed |= contact.unparsed;
    return this;
  }

  /**
   * Contact information about the service.
   *
   * @return contact
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CONTACT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public ServiceDefinitionV1Contact getContact() {
    return contact;
  }

  public void setContact(ServiceDefinitionV1Contact contact) {
    this.contact = contact;
  }

  public ServiceDefinitionV1 extensions(Map<String, Object> extensions) {
    this.extensions = extensions;
    return this;
  }

  public ServiceDefinitionV1 putExtensionsItem(String key, Object extensionsItem) {
    if (this.extensions == null) {
      this.extensions = new HashMap<>();
    }
    this.extensions.put(key, extensionsItem);
    return this;
  }

  /**
   * Extensions to V1 schema.
   *
   * @return extensions
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_EXTENSIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Map<String, Object> getExtensions() {
    return extensions;
  }

  public void setExtensions(Map<String, Object> extensions) {
    this.extensions = extensions;
  }

  public ServiceDefinitionV1 externalResources(
      List<ServiceDefinitionV1Resource> externalResources) {
    this.externalResources = externalResources;
    for (ServiceDefinitionV1Resource item : externalResources) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }

  public ServiceDefinitionV1 addExternalResourcesItem(
      ServiceDefinitionV1Resource externalResourcesItem) {
    if (this.externalResources == null) {
      this.externalResources = new ArrayList<>();
    }
    this.externalResources.add(externalResourcesItem);
    this.unparsed |= externalResourcesItem.unparsed;
    return this;
  }

  /**
   * A list of external links related to the services.
   *
   * @return externalResources
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_EXTERNAL_RESOURCES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<ServiceDefinitionV1Resource> getExternalResources() {
    return externalResources;
  }

  public void setExternalResources(List<ServiceDefinitionV1Resource> externalResources) {
    this.externalResources = externalResources;
  }

  public ServiceDefinitionV1 info(ServiceDefinitionV1Info info) {
    this.info = info;
    this.unparsed |= info.unparsed;
    return this;
  }

  /**
   * Basic information about a service.
   *
   * @return info
   */
  @JsonProperty(JSON_PROPERTY_INFO)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public ServiceDefinitionV1Info getInfo() {
    return info;
  }

  public void setInfo(ServiceDefinitionV1Info info) {
    this.info = info;
  }

  public ServiceDefinitionV1 integrations(ServiceDefinitionV1Integrations integrations) {
    this.integrations = integrations;
    this.unparsed |= integrations.unparsed;
    return this;
  }

  /**
   * Third party integrations that Datadog supports.
   *
   * @return integrations
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_INTEGRATIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public ServiceDefinitionV1Integrations getIntegrations() {
    return integrations;
  }

  public void setIntegrations(ServiceDefinitionV1Integrations integrations) {
    this.integrations = integrations;
  }

  public ServiceDefinitionV1 org(ServiceDefinitionV1Org org) {
    this.org = org;
    this.unparsed |= org.unparsed;
    return this;
  }

  /**
   * Org related information about the service.
   *
   * @return org
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ORG)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public ServiceDefinitionV1Org getOrg() {
    return org;
  }

  public void setOrg(ServiceDefinitionV1Org org) {
    this.org = org;
  }

  public ServiceDefinitionV1 schemaVersion(ServiceDefinitionV1Version schemaVersion) {
    this.schemaVersion = schemaVersion;
    this.unparsed |= !schemaVersion.isValid();
    return this;
  }

  /**
   * Schema version being used.
   *
   * @return schemaVersion
   */
  @JsonProperty(JSON_PROPERTY_SCHEMA_VERSION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public ServiceDefinitionV1Version getSchemaVersion() {
    return schemaVersion;
  }

  public void setSchemaVersion(ServiceDefinitionV1Version schemaVersion) {
    if (!schemaVersion.isValid()) {
      this.unparsed = true;
    }
    this.schemaVersion = schemaVersion;
  }

  public ServiceDefinitionV1 tags(List<String> tags) {
    this.tags = tags;
    return this;
  }

  public ServiceDefinitionV1 addTagsItem(String tagsItem) {
    if (this.tags == null) {
      this.tags = new ArrayList<>();
    }
    this.tags.add(tagsItem);
    return this;
  }

  /**
   * A set of custom tags.
   *
   * @return tags
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TAGS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<String> getTags() {
    return tags;
  }

  public void setTags(List<String> tags) {
    this.tags = tags;
  }

  /** Return true if this ServiceDefinitionV1 object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ServiceDefinitionV1 serviceDefinitionV1 = (ServiceDefinitionV1) o;
    return Objects.equals(this.contact, serviceDefinitionV1.contact)
        && Objects.equals(this.extensions, serviceDefinitionV1.extensions)
        && Objects.equals(this.externalResources, serviceDefinitionV1.externalResources)
        && Objects.equals(this.info, serviceDefinitionV1.info)
        && Objects.equals(this.integrations, serviceDefinitionV1.integrations)
        && Objects.equals(this.org, serviceDefinitionV1.org)
        && Objects.equals(this.schemaVersion, serviceDefinitionV1.schemaVersion)
        && Objects.equals(this.tags, serviceDefinitionV1.tags);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        contact, extensions, externalResources, info, integrations, org, schemaVersion, tags);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ServiceDefinitionV1 {\n");
    sb.append("    contact: ").append(toIndentedString(contact)).append("\n");
    sb.append("    extensions: ").append(toIndentedString(extensions)).append("\n");
    sb.append("    externalResources: ").append(toIndentedString(externalResources)).append("\n");
    sb.append("    info: ").append(toIndentedString(info)).append("\n");
    sb.append("    integrations: ").append(toIndentedString(integrations)).append("\n");
    sb.append("    org: ").append(toIndentedString(org)).append("\n");
    sb.append("    schemaVersion: ").append(toIndentedString(schemaVersion)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("}");
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
