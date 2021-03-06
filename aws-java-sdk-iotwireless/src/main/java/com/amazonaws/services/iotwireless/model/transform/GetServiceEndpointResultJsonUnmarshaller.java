/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"). You may not use this file except in compliance with
 * the License. A copy of the License is located at
 * 
 * http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions
 * and limitations under the License.
 */
package com.amazonaws.services.iotwireless.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.iotwireless.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * GetServiceEndpointResult JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetServiceEndpointResultJsonUnmarshaller implements Unmarshaller<GetServiceEndpointResult, JsonUnmarshallerContext> {

    public GetServiceEndpointResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        GetServiceEndpointResult getServiceEndpointResult = new GetServiceEndpointResult();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return getServiceEndpointResult;
        }

        while (true) {
            if (token == null)
                break;

            if (token == FIELD_NAME || token == START_OBJECT) {
                if (context.testExpression("ServiceType", targetDepth)) {
                    context.nextToken();
                    getServiceEndpointResult.setServiceType(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ServiceEndpoint", targetDepth)) {
                    context.nextToken();
                    getServiceEndpointResult.setServiceEndpoint(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ServerTrust", targetDepth)) {
                    context.nextToken();
                    getServiceEndpointResult.setServerTrust(context.getUnmarshaller(String.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return getServiceEndpointResult;
    }

    private static GetServiceEndpointResultJsonUnmarshaller instance;

    public static GetServiceEndpointResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new GetServiceEndpointResultJsonUnmarshaller();
        return instance;
    }
}
