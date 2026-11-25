/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v1_20270101.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/** Test-only generated schema for the dashboard versioning proof of concept. */
@JsonPropertyOrder({
  FormulaAndFunctionEventQueryDefinition.JSON_PROPERTY_CALCULATED_FIELDS,
  FormulaAndFunctionEventQueryDefinition.JSON_PROPERTY_COMPUTE,
  FormulaAndFunctionEventQueryDefinition.JSON_PROPERTY_CROSS_ORG_UUIDS,
  FormulaAndFunctionEventQueryDefinition.JSON_PROPERTY_DATA_SOURCE,
  FormulaAndFunctionEventQueryDefinition.JSON_PROPERTY_EXTRACTIONS,
  FormulaAndFunctionEventQueryDefinition.JSON_PROPERTY_GROUP_BY,
  FormulaAndFunctionEventQueryDefinition.JSON_PROPERTY_INDEXES,
  FormulaAndFunctionEventQueryDefinition.JSON_PROPERTY_NAME,
  FormulaAndFunctionEventQueryDefinition.JSON_PROPERTY_SEARCH,
  FormulaAndFunctionEventQueryDefinition.JSON_PROPERTY_SEMANTIC_MODE,
  FormulaAndFunctionEventQueryDefinition.JSON_PROPERTY_STORAGE
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class FormulaAndFunctionEventQueryDefinition {
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
  private FormulaAndFunctionEventQueryDefinitionSearch search;

  public static final String JSON_PROPERTY_SEMANTIC_MODE = "semantic_mode";
  private FormulaSemanticMode semanticMode;

  public static final String JSON_PROPERTY_STORAGE = "storage";
  private StorageType storage;

  public FormulaAndFunctionEventQueryDefinition() {}

  @JsonCreator
  public FormulaAndFunctionEventQueryDefinition(
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

  public FormulaAndFunctionEventQueryDefinition calculatedFields(
      List<EventsCalculatedField> calculatedFields) {
    this.calculatedFields = calculatedFields;
    if (calculatedFields != null) {
      for (EventsCalculatedField item : calculatedFields) {
        this.unparsed |= item.unparsed;
      }
    }
    return this;
  }

  public FormulaAndFunctionEventQueryDefinition addCalculatedFieldsItem(
      EventsCalculatedField calculatedFieldsItem) {
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

  public FormulaAndFunctionEventQueryDefinition compute(
      FormulaAndFunctionEventQueryDefinitionCompute compute) {
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

  public FormulaAndFunctionEventQueryDefinition crossOrgUuids(List<String> crossOrgUuids) {
    this.crossOrgUuids = crossOrgUuids;
    return this;
  }

  public FormulaAndFunctionEventQueryDefinition addCrossOrgUuidsItem(String crossOrgUuidsItem) {
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

  public FormulaAndFunctionEventQueryDefinition dataSource(
      FormulaAndFunctionEventsDataSource dataSource) {
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

  public FormulaAndFunctionEventQueryDefinition extractions(
      List<EventsDataExtraction> extractions) {
    this.extractions = extractions;
    if (extractions != null) {
      for (EventsDataExtraction item : extractions) {
        this.unparsed |= item.unparsed;
      }
    }
    return this;
  }

  public FormulaAndFunctionEventQueryDefinition addExtractionsItem(
      EventsDataExtraction extractionsItem) {
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

  public FormulaAndFunctionEventQueryDefinition groupBy(
      FormulaAndFunctionEventQueryGroupByConfig groupBy) {
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

  public FormulaAndFunctionEventQueryDefinition indexes(List<String> indexes) {
    this.indexes = indexes;
    return this;
  }

  public FormulaAndFunctionEventQueryDefinition addIndexesItem(String indexesItem) {
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

  public FormulaAndFunctionEventQueryDefinition name(String name) {
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

  public FormulaAndFunctionEventQueryDefinition search(
      FormulaAndFunctionEventQueryDefinitionSearch search) {
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
  public FormulaAndFunctionEventQueryDefinitionSearch getSearch() {
    return search;
  }

  public void setSearch(FormulaAndFunctionEventQueryDefinitionSearch search) {
    this.search = search;
    if (search != null) {
      this.unparsed |= search.unparsed;
    }
  }

  public FormulaAndFunctionEventQueryDefinition semanticMode(FormulaSemanticMode semanticMode) {
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

  public FormulaAndFunctionEventQueryDefinition storage(StorageType storage) {
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

  /** Return true if this FormulaAndFunctionEventQueryDefinition object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FormulaAndFunctionEventQueryDefinition formulaAndFunctionEventQueryDefinition =
        (FormulaAndFunctionEventQueryDefinition) o;
    return Objects.equals(
            this.calculatedFields, formulaAndFunctionEventQueryDefinition.calculatedFields)
        && Objects.equals(this.compute, formulaAndFunctionEventQueryDefinition.compute)
        && Objects.equals(this.crossOrgUuids, formulaAndFunctionEventQueryDefinition.crossOrgUuids)
        && Objects.equals(this.dataSource, formulaAndFunctionEventQueryDefinition.dataSource)
        && Objects.equals(this.extractions, formulaAndFunctionEventQueryDefinition.extractions)
        && Objects.equals(this.groupBy, formulaAndFunctionEventQueryDefinition.groupBy)
        && Objects.equals(this.indexes, formulaAndFunctionEventQueryDefinition.indexes)
        && Objects.equals(this.name, formulaAndFunctionEventQueryDefinition.name)
        && Objects.equals(this.search, formulaAndFunctionEventQueryDefinition.search)
        && Objects.equals(this.semanticMode, formulaAndFunctionEventQueryDefinition.semanticMode)
        && Objects.equals(this.storage, formulaAndFunctionEventQueryDefinition.storage);
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
        storage);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FormulaAndFunctionEventQueryDefinition {\n");
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
