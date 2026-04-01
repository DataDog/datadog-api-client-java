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

/** Attributes of an incident user-defined field. */
@JsonPropertyOrder({
  IncidentUserDefinedFieldAttributesResponse.JSON_PROPERTY_ATTACHED_TO,
  IncidentUserDefinedFieldAttributesResponse.JSON_PROPERTY_CATEGORY,
  IncidentUserDefinedFieldAttributesResponse.JSON_PROPERTY_COLLECTED,
  IncidentUserDefinedFieldAttributesResponse.JSON_PROPERTY_CREATED,
  IncidentUserDefinedFieldAttributesResponse.JSON_PROPERTY_DEFAULT_VALUE,
  IncidentUserDefinedFieldAttributesResponse.JSON_PROPERTY_DELETED,
  IncidentUserDefinedFieldAttributesResponse.JSON_PROPERTY_DISPLAY_NAME,
  IncidentUserDefinedFieldAttributesResponse.JSON_PROPERTY_METADATA,
  IncidentUserDefinedFieldAttributesResponse.JSON_PROPERTY_MODIFIED,
  IncidentUserDefinedFieldAttributesResponse.JSON_PROPERTY_NAME,
  IncidentUserDefinedFieldAttributesResponse.JSON_PROPERTY_ORDINAL,
  IncidentUserDefinedFieldAttributesResponse.JSON_PROPERTY_PREREQUISITE,
  IncidentUserDefinedFieldAttributesResponse.JSON_PROPERTY_REQUIRED,
  IncidentUserDefinedFieldAttributesResponse.JSON_PROPERTY_RESERVED,
  IncidentUserDefinedFieldAttributesResponse.JSON_PROPERTY_TABLE_ID,
  IncidentUserDefinedFieldAttributesResponse.JSON_PROPERTY_TAG_KEY,
  IncidentUserDefinedFieldAttributesResponse.JSON_PROPERTY_TYPE,
  IncidentUserDefinedFieldAttributesResponse.JSON_PROPERTY_VALID_VALUES
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class IncidentUserDefinedFieldAttributesResponse {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_ATTACHED_TO = "attached_to";
  private String attachedTo;

  public static final String JSON_PROPERTY_CATEGORY = "category";
  private IncidentUserDefinedFieldCategory category;

  public static final String JSON_PROPERTY_COLLECTED = "collected";
  private IncidentUserDefinedFieldCollected collected;

  public static final String JSON_PROPERTY_CREATED = "created";
  private OffsetDateTime created;

  public static final String JSON_PROPERTY_DEFAULT_VALUE = "default_value";
  private String defaultValue;

  public static final String JSON_PROPERTY_DELETED = "deleted";
  private OffsetDateTime deleted;

  public static final String JSON_PROPERTY_DISPLAY_NAME = "display_name";
  private String displayName;

  public static final String JSON_PROPERTY_METADATA = "metadata";
  private IncidentUserDefinedFieldMetadata metadata;

  public static final String JSON_PROPERTY_MODIFIED = "modified";
  private OffsetDateTime modified;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_ORDINAL = "ordinal";
  private String ordinal;

  public static final String JSON_PROPERTY_PREREQUISITE = "prerequisite";
  private String prerequisite;

  public static final String JSON_PROPERTY_REQUIRED = "required";
  private Boolean required;

  public static final String JSON_PROPERTY_RESERVED = "reserved";
  private Boolean reserved;

  public static final String JSON_PROPERTY_TABLE_ID = "table_id";
  private Long tableId;

  public static final String JSON_PROPERTY_TAG_KEY = "tag_key";
  private String tagKey;

  public static final String JSON_PROPERTY_TYPE = "type";
  private Integer type;

  public static final String JSON_PROPERTY_VALID_VALUES = "valid_values";
  private List<IncidentUserDefinedFieldValidValue> validValues = new ArrayList<>();

  public IncidentUserDefinedFieldAttributesResponse() {}

  @JsonCreator
  public IncidentUserDefinedFieldAttributesResponse(
      @JsonProperty(required = true, value = JSON_PROPERTY_ATTACHED_TO) String attachedTo,
      @JsonProperty(required = true, value = JSON_PROPERTY_CATEGORY)
          IncidentUserDefinedFieldCategory category,
      @JsonProperty(required = true, value = JSON_PROPERTY_COLLECTED)
          IncidentUserDefinedFieldCollected collected,
      @JsonProperty(required = true, value = JSON_PROPERTY_CREATED) OffsetDateTime created,
      @JsonProperty(required = true, value = JSON_PROPERTY_DEFAULT_VALUE) String defaultValue,
      @JsonProperty(required = true, value = JSON_PROPERTY_DELETED) OffsetDateTime deleted,
      @JsonProperty(required = true, value = JSON_PROPERTY_DISPLAY_NAME) String displayName,
      @JsonProperty(required = true, value = JSON_PROPERTY_METADATA)
          IncidentUserDefinedFieldMetadata metadata,
      @JsonProperty(required = true, value = JSON_PROPERTY_MODIFIED) OffsetDateTime modified,
      @JsonProperty(required = true, value = JSON_PROPERTY_NAME) String name,
      @JsonProperty(required = true, value = JSON_PROPERTY_ORDINAL) String ordinal,
      @JsonProperty(required = true, value = JSON_PROPERTY_PREREQUISITE) String prerequisite,
      @JsonProperty(required = true, value = JSON_PROPERTY_REQUIRED) Boolean required,
      @JsonProperty(required = true, value = JSON_PROPERTY_RESERVED) Boolean reserved,
      @JsonProperty(required = true, value = JSON_PROPERTY_TABLE_ID) Long tableId,
      @JsonProperty(required = true, value = JSON_PROPERTY_TAG_KEY) String tagKey,
      @JsonProperty(required = true, value = JSON_PROPERTY_TYPE) Integer type,
      @JsonProperty(required = true, value = JSON_PROPERTY_VALID_VALUES)
          List<IncidentUserDefinedFieldValidValue> validValues) {
    this.attachedTo = attachedTo;
    this.category = category;
    if (category != null) {
      this.unparsed |= !category.isValid();
    }
    this.collected = collected;
    if (collected != null) {
      this.unparsed |= !collected.isValid();
    }
    this.created = created;
    this.defaultValue = defaultValue;
    if (defaultValue != null) {}
    this.deleted = deleted;
    if (deleted != null) {}
    this.displayName = displayName;
    this.metadata = metadata;
    if (metadata != null) {
      this.unparsed |= metadata.unparsed;
    }
    this.modified = modified;
    if (modified != null) {}
    this.name = name;
    this.ordinal = ordinal;
    if (ordinal != null) {}
    this.prerequisite = prerequisite;
    if (prerequisite != null) {}
    this.required = required;
    this.reserved = reserved;
    this.tableId = tableId;
    this.tagKey = tagKey;
    if (tagKey != null) {}
    this.type = type;
    if (type != null) {}
    this.validValues = validValues;
    if (validValues != null) {}
  }

  /**
   * The resource type this field is attached to. Always "incidents".
   *
   * @return attachedTo
   */
  @JsonProperty(JSON_PROPERTY_ATTACHED_TO)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getAttachedTo() {
    return attachedTo;
  }

  public IncidentUserDefinedFieldAttributesResponse category(
      IncidentUserDefinedFieldCategory category) {
    this.category = category;
    if (category != null) {
      this.unparsed |= !category.isValid();
    }
    return this;
  }

  /**
   * The section in which the field appears: "what_happened" or "why_it_happened". When null, the
   * field appears in the Attributes section.
   *
   * @return category
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CATEGORY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public IncidentUserDefinedFieldCategory getCategory() {
    return category;
  }

  public void setCategory(IncidentUserDefinedFieldCategory category) {
    if (!category.isValid()) {
      this.unparsed = true;
    }
    this.category = category;
  }

  public IncidentUserDefinedFieldAttributesResponse collected(
      IncidentUserDefinedFieldCollected collected) {
    this.collected = collected;
    if (collected != null) {
      this.unparsed |= !collected.isValid();
    }
    return this;
  }

  /**
   * The lifecycle stage at which the app prompts users to fill out this field. Cannot be set on
   * required fields.
   *
   * @return collected
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_COLLECTED)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public IncidentUserDefinedFieldCollected getCollected() {
    return collected;
  }

  public void setCollected(IncidentUserDefinedFieldCollected collected) {
    if (!collected.isValid()) {
      this.unparsed = true;
    }
    this.collected = collected;
  }

  /**
   * Timestamp when the field was created.
   *
   * @return created
   */
  @JsonProperty(JSON_PROPERTY_CREATED)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public OffsetDateTime getCreated() {
    return created;
  }

  public IncidentUserDefinedFieldAttributesResponse defaultValue(String defaultValue) {
    this.defaultValue = defaultValue;
    if (defaultValue != null) {}
    return this;
  }

  /**
   * The default value for the field.
   *
   * @return defaultValue
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DEFAULT_VALUE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getDefaultValue() {
    return defaultValue;
  }

  public void setDefaultValue(String defaultValue) {
    this.defaultValue = defaultValue;
  }

  /**
   * Timestamp when the field was soft-deleted, or null if not deleted.
   *
   * @return deleted
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DELETED)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public OffsetDateTime getDeleted() {
    return deleted;
  }

  public IncidentUserDefinedFieldAttributesResponse displayName(String displayName) {
    this.displayName = displayName;
    return this;
  }

  /**
   * The human-readable name shown in the UI.
   *
   * @return displayName
   */
  @JsonProperty(JSON_PROPERTY_DISPLAY_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getDisplayName() {
    return displayName;
  }

  public void setDisplayName(String displayName) {
    this.displayName = displayName;
  }

  public IncidentUserDefinedFieldAttributesResponse metadata(
      IncidentUserDefinedFieldMetadata metadata) {
    this.metadata = metadata;
    if (metadata != null) {
      this.unparsed |= metadata.unparsed;
    }
    return this;
  }

  /**
   * Metadata for autocomplete-type user-defined fields, describing how to populate autocomplete
   * options.
   *
   * @return metadata
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_METADATA)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public IncidentUserDefinedFieldMetadata getMetadata() {
    return metadata;
  }

  public void setMetadata(IncidentUserDefinedFieldMetadata metadata) {
    this.metadata = metadata;
  }

  /**
   * Timestamp when the field was last modified.
   *
   * @return modified
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_MODIFIED)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public OffsetDateTime getModified() {
    return modified;
  }

  public IncidentUserDefinedFieldAttributesResponse name(String name) {
    this.name = name;
    return this;
  }

  /**
   * The unique identifier of the field.
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

  public IncidentUserDefinedFieldAttributesResponse ordinal(String ordinal) {
    this.ordinal = ordinal;
    if (ordinal != null) {}
    return this;
  }

  /**
   * A decimal string representing the field's display order in the UI.
   *
   * @return ordinal
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ORDINAL)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getOrdinal() {
    return ordinal;
  }

  public void setOrdinal(String ordinal) {
    this.ordinal = ordinal;
  }

  /**
   * Reserved for future use. Always null.
   *
   * @return prerequisite
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PREREQUISITE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getPrerequisite() {
    return prerequisite;
  }

  public IncidentUserDefinedFieldAttributesResponse required(Boolean required) {
    this.required = required;
    return this;
  }

  /**
   * When true, users must fill out this field on incidents.
   *
   * @return required
   */
  @JsonProperty(JSON_PROPERTY_REQUIRED)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Boolean getRequired() {
    return required;
  }

  public void setRequired(Boolean required) {
    this.required = required;
  }

  /**
   * When true, this field is reserved for system use and cannot be deleted.
   *
   * @return reserved
   */
  @JsonProperty(JSON_PROPERTY_RESERVED)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Boolean getReserved() {
    return reserved;
  }

  /**
   * Reserved for internal use. Always 0.
   *
   * @return tableId
   */
  @JsonProperty(JSON_PROPERTY_TABLE_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Long getTableId() {
    return tableId;
  }

  public IncidentUserDefinedFieldAttributesResponse tagKey(String tagKey) {
    this.tagKey = tagKey;
    if (tagKey != null) {}
    return this;
  }

  /**
   * For metric tag-type fields only, the metric tag key that powers the autocomplete options.
   *
   * @return tagKey
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TAG_KEY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getTagKey() {
    return tagKey;
  }

  public void setTagKey(String tagKey) {
    this.tagKey = tagKey;
  }

  public IncidentUserDefinedFieldAttributesResponse type(Integer type) {
    this.type = type;
    if (type != null) {}
    return this;
  }

  /**
   * The data type of the field. 1=dropdown, 2=multiselect, 3=textbox, 4=textarray, 5=metrictag,
   * 6=autocomplete, 7=number, 8=datetime. minimum: 1 maximum: 8
   *
   * @return type
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Integer getType() {
    return type;
  }

  public void setType(Integer type) {
    this.type = type;
  }

  public IncidentUserDefinedFieldAttributesResponse validValues(
      List<IncidentUserDefinedFieldValidValue> validValues) {
    this.validValues = validValues;
    for (IncidentUserDefinedFieldValidValue item : validValues) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }

  public IncidentUserDefinedFieldAttributesResponse addValidValuesItem(
      IncidentUserDefinedFieldValidValue validValuesItem) {
    this.validValues.add(validValuesItem);
    this.unparsed |= validValuesItem.unparsed;
    return this;
  }

  /**
   * The list of allowed values for dropdown, multiselect, and autocomplete fields.
   *
   * @return validValues
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_VALID_VALUES)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public List<IncidentUserDefinedFieldValidValue> getValidValues() {
    return validValues;
  }

  public void setValidValues(List<IncidentUserDefinedFieldValidValue> validValues) {
    this.validValues = validValues;
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
   * @return IncidentUserDefinedFieldAttributesResponse
   */
  @JsonAnySetter
  public IncidentUserDefinedFieldAttributesResponse putAdditionalProperty(
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

  /** Return true if this IncidentUserDefinedFieldAttributesResponse object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IncidentUserDefinedFieldAttributesResponse incidentUserDefinedFieldAttributesResponse =
        (IncidentUserDefinedFieldAttributesResponse) o;
    return Objects.equals(this.attachedTo, incidentUserDefinedFieldAttributesResponse.attachedTo)
        && Objects.equals(this.category, incidentUserDefinedFieldAttributesResponse.category)
        && Objects.equals(this.collected, incidentUserDefinedFieldAttributesResponse.collected)
        && Objects.equals(this.created, incidentUserDefinedFieldAttributesResponse.created)
        && Objects.equals(
            this.defaultValue, incidentUserDefinedFieldAttributesResponse.defaultValue)
        && Objects.equals(this.deleted, incidentUserDefinedFieldAttributesResponse.deleted)
        && Objects.equals(this.displayName, incidentUserDefinedFieldAttributesResponse.displayName)
        && Objects.equals(this.metadata, incidentUserDefinedFieldAttributesResponse.metadata)
        && Objects.equals(this.modified, incidentUserDefinedFieldAttributesResponse.modified)
        && Objects.equals(this.name, incidentUserDefinedFieldAttributesResponse.name)
        && Objects.equals(this.ordinal, incidentUserDefinedFieldAttributesResponse.ordinal)
        && Objects.equals(
            this.prerequisite, incidentUserDefinedFieldAttributesResponse.prerequisite)
        && Objects.equals(this.required, incidentUserDefinedFieldAttributesResponse.required)
        && Objects.equals(this.reserved, incidentUserDefinedFieldAttributesResponse.reserved)
        && Objects.equals(this.tableId, incidentUserDefinedFieldAttributesResponse.tableId)
        && Objects.equals(this.tagKey, incidentUserDefinedFieldAttributesResponse.tagKey)
        && Objects.equals(this.type, incidentUserDefinedFieldAttributesResponse.type)
        && Objects.equals(this.validValues, incidentUserDefinedFieldAttributesResponse.validValues)
        && Objects.equals(
            this.additionalProperties,
            incidentUserDefinedFieldAttributesResponse.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        attachedTo,
        category,
        collected,
        created,
        defaultValue,
        deleted,
        displayName,
        metadata,
        modified,
        name,
        ordinal,
        prerequisite,
        required,
        reserved,
        tableId,
        tagKey,
        type,
        validValues,
        additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IncidentUserDefinedFieldAttributesResponse {\n");
    sb.append("    attachedTo: ").append(toIndentedString(attachedTo)).append("\n");
    sb.append("    category: ").append(toIndentedString(category)).append("\n");
    sb.append("    collected: ").append(toIndentedString(collected)).append("\n");
    sb.append("    created: ").append(toIndentedString(created)).append("\n");
    sb.append("    defaultValue: ").append(toIndentedString(defaultValue)).append("\n");
    sb.append("    deleted: ").append(toIndentedString(deleted)).append("\n");
    sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
    sb.append("    modified: ").append(toIndentedString(modified)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    ordinal: ").append(toIndentedString(ordinal)).append("\n");
    sb.append("    prerequisite: ").append(toIndentedString(prerequisite)).append("\n");
    sb.append("    required: ").append(toIndentedString(required)).append("\n");
    sb.append("    reserved: ").append(toIndentedString(reserved)).append("\n");
    sb.append("    tableId: ").append(toIndentedString(tableId)).append("\n");
    sb.append("    tagKey: ").append(toIndentedString(tagKey)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    validValues: ").append(toIndentedString(validValues)).append("\n");
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
