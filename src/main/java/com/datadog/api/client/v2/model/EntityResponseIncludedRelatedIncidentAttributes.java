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
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/** Incident attributes. */
@JsonPropertyOrder({
  EntityResponseIncludedRelatedIncidentAttributes.JSON_PROPERTY_CREATED_AT,
  EntityResponseIncludedRelatedIncidentAttributes.JSON_PROPERTY_HTML_URL,
  EntityResponseIncludedRelatedIncidentAttributes.JSON_PROPERTY_PROVIDER,
  EntityResponseIncludedRelatedIncidentAttributes.JSON_PROPERTY_STATUS,
  EntityResponseIncludedRelatedIncidentAttributes.JSON_PROPERTY_TITLE
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class EntityResponseIncludedRelatedIncidentAttributes {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_CREATED_AT = "createdAt";
  private OffsetDateTime createdAt;

  public static final String JSON_PROPERTY_HTML_URL = "htmlURL";
  private String htmlUrl;

  public static final String JSON_PROPERTY_PROVIDER = "provider";
  private String provider;

  public static final String JSON_PROPERTY_STATUS = "status";
  private String status;

  public static final String JSON_PROPERTY_TITLE = "title";
  private String title;

  public EntityResponseIncludedRelatedIncidentAttributes createdAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
    return this;
  }

  /**
   * Incident creation time.
   *
   * @return createdAt
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CREATED_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
  }

  public EntityResponseIncludedRelatedIncidentAttributes htmlUrl(String htmlUrl) {
    this.htmlUrl = htmlUrl;
    return this;
  }

  /**
   * Incident URL.
   *
   * @return htmlUrl
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_HTML_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getHtmlUrl() {
    return htmlUrl;
  }

  public void setHtmlUrl(String htmlUrl) {
    this.htmlUrl = htmlUrl;
  }

  public EntityResponseIncludedRelatedIncidentAttributes provider(String provider) {
    this.provider = provider;
    return this;
  }

  /**
   * Incident provider.
   *
   * @return provider
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PROVIDER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getProvider() {
    return provider;
  }

  public void setProvider(String provider) {
    this.provider = provider;
  }

  public EntityResponseIncludedRelatedIncidentAttributes status(String status) {
    this.status = status;
    return this;
  }

  /**
   * Incident status.
   *
   * @return status
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public EntityResponseIncludedRelatedIncidentAttributes title(String title) {
    this.title = title;
    return this;
  }

  /**
   * Incident title.
   *
   * @return title
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TITLE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
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
   * @return EntityResponseIncludedRelatedIncidentAttributes
   */
  @JsonAnySetter
  public EntityResponseIncludedRelatedIncidentAttributes putAdditionalProperty(
      String key, Object value) {
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

  /** Return true if this EntityResponseIncludedRelatedIncidentAttributes object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EntityResponseIncludedRelatedIncidentAttributes
        entityResponseIncludedRelatedIncidentAttributes =
            (EntityResponseIncludedRelatedIncidentAttributes) o;
    return Objects.equals(this.createdAt, entityResponseIncludedRelatedIncidentAttributes.createdAt)
        && Objects.equals(this.htmlUrl, entityResponseIncludedRelatedIncidentAttributes.htmlUrl)
        && Objects.equals(this.provider, entityResponseIncludedRelatedIncidentAttributes.provider)
        && Objects.equals(this.status, entityResponseIncludedRelatedIncidentAttributes.status)
        && Objects.equals(this.title, entityResponseIncludedRelatedIncidentAttributes.title)
        && Objects.equals(
            this.additionalProperties,
            entityResponseIncludedRelatedIncidentAttributes.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(createdAt, htmlUrl, provider, status, title, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EntityResponseIncludedRelatedIncidentAttributes {\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    htmlUrl: ").append(toIndentedString(htmlUrl)).append("\n");
    sb.append("    provider: ").append(toIndentedString(provider)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
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
