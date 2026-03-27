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
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/** The definition of <code>ArbitraryRuleResponseDataAttributes</code> object. */
@JsonPropertyOrder({
  ArbitraryRuleResponseDataAttributes.JSON_PROPERTY_COSTS_TO_ALLOCATE,
  ArbitraryRuleResponseDataAttributes.JSON_PROPERTY_CREATED,
  ArbitraryRuleResponseDataAttributes.JSON_PROPERTY_ENABLED,
  ArbitraryRuleResponseDataAttributes.JSON_PROPERTY_LAST_MODIFIED_USER_UUID,
  ArbitraryRuleResponseDataAttributes.JSON_PROPERTY_ORDER_ID,
  ArbitraryRuleResponseDataAttributes.JSON_PROPERTY_PROCESSING_STATUS,
  ArbitraryRuleResponseDataAttributes.JSON_PROPERTY_PROVIDER,
  ArbitraryRuleResponseDataAttributes.JSON_PROPERTY_REJECTED,
  ArbitraryRuleResponseDataAttributes.JSON_PROPERTY_RULE_NAME,
  ArbitraryRuleResponseDataAttributes.JSON_PROPERTY_STRATEGY,
  ArbitraryRuleResponseDataAttributes.JSON_PROPERTY_TYPE,
  ArbitraryRuleResponseDataAttributes.JSON_PROPERTY_UPDATED,
  ArbitraryRuleResponseDataAttributes.JSON_PROPERTY_VERSION
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class ArbitraryRuleResponseDataAttributes {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_COSTS_TO_ALLOCATE = "costs_to_allocate";
  private List<ArbitraryRuleResponseDataAttributesCostsToAllocateItems> costsToAllocate =
      new ArrayList<>();

  public static final String JSON_PROPERTY_CREATED = "created";
  private OffsetDateTime created;

  public static final String JSON_PROPERTY_ENABLED = "enabled";
  private Boolean enabled;

  public static final String JSON_PROPERTY_LAST_MODIFIED_USER_UUID = "last_modified_user_uuid";
  private String lastModifiedUserUuid;

  public static final String JSON_PROPERTY_ORDER_ID = "order_id";
  private Long orderId;

  public static final String JSON_PROPERTY_PROCESSING_STATUS = "processing_status";
  private String processingStatus;

  public static final String JSON_PROPERTY_PROVIDER = "provider";
  private List<String> provider = new ArrayList<>();

  public static final String JSON_PROPERTY_REJECTED = "rejected";
  private Boolean rejected;

  public static final String JSON_PROPERTY_RULE_NAME = "rule_name";
  private String ruleName;

  public static final String JSON_PROPERTY_STRATEGY = "strategy";
  private ArbitraryRuleResponseDataAttributesStrategy strategy;

  public static final String JSON_PROPERTY_TYPE = "type";
  private String type;

  public static final String JSON_PROPERTY_UPDATED = "updated";
  private OffsetDateTime updated;

  public static final String JSON_PROPERTY_VERSION = "version";
  private Integer version;

  public ArbitraryRuleResponseDataAttributes() {}

  @JsonCreator
  public ArbitraryRuleResponseDataAttributes(
      @JsonProperty(required = true, value = JSON_PROPERTY_COSTS_TO_ALLOCATE)
          List<ArbitraryRuleResponseDataAttributesCostsToAllocateItems> costsToAllocate,
      @JsonProperty(required = true, value = JSON_PROPERTY_CREATED) OffsetDateTime created,
      @JsonProperty(required = true, value = JSON_PROPERTY_ENABLED) Boolean enabled,
      @JsonProperty(required = true, value = JSON_PROPERTY_LAST_MODIFIED_USER_UUID)
          String lastModifiedUserUuid,
      @JsonProperty(required = true, value = JSON_PROPERTY_ORDER_ID) Long orderId,
      @JsonProperty(required = true, value = JSON_PROPERTY_PROVIDER) List<String> provider,
      @JsonProperty(required = true, value = JSON_PROPERTY_RULE_NAME) String ruleName,
      @JsonProperty(required = true, value = JSON_PROPERTY_STRATEGY)
          ArbitraryRuleResponseDataAttributesStrategy strategy,
      @JsonProperty(required = true, value = JSON_PROPERTY_TYPE) String type,
      @JsonProperty(required = true, value = JSON_PROPERTY_UPDATED) OffsetDateTime updated,
      @JsonProperty(required = true, value = JSON_PROPERTY_VERSION) Integer version) {
    this.costsToAllocate = costsToAllocate;
    this.created = created;
    this.enabled = enabled;
    this.lastModifiedUserUuid = lastModifiedUserUuid;
    this.orderId = orderId;
    this.provider = provider;
    this.ruleName = ruleName;
    this.strategy = strategy;
    this.unparsed |= strategy.unparsed;
    this.type = type;
    this.updated = updated;
    this.version = version;
  }

  public ArbitraryRuleResponseDataAttributes costsToAllocate(
      List<ArbitraryRuleResponseDataAttributesCostsToAllocateItems> costsToAllocate) {
    this.costsToAllocate = costsToAllocate;
    for (ArbitraryRuleResponseDataAttributesCostsToAllocateItems item : costsToAllocate) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }

  public ArbitraryRuleResponseDataAttributes addCostsToAllocateItem(
      ArbitraryRuleResponseDataAttributesCostsToAllocateItems costsToAllocateItem) {
    this.costsToAllocate.add(costsToAllocateItem);
    this.unparsed |= costsToAllocateItem.unparsed;
    return this;
  }

  /**
   * The <code>attributes</code> <code>costs_to_allocate</code>.
   *
   * @return costsToAllocate
   */
  @JsonProperty(JSON_PROPERTY_COSTS_TO_ALLOCATE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public List<ArbitraryRuleResponseDataAttributesCostsToAllocateItems> getCostsToAllocate() {
    return costsToAllocate;
  }

  public void setCostsToAllocate(
      List<ArbitraryRuleResponseDataAttributesCostsToAllocateItems> costsToAllocate) {
    this.costsToAllocate = costsToAllocate;
  }

  public ArbitraryRuleResponseDataAttributes created(OffsetDateTime created) {
    this.created = created;
    return this;
  }

  /**
   * The <code>attributes</code> <code>created</code>.
   *
   * @return created
   */
  @JsonProperty(JSON_PROPERTY_CREATED)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public OffsetDateTime getCreated() {
    return created;
  }

  public void setCreated(OffsetDateTime created) {
    this.created = created;
  }

  public ArbitraryRuleResponseDataAttributes enabled(Boolean enabled) {
    this.enabled = enabled;
    return this;
  }

  /**
   * The <code>attributes</code> <code>enabled</code>.
   *
   * @return enabled
   */
  @JsonProperty(JSON_PROPERTY_ENABLED)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Boolean getEnabled() {
    return enabled;
  }

  public void setEnabled(Boolean enabled) {
    this.enabled = enabled;
  }

  public ArbitraryRuleResponseDataAttributes lastModifiedUserUuid(String lastModifiedUserUuid) {
    this.lastModifiedUserUuid = lastModifiedUserUuid;
    return this;
  }

  /**
   * The <code>attributes</code> <code>last_modified_user_uuid</code>.
   *
   * @return lastModifiedUserUuid
   */
  @JsonProperty(JSON_PROPERTY_LAST_MODIFIED_USER_UUID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getLastModifiedUserUuid() {
    return lastModifiedUserUuid;
  }

  public void setLastModifiedUserUuid(String lastModifiedUserUuid) {
    this.lastModifiedUserUuid = lastModifiedUserUuid;
  }

  public ArbitraryRuleResponseDataAttributes orderId(Long orderId) {
    this.orderId = orderId;
    return this;
  }

  /**
   * The <code>attributes</code> <code>order_id</code>.
   *
   * @return orderId
   */
  @JsonProperty(JSON_PROPERTY_ORDER_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Long getOrderId() {
    return orderId;
  }

  public void setOrderId(Long orderId) {
    this.orderId = orderId;
  }

  public ArbitraryRuleResponseDataAttributes processingStatus(String processingStatus) {
    this.processingStatus = processingStatus;
    return this;
  }

  /**
   * The <code>attributes</code> <code>processing_status</code>.
   *
   * @return processingStatus
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PROCESSING_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getProcessingStatus() {
    return processingStatus;
  }

  public void setProcessingStatus(String processingStatus) {
    this.processingStatus = processingStatus;
  }

  public ArbitraryRuleResponseDataAttributes provider(List<String> provider) {
    this.provider = provider;
    return this;
  }

  public ArbitraryRuleResponseDataAttributes addProviderItem(String providerItem) {
    this.provider.add(providerItem);
    return this;
  }

  /**
   * The <code>attributes</code> <code>provider</code>.
   *
   * @return provider
   */
  @JsonProperty(JSON_PROPERTY_PROVIDER)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public List<String> getProvider() {
    return provider;
  }

  public void setProvider(List<String> provider) {
    this.provider = provider;
  }

  public ArbitraryRuleResponseDataAttributes rejected(Boolean rejected) {
    this.rejected = rejected;
    return this;
  }

  /**
   * The <code>attributes</code> <code>rejected</code>.
   *
   * @return rejected
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_REJECTED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getRejected() {
    return rejected;
  }

  public void setRejected(Boolean rejected) {
    this.rejected = rejected;
  }

  public ArbitraryRuleResponseDataAttributes ruleName(String ruleName) {
    this.ruleName = ruleName;
    return this;
  }

  /**
   * The <code>attributes</code> <code>rule_name</code>.
   *
   * @return ruleName
   */
  @JsonProperty(JSON_PROPERTY_RULE_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getRuleName() {
    return ruleName;
  }

  public void setRuleName(String ruleName) {
    this.ruleName = ruleName;
  }

  public ArbitraryRuleResponseDataAttributes strategy(
      ArbitraryRuleResponseDataAttributesStrategy strategy) {
    this.strategy = strategy;
    this.unparsed |= strategy.unparsed;
    return this;
  }

  /**
   * The definition of <code>ArbitraryRuleResponseDataAttributesStrategy</code> object.
   *
   * @return strategy
   */
  @JsonProperty(JSON_PROPERTY_STRATEGY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public ArbitraryRuleResponseDataAttributesStrategy getStrategy() {
    return strategy;
  }

  public void setStrategy(ArbitraryRuleResponseDataAttributesStrategy strategy) {
    this.strategy = strategy;
  }

  public ArbitraryRuleResponseDataAttributes type(String type) {
    this.type = type;
    return this;
  }

  /**
   * The <code>attributes</code> <code>type</code>.
   *
   * @return type
   */
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public ArbitraryRuleResponseDataAttributes updated(OffsetDateTime updated) {
    this.updated = updated;
    return this;
  }

  /**
   * The <code>attributes</code> <code>updated</code>.
   *
   * @return updated
   */
  @JsonProperty(JSON_PROPERTY_UPDATED)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public OffsetDateTime getUpdated() {
    return updated;
  }

  public void setUpdated(OffsetDateTime updated) {
    this.updated = updated;
  }

  public ArbitraryRuleResponseDataAttributes version(Integer version) {
    this.version = version;
    return this;
  }

  /**
   * The <code>attributes</code> <code>version</code>. maximum: 2147483647
   *
   * @return version
   */
  @JsonProperty(JSON_PROPERTY_VERSION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Integer getVersion() {
    return version;
  }

  public void setVersion(Integer version) {
    this.version = version;
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
   * @return ArbitraryRuleResponseDataAttributes
   */
  @JsonAnySetter
  public ArbitraryRuleResponseDataAttributes putAdditionalProperty(String key, Object value) {
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

  /** Return true if this ArbitraryRuleResponseDataAttributes object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ArbitraryRuleResponseDataAttributes arbitraryRuleResponseDataAttributes =
        (ArbitraryRuleResponseDataAttributes) o;
    return Objects.equals(this.costsToAllocate, arbitraryRuleResponseDataAttributes.costsToAllocate)
        && Objects.equals(this.created, arbitraryRuleResponseDataAttributes.created)
        && Objects.equals(this.enabled, arbitraryRuleResponseDataAttributes.enabled)
        && Objects.equals(
            this.lastModifiedUserUuid, arbitraryRuleResponseDataAttributes.lastModifiedUserUuid)
        && Objects.equals(this.orderId, arbitraryRuleResponseDataAttributes.orderId)
        && Objects.equals(
            this.processingStatus, arbitraryRuleResponseDataAttributes.processingStatus)
        && Objects.equals(this.provider, arbitraryRuleResponseDataAttributes.provider)
        && Objects.equals(this.rejected, arbitraryRuleResponseDataAttributes.rejected)
        && Objects.equals(this.ruleName, arbitraryRuleResponseDataAttributes.ruleName)
        && Objects.equals(this.strategy, arbitraryRuleResponseDataAttributes.strategy)
        && Objects.equals(this.type, arbitraryRuleResponseDataAttributes.type)
        && Objects.equals(this.updated, arbitraryRuleResponseDataAttributes.updated)
        && Objects.equals(this.version, arbitraryRuleResponseDataAttributes.version)
        && Objects.equals(
            this.additionalProperties, arbitraryRuleResponseDataAttributes.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        costsToAllocate,
        created,
        enabled,
        lastModifiedUserUuid,
        orderId,
        processingStatus,
        provider,
        rejected,
        ruleName,
        strategy,
        type,
        updated,
        version,
        additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ArbitraryRuleResponseDataAttributes {\n");
    sb.append("    costsToAllocate: ").append(toIndentedString(costsToAllocate)).append("\n");
    sb.append("    created: ").append(toIndentedString(created)).append("\n");
    sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
    sb.append("    lastModifiedUserUuid: ")
        .append(toIndentedString(lastModifiedUserUuid))
        .append("\n");
    sb.append("    orderId: ").append(toIndentedString(orderId)).append("\n");
    sb.append("    processingStatus: ").append(toIndentedString(processingStatus)).append("\n");
    sb.append("    provider: ").append(toIndentedString(provider)).append("\n");
    sb.append("    rejected: ").append(toIndentedString(rejected)).append("\n");
    sb.append("    ruleName: ").append(toIndentedString(ruleName)).append("\n");
    sb.append("    strategy: ").append(toIndentedString(strategy)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    updated: ").append(toIndentedString(updated)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
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
