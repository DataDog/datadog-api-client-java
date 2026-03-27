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

/** The cloud asset type */
@JsonSerialize(using = CloudAssetType.CloudAssetTypeSerializer.class)
public class CloudAssetType extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("Host", "HostImage", "Image"));

  public static final CloudAssetType HOST = new CloudAssetType("Host");
  public static final CloudAssetType HOST_IMAGE = new CloudAssetType("HostImage");
  public static final CloudAssetType IMAGE = new CloudAssetType("Image");

  CloudAssetType(String value) {
    super(value, allowedValues);
  }

  public static class CloudAssetTypeSerializer extends StdSerializer<CloudAssetType> {
    public CloudAssetTypeSerializer(Class<CloudAssetType> t) {
      super(t);
    }

    public CloudAssetTypeSerializer() {
      this(null);
    }

    @Override
    public void serialize(CloudAssetType value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static CloudAssetType fromValue(String value) {
    return new CloudAssetType(value);
  }
}
