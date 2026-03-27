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

/** Upsert arbitrary rule resource type. */
@JsonSerialize(
    using = ArbitraryCostUpsertRequestDataType.ArbitraryCostUpsertRequestDataTypeSerializer.class)
public class ArbitraryCostUpsertRequestDataType extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("upsert_arbitrary_rule"));

  public static final ArbitraryCostUpsertRequestDataType UPSERT_ARBITRARY_RULE =
      new ArbitraryCostUpsertRequestDataType("upsert_arbitrary_rule");

  ArbitraryCostUpsertRequestDataType(String value) {
    super(value, allowedValues);
  }

  public static class ArbitraryCostUpsertRequestDataTypeSerializer
      extends StdSerializer<ArbitraryCostUpsertRequestDataType> {
    public ArbitraryCostUpsertRequestDataTypeSerializer(
        Class<ArbitraryCostUpsertRequestDataType> t) {
      super(t);
    }

    public ArbitraryCostUpsertRequestDataTypeSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        ArbitraryCostUpsertRequestDataType value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static ArbitraryCostUpsertRequestDataType fromValue(String value) {
    return new ArbitraryCostUpsertRequestDataType(value);
  }
}
