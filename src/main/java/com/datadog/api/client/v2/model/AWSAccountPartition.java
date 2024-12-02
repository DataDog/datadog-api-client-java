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
 * AWS partition your AWS account is scoped to. Defaults to <code>aws</code>. See <a
 * href="https://docs.aws.amazon.com/whitepapers/latest/aws-fault-isolation-boundaries/partitions.html">Partitions</a>
 * in the AWS documentation for more information.
 */
@JsonSerialize(using = AWSAccountPartition.AWSAccountPartitionSerializer.class)
public class AWSAccountPartition extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("aws", "aws-cn", "aws-us-gov"));

  public static final AWSAccountPartition AWS = new AWSAccountPartition("aws");
  public static final AWSAccountPartition AWS_CN = new AWSAccountPartition("aws-cn");
  public static final AWSAccountPartition AWS_US_GOV = new AWSAccountPartition("aws-us-gov");

  AWSAccountPartition(String value) {
    super(value, allowedValues);
  }

  public static class AWSAccountPartitionSerializer extends StdSerializer<AWSAccountPartition> {
    public AWSAccountPartitionSerializer(Class<AWSAccountPartition> t) {
      super(t);
    }

    public AWSAccountPartitionSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        AWSAccountPartition value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static AWSAccountPartition fromValue(String value) {
    return new AWSAccountPartition(value);
  }
}
