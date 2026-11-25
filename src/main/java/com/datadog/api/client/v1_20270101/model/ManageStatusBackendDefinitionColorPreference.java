/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v1_20270101.model;

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

/** Test-only generated schema for the dashboard versioning proof of concept. */
@JsonSerialize(
    using =
        ManageStatusBackendDefinitionColorPreference
            .ManageStatusBackendDefinitionColorPreferenceSerializer.class)
public class ManageStatusBackendDefinitionColorPreference extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("text", "background"));

  public static final ManageStatusBackendDefinitionColorPreference TEXT =
      new ManageStatusBackendDefinitionColorPreference("text");
  public static final ManageStatusBackendDefinitionColorPreference BACKGROUND =
      new ManageStatusBackendDefinitionColorPreference("background");

  ManageStatusBackendDefinitionColorPreference(String value) {
    super(value, allowedValues);
  }

  public static class ManageStatusBackendDefinitionColorPreferenceSerializer
      extends StdSerializer<ManageStatusBackendDefinitionColorPreference> {
    public ManageStatusBackendDefinitionColorPreferenceSerializer(
        Class<ManageStatusBackendDefinitionColorPreference> t) {
      super(t);
    }

    public ManageStatusBackendDefinitionColorPreferenceSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        ManageStatusBackendDefinitionColorPreference value,
        JsonGenerator jgen,
        SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static ManageStatusBackendDefinitionColorPreference fromValue(String value) {
    return new ManageStatusBackendDefinitionColorPreference(value);
  }
}
