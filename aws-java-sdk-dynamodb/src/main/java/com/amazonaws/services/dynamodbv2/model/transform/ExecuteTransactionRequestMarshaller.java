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
package com.amazonaws.services.dynamodbv2.model.transform;

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.dynamodbv2.model.*;

import com.amazonaws.util.IdempotentUtils;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * ExecuteTransactionRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class ExecuteTransactionRequestMarshaller {

    private static final MarshallingInfo<List> TRANSACTSTATEMENTS_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("TransactStatements").build();
    private static final MarshallingInfo<String> CLIENTREQUESTTOKEN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ClientRequestToken")
            .defaultValueSupplier(com.amazonaws.util.IdempotentUtils.getGenerator()).build();

    private static final ExecuteTransactionRequestMarshaller instance = new ExecuteTransactionRequestMarshaller();

    public static ExecuteTransactionRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(ExecuteTransactionRequest executeTransactionRequest, ProtocolMarshaller protocolMarshaller) {

        if (executeTransactionRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(executeTransactionRequest.getTransactStatements(), TRANSACTSTATEMENTS_BINDING);
            protocolMarshaller.marshall(executeTransactionRequest.getClientRequestToken(), CLIENTREQUESTTOKEN_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
