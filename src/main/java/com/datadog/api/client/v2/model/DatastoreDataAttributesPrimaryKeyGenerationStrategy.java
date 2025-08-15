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

/** The <code>attributes</code> <code>primary_key_generation_strategy</code>. */
@JsonSerialize(
    using =
        DatastoreDataAttributesPrimaryKeyGenerationStrategy
            .DatastoreDataAttributesPrimaryKeyGenerationStrategySerializer.class)
public class DatastoreDataAttributesPrimaryKeyGenerationStrategy extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("none", "uuid"));

  public static final DatastoreDataAttributesPrimaryKeyGenerationStrategy NONE =
      new DatastoreDataAttributesPrimaryKeyGenerationStrategy("none");
  public static final DatastoreDataAttributesPrimaryKeyGenerationStrategy UUID =
      new DatastoreDataAttributesPrimaryKeyGenerationStrategy("uuid");

  DatastoreDataAttributesPrimaryKeyGenerationStrategy(String value) {
    super(value, allowedValues);
  }

  public static class DatastoreDataAttributesPrimaryKeyGenerationStrategySerializer
      extends StdSerializer<DatastoreDataAttributesPrimaryKeyGenerationStrategy> {
    public DatastoreDataAttributesPrimaryKeyGenerationStrategySerializer(
        Class<DatastoreDataAttributesPrimaryKeyGenerationStrategy> t) {
      super(t);
    }

    public DatastoreDataAttributesPrimaryKeyGenerationStrategySerializer() {
      this(null);
    }

    @Override
    public void serialize(
        DatastoreDataAttributesPrimaryKeyGenerationStrategy value,
        JsonGenerator jgen,
        SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static DatastoreDataAttributesPrimaryKeyGenerationStrategy fromValue(String value) {
    return new DatastoreDataAttributesPrimaryKeyGenerationStrategy(value);
  }
}
