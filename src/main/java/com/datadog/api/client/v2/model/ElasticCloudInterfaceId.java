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

/** Supported Elastic Cloud interface (source-type) ids. */
@JsonSerialize(using = ElasticCloudInterfaceId.ElasticCloudInterfaceIdSerializer.class)
public class ElasticCloudInterfaceId extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("elastic-cloud", "elastic-cloud-ccm"));

  public static final ElasticCloudInterfaceId ELASTIC_CLOUD =
      new ElasticCloudInterfaceId("elastic-cloud");
  public static final ElasticCloudInterfaceId ELASTIC_CLOUD_CCM =
      new ElasticCloudInterfaceId("elastic-cloud-ccm");

  ElasticCloudInterfaceId(String value) {
    super(value, allowedValues);
  }

  public static class ElasticCloudInterfaceIdSerializer
      extends StdSerializer<ElasticCloudInterfaceId> {
    public ElasticCloudInterfaceIdSerializer(Class<ElasticCloudInterfaceId> t) {
      super(t);
    }

    public ElasticCloudInterfaceIdSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        ElasticCloudInterfaceId value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static ElasticCloudInterfaceId fromValue(String value) {
    return new ElasticCloudInterfaceId(value);
  }
}
