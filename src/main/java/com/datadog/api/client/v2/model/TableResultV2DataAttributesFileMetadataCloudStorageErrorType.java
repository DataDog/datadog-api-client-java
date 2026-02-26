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

import com.datadog.api.client.ModelEnum;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.ser.std.StdSerializer;
import java.io.IOException;

import java.util.Set;
import java.util.HashSet;

/**
   * <p>The type of error that occurred during file processing. This field provides high-level error categories for easier troubleshooting and is only present when there are errors.</p>
 */
@JsonSerialize(using = TableResultV2DataAttributesFileMetadataCloudStorageErrorType.TableResultV2DataAttributesFileMetadataCloudStorageErrorTypeSerializer.class)
public class TableResultV2DataAttributesFileMetadataCloudStorageErrorType extends ModelEnum<String> {

  private static final Set<String> allowedValues = new HashSet<String>(Arrays.asList("TABLE_SCHEMA_ERROR", "FILE_FORMAT_ERROR", "CONFIGURATION_ERROR", "QUOTA_EXCEEDED", "CONFLICT_ERROR", "VALIDATION_ERROR", "STATE_ERROR", "OPERATION_ERROR", "SYSTEM_ERROR"));

  public static final TableResultV2DataAttributesFileMetadataCloudStorageErrorType TABLE_SCHEMA_ERROR = new TableResultV2DataAttributesFileMetadataCloudStorageErrorType("TABLE_SCHEMA_ERROR");
  public static final TableResultV2DataAttributesFileMetadataCloudStorageErrorType FILE_FORMAT_ERROR = new TableResultV2DataAttributesFileMetadataCloudStorageErrorType("FILE_FORMAT_ERROR");
  public static final TableResultV2DataAttributesFileMetadataCloudStorageErrorType CONFIGURATION_ERROR = new TableResultV2DataAttributesFileMetadataCloudStorageErrorType("CONFIGURATION_ERROR");
  public static final TableResultV2DataAttributesFileMetadataCloudStorageErrorType QUOTA_EXCEEDED = new TableResultV2DataAttributesFileMetadataCloudStorageErrorType("QUOTA_EXCEEDED");
  public static final TableResultV2DataAttributesFileMetadataCloudStorageErrorType CONFLICT_ERROR = new TableResultV2DataAttributesFileMetadataCloudStorageErrorType("CONFLICT_ERROR");
  public static final TableResultV2DataAttributesFileMetadataCloudStorageErrorType VALIDATION_ERROR = new TableResultV2DataAttributesFileMetadataCloudStorageErrorType("VALIDATION_ERROR");
  public static final TableResultV2DataAttributesFileMetadataCloudStorageErrorType STATE_ERROR = new TableResultV2DataAttributesFileMetadataCloudStorageErrorType("STATE_ERROR");
  public static final TableResultV2DataAttributesFileMetadataCloudStorageErrorType OPERATION_ERROR = new TableResultV2DataAttributesFileMetadataCloudStorageErrorType("OPERATION_ERROR");
  public static final TableResultV2DataAttributesFileMetadataCloudStorageErrorType SYSTEM_ERROR = new TableResultV2DataAttributesFileMetadataCloudStorageErrorType("SYSTEM_ERROR");


  TableResultV2DataAttributesFileMetadataCloudStorageErrorType(String value) {
    super(value, allowedValues);
  }

  public static class TableResultV2DataAttributesFileMetadataCloudStorageErrorTypeSerializer extends StdSerializer<TableResultV2DataAttributesFileMetadataCloudStorageErrorType> {
      public TableResultV2DataAttributesFileMetadataCloudStorageErrorTypeSerializer(Class<TableResultV2DataAttributesFileMetadataCloudStorageErrorType> t) {
          super(t);
      }

      public TableResultV2DataAttributesFileMetadataCloudStorageErrorTypeSerializer() {
          this(null);
      }

      @Override
      public void serialize(TableResultV2DataAttributesFileMetadataCloudStorageErrorType value, JsonGenerator jgen, SerializerProvider provider) throws IOException, JsonProcessingException {
          jgen.writeObject(value.value);
      }
  }

  @JsonCreator
  public static TableResultV2DataAttributesFileMetadataCloudStorageErrorType fromValue(String value) {
    return new TableResultV2DataAttributesFileMetadataCloudStorageErrorType(value);
  }
}
