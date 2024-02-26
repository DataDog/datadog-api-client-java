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
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/** JSON object containing all span attributes and their associated values. */
@JsonPropertyOrder({
  SpansAttributes.JSON_PROPERTY_ATTRIBUTES,
  SpansAttributes.JSON_PROPERTY_CUSTOM,
  SpansAttributes.JSON_PROPERTY_END_TIMESTAMP,
  SpansAttributes.JSON_PROPERTY_ENV,
  SpansAttributes.JSON_PROPERTY_HOST,
  SpansAttributes.JSON_PROPERTY_INGESTION_REASON,
  SpansAttributes.JSON_PROPERTY_PARENT_ID,
  SpansAttributes.JSON_PROPERTY_RESOURCE_HASH,
  SpansAttributes.JSON_PROPERTY_RESOURCE_NAME,
  SpansAttributes.JSON_PROPERTY_RETAINED_BY,
  SpansAttributes.JSON_PROPERTY_SERVICE,
  SpansAttributes.JSON_PROPERTY_SINGLE_SPAN,
  SpansAttributes.JSON_PROPERTY_SPAN_ID,
  SpansAttributes.JSON_PROPERTY_START_TIMESTAMP,
  SpansAttributes.JSON_PROPERTY_TAGS,
  SpansAttributes.JSON_PROPERTY_TRACE_ID,
  SpansAttributes.JSON_PROPERTY_TYPE
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class SpansAttributes {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_ATTRIBUTES = "attributes";
  private Map<String, Object> attributes = null;

  public static final String JSON_PROPERTY_CUSTOM = "custom";
  private Map<String, Object> custom = null;

  public static final String JSON_PROPERTY_END_TIMESTAMP = "end_timestamp";
  private OffsetDateTime endTimestamp;

  public static final String JSON_PROPERTY_ENV = "env";
  private String env;

  public static final String JSON_PROPERTY_HOST = "host";
  private String host;

  public static final String JSON_PROPERTY_INGESTION_REASON = "ingestion_reason";
  private String ingestionReason;

  public static final String JSON_PROPERTY_PARENT_ID = "parent_id";
  private String parentId;

  public static final String JSON_PROPERTY_RESOURCE_HASH = "resource_hash";
  private String resourceHash;

  public static final String JSON_PROPERTY_RESOURCE_NAME = "resource_name";
  private String resourceName;

  public static final String JSON_PROPERTY_RETAINED_BY = "retained_by";
  private String retainedBy;

  public static final String JSON_PROPERTY_SERVICE = "service";
  private String service;

  public static final String JSON_PROPERTY_SINGLE_SPAN = "single_span";
  private Boolean singleSpan;

  public static final String JSON_PROPERTY_SPAN_ID = "span_id";
  private String spanId;

  public static final String JSON_PROPERTY_START_TIMESTAMP = "start_timestamp";
  private OffsetDateTime startTimestamp;

  public static final String JSON_PROPERTY_TAGS = "tags";
  private List<String> tags = null;

  public static final String JSON_PROPERTY_TRACE_ID = "trace_id";
  private String traceId;

  public static final String JSON_PROPERTY_TYPE = "type";
  private String type;

  public SpansAttributes attributes(Map<String, Object> attributes) {
    this.attributes = attributes;
    return this;
  }

  public SpansAttributes putAttributesItem(String key, Object attributesItem) {
    if (this.attributes == null) {
      this.attributes = new HashMap<>();
    }
    this.attributes.put(key, attributesItem);
    return this;
  }

  /**
   * JSON object of attributes from your span.
   *
   * @return attributes
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ATTRIBUTES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Map<String, Object> getAttributes() {
    return attributes;
  }

  public void setAttributes(Map<String, Object> attributes) {
    this.attributes = attributes;
  }

  public SpansAttributes custom(Map<String, Object> custom) {
    this.custom = custom;
    return this;
  }

  public SpansAttributes putCustomItem(String key, Object customItem) {
    if (this.custom == null) {
      this.custom = new HashMap<>();
    }
    this.custom.put(key, customItem);
    return this;
  }

  /**
   * JSON object of custom spans data.
   *
   * @return custom
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CUSTOM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Map<String, Object> getCustom() {
    return custom;
  }

  public void setCustom(Map<String, Object> custom) {
    this.custom = custom;
  }

  public SpansAttributes endTimestamp(OffsetDateTime endTimestamp) {
    this.endTimestamp = endTimestamp;
    return this;
  }

  /**
   * End timestamp of your span.
   *
   * @return endTimestamp
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_END_TIMESTAMP)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public OffsetDateTime getEndTimestamp() {
    return endTimestamp;
  }

  public void setEndTimestamp(OffsetDateTime endTimestamp) {
    this.endTimestamp = endTimestamp;
  }

  public SpansAttributes env(String env) {
    this.env = env;
    return this;
  }

  /**
   * Name of the environment from where the spans are being sent.
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

  public SpansAttributes host(String host) {
    this.host = host;
    return this;
  }

  /**
   * Name of the machine from where the spans are being sent.
   *
   * @return host
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_HOST)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getHost() {
    return host;
  }

  public void setHost(String host) {
    this.host = host;
  }

  public SpansAttributes ingestionReason(String ingestionReason) {
    this.ingestionReason = ingestionReason;
    return this;
  }

  /**
   * The reason why the span was ingested.
   *
   * @return ingestionReason
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_INGESTION_REASON)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getIngestionReason() {
    return ingestionReason;
  }

  public void setIngestionReason(String ingestionReason) {
    this.ingestionReason = ingestionReason;
  }

  public SpansAttributes parentId(String parentId) {
    this.parentId = parentId;
    return this;
  }

  /**
   * Id of the span that's parent of this span.
   *
   * @return parentId
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PARENT_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getParentId() {
    return parentId;
  }

  public void setParentId(String parentId) {
    this.parentId = parentId;
  }

  public SpansAttributes resourceHash(String resourceHash) {
    this.resourceHash = resourceHash;
    return this;
  }

  /**
   * Unique identifier of the resource.
   *
   * @return resourceHash
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_RESOURCE_HASH)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getResourceHash() {
    return resourceHash;
  }

  public void setResourceHash(String resourceHash) {
    this.resourceHash = resourceHash;
  }

  public SpansAttributes resourceName(String resourceName) {
    this.resourceName = resourceName;
    return this;
  }

  /**
   * The name of the resource.
   *
   * @return resourceName
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_RESOURCE_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getResourceName() {
    return resourceName;
  }

  public void setResourceName(String resourceName) {
    this.resourceName = resourceName;
  }

  public SpansAttributes retainedBy(String retainedBy) {
    this.retainedBy = retainedBy;
    return this;
  }

  /**
   * The reason why the span was indexed.
   *
   * @return retainedBy
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_RETAINED_BY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getRetainedBy() {
    return retainedBy;
  }

  public void setRetainedBy(String retainedBy) {
    this.retainedBy = retainedBy;
  }

  public SpansAttributes service(String service) {
    this.service = service;
    return this;
  }

  /**
   * The name of the application or service generating the span events. It is used to switch from
   * APM to Logs, so make sure you define the same value when you use both products.
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

  public SpansAttributes singleSpan(Boolean singleSpan) {
    this.singleSpan = singleSpan;
    return this;
  }

  /**
   * Whether or not the span was collected as a stand-alone span. Always associated to "single_span"
   * ingestion_reason if true.
   *
   * @return singleSpan
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SINGLE_SPAN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getSingleSpan() {
    return singleSpan;
  }

  public void setSingleSpan(Boolean singleSpan) {
    this.singleSpan = singleSpan;
  }

  public SpansAttributes spanId(String spanId) {
    this.spanId = spanId;
    return this;
  }

  /**
   * Id of the span.
   *
   * @return spanId
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SPAN_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getSpanId() {
    return spanId;
  }

  public void setSpanId(String spanId) {
    this.spanId = spanId;
  }

  public SpansAttributes startTimestamp(OffsetDateTime startTimestamp) {
    this.startTimestamp = startTimestamp;
    return this;
  }

  /**
   * Start timestamp of your span.
   *
   * @return startTimestamp
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_START_TIMESTAMP)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public OffsetDateTime getStartTimestamp() {
    return startTimestamp;
  }

  public void setStartTimestamp(OffsetDateTime startTimestamp) {
    this.startTimestamp = startTimestamp;
  }

  public SpansAttributes tags(List<String> tags) {
    this.tags = tags;
    return this;
  }

  public SpansAttributes addTagsItem(String tagsItem) {
    if (this.tags == null) {
      this.tags = new ArrayList<>();
    }
    this.tags.add(tagsItem);
    return this;
  }

  /**
   * Array of tags associated with your span.
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

  public SpansAttributes traceId(String traceId) {
    this.traceId = traceId;
    return this;
  }

  /**
   * Id of the trace to which the span belongs.
   *
   * @return traceId
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TRACE_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getTraceId() {
    return traceId;
  }

  public void setTraceId(String traceId) {
    this.traceId = traceId;
  }

  public SpansAttributes type(String type) {
    this.type = type;
    return this;
  }

  /**
   * The type of the span.
   *
   * @return type
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
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
   * @return SpansAttributes
   */
  @JsonAnySetter
  public SpansAttributes putAdditionalProperty(String key, Object value) {
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

  /** Return true if this SpansAttributes object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SpansAttributes spansAttributes = (SpansAttributes) o;
    return Objects.equals(this.attributes, spansAttributes.attributes)
        && Objects.equals(this.custom, spansAttributes.custom)
        && Objects.equals(this.endTimestamp, spansAttributes.endTimestamp)
        && Objects.equals(this.env, spansAttributes.env)
        && Objects.equals(this.host, spansAttributes.host)
        && Objects.equals(this.ingestionReason, spansAttributes.ingestionReason)
        && Objects.equals(this.parentId, spansAttributes.parentId)
        && Objects.equals(this.resourceHash, spansAttributes.resourceHash)
        && Objects.equals(this.resourceName, spansAttributes.resourceName)
        && Objects.equals(this.retainedBy, spansAttributes.retainedBy)
        && Objects.equals(this.service, spansAttributes.service)
        && Objects.equals(this.singleSpan, spansAttributes.singleSpan)
        && Objects.equals(this.spanId, spansAttributes.spanId)
        && Objects.equals(this.startTimestamp, spansAttributes.startTimestamp)
        && Objects.equals(this.tags, spansAttributes.tags)
        && Objects.equals(this.traceId, spansAttributes.traceId)
        && Objects.equals(this.type, spansAttributes.type)
        && Objects.equals(this.additionalProperties, spansAttributes.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        attributes,
        custom,
        endTimestamp,
        env,
        host,
        ingestionReason,
        parentId,
        resourceHash,
        resourceName,
        retainedBy,
        service,
        singleSpan,
        spanId,
        startTimestamp,
        tags,
        traceId,
        type,
        additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SpansAttributes {\n");
    sb.append("    attributes: ").append(toIndentedString(attributes)).append("\n");
    sb.append("    custom: ").append(toIndentedString(custom)).append("\n");
    sb.append("    endTimestamp: ").append(toIndentedString(endTimestamp)).append("\n");
    sb.append("    env: ").append(toIndentedString(env)).append("\n");
    sb.append("    host: ").append(toIndentedString(host)).append("\n");
    sb.append("    ingestionReason: ").append(toIndentedString(ingestionReason)).append("\n");
    sb.append("    parentId: ").append(toIndentedString(parentId)).append("\n");
    sb.append("    resourceHash: ").append(toIndentedString(resourceHash)).append("\n");
    sb.append("    resourceName: ").append(toIndentedString(resourceName)).append("\n");
    sb.append("    retainedBy: ").append(toIndentedString(retainedBy)).append("\n");
    sb.append("    service: ").append(toIndentedString(service)).append("\n");
    sb.append("    singleSpan: ").append(toIndentedString(singleSpan)).append("\n");
    sb.append("    spanId: ").append(toIndentedString(spanId)).append("\n");
    sb.append("    startTimestamp: ").append(toIndentedString(startTimestamp)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("    traceId: ").append(toIndentedString(traceId)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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
