package br.com.sqs_producer.services;

import software.amazon.awssdk.auth.credentials.AwsCredentialsProvider;
import software.amazon.awssdk.regions.Region;
import software.amazon.awssdk.services.sqs.SqsClient;

public interface SQSClient {
    public static SqsClient returnSQSClient(AwsCredentialsProvider credentialsProvider) {
        SqsClient sqsClient = SqsClient.builder()
                .region(Region.US_EAST_1)
                .credentialsProvider(credentialsProvider)
                .build();
        return sqsClient;
    };
};
