/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v1_20270101.model;

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

/** Test-only generated schema for the dashboard versioning proof of concept. */
@JsonSerialize(using = RelationalDataQueryDataSource.RelationalDataQueryDataSourceSerializer.class)
public class RelationalDataQueryDataSource extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("reference_table", "managed_resource"));

  public static final RelationalDataQueryDataSource REFERENCE_TABLE =
      new RelationalDataQueryDataSource("reference_table");
  public static final RelationalDataQueryDataSource MANAGED_RESOURCE =
      new RelationalDataQueryDataSource("managed_resource");

  RelationalDataQueryDataSource(String value) {
    super(value, allowedValues);
  }

  public static class RelationalDataQueryDataSourceSerializer
      extends StdSerializer<RelationalDataQueryDataSource> {
    public RelationalDataQueryDataSourceSerializer(Class<RelationalDataQueryDataSource> t) {
      super(t);
    }

    public RelationalDataQueryDataSourceSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        RelationalDataQueryDataSource value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static RelationalDataQueryDataSource fromValue(String value) {
    return new RelationalDataQueryDataSource(value);
  }
}
