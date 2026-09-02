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

/** The staleness status for the feature flag at creation. */
@JsonSerialize(
    using = CreateFeatureFlagStalenessStatus.CreateFeatureFlagStalenessStatusSerializer.class)
public class CreateFeatureFlagStalenessStatus extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("ACTIVE", "PERMANENT"));

  public static final CreateFeatureFlagStalenessStatus ACTIVE =
      new CreateFeatureFlagStalenessStatus("ACTIVE");
  public static final CreateFeatureFlagStalenessStatus PERMANENT =
      new CreateFeatureFlagStalenessStatus("PERMANENT");

  CreateFeatureFlagStalenessStatus(String value) {
    super(value, allowedValues);
  }

  public static class CreateFeatureFlagStalenessStatusSerializer
      extends StdSerializer<CreateFeatureFlagStalenessStatus> {
    public CreateFeatureFlagStalenessStatusSerializer(Class<CreateFeatureFlagStalenessStatus> t) {
      super(t);
    }

    public CreateFeatureFlagStalenessStatusSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        CreateFeatureFlagStalenessStatus value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static CreateFeatureFlagStalenessStatus fromValue(String value) {
    return new CreateFeatureFlagStalenessStatus(value);
  }
}
