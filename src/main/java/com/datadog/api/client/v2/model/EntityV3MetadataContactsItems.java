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
import java.util.Objects;

/** The definition of Entity V3 Metadata Contacts Items object. */
@JsonPropertyOrder({
  EntityV3MetadataContactsItems.JSON_PROPERTY_CONTACT,
  EntityV3MetadataContactsItems.JSON_PROPERTY_NAME,
  EntityV3MetadataContactsItems.JSON_PROPERTY_TYPE
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class EntityV3MetadataContactsItems {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_CONTACT = "contact";
  private String contact;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_TYPE = "type";
  private String type;

  public EntityV3MetadataContactsItems() {}

  @JsonCreator
  public EntityV3MetadataContactsItems(
      @JsonProperty(required = true, value = JSON_PROPERTY_CONTACT) String contact,
      @JsonProperty(required = true, value = JSON_PROPERTY_TYPE) String type) {
    this.contact = contact;
    this.type = type;
  }

  public EntityV3MetadataContactsItems contact(String contact) {
    this.contact = contact;
    return this;
  }

  /**
   * Contact value.
   *
   * @return contact
   */
  @JsonProperty(JSON_PROPERTY_CONTACT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getContact() {
    return contact;
  }

  public void setContact(String contact) {
    this.contact = contact;
  }

  public EntityV3MetadataContactsItems name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Contact name.
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

  public EntityV3MetadataContactsItems type(String type) {
    this.type = type;
    return this;
  }

  /**
   * Contact type.
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

  /** Return true if this EntityV3MetadataContactsItems object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EntityV3MetadataContactsItems entityV3MetadataContactsItems = (EntityV3MetadataContactsItems) o;
    return Objects.equals(this.contact, entityV3MetadataContactsItems.contact)
        && Objects.equals(this.name, entityV3MetadataContactsItems.name)
        && Objects.equals(this.type, entityV3MetadataContactsItems.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(contact, name, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EntityV3MetadataContactsItems {\n");
    sb.append("    contact: ").append(toIndentedString(contact)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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
