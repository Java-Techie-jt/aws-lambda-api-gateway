package com.javatechie.aws.lambda;

import com.amazonaws.services.lambda.runtime.events.APIGatewayProxyRequestEvent;
import com.javatechie.aws.lambda.domain.Order;
import org.springframework.cloud.function.adapter.aws.SpringBootRequestHandler;

import java.util.List;

public class OrderHandler extends SpringBootRequestHandler<APIGatewayProxyRequestEvent, List<Order>> {
}
