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

/** Most recent synchronization outcome, or pending if no outcome has been recorded. */
@JsonSerialize(using = TerraformBackendSyncStatus.TerraformBackendSyncStatusSerializer.class)
public class TerraformBackendSyncStatus extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("pending", "success", "failure"));

  public static final TerraformBackendSyncStatus PENDING =
      new TerraformBackendSyncStatus("pending");
  public static final TerraformBackendSyncStatus SUCCESS =
      new TerraformBackendSyncStatus("success");
  public static final TerraformBackendSyncStatus FAILURE =
      new TerraformBackendSyncStatus("failure");

  TerraformBackendSyncStatus(String value) {
    super(value, allowedValues);
  }

  public static class TerraformBackendSyncStatusSerializer
      extends StdSerializer<TerraformBackendSyncStatus> {
    public TerraformBackendSyncStatusSerializer(Class<TerraformBackendSyncStatus> t) {
      super(t);
    }

    public TerraformBackendSyncStatusSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        TerraformBackendSyncStatus value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static TerraformBackendSyncStatus fromValue(String value) {
    return new TerraformBackendSyncStatus(value);
  }
}
