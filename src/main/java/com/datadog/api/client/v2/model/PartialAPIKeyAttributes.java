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
   * <p>Attributes of a partial API key.</p>
 */
@JsonPropertyOrder({
  PartialAPIKeyAttributes.JSON_PROPERTY_CATEGORY,
  PartialAPIKeyAttributes.JSON_PROPERTY_CREATED_AT,
  PartialAPIKeyAttributes.JSON_PROPERTY_DATE_LAST_USED,
  PartialAPIKeyAttributes.JSON_PROPERTY_LAST4,
  PartialAPIKeyAttributes.JSON_PROPERTY_MODIFIED_AT,
  PartialAPIKeyAttributes.JSON_PROPERTY_NAME,
  PartialAPIKeyAttributes.JSON_PROPERTY_REMOTE_CONFIG_READ_ENABLED
})
@jakarta.annotation.Generated(value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class PartialAPIKeyAttributes {
  @JsonIgnore
  public boolean unparsed = false;
  public static final String JSON_PROPERTY_CATEGORY = "category";
  private String category;

  public static final String JSON_PROPERTY_CREATED_AT = "created_at";
  private String createdAt;

  public static final String JSON_PROPERTY_DATE_LAST_USED = "date_last_used";
  private JsonNullable<OffsetDateTime> dateLastUsed = JsonNullable.<OffsetDateTime>undefined();

  public static final String JSON_PROPERTY_LAST4 = "last4";
  private String last4;

  public static final String JSON_PROPERTY_MODIFIED_AT = "modified_at";
  private String modifiedAt;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_REMOTE_CONFIG_READ_ENABLED = "remote_config_read_enabled";
  private Boolean remoteConfigReadEnabled;

  public PartialAPIKeyAttributes category(String category) {
    this.category = category;
    return this;
  }

  /**
   * <p>The category of the API key.</p>
   * @return category
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_CATEGORY)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public String getCategory() {
        return category;
      }
  public void setCategory(String category) {
    this.category = category;
  }

  /**
   * <p>Creation date of the API key.</p>
   * @return createdAt
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_CREATED_AT)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public String getCreatedAt() {
        return createdAt;
      }

  /**
   * <p>Date the API Key was last used.</p>
   * @return dateLastUsed
  **/
      @jakarta.annotation.Nullable
      @JsonIgnore
      public OffsetDateTime getDateLastUsed() {

        if (dateLastUsed == null) {
          dateLastUsed = JsonNullable.<OffsetDateTime>undefined();
        }
        return dateLastUsed.orElse(null);
      }
  @JsonProperty(JSON_PROPERTY_DATE_LAST_USED)
  @JsonInclude(
    value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<OffsetDateTime> getDateLastUsed_JsonNullable() {
    return dateLastUsed;
  }
  @JsonProperty(JSON_PROPERTY_DATE_LAST_USED)private void setDateLastUsed_JsonNullable(JsonNullable<OffsetDateTime> dateLastUsed) {
    this.dateLastUsed = dateLastUsed;
  }

  /**
   * <p>The last four characters of the API key.</p>
   * @return last4
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_LAST4)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public String getLast4() {
        return last4;
      }

  /**
   * <p>Date the API key was last modified.</p>
   * @return modifiedAt
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_MODIFIED_AT)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public String getModifiedAt() {
        return modifiedAt;
      }
  public PartialAPIKeyAttributes name(String name) {
    this.name = name;
    return this;
  }

  /**
   * <p>Name of the API key.</p>
   * @return name
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_NAME)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public String getName() {
        return name;
      }
  public void setName(String name) {
    this.name = name;
  }
  public PartialAPIKeyAttributes remoteConfigReadEnabled(Boolean remoteConfigReadEnabled) {
    this.remoteConfigReadEnabled = remoteConfigReadEnabled;
    return this;
  }

  /**
   * <p>The remote config read enabled status.</p>
   * @return remoteConfigReadEnabled
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_REMOTE_CONFIG_READ_ENABLED)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public Boolean getRemoteConfigReadEnabled() {
        return remoteConfigReadEnabled;
      }
  public void setRemoteConfigReadEnabled(Boolean remoteConfigReadEnabled) {
    this.remoteConfigReadEnabled = remoteConfigReadEnabled;
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
   * @return PartialAPIKeyAttributes
   */
  @JsonAnySetter
  public PartialAPIKeyAttributes putAdditionalProperty(String key, Object value) {
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
   * Return true if this PartialAPIKeyAttributes object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PartialAPIKeyAttributes partialApiKeyAttributes = (PartialAPIKeyAttributes) o;
    return Objects.equals(this.category, partialApiKeyAttributes.category) && Objects.equals(this.createdAt, partialApiKeyAttributes.createdAt) && Objects.equals(this.dateLastUsed, partialApiKeyAttributes.dateLastUsed) && Objects.equals(this.last4, partialApiKeyAttributes.last4) && Objects.equals(this.modifiedAt, partialApiKeyAttributes.modifiedAt) && Objects.equals(this.name, partialApiKeyAttributes.name) && Objects.equals(this.remoteConfigReadEnabled, partialApiKeyAttributes.remoteConfigReadEnabled) && Objects.equals(this.additionalProperties, partialApiKeyAttributes.additionalProperties);
  }


  @Override
  public int hashCode() {
    return Objects.hash(category,createdAt,dateLastUsed,last4,modifiedAt,name,remoteConfigReadEnabled, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PartialAPIKeyAttributes {\n");
    sb.append("    category: ").append(toIndentedString(category)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    dateLastUsed: ").append(toIndentedString(dateLastUsed)).append("\n");
    sb.append("    last4: ").append(toIndentedString(last4)).append("\n");
    sb.append("    modifiedAt: ").append(toIndentedString(modifiedAt)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    remoteConfigReadEnabled: ").append(toIndentedString(remoteConfigReadEnabled)).append("\n");
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
