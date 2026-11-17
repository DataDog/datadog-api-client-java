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
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/**
 * Defines who belongs to the segment. It contains one or more blocks, up to 20 in total. Use <code>
 * combination</code> to combine named blocks with a boolean formula such as <code>A AND NOT B
 * </code>.
 */
@JsonPropertyOrder({
  SegmentDataQuery.JSON_PROPERTY_ACCOUNT_STORE,
  SegmentDataQuery.JSON_PROPERTY_COMBINATION,
  SegmentDataQuery.JSON_PROPERTY_EVENT_PLATFORM,
  SegmentDataQuery.JSON_PROPERTY_JOURNEYS,
  SegmentDataQuery.JSON_PROPERTY_REFERENCE_TABLE,
  SegmentDataQuery.JSON_PROPERTY_RETENTIONS,
  SegmentDataQuery.JSON_PROPERTY_STATIC,
  SegmentDataQuery.JSON_PROPERTY_TEMPLATES,
  SegmentDataQuery.JSON_PROPERTY_USER_STORE
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class SegmentDataQuery {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_ACCOUNT_STORE = "account_store";
  private List<SegmentProfileStoreBlock> accountStore = null;

  public static final String JSON_PROPERTY_COMBINATION = "combination";
  private String combination;

  public static final String JSON_PROPERTY_EVENT_PLATFORM = "event_platform";
  private List<SegmentEventPlatformBlock> eventPlatform = null;

  public static final String JSON_PROPERTY_JOURNEYS = "journeys";
  private List<SegmentJourneyBlock> journeys = null;

  public static final String JSON_PROPERTY_REFERENCE_TABLE = "reference_table";
  private List<SegmentReferenceTableBlock> referenceTable = null;

  public static final String JSON_PROPERTY_RETENTIONS = "retentions";
  private List<Map<String, Object>> retentions = null;

  public static final String JSON_PROPERTY_STATIC = "static";
  private List<SegmentStaticBlock> _static = null;

  public static final String JSON_PROPERTY_TEMPLATES = "templates";
  private List<SegmentTemplateBlock> templates = null;

  public static final String JSON_PROPERTY_USER_STORE = "user_store";
  private List<SegmentProfileStoreBlock> userStore = null;

  public SegmentDataQuery accountStore(List<SegmentProfileStoreBlock> accountStore) {
    this.accountStore = accountStore;
    if (accountStore != null) {
      for (SegmentProfileStoreBlock item : accountStore) {
        this.unparsed |= item.unparsed;
      }
    }
    return this;
  }

  public SegmentDataQuery addAccountStoreItem(SegmentProfileStoreBlock accountStoreItem) {
    if (this.accountStore == null) {
      this.accountStore = new ArrayList<>();
    }
    this.accountStore.add(accountStoreItem);
    this.unparsed |= accountStoreItem.unparsed;
    return this;
  }

  /**
   * Account profile blocks.
   *
   * @return accountStore
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ACCOUNT_STORE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<SegmentProfileStoreBlock> getAccountStore() {
    return accountStore;
  }

  public void setAccountStore(List<SegmentProfileStoreBlock> accountStore) {
    this.accountStore = accountStore;
    if (accountStore != null) {
      for (SegmentProfileStoreBlock item : accountStore) {
        this.unparsed |= item.unparsed;
      }
    }
  }

  public SegmentDataQuery combination(String combination) {
    this.combination = combination;
    return this;
  }

  /**
   * Boolean formula that combines blocks by name.
   *
   * @return combination
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_COMBINATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getCombination() {
    return combination;
  }

  public void setCombination(String combination) {
    this.combination = combination;
  }

  public SegmentDataQuery eventPlatform(List<SegmentEventPlatformBlock> eventPlatform) {
    this.eventPlatform = eventPlatform;
    if (eventPlatform != null) {
      for (SegmentEventPlatformBlock item : eventPlatform) {
        this.unparsed |= item.unparsed;
      }
    }
    return this;
  }

  public SegmentDataQuery addEventPlatformItem(SegmentEventPlatformBlock eventPlatformItem) {
    if (this.eventPlatform == null) {
      this.eventPlatform = new ArrayList<>();
    }
    this.eventPlatform.add(eventPlatformItem);
    this.unparsed |= eventPlatformItem.unparsed;
    return this;
  }

  /**
   * Event blocks.
   *
   * @return eventPlatform
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_EVENT_PLATFORM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<SegmentEventPlatformBlock> getEventPlatform() {
    return eventPlatform;
  }

  public void setEventPlatform(List<SegmentEventPlatformBlock> eventPlatform) {
    this.eventPlatform = eventPlatform;
    if (eventPlatform != null) {
      for (SegmentEventPlatformBlock item : eventPlatform) {
        this.unparsed |= item.unparsed;
      }
    }
  }

  public SegmentDataQuery journeys(List<SegmentJourneyBlock> journeys) {
    this.journeys = journeys;
    if (journeys != null) {
      for (SegmentJourneyBlock item : journeys) {
        this.unparsed |= item.unparsed;
      }
    }
    return this;
  }

  public SegmentDataQuery addJourneysItem(SegmentJourneyBlock journeysItem) {
    if (this.journeys == null) {
      this.journeys = new ArrayList<>();
    }
    this.journeys.add(journeysItem);
    this.unparsed |= journeysItem.unparsed;
    return this;
  }

  /**
   * Funnel blocks.
   *
   * @return journeys
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_JOURNEYS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<SegmentJourneyBlock> getJourneys() {
    return journeys;
  }

  public void setJourneys(List<SegmentJourneyBlock> journeys) {
    this.journeys = journeys;
    if (journeys != null) {
      for (SegmentJourneyBlock item : journeys) {
        this.unparsed |= item.unparsed;
      }
    }
  }

  public SegmentDataQuery referenceTable(List<SegmentReferenceTableBlock> referenceTable) {
    this.referenceTable = referenceTable;
    if (referenceTable != null) {
      for (SegmentReferenceTableBlock item : referenceTable) {
        this.unparsed |= item.unparsed;
      }
    }
    return this;
  }

  public SegmentDataQuery addReferenceTableItem(SegmentReferenceTableBlock referenceTableItem) {
    if (this.referenceTable == null) {
      this.referenceTable = new ArrayList<>();
    }
    this.referenceTable.add(referenceTableItem);
    this.unparsed |= referenceTableItem.unparsed;
    return this;
  }

  /**
   * Reference table blocks.
   *
   * @return referenceTable
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_REFERENCE_TABLE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<SegmentReferenceTableBlock> getReferenceTable() {
    return referenceTable;
  }

  public void setReferenceTable(List<SegmentReferenceTableBlock> referenceTable) {
    this.referenceTable = referenceTable;
    if (referenceTable != null) {
      for (SegmentReferenceTableBlock item : referenceTable) {
        this.unparsed |= item.unparsed;
      }
    }
  }

  public SegmentDataQuery retentions(List<Map<String, Object>> retentions) {
    this.retentions = retentions;
    return this;
  }

  public SegmentDataQuery addRetentionsItem(Map<String, Object> retentionsItem) {
    if (this.retentions == null) {
      this.retentions = new ArrayList<>();
    }
    this.retentions.add(retentionsItem);
    return this;
  }

  /**
   * Retention blocks.
   *
   * @return retentions
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_RETENTIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<Map<String, Object>> getRetentions() {
    return retentions;
  }

  public void setRetentions(List<Map<String, Object>> retentions) {
    this.retentions = retentions;
  }

  public SegmentDataQuery _static(List<SegmentStaticBlock> _static) {
    this._static = _static;
    if (_static != null) {
      for (SegmentStaticBlock item : _static) {
        this.unparsed |= item.unparsed;
      }
    }
    return this;
  }

  public SegmentDataQuery add_staticItem(SegmentStaticBlock _staticItem) {
    if (this._static == null) {
      this._static = new ArrayList<>();
    }
    this._static.add(_staticItem);
    this.unparsed |= _staticItem.unparsed;
    return this;
  }

  /**
   * Uploaded list blocks.
   *
   * @return _static
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_STATIC)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<SegmentStaticBlock> getStatic() {
    return _static;
  }

  public void setStatic(List<SegmentStaticBlock> _static) {
    this._static = _static;
    if (_static != null) {
      for (SegmentStaticBlock item : _static) {
        this.unparsed |= item.unparsed;
      }
    }
  }

  public SegmentDataQuery templates(List<SegmentTemplateBlock> templates) {
    this.templates = templates;
    if (templates != null) {
      for (SegmentTemplateBlock item : templates) {
        this.unparsed |= item.unparsed;
      }
    }
    return this;
  }

  public SegmentDataQuery addTemplatesItem(SegmentTemplateBlock templatesItem) {
    if (this.templates == null) {
      this.templates = new ArrayList<>();
    }
    this.templates.add(templatesItem);
    this.unparsed |= templatesItem.unparsed;
    return this;
  }

  /**
   * Template blocks.
   *
   * @return templates
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TEMPLATES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<SegmentTemplateBlock> getTemplates() {
    return templates;
  }

  public void setTemplates(List<SegmentTemplateBlock> templates) {
    this.templates = templates;
    if (templates != null) {
      for (SegmentTemplateBlock item : templates) {
        this.unparsed |= item.unparsed;
      }
    }
  }

  public SegmentDataQuery userStore(List<SegmentProfileStoreBlock> userStore) {
    this.userStore = userStore;
    if (userStore != null) {
      for (SegmentProfileStoreBlock item : userStore) {
        this.unparsed |= item.unparsed;
      }
    }
    return this;
  }

  public SegmentDataQuery addUserStoreItem(SegmentProfileStoreBlock userStoreItem) {
    if (this.userStore == null) {
      this.userStore = new ArrayList<>();
    }
    this.userStore.add(userStoreItem);
    this.unparsed |= userStoreItem.unparsed;
    return this;
  }

  /**
   * User profile blocks.
   *
   * @return userStore
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_USER_STORE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<SegmentProfileStoreBlock> getUserStore() {
    return userStore;
  }

  public void setUserStore(List<SegmentProfileStoreBlock> userStore) {
    this.userStore = userStore;
    if (userStore != null) {
      for (SegmentProfileStoreBlock item : userStore) {
        this.unparsed |= item.unparsed;
      }
    }
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
   * @return SegmentDataQuery
   */
  @JsonAnySetter
  public SegmentDataQuery putAdditionalProperty(String key, Object value) {
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

  /** Return true if this SegmentDataQuery object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SegmentDataQuery segmentDataQuery = (SegmentDataQuery) o;
    return Objects.equals(this.accountStore, segmentDataQuery.accountStore)
        && Objects.equals(this.combination, segmentDataQuery.combination)
        && Objects.equals(this.eventPlatform, segmentDataQuery.eventPlatform)
        && Objects.equals(this.journeys, segmentDataQuery.journeys)
        && Objects.equals(this.referenceTable, segmentDataQuery.referenceTable)
        && Objects.equals(this.retentions, segmentDataQuery.retentions)
        && Objects.equals(this._static, segmentDataQuery._static)
        && Objects.equals(this.templates, segmentDataQuery.templates)
        && Objects.equals(this.userStore, segmentDataQuery.userStore)
        && Objects.equals(this.additionalProperties, segmentDataQuery.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        accountStore,
        combination,
        eventPlatform,
        journeys,
        referenceTable,
        retentions,
        _static,
        templates,
        userStore,
        additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SegmentDataQuery {\n");
    sb.append("    accountStore: ").append(toIndentedString(accountStore)).append("\n");
    sb.append("    combination: ").append(toIndentedString(combination)).append("\n");
    sb.append("    eventPlatform: ").append(toIndentedString(eventPlatform)).append("\n");
    sb.append("    journeys: ").append(toIndentedString(journeys)).append("\n");
    sb.append("    referenceTable: ").append(toIndentedString(referenceTable)).append("\n");
    sb.append("    retentions: ").append(toIndentedString(retentions)).append("\n");
    sb.append("    _static: ").append(toIndentedString(_static)).append("\n");
    sb.append("    templates: ").append(toIndentedString(templates)).append("\n");
    sb.append("    userStore: ").append(toIndentedString(userStore)).append("\n");
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
