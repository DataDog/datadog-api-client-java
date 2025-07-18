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
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/** Schema for datastore entities. */
@JsonPropertyOrder({
  EntityV3Datastore.JSON_PROPERTY_API_VERSION,
  EntityV3Datastore.JSON_PROPERTY_DATADOG,
  EntityV3Datastore.JSON_PROPERTY_EXTENSIONS,
  EntityV3Datastore.JSON_PROPERTY_INTEGRATIONS,
  EntityV3Datastore.JSON_PROPERTY_KIND,
  EntityV3Datastore.JSON_PROPERTY_METADATA,
  EntityV3Datastore.JSON_PROPERTY_SPEC
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class EntityV3Datastore {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_API_VERSION = "apiVersion";
  private EntityV3APIVersion apiVersion;

  public static final String JSON_PROPERTY_DATADOG = "datadog";
  private EntityV3DatastoreDatadog datadog;

  public static final String JSON_PROPERTY_EXTENSIONS = "extensions";
  private Map<String, Object> extensions = null;

  public static final String JSON_PROPERTY_INTEGRATIONS = "integrations";
  private EntityV3Integrations integrations;

  public static final String JSON_PROPERTY_KIND = "kind";
  private EntityV3DatastoreKind kind;

  public static final String JSON_PROPERTY_METADATA = "metadata";
  private EntityV3Metadata metadata;

  public static final String JSON_PROPERTY_SPEC = "spec";
  private EntityV3DatastoreSpec spec;

  public EntityV3Datastore() {}

  @JsonCreator
  public EntityV3Datastore(
      @JsonProperty(required = true, value = JSON_PROPERTY_API_VERSION)
          EntityV3APIVersion apiVersion,
      @JsonProperty(required = true, value = JSON_PROPERTY_KIND) EntityV3DatastoreKind kind,
      @JsonProperty(required = true, value = JSON_PROPERTY_METADATA) EntityV3Metadata metadata) {
    this.apiVersion = apiVersion;
    this.unparsed |= !apiVersion.isValid();
    this.kind = kind;
    this.unparsed |= !kind.isValid();
    this.metadata = metadata;
    this.unparsed |= metadata.unparsed;
  }

  public EntityV3Datastore apiVersion(EntityV3APIVersion apiVersion) {
    this.apiVersion = apiVersion;
    this.unparsed |= !apiVersion.isValid();
    return this;
  }

  /**
   * The version of the schema data that was used to populate this entity's data. This could be via
   * the API, Terraform, or YAML file in a repository. The field is known as schema-version in the
   * previous version.
   *
   * @return apiVersion
   */
  @JsonProperty(JSON_PROPERTY_API_VERSION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public EntityV3APIVersion getApiVersion() {
    return apiVersion;
  }

  public void setApiVersion(EntityV3APIVersion apiVersion) {
    if (!apiVersion.isValid()) {
      this.unparsed = true;
    }
    this.apiVersion = apiVersion;
  }

  public EntityV3Datastore datadog(EntityV3DatastoreDatadog datadog) {
    this.datadog = datadog;
    this.unparsed |= datadog.unparsed;
    return this;
  }

  /**
   * Datadog product integrations for the datastore entity.
   *
   * @return datadog
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DATADOG)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public EntityV3DatastoreDatadog getDatadog() {
    return datadog;
  }

  public void setDatadog(EntityV3DatastoreDatadog datadog) {
    this.datadog = datadog;
  }

  public EntityV3Datastore extensions(Map<String, Object> extensions) {
    this.extensions = extensions;
    return this;
  }

  public EntityV3Datastore putExtensionsItem(String key, Object extensionsItem) {
    if (this.extensions == null) {
      this.extensions = new HashMap<>();
    }
    this.extensions.put(key, extensionsItem);
    return this;
  }

  /**
   * Custom extensions. This is the free-formed field to send client side metadata. No Datadog
   * features are affected by this field.
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

  public EntityV3Datastore integrations(EntityV3Integrations integrations) {
    this.integrations = integrations;
    this.unparsed |= integrations.unparsed;
    return this;
  }

  /**
   * A base schema for defining third-party integrations.
   *
   * @return integrations
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_INTEGRATIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public EntityV3Integrations getIntegrations() {
    return integrations;
  }

  public void setIntegrations(EntityV3Integrations integrations) {
    this.integrations = integrations;
  }

  public EntityV3Datastore kind(EntityV3DatastoreKind kind) {
    this.kind = kind;
    this.unparsed |= !kind.isValid();
    return this;
  }

  /**
   * The definition of Entity V3 Datastore Kind object.
   *
   * @return kind
   */
  @JsonProperty(JSON_PROPERTY_KIND)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public EntityV3DatastoreKind getKind() {
    return kind;
  }

  public void setKind(EntityV3DatastoreKind kind) {
    if (!kind.isValid()) {
      this.unparsed = true;
    }
    this.kind = kind;
  }

  public EntityV3Datastore metadata(EntityV3Metadata metadata) {
    this.metadata = metadata;
    this.unparsed |= metadata.unparsed;
    return this;
  }

  /**
   * The definition of Entity V3 Metadata object.
   *
   * @return metadata
   */
  @JsonProperty(JSON_PROPERTY_METADATA)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public EntityV3Metadata getMetadata() {
    return metadata;
  }

  public void setMetadata(EntityV3Metadata metadata) {
    this.metadata = metadata;
  }

  public EntityV3Datastore spec(EntityV3DatastoreSpec spec) {
    this.spec = spec;
    this.unparsed |= spec.unparsed;
    return this;
  }

  /**
   * The definition of Entity V3 Datastore Spec object.
   *
   * @return spec
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SPEC)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public EntityV3DatastoreSpec getSpec() {
    return spec;
  }

  public void setSpec(EntityV3DatastoreSpec spec) {
    this.spec = spec;
  }

  /** Return true if this EntityV3Datastore object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EntityV3Datastore entityV3Datastore = (EntityV3Datastore) o;
    return Objects.equals(this.apiVersion, entityV3Datastore.apiVersion)
        && Objects.equals(this.datadog, entityV3Datastore.datadog)
        && Objects.equals(this.extensions, entityV3Datastore.extensions)
        && Objects.equals(this.integrations, entityV3Datastore.integrations)
        && Objects.equals(this.kind, entityV3Datastore.kind)
        && Objects.equals(this.metadata, entityV3Datastore.metadata)
        && Objects.equals(this.spec, entityV3Datastore.spec);
  }

  @Override
  public int hashCode() {
    return Objects.hash(apiVersion, datadog, extensions, integrations, kind, metadata, spec);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EntityV3Datastore {\n");
    sb.append("    apiVersion: ").append(toIndentedString(apiVersion)).append("\n");
    sb.append("    datadog: ").append(toIndentedString(datadog)).append("\n");
    sb.append("    extensions: ").append(toIndentedString(extensions)).append("\n");
    sb.append("    integrations: ").append(toIndentedString(integrations)).append("\n");
    sb.append("    kind: ").append(toIndentedString(kind)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
    sb.append("    spec: ").append(toIndentedString(spec)).append("\n");
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
