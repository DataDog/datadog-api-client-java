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

/** Resource type of an LLM Observability dataset. */
@JsonSerialize(using = LLMObsDatasetType.LLMObsDatasetTypeSerializer.class)
public class LLMObsDatasetType extends ModelEnum<String> {

  private static final Set<String> allowedValues = new HashSet<String>(Arrays.asList("datasets"));

  public static final LLMObsDatasetType DATASETS = new LLMObsDatasetType("datasets");

  LLMObsDatasetType(String value) {
    super(value, allowedValues);
  }

  public static class LLMObsDatasetTypeSerializer extends StdSerializer<LLMObsDatasetType> {
    public LLMObsDatasetTypeSerializer(Class<LLMObsDatasetType> t) {
      super(t);
    }

    public LLMObsDatasetTypeSerializer() {
      this(null);
    }

    @Override
    public void serialize(LLMObsDatasetType value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static LLMObsDatasetType fromValue(String value) {
    return new LLMObsDatasetType(value);
  }
}
