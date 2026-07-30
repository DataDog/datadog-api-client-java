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

/** Identifier of an Elastic Cloud CCM dataflow. */
@JsonSerialize(using = ElasticCloudCcmDataflowId.ElasticCloudCcmDataflowIdSerializer.class)
public class ElasticCloudCcmDataflowId extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("elastic-cloud-cost-data"));

  public static final ElasticCloudCcmDataflowId COST_DATA =
      new ElasticCloudCcmDataflowId("elastic-cloud-cost-data");

  ElasticCloudCcmDataflowId(String value) {
    super(value, allowedValues);
  }

  public static class ElasticCloudCcmDataflowIdSerializer
      extends StdSerializer<ElasticCloudCcmDataflowId> {
    public ElasticCloudCcmDataflowIdSerializer(Class<ElasticCloudCcmDataflowId> t) {
      super(t);
    }

    public ElasticCloudCcmDataflowIdSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        ElasticCloudCcmDataflowId value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static ElasticCloudCcmDataflowId fromValue(String value) {
    return new ElasticCloudCcmDataflowId(value);
  }
}
