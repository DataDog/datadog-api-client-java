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

/** The status of a Model Lab run. */
@JsonSerialize(using = ModelLabRunStatus.ModelLabRunStatusSerializer.class)
public class ModelLabRunStatus extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(
          Arrays.asList(
              "pending", "running", "completed", "failed", "killed", "unresponsive", "paused"));

  public static final ModelLabRunStatus PENDING = new ModelLabRunStatus("pending");
  public static final ModelLabRunStatus RUNNING = new ModelLabRunStatus("running");
  public static final ModelLabRunStatus COMPLETED = new ModelLabRunStatus("completed");
  public static final ModelLabRunStatus FAILED = new ModelLabRunStatus("failed");
  public static final ModelLabRunStatus KILLED = new ModelLabRunStatus("killed");
  public static final ModelLabRunStatus UNRESPONSIVE = new ModelLabRunStatus("unresponsive");
  public static final ModelLabRunStatus PAUSED = new ModelLabRunStatus("paused");

  ModelLabRunStatus(String value) {
    super(value, allowedValues);
  }

  public static class ModelLabRunStatusSerializer extends StdSerializer<ModelLabRunStatus> {
    public ModelLabRunStatusSerializer(Class<ModelLabRunStatus> t) {
      super(t);
    }

    public ModelLabRunStatusSerializer() {
      this(null);
    }

    @Override
    public void serialize(ModelLabRunStatus value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static ModelLabRunStatus fromValue(String value) {
    return new ModelLabRunStatus(value);
  }
}
