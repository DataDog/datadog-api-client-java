/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v1.model;

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

/** The namespace associated with the tag filter entry. */
@JsonSerialize(using = AWSNamespace.AWSNamespaceSerializer.class)
public class AWSNamespace extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(
          Arrays.asList(
              "api_gateway",
              "application_elb",
              "apprunner",
              "appstream",
              "appsync",
              "athena",
              "auto_scaling",
              "backup",
              "bedrock",
              "billing",
              "budgeting",
              "certificatemanager",
              "cloudfront",
              "cloudhsm",
              "cloudsearch",
              "cloudwatch_events",
              "cloudwatch_logs",
              "codebuild",
              "codewhisperer",
              "cognito",
              "collect_custom_metrics",
              "config",
              "connect",
              "crawl_alarms",
              "custom",
              "directconnect",
              "dms",
              "documentdb",
              "dynamodb",
              "dynamodbaccelerator",
              "ebs",
              "ec2",
              "ec2api",
              "ec2spot",
              "ecr",
              "ecs",
              "efs",
              "elasticache",
              "elasticbeanstalk",
              "elasticinference",
              "elastictranscoder",
              "elb",
              "emr",
              "es",
              "firehose",
              "fsx",
              "gamelift",
              "globalaccelerator",
              "glue",
              "inspector",
              "iot",
              "keyspaces",
              "kinesis",
              "kinesis_analytics",
              "kms",
              "lambda",
              "lex",
              "mediaconnect",
              "mediaconvert",
              "medialive",
              "mediapackage",
              "mediastore",
              "mediatailor",
              "memorydb",
              "ml",
              "mq",
              "msk",
              "mwaa",
              "nat_gateway",
              "neptune",
              "network_elb",
              "networkfirewall",
              "networkmonitor",
              "opensearchserverless",
              "opsworks",
              "polly",
              "privatelinkendpoints",
              "privatelinkservices",
              "rds",
              "rdsproxy",
              "redshift",
              "rekognition",
              "route53",
              "route53resolver",
              "s3",
              "s3storagelens",
              "sagemaker",
              "sagemakerendpoints",
              "sagemakerlabelingjobs",
              "sagemakermodelbuildingpipeline",
              "sagemakerprocessingjobs",
              "sagemakertrainingjobs",
              "sagemakertransformjobs",
              "sagemakerworkteam",
              "service_quotas",
              "ses",
              "shield",
              "sns",
              "sqs",
              "step_functions",
              "storage_gateway",
              "swf",
              "textract",
              "transitgateway",
              "translate",
              "trusted_advisor",
              "usage",
              "vpn",
              "waf",
              "wafv2",
              "workspaces",
              "xray"));

  public static final AWSNamespace API_GATEWAY = new AWSNamespace("api_gateway");
  public static final AWSNamespace APPLICATION_ELB = new AWSNamespace("application_elb");
  public static final AWSNamespace APPRUNNER = new AWSNamespace("apprunner");
  public static final AWSNamespace APPSTREAM = new AWSNamespace("appstream");
  public static final AWSNamespace APPSYNC = new AWSNamespace("appsync");
  public static final AWSNamespace ATHENA = new AWSNamespace("athena");
  public static final AWSNamespace AUTO_SCALING = new AWSNamespace("auto_scaling");
  public static final AWSNamespace BACKUP = new AWSNamespace("backup");
  public static final AWSNamespace BEDROCK = new AWSNamespace("bedrock");
  public static final AWSNamespace BILLING = new AWSNamespace("billing");
  public static final AWSNamespace BUDGETING = new AWSNamespace("budgeting");
  public static final AWSNamespace CERTIFICATEMANAGER = new AWSNamespace("certificatemanager");
  public static final AWSNamespace CLOUDFRONT = new AWSNamespace("cloudfront");
  public static final AWSNamespace CLOUDHSM = new AWSNamespace("cloudhsm");
  public static final AWSNamespace CLOUDSEARCH = new AWSNamespace("cloudsearch");
  public static final AWSNamespace CLOUDWATCH_EVENTS = new AWSNamespace("cloudwatch_events");
  public static final AWSNamespace CLOUDWATCH_LOGS = new AWSNamespace("cloudwatch_logs");
  public static final AWSNamespace CODEBUILD = new AWSNamespace("codebuild");
  public static final AWSNamespace CODEWHISPERER = new AWSNamespace("codewhisperer");
  public static final AWSNamespace COGNITO = new AWSNamespace("cognito");
  public static final AWSNamespace COLLECT_CUSTOM_METRICS =
      new AWSNamespace("collect_custom_metrics");
  public static final AWSNamespace CONFIG = new AWSNamespace("config");
  public static final AWSNamespace CONNECT = new AWSNamespace("connect");
  public static final AWSNamespace CRAWL_ALARMS = new AWSNamespace("crawl_alarms");
  public static final AWSNamespace CUSTOM = new AWSNamespace("custom");
  public static final AWSNamespace DIRECTCONNECT = new AWSNamespace("directconnect");
  public static final AWSNamespace DMS = new AWSNamespace("dms");
  public static final AWSNamespace DOCUMENTDB = new AWSNamespace("documentdb");
  public static final AWSNamespace DYNAMODB = new AWSNamespace("dynamodb");
  public static final AWSNamespace DYNAMODBACCELERATOR = new AWSNamespace("dynamodbaccelerator");
  public static final AWSNamespace EBS = new AWSNamespace("ebs");
  public static final AWSNamespace EC2 = new AWSNamespace("ec2");
  public static final AWSNamespace EC2API = new AWSNamespace("ec2api");
  public static final AWSNamespace EC2SPOT = new AWSNamespace("ec2spot");
  public static final AWSNamespace ECR = new AWSNamespace("ecr");
  public static final AWSNamespace ECS = new AWSNamespace("ecs");
  public static final AWSNamespace EFS = new AWSNamespace("efs");
  public static final AWSNamespace ELASTICACHE = new AWSNamespace("elasticache");
  public static final AWSNamespace ELASTICBEANSTALK = new AWSNamespace("elasticbeanstalk");
  public static final AWSNamespace ELASTICINFERENCE = new AWSNamespace("elasticinference");
  public static final AWSNamespace ELASTICTRANSCODER = new AWSNamespace("elastictranscoder");
  public static final AWSNamespace ELB = new AWSNamespace("elb");
  public static final AWSNamespace EMR = new AWSNamespace("emr");
  public static final AWSNamespace ES = new AWSNamespace("es");
  public static final AWSNamespace FIREHOSE = new AWSNamespace("firehose");
  public static final AWSNamespace FSX = new AWSNamespace("fsx");
  public static final AWSNamespace GAMELIFT = new AWSNamespace("gamelift");
  public static final AWSNamespace GLOBALACCELERATOR = new AWSNamespace("globalaccelerator");
  public static final AWSNamespace GLUE = new AWSNamespace("glue");
  public static final AWSNamespace INSPECTOR = new AWSNamespace("inspector");
  public static final AWSNamespace IOT = new AWSNamespace("iot");
  public static final AWSNamespace KEYSPACES = new AWSNamespace("keyspaces");
  public static final AWSNamespace KINESIS = new AWSNamespace("kinesis");
  public static final AWSNamespace KINESIS_ANALYTICS = new AWSNamespace("kinesis_analytics");
  public static final AWSNamespace KMS = new AWSNamespace("kms");
  public static final AWSNamespace LAMBDA = new AWSNamespace("lambda");
  public static final AWSNamespace LEX = new AWSNamespace("lex");
  public static final AWSNamespace MEDIACONNECT = new AWSNamespace("mediaconnect");
  public static final AWSNamespace MEDIACONVERT = new AWSNamespace("mediaconvert");
  public static final AWSNamespace MEDIALIVE = new AWSNamespace("medialive");
  public static final AWSNamespace MEDIAPACKAGE = new AWSNamespace("mediapackage");
  public static final AWSNamespace MEDIASTORE = new AWSNamespace("mediastore");
  public static final AWSNamespace MEDIATAILOR = new AWSNamespace("mediatailor");
  public static final AWSNamespace MEMORYDB = new AWSNamespace("memorydb");
  public static final AWSNamespace ML = new AWSNamespace("ml");
  public static final AWSNamespace MQ = new AWSNamespace("mq");
  public static final AWSNamespace MSK = new AWSNamespace("msk");
  public static final AWSNamespace MWAA = new AWSNamespace("mwaa");
  public static final AWSNamespace NAT_GATEWAY = new AWSNamespace("nat_gateway");
  public static final AWSNamespace NEPTUNE = new AWSNamespace("neptune");
  public static final AWSNamespace NETWORK_ELB = new AWSNamespace("network_elb");
  public static final AWSNamespace NETWORKFIREWALL = new AWSNamespace("networkfirewall");
  public static final AWSNamespace NETWORKMONITOR = new AWSNamespace("networkmonitor");
  public static final AWSNamespace OPENSEARCHSERVERLESS = new AWSNamespace("opensearchserverless");
  public static final AWSNamespace OPSWORKS = new AWSNamespace("opsworks");
  public static final AWSNamespace POLLY = new AWSNamespace("polly");
  public static final AWSNamespace PRIVATELINKENDPOINTS = new AWSNamespace("privatelinkendpoints");
  public static final AWSNamespace PRIVATELINKSERVICES = new AWSNamespace("privatelinkservices");
  public static final AWSNamespace RDS = new AWSNamespace("rds");
  public static final AWSNamespace RDSPROXY = new AWSNamespace("rdsproxy");
  public static final AWSNamespace REDSHIFT = new AWSNamespace("redshift");
  public static final AWSNamespace REKOGNITION = new AWSNamespace("rekognition");
  public static final AWSNamespace ROUTE53 = new AWSNamespace("route53");
  public static final AWSNamespace ROUTE53RESOLVER = new AWSNamespace("route53resolver");
  public static final AWSNamespace S3 = new AWSNamespace("s3");
  public static final AWSNamespace S3STORAGELENS = new AWSNamespace("s3storagelens");
  public static final AWSNamespace SAGEMAKER = new AWSNamespace("sagemaker");
  public static final AWSNamespace SAGEMAKERENDPOINTS = new AWSNamespace("sagemakerendpoints");
  public static final AWSNamespace SAGEMAKERLABELINGJOBS =
      new AWSNamespace("sagemakerlabelingjobs");
  public static final AWSNamespace SAGEMAKERMODELBUILDINGPIPELINE =
      new AWSNamespace("sagemakermodelbuildingpipeline");
  public static final AWSNamespace SAGEMAKERPROCESSINGJOBS =
      new AWSNamespace("sagemakerprocessingjobs");
  public static final AWSNamespace SAGEMAKERTRAININGJOBS =
      new AWSNamespace("sagemakertrainingjobs");
  public static final AWSNamespace SAGEMAKERTRANSFORMJOBS =
      new AWSNamespace("sagemakertransformjobs");
  public static final AWSNamespace SAGEMAKERWORKTEAM = new AWSNamespace("sagemakerworkteam");
  public static final AWSNamespace SERVICE_QUOTAS = new AWSNamespace("service_quotas");
  public static final AWSNamespace SES = new AWSNamespace("ses");
  public static final AWSNamespace SHIELD = new AWSNamespace("shield");
  public static final AWSNamespace SNS = new AWSNamespace("sns");
  public static final AWSNamespace SQS = new AWSNamespace("sqs");
  public static final AWSNamespace STEP_FUNCTIONS = new AWSNamespace("step_functions");
  public static final AWSNamespace STORAGE_GATEWAY = new AWSNamespace("storage_gateway");
  public static final AWSNamespace SWF = new AWSNamespace("swf");
  public static final AWSNamespace TEXTRACT = new AWSNamespace("textract");
  public static final AWSNamespace TRANSITGATEWAY = new AWSNamespace("transitgateway");
  public static final AWSNamespace TRANSLATE = new AWSNamespace("translate");
  public static final AWSNamespace TRUSTED_ADVISOR = new AWSNamespace("trusted_advisor");
  public static final AWSNamespace USAGE = new AWSNamespace("usage");
  public static final AWSNamespace VPN = new AWSNamespace("vpn");
  public static final AWSNamespace WAF = new AWSNamespace("waf");
  public static final AWSNamespace WAFV2 = new AWSNamespace("wafv2");
  public static final AWSNamespace WORKSPACES = new AWSNamespace("workspaces");
  public static final AWSNamespace XRAY = new AWSNamespace("xray");

  AWSNamespace(String value) {
    super(value, allowedValues);
  }

  public static class AWSNamespaceSerializer extends StdSerializer<AWSNamespace> {
    public AWSNamespaceSerializer(Class<AWSNamespace> t) {
      super(t);
    }

    public AWSNamespaceSerializer() {
      this(null);
    }

    @Override
    public void serialize(AWSNamespace value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static AWSNamespace fromValue(String value) {
    return new AWSNamespace(value);
  }
}
