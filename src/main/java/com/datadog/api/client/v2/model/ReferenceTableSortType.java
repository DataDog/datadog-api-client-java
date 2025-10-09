/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v2.model;

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

/**
 * Sort field and direction for reference tables. Use field name for ascending, prefix with "-" for
 * descending.
 */
@JsonSerialize(using = ReferenceTableSortType.ReferenceTableSortTypeSerializer.class)
public class ReferenceTableSortType extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(
          Arrays.asList(
              "updated_at", "table_name", "status", "-updated_at", "-table_name", "-status"));

  public static final ReferenceTableSortType UPDATED_AT = new ReferenceTableSortType("updated_at");
  public static final ReferenceTableSortType TABLE_NAME = new ReferenceTableSortType("table_name");
  public static final ReferenceTableSortType STATUS = new ReferenceTableSortType("status");
  public static final ReferenceTableSortType MINUS_UPDATED_AT =
      new ReferenceTableSortType("-updated_at");
  public static final ReferenceTableSortType MINUS_TABLE_NAME =
      new ReferenceTableSortType("-table_name");
  public static final ReferenceTableSortType MINUS_STATUS = new ReferenceTableSortType("-status");

  ReferenceTableSortType(String value) {
    super(value, allowedValues);
  }

  public static class ReferenceTableSortTypeSerializer
      extends StdSerializer<ReferenceTableSortType> {
    public ReferenceTableSortTypeSerializer(Class<ReferenceTableSortType> t) {
      super(t);
    }

    public ReferenceTableSortTypeSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        ReferenceTableSortType value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static ReferenceTableSortType fromValue(String value) {
    return new ReferenceTableSortType(value);
  }
}
