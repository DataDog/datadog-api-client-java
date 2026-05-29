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

/** Supported export format for an LLM Observability dataset. */
@JsonSerialize(using = LLMObsDatasetExportFormat.LLMObsDatasetExportFormatSerializer.class)
public class LLMObsDatasetExportFormat extends ModelEnum<String> {

  private static final Set<String> allowedValues = new HashSet<String>(Arrays.asList("csv"));

  public static final LLMObsDatasetExportFormat CSV = new LLMObsDatasetExportFormat("csv");

  LLMObsDatasetExportFormat(String value) {
    super(value, allowedValues);
  }

  public static class LLMObsDatasetExportFormatSerializer
      extends StdSerializer<LLMObsDatasetExportFormat> {
    public LLMObsDatasetExportFormatSerializer(Class<LLMObsDatasetExportFormat> t) {
      super(t);
    }

    public LLMObsDatasetExportFormatSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        LLMObsDatasetExportFormat value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static LLMObsDatasetExportFormat fromValue(String value) {
    return new LLMObsDatasetExportFormat(value);
  }
}
