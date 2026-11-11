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
 * Whether Datadog serves the holdout. Datadog serves MANAGED holdouts. EXTERNAL holdouts record
 * what your own feature flagging system holds back, and Datadog does not serve them.
 */
@JsonSerialize(
    using =
        ExperimentsExperimentHoldoutV2DTODataAttributesKind
            .ExperimentsExperimentHoldoutV2DTODataAttributesKindSerializer.class)
public class ExperimentsExperimentHoldoutV2DTODataAttributesKind extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("MANAGED", "EXTERNAL", "UNKNOWN"));

  public static final ExperimentsExperimentHoldoutV2DTODataAttributesKind MANAGED =
      new ExperimentsExperimentHoldoutV2DTODataAttributesKind("MANAGED");
  public static final ExperimentsExperimentHoldoutV2DTODataAttributesKind EXTERNAL =
      new ExperimentsExperimentHoldoutV2DTODataAttributesKind("EXTERNAL");
  public static final ExperimentsExperimentHoldoutV2DTODataAttributesKind UNKNOWN =
      new ExperimentsExperimentHoldoutV2DTODataAttributesKind("UNKNOWN");

  ExperimentsExperimentHoldoutV2DTODataAttributesKind(String value) {
    super(value, allowedValues);
  }

  public static class ExperimentsExperimentHoldoutV2DTODataAttributesKindSerializer
      extends StdSerializer<ExperimentsExperimentHoldoutV2DTODataAttributesKind> {
    public ExperimentsExperimentHoldoutV2DTODataAttributesKindSerializer(
        Class<ExperimentsExperimentHoldoutV2DTODataAttributesKind> t) {
      super(t);
    }

    public ExperimentsExperimentHoldoutV2DTODataAttributesKindSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        ExperimentsExperimentHoldoutV2DTODataAttributesKind value,
        JsonGenerator jgen,
        SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static ExperimentsExperimentHoldoutV2DTODataAttributesKind fromValue(String value) {
    return new ExperimentsExperimentHoldoutV2DTODataAttributesKind(value);
  }
}
