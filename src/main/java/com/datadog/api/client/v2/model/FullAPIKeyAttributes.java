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
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import org.openapitools.jackson.nullable.JsonNullable;

/** Attributes of a full API key. */
@JsonPropertyOrder({
  FullAPIKeyAttributes.JSON_PROPERTY_CATEGORY,
  FullAPIKeyAttributes.JSON_PROPERTY_CREATED_AT,
  FullAPIKeyAttributes.JSON_PROPERTY_DATE_LAST_USED,
  FullAPIKeyAttributes.JSON_PROPERTY_KEY,
  FullAPIKeyAttributes.JSON_PROPERTY_LAST4,
  FullAPIKeyAttributes.JSON_PROPERTY_LAST_USED_DATE,
  FullAPIKeyAttributes.JSON_PROPERTY_MODIFIED_AT,
  FullAPIKeyAttributes.JSON_PROPERTY_NAME,
  FullAPIKeyAttributes.JSON_PROPERTY_REMOTE_CONFIG_READ_ENABLED,
  FullAPIKeyAttributes.JSON_PROPERTY_USED_IN_LAST_24_HOURS
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class FullAPIKeyAttributes {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_CATEGORY = "category";
  private String category;

  public static final String JSON_PROPERTY_CREATED_AT = "created_at";
  private String createdAt;

  public static final String JSON_PROPERTY_DATE_LAST_USED = "date_last_used";
  private JsonNullable<String> dateLastUsed = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_KEY = "key";
  private String key;

  public static final String JSON_PROPERTY_LAST4 = "last4";
  private String last4;

  public static final String JSON_PROPERTY_LAST_USED_DATE = "last_used_date";
  private FullAPIKeyLastUsedDate lastUsedDate;

  public static final String JSON_PROPERTY_MODIFIED_AT = "modified_at";
  private String modifiedAt;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_REMOTE_CONFIG_READ_ENABLED =
      "remote_config_read_enabled";
  private Boolean remoteConfigReadEnabled;

  public static final String JSON_PROPERTY_USED_IN_LAST_24_HOURS = "used_in_last_24_hours";
  private Boolean usedInLast24Hours;

  public FullAPIKeyAttributes category(String category) {
    this.category = category;
    return this;
  }

  /**
   * The category of the API key.
   *
   * @return category
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CATEGORY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getCategory() {
    return category;
  }

  public void setCategory(String category) {
    this.category = category;
  }

  /**
   * Creation date of the API key.
   *
   * @return createdAt
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CREATED_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getCreatedAt() {
    return createdAt;
  }

  public FullAPIKeyAttributes dateLastUsed(String dateLastUsed) {
    this.dateLastUsed = JsonNullable.<String>of(dateLastUsed);
    return this;
  }

  /**
   * The date and time the API key was last used.
   *
   * @return dateLastUsed
   */
  @jakarta.annotation.Nullable
  @JsonIgnore
  public String getDateLastUsed() {
    return dateLastUsed.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_DATE_LAST_USED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<String> getDateLastUsed_JsonNullable() {
    return dateLastUsed;
  }

  @JsonProperty(JSON_PROPERTY_DATE_LAST_USED)
  public void setDateLastUsed_JsonNullable(JsonNullable<String> dateLastUsed) {
    this.dateLastUsed = dateLastUsed;
  }

  public void setDateLastUsed(String dateLastUsed) {
    this.dateLastUsed = JsonNullable.<String>of(dateLastUsed);
  }

  /**
   * The API key.
   *
   * @return key
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_KEY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getKey() {
    return key;
  }

  /**
   * The last four characters of the API key.
   *
   * @return last4
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LAST4)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getLast4() {
    return last4;
  }

  public FullAPIKeyAttributes lastUsedDate(FullAPIKeyLastUsedDate lastUsedDate) {
    this.lastUsedDate = lastUsedDate;
    this.unparsed |= lastUsedDate.unparsed;
    return this;
  }

  /**
   * Attributes for the last time the specific API key was used.
   *
   * @return lastUsedDate
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LAST_USED_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public FullAPIKeyLastUsedDate getLastUsedDate() {
    return lastUsedDate;
  }

  public void setLastUsedDate(FullAPIKeyLastUsedDate lastUsedDate) {
    this.lastUsedDate = lastUsedDate;
  }

  /**
   * Date the API key was last modified.
   *
   * @return modifiedAt
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_MODIFIED_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getModifiedAt() {
    return modifiedAt;
  }

  public FullAPIKeyAttributes name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Name of the API key.
   *
   * @return name
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public FullAPIKeyAttributes remoteConfigReadEnabled(Boolean remoteConfigReadEnabled) {
    this.remoteConfigReadEnabled = remoteConfigReadEnabled;
    return this;
  }

  /**
   * The remote config read enabled status.
   *
   * @return remoteConfigReadEnabled
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_REMOTE_CONFIG_READ_ENABLED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getRemoteConfigReadEnabled() {
    return remoteConfigReadEnabled;
  }

  public void setRemoteConfigReadEnabled(Boolean remoteConfigReadEnabled) {
    this.remoteConfigReadEnabled = remoteConfigReadEnabled;
  }

  public FullAPIKeyAttributes usedInLast24Hours(Boolean usedInLast24Hours) {
    this.usedInLast24Hours = usedInLast24Hours;
    return this;
  }

  /**
   * If the API key was used within the last 24 hours.
   *
   * @return usedInLast24Hours
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_USED_IN_LAST_24_HOURS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getUsedInLast24Hours() {
    return usedInLast24Hours;
  }

  public void setUsedInLast24Hours(Boolean usedInLast24Hours) {
    this.usedInLast24Hours = usedInLast24Hours;
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
   * @return FullAPIKeyAttributes
   */
  @JsonAnySetter
  public FullAPIKeyAttributes putAdditionalProperty(String key, Object value) {
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

  /** Return true if this FullAPIKeyAttributes object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FullAPIKeyAttributes fullApiKeyAttributes = (FullAPIKeyAttributes) o;
    return Objects.equals(this.category, fullApiKeyAttributes.category)
        && Objects.equals(this.createdAt, fullApiKeyAttributes.createdAt)
        && Objects.equals(this.dateLastUsed, fullApiKeyAttributes.dateLastUsed)
        && Objects.equals(this.key, fullApiKeyAttributes.key)
        && Objects.equals(this.last4, fullApiKeyAttributes.last4)
        && Objects.equals(this.lastUsedDate, fullApiKeyAttributes.lastUsedDate)
        && Objects.equals(this.modifiedAt, fullApiKeyAttributes.modifiedAt)
        && Objects.equals(this.name, fullApiKeyAttributes.name)
        && Objects.equals(
            this.remoteConfigReadEnabled, fullApiKeyAttributes.remoteConfigReadEnabled)
        && Objects.equals(this.usedInLast24Hours, fullApiKeyAttributes.usedInLast24Hours)
        && Objects.equals(this.additionalProperties, fullApiKeyAttributes.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        category,
        createdAt,
        dateLastUsed,
        key,
        last4,
        lastUsedDate,
        modifiedAt,
        name,
        remoteConfigReadEnabled,
        usedInLast24Hours,
        additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FullAPIKeyAttributes {\n");
    sb.append("    category: ").append(toIndentedString(category)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    dateLastUsed: ").append(toIndentedString(dateLastUsed)).append("\n");
    sb.append("    key: ").append(toIndentedString(key)).append("\n");
    sb.append("    last4: ").append(toIndentedString(last4)).append("\n");
    sb.append("    lastUsedDate: ").append(toIndentedString(lastUsedDate)).append("\n");
    sb.append("    modifiedAt: ").append(toIndentedString(modifiedAt)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    remoteConfigReadEnabled: ")
        .append(toIndentedString(remoteConfigReadEnabled))
        .append("\n");
    sb.append("    usedInLast24Hours: ").append(toIndentedString(usedInLast24Hours)).append("\n");
    sb.append("    additionalProperties: ")
        .append(toIndentedString(additionalProperties))
        .append("\n");
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
