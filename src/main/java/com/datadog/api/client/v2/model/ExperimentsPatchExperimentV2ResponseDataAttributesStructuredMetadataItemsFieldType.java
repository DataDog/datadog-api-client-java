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

/** Type of value stored in the structured metadata field. */
@JsonSerialize(
    using =
        ExperimentsPatchExperimentV2ResponseDataAttributesStructuredMetadataItemsFieldType
            .ExperimentsPatchExperimentV2ResponseDataAttributesStructuredMetadataItemsFieldTypeSerializer
            .class)
public class ExperimentsPatchExperimentV2ResponseDataAttributesStructuredMetadataItemsFieldType
    extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("FREETEXT", "ENUM"));

  public static final
  ExperimentsPatchExperimentV2ResponseDataAttributesStructuredMetadataItemsFieldType FREETEXT =
      new ExperimentsPatchExperimentV2ResponseDataAttributesStructuredMetadataItemsFieldType(
          "FREETEXT");
  public static final
  ExperimentsPatchExperimentV2ResponseDataAttributesStructuredMetadataItemsFieldType ENUM =
      new ExperimentsPatchExperimentV2ResponseDataAttributesStructuredMetadataItemsFieldType(
          "ENUM");

  ExperimentsPatchExperimentV2ResponseDataAttributesStructuredMetadataItemsFieldType(String value) {
    super(value, allowedValues);
  }

  public static
  class ExperimentsPatchExperimentV2ResponseDataAttributesStructuredMetadataItemsFieldTypeSerializer
      extends StdSerializer<
          ExperimentsPatchExperimentV2ResponseDataAttributesStructuredMetadataItemsFieldType> {
    public
    ExperimentsPatchExperimentV2ResponseDataAttributesStructuredMetadataItemsFieldTypeSerializer(
        Class<ExperimentsPatchExperimentV2ResponseDataAttributesStructuredMetadataItemsFieldType>
            t) {
      super(t);
    }

    public
    ExperimentsPatchExperimentV2ResponseDataAttributesStructuredMetadataItemsFieldTypeSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        ExperimentsPatchExperimentV2ResponseDataAttributesStructuredMetadataItemsFieldType value,
        JsonGenerator jgen,
        SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static ExperimentsPatchExperimentV2ResponseDataAttributesStructuredMetadataItemsFieldType
      fromValue(String value) {
    return new ExperimentsPatchExperimentV2ResponseDataAttributesStructuredMetadataItemsFieldType(
        value);
  }
}
