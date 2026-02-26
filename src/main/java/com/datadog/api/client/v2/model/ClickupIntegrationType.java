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

/** The definition of the <code>ClickupIntegrationType</code> object. */
@JsonSerialize(using = ClickupIntegrationType.ClickupIntegrationTypeSerializer.class)
public class ClickupIntegrationType extends ModelEnum<String> {

  private static final Set<String> allowedValues = new HashSet<String>(Arrays.asList("Clickup"));

  public static final ClickupIntegrationType CLICKUP = new ClickupIntegrationType("Clickup");

  ClickupIntegrationType(String value) {
    super(value, allowedValues);
  }

  public static class ClickupIntegrationTypeSerializer
      extends StdSerializer<ClickupIntegrationType> {
    public ClickupIntegrationTypeSerializer(Class<ClickupIntegrationType> t) {
      super(t);
    }

    public ClickupIntegrationTypeSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        ClickupIntegrationType value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static ClickupIntegrationType fromValue(String value) {
    return new ClickupIntegrationType(value);
  }
}
