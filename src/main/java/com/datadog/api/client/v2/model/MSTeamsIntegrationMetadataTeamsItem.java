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
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/** Item in the Microsoft Teams integration metadata teams array. */
@JsonPropertyOrder({
  MSTeamsIntegrationMetadataTeamsItem.JSON_PROPERTY_MS_CHANNEL_ID,
  MSTeamsIntegrationMetadataTeamsItem.JSON_PROPERTY_MS_CHANNEL_NAME,
  MSTeamsIntegrationMetadataTeamsItem.JSON_PROPERTY_MS_TENANT_ID,
  MSTeamsIntegrationMetadataTeamsItem.JSON_PROPERTY_REDIRECT_URL
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class MSTeamsIntegrationMetadataTeamsItem {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_MS_CHANNEL_ID = "ms_channel_id";
  private String msChannelId;

  public static final String JSON_PROPERTY_MS_CHANNEL_NAME = "ms_channel_name";
  private String msChannelName;

  public static final String JSON_PROPERTY_MS_TENANT_ID = "ms_tenant_id";
  private String msTenantId;

  public static final String JSON_PROPERTY_REDIRECT_URL = "redirect_url";
  private String redirectUrl;

  public MSTeamsIntegrationMetadataTeamsItem() {}

  @JsonCreator
  public MSTeamsIntegrationMetadataTeamsItem(
      @JsonProperty(required = true, value = JSON_PROPERTY_MS_CHANNEL_ID) String msChannelId,
      @JsonProperty(required = true, value = JSON_PROPERTY_MS_CHANNEL_NAME) String msChannelName,
      @JsonProperty(required = true, value = JSON_PROPERTY_MS_TENANT_ID) String msTenantId,
      @JsonProperty(required = true, value = JSON_PROPERTY_REDIRECT_URL) String redirectUrl) {
    this.msChannelId = msChannelId;
    this.msChannelName = msChannelName;
    this.msTenantId = msTenantId;
    this.redirectUrl = redirectUrl;
  }

  public MSTeamsIntegrationMetadataTeamsItem msChannelId(String msChannelId) {
    this.msChannelId = msChannelId;
    return this;
  }

  /**
   * Microsoft Teams channel ID.
   *
   * @return msChannelId
   */
  @JsonProperty(JSON_PROPERTY_MS_CHANNEL_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getMsChannelId() {
    return msChannelId;
  }

  public void setMsChannelId(String msChannelId) {
    this.msChannelId = msChannelId;
  }

  public MSTeamsIntegrationMetadataTeamsItem msChannelName(String msChannelName) {
    this.msChannelName = msChannelName;
    return this;
  }

  /**
   * Microsoft Teams channel name.
   *
   * @return msChannelName
   */
  @JsonProperty(JSON_PROPERTY_MS_CHANNEL_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getMsChannelName() {
    return msChannelName;
  }

  public void setMsChannelName(String msChannelName) {
    this.msChannelName = msChannelName;
  }

  public MSTeamsIntegrationMetadataTeamsItem msTenantId(String msTenantId) {
    this.msTenantId = msTenantId;
    return this;
  }

  /**
   * Microsoft Teams tenant ID.
   *
   * @return msTenantId
   */
  @JsonProperty(JSON_PROPERTY_MS_TENANT_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getMsTenantId() {
    return msTenantId;
  }

  public void setMsTenantId(String msTenantId) {
    this.msTenantId = msTenantId;
  }

  public MSTeamsIntegrationMetadataTeamsItem redirectUrl(String redirectUrl) {
    this.redirectUrl = redirectUrl;
    return this;
  }

  /**
   * URL redirecting to the Microsoft Teams channel.
   *
   * @return redirectUrl
   */
  @JsonProperty(JSON_PROPERTY_REDIRECT_URL)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getRedirectUrl() {
    return redirectUrl;
  }

  public void setRedirectUrl(String redirectUrl) {
    this.redirectUrl = redirectUrl;
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
   * @return MSTeamsIntegrationMetadataTeamsItem
   */
  @JsonAnySetter
  public MSTeamsIntegrationMetadataTeamsItem putAdditionalProperty(String key, Object value) {
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

  /** Return true if this MSTeamsIntegrationMetadataTeamsItem object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MSTeamsIntegrationMetadataTeamsItem msTeamsIntegrationMetadataTeamsItem =
        (MSTeamsIntegrationMetadataTeamsItem) o;
    return Objects.equals(this.msChannelId, msTeamsIntegrationMetadataTeamsItem.msChannelId)
        && Objects.equals(this.msChannelName, msTeamsIntegrationMetadataTeamsItem.msChannelName)
        && Objects.equals(this.msTenantId, msTeamsIntegrationMetadataTeamsItem.msTenantId)
        && Objects.equals(this.redirectUrl, msTeamsIntegrationMetadataTeamsItem.redirectUrl)
        && Objects.equals(
            this.additionalProperties, msTeamsIntegrationMetadataTeamsItem.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(msChannelId, msChannelName, msTenantId, redirectUrl, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MSTeamsIntegrationMetadataTeamsItem {\n");
    sb.append("    msChannelId: ").append(toIndentedString(msChannelId)).append("\n");
    sb.append("    msChannelName: ").append(toIndentedString(msChannelName)).append("\n");
    sb.append("    msTenantId: ").append(toIndentedString(msTenantId)).append("\n");
    sb.append("    redirectUrl: ").append(toIndentedString(redirectUrl)).append("\n");
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
