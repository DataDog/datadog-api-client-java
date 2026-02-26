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
 * Can be set to <code>uuid</code> to automatically generate primary keys when new items are added.
 * Default value is <code>none</code>, which requires you to supply a primary key for each new item.
 */
@JsonSerialize(
    using =
        DatastorePrimaryKeyGenerationStrategy.DatastorePrimaryKeyGenerationStrategySerializer.class)
public class DatastorePrimaryKeyGenerationStrategy extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("none", "uuid"));

  public static final DatastorePrimaryKeyGenerationStrategy NONE =
      new DatastorePrimaryKeyGenerationStrategy("none");
  public static final DatastorePrimaryKeyGenerationStrategy UUID =
      new DatastorePrimaryKeyGenerationStrategy("uuid");

  DatastorePrimaryKeyGenerationStrategy(String value) {
    super(value, allowedValues);
  }

  public static class DatastorePrimaryKeyGenerationStrategySerializer
      extends StdSerializer<DatastorePrimaryKeyGenerationStrategy> {
    public DatastorePrimaryKeyGenerationStrategySerializer(
        Class<DatastorePrimaryKeyGenerationStrategy> t) {
      super(t);
    }

    public DatastorePrimaryKeyGenerationStrategySerializer() {
      this(null);
    }

    @Override
    public void serialize(
        DatastorePrimaryKeyGenerationStrategy value,
        JsonGenerator jgen,
        SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static DatastorePrimaryKeyGenerationStrategy fromValue(String value) {
    return new DatastorePrimaryKeyGenerationStrategy(value);
  }
}
