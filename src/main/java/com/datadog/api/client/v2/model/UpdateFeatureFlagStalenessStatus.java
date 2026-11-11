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
 * The lifecycle to set. <code>ACTIVE</code> makes the flag temporary; <code>PERMANENT</code>
 * excludes it from staleness detection. Either value clears any snooze; omit the field to keep the
 * lifecycle. Do not copy the top-level <code>staleness_status</code> from a response into this
 * field: that legacy response field is always <code>ACTIVE</code>.
 */
@JsonSerialize(
    using = UpdateFeatureFlagStalenessStatus.UpdateFeatureFlagStalenessStatusSerializer.class)
public class UpdateFeatureFlagStalenessStatus extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("ACTIVE", "PERMANENT"));

  public static final UpdateFeatureFlagStalenessStatus ACTIVE =
      new UpdateFeatureFlagStalenessStatus("ACTIVE");
  public static final UpdateFeatureFlagStalenessStatus PERMANENT =
      new UpdateFeatureFlagStalenessStatus("PERMANENT");

  UpdateFeatureFlagStalenessStatus(String value) {
    super(value, allowedValues);
  }

  public static class UpdateFeatureFlagStalenessStatusSerializer
      extends StdSerializer<UpdateFeatureFlagStalenessStatus> {
    public UpdateFeatureFlagStalenessStatusSerializer(Class<UpdateFeatureFlagStalenessStatus> t) {
      super(t);
    }

    public UpdateFeatureFlagStalenessStatusSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        UpdateFeatureFlagStalenessStatus value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static UpdateFeatureFlagStalenessStatus fromValue(String value) {
    return new UpdateFeatureFlagStalenessStatus(value);
  }
}
