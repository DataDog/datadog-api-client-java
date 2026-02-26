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

/** The asset type */
@JsonSerialize(using = AssetType.AssetTypeSerializer.class)
public class AssetType extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("Repository", "Service", "Host", "HostImage", "Image"));

  public static final AssetType REPOSITORY = new AssetType("Repository");
  public static final AssetType SERVICE = new AssetType("Service");
  public static final AssetType HOST = new AssetType("Host");
  public static final AssetType HOSTIMAGE = new AssetType("HostImage");
  public static final AssetType IMAGE = new AssetType("Image");

  AssetType(String value) {
    super(value, allowedValues);
  }

  public static class AssetTypeSerializer extends StdSerializer<AssetType> {
    public AssetTypeSerializer(Class<AssetType> t) {
      super(t);
    }

    public AssetTypeSerializer() {
      this(null);
    }

    @Override
    public void serialize(AssetType value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static AssetType fromValue(String value) {
    return new AssetType(value);
  }
}
