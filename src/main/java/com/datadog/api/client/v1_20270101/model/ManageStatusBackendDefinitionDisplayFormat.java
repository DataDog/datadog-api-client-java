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
        ManageStatusBackendDefinitionDisplayFormat
            .ManageStatusBackendDefinitionDisplayFormatSerializer.class)
public class ManageStatusBackendDefinitionDisplayFormat extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("counts", "countsAndList", "list"));

  public static final ManageStatusBackendDefinitionDisplayFormat COUNTS =
      new ManageStatusBackendDefinitionDisplayFormat("counts");
  public static final ManageStatusBackendDefinitionDisplayFormat COUNTSANDLIST =
      new ManageStatusBackendDefinitionDisplayFormat("countsAndList");
  public static final ManageStatusBackendDefinitionDisplayFormat LIST =
      new ManageStatusBackendDefinitionDisplayFormat("list");

  ManageStatusBackendDefinitionDisplayFormat(String value) {
    super(value, allowedValues);
  }

  public static class ManageStatusBackendDefinitionDisplayFormatSerializer
      extends StdSerializer<ManageStatusBackendDefinitionDisplayFormat> {
    public ManageStatusBackendDefinitionDisplayFormatSerializer(
        Class<ManageStatusBackendDefinitionDisplayFormat> t) {
      super(t);
    }

    public ManageStatusBackendDefinitionDisplayFormatSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        ManageStatusBackendDefinitionDisplayFormat value,
        JsonGenerator jgen,
        SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static ManageStatusBackendDefinitionDisplayFormat fromValue(String value) {
    return new ManageStatusBackendDefinitionDisplayFormat(value);
  }
}
