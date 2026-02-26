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
   * <p>Schema for queue entities.</p>
 */
@JsonPropertyOrder({
  EntityV3Queue.JSON_PROPERTY_API_VERSION,
  EntityV3Queue.JSON_PROPERTY_DATADOG,
  EntityV3Queue.JSON_PROPERTY_EXTENSIONS,
  EntityV3Queue.JSON_PROPERTY_INTEGRATIONS,
  EntityV3Queue.JSON_PROPERTY_KIND,
  EntityV3Queue.JSON_PROPERTY_METADATA,
  EntityV3Queue.JSON_PROPERTY_SPEC
})
@jakarta.annotation.Generated(value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class EntityV3Queue {
  @JsonIgnore
  public boolean unparsed = false;
  public static final String JSON_PROPERTY_API_VERSION = "apiVersion";
  private EntityV3APIVersion apiVersion;

  public static final String JSON_PROPERTY_DATADOG = "datadog";
  private EntityV3QueueDatadog datadog;

  public static final String JSON_PROPERTY_EXTENSIONS = "extensions";
  private Map<String, Object> extensions = null;

  public static final String JSON_PROPERTY_INTEGRATIONS = "integrations";
  private EntityV3Integrations integrations;

  public static final String JSON_PROPERTY_KIND = "kind";
  private EntityV3QueueKind kind;

  public static final String JSON_PROPERTY_METADATA = "metadata";
  private EntityV3Metadata metadata;

  public static final String JSON_PROPERTY_SPEC = "spec";
  private EntityV3QueueSpec spec;

  public EntityV3Queue() {}

  @JsonCreator
  public EntityV3Queue(
            @JsonProperty(required=true, value=JSON_PROPERTY_API_VERSION)EntityV3APIVersion apiVersion,
            @JsonProperty(required=true, value=JSON_PROPERTY_KIND)EntityV3QueueKind kind,
            @JsonProperty(required=true, value=JSON_PROPERTY_METADATA)EntityV3Metadata metadata) {
        this.apiVersion = apiVersion;
        this.unparsed |= !apiVersion.isValid();
        this.kind = kind;
        this.unparsed |= !kind.isValid();
        this.metadata = metadata;
        this.unparsed |= metadata.unparsed;
  }
  public EntityV3Queue apiVersion(EntityV3APIVersion apiVersion) {
    this.apiVersion = apiVersion;
    this.unparsed |= !apiVersion.isValid();
    return this;
  }

  /**
   * <p>The version of the schema data that was used to populate this entity's data. This could be via the API, Terraform, or YAML file in a repository. The field is known as schema-version in the previous version.</p>
   * @return apiVersion
  **/
      @JsonProperty(JSON_PROPERTY_API_VERSION)
      @JsonInclude(
        value = JsonInclude.Include.ALWAYS)
      public EntityV3APIVersion getApiVersion() {
        return apiVersion;
      }
  public void setApiVersion(EntityV3APIVersion apiVersion) {
    if (!apiVersion.isValid()) {
        this.unparsed = true;
    }
    this.apiVersion = apiVersion;
  }
  public EntityV3Queue datadog(EntityV3QueueDatadog datadog) {
    this.datadog = datadog;
    this.unparsed |= datadog.unparsed;
    return this;
  }

  /**
   * <p>Datadog product integrations for the datastore entity.</p>
   * @return datadog
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_DATADOG)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public EntityV3QueueDatadog getDatadog() {
        return datadog;
      }
  public void setDatadog(EntityV3QueueDatadog datadog) {
    this.datadog = datadog;
  }
  public EntityV3Queue extensions(Map<String, Object> extensions) {
    this.extensions = extensions;
    return this;
  }
  public EntityV3Queue putExtensionsItem(String key, Object extensionsItem) {
    if (this.extensions == null) {
      this.extensions = new HashMap<>();
    }
    this.extensions.put(key, extensionsItem);
    return this;
  }

  /**
   * <p>Custom extensions. This is the free-formed field to send client-side metadata. No Datadog features are affected by this field.</p>
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
  public EntityV3Queue integrations(EntityV3Integrations integrations) {
    this.integrations = integrations;
    this.unparsed |= integrations.unparsed;
    return this;
  }

  /**
   * <p>A base schema for defining third-party integrations.</p>
   * @return integrations
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_INTEGRATIONS)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public EntityV3Integrations getIntegrations() {
        return integrations;
      }
  public void setIntegrations(EntityV3Integrations integrations) {
    this.integrations = integrations;
  }
  public EntityV3Queue kind(EntityV3QueueKind kind) {
    this.kind = kind;
    this.unparsed |= !kind.isValid();
    return this;
  }

  /**
   * <p>The definition of Entity V3 Queue Kind object.</p>
   * @return kind
  **/
      @JsonProperty(JSON_PROPERTY_KIND)
      @JsonInclude(
        value = JsonInclude.Include.ALWAYS)
      public EntityV3QueueKind getKind() {
        return kind;
      }
  public void setKind(EntityV3QueueKind kind) {
    if (!kind.isValid()) {
        this.unparsed = true;
    }
    this.kind = kind;
  }
  public EntityV3Queue metadata(EntityV3Metadata metadata) {
    this.metadata = metadata;
    this.unparsed |= metadata.unparsed;
    return this;
  }

  /**
   * <p>The definition of Entity V3 Metadata object.</p>
   * @return metadata
  **/
      @JsonProperty(JSON_PROPERTY_METADATA)
      @JsonInclude(
        value = JsonInclude.Include.ALWAYS)
      public EntityV3Metadata getMetadata() {
        return metadata;
      }
  public void setMetadata(EntityV3Metadata metadata) {
    this.metadata = metadata;
  }
  public EntityV3Queue spec(EntityV3QueueSpec spec) {
    this.spec = spec;
    this.unparsed |= spec.unparsed;
    return this;
  }

  /**
   * <p>The definition of Entity V3 Queue Spec object.</p>
   * @return spec
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_SPEC)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public EntityV3QueueSpec getSpec() {
        return spec;
      }
  public void setSpec(EntityV3QueueSpec spec) {
    this.spec = spec;
  }

  /**
   * Return true if this EntityV3Queue object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EntityV3Queue entityV3Queue = (EntityV3Queue) o;
    return Objects.equals(this.apiVersion, entityV3Queue.apiVersion) && Objects.equals(this.datadog, entityV3Queue.datadog) && Objects.equals(this.extensions, entityV3Queue.extensions) && Objects.equals(this.integrations, entityV3Queue.integrations) && Objects.equals(this.kind, entityV3Queue.kind) && Objects.equals(this.metadata, entityV3Queue.metadata) && Objects.equals(this.spec, entityV3Queue.spec);
  }


  @Override
  public int hashCode() {
    return Objects.hash(apiVersion,datadog,extensions,integrations,kind,metadata,spec);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EntityV3Queue {\n");
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
