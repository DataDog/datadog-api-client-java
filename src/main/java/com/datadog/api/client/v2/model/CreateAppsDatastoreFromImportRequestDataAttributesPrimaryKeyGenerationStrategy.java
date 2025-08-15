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
        CreateAppsDatastoreFromImportRequestDataAttributesPrimaryKeyGenerationStrategy
            .CreateAppsDatastoreFromImportRequestDataAttributesPrimaryKeyGenerationStrategySerializer
            .class)
public class CreateAppsDatastoreFromImportRequestDataAttributesPrimaryKeyGenerationStrategy
    extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("none", "uuid"));

  public static final CreateAppsDatastoreFromImportRequestDataAttributesPrimaryKeyGenerationStrategy
      NONE =
          new CreateAppsDatastoreFromImportRequestDataAttributesPrimaryKeyGenerationStrategy(
              "none");
  public static final CreateAppsDatastoreFromImportRequestDataAttributesPrimaryKeyGenerationStrategy
      UUID =
          new CreateAppsDatastoreFromImportRequestDataAttributesPrimaryKeyGenerationStrategy(
              "uuid");

  CreateAppsDatastoreFromImportRequestDataAttributesPrimaryKeyGenerationStrategy(String value) {
    super(value, allowedValues);
  }

  public static
  class CreateAppsDatastoreFromImportRequestDataAttributesPrimaryKeyGenerationStrategySerializer
      extends StdSerializer<
          CreateAppsDatastoreFromImportRequestDataAttributesPrimaryKeyGenerationStrategy> {
    public CreateAppsDatastoreFromImportRequestDataAttributesPrimaryKeyGenerationStrategySerializer(
        Class<CreateAppsDatastoreFromImportRequestDataAttributesPrimaryKeyGenerationStrategy> t) {
      super(t);
    }

    public
    CreateAppsDatastoreFromImportRequestDataAttributesPrimaryKeyGenerationStrategySerializer() {
      this(null);
    }

    @Override
    public void serialize(
        CreateAppsDatastoreFromImportRequestDataAttributesPrimaryKeyGenerationStrategy value,
        JsonGenerator jgen,
        SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static CreateAppsDatastoreFromImportRequestDataAttributesPrimaryKeyGenerationStrategy
      fromValue(String value) {
    return new CreateAppsDatastoreFromImportRequestDataAttributesPrimaryKeyGenerationStrategy(
        value);
  }
}
