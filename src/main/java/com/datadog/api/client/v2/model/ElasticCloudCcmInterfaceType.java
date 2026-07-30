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

/** Interface discriminator for the Elastic Cloud CCM interface. */
@JsonSerialize(using = ElasticCloudCcmInterfaceType.ElasticCloudCcmInterfaceTypeSerializer.class)
public class ElasticCloudCcmInterfaceType extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("elastic-cloud-ccm"));

  public static final ElasticCloudCcmInterfaceType ELASTIC_CLOUD_CCM =
      new ElasticCloudCcmInterfaceType("elastic-cloud-ccm");

  ElasticCloudCcmInterfaceType(String value) {
    super(value, allowedValues);
  }

  public static class ElasticCloudCcmInterfaceTypeSerializer
      extends StdSerializer<ElasticCloudCcmInterfaceType> {
    public ElasticCloudCcmInterfaceTypeSerializer(Class<ElasticCloudCcmInterfaceType> t) {
      super(t);
    }

    public ElasticCloudCcmInterfaceTypeSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        ElasticCloudCcmInterfaceType value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static ElasticCloudCcmInterfaceType fromValue(String value) {
    return new ElasticCloudCcmInterfaceType(value);
  }
}
