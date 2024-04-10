package employee.api.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.amazonaws.auth.AWSStaticCredentialsProvider;
import com.amazonaws.auth.BasicAWSCredentials;
import com.amazonaws.client.builder.AwsClientBuilder;
import com.amazonaws.services.dynamodbv2.AmazonDynamoDB;
import com.amazonaws.services.dynamodbv2.AmazonDynamoDBClientBuilder;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBMapper;

@Configuration
public class ConfigDynamoDB {
    
    @Bean
    public DynamoDBMapper dynamoDBMapper() {
        return new DynamoDBMapper(buildDynamoDBMapper());
    }

    @Bean
    public AmazonDynamoDB amazonDynamoDB() {
        return AmazonDynamoDBClientBuilder
            .standard()
            .withEndpointConfiguration(
                new AwsClientBuilder.EndpointConfiguration(
                    "dynamodb.ap-south-1.amazonaws.com", 
                    "ap-south-1"
                )
            )
            .withCredentials(
                new AWSStaticCredentialsProvider(
                    new BasicAWSCredentials(
                        "AKIATUYRQ7WYEIDOJW7E", 
                    "JNVLZRuzgFwev3jkDz0lx0ok67NDrGpZKqfFd1xz"
                    )
                )
            )
            .build();
    }

    private AmazonDynamoDB buildDynamoDBMapper() {
        return AmazonDynamoDBClientBuilder
            .standard()
            .withEndpointConfiguration(
                new AwsClientBuilder.EndpointConfiguration(
                    "dynamodb.ap-south-1.amazonaws.com", 
                    "ap-south-1"
                )
            )
            .withCredentials(
                new AWSStaticCredentialsProvider(
                    new BasicAWSCredentials(
                        "AKIATUYRQ7WYEIDOJW7E", 
                    "JNVLZRuzgFwev3jkDz0lx0ok67NDrGpZKqfFd1xz"
                    )
                )
            )
            .build();
    }
}
