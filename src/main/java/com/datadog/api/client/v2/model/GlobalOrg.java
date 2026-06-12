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
import java.util.UUID;
import org.openapitools.jackson.nullable.JsonNullable;

/** Organization information for a global organization association. */
@JsonPropertyOrder({
  GlobalOrg.JSON_PROPERTY_NAME,
  GlobalOrg.JSON_PROPERTY_PUBLIC_ID,
  GlobalOrg.JSON_PROPERTY_SUBDOMAIN,
  GlobalOrg.JSON_PROPERTY_UUID
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class GlobalOrg {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_PUBLIC_ID = "public_id";
  private JsonNullable<String> publicId = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_SUBDOMAIN = "subdomain";
  private JsonNullable<String> subdomain = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_UUID = "uuid";
  private UUID uuid;

  public GlobalOrg() {}

  @JsonCreator
  public GlobalOrg(
      @JsonProperty(required = true, value = JSON_PROPERTY_NAME) String name,
      @JsonProperty(required = true, value = JSON_PROPERTY_UUID) UUID uuid) {
    this.name = name;
    this.uuid = uuid;
  }

  public GlobalOrg name(String name) {
    this.name = name;
    return this;
  }

  /**
   * The name of the organization.
   *
   * @return name
   */
  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public GlobalOrg publicId(String publicId) {
    this.publicId = JsonNullable.<String>of(publicId);
    return this;
  }

  /**
   * The public identifier of the organization.
   *
   * @return publicId
   */
  @jakarta.annotation.Nullable
  @JsonIgnore
  public String getPublicId() {
    return publicId.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_PUBLIC_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<String> getPublicId_JsonNullable() {
    return publicId;
  }

  @JsonProperty(JSON_PROPERTY_PUBLIC_ID)
  public void setPublicId_JsonNullable(JsonNullable<String> publicId) {
    this.publicId = publicId;
  }

  public void setPublicId(String publicId) {
    this.publicId = JsonNullable.<String>of(publicId);
  }

  public GlobalOrg subdomain(String subdomain) {
    this.subdomain = JsonNullable.<String>of(subdomain);
    return this;
  }

  /**
   * The subdomain used to access the organization, if configured.
   *
   * @return subdomain
   */
  @jakarta.annotation.Nullable
  @JsonIgnore
  public String getSubdomain() {
    return subdomain.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_SUBDOMAIN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<String> getSubdomain_JsonNullable() {
    return subdomain;
  }

  @JsonProperty(JSON_PROPERTY_SUBDOMAIN)
  public void setSubdomain_JsonNullable(JsonNullable<String> subdomain) {
    this.subdomain = subdomain;
  }

  public void setSubdomain(String subdomain) {
    this.subdomain = JsonNullable.<String>of(subdomain);
  }

  public GlobalOrg uuid(UUID uuid) {
    this.uuid = uuid;
    return this;
  }

  /**
   * The UUID of the organization.
   *
   * @return uuid
   */
  @JsonProperty(JSON_PROPERTY_UUID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public UUID getUuid() {
    return uuid;
  }

  public void setUuid(UUID uuid) {
    this.uuid = uuid;
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
   * @return GlobalOrg
   */
  @JsonAnySetter
  public GlobalOrg putAdditionalProperty(String key, Object value) {
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

  /** Return true if this GlobalOrg object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GlobalOrg globalOrg = (GlobalOrg) o;
    return Objects.equals(this.name, globalOrg.name)
        && Objects.equals(this.publicId, globalOrg.publicId)
        && Objects.equals(this.subdomain, globalOrg.subdomain)
        && Objects.equals(this.uuid, globalOrg.uuid)
        && Objects.equals(this.additionalProperties, globalOrg.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, publicId, subdomain, uuid, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GlobalOrg {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    publicId: ").append(toIndentedString(publicId)).append("\n");
    sb.append("    subdomain: ").append(toIndentedString(subdomain)).append("\n");
    sb.append("    uuid: ").append(toIndentedString(uuid)).append("\n");
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
