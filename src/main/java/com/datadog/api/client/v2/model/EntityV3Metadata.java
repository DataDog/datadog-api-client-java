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
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/** The definition of Entity V3 Metadata object. */
@JsonPropertyOrder({
  EntityV3Metadata.JSON_PROPERTY_ADDITIONAL_OWNERS,
  EntityV3Metadata.JSON_PROPERTY_CONTACTS,
  EntityV3Metadata.JSON_PROPERTY_DESCRIPTION,
  EntityV3Metadata.JSON_PROPERTY_DISPLAY_NAME,
  EntityV3Metadata.JSON_PROPERTY_ID,
  EntityV3Metadata.JSON_PROPERTY_INHERIT_FROM,
  EntityV3Metadata.JSON_PROPERTY_LINKS,
  EntityV3Metadata.JSON_PROPERTY_MANAGED,
  EntityV3Metadata.JSON_PROPERTY_NAME,
  EntityV3Metadata.JSON_PROPERTY_NAMESPACE,
  EntityV3Metadata.JSON_PROPERTY_OWNER,
  EntityV3Metadata.JSON_PROPERTY_TAGS
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class EntityV3Metadata {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_ADDITIONAL_OWNERS = "additionalOwners";
  private List<EntityV3MetadataAdditionalOwnersItems> additionalOwners = null;

  public static final String JSON_PROPERTY_CONTACTS = "contacts";
  private List<EntityV3MetadataContactsItems> contacts = null;

  public static final String JSON_PROPERTY_DESCRIPTION = "description";
  private String description;

  public static final String JSON_PROPERTY_DISPLAY_NAME = "displayName";
  private String displayName;

  public static final String JSON_PROPERTY_ID = "id";
  private String id;

  public static final String JSON_PROPERTY_INHERIT_FROM = "inheritFrom";
  private String inheritFrom;

  public static final String JSON_PROPERTY_LINKS = "links";
  private List<EntityV3MetadataLinksItems> links = null;

  public static final String JSON_PROPERTY_MANAGED = "managed";
  private Map<String, Object> managed = null;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_NAMESPACE = "namespace";
  private String namespace;

  public static final String JSON_PROPERTY_OWNER = "owner";
  private EntityV3MetadataOwner owner = null;

  public static final String JSON_PROPERTY_TAGS = "tags";
  private List<String> tags = null;

  public EntityV3Metadata() {}

  @JsonCreator
  public EntityV3Metadata(@JsonProperty(required = true, value = JSON_PROPERTY_NAME) String name) {
    this.name = name;
  }

  public EntityV3Metadata additionalOwners(
      List<EntityV3MetadataAdditionalOwnersItems> additionalOwners) {
    this.additionalOwners = additionalOwners;
    for (EntityV3MetadataAdditionalOwnersItems item : additionalOwners) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }

  public EntityV3Metadata addAdditionalOwnersItem(
      EntityV3MetadataAdditionalOwnersItems additionalOwnersItem) {
    if (this.additionalOwners == null) {
      this.additionalOwners = new ArrayList<>();
    }
    this.additionalOwners.add(additionalOwnersItem);
    this.unparsed |= additionalOwnersItem.unparsed;
    return this;
  }

  /**
   * The additional owners of the entity, usually a team.
   *
   * @return additionalOwners
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ADDITIONAL_OWNERS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<EntityV3MetadataAdditionalOwnersItems> getAdditionalOwners() {
    return additionalOwners;
  }

  public void setAdditionalOwners(List<EntityV3MetadataAdditionalOwnersItems> additionalOwners) {
    this.additionalOwners = additionalOwners;
  }

  public EntityV3Metadata contacts(List<EntityV3MetadataContactsItems> contacts) {
    this.contacts = contacts;
    for (EntityV3MetadataContactsItems item : contacts) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }

  public EntityV3Metadata addContactsItem(EntityV3MetadataContactsItems contactsItem) {
    if (this.contacts == null) {
      this.contacts = new ArrayList<>();
    }
    this.contacts.add(contactsItem);
    this.unparsed |= contactsItem.unparsed;
    return this;
  }

  /**
   * A list of contacts for the entity.
   *
   * @return contacts
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CONTACTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<EntityV3MetadataContactsItems> getContacts() {
    return contacts;
  }

  public void setContacts(List<EntityV3MetadataContactsItems> contacts) {
    this.contacts = contacts;
  }

  public EntityV3Metadata description(String description) {
    this.description = description;
    return this;
  }

  /**
   * Short description of the entity. The UI can leverage the description for display.
   *
   * @return description
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DESCRIPTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public EntityV3Metadata displayName(String displayName) {
    this.displayName = displayName;
    return this;
  }

  /**
   * User friendly name of the entity. The UI can leverage the display name for display.
   *
   * @return displayName
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DISPLAY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getDisplayName() {
    return displayName;
  }

  public void setDisplayName(String displayName) {
    this.displayName = displayName;
  }

  public EntityV3Metadata id(String id) {
    this.id = id;
    return this;
  }

  /**
   * A read-only globally unique identifier for the entity generated by Datadog. User supplied
   * values are ignored.
   *
   * @return id
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public EntityV3Metadata inheritFrom(String inheritFrom) {
    this.inheritFrom = inheritFrom;
    return this;
  }

  /**
   * The entity reference from which to inherit metadata
   *
   * @return inheritFrom
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_INHERIT_FROM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getInheritFrom() {
    return inheritFrom;
  }

  public void setInheritFrom(String inheritFrom) {
    this.inheritFrom = inheritFrom;
  }

  public EntityV3Metadata links(List<EntityV3MetadataLinksItems> links) {
    this.links = links;
    for (EntityV3MetadataLinksItems item : links) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }

  public EntityV3Metadata addLinksItem(EntityV3MetadataLinksItems linksItem) {
    if (this.links == null) {
      this.links = new ArrayList<>();
    }
    this.links.add(linksItem);
    this.unparsed |= linksItem.unparsed;
    return this;
  }

  /**
   * A list of links for the entity.
   *
   * @return links
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LINKS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<EntityV3MetadataLinksItems> getLinks() {
    return links;
  }

  public void setLinks(List<EntityV3MetadataLinksItems> links) {
    this.links = links;
  }

  public EntityV3Metadata managed(Map<String, Object> managed) {
    this.managed = managed;
    return this;
  }

  public EntityV3Metadata putManagedItem(String key, Object managedItem) {
    if (this.managed == null) {
      this.managed = new HashMap<>();
    }
    this.managed.put(key, managedItem);
    return this;
  }

  /**
   * A read-only set of Datadog managed attributes generated by Datadog. User supplied values are
   * ignored.
   *
   * @return managed
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_MANAGED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Map<String, Object> getManaged() {
    return managed;
  }

  public void setManaged(Map<String, Object> managed) {
    this.managed = managed;
  }

  public EntityV3Metadata name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Unique name given to an entity under the kind/namespace.
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

  public EntityV3Metadata namespace(String namespace) {
    this.namespace = namespace;
    return this;
  }

  /**
   * Namespace is a part of unique identifier. It has a default value of 'default'.
   *
   * @return namespace
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_NAMESPACE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getNamespace() {
    return namespace;
  }

  public void setNamespace(String namespace) {
    this.namespace = namespace;
  }

  public EntityV3Metadata owner(EntityV3MetadataOwner owner) {
    this.owner = owner;
    this.unparsed |= owner.unparsed;
    return this;
  }

  /**
   * The owner of the entity, usually a team.
   *
   * @return owner
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_OWNER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public EntityV3MetadataOwner getOwner() {
    return owner;
  }

  public void setOwner(EntityV3MetadataOwner owner) {
    this.owner = owner;
  }

  public EntityV3Metadata tags(List<String> tags) {
    this.tags = tags;
    return this;
  }

  public EntityV3Metadata addTagsItem(String tagsItem) {
    if (this.tags == null) {
      this.tags = new ArrayList<>();
    }
    this.tags.add(tagsItem);
    return this;
  }

  /**
   * A set of custom tags.
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

  /** Return true if this EntityV3Metadata object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EntityV3Metadata entityV3Metadata = (EntityV3Metadata) o;
    return Objects.equals(this.additionalOwners, entityV3Metadata.additionalOwners)
        && Objects.equals(this.contacts, entityV3Metadata.contacts)
        && Objects.equals(this.description, entityV3Metadata.description)
        && Objects.equals(this.displayName, entityV3Metadata.displayName)
        && Objects.equals(this.id, entityV3Metadata.id)
        && Objects.equals(this.inheritFrom, entityV3Metadata.inheritFrom)
        && Objects.equals(this.links, entityV3Metadata.links)
        && Objects.equals(this.managed, entityV3Metadata.managed)
        && Objects.equals(this.name, entityV3Metadata.name)
        && Objects.equals(this.namespace, entityV3Metadata.namespace)
        && Objects.equals(this.owner, entityV3Metadata.owner)
        && Objects.equals(this.tags, entityV3Metadata.tags);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        additionalOwners,
        contacts,
        description,
        displayName,
        id,
        inheritFrom,
        links,
        managed,
        name,
        namespace,
        owner,
        tags);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EntityV3Metadata {\n");
    sb.append("    additionalOwners: ").append(toIndentedString(additionalOwners)).append("\n");
    sb.append("    contacts: ").append(toIndentedString(contacts)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    inheritFrom: ").append(toIndentedString(inheritFrom)).append("\n");
    sb.append("    links: ").append(toIndentedString(links)).append("\n");
    sb.append("    managed: ").append(toIndentedString(managed)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    namespace: ").append(toIndentedString(namespace)).append("\n");
    sb.append("    owner: ").append(toIndentedString(owner)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
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
