/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v1.model;

import com.datadog.api.client.ModelEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.ser.std.StdSerializer;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/** Identifies this as a published-dataset list query. */
@JsonSerialize(
    using = DatasetListQueryDataSourceType.DatasetListQueryDataSourceTypeSerializer.class)
public class DatasetListQueryDataSourceType extends ModelEnum<String> {

  private static final Set<String> allowedValues = new HashSet<String>(Arrays.asList("dataset"));

  public static final DatasetListQueryDataSourceType DATASET =
      new DatasetListQueryDataSourceType("dataset");

  DatasetListQueryDataSourceType(String value) {
    super(value, allowedValues);
  }

  public static class DatasetListQueryDataSourceTypeSerializer
      extends StdSerializer<DatasetListQueryDataSourceType> {
    public DatasetListQueryDataSourceTypeSerializer(Class<DatasetListQueryDataSourceType> t) {
      super(t);
    }

    public DatasetListQueryDataSourceTypeSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        DatasetListQueryDataSourceType value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static DatasetListQueryDataSourceType fromValue(String value) {
    return new DatasetListQueryDataSourceType(value);
  }
}
