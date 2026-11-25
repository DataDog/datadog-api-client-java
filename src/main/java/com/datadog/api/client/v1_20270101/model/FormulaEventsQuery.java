/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v1_20270101.model;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
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

/** Test-only generated schema for the dashboard versioning proof of concept. */
@JsonPropertyOrder({
  FormulaEventsQuery.JSON_PROPERTY_CALCULATED_FIELDS,
  FormulaEventsQuery.JSON_PROPERTY_COMPUTE,
  FormulaEventsQuery.JSON_PROPERTY_CROSS_ORG_UUIDS,
  FormulaEventsQuery.JSON_PROPERTY_DATA_SOURCE,
  FormulaEventsQuery.JSON_PROPERTY_EXTRACTIONS,
  FormulaEventsQuery.JSON_PROPERTY_GROUP_BY,
  FormulaEventsQuery.JSON_PROPERTY_INDEXES,
  FormulaEventsQuery.JSON_PROPERTY_NAME,
  FormulaEventsQuery.JSON_PROPERTY_SEARCH,
  FormulaEventsQuery.JSON_PROPERTY_SEMANTIC_MODE,
  FormulaEventsQuery.JSON_PROPERTY_STORAGE
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class FormulaEventsQuery {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_CALCULATED_FIELDS = "calculated_fields";
  private List<EventsCalculatedField> calculatedFields = null;

  public static final String JSON_PROPERTY_COMPUTE = "compute";
  private FormulaAndFunctionEventQueryDefinitionCompute compute;

  public static final String JSON_PROPERTY_CROSS_ORG_UUIDS = "cross_org_uuids";
  private List<String> crossOrgUuids = null;

  public static final String JSON_PROPERTY_DATA_SOURCE = "data_source";
  private FormulaAndFunctionEventsDataSource dataSource;

  public static final String JSON_PROPERTY_EXTRACTIONS = "extractions";
  private List<EventsDataExtraction> extractions = null;

  public static final String JSON_PROPERTY_GROUP_BY = "group_by";
  private FormulaAndFunctionEventQueryGroupByConfig groupBy;

  public static final String JSON_PROPERTY_INDEXES = "indexes";
  private List<String> indexes = null;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_SEARCH = "search";
  private FormulaEventsQuerySearch search;

  public static final String JSON_PROPERTY_SEMANTIC_MODE = "semantic_mode";
  private FormulaSemanticMode semanticMode;

  public static final String JSON_PROPERTY_STORAGE = "storage";
  private StorageType storage;

  public FormulaEventsQuery() {}

  @JsonCreator
  public FormulaEventsQuery(
      @JsonProperty(required = true, value = JSON_PROPERTY_COMPUTE)
          FormulaAndFunctionEventQueryDefinitionCompute compute,
      @JsonProperty(required = true, value = JSON_PROPERTY_DATA_SOURCE)
          FormulaAndFunctionEventsDataSource dataSource,
      @JsonProperty(required = true, value = JSON_PROPERTY_NAME) String name) {
    this.compute = compute;
    this.unparsed |= compute.unparsed;
    this.dataSource = dataSource;
    this.unparsed |= !dataSource.isValid();
    this.name = name;
  }

  public FormulaEventsQuery calculatedFields(List<EventsCalculatedField> calculatedFields) {
    this.calculatedFields = calculatedFields;
    if (calculatedFields != null) {
      for (EventsCalculatedField item : calculatedFields) {
        this.unparsed |= item.unparsed;
      }
    }
    return this;
  }

  public FormulaEventsQuery addCalculatedFieldsItem(EventsCalculatedField calculatedFieldsItem) {
    if (this.calculatedFields == null) {
      this.calculatedFields = new ArrayList<>();
    }
    this.calculatedFields.add(calculatedFieldsItem);
    this.unparsed |= calculatedFieldsItem.unparsed;
    return this;
  }

  /**
   * Test-only generated schema for the dashboard versioning proof of concept.
   *
   * @return calculatedFields
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CALCULATED_FIELDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<EventsCalculatedField> getCalculatedFields() {
    return calculatedFields;
  }

  public void setCalculatedFields(List<EventsCalculatedField> calculatedFields) {
    this.calculatedFields = calculatedFields;
    if (calculatedFields != null) {
      for (EventsCalculatedField item : calculatedFields) {
        this.unparsed |= item.unparsed;
      }
    }
  }

  public FormulaEventsQuery compute(FormulaAndFunctionEventQueryDefinitionCompute compute) {
    this.compute = compute;
    this.unparsed |= compute.unparsed;
    return this;
  }

  /**
   * Test-only generated schema for the dashboard versioning proof of concept.
   *
   * @return compute
   */
  @JsonProperty(JSON_PROPERTY_COMPUTE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public FormulaAndFunctionEventQueryDefinitionCompute getCompute() {
    return compute;
  }

  public void setCompute(FormulaAndFunctionEventQueryDefinitionCompute compute) {
    this.compute = compute;
    if (compute != null) {
      this.unparsed |= compute.unparsed;
    }
  }

  public FormulaEventsQuery crossOrgUuids(List<String> crossOrgUuids) {
    this.crossOrgUuids = crossOrgUuids;
    return this;
  }

  public FormulaEventsQuery addCrossOrgUuidsItem(String crossOrgUuidsItem) {
    if (this.crossOrgUuids == null) {
      this.crossOrgUuids = new ArrayList<>();
    }
    this.crossOrgUuids.add(crossOrgUuidsItem);
    return this;
  }

  /**
   * Test-only generated schema for the dashboard versioning proof of concept.
   *
   * @return crossOrgUuids
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CROSS_ORG_UUIDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<String> getCrossOrgUuids() {
    return crossOrgUuids;
  }

  public void setCrossOrgUuids(List<String> crossOrgUuids) {
    this.crossOrgUuids = crossOrgUuids;
  }

  public FormulaEventsQuery dataSource(FormulaAndFunctionEventsDataSource dataSource) {
    this.dataSource = dataSource;
    this.unparsed |= !dataSource.isValid();
    return this;
  }

  /**
   * Test-only generated schema for the dashboard versioning proof of concept.
   *
   * @return dataSource
   */
  @JsonProperty(JSON_PROPERTY_DATA_SOURCE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public FormulaAndFunctionEventsDataSource getDataSource() {
    return dataSource;
  }

  public void setDataSource(FormulaAndFunctionEventsDataSource dataSource) {
    if (!dataSource.isValid()) {
      this.unparsed = true;
    }
    this.dataSource = dataSource;
  }

  public FormulaEventsQuery extractions(List<EventsDataExtraction> extractions) {
    this.extractions = extractions;
    if (extractions != null) {
      for (EventsDataExtraction item : extractions) {
        this.unparsed |= item.unparsed;
      }
    }
    return this;
  }

  public FormulaEventsQuery addExtractionsItem(EventsDataExtraction extractionsItem) {
    if (this.extractions == null) {
      this.extractions = new ArrayList<>();
    }
    this.extractions.add(extractionsItem);
    this.unparsed |= extractionsItem.unparsed;
    return this;
  }

  /**
   * Test-only generated schema for the dashboard versioning proof of concept.
   *
   * @return extractions
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_EXTRACTIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<EventsDataExtraction> getExtractions() {
    return extractions;
  }

  public void setExtractions(List<EventsDataExtraction> extractions) {
    this.extractions = extractions;
    if (extractions != null) {
      for (EventsDataExtraction item : extractions) {
        this.unparsed |= item.unparsed;
      }
    }
  }

  public FormulaEventsQuery groupBy(FormulaAndFunctionEventQueryGroupByConfig groupBy) {
    this.groupBy = groupBy;
    this.unparsed |= groupBy.unparsed;
    return this;
  }

  /**
   * Test-only generated schema for the dashboard versioning proof of concept.
   *
   * @return groupBy
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_GROUP_BY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public FormulaAndFunctionEventQueryGroupByConfig getGroupBy() {
    return groupBy;
  }

  public void setGroupBy(FormulaAndFunctionEventQueryGroupByConfig groupBy) {
    this.groupBy = groupBy;
    if (groupBy != null) {
      this.unparsed |= groupBy.unparsed;
    }
  }

  public FormulaEventsQuery indexes(List<String> indexes) {
    this.indexes = indexes;
    return this;
  }

  public FormulaEventsQuery addIndexesItem(String indexesItem) {
    if (this.indexes == null) {
      this.indexes = new ArrayList<>();
    }
    this.indexes.add(indexesItem);
    return this;
  }

  /**
   * Test-only generated schema for the dashboard versioning proof of concept.
   *
   * @return indexes
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_INDEXES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<String> getIndexes() {
    return indexes;
  }

  public void setIndexes(List<String> indexes) {
    this.indexes = indexes;
  }

  public FormulaEventsQuery name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Test-only generated schema for the dashboard versioning proof of concept.
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

  public FormulaEventsQuery search(FormulaEventsQuerySearch search) {
    this.search = search;
    this.unparsed |= search.unparsed;
    return this;
  }

  /**
   * Test-only generated schema for the dashboard versioning proof of concept.
   *
   * @return search
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SEARCH)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public FormulaEventsQuerySearch getSearch() {
    return search;
  }

  public void setSearch(FormulaEventsQuerySearch search) {
    this.search = search;
    if (search != null) {
      this.unparsed |= search.unparsed;
    }
  }

  public FormulaEventsQuery semanticMode(FormulaSemanticMode semanticMode) {
    this.semanticMode = semanticMode;
    this.unparsed |= !semanticMode.isValid();
    return this;
  }

  /**
   * Test-only generated schema for the dashboard versioning proof of concept.
   *
   * @return semanticMode
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SEMANTIC_MODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public FormulaSemanticMode getSemanticMode() {
    return semanticMode;
  }

  public void setSemanticMode(FormulaSemanticMode semanticMode) {
    if (!semanticMode.isValid()) {
      this.unparsed = true;
    }
    this.semanticMode = semanticMode;
  }

  public FormulaEventsQuery storage(StorageType storage) {
    this.storage = storage;
    this.unparsed |= !storage.isValid();
    return this;
  }

  /**
   * Test-only generated schema for the dashboard versioning proof of concept.
   *
   * @return storage
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_STORAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public StorageType getStorage() {
    return storage;
  }

  public void setStorage(StorageType storage) {
    if (!storage.isValid()) {
      this.unparsed = true;
    }
    this.storage = storage;
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
   * @return FormulaEventsQuery
   */
  @JsonAnySetter
  public FormulaEventsQuery putAdditionalProperty(String key, Object value) {
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

  /** Return true if this FormulaEventsQuery object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FormulaEventsQuery formulaEventsQuery = (FormulaEventsQuery) o;
    return Objects.equals(this.calculatedFields, formulaEventsQuery.calculatedFields)
        && Objects.equals(this.compute, formulaEventsQuery.compute)
        && Objects.equals(this.crossOrgUuids, formulaEventsQuery.crossOrgUuids)
        && Objects.equals(this.dataSource, formulaEventsQuery.dataSource)
        && Objects.equals(this.extractions, formulaEventsQuery.extractions)
        && Objects.equals(this.groupBy, formulaEventsQuery.groupBy)
        && Objects.equals(this.indexes, formulaEventsQuery.indexes)
        && Objects.equals(this.name, formulaEventsQuery.name)
        && Objects.equals(this.search, formulaEventsQuery.search)
        && Objects.equals(this.semanticMode, formulaEventsQuery.semanticMode)
        && Objects.equals(this.storage, formulaEventsQuery.storage)
        && Objects.equals(this.additionalProperties, formulaEventsQuery.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        calculatedFields,
        compute,
        crossOrgUuids,
        dataSource,
        extractions,
        groupBy,
        indexes,
        name,
        search,
        semanticMode,
        storage,
        additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FormulaEventsQuery {\n");
    sb.append("    calculatedFields: ").append(toIndentedString(calculatedFields)).append("\n");
    sb.append("    compute: ").append(toIndentedString(compute)).append("\n");
    sb.append("    crossOrgUuids: ").append(toIndentedString(crossOrgUuids)).append("\n");
    sb.append("    dataSource: ").append(toIndentedString(dataSource)).append("\n");
    sb.append("    extractions: ").append(toIndentedString(extractions)).append("\n");
    sb.append("    groupBy: ").append(toIndentedString(groupBy)).append("\n");
    sb.append("    indexes: ").append(toIndentedString(indexes)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    search: ").append(toIndentedString(search)).append("\n");
    sb.append("    semanticMode: ").append(toIndentedString(semanticMode)).append("\n");
    sb.append("    storage: ").append(toIndentedString(storage)).append("\n");
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
