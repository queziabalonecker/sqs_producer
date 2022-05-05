package br.com.sqs_producer.services;

import software.amazon.awssdk.services.sqs.SqsClient;
import software.amazon.awssdk.services.sqs.model.SendMessageRequest;

public class SQSSendMessage {
    public static void sendMessage(String message) {
        SqsClient sqsClient = SQSClient.returnSQSClient(CredentialsProvider.returnCredentials());

        String queueUrl = SQSGetQueueURL.returnQueueUrl(sqsClient);
        

        sendMessage(sqsClient, queueUrl, message);
        sqsClient.close();
    };

    public static void sendMessage(SqsClient sqsClient, String queueUrl, String message) {
        SendMessageRequest sendMsgRequest = SendMessageRequest.builder()
                .queueUrl(queueUrl)
                .messageBody(message)
                .build();
        sqsClient.sendMessage(sendMsgRequest);
    };
};