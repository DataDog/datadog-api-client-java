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

/** Publication status of the protocol. */
@JsonSerialize(
    using =
        ExperimentsPublicProtocolResponseDataAttributesStatus
            .ExperimentsPublicProtocolResponseDataAttributesStatusSerializer.class)
public class ExperimentsPublicProtocolResponseDataAttributesStatus extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("DRAFT", "PUBLISHED", "ARCHIVED"));

  public static final ExperimentsPublicProtocolResponseDataAttributesStatus DRAFT =
      new ExperimentsPublicProtocolResponseDataAttributesStatus("DRAFT");
  public static final ExperimentsPublicProtocolResponseDataAttributesStatus PUBLISHED =
      new ExperimentsPublicProtocolResponseDataAttributesStatus("PUBLISHED");
  public static final ExperimentsPublicProtocolResponseDataAttributesStatus ARCHIVED =
      new ExperimentsPublicProtocolResponseDataAttributesStatus("ARCHIVED");

  ExperimentsPublicProtocolResponseDataAttributesStatus(String value) {
    super(value, allowedValues);
  }

  public static class ExperimentsPublicProtocolResponseDataAttributesStatusSerializer
      extends StdSerializer<ExperimentsPublicProtocolResponseDataAttributesStatus> {
    public ExperimentsPublicProtocolResponseDataAttributesStatusSerializer(
        Class<ExperimentsPublicProtocolResponseDataAttributesStatus> t) {
      super(t);
    }

    public ExperimentsPublicProtocolResponseDataAttributesStatusSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        ExperimentsPublicProtocolResponseDataAttributesStatus value,
        JsonGenerator jgen,
        SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static ExperimentsPublicProtocolResponseDataAttributesStatus fromValue(String value) {
    return new ExperimentsPublicProtocolResponseDataAttributesStatus(value);
  }
}
