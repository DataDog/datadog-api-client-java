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

/** The SBOM component type */
@JsonSerialize(using = SBOMComponentType.SBOMComponentTypeSerializer.class)
public class SBOMComponentType extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(
          Arrays.asList(
              "application",
              "container",
              "data",
              "device",
              "device-driver",
              "file",
              "firmware",
              "framework",
              "library",
              "machine-learning-model",
              "operating-system",
              "platform"));

  public static final SBOMComponentType APPLICATION = new SBOMComponentType("application");
  public static final SBOMComponentType CONTAINER = new SBOMComponentType("container");
  public static final SBOMComponentType DATA = new SBOMComponentType("data");
  public static final SBOMComponentType DEVICE = new SBOMComponentType("device");
  public static final SBOMComponentType DEVICE_DRIVER = new SBOMComponentType("device-driver");
  public static final SBOMComponentType FILE = new SBOMComponentType("file");
  public static final SBOMComponentType FIRMWARE = new SBOMComponentType("firmware");
  public static final SBOMComponentType FRAMEWORK = new SBOMComponentType("framework");
  public static final SBOMComponentType LIBRARY = new SBOMComponentType("library");
  public static final SBOMComponentType MACHINE_LEARNING_MODEL =
      new SBOMComponentType("machine-learning-model");
  public static final SBOMComponentType OPERATING_SYSTEM =
      new SBOMComponentType("operating-system");
  public static final SBOMComponentType PLATFORM = new SBOMComponentType("platform");

  SBOMComponentType(String value) {
    super(value, allowedValues);
  }

  public static class SBOMComponentTypeSerializer extends StdSerializer<SBOMComponentType> {
    public SBOMComponentTypeSerializer(Class<SBOMComponentType> t) {
      super(t);
    }

    public SBOMComponentTypeSerializer() {
      this(null);
    }

    @Override
    public void serialize(SBOMComponentType value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static SBOMComponentType fromValue(String value) {
    return new SBOMComponentType(value);
  }
}
