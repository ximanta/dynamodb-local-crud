package com.stackroute.config;


import com.amazonaws.auth.AWSStaticCredentialsProvider;
import com.amazonaws.auth.BasicAWSCredentials;
import com.amazonaws.client.builder.AwsClientBuilder;
import com.amazonaws.services.dynamodbv2.AmazonDynamoDB;
import com.amazonaws.services.dynamodbv2.AmazonDynamoDBClientBuilder;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBMapper;


public class AWSDynamoDBUtil {


    static AwsClientBuilder.EndpointConfiguration endPoint = new AwsClientBuilder.EndpointConfiguration("http://localhost:8000", "us-east-1");
    static AWSStaticCredentialsProvider credentialsProvider = new AWSStaticCredentialsProvider(new BasicAWSCredentials("fakeMyKeyId", "fakeSecretAccessKey"));
    static AmazonDynamoDB client = AmazonDynamoDBClientBuilder.standard().withEndpointConfiguration(endPoint).build();
    //   .withCredentials(credentialsProvider).build();

    public static String getEndPoint() {
        String endpoint = "http://localhost:8000";
        return endpoint;
    }

    public static DynamoDBMapper getMapper() {
        return new DynamoDBMapper(client);
    }


}


