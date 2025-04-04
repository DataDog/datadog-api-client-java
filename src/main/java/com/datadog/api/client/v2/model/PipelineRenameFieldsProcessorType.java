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

/** The processor type. The value should always be <code>rename_fields</code>. */
@JsonSerialize(
    using = PipelineRenameFieldsProcessorType.PipelineRenameFieldsProcessorTypeSerializer.class)
public class PipelineRenameFieldsProcessorType extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("rename_fields"));

  public static final PipelineRenameFieldsProcessorType RENAME_FIELDS =
      new PipelineRenameFieldsProcessorType("rename_fields");

  PipelineRenameFieldsProcessorType(String value) {
    super(value, allowedValues);
  }

  public static class PipelineRenameFieldsProcessorTypeSerializer
      extends StdSerializer<PipelineRenameFieldsProcessorType> {
    public PipelineRenameFieldsProcessorTypeSerializer(Class<PipelineRenameFieldsProcessorType> t) {
      super(t);
    }

    public PipelineRenameFieldsProcessorTypeSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        PipelineRenameFieldsProcessorType value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static PipelineRenameFieldsProcessorType fromValue(String value) {
    return new PipelineRenameFieldsProcessorType(value);
  }
}
