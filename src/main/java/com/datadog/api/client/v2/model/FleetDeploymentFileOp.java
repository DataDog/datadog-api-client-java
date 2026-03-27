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
 * Type of file operation to perform on the target configuration file. - <code>merge-patch</code>:
 * Merges the provided patch data with the existing configuration file. Creates the file if it
 * doesn't exist. - <code>delete</code>: Removes the specified configuration file from the target
 * hosts.
 */
@JsonSerialize(using = FleetDeploymentFileOp.FleetDeploymentFileOpSerializer.class)
public class FleetDeploymentFileOp extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("merge-patch", "delete"));

  public static final FleetDeploymentFileOp MERGE_PATCH = new FleetDeploymentFileOp("merge-patch");
  public static final FleetDeploymentFileOp DELETE = new FleetDeploymentFileOp("delete");

  FleetDeploymentFileOp(String value) {
    super(value, allowedValues);
  }

  public static class FleetDeploymentFileOpSerializer extends StdSerializer<FleetDeploymentFileOp> {
    public FleetDeploymentFileOpSerializer(Class<FleetDeploymentFileOp> t) {
      super(t);
    }

    public FleetDeploymentFileOpSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        FleetDeploymentFileOp value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static FleetDeploymentFileOp fromValue(String value) {
    return new FleetDeploymentFileOp(value);
  }
}
